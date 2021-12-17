package com.tiantong.producer.component;

import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
import java.io.*;

public class htmlOrText extends HTMLEditorKit.ParserCallback {

    private static htmlOrText html2Text = new htmlOrText();

    StringBuffer s;

    public htmlOrText() {
    }

    public void parse(String str) throws IOException {

        InputStream iin = new ByteArrayInputStream(str.getBytes());
        Reader in = new InputStreamReader(iin);
        s = new StringBuffer();
        ParserDelegator delegator = new ParserDelegator();
        // the third parameter is TRUE to ignore charset directive
        delegator.parse(in, this, Boolean.TRUE);
        iin.close();
        in.close();
    }

    public void handleText(char[] text, int pos) {
        s.append(text);
    }

    public String getText() {
        return s.toString();
    }

    public static String getContent(String str) {
        try {
            html2Text.parse(str);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return html2Text.getText();
    }

    public static void main(String[] args) {
        String html = "'<p class=\"MsoBodyText\" style=\"margin-left:5.2pt;\">\\n\\t<span>杭州日报在一篇题为《激荡四十年，数说新杭州》的报道中这样描述杭州改革开放的成果：</span>\\n</p>\\n杭州水更清，天更蓝，山更绿。2017年，市区空气质量优良天数271天，自2013年实行新标准以来，优良率提高了14.2个百分点；水质明显改善，全市饮用水源水质达标率100%；PM2.5数据从2013年的70微克/\\n立方米，降低到了44.6微克/立方米；雾霾天仅68天，比2013年降低了63%；森林覆盖率达66.8%，居全国省会城市和副省级城市第一。根据以上信息，运用所学的百分数知识算一算，你还能得出哪些新信息？请写出其中的两个（计算时百分号前可保留整数）'";

        String content = htmlOrText.getContent(html);
        System.out.println();
    }

}
