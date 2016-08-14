package data;

import org.json.JSONObject;

public class Channel implements JSONpopulator {
    private Units units;
    private Items item;

    public Units getUnits() {
        return units;
    }

    public Items getItem() {
        return item;
    }

    @Override
    public void populate(JSONObject data) {

        units = new Units();
        units.populate(data.optJSONObject("units"));

        item = new Items();
        item.populate(data.optJSONObject("item"));

    }
}