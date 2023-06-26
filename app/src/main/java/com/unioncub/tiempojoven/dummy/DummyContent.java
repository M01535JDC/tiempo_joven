package com.unioncub.tiempojoven.dummy;

import android.content.res.Resources;
import android.app.Application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.unioncub.tiempojoven.MyApplication;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    /* private static final int COUNT = 25;
*/
    static {
        // Add some sample items.
        Resources a= MyApplication.getRes();
        addItem(new DummyItem("1","Tiempo de Elegir", 1));
        addItem(new DummyItem("2","Tiempo de Gozar", 2));
        addItem(new DummyItem("3","Tiempo de Encuentro", 3));
        addItem(new DummyItem("4","Tiempo de buena Salud", 4));
        addItem(new DummyItem("5","Tiempo de Amor", 5));
        addItem(new DummyItem("6","Tiempo del Fin", 6));
        addItem(new DummyItem("7","Tiempo de Respuestas", 7));
        addItem(new DummyItem("8","Tiempo de Liberación", 8));
        addItem(new DummyItem("9","Tiempo de Dialogar", 9));
        addItem(new DummyItem("10","Tiempo de vivir sabiamente", 10));
        addItem(new DummyItem("11","Tiempo de Agradar a Dios", 11));
        addItem(new DummyItem("12","Tiempo de Decidir", 12));

    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /*private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }
    **/

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final int details;

        public DummyItem(String id, String content, Integer details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}