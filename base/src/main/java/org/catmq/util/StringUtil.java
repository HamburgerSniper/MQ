package org.catmq.util;

import cn.hutool.core.util.StrUtil;
import org.catmq.constant.FileConstant;

import java.net.InetSocketAddress;

import java.text.NumberFormat;

/**
 * 字符串工具类
 */
public class StringUtil {
    public static final String EMPTY_STRING = "";

    /**
     * 检查字符串是否为空白字符串
     *
     * @param str
     * @return
     */
    public static boolean isBlank(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 拼接字符串(可变参数)
     *
     * @param strings
     * @return
     */
    public static String concatString(CharSequence... strings) {
        StringBuilder sb = new StringBuilder();
        for (CharSequence str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }


    /**
     * 默认空字符串
     *
     * @param str
     * @return
     */
    public static String defaultString(final String str) {
        return defaultString(str, EMPTY_STRING);
    }

    /**
     * 如果str为null，则将其赋为defaultStr，否则不变
     *
     * @param str
     * @param defaultStr
     * @return
     */
    public static String defaultString(final String str, final String defaultStr) {
        return str == null ? defaultStr : str;
    }

    /**
     * 分析地址
     * @param address
     * @return
     */
    public static InetSocketAddress parseAddress(String address) {
        if (address.contains(FileConstant.LEFT_SLASH)) {
            address = address.substring(address.lastIndexOf(FileConstant.LEFT_SLASH) + 1);
        }
        String[] split = address.split(":");
        return new InetSocketAddress(split[0], Integer.parseInt(split[1]));
    }

    public static boolean isEmpty(String str) {
        return StrUtil.isEmpty(str);
    }

    /**
     * Gets the substring after the last occurrence of a separator. The separator is not returned.
     * 获取分隔符最后一次出现之后的子字符串。分隔符不返回
     * <br><br>
     * StringUtils.substringAfterLast("abc", "a")   = "bc"
     * StringUtils.substringAfterLast("abcba", "b") = "a"
     * StringUtils.substringAfterLast("abc", "c")   = ""
     *
     * @param str       input string
     * @param separator separator
     * @return substring after the last occurrence of the separator
     */
    public static String substringAfterLast(String str, String separator) {
        if (isEmpty(str)) {
            return str;
        } else if (isEmpty(separator)) {
            return "";
        } else {
            int pos = str.lastIndexOf(separator);
            return pos != -1 && pos != str.length() - separator.length() ?
                    str.substring(pos + separator.length()) : "";
        }
    }

    /**
     * 通过偏移量得出文件名FileName
     * @param offset
     * @return
     */
    public static String offset2FileName(final long offset) {
        final NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumIntegerDigits(20);
        nf.setMaximumFractionDigits(0);
        nf.setGroupingUsed(false);
        return nf.format(offset);
    }

}
