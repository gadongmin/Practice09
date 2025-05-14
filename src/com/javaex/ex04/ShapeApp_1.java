package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp_1 {

    public static void main(String[] args) {
        List<Shape_1> sList = new ArrayList<Shape_1>(); 
        
		Shape_1 r = new Rectangle_1(5, 6);
		Shape_1 t = new RectTriangle_1(6, 2);
        sList.add(r);
        sList.add(t);
        
        
        for( int i=0; i<sList.size(); i++ ) {
            
            System.out.println( "area: " + sList.get(i).getArea() );
            System.out.println( "perimeter: " + sList.get(i).getPerimeter() );
            
            if( sList.get(i) instanceof Resizeable_1 ) {
                ((Resizeable_1)sList.get(i)).resize( 0.5 );
                
                System.out.println( "new area: " + sList.get(i).getArea() );
                System.out.println( "new perimeter: " + sList.get(i).getPerimeter() );
            }
        }
        
    }
}
