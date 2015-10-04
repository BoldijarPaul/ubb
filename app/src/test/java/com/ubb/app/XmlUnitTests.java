package com.ubb.app;

import com.shirwa.simplistic_rss.RssItem;
import com.ubb.app.xml.XmlRssParser;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class XmlUnitTests {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }


    String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<rss xmlns:sy=\"http://purl.org/rss/1.0/modules/syndication/\" xmlns:slash=\"http://purl.org/rss/1.0/modules/slash/\">\n" +
            "       <channel>\n" +
            "              <item>\n" +
            "                     <title>title</title>\n" +
            "                     <link><![CDATA[url]]></link>\n" +
            "                     <comments>comments</comments>\n" +
            "                     <pubDate>pubDate</pubDate>\n" +
            "                     <dc:creator></dc:creator>\n" +
            "                     <category>category</category>\n" +
            "                     <guid isPermaLink=\"false\">http://www.cs.ubbcluj.ro/?p=22185</guid>\n" +
            "                     <description>des</description>\n" +
            "                     <content:encoded>content:encoded</content:encoded>\n" +
            "                     <wfw:commentRss></wfw:commentRss>\n" +
            "                     <slash:comments>0</slash:comments>\n" +
            "                 </item>\n" +
            "              <item>\n" +
            "                     <title>Deschiderea festivă a Programului de Conversie Profesională Matematică</title>\n" +
            "                     <link>http://www.cs.ubbcluj.ro/deschiderea-festiva-a-programului-de-conversie-profesionala-matematica/</link>\n" +
            "                     <comments>http://www.cs.ubbcluj.ro/deschiderea-festiva-a-programului-de-conversie-profesionala-matematica/#comments</comments>\n" +
            "                     <pubDate>Thu, 01 Oct 2015 15:00:27 +0000</pubDate>\n" +
            "                     <dc:creator></dc:creator>\n" +
            "                     <category></category>\n" +
            "                     <guid isPermaLink=\"false\">http://www.cs.ubbcluj.ro/?p=22022</guid>\n" +
            "                     <description></description>\n" +
            "                     <content:encoded></content:encoded>\n" +
            "                     <wfw:commentRss>http://www.cs.ubbcluj.ro/deschiderea-festiva-a-programului-de-conversie-profesionala-matematica/feed/</wfw:commentRss>\n" +
            "                     <slash:comments>0</slash:comments>\n" +
            "                 </item>\n" +
            "          </channel>\n" +
            "   </rss>";

    @Test
    public void xmlParseLengthWorks() {
        List<RssItem> items = XmlRssParser.getRssItemsFromXml(xml);
        assertEquals(items.size(), 2);
    }

    @Test
    public void xmlTestVariables() {
        RssItem item = XmlRssParser.getRssItemsFromXml(xml).get(0);
        assertEquals(item.getTitle(), "title");
        assertEquals(item.getDescription(), "des");
        assertEquals("url", item.getLink());
    }
}