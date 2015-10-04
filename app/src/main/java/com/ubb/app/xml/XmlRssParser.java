package com.ubb.app.xml;

import com.shirwa.simplistic_rss.RssItem;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Browsing on 10/4/2015.
 */
public class XmlRssParser {

    public static List<RssItem> getRssItemsFromXml(String xml) {
        // get the document from the xml
        Document document = XMLHelper.getDomElement(xml);
        NodeList nodeList = document.getElementsByTagName("item");
        List<RssItem> items = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            RssItem item = new RssItem();
            Element element = (Element) nodeList.item(i);

            item.setTitle(XMLHelper.getValue(element, "title"));
            item.setLink(XMLHelper.getValue(element, "link"));
            item.setDescription(XMLHelper.getValue(element, "description"));
            item.setPubDate(XMLHelper.getValue(element, "pubDate"));
            item.setContentEncoded(XMLHelper.getValue(element, "content:encoded"));


            items.add(item);
        }
        return items;
    }
}
