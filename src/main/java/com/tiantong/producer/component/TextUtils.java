package com.tiantong.producer.component;



import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

/**
 * 正则文本过滤工具类
 */

@Component
public class TextUtils {

    /**
     * sql crud
     */
    public static final String sqlSymbol = "(?i)(select|insert|update|delete)";
    /**
     * 中英文符号
     */
    public static final String allSymbol = "[~！@#￥%……&*（）——+|{}：。”“？》《~!@#$%^&*()_+|{}:\"<>?.]";
    /**
     * 中文符号
     */
    public static final String chineseSymbol = "[~！@#￥%……&*（）——+|{}：。”“？》《]";
    /**
     * 英文符号
     */
    private static final String englishSymbol = "[~!@#$%^&*()_+|{}:\\\"<>?.]";
    /**
     * 英文字母
     */
    public static final String wordChar = "[A-Za-z]";
    /**
     * 中文字符
     */
    public static final String chineseChar = "[\\u4e00-\\u9fa5]";
    /**
     * 阿拉伯数字
     */
    public static final String numberChar = "[0-9]";
    /**
     * 空格 行操作字符
     */
    public static final String spaceAndLingTag = "(\\r\\n|\\n|\\t|\\s*)";
    /**
     * 定义script字符
     */
    public static final String scriptTag = "<script[^>]*?>[\\s\\S]*?<\\/script>";
    /**
     * style 字符
     */
    public static final String styleTag = "<style[^>]*?>[\\s\\S]*?<\\/style>";
    /**
     * html 字符
     */
    public static final String htmlTagWeb = "<[^>]+>";


    /**
     * 过滤 sql
     */
    public static String delSqlSymbol(String key) {
        return patternUtil(key, sqlSymbol);
    }

    /**
     * 删除所有符号 包括中文和英文
     */
    public static String delAllSymbol(String key) {
        return patternUtil(key, allSymbol);
    }

    /**
     * 过滤中文所有符号
     */
    public static String delChineseSymbol(String key) {
        return patternUtil(key, chineseSymbol);

    }

    /**
     * 过滤英文符号
     */
    public static String delEnglishSymbol(String key) {
        return patternUtil(key, englishSymbol);
    }

    /**
     * 过滤字符
     */
    public static String delWordChar(String key) {
        return patternUtil(key, wordChar);
    }

    /**
     * 过滤中文汉字
     */
    public static String delChineseChar(String key) {
        return patternUtil(key, chineseChar);
    }

    /**
     * 过滤数字
     */
    public static String delNumberChar(String key) {
        return patternUtil(key, numberChar);
    }

    /**
     * 过滤空格和行标签
     */
    public static String delSpaceAndLineTag(String key) {
        return patternUtil(key, spaceAndLingTag);
    }

    /**
     * 过滤页面标签
     */
    public static String delHtmlTag(String htmlTag) {
        return patternUtil(patternUtil(patternUtil(patternUtil(htmlTag, scriptTag, false), styleTag, false), htmlTagWeb, false), spaceAndLingTag, false);
    }

    /**
     * true -不加 Pattern.CASE_INSENSITIVE
     * false -加
     *
     * @param text  字符串
     * @param match 规则
     * @param tag   布尔值
     * @return
     */
    private static String patternUtil(String text, String match, Boolean tag) {
        return tag ? Pattern.compile(match).matcher(text).replaceAll("").trim() : Pattern.compile(match, Pattern.CASE_INSENSITIVE).matcher(text).replaceAll("").trim();
    }

    public static String patternUtil(String text, String match) {
        return patternUtil(text, match, true);
    }


    /**
     * 过滤js标签
     */
    public static String delJsTag(String htmlStr) {
        return patternUtil(htmlStr, scriptTag, false);
    }

    /**
     * 正则匹配 ，指定的字符串
     */
    /**
     * 正则匹配 ，指定的字符串
     */
    public static Boolean isStrExist(String key,String text) {
        if (StringUtils.isBlank(key)|| StringUtils.isBlank(text)) {
            return false;
        }
        return Pattern.compile( "(?i)(temp)".replace("temp", key)).matcher(text).find();
    }

}
