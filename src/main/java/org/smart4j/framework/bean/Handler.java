package org.smart4j.framework.bean;

import java.lang.reflect.Method;

/**
 * Created by shucheng on 2018/3/25.
 * 封装Action信息
 */
public class Handler {

    /**
     * Controller类
     */
    private Class<?> controllerClass;

    /**
     * Action方法
     */
    private Method actionMethod;

    public Handler(Class<?> controllerClass, Method actionMethod) {
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }

    public Method getActionMethod() {
        return actionMethod;
    }

    public Class<?> getControllerClass() {
        return controllerClass;
    }
}
