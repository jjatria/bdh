import java.util.*;
import java.io.*;

public class Twat {
  
  private HashMap<String,Object> properties;
  private String test = "{\"follow_request_sent\": false, \"profile_use_background_image\": true, \"id\": 74712538, \"description\": \"Official Paul McCartney News Stream updated by MPL\", \"verified\": true, \"profile_image_url_https\": \"https://twimg0-a.akamaihd.net/profile_images/3364694630/4df7762dd249011f61ae5b5cbf51a880_normal.jpeg\", \"profile_sidebar_fill_color\": \"FFFFFF\", \"profile_text_color\": \"333333\", \"followers_count\": 1275282, \"protected\": false, \"location\": \"England\", \"default_profile_image\": false, \"id_str\": \"74712538\", \"status\": {\"favorited\": false, \"contributors\": null, \"truncated\": false, \"text\": \"Want to know what's in the 'Wings over America' Deluxe Edition? Check out this video: http://t.co/bIkzjR071T  #WingsWOA\", \"created_at\": \"Wed Apr 10 15:30:30 +0000 2013\", \"retweeted\": false, \"in_reply_to_status_id_str\": null, \"coordinates\": null, \"id\": 322008698123857920, \"source\": \"web\", \"in_reply_to_status_id\": null, \"place\": null, \"id_str\": \"322008698123857920\", \"in_reply_to_screen_name\": null, \"retweet_count\": 208, \"geo\": null, \"in_reply_to_user_id_str\": null, \"possibly_sensitive\": false, \"in_reply_to_user_id\": null}, \"utc_offset\": 0, \"statuses_count\": 907, \"profile_background_color\": \"FFFFFF\", \"friends_count\": 3, \"profile_background_image_url_https\": \"https://twimg0-a.akamaihd.net/profile_background_images/793517193/5383d88fc55b56286c55860a659e5f96.jpeg\", \"profile_link_color\": \"C40000\", \"profile_image_url\": \"http://a0.twimg.com/profile_images/3364694630/4df7762dd249011f61ae5b5cbf51a880_normal.jpeg\", \"notifications\": false, \"geo_enabled\": false, \"profile_banner_url\": \"https://twimg0-a.akamaihd.net/profile_banners/74712538/1360770207\", \"profile_background_image_url\": \"http://a0.twimg.com/profile_background_images/793517193/5383d88fc55b56286c55860a659e5f96.jpeg\", \"name\": \"Paul McCartney\", \"lang\": \"en\", \"following\": false, \"profile_background_tile\": true, \"favourites_count\": 0, \"screen_name\": \"PaulMcCartney\", \"url\": \"http://www.paulmccartney.com\", \"created_at\": \"Wed Sep 16 11:55:21 +0000 2009\", \"contributors_enabled\": false, \"time_zone\": \"London\", \"profile_sidebar_border_color\": \"FFFFFF\", \"default_profile\": false, \"is_translator\": false, \"listed_count\": 14844}";
  
//   private boolean follow_request_sent;
//   private boolean profile_use_background_image;
//   private long id;
//   private String description;
//   private boolean verified;
//   private String profile_image_url_https;
// //   private String profile_sidebar_fill_color;
// //   private String profile_text_color;
//   private long followers_count;
// //   private boolean protected_account;
//   private String location;
//   private boolean default_profile_image;
//   private long id_str;
//   
// //   private status;
// //   private contributors;
// //   private truncated;
// //   private text;
// //   private created_at;
// //   private retweeted;
// //   private in_reply_to_status_id_str;
// //   private coordinates;
// //   private id;
// //   private source;
// //   private in_reply_to_status_id;
// //   private place;
// //   private id_str;
// //   private in_reply_to_screen_name;
// //   private retweet_count;
// //   private geo;
// //   private in_reply_to_user_id_str;
// //   private in_reply_to_user_id;
//   
//   private int utc_offset;
//   private int statuses_count;
//   private String profile_background_color;
//   private long friends_count;
//   private String profile_background_image_url_https;
//   private String profile_link_color;
//   private String profile_image_url;
//   private boolean notifications;
//   private boolean geo_enabled;
//   private String profile_banner_url;
//   private String profile_background_image_url;
//   private String name;
//   private String lang;
//   private boolean following;
//   private boolean profile_background_tile;
//   private long favourites_count;
  private String screen_name;
//   private String url;
//   private String created_at;
//   private boolean contributors_enabled;
//   private String time_zone;
//   private String profile_sidebar_border_color;
//   private boolean default_profile;
//   private boolean is_translator;
//   private long listed_count;
    
  public Twat (String n) {
//     HashMap<String,Object> properties = new ObjectMapper().readValue("../data/twitter_lookup.json", HashMap.class);
//     Set set = properties.entrySet(); 
//     // Get an iterator 
//     Iterator i = set.iterator(); 
//     // Display elements 
//     while(i.hasNext()) { 
//       Map.Entry me = (Map.Entry)i.next(); 
//       System.out.print(me.getKey() + ": "); 
//       System.out.println(me.getValue()); 
//     } 
//     InputStream is = 
//             JsonParsing.class.getResourceAsStream( "sample-json.txt");
//     String jsonTxt = IOUtils.toString( is );

    JSONObject json = (JSONObject) JSONSerializer.toJSON( test );
    
    screen_name = json.getDouble("screen_name");
    

    int altitude = json.getInt( "altitude" );
    JSONObject pilot = json.getJSONObject("pilot");
    String firstName = pilot.getString("firstName");
    String lastName = pilot.getString("lastName");

    System.out.println( "Coolness: " + coolness );
    System.out.println( "Altitude: " + altitude );
    System.out.println( "Pilot: " + lastName );
  }

}
