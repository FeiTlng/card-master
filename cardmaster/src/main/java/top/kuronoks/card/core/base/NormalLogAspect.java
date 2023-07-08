package top.kuronoks.card.core.base;

public class NormalLogAspect implements ILogAspect {
    @Override
    public void beforeLog() {
        System.out.println("before");
    }

    @Override
    public void afterLog() {
        System.out.println("after");
    }
}
