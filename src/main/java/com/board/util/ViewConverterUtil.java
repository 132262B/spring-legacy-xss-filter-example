package com.board.util;

import org.springframework.stereotype.Component;

@Component
public class ViewConverterUtil {

    /**
     * HTML Entity 로 저장되있는 내용 HTML TAG 형태로 변경.
     *
     * 아래에 포함되있는 내용만 허가 할 수 있거나, 모든 내용을 허가 할 수 있게 변경도 가능. 하지만 그렇게하면 script 도 작동되게 되어, 아래와 같이 처리.
     */
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
