package org.smart4j.framework.bean;

/**
 * Created by shucheng on 2018/3/25.
 * 返回数据对象
 */
public class Data {

    /**
     * 模型数据
     */
    private Object model;

    public Data(Object model) {
        this.model = model;
    }

    public Object getModel() {
        return model;
    }
}
