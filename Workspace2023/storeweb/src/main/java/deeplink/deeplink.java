package deeplink;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;


 public class deeplink extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
	
	 private String encodeToXML(String str)
	 {
		 StringBuilder res = new StringBuilder();
		 for (int i=0; i<str.length(); i++) {
			 int c = str.charAt(i);
			 if (c == '<')
				 res.append("&lt;");
			 else if (c == '>')
				 res.append("&gt;");
			 else if (c == '&')
				 res.append("&amp;");
			 else if (c < 32 || c >= 127)
				 res.append("&#x" + Integer.toHexString(c) + ";");
			 else
				 res.append((char) c);
		 }
		 return res.toString();
	 }
	 
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getPathInfo() == null || request.getPathInfo().length() <= 1) {
			throw new ServletException("You need to provide the parameter after the servlet path; e.g., /deeplink/123");
		}
		
		final String fullParameterString = request.getPathInfo().substring(1);
		String[] parameterArray = fullParameterString.split(",");
		final String functionToCall;
		final String functionParameters;
		if (parameterArray.length >= 2) {
			functionToCall = parameterArray[0];
			functionParameters = parameterArray[1];
		}
		else if (parameterArray.length >= 1) {
			functionToCall = parameterArray[0];
			functionParameters = "";
		}
		else{
			functionToCall = "test";
			functionParameters = "test";
		}
		
		/* Modify the following strings to suit your configuration: */
		
		final String plexXML = "<PlexFunction xmlns=\"http://adcaustin.com/ws-plex/1.0\"><InputVariables Name=\"Input\"><Field Name=\"FNCToCall\">" + encodeToXML(functionToCall) + "</Field><Field Name=\"FNCParm\">" + encodeToXML(functionParameters) + "</Field></InputVariables></PlexFunction>";

		
		final String webclientURL = "/wc/deeplink";
		
		final java.io.StringReader xmlreader = new java.io.StringReader(plexXML);
		this.getServletContext().getRequestDispatcher(webclientURL).forward(
				new HttpServletRequestWrapper(request) {
					
					public String getContentType() {
						return "application/x-ws-plex+xml";
					}
					public int getContentLength() {
						return plexXML.length();
					}
					public ServletInputStream getInputStream() throws IOException {
						return new ServletInputStream() {
							public int read() throws IOException {
								return xmlreader.read();
							}
						};
					}
				}, response);
	}  		
}