import org.drinkless.tdlib.Client;
import org.drinkless.tdlib.TdApi;

public class Application {
    public static void main(String[] args) {
        // 创建TelegramClient实例并初始化
//        Client client = Client.create(new Client.ResultHandler() {
//            @Override
//            public void onResult(TdApi.Object object) {
//                // 处理TDLib返回的结果
//                if (object instanceof TdApi.UpdateNewMessage) {
//                    TdApi.UpdateNewMessage update = (TdApi.UpdateNewMessage) object;
//                    TdApi.Message message = update.message;
//
//                    // 检查是否是视频消息
//                    if (message.content instanceof TdApi.MessageVideo) {
//                        TdApi.MessageVideo video = (TdApi.MessageVideo) message.content;
//
//                        // 获取视频的缩略图信息
//                        TdApi.PhotoSize thumbnail = video.thumbnail.photo;
//
//                        // 获取视频的JSON信息
//                        TdApi.Object videoJson = video.video.toJson();
//
//                        // 在这里处理视频缩略图和JSON信息
//                        System.out.println("Video Thumbnail: " + thumbnail);
//                        System.out.println("Video JSON: " + videoJson);
//                    }
//                }
//            }
//        }, null, null);
//
//        // 启动客户端
//        client.execute(new TdApi.SetLogVerbosityLevel(1));
//        client.execute(new TdApi.SetLogStream(new TdApi.LogStreamFile("tdlib.log", 1 << 27, false)));
//        client.execute(new TdApi.SetTdlibParameters(new TdApi.TdlibParameters()));
//
//        // 连接到Telegram服务器
//        client.execute(new TdApi.SetAuthenticationPhoneNumber("YOUR_PHONE_NUMBER", null));
//        client.execute(new TdApi.CheckAuthenticationCode("YOUR_VERIFICATION_CODE", null, null));
//
//        // 发送请求获取最新的消息
//        client.execute(new TdApi.GetChatHistory("GROUP_CHAT_ID", 0, 1, 0, true));
    }
}