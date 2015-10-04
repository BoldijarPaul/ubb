package com.ubb.app;

import com.shirwa.simplistic_rss.RssItem;
import com.ubb.app.xml.XmlRssParser;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void xmlParseLengthWorks() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<rss xmlns:sy=\"http://purl.org/rss/1.0/modules/syndication/\" xmlns:slash=\"http://purl.org/rss/1.0/modules/slash/\">\n" +
                "       <channel>\n" +
                "              <item>\n" +
                "                     <title>Burse CEEPUS pentru semestrul II, an univ. 2015-2016</title>\n" +
                "                     <link>http://www.cs.ubbcluj.ro/burse-ceepus-pentru-semestrul-ii-an-univ-2015-2016/</link>\n" +
                "                     <comments>http://www.cs.ubbcluj.ro/burse-ceepus-pentru-semestrul-ii-an-univ-2015-2016/#comments</comments>\n" +
                "                     <pubDate>Fri, 02 Oct 2015 18:08:29 +0000</pubDate>\n" +
                "                     <dc:creator></dc:creator>\n" +
                "                     <category></category>\n" +
                "                     <guid isPermaLink=\"false\">http://www.cs.ubbcluj.ro/?p=22185</guid>\n" +
                "                     <description></description>\n" +
                "                     <content:encoded></content:encoded>\n" +
                "                     <wfw:commentRss>http://www.cs.ubbcluj.ro/burse-ceepus-pentru-semestrul-ii-an-univ-2015-2016/feed/</wfw:commentRss>\n" +
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


        List<RssItem> items = XmlRssParser.getRssItemsFromXml(xml);
        assertEquals(items.size(), 2);
    }
}