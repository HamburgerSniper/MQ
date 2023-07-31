package org.catmq.util;

import lombok.NoArgsConstructor;

/**
 * 工具类：字符串
 */
@NoArgsConstructor
public class Concat2String {
    private final StringBuilder sb = new StringBuilder();

    /**
     * 字符序列转字符串
     *
     * @param cs
     * @return
     */
    public Concat2String concat(CharSequence cs) {
        sb.append(cs);
        return this;
    }

    /**
     * 数字序列转字符串
     *
     * @param n
     * @return
     */
    public Concat2String concat(Number n) {
        sb.append(n);
        return this;
    }

    /**
     * 最后进行调用的方法，返回字符序列或数字序列转成字符串以后的形式
     *
     * @return
     */
    public String build() {
        return this.sb.toString();
    }

    /**
     * 创建对象
     *
     * @return
     */
    public static Concat2String builder() {
        return new Concat2String();
    }

}
