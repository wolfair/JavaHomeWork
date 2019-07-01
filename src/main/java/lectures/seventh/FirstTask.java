package lectures.seventh;
import java.lang.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class FirstTask {

    public FirstTask() {

        System.out.println("\n---------------------");
        System.out.println("First task solution:\n");

    }

    public static void main(String[] args) {
        FirstTask test = new FirstTask();
        Method[] methods = test.getClass().getMethods();
        for(Method method: methods){
            if(method.isAnnotationPresent(TestAnnotation.class)){
                try {
                    TestAnnotation annotation = method.getAnnotation(TestAnnotation.class);
                    method.invoke(null, annotation.first(), annotation.second());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @TestAnnotation(first = 1, second = 2)
    static public void testMethod1(int first, int second){
        System.out.println("I was called! My result is true");
        System.out.println(first < second);
    }

    static public void testMethod2(){
        System.out.println("I wasn't called!");
    }

    @TestAnnotation(first = 2, second = 1)
    static public void testMethod3(int first, int second){
        System.out.println("I was called! My result is false");
        System.out.println(first < second);
    }


}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TestAnnotation {
    int first();
    int second();
}

