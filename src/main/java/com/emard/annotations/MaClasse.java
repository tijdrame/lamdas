package com.emard.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Book(title = "Core java", author = "Kathy Sierra", version = 1.0)
public class MaClasse {

    public static void main(String[] args)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        MaClasse m = new MaClasse();
        for (Annotation it : m.getClass().getAnnotations()) {
            // annotation type pour avoir toute les annotations (ici Book seulement)
            Class<? extends Annotation> type = it.annotationType();
            System.out.println("Values of " + type.getName());
            // pour chaque annotation boucler et avoir les attributs
            for (Method method : type.getDeclaredMethods()) {
                Object value = method.invoke(it, (Object[]) null);
                System.out.println("name :" + method.getName() + ", value: " + value);
            }
        }

        
        System.out.println("sum=" + m.sum());
    }

    @Somme(param1 = 4, param2 = 5)
    public Integer sum() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Integer res = 0;

        for (Method method : MaClasse.class.getMethods()) {
            Somme s = method.getAnnotation(Somme.class);
            if (s != null) {
                System.out.println("param1 :" + s.param1() + " param2:" + s.param2());
                res = s.param1() + s.param2();
            }
        }
        return res;
    }
}
