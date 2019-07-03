package lectures.seventh;

import java.io.IOException;
import java.lang.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.*;

public class SecondTask {
    public SecondTask() {
        System.out.println("\n---------------------");
        System.out.println("Second task solution:\nCheck your project's folder. There should be new file with input provided in code");
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TextContainer textToSave = new TextContainer();
        SecondTask task = new SecondTask();
        Method[] methods = task.getClass().getMethods();
        for(Method method: methods){
            if(method.isAnnotationPresent(Saver.class)) {
                method.invoke(null, textToSave.getClass().getAnnotation(SaveTo.class).path(), textToSave.textToSave);
            }
        }
    }

    @Saver
    public static void save(String pathToSave, String textToSave) throws IOException {
        Path path = Paths.get(pathToSave);
        Files.write(path, textToSave.getBytes());
    }

    @SaveTo(path = "seventh.SecondTask.txt")
    static class TextContainer {
        final String textToSave = "This text should be saved to file.";
    }

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Saver {}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface SaveTo{
    String path();
}

