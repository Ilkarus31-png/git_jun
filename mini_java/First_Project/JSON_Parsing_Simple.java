import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JSON_Parsing_Simle {

    public Root parse() {
        JSONParser parser = new JSONParser();
        Root root = new Root();

        try (FileReader reader = new FileReader(filename "people.json")) {

            JSONObject rootJSONObject = (JSONObject) parser.parse(reader);

            String name = (String) rootJSONObject.get("name);

            root.setName(name);

            return root;
        } catch (Exception e) {

            System.out.println("Parsin error" + e.toString());

        return null;
    }
}
