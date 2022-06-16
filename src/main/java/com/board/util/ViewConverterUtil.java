package com.board.util;

public class ViewConverterUtil {

    public static String toHtmlConverter(Object orgStr) {

        if(orgStr == null) return "";

        String replaceStr = orgStr.toString();

        replaceStr = replaceStr.replaceAll("script","");
        replaceStr = replaceStr.replaceAll("\n","<br>");
        replaceStr = replaceStr.replaceAll("&lt;p&gt;","<p>");
        replaceStr = replaceStr.replaceAll("&lt;/p&gt;","</p>");
        replaceStr = replaceStr.replaceAll("&lt;br&gt;","<br>");
        replaceStr = replaceStr.replaceAll("&lt;font color=&quot;red&quot;&gt;","<font color=\"red\";>");
        replaceStr = replaceStr.replaceAll("&lt;/font&gt;","</font>");
        replaceStr = replaceStr.replaceAll("&lt;strong&gt;","<strong>");
        replaceStr = replaceStr.replaceAll("&lt;/strong&gt;","</strong>");

        return replaceStr;
    }

}
