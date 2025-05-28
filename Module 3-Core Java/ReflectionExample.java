import java.lang.reflect.*;

class Sample {
    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Sample");
        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
        }

        Object obj = cls.getDeclaredConstructor().newInstance();
        Method m = cls.getMethod("sayHello", String.class);
        m.invoke(obj, "World");
    }
}
