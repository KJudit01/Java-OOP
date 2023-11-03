import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class PoeRavenPoem {
    public static void main(String[] args) throws IOException {
        try {
            String apiUrl = "https://poetrydb.org/title/The%20Raven";
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder poemText = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    poemText.append(line);
                }
                reader.close();
                System.out.println(poemText);
            } else {
                System.out.println("Failed to have the poem. Response code: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
