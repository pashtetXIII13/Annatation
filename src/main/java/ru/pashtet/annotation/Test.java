package ru.pashtet.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author pashtet
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<AnnotationClass> clazz = AnnotationClass.class;
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            if(annotation.annotationType() == MyAnnotation.class){
                System.out.println(clazz.getName());
            }
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                if(method.getAnnotation(MyAnnotation.class) != null)
                    System.out.println(method.getName());

            }
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                if(field.getAnnotation(MyAnnotation.class) != null){
                    System.out.println(field.getName());
                }
            }
        }
    }
}
