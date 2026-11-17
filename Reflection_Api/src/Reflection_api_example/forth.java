
package Reflection_api_example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class forth {

    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("Reflection_api_example.Liblaryss");

        // Access private method
        Method m = cls.getDeclaredMethod("display", String.class);
        m.trySetAccessible();
        m.invoke(cls.getDeclaredConstructor().newInstance(), "Pune");

        // Access private static field
        Field f = cls.getDeclaredField("name");
        f.trySetAccessible();

        System.out.println(f.get(null));

        f.set(null, "Axima");

        System.out.println(f.get(null));
    }
}

class Liblaryss {

    private static String name = "Pune";

    private void display(String city) {
        System.out.println("The city: " + city);
    }
}
