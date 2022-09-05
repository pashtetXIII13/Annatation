package ru.pashtet.annotation;

/**
 * @author pashtet
 */
@MyAnnotation
public class AnnotationClass {
    @MyAnnotation
    String annotationString;
    String nonAnnotationString;
    @MyAnnotation
    private void annotationMethod(){

    }

    private void nonAnnotationMethod(){

    }
}
