/(!-- DefaultCSS.html

      Generates CSS styles to size the current element. Optionally also
      positions the element.
            
      Parameters
          withPos: If this parameter is specified, also write
                   CSS styles to position the element according to the
                   panel design.
)
/(!If:/(!Property:Position))
  /(!If:/(!Param:withPos))
    position: absolute;
    left: /(!Position:x)px;
    top: /(!Position:y)px;
  /(!If)
/(!If)

z-index: /(!If:/(!Param:frame))1/(!Else)/(!If:/(!Param:zindex))/(!Param:zindex)/(!Else)3/(!If)/(!If);

/(!If:/(!Property:Size))
  width: /(!Size:x)px;
  height: /(!Size:y)px;
  
/(!If)

/(!If:/(!Property:Visible)=No)
    display: none;
/(!If)