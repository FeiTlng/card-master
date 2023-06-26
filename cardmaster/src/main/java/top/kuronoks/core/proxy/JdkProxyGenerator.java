package top.kuronoks.core.proxy;

import top.kuronoks.core.base.ILogAspect;
import top.kuronoks.core.base.IPointCut;

import java.lang.reflect.Proxy;

public class JdkProxyGenerator {
    public static Object generatorJDKProxy(IPointCut targetPoint, final ILogAspect aspect) {
        return Proxy.newProxyInstance(
                targetPoint.getClass().getClassLoader(),
                targetPoint.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    aspect.beforeLog();
                    Object result = method.invoke( targetPoint, args );
                    aspect.afterLog();
                    return result;
                }

        );

    }
}
