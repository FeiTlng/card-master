package top.kuronoks.core.factory;

import top.kuronoks.core.proxy.JdkProxyGenerator;
import top.kuronoks.core.base.NormalLogAspect;
import top.kuronoks.core.base.IPointCut;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ProxyFactory {

    public static Object proxyCreator(String name) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName( name );
        Constructor<?> constructor = clazz.getConstructor();
        IPointCut base = (IPointCut) constructor.newInstance();
        return JdkProxyGenerator.generatorJDKProxy( base, new NormalLogAspect() );
    }
}
