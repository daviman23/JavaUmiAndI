package Sergo.Lisens.Lisens2.Reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        Class cl = person.getClass();
        Class c = Person.class;
        Class c1 = Class.forName("Sergo.Lisens.Lisens2.Reflection.Person");

      //  Method[] methods = c.getMethods();
    //    for (Method method : methods) {
      //      System.out.println(method.getName() + ", " + method.getReturnType() + ", " + Arrays.toString(method.getParameterTypes()));
      //  }
        Field[] fields = c.getDeclaredFields();
        //for (Field field : fields) {
       //     System.out.println(field.getName() + ", " + field.getType() + ", ");
     //   }
       Annotation[] annotations =  c.getAnnotations();
        for (Annotation annotation : annotations) {
            if(annotation instanceof Author){
                System.out.println("YES");
            }
        }

    }
}
