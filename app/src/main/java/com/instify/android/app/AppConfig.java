package com.instify.android.app;

/**
 * Created by Abhish3k on 1/8/2017.
 */

public class AppConfig {

    // Server user login url
    public static String URL_LOGIN = "https://hashbird.com/gogrit.in/workspace/srm-api/get-info.php";
    public static String URL_ATTANDENCE = "https://hashbird.com/gogrit.in/workspace/srm-api/get-attd.php";
    // Server user register url
    public static String URL_GETTT = "https://hashbird.com/gogrit.in/workspace/srm-api/get-ptt.php";
    public static String URL_REGISTER = "http://192.168.0.102/android_login_api/register.php";

    public static final String INSTANCE_ID_TOKEN_RETRIEVED = "iid_token_retrieved";
    public static final String FRIENDLY_MSG_LENGTH = "friendly_msg_length";

    // flag to identify whether to show single line
    // or multi line test push notification tray
    public static boolean appendNotificationMessages = true;

    // global topic to receive app wide push notifications
    public static final String TOPIC_GLOBAL = "global";

    // broadcast receiver intent filters
    public static final String SENT_TOKEN_TO_SERVER = "sentTokenToServer";
    public static final String REGISTRATION_COMPLETE = "registrationComplete";
    public static final String PUSH_NOTIFICATION = "pushNotification";

    // type of push messages
    public static final int PUSH_TYPE_CHATROOM = 1;
    public static final int PUSH_TYPE_USER = 2;

    // id to handle the notification in the notification try
    public static final int NOTIFICATION_ID = 100;
    public static final int NOTIFICATION_ID_BIG_IMAGE = 101;
}