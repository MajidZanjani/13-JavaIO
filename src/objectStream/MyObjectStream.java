package objectStream;

import java.io.ObjectStreamClass;

public class MyObjectStream {

	public static void main(String[] args) {
		
        ObjectStreamClass obj = ObjectStreamClass.lookup(String.class);
          
        System.out.println(obj.forClass());  
        System.out.println("" + obj.getField("value"));  
		
	}

}
