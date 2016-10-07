package edu.cascadia.brianb.fragmentcommunication.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample article for user interfaces created by
 * Android template wizards.
 * <p/>
  */
public class NewsContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<NewsItem> ITEMS = new ArrayList<NewsItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, NewsItem> ITEM_MAP = new HashMap<String, NewsItem>();

    static {
        // Add 3 sample items.
        addItem(new NewsItem("The White House will now have a 'permanent' kitchen garden",
                "A $2.5 million donation to the National Park Foundation will keep Michelle Obama's Kitchen Garden legacy alive for years to come."));
        addItem(new NewsItem("Bees have feelings and can experience optimism",
                "A new study finds that bees can have positive feelings."));
        addItem(new NewsItem("Photo: The heart-melting smile of a slender-legged tree frog",
                "Pardon the anthropomorphism ... but look at that beaming face!"));
        addItem(new NewsItem("Can you cook dinner with 5 ingredients or less?",
                "Called the 'white box challenge', this is a useful technique for cleaning out one's fridge and pantry, reducing waste. It also means less time spent in the kitchen!"));
        addItem(new NewsItem("How do palm trees survive hurricanes?",
                "Hurricane footage often shows palm trees valiantly weathering the wrath; here's how these graceful beauties stand their ground."));
        addItem(new NewsItem("Kids can 'drive' their parent with a helmet that honks, vibrates and flashes",
                "Because the world needs yet more redundant, hard-to-recycle, battery-powered plastic toys whose novelty will wear off quickly."));
    }

    private static void addItem(NewsItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.headline, item);
    }

    /**
     * A dummy item representing a piece of article.
     */
    public static class NewsItem {
        public String headline;
        public String article;

        public NewsItem(String id, String content) {
            this.headline = id;
            this.article = content;
        }

        @Override
        public String toString() {
            return article;
        }
    }
}
