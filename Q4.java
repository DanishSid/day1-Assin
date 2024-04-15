import java.util.regex.*;

public class Main {
    public static boolean isValidURL(String url) {
        String regex = "^(https?://)?(www\\.)?[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.?[a-zA-Z]{2,})?(/\\S*)?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] urls = {"https://www.bigohtech.com/", "https:// www.bigohtech.com/"};

        for (String url : urls) {
            System.out.println(url + " : " + (isValidURL(url) ? "Yes" : "No"));
        }
    }
}
