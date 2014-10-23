import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Ilya on 10/16/2014.
 */
public class WeatherDataParser {
    public static double getMaxTemperatureForDay(String weatherJsonString, int dayIndex) throws JSONException{

        try{
            JSONObject jsonObj = new JSONObject(weatherJsonString);
            JSONArray jsonArray = jsonObj.getJSONArray("list");
            JSONObject jsonObject = (JSONObject)jsonArray.getJSONObject(dayIndex).get("temp");
            System.out.println(jsonObject.get("max"));
        }
        catch (JSONException e){
            System.out.println("NO");
        }

        JSONObject weather = new JSONObject(weatherJsonString);
        JSONArray days = weather.getJSONArray("list");
        JSONObject dayInfo = days.getJSONObject(dayIndex);
        JSONObject temperatureInfo = dayInfo.getJSONObject("temp");
        return temperatureInfo.getDouble("max");
    }
}
