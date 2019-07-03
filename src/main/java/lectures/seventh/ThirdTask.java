package lectures.seventh;

import java.io.*;
import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ThirdTask implements Serializable {

    public ThirdTask() {
        System.out.println("\n---------------------");
        System.out.println("Third task solution:\n");

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        serialiseClass temp = new serialiseClass();
        Map<String, Object> fieldValues = new HashMap<>();
        for(Field field: temp.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Save.class))
            {
                fieldValues.put(field.getName(), field.get(temp));
            }
        }
        FileOutputStream fileOut = new FileOutputStream("seventh.ThirdTask.txt");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(fieldValues);
        fileOut.close();
        objectOut.close();

        serialiseClass checkingObject = new serialiseClass(333, 1, "test", "will be replaced");
        FileInputStream fileIn = new FileInputStream("seventh.ThirdTask.txt");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        Map<String, Object> fieldReadValues = (Map<String, Object>) objectIn.readObject();
        for(String key: fieldReadValues.keySet()){
            checkingObject.getClass().getDeclaredField(key).set(checkingObject, fieldReadValues.get(key));
        }
        fileIn.close();
        objectIn.close();
    }

    private static class serialiseClass{
        @Save
        int a;

        int b;

        @Save
        String c;

        String d;

        private serialiseClass(){
            this.a = 999;
            this.b = 153;
            this.c = "pre-saved value";
            this.d = "12345";
        }

        private serialiseClass(int a, int b, String c, String d){
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Save{}