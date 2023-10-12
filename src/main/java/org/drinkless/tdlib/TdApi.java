//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.drinkless.tdlib;

public class TdApi {
    private TdApi() {
    }

    static {
        try {
            System.loadLibrary("tdjni");
        } catch (UnsatisfiedLinkError var1) {
            var1.printStackTrace();
        }

    }

    public static class WriteGeneratedFilePart extends TdApi.Function<TdApi.Ok> {
        public long generationId;
        public long offset;
        public byte[] data;
        public static final int CONSTRUCTOR = 214474389;

        public WriteGeneratedFilePart() {
        }

        public WriteGeneratedFilePart(long var1, long var3, byte[] var5) {
            this.generationId = var1;
            this.offset = var3;
            this.data = var5;
        }

        public int getConstructor() {
            return 214474389;
        }
    }

    public static class ViewTrendingStickerSets extends TdApi.Function<TdApi.Ok> {
        public long[] stickerSetIds;
        public static final int CONSTRUCTOR = -952416520;

        public ViewTrendingStickerSets() {
        }

        public ViewTrendingStickerSets(long[] var1) {
            this.stickerSetIds = var1;
        }

        public int getConstructor() {
            return -952416520;
        }
    }

    public static class ViewPremiumFeature extends TdApi.Function<TdApi.Ok> {
        public TdApi.PremiumFeature feature;
        public static final int CONSTRUCTOR = 192950706;

        public ViewPremiumFeature() {
        }

        public ViewPremiumFeature(TdApi.PremiumFeature var1) {
            this.feature = var1;
        }

        public int getConstructor() {
            return 192950706;
        }
    }

    public static class ViewMessages extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long[] messageIds;
        public TdApi.MessageSource source;
        public boolean forceRead;
        public static final int CONSTRUCTOR = 960236656;

        public ViewMessages() {
        }

        public ViewMessages(long var1, long[] var3, TdApi.MessageSource var4, boolean var5) {
            this.chatId = var1;
            this.messageIds = var3;
            this.source = var4;
            this.forceRead = var5;
        }

        public int getConstructor() {
            return 960236656;
        }
    }

    public static class ValidateOrderInfo extends TdApi.Function<TdApi.ValidatedOrderInfo> {
        public TdApi.InputInvoice inputInvoice;
        public TdApi.OrderInfo orderInfo;
        public boolean allowSave;
        public static final int CONSTRUCTOR = -1248305201;

        public ValidateOrderInfo() {
        }

        public ValidateOrderInfo(TdApi.InputInvoice var1, TdApi.OrderInfo var2, boolean var3) {
            this.inputInvoice = var1;
            this.orderInfo = var2;
            this.allowSave = var3;
        }

        public int getConstructor() {
            return -1248305201;
        }
    }

    public static class UploadStickerFile extends TdApi.Function<TdApi.File> {
        public long userId;
        public TdApi.StickerFormat stickerFormat;
        public TdApi.InputFile sticker;
        public static final int CONSTRUCTOR = 647385283;

        public UploadStickerFile() {
        }

        public UploadStickerFile(long var1, TdApi.StickerFormat var3, TdApi.InputFile var4) {
            this.userId = var1;
            this.stickerFormat = var3;
            this.sticker = var4;
        }

        public int getConstructor() {
            return 647385283;
        }
    }

    public static class UpgradeBasicGroupChatToSupergroupChat extends TdApi.Function<TdApi.Chat> {
        public long chatId;
        public static final int CONSTRUCTOR = 300488122;

        public UpgradeBasicGroupChatToSupergroupChat() {
        }

        public UpgradeBasicGroupChatToSupergroupChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 300488122;
        }
    }

    public static class UnpinChatMessage extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = 2065448670;

        public UnpinChatMessage() {
        }

        public UnpinChatMessage(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return 2065448670;
        }
    }

    public static class UnpinAllMessageThreadMessages extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageThreadId;
        public static final int CONSTRUCTOR = -1211719936;

        public UnpinAllMessageThreadMessages() {
        }

        public UnpinAllMessageThreadMessages(long var1, long var3) {
            this.chatId = var1;
            this.messageThreadId = var3;
        }

        public int getConstructor() {
            return -1211719936;
        }
    }

    public static class UnpinAllChatMessages extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = -1437805385;

        public UnpinAllChatMessages() {
        }

        public UnpinAllChatMessages(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -1437805385;
        }
    }

    public static class TranslateText extends TdApi.Function<TdApi.FormattedText> {
        public TdApi.FormattedText text;
        public String toLanguageCode;
        public static final int CONSTRUCTOR = 623011058;

        public TranslateText() {
        }

        public TranslateText(TdApi.FormattedText var1, String var2) {
            this.text = var1;
            this.toLanguageCode = var2;
        }

        public int getConstructor() {
            return 623011058;
        }
    }

    public static class TranslateMessageText extends TdApi.Function<TdApi.FormattedText> {
        public long chatId;
        public long messageId;
        public String toLanguageCode;
        public static final int CONSTRUCTOR = 1405427410;

        public TranslateMessageText() {
        }

        public TranslateMessageText(long var1, long var3, String var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.toLanguageCode = var5;
        }

        public int getConstructor() {
            return 1405427410;
        }
    }

    public static class TransferChatOwnership extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long userId;
        public String password;
        public static final int CONSTRUCTOR = 2006977043;

        public TransferChatOwnership() {
        }

        public TransferChatOwnership(long var1, long var3, String var5) {
            this.chatId = var1;
            this.userId = var3;
            this.password = var5;
        }

        public int getConstructor() {
            return 2006977043;
        }
    }

    public static class ToggleUsernameIsActive extends TdApi.Function<TdApi.Ok> {
        public String username;
        public boolean isActive;
        public static final int CONSTRUCTOR = 1244098019;

        public ToggleUsernameIsActive() {
        }

        public ToggleUsernameIsActive(String var1, boolean var2) {
            this.username = var1;
            this.isActive = var2;
        }

        public int getConstructor() {
            return 1244098019;
        }
    }

    public static class ToggleSupergroupUsernameIsActive extends TdApi.Function<TdApi.Ok> {
        public long supergroupId;
        public String username;
        public boolean isActive;
        public static final int CONSTRUCTOR = -1500811777;

        public ToggleSupergroupUsernameIsActive() {
        }

        public ToggleSupergroupUsernameIsActive(long var1, String var3, boolean var4) {
            this.supergroupId = var1;
            this.username = var3;
            this.isActive = var4;
        }

        public int getConstructor() {
            return -1500811777;
        }
    }

    public static class ToggleSupergroupSignMessages extends TdApi.Function<TdApi.Ok> {
        public long supergroupId;
        public boolean signMessages;
        public static final int CONSTRUCTOR = 1156568356;

        public ToggleSupergroupSignMessages() {
        }

        public ToggleSupergroupSignMessages(long var1, boolean var3) {
            this.supergroupId = var1;
            this.signMessages = var3;
        }

        public int getConstructor() {
            return 1156568356;
        }
    }

    public static class ToggleSupergroupJoinToSendMessages extends TdApi.Function<TdApi.Ok> {
        public long supergroupId;
        public boolean joinToSendMessages;
        public static final int CONSTRUCTOR = -182022642;

        public ToggleSupergroupJoinToSendMessages() {
        }

        public ToggleSupergroupJoinToSendMessages(long var1, boolean var3) {
            this.supergroupId = var1;
            this.joinToSendMessages = var3;
        }

        public int getConstructor() {
            return -182022642;
        }
    }

    public static class ToggleSupergroupJoinByRequest extends TdApi.Function<TdApi.Ok> {
        public long supergroupId;
        public boolean joinByRequest;
        public static final int CONSTRUCTOR = 2111807454;

        public ToggleSupergroupJoinByRequest() {
        }

        public ToggleSupergroupJoinByRequest(long var1, boolean var3) {
            this.supergroupId = var1;
            this.joinByRequest = var3;
        }

        public int getConstructor() {
            return 2111807454;
        }
    }

    public static class ToggleSupergroupIsForum extends TdApi.Function<TdApi.Ok> {
        public long supergroupId;
        public boolean isForum;
        public static final int CONSTRUCTOR = -1771071990;

        public ToggleSupergroupIsForum() {
        }

        public ToggleSupergroupIsForum(long var1, boolean var3) {
            this.supergroupId = var1;
            this.isForum = var3;
        }

        public int getConstructor() {
            return -1771071990;
        }
    }

    public static class ToggleSupergroupIsBroadcastGroup extends TdApi.Function<TdApi.Ok> {
        public long supergroupId;
        public static final int CONSTRUCTOR = 884089365;

        public ToggleSupergroupIsBroadcastGroup() {
        }

        public ToggleSupergroupIsBroadcastGroup(long var1) {
            this.supergroupId = var1;
        }

        public int getConstructor() {
            return 884089365;
        }
    }

    public static class ToggleSupergroupIsAllHistoryAvailable extends TdApi.Function<TdApi.Ok> {
        public long supergroupId;
        public boolean isAllHistoryAvailable;
        public static final int CONSTRUCTOR = 1155110478;

        public ToggleSupergroupIsAllHistoryAvailable() {
        }

        public ToggleSupergroupIsAllHistoryAvailable(long var1, boolean var3) {
            this.supergroupId = var1;
            this.isAllHistoryAvailable = var3;
        }

        public int getConstructor() {
            return 1155110478;
        }
    }

    public static class ToggleSupergroupHasHiddenMembers extends TdApi.Function<TdApi.Ok> {
        public long supergroupId;
        public boolean hasHiddenMembers;
        public static final int CONSTRUCTOR = -1537892918;

        public ToggleSupergroupHasHiddenMembers() {
        }

        public ToggleSupergroupHasHiddenMembers(long var1, boolean var3) {
            this.supergroupId = var1;
            this.hasHiddenMembers = var3;
        }

        public int getConstructor() {
            return -1537892918;
        }
    }

    public static class ToggleSupergroupHasAggressiveAntiSpamEnabled extends TdApi.Function<TdApi.Ok> {
        public long supergroupId;
        public boolean hasAggressiveAntiSpamEnabled;
        public static final int CONSTRUCTOR = 1748956943;

        public ToggleSupergroupHasAggressiveAntiSpamEnabled() {
        }

        public ToggleSupergroupHasAggressiveAntiSpamEnabled(long var1, boolean var3) {
            this.supergroupId = var1;
            this.hasAggressiveAntiSpamEnabled = var3;
        }

        public int getConstructor() {
            return 1748956943;
        }
    }

    public static class ToggleStoryIsPinned extends TdApi.Function<TdApi.Ok> {
        public int storyId;
        public boolean isPinned;
        public static final int CONSTRUCTOR = -545246727;

        public ToggleStoryIsPinned() {
        }

        public ToggleStoryIsPinned(int var1, boolean var2) {
            this.storyId = var1;
            this.isPinned = var2;
        }

        public int getConstructor() {
            return -545246727;
        }
    }

    public static class ToggleSessionCanAcceptSecretChats extends TdApi.Function<TdApi.Ok> {
        public long sessionId;
        public boolean canAcceptSecretChats;
        public static final int CONSTRUCTOR = 1000843390;

        public ToggleSessionCanAcceptSecretChats() {
        }

        public ToggleSessionCanAcceptSecretChats(long var1, boolean var3) {
            this.sessionId = var1;
            this.canAcceptSecretChats = var3;
        }

        public int getConstructor() {
            return 1000843390;
        }
    }

    public static class ToggleSessionCanAcceptCalls extends TdApi.Function<TdApi.Ok> {
        public long sessionId;
        public boolean canAcceptCalls;
        public static final int CONSTRUCTOR = 1819027208;

        public ToggleSessionCanAcceptCalls() {
        }

        public ToggleSessionCanAcceptCalls(long var1, boolean var3) {
            this.sessionId = var1;
            this.canAcceptCalls = var3;
        }

        public int getConstructor() {
            return 1819027208;
        }
    }

    public static class ToggleGroupCallScreenSharingIsPaused extends TdApi.Function<TdApi.Ok> {
        public int groupCallId;
        public boolean isPaused;
        public static final int CONSTRUCTOR = -1602530464;

        public ToggleGroupCallScreenSharingIsPaused() {
        }

        public ToggleGroupCallScreenSharingIsPaused(int var1, boolean var2) {
            this.groupCallId = var1;
            this.isPaused = var2;
        }

        public int getConstructor() {
            return -1602530464;
        }
    }

    public static class ToggleGroupCallParticipantIsMuted extends TdApi.Function<TdApi.Ok> {
        public int groupCallId;
        public TdApi.MessageSender participantId;
        public boolean isMuted;
        public static final int CONSTRUCTOR = -1308093433;

        public ToggleGroupCallParticipantIsMuted() {
        }

        public ToggleGroupCallParticipantIsMuted(int var1, TdApi.MessageSender var2, boolean var3) {
            this.groupCallId = var1;
            this.participantId = var2;
            this.isMuted = var3;
        }

        public int getConstructor() {
            return -1308093433;
        }
    }

    public static class ToggleGroupCallParticipantIsHandRaised extends TdApi.Function<TdApi.Ok> {
        public int groupCallId;
        public TdApi.MessageSender participantId;
        public boolean isHandRaised;
        public static final int CONSTRUCTOR = -1896127519;

        public ToggleGroupCallParticipantIsHandRaised() {
        }

        public ToggleGroupCallParticipantIsHandRaised(int var1, TdApi.MessageSender var2, boolean var3) {
            this.groupCallId = var1;
            this.participantId = var2;
            this.isHandRaised = var3;
        }

        public int getConstructor() {
            return -1896127519;
        }
    }

    public static class ToggleGroupCallMuteNewParticipants extends TdApi.Function<TdApi.Ok> {
        public int groupCallId;
        public boolean muteNewParticipants;
        public static final int CONSTRUCTOR = 284082626;

        public ToggleGroupCallMuteNewParticipants() {
        }

        public ToggleGroupCallMuteNewParticipants(int var1, boolean var2) {
            this.groupCallId = var1;
            this.muteNewParticipants = var2;
        }

        public int getConstructor() {
            return 284082626;
        }
    }

    public static class ToggleGroupCallIsMyVideoPaused extends TdApi.Function<TdApi.Ok> {
        public int groupCallId;
        public boolean isMyVideoPaused;
        public static final int CONSTRUCTOR = -478875239;

        public ToggleGroupCallIsMyVideoPaused() {
        }

        public ToggleGroupCallIsMyVideoPaused(int var1, boolean var2) {
            this.groupCallId = var1;
            this.isMyVideoPaused = var2;
        }

        public int getConstructor() {
            return -478875239;
        }
    }

    public static class ToggleGroupCallIsMyVideoEnabled extends TdApi.Function<TdApi.Ok> {
        public int groupCallId;
        public boolean isMyVideoEnabled;
        public static final int CONSTRUCTOR = -1624289030;

        public ToggleGroupCallIsMyVideoEnabled() {
        }

        public ToggleGroupCallIsMyVideoEnabled(int var1, boolean var2) {
            this.groupCallId = var1;
            this.isMyVideoEnabled = var2;
        }

        public int getConstructor() {
            return -1624289030;
        }
    }

    public static class ToggleGroupCallEnabledStartNotification extends TdApi.Function<TdApi.Ok> {
        public int groupCallId;
        public boolean enabledStartNotification;
        public static final int CONSTRUCTOR = 707839826;

        public ToggleGroupCallEnabledStartNotification() {
        }

        public ToggleGroupCallEnabledStartNotification(int var1, boolean var2) {
            this.groupCallId = var1;
            this.enabledStartNotification = var2;
        }

        public int getConstructor() {
            return 707839826;
        }
    }

    public static class ToggleGeneralForumTopicIsHidden extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public boolean isHidden;
        public static final int CONSTRUCTOR = 1595741256;

        public ToggleGeneralForumTopicIsHidden() {
        }

        public ToggleGeneralForumTopicIsHidden(long var1, boolean var3) {
            this.chatId = var1;
            this.isHidden = var3;
        }

        public int getConstructor() {
            return 1595741256;
        }
    }

    public static class ToggleForumTopicIsPinned extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageThreadId;
        public boolean isPinned;
        public static final int CONSTRUCTOR = 1181543092;

        public ToggleForumTopicIsPinned() {
        }

        public ToggleForumTopicIsPinned(long var1, long var3, boolean var5) {
            this.chatId = var1;
            this.messageThreadId = var3;
            this.isPinned = var5;
        }

        public int getConstructor() {
            return 1181543092;
        }
    }

    public static class ToggleForumTopicIsClosed extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageThreadId;
        public boolean isClosed;
        public static final int CONSTRUCTOR = -949712141;

        public ToggleForumTopicIsClosed() {
        }

        public ToggleForumTopicIsClosed(long var1, long var3, boolean var5) {
            this.chatId = var1;
            this.messageThreadId = var3;
            this.isClosed = var5;
        }

        public int getConstructor() {
            return -949712141;
        }
    }

    public static class ToggleDownloadIsPaused extends TdApi.Function<TdApi.Ok> {
        public int fileId;
        public boolean isPaused;
        public static final int CONSTRUCTOR = -947493099;

        public ToggleDownloadIsPaused() {
        }

        public ToggleDownloadIsPaused(int var1, boolean var2) {
            this.fileId = var1;
            this.isPaused = var2;
        }

        public int getConstructor() {
            return -947493099;
        }
    }

    public static class ToggleChatIsTranslatable extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public boolean isTranslatable;
        public static final int CONSTRUCTOR = -1812345889;

        public ToggleChatIsTranslatable() {
        }

        public ToggleChatIsTranslatable(long var1, boolean var3) {
            this.chatId = var1;
            this.isTranslatable = var3;
        }

        public int getConstructor() {
            return -1812345889;
        }
    }

    public static class ToggleChatIsPinned extends TdApi.Function<TdApi.Ok> {
        public TdApi.ChatList chatList;
        public long chatId;
        public boolean isPinned;
        public static final int CONSTRUCTOR = -1485429186;

        public ToggleChatIsPinned() {
        }

        public ToggleChatIsPinned(TdApi.ChatList var1, long var2, boolean var4) {
            this.chatList = var1;
            this.chatId = var2;
            this.isPinned = var4;
        }

        public int getConstructor() {
            return -1485429186;
        }
    }

    public static class ToggleChatIsMarkedAsUnread extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public boolean isMarkedAsUnread;
        public static final int CONSTRUCTOR = -986129697;

        public ToggleChatIsMarkedAsUnread() {
        }

        public ToggleChatIsMarkedAsUnread(long var1, boolean var3) {
            this.chatId = var1;
            this.isMarkedAsUnread = var3;
        }

        public int getConstructor() {
            return -986129697;
        }
    }

    public static class ToggleChatHasProtectedContent extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public boolean hasProtectedContent;
        public static final int CONSTRUCTOR = 975231309;

        public ToggleChatHasProtectedContent() {
        }

        public ToggleChatHasProtectedContent(long var1, boolean var3) {
            this.chatId = var1;
            this.hasProtectedContent = var3;
        }

        public int getConstructor() {
            return 975231309;
        }
    }

    public static class ToggleChatDefaultDisableNotification extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public boolean defaultDisableNotification;
        public static final int CONSTRUCTOR = 314794002;

        public ToggleChatDefaultDisableNotification() {
        }

        public ToggleChatDefaultDisableNotification(long var1, boolean var3) {
            this.chatId = var1;
            this.defaultDisableNotification = var3;
        }

        public int getConstructor() {
            return 314794002;
        }
    }

    public static class ToggleBotUsernameIsActive extends TdApi.Function<TdApi.Ok> {
        public long botUserId;
        public String username;
        public boolean isActive;
        public static final int CONSTRUCTOR = 2036569097;

        public ToggleBotUsernameIsActive() {
        }

        public ToggleBotUsernameIsActive(long var1, String var3, boolean var4) {
            this.botUserId = var1;
            this.username = var3;
            this.isActive = var4;
        }

        public int getConstructor() {
            return 2036569097;
        }
    }

    public static class ToggleBotIsAddedToAttachmentMenu extends TdApi.Function<TdApi.Ok> {
        public long botUserId;
        public boolean isAdded;
        public boolean allowWriteAccess;
        public static final int CONSTRUCTOR = -1906712934;

        public ToggleBotIsAddedToAttachmentMenu() {
        }

        public ToggleBotIsAddedToAttachmentMenu(long var1, boolean var3, boolean var4) {
            this.botUserId = var1;
            this.isAdded = var3;
            this.allowWriteAccess = var4;
        }

        public int getConstructor() {
            return -1906712934;
        }
    }

    public static class ToggleAllDownloadsArePaused extends TdApi.Function<TdApi.Ok> {
        public boolean arePaused;
        public static final int CONSTRUCTOR = 1251512322;

        public ToggleAllDownloadsArePaused() {
        }

        public ToggleAllDownloadsArePaused(boolean var1) {
            this.arePaused = var1;
        }

        public int getConstructor() {
            return 1251512322;
        }
    }

    public static class TestUseUpdate extends TdApi.Function<TdApi.Update> {
        public static final int CONSTRUCTOR = 717094686;

        public TestUseUpdate() {
        }

        public int getConstructor() {
            return 717094686;
        }
    }

    public static class TestSquareInt extends TdApi.Function<TdApi.TestInt> {
        public int x;
        public static final int CONSTRUCTOR = -60135024;

        public TestSquareInt() {
        }

        public TestSquareInt(int var1) {
            this.x = var1;
        }

        public int getConstructor() {
            return -60135024;
        }
    }

    public static class TestReturnError extends TdApi.Function<TdApi.Error> {
        public TdApi.Error error;
        public static final int CONSTRUCTOR = 455179506;

        public TestReturnError() {
        }

        public TestReturnError(TdApi.Error var1) {
            this.error = var1;
        }

        public int getConstructor() {
            return 455179506;
        }
    }

    public static class TestProxy extends TdApi.Function<TdApi.Ok> {
        public String server;
        public int port;
        public TdApi.ProxyType type;
        public int dcId;
        public double timeout;
        public static final int CONSTRUCTOR = -1197366626;

        public TestProxy() {
        }

        public TestProxy(String var1, int var2, TdApi.ProxyType var3, int var4, double var5) {
            this.server = var1;
            this.port = var2;
            this.type = var3;
            this.dcId = var4;
            this.timeout = var5;
        }

        public int getConstructor() {
            return -1197366626;
        }
    }

    public static class TestNetwork extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = -1343998901;

        public TestNetwork() {
        }

        public int getConstructor() {
            return -1343998901;
        }
    }

    public static class TestGetDifference extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = 1747084069;

        public TestGetDifference() {
        }

        public int getConstructor() {
            return 1747084069;
        }
    }

    public static class TestCallVectorStringObject extends TdApi.Function<TdApi.TestVectorStringObject> {
        public TdApi.TestString[] x;
        public static final int CONSTRUCTOR = 1527666429;

        public TestCallVectorStringObject() {
        }

        public TestCallVectorStringObject(TdApi.TestString[] var1) {
            this.x = var1;
        }

        public int getConstructor() {
            return 1527666429;
        }
    }

    public static class TestCallVectorString extends TdApi.Function<TdApi.TestVectorString> {
        public String[] x;
        public static final int CONSTRUCTOR = -408600900;

        public TestCallVectorString() {
        }

        public TestCallVectorString(String[] var1) {
            this.x = var1;
        }

        public int getConstructor() {
            return -408600900;
        }
    }

    public static class TestCallVectorIntObject extends TdApi.Function<TdApi.TestVectorIntObject> {
        public TdApi.TestInt[] x;
        public static final int CONSTRUCTOR = 1825428218;

        public TestCallVectorIntObject() {
        }

        public TestCallVectorIntObject(TdApi.TestInt[] var1) {
            this.x = var1;
        }

        public int getConstructor() {
            return 1825428218;
        }
    }

    public static class TestCallVectorInt extends TdApi.Function<TdApi.TestVectorInt> {
        public int[] x;
        public static final int CONSTRUCTOR = -2137277793;

        public TestCallVectorInt() {
        }

        public TestCallVectorInt(int[] var1) {
            this.x = var1;
        }

        public int getConstructor() {
            return -2137277793;
        }
    }

    public static class TestCallString extends TdApi.Function<TdApi.TestString> {
        public String x;
        public static final int CONSTRUCTOR = -1732818385;

        public TestCallString() {
        }

        public TestCallString(String var1) {
            this.x = var1;
        }

        public int getConstructor() {
            return -1732818385;
        }
    }

    public static class TestCallEmpty extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = -627291626;

        public TestCallEmpty() {
        }

        public int getConstructor() {
            return -627291626;
        }
    }

    public static class TestCallBytes extends TdApi.Function<TdApi.TestBytes> {
        public byte[] x;
        public static final int CONSTRUCTOR = -736011607;

        public TestCallBytes() {
        }

        public TestCallBytes(byte[] var1) {
            this.x = var1;
        }

        public int getConstructor() {
            return -736011607;
        }
    }

    public static class TerminateSession extends TdApi.Function<TdApi.Ok> {
        public long sessionId;
        public static final int CONSTRUCTOR = -407385812;

        public TerminateSession() {
        }

        public TerminateSession(long var1) {
            this.sessionId = var1;
        }

        public int getConstructor() {
            return -407385812;
        }
    }

    public static class TerminateAllOtherSessions extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = 1874485523;

        public TerminateAllOtherSessions() {
        }

        public int getConstructor() {
            return 1874485523;
        }
    }

    public static class SynchronizeLanguagePack extends TdApi.Function<TdApi.Ok> {
        public String languagePackId;
        public static final int CONSTRUCTOR = -2065307858;

        public SynchronizeLanguagePack() {
        }

        public SynchronizeLanguagePack(String var1) {
            this.languagePackId = var1;
        }

        public int getConstructor() {
            return -2065307858;
        }
    }

    public static class SuggestUserProfilePhoto extends TdApi.Function<TdApi.Ok> {
        public long userId;
        public TdApi.InputChatPhoto photo;
        public static final int CONSTRUCTOR = -1788742557;

        public SuggestUserProfilePhoto() {
        }

        public SuggestUserProfilePhoto(long var1, TdApi.InputChatPhoto var3) {
            this.userId = var1;
            this.photo = var3;
        }

        public int getConstructor() {
            return -1788742557;
        }
    }

    public static class StopPoll extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageId;
        public TdApi.ReplyMarkup replyMarkup;
        public static final int CONSTRUCTOR = 1659374253;

        public StopPoll() {
        }

        public StopPoll(long var1, long var3, TdApi.ReplyMarkup var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.replyMarkup = var5;
        }

        public int getConstructor() {
            return 1659374253;
        }
    }

    public static class StartScheduledGroupCall extends TdApi.Function<TdApi.Ok> {
        public int groupCallId;
        public static final int CONSTRUCTOR = 1519938838;

        public StartScheduledGroupCall() {
        }

        public StartScheduledGroupCall(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return 1519938838;
        }
    }

    public static class StartGroupCallScreenSharing extends TdApi.Function<TdApi.Text> {
        public int groupCallId;
        public int audioSourceId;
        public String payload;
        public static final int CONSTRUCTOR = -884068051;

        public StartGroupCallScreenSharing() {
        }

        public StartGroupCallScreenSharing(int var1, int var2, String var3) {
            this.groupCallId = var1;
            this.audioSourceId = var2;
            this.payload = var3;
        }

        public int getConstructor() {
            return -884068051;
        }
    }

    public static class StartGroupCallRecording extends TdApi.Function<TdApi.Ok> {
        public int groupCallId;
        public String title;
        public boolean recordVideo;
        public boolean usePortraitOrientation;
        public static final int CONSTRUCTOR = 1757774971;

        public StartGroupCallRecording() {
        }

        public StartGroupCallRecording(int var1, String var2, boolean var3, boolean var4) {
            this.groupCallId = var1;
            this.title = var2;
            this.recordVideo = var3;
            this.usePortraitOrientation = var4;
        }

        public int getConstructor() {
            return 1757774971;
        }
    }

    public static class ShareUserWithBot extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageId;
        public int buttonId;
        public long sharedUserId;
        public boolean onlyCheck;
        public static final int CONSTRUCTOR = -248315940;

        public ShareUserWithBot() {
        }

        public ShareUserWithBot(long var1, long var3, int var5, long var6, boolean var8) {
            this.chatId = var1;
            this.messageId = var3;
            this.buttonId = var5;
            this.sharedUserId = var6;
            this.onlyCheck = var8;
        }

        public int getConstructor() {
            return -248315940;
        }
    }

    public static class SharePhoneNumber extends TdApi.Function<TdApi.Ok> {
        public long userId;
        public static final int CONSTRUCTOR = 1097130069;

        public SharePhoneNumber() {
        }

        public SharePhoneNumber(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return 1097130069;
        }
    }

    public static class ShareChatWithBot extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageId;
        public int buttonId;
        public long sharedChatId;
        public boolean onlyCheck;
        public static final int CONSTRUCTOR = -1504507166;

        public ShareChatWithBot() {
        }

        public ShareChatWithBot(long var1, long var3, int var5, long var6, boolean var8) {
            this.chatId = var1;
            this.messageId = var3;
            this.buttonId = var5;
            this.sharedChatId = var6;
            this.onlyCheck = var8;
        }

        public int getConstructor() {
            return -1504507166;
        }
    }

    public static class SetVideoChatDefaultParticipant extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public TdApi.MessageSender defaultParticipantId;
        public static final int CONSTRUCTOR = -240749901;

        public SetVideoChatDefaultParticipant() {
        }

        public SetVideoChatDefaultParticipant(long var1, TdApi.MessageSender var3) {
            this.chatId = var1;
            this.defaultParticipantId = var3;
        }

        public int getConstructor() {
            return -240749901;
        }
    }

    public static class SetUsername extends TdApi.Function<TdApi.Ok> {
        public String username;
        public static final int CONSTRUCTOR = 439901214;

        public SetUsername() {
        }

        public SetUsername(String var1) {
            this.username = var1;
        }

        public int getConstructor() {
            return 439901214;
        }
    }

    public static class SetUserSupportInfo extends TdApi.Function<TdApi.UserSupportInfo> {
        public long userId;
        public TdApi.FormattedText message;
        public static final int CONSTRUCTOR = -2088986621;

        public SetUserSupportInfo() {
        }

        public SetUserSupportInfo(long var1, TdApi.FormattedText var3) {
            this.userId = var1;
            this.message = var3;
        }

        public int getConstructor() {
            return -2088986621;
        }
    }

    public static class SetUserPrivacySettingRules extends TdApi.Function<TdApi.Ok> {
        public TdApi.UserPrivacySetting setting;
        public TdApi.UserPrivacySettingRules rules;
        public static final int CONSTRUCTOR = -473812741;

        public SetUserPrivacySettingRules() {
        }

        public SetUserPrivacySettingRules(TdApi.UserPrivacySetting var1, TdApi.UserPrivacySettingRules var2) {
            this.setting = var1;
            this.rules = var2;
        }

        public int getConstructor() {
            return -473812741;
        }
    }

    public static class SetUserPersonalProfilePhoto extends TdApi.Function<TdApi.Ok> {
        public long userId;
        public TdApi.InputChatPhoto photo;
        public static final int CONSTRUCTOR = 464136438;

        public SetUserPersonalProfilePhoto() {
        }

        public SetUserPersonalProfilePhoto(long var1, TdApi.InputChatPhoto var3) {
            this.userId = var1;
            this.photo = var3;
        }

        public int getConstructor() {
            return 464136438;
        }
    }

    public static class SetTdlibParameters extends TdApi.Function<TdApi.Ok> {
        public boolean useTestDc;
        public String databaseDirectory;
        public String filesDirectory;
        public byte[] databaseEncryptionKey;
        public boolean useFileDatabase;
        public boolean useChatInfoDatabase;
        public boolean useMessageDatabase;
        public boolean useSecretChats;
        public int apiId;
        public String apiHash;
        public String systemLanguageCode;
        public String deviceModel;
        public String systemVersion;
        public String applicationVersion;
        public boolean enableStorageOptimizer;
        public boolean ignoreFileNames;
        public static final int CONSTRUCTOR = 1384743481;

        public SetTdlibParameters() {
        }

        public SetTdlibParameters(boolean var1, String var2, String var3, byte[] var4, boolean var5, boolean var6, boolean var7, boolean var8, int var9, String var10, String var11, String var12, String var13, String var14, boolean var15, boolean var16) {
            this.useTestDc = var1;
            this.databaseDirectory = var2;
            this.filesDirectory = var3;
            this.databaseEncryptionKey = var4;
            this.useFileDatabase = var5;
            this.useChatInfoDatabase = var6;
            this.useMessageDatabase = var7;
            this.useSecretChats = var8;
            this.apiId = var9;
            this.apiHash = var10;
            this.systemLanguageCode = var11;
            this.deviceModel = var12;
            this.systemVersion = var13;
            this.applicationVersion = var14;
            this.enableStorageOptimizer = var15;
            this.ignoreFileNames = var16;
        }

        public int getConstructor() {
            return 1384743481;
        }
    }

    public static class SetSupergroupUsername extends TdApi.Function<TdApi.Ok> {
        public long supergroupId;
        public String username;
        public static final int CONSTRUCTOR = 1346325252;

        public SetSupergroupUsername() {
        }

        public SetSupergroupUsername(long var1, String var3) {
            this.supergroupId = var1;
            this.username = var3;
        }

        public int getConstructor() {
            return 1346325252;
        }
    }

    public static class SetSupergroupStickerSet extends TdApi.Function<TdApi.Ok> {
        public long supergroupId;
        public long stickerSetId;
        public static final int CONSTRUCTOR = -2056344215;

        public SetSupergroupStickerSet() {
        }

        public SetSupergroupStickerSet(long var1, long var3) {
            this.supergroupId = var1;
            this.stickerSetId = var3;
        }

        public int getConstructor() {
            return -2056344215;
        }
    }

    public static class SetStoryReaction extends TdApi.Function<TdApi.Ok> {
        public long storySenderChatId;
        public int storyId;
        public TdApi.ReactionType reactionType;
        public boolean updateRecentReactions;
        public static final int CONSTRUCTOR = -1400156249;

        public SetStoryReaction() {
        }

        public SetStoryReaction(long var1, int var3, TdApi.ReactionType var4, boolean var5) {
            this.storySenderChatId = var1;
            this.storyId = var3;
            this.reactionType = var4;
            this.updateRecentReactions = var5;
        }

        public int getConstructor() {
            return -1400156249;
        }
    }

    public static class SetStoryPrivacySettings extends TdApi.Function<TdApi.Ok> {
        public int storyId;
        public TdApi.StoryPrivacySettings privacySettings;
        public static final int CONSTRUCTOR = -655801550;

        public SetStoryPrivacySettings() {
        }

        public SetStoryPrivacySettings(int var1, TdApi.StoryPrivacySettings var2) {
            this.storyId = var1;
            this.privacySettings = var2;
        }

        public int getConstructor() {
            return -655801550;
        }
    }

    public static class SetStickerSetTitle extends TdApi.Function<TdApi.Ok> {
        public String name;
        public String title;
        public static final int CONSTRUCTOR = 1693004706;

        public SetStickerSetTitle() {
        }

        public SetStickerSetTitle(String var1, String var2) {
            this.name = var1;
            this.title = var2;
        }

        public int getConstructor() {
            return 1693004706;
        }
    }

    public static class SetStickerSetThumbnail extends TdApi.Function<TdApi.Ok> {
        public long userId;
        public String name;
        public TdApi.InputFile thumbnail;
        public static final int CONSTRUCTOR = 1870737953;

        public SetStickerSetThumbnail() {
        }

        public SetStickerSetThumbnail(long var1, String var3, TdApi.InputFile var4) {
            this.userId = var1;
            this.name = var3;
            this.thumbnail = var4;
        }

        public int getConstructor() {
            return 1870737953;
        }
    }

    public static class SetStickerPositionInSet extends TdApi.Function<TdApi.Ok> {
        public TdApi.InputFile sticker;
        public int position;
        public static final int CONSTRUCTOR = 2075281185;

        public SetStickerPositionInSet() {
        }

        public SetStickerPositionInSet(TdApi.InputFile var1, int var2) {
            this.sticker = var1;
            this.position = var2;
        }

        public int getConstructor() {
            return 2075281185;
        }
    }

    public static class SetStickerMaskPosition extends TdApi.Function<TdApi.Ok> {
        public TdApi.InputFile sticker;
        public TdApi.MaskPosition maskPosition;
        public static final int CONSTRUCTOR = 1202280912;

        public SetStickerMaskPosition() {
        }

        public SetStickerMaskPosition(TdApi.InputFile var1, TdApi.MaskPosition var2) {
            this.sticker = var1;
            this.maskPosition = var2;
        }

        public int getConstructor() {
            return 1202280912;
        }
    }

    public static class SetStickerKeywords extends TdApi.Function<TdApi.Ok> {
        public TdApi.InputFile sticker;
        public String[] keywords;
        public static final int CONSTRUCTOR = 137223565;

        public SetStickerKeywords() {
        }

        public SetStickerKeywords(TdApi.InputFile var1, String[] var2) {
            this.sticker = var1;
            this.keywords = var2;
        }

        public int getConstructor() {
            return 137223565;
        }
    }

    public static class SetStickerEmojis extends TdApi.Function<TdApi.Ok> {
        public TdApi.InputFile sticker;
        public String emojis;
        public static final int CONSTRUCTOR = -638843855;

        public SetStickerEmojis() {
        }

        public SetStickerEmojis(TdApi.InputFile var1, String var2) {
            this.sticker = var1;
            this.emojis = var2;
        }

        public int getConstructor() {
            return -638843855;
        }
    }

    public static class SetScopeNotificationSettings extends TdApi.Function<TdApi.Ok> {
        public TdApi.NotificationSettingsScope scope;
        public TdApi.ScopeNotificationSettings notificationSettings;
        public static final int CONSTRUCTOR = -2049984966;

        public SetScopeNotificationSettings() {
        }

        public SetScopeNotificationSettings(TdApi.NotificationSettingsScope var1, TdApi.ScopeNotificationSettings var2) {
            this.scope = var1;
            this.notificationSettings = var2;
        }

        public int getConstructor() {
            return -2049984966;
        }
    }

    public static class SetRecoveryEmailAddress extends TdApi.Function<TdApi.PasswordState> {
        public String password;
        public String newRecoveryEmailAddress;
        public static final int CONSTRUCTOR = -1981836385;

        public SetRecoveryEmailAddress() {
        }

        public SetRecoveryEmailAddress(String var1, String var2) {
            this.password = var1;
            this.newRecoveryEmailAddress = var2;
        }

        public int getConstructor() {
            return -1981836385;
        }
    }

    public static class SetProfilePhoto extends TdApi.Function<TdApi.Ok> {
        public TdApi.InputChatPhoto photo;
        public boolean isPublic;
        public static final int CONSTRUCTOR = -2048260627;

        public SetProfilePhoto() {
        }

        public SetProfilePhoto(TdApi.InputChatPhoto var1, boolean var2) {
            this.photo = var1;
            this.isPublic = var2;
        }

        public int getConstructor() {
            return -2048260627;
        }
    }

    public static class SetPollAnswer extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageId;
        public int[] optionIds;
        public static final int CONSTRUCTOR = -1399388792;

        public SetPollAnswer() {
        }

        public SetPollAnswer(long var1, long var3, int[] var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.optionIds = var5;
        }

        public int getConstructor() {
            return -1399388792;
        }
    }

    public static class SetPinnedForumTopics extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long[] messageThreadIds;
        public static final int CONSTRUCTOR = -475084011;

        public SetPinnedForumTopics() {
        }

        public SetPinnedForumTopics(long var1, long[] var3) {
            this.chatId = var1;
            this.messageThreadIds = var3;
        }

        public int getConstructor() {
            return -475084011;
        }
    }

    public static class SetPinnedChats extends TdApi.Function<TdApi.Ok> {
        public TdApi.ChatList chatList;
        public long[] chatIds;
        public static final int CONSTRUCTOR = -695640000;

        public SetPinnedChats() {
        }

        public SetPinnedChats(TdApi.ChatList var1, long[] var2) {
            this.chatList = var1;
            this.chatIds = var2;
        }

        public int getConstructor() {
            return -695640000;
        }
    }

    public static class SetPassword extends TdApi.Function<TdApi.PasswordState> {
        public String oldPassword;
        public String newPassword;
        public String newHint;
        public boolean setRecoveryEmailAddress;
        public String newRecoveryEmailAddress;
        public static final int CONSTRUCTOR = -1193589027;

        public SetPassword() {
        }

        public SetPassword(String var1, String var2, String var3, boolean var4, String var5) {
            this.oldPassword = var1;
            this.newPassword = var2;
            this.newHint = var3;
            this.setRecoveryEmailAddress = var4;
            this.newRecoveryEmailAddress = var5;
        }

        public int getConstructor() {
            return -1193589027;
        }
    }

    public static class SetPassportElementErrors extends TdApi.Function<TdApi.Ok> {
        public long userId;
        public TdApi.InputPassportElementError[] errors;
        public static final int CONSTRUCTOR = -2056754881;

        public SetPassportElementErrors() {
        }

        public SetPassportElementErrors(long var1, TdApi.InputPassportElementError[] var3) {
            this.userId = var1;
            this.errors = var3;
        }

        public int getConstructor() {
            return -2056754881;
        }
    }

    public static class SetPassportElement extends TdApi.Function<TdApi.PassportElement> {
        public TdApi.InputPassportElement element;
        public String password;
        public static final int CONSTRUCTOR = 2068173212;

        public SetPassportElement() {
        }

        public SetPassportElement(TdApi.InputPassportElement var1, String var2) {
            this.element = var1;
            this.password = var2;
        }

        public int getConstructor() {
            return 2068173212;
        }
    }

    public static class SetOption extends TdApi.Function<TdApi.Ok> {
        public String name;
        public TdApi.OptionValue value;
        public static final int CONSTRUCTOR = 2114670322;

        public SetOption() {
        }

        public SetOption(String var1, TdApi.OptionValue var2) {
            this.name = var1;
            this.value = var2;
        }

        public int getConstructor() {
            return 2114670322;
        }
    }

    public static class SetNetworkType extends TdApi.Function<TdApi.Ok> {
        public TdApi.NetworkType type;
        public static final int CONSTRUCTOR = -701635234;

        public SetNetworkType() {
        }

        public SetNetworkType(TdApi.NetworkType var1) {
            this.type = var1;
        }

        public int getConstructor() {
            return -701635234;
        }
    }

    public static class SetName extends TdApi.Function<TdApi.Ok> {
        public String firstName;
        public String lastName;
        public static final int CONSTRUCTOR = 1711693584;

        public SetName() {
        }

        public SetName(String var1, String var2) {
            this.firstName = var1;
            this.lastName = var2;
        }

        public int getConstructor() {
            return 1711693584;
        }
    }

    public static class SetMessageSenderBlockList extends TdApi.Function<TdApi.Ok> {
        public TdApi.MessageSender senderId;
        public TdApi.BlockList blockList;
        public static final int CONSTRUCTOR = -1987355503;

        public SetMessageSenderBlockList() {
        }

        public SetMessageSenderBlockList(TdApi.MessageSender var1, TdApi.BlockList var2) {
            this.senderId = var1;
            this.blockList = var2;
        }

        public int getConstructor() {
            return -1987355503;
        }
    }

    public static class SetMenuButton extends TdApi.Function<TdApi.Ok> {
        public long userId;
        public TdApi.BotMenuButton menuButton;
        public static final int CONSTRUCTOR = -1269841599;

        public SetMenuButton() {
        }

        public SetMenuButton(long var1, TdApi.BotMenuButton var3) {
            this.userId = var1;
            this.menuButton = var3;
        }

        public int getConstructor() {
            return -1269841599;
        }
    }

    public static class SetLoginEmailAddress extends TdApi.Function<TdApi.EmailAddressAuthenticationCodeInfo> {
        public String newLoginEmailAddress;
        public static final int CONSTRUCTOR = 935019476;

        public SetLoginEmailAddress() {
        }

        public SetLoginEmailAddress(String var1) {
            this.newLoginEmailAddress = var1;
        }

        public int getConstructor() {
            return 935019476;
        }
    }

    public static class SetLogVerbosityLevel extends TdApi.Function<TdApi.Ok> {
        public int newVerbosityLevel;
        public static final int CONSTRUCTOR = -303429678;

        public SetLogVerbosityLevel() {
        }

        public SetLogVerbosityLevel(int var1) {
            this.newVerbosityLevel = var1;
        }

        public int getConstructor() {
            return -303429678;
        }
    }

    public static class SetLogTagVerbosityLevel extends TdApi.Function<TdApi.Ok> {
        public String tag;
        public int newVerbosityLevel;
        public static final int CONSTRUCTOR = -2095589738;

        public SetLogTagVerbosityLevel() {
        }

        public SetLogTagVerbosityLevel(String var1, int var2) {
            this.tag = var1;
            this.newVerbosityLevel = var2;
        }

        public int getConstructor() {
            return -2095589738;
        }
    }

    public static class SetLogStream extends TdApi.Function<TdApi.Ok> {
        public TdApi.LogStream logStream;
        public static final int CONSTRUCTOR = -1364199535;

        public SetLogStream() {
        }

        public SetLogStream(TdApi.LogStream var1) {
            this.logStream = var1;
        }

        public int getConstructor() {
            return -1364199535;
        }
    }

    public static class SetLocation extends TdApi.Function<TdApi.Ok> {
        public TdApi.Location location;
        public static final int CONSTRUCTOR = 93926257;

        public SetLocation() {
        }

        public SetLocation(TdApi.Location var1) {
            this.location = var1;
        }

        public int getConstructor() {
            return 93926257;
        }
    }

    public static class SetInlineGameScore extends TdApi.Function<TdApi.Ok> {
        public String inlineMessageId;
        public boolean editMessage;
        public long userId;
        public int score;
        public boolean force;
        public static final int CONSTRUCTOR = -948871797;

        public SetInlineGameScore() {
        }

        public SetInlineGameScore(String var1, boolean var2, long var3, int var5, boolean var6) {
            this.inlineMessageId = var1;
            this.editMessage = var2;
            this.userId = var3;
            this.score = var5;
            this.force = var6;
        }

        public int getConstructor() {
            return -948871797;
        }
    }

    public static class SetInactiveSessionTtl extends TdApi.Function<TdApi.Ok> {
        public int inactiveSessionTtlDays;
        public static final int CONSTRUCTOR = 1570548048;

        public SetInactiveSessionTtl() {
        }

        public SetInactiveSessionTtl(int var1) {
            this.inactiveSessionTtlDays = var1;
        }

        public int getConstructor() {
            return 1570548048;
        }
    }

    public static class SetGroupCallTitle extends TdApi.Function<TdApi.Ok> {
        public int groupCallId;
        public String title;
        public static final int CONSTRUCTOR = -1228825139;

        public SetGroupCallTitle() {
        }

        public SetGroupCallTitle(int var1, String var2) {
            this.groupCallId = var1;
            this.title = var2;
        }

        public int getConstructor() {
            return -1228825139;
        }
    }

    public static class SetGroupCallParticipantVolumeLevel extends TdApi.Function<TdApi.Ok> {
        public int groupCallId;
        public TdApi.MessageSender participantId;
        public int volumeLevel;
        public static final int CONSTRUCTOR = -1753769944;

        public SetGroupCallParticipantVolumeLevel() {
        }

        public SetGroupCallParticipantVolumeLevel(int var1, TdApi.MessageSender var2, int var3) {
            this.groupCallId = var1;
            this.participantId = var2;
            this.volumeLevel = var3;
        }

        public int getConstructor() {
            return -1753769944;
        }
    }

    public static class SetGroupCallParticipantIsSpeaking extends TdApi.Function<TdApi.Ok> {
        public int groupCallId;
        public int audioSource;
        public boolean isSpeaking;
        public static final int CONSTRUCTOR = 927506917;

        public SetGroupCallParticipantIsSpeaking() {
        }

        public SetGroupCallParticipantIsSpeaking(int var1, int var2, boolean var3) {
            this.groupCallId = var1;
            this.audioSource = var2;
            this.isSpeaking = var3;
        }

        public int getConstructor() {
            return 927506917;
        }
    }

    public static class SetGameScore extends TdApi.Function<TdApi.Message> {
        public long chatId;
        public long messageId;
        public boolean editMessage;
        public long userId;
        public int score;
        public boolean force;
        public static final int CONSTRUCTOR = 2127359430;

        public SetGameScore() {
        }

        public SetGameScore(long var1, long var3, boolean var5, long var6, int var8, boolean var9) {
            this.chatId = var1;
            this.messageId = var3;
            this.editMessage = var5;
            this.userId = var6;
            this.score = var8;
            this.force = var9;
        }

        public int getConstructor() {
            return 2127359430;
        }
    }

    public static class SetForumTopicNotificationSettings extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageThreadId;
        public TdApi.ChatNotificationSettings notificationSettings;
        public static final int CONSTRUCTOR = 524498023;

        public SetForumTopicNotificationSettings() {
        }

        public SetForumTopicNotificationSettings(long var1, long var3, TdApi.ChatNotificationSettings var5) {
            this.chatId = var1;
            this.messageThreadId = var3;
            this.notificationSettings = var5;
        }

        public int getConstructor() {
            return 524498023;
        }
    }

    public static class SetFileGenerationProgress extends TdApi.Function<TdApi.Ok> {
        public long generationId;
        public long expectedSize;
        public long localPrefixSize;
        public static final int CONSTRUCTOR = 1836403518;

        public SetFileGenerationProgress() {
        }

        public SetFileGenerationProgress(long var1, long var3, long var5) {
            this.generationId = var1;
            this.expectedSize = var3;
            this.localPrefixSize = var5;
        }

        public int getConstructor() {
            return 1836403518;
        }
    }

    public static class SetEmojiStatus extends TdApi.Function<TdApi.Ok> {
        public TdApi.EmojiStatus emojiStatus;
        public static final int CONSTRUCTOR = -1829224867;

        public SetEmojiStatus() {
        }

        public SetEmojiStatus(TdApi.EmojiStatus var1) {
            this.emojiStatus = var1;
        }

        public int getConstructor() {
            return -1829224867;
        }
    }

    public static class SetDefaultReactionType extends TdApi.Function<TdApi.Ok> {
        public TdApi.ReactionType reactionType;
        public static final int CONSTRUCTOR = 1694730813;

        public SetDefaultReactionType() {
        }

        public SetDefaultReactionType(TdApi.ReactionType var1) {
            this.reactionType = var1;
        }

        public int getConstructor() {
            return 1694730813;
        }
    }

    public static class SetDefaultMessageAutoDeleteTime extends TdApi.Function<TdApi.Ok> {
        public TdApi.MessageAutoDeleteTime messageAutoDeleteTime;
        public static final int CONSTRUCTOR = -1772301460;

        public SetDefaultMessageAutoDeleteTime() {
        }

        public SetDefaultMessageAutoDeleteTime(TdApi.MessageAutoDeleteTime var1) {
            this.messageAutoDeleteTime = var1;
        }

        public int getConstructor() {
            return -1772301460;
        }
    }

    public static class SetDefaultGroupAdministratorRights extends TdApi.Function<TdApi.Ok> {
        public TdApi.ChatAdministratorRights defaultGroupAdministratorRights;
        public static final int CONSTRUCTOR = 1700231016;

        public SetDefaultGroupAdministratorRights() {
        }

        public SetDefaultGroupAdministratorRights(TdApi.ChatAdministratorRights var1) {
            this.defaultGroupAdministratorRights = var1;
        }

        public int getConstructor() {
            return 1700231016;
        }
    }

    public static class SetDefaultChannelAdministratorRights extends TdApi.Function<TdApi.Ok> {
        public TdApi.ChatAdministratorRights defaultChannelAdministratorRights;
        public static final int CONSTRUCTOR = -234004967;

        public SetDefaultChannelAdministratorRights() {
        }

        public SetDefaultChannelAdministratorRights(TdApi.ChatAdministratorRights var1) {
            this.defaultChannelAdministratorRights = var1;
        }

        public int getConstructor() {
            return -234004967;
        }
    }

    public static class SetDatabaseEncryptionKey extends TdApi.Function<TdApi.Ok> {
        public byte[] newEncryptionKey;
        public static final int CONSTRUCTOR = -1204599371;

        public SetDatabaseEncryptionKey() {
        }

        public SetDatabaseEncryptionKey(byte[] var1) {
            this.newEncryptionKey = var1;
        }

        public int getConstructor() {
            return -1204599371;
        }
    }

    public static class SetCustomLanguagePackString extends TdApi.Function<TdApi.Ok> {
        public String languagePackId;
        public TdApi.LanguagePackString newString;
        public static final int CONSTRUCTOR = 1316365592;

        public SetCustomLanguagePackString() {
        }

        public SetCustomLanguagePackString(String var1, TdApi.LanguagePackString var2) {
            this.languagePackId = var1;
            this.newString = var2;
        }

        public int getConstructor() {
            return 1316365592;
        }
    }

    public static class SetCustomLanguagePack extends TdApi.Function<TdApi.Ok> {
        public TdApi.LanguagePackInfo info;
        public TdApi.LanguagePackString[] strings;
        public static final int CONSTRUCTOR = -296742819;

        public SetCustomLanguagePack() {
        }

        public SetCustomLanguagePack(TdApi.LanguagePackInfo var1, TdApi.LanguagePackString[] var2) {
            this.info = var1;
            this.strings = var2;
        }

        public int getConstructor() {
            return -296742819;
        }
    }

    public static class SetCustomEmojiStickerSetThumbnail extends TdApi.Function<TdApi.Ok> {
        public String name;
        public long customEmojiId;
        public static final int CONSTRUCTOR = -1122836246;

        public SetCustomEmojiStickerSetThumbnail() {
        }

        public SetCustomEmojiStickerSetThumbnail(String var1, long var2) {
            this.name = var1;
            this.customEmojiId = var2;
        }

        public int getConstructor() {
            return -1122836246;
        }
    }

    public static class SetCommands extends TdApi.Function<TdApi.Ok> {
        public TdApi.BotCommandScope scope;
        public String languageCode;
        public TdApi.BotCommand[] commands;
        public static final int CONSTRUCTOR = -907165606;

        public SetCommands() {
        }

        public SetCommands(TdApi.BotCommandScope var1, String var2, TdApi.BotCommand[] var3) {
            this.scope = var1;
            this.languageCode = var2;
            this.commands = var3;
        }

        public int getConstructor() {
            return -907165606;
        }
    }

    public static class SetCloseFriends extends TdApi.Function<TdApi.Ok> {
        public long[] userIds;
        public static final int CONSTRUCTOR = -1908013258;

        public SetCloseFriends() {
        }

        public SetCloseFriends(long[] var1) {
            this.userIds = var1;
        }

        public int getConstructor() {
            return -1908013258;
        }
    }

    public static class SetChatTitle extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public String title;
        public static final int CONSTRUCTOR = 164282047;

        public SetChatTitle() {
        }

        public SetChatTitle(long var1, String var3) {
            this.chatId = var1;
            this.title = var3;
        }

        public int getConstructor() {
            return 164282047;
        }
    }

    public static class SetChatTheme extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public String themeName;
        public static final int CONSTRUCTOR = -1895234925;

        public SetChatTheme() {
        }

        public SetChatTheme(long var1, String var3) {
            this.chatId = var1;
            this.themeName = var3;
        }

        public int getConstructor() {
            return -1895234925;
        }
    }

    public static class SetChatSlowModeDelay extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public int slowModeDelay;
        public static final int CONSTRUCTOR = -540350914;

        public SetChatSlowModeDelay() {
        }

        public SetChatSlowModeDelay(long var1, int var3) {
            this.chatId = var1;
            this.slowModeDelay = var3;
        }

        public int getConstructor() {
            return -540350914;
        }
    }

    public static class SetChatPhoto extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public TdApi.InputChatPhoto photo;
        public static final int CONSTRUCTOR = -377778941;

        public SetChatPhoto() {
        }

        public SetChatPhoto(long var1, TdApi.InputChatPhoto var3) {
            this.chatId = var1;
            this.photo = var3;
        }

        public int getConstructor() {
            return -377778941;
        }
    }

    public static class SetChatPermissions extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public TdApi.ChatPermissions permissions;
        public static final int CONSTRUCTOR = 2138507006;

        public SetChatPermissions() {
        }

        public SetChatPermissions(long var1, TdApi.ChatPermissions var3) {
            this.chatId = var1;
            this.permissions = var3;
        }

        public int getConstructor() {
            return 2138507006;
        }
    }

    public static class SetChatNotificationSettings extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public TdApi.ChatNotificationSettings notificationSettings;
        public static final int CONSTRUCTOR = 777199614;

        public SetChatNotificationSettings() {
        }

        public SetChatNotificationSettings(long var1, TdApi.ChatNotificationSettings var3) {
            this.chatId = var1;
            this.notificationSettings = var3;
        }

        public int getConstructor() {
            return 777199614;
        }
    }

    public static class SetChatMessageSender extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public TdApi.MessageSender messageSenderId;
        public static final int CONSTRUCTOR = -1421513858;

        public SetChatMessageSender() {
        }

        public SetChatMessageSender(long var1, TdApi.MessageSender var3) {
            this.chatId = var1;
            this.messageSenderId = var3;
        }

        public int getConstructor() {
            return -1421513858;
        }
    }

    public static class SetChatMessageAutoDeleteTime extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public int messageAutoDeleteTime;
        public static final int CONSTRUCTOR = -1505643265;

        public SetChatMessageAutoDeleteTime() {
        }

        public SetChatMessageAutoDeleteTime(long var1, int var3) {
            this.chatId = var1;
            this.messageAutoDeleteTime = var3;
        }

        public int getConstructor() {
            return -1505643265;
        }
    }

    public static class SetChatMemberStatus extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public TdApi.MessageSender memberId;
        public TdApi.ChatMemberStatus status;
        public static final int CONSTRUCTOR = 81794847;

        public SetChatMemberStatus() {
        }

        public SetChatMemberStatus(long var1, TdApi.MessageSender var3, TdApi.ChatMemberStatus var4) {
            this.chatId = var1;
            this.memberId = var3;
            this.status = var4;
        }

        public int getConstructor() {
            return 81794847;
        }
    }

    public static class SetChatLocation extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public TdApi.ChatLocation location;
        public static final int CONSTRUCTOR = -767091286;

        public SetChatLocation() {
        }

        public SetChatLocation(long var1, TdApi.ChatLocation var3) {
            this.chatId = var1;
            this.location = var3;
        }

        public int getConstructor() {
            return -767091286;
        }
    }

    public static class SetChatDraftMessage extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageThreadId;
        public TdApi.DraftMessage draftMessage;
        public static final int CONSTRUCTOR = 1683889946;

        public SetChatDraftMessage() {
        }

        public SetChatDraftMessage(long var1, long var3, TdApi.DraftMessage var5) {
            this.chatId = var1;
            this.messageThreadId = var3;
            this.draftMessage = var5;
        }

        public int getConstructor() {
            return 1683889946;
        }
    }

    public static class SetChatDiscussionGroup extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long discussionChatId;
        public static final int CONSTRUCTOR = -918801736;

        public SetChatDiscussionGroup() {
        }

        public SetChatDiscussionGroup(long var1, long var3) {
            this.chatId = var1;
            this.discussionChatId = var3;
        }

        public int getConstructor() {
            return -918801736;
        }
    }

    public static class SetChatDescription extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public String description;
        public static final int CONSTRUCTOR = 1957213277;

        public SetChatDescription() {
        }

        public SetChatDescription(long var1, String var3) {
            this.chatId = var1;
            this.description = var3;
        }

        public int getConstructor() {
            return 1957213277;
        }
    }

    public static class SetChatClientData extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public String clientData;
        public static final int CONSTRUCTOR = -827119811;

        public SetChatClientData() {
        }

        public SetChatClientData(long var1, String var3) {
            this.chatId = var1;
            this.clientData = var3;
        }

        public int getConstructor() {
            return -827119811;
        }
    }

    public static class SetChatBackground extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public TdApi.InputBackground background;
        public TdApi.BackgroundType type;
        public int darkThemeDimming;
        public static final int CONSTRUCTOR = 1027545896;

        public SetChatBackground() {
        }

        public SetChatBackground(long var1, TdApi.InputBackground var3, TdApi.BackgroundType var4, int var5) {
            this.chatId = var1;
            this.background = var3;
            this.type = var4;
            this.darkThemeDimming = var5;
        }

        public int getConstructor() {
            return 1027545896;
        }
    }

    public static class SetChatAvailableReactions extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public TdApi.ChatAvailableReactions availableReactions;
        public static final int CONSTRUCTOR = 267075078;

        public SetChatAvailableReactions() {
        }

        public SetChatAvailableReactions(long var1, TdApi.ChatAvailableReactions var3) {
            this.chatId = var1;
            this.availableReactions = var3;
        }

        public int getConstructor() {
            return 267075078;
        }
    }

    public static class SetChatActiveStoriesList extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public TdApi.StoryList storyList;
        public static final int CONSTRUCTOR = -521970415;

        public SetChatActiveStoriesList() {
        }

        public SetChatActiveStoriesList(long var1, TdApi.StoryList var3) {
            this.chatId = var1;
            this.storyList = var3;
        }

        public int getConstructor() {
            return -521970415;
        }
    }

    public static class SetBotUpdatesStatus extends TdApi.Function<TdApi.Ok> {
        public int pendingUpdateCount;
        public String errorMessage;
        public static final int CONSTRUCTOR = -1154926191;

        public SetBotUpdatesStatus() {
        }

        public SetBotUpdatesStatus(int var1, String var2) {
            this.pendingUpdateCount = var1;
            this.errorMessage = var2;
        }

        public int getConstructor() {
            return -1154926191;
        }
    }

    public static class SetBotProfilePhoto extends TdApi.Function<TdApi.Ok> {
        public long botUserId;
        public TdApi.InputChatPhoto photo;
        public static final int CONSTRUCTOR = -1115272346;

        public SetBotProfilePhoto() {
        }

        public SetBotProfilePhoto(long var1, TdApi.InputChatPhoto var3) {
            this.botUserId = var1;
            this.photo = var3;
        }

        public int getConstructor() {
            return -1115272346;
        }
    }

    public static class SetBotName extends TdApi.Function<TdApi.Ok> {
        public long botUserId;
        public String languageCode;
        public String name;
        public static final int CONSTRUCTOR = -761922959;

        public SetBotName() {
        }

        public SetBotName(long var1, String var3, String var4) {
            this.botUserId = var1;
            this.languageCode = var3;
            this.name = var4;
        }

        public int getConstructor() {
            return -761922959;
        }
    }

    public static class SetBotInfoShortDescription extends TdApi.Function<TdApi.Ok> {
        public long botUserId;
        public String languageCode;
        public String shortDescription;
        public static final int CONSTRUCTOR = 982956771;

        public SetBotInfoShortDescription() {
        }

        public SetBotInfoShortDescription(long var1, String var3, String var4) {
            this.botUserId = var1;
            this.languageCode = var3;
            this.shortDescription = var4;
        }

        public int getConstructor() {
            return 982956771;
        }
    }

    public static class SetBotInfoDescription extends TdApi.Function<TdApi.Ok> {
        public long botUserId;
        public String languageCode;
        public String description;
        public static final int CONSTRUCTOR = 693574984;

        public SetBotInfoDescription() {
        }

        public SetBotInfoDescription(long var1, String var3, String var4) {
            this.botUserId = var1;
            this.languageCode = var3;
            this.description = var4;
        }

        public int getConstructor() {
            return 693574984;
        }
    }

    public static class SetBio extends TdApi.Function<TdApi.Ok> {
        public String bio;
        public static final int CONSTRUCTOR = -1619582124;

        public SetBio() {
        }

        public SetBio(String var1) {
            this.bio = var1;
        }

        public int getConstructor() {
            return -1619582124;
        }
    }

    public static class SetBackground extends TdApi.Function<TdApi.Background> {
        public TdApi.InputBackground background;
        public TdApi.BackgroundType type;
        public boolean forDarkTheme;
        public static final int CONSTRUCTOR = -1035439225;

        public SetBackground() {
        }

        public SetBackground(TdApi.InputBackground var1, TdApi.BackgroundType var2, boolean var3) {
            this.background = var1;
            this.type = var2;
            this.forDarkTheme = var3;
        }

        public int getConstructor() {
            return -1035439225;
        }
    }

    public static class SetAutosaveSettings extends TdApi.Function<TdApi.Ok> {
        public TdApi.AutosaveSettingsScope scope;
        public TdApi.ScopeAutosaveSettings settings;
        public static final int CONSTRUCTOR = 6846656;

        public SetAutosaveSettings() {
        }

        public SetAutosaveSettings(TdApi.AutosaveSettingsScope var1, TdApi.ScopeAutosaveSettings var2) {
            this.scope = var1;
            this.settings = var2;
        }

        public int getConstructor() {
            return 6846656;
        }
    }

    public static class SetAutoDownloadSettings extends TdApi.Function<TdApi.Ok> {
        public TdApi.AutoDownloadSettings settings;
        public TdApi.NetworkType type;
        public static final int CONSTRUCTOR = -353671948;

        public SetAutoDownloadSettings() {
        }

        public SetAutoDownloadSettings(TdApi.AutoDownloadSettings var1, TdApi.NetworkType var2) {
            this.settings = var1;
            this.type = var2;
        }

        public int getConstructor() {
            return -353671948;
        }
    }

    public static class SetAuthenticationPhoneNumber extends TdApi.Function<TdApi.Ok> {
        public String phoneNumber;
        public TdApi.PhoneNumberAuthenticationSettings settings;
        public static final int CONSTRUCTOR = 868276259;

        public SetAuthenticationPhoneNumber() {
        }

        public SetAuthenticationPhoneNumber(String var1, TdApi.PhoneNumberAuthenticationSettings var2) {
            this.phoneNumber = var1;
            this.settings = var2;
        }

        public int getConstructor() {
            return 868276259;
        }
    }

    public static class SetAuthenticationEmailAddress extends TdApi.Function<TdApi.Ok> {
        public String emailAddress;
        public static final int CONSTRUCTOR = 1773323522;

        public SetAuthenticationEmailAddress() {
        }

        public SetAuthenticationEmailAddress(String var1) {
            this.emailAddress = var1;
        }

        public int getConstructor() {
            return 1773323522;
        }
    }

    public static class SetArchiveChatListSettings extends TdApi.Function<TdApi.Ok> {
        public TdApi.ArchiveChatListSettings settings;
        public static final int CONSTRUCTOR = -884650998;

        public SetArchiveChatListSettings() {
        }

        public SetArchiveChatListSettings(TdApi.ArchiveChatListSettings var1) {
            this.settings = var1;
        }

        public int getConstructor() {
            return -884650998;
        }
    }

    public static class SetAlarm extends TdApi.Function<TdApi.Ok> {
        public double seconds;
        public static final int CONSTRUCTOR = -873497067;

        public SetAlarm() {
        }

        public SetAlarm(double var1) {
            this.seconds = var1;
        }

        public int getConstructor() {
            return -873497067;
        }
    }

    public static class SetAccountTtl extends TdApi.Function<TdApi.Ok> {
        public TdApi.AccountTtl ttl;
        public static final int CONSTRUCTOR = 701389032;

        public SetAccountTtl() {
        }

        public SetAccountTtl(TdApi.AccountTtl var1) {
            this.ttl = var1;
        }

        public int getConstructor() {
            return 701389032;
        }
    }

    public static class SendWebAppData extends TdApi.Function<TdApi.Ok> {
        public long botUserId;
        public String buttonText;
        public String data;
        public static final int CONSTRUCTOR = -1423978996;

        public SendWebAppData() {
        }

        public SendWebAppData(long var1, String var3, String var4) {
            this.botUserId = var1;
            this.buttonText = var3;
            this.data = var4;
        }

        public int getConstructor() {
            return -1423978996;
        }
    }

    public static class SendStory extends TdApi.Function<TdApi.Story> {
        public TdApi.InputStoryContent content;
        public TdApi.InputStoryAreas areas;
        public TdApi.FormattedText caption;
        public TdApi.StoryPrivacySettings privacySettings;
        public int activePeriod;
        public boolean isPinned;
        public boolean protectContent;
        public static final int CONSTRUCTOR = 1085929528;

        public SendStory() {
        }

        public SendStory(TdApi.InputStoryContent var1, TdApi.InputStoryAreas var2, TdApi.FormattedText var3, TdApi.StoryPrivacySettings var4, int var5, boolean var6, boolean var7) {
            this.content = var1;
            this.areas = var2;
            this.caption = var3;
            this.privacySettings = var4;
            this.activePeriod = var5;
            this.isPinned = var6;
            this.protectContent = var7;
        }

        public int getConstructor() {
            return 1085929528;
        }
    }

    public static class SendPhoneNumberVerificationCode extends TdApi.Function<TdApi.AuthenticationCodeInfo> {
        public String phoneNumber;
        public TdApi.PhoneNumberAuthenticationSettings settings;
        public static final int CONSTRUCTOR = 2081689035;

        public SendPhoneNumberVerificationCode() {
        }

        public SendPhoneNumberVerificationCode(String var1, TdApi.PhoneNumberAuthenticationSettings var2) {
            this.phoneNumber = var1;
            this.settings = var2;
        }

        public int getConstructor() {
            return 2081689035;
        }
    }

    public static class SendPhoneNumberConfirmationCode extends TdApi.Function<TdApi.AuthenticationCodeInfo> {
        public String hash;
        public String phoneNumber;
        public TdApi.PhoneNumberAuthenticationSettings settings;
        public static final int CONSTRUCTOR = -1901171495;

        public SendPhoneNumberConfirmationCode() {
        }

        public SendPhoneNumberConfirmationCode(String var1, String var2, TdApi.PhoneNumberAuthenticationSettings var3) {
            this.hash = var1;
            this.phoneNumber = var2;
            this.settings = var3;
        }

        public int getConstructor() {
            return -1901171495;
        }
    }

    public static class SendPaymentForm extends TdApi.Function<TdApi.PaymentResult> {
        public TdApi.InputInvoice inputInvoice;
        public long paymentFormId;
        public String orderInfoId;
        public String shippingOptionId;
        public TdApi.InputCredentials credentials;
        public long tipAmount;
        public static final int CONSTRUCTOR = -965855094;

        public SendPaymentForm() {
        }

        public SendPaymentForm(TdApi.InputInvoice var1, long var2, String var4, String var5, TdApi.InputCredentials var6, long var7) {
            this.inputInvoice = var1;
            this.paymentFormId = var2;
            this.orderInfoId = var4;
            this.shippingOptionId = var5;
            this.credentials = var6;
            this.tipAmount = var7;
        }

        public int getConstructor() {
            return -965855094;
        }
    }

    public static class SendPassportAuthorizationForm extends TdApi.Function<TdApi.Ok> {
        public int authorizationFormId;
        public TdApi.PassportElementType[] types;
        public static final int CONSTRUCTOR = 652160701;

        public SendPassportAuthorizationForm() {
        }

        public SendPassportAuthorizationForm(int var1, TdApi.PassportElementType[] var2) {
            this.authorizationFormId = var1;
            this.types = var2;
        }

        public int getConstructor() {
            return 652160701;
        }
    }

    public static class SendMessageAlbum extends TdApi.Function<TdApi.Messages> {
        public long chatId;
        public long messageThreadId;
        public TdApi.MessageReplyTo replyTo;
        public TdApi.MessageSendOptions options;
        public TdApi.InputMessageContent[] inputMessageContents;
        public boolean onlyPreview;
        public static final int CONSTRUCTOR = 445859416;

        public SendMessageAlbum() {
        }

        public SendMessageAlbum(long var1, long var3, TdApi.MessageReplyTo var5, TdApi.MessageSendOptions var6, TdApi.InputMessageContent[] var7, boolean var8) {
            this.chatId = var1;
            this.messageThreadId = var3;
            this.replyTo = var5;
            this.options = var6;
            this.inputMessageContents = var7;
            this.onlyPreview = var8;
        }

        public int getConstructor() {
            return 445859416;
        }
    }

    public static class SendMessage extends TdApi.Function<TdApi.Message> {
        public long chatId;
        public long messageThreadId;
        public TdApi.MessageReplyTo replyTo;
        public TdApi.MessageSendOptions options;
        public TdApi.ReplyMarkup replyMarkup;
        public TdApi.InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 387580015;

        public SendMessage() {
        }

        public SendMessage(
                long var1,
                long var3,
                TdApi.MessageReplyTo var5,
                TdApi.MessageSendOptions var6,
                TdApi.ReplyMarkup var7,
                TdApi.InputMessageContent var8) {
            this.chatId = var1;
            this.messageThreadId = var3;
            this.replyTo = var5;
            this.options = var6;
            this.replyMarkup = var7;
            this.inputMessageContent = var8;
        }

        public int getConstructor() {
            return 387580015;
        }
    }

    public static class SendInlineQueryResultMessage extends TdApi.Function<TdApi.Message> {
        public long chatId;
        public long messageThreadId;
        public TdApi.MessageReplyTo replyTo;
        public TdApi.MessageSendOptions options;
        public long queryId;
        public String resultId;
        public boolean hideViaBot;
        public static final int CONSTRUCTOR = -1656223767;

        public SendInlineQueryResultMessage() {
        }

        public SendInlineQueryResultMessage(long var1, long var3, TdApi.MessageReplyTo var5, TdApi.MessageSendOptions var6, long var7, String var9, boolean var10) {
            this.chatId = var1;
            this.messageThreadId = var3;
            this.replyTo = var5;
            this.options = var6;
            this.queryId = var7;
            this.resultId = var9;
            this.hideViaBot = var10;
        }

        public int getConstructor() {
            return -1656223767;
        }
    }

    public static class SendEmailAddressVerificationCode extends TdApi.Function<TdApi.EmailAddressAuthenticationCodeInfo> {
        public String emailAddress;
        public static final int CONSTRUCTOR = -221621379;

        public SendEmailAddressVerificationCode() {
        }

        public SendEmailAddressVerificationCode(String var1) {
            this.emailAddress = var1;
        }

        public int getConstructor() {
            return -221621379;
        }
    }

    public static class SendCustomRequest extends TdApi.Function<TdApi.CustomRequestResult> {
        public String method;
        public String parameters;
        public static final int CONSTRUCTOR = 285045153;

        public SendCustomRequest() {
        }

        public SendCustomRequest(String var1, String var2) {
            this.method = var1;
            this.parameters = var2;
        }

        public int getConstructor() {
            return 285045153;
        }
    }

    public static class SendChatAction extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageThreadId;
        public TdApi.ChatAction action;
        public static final int CONSTRUCTOR = 2096947540;

        public SendChatAction() {
        }

        public SendChatAction(long var1, long var3, TdApi.ChatAction var5) {
            this.chatId = var1;
            this.messageThreadId = var3;
            this.action = var5;
        }

        public int getConstructor() {
            return 2096947540;
        }
    }

    public static class SendCallSignalingData extends TdApi.Function<TdApi.Ok> {
        public int callId;
        public byte[] data;
        public static final int CONSTRUCTOR = 1412280732;

        public SendCallSignalingData() {
        }

        public SendCallSignalingData(int var1, byte[] var2) {
            this.callId = var1;
            this.data = var2;
        }

        public int getConstructor() {
            return 1412280732;
        }
    }

    public static class SendCallRating extends TdApi.Function<TdApi.Ok> {
        public int callId;
        public int rating;
        public String comment;
        public TdApi.CallProblem[] problems;
        public static final int CONSTRUCTOR = -1402719502;

        public SendCallRating() {
        }

        public SendCallRating(int var1, int var2, String var3, TdApi.CallProblem[] var4) {
            this.callId = var1;
            this.rating = var2;
            this.comment = var3;
            this.problems = var4;
        }

        public int getConstructor() {
            return -1402719502;
        }
    }

    public static class SendCallLog extends TdApi.Function<TdApi.Ok> {
        public int callId;
        public TdApi.InputFile logFile;
        public static final int CONSTRUCTOR = 1057638353;

        public SendCallLog() {
        }

        public SendCallLog(int var1, TdApi.InputFile var2) {
            this.callId = var1;
            this.logFile = var2;
        }

        public int getConstructor() {
            return 1057638353;
        }
    }

    public static class SendCallDebugInformation extends TdApi.Function<TdApi.Ok> {
        public int callId;
        public String debugInformation;
        public static final int CONSTRUCTOR = 2019243839;

        public SendCallDebugInformation() {
        }

        public SendCallDebugInformation(int var1, String var2) {
            this.callId = var1;
            this.debugInformation = var2;
        }

        public int getConstructor() {
            return 2019243839;
        }
    }

    public static class SendBotStartMessage extends TdApi.Function<TdApi.Message> {
        public long botUserId;
        public long chatId;
        public String parameter;
        public static final int CONSTRUCTOR = -1435877650;

        public SendBotStartMessage() {
        }

        public SendBotStartMessage(long var1, long var3, String var5) {
            this.botUserId = var1;
            this.chatId = var3;
            this.parameter = var5;
        }

        public int getConstructor() {
            return -1435877650;
        }
    }

    public static class SendAuthenticationFirebaseSms extends TdApi.Function<TdApi.Ok> {
        public String token;
        public static final int CONSTRUCTOR = 364994111;

        public SendAuthenticationFirebaseSms() {
        }

        public SendAuthenticationFirebaseSms(String var1) {
            this.token = var1;
        }

        public int getConstructor() {
            return 364994111;
        }
    }

    public static class SearchWebApp extends TdApi.Function<TdApi.FoundWebApp> {
        public long botUserId;
        public String webAppShortName;
        public static final int CONSTRUCTOR = -1241740747;

        public SearchWebApp() {
        }

        public SearchWebApp(long var1, String var3) {
            this.botUserId = var1;
            this.webAppShortName = var3;
        }

        public int getConstructor() {
            return -1241740747;
        }
    }

    public static class SearchUserByToken extends TdApi.Function<TdApi.User> {
        public String token;
        public static final int CONSTRUCTOR = -666766282;

        public SearchUserByToken() {
        }

        public SearchUserByToken(String var1) {
            this.token = var1;
        }

        public int getConstructor() {
            return -666766282;
        }
    }

    public static class SearchUserByPhoneNumber extends TdApi.Function<TdApi.User> {
        public String phoneNumber;
        public static final int CONSTRUCTOR = -1562236142;

        public SearchUserByPhoneNumber() {
        }

        public SearchUserByPhoneNumber(String var1) {
            this.phoneNumber = var1;
        }

        public int getConstructor() {
            return -1562236142;
        }
    }

    public static class SearchStickers extends TdApi.Function<TdApi.Stickers> {
        public TdApi.StickerType stickerType;
        public String emojis;
        public int limit;
        public static final int CONSTRUCTOR = -1709577973;

        public SearchStickers() {
        }

        public SearchStickers(TdApi.StickerType var1, String var2, int var3) {
            this.stickerType = var1;
            this.emojis = var2;
            this.limit = var3;
        }

        public int getConstructor() {
            return -1709577973;
        }
    }

    public static class SearchStickerSets extends TdApi.Function<TdApi.StickerSets> {
        public String query;
        public static final int CONSTRUCTOR = -1082314629;

        public SearchStickerSets() {
        }

        public SearchStickerSets(String var1) {
            this.query = var1;
        }

        public int getConstructor() {
            return -1082314629;
        }
    }

    public static class SearchStickerSet extends TdApi.Function<TdApi.StickerSet> {
        public String name;
        public static final int CONSTRUCTOR = 1157930222;

        public SearchStickerSet() {
        }

        public SearchStickerSet(String var1) {
            this.name = var1;
        }

        public int getConstructor() {
            return 1157930222;
        }
    }

    public static class SearchSecretMessages extends TdApi.Function<TdApi.FoundMessages> {
        public long chatId;
        public String query;
        public String offset;
        public int limit;
        public TdApi.SearchMessagesFilter filter;
        public static final int CONSTRUCTOR = -852865892;

        public SearchSecretMessages() {
        }

        public SearchSecretMessages(long var1, String var3, String var4, int var5, TdApi.SearchMessagesFilter var6) {
            this.chatId = var1;
            this.query = var3;
            this.offset = var4;
            this.limit = var5;
            this.filter = var6;
        }

        public int getConstructor() {
            return -852865892;
        }
    }

    public static class SearchRecentlyFoundChats extends TdApi.Function<TdApi.Chats> {
        public String query;
        public int limit;
        public static final int CONSTRUCTOR = 1647445393;

        public SearchRecentlyFoundChats() {
        }

        public SearchRecentlyFoundChats(String var1, int var2) {
            this.query = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return 1647445393;
        }
    }

    public static class SearchPublicChats extends TdApi.Function<TdApi.Chats> {
        public String query;
        public static final int CONSTRUCTOR = 970385337;

        public SearchPublicChats() {
        }

        public SearchPublicChats(String var1) {
            this.query = var1;
        }

        public int getConstructor() {
            return 970385337;
        }
    }

    public static class SearchPublicChat extends TdApi.Function<TdApi.Chat> {
        public String username;
        public static final int CONSTRUCTOR = 857135533;

        public SearchPublicChat() {
        }

        public SearchPublicChat(String var1) {
            this.username = var1;
        }

        public int getConstructor() {
            return 857135533;
        }
    }

    public static class SearchOutgoingDocumentMessages extends TdApi.Function<TdApi.FoundMessages> {
        public String query;
        public int limit;
        public static final int CONSTRUCTOR = -1071397762;

        public SearchOutgoingDocumentMessages() {
        }

        public SearchOutgoingDocumentMessages(String var1, int var2) {
            this.query = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return -1071397762;
        }
    }

    public static class SearchMessages extends TdApi.Function<TdApi.FoundMessages> {
        public TdApi.ChatList chatList;
        public String query;
        public String offset;
        public int limit;
        public TdApi.SearchMessagesFilter filter;
        public int minDate;
        public int maxDate;
        public static final int CONSTRUCTOR = 714016935;

        public SearchMessages() {
        }

        public SearchMessages(TdApi.ChatList var1, String var2, String var3, int var4, TdApi.SearchMessagesFilter var5, int var6, int var7) {
            this.chatList = var1;
            this.query = var2;
            this.offset = var3;
            this.limit = var4;
            this.filter = var5;
            this.minDate = var6;
            this.maxDate = var7;
        }

        public int getConstructor() {
            return 714016935;
        }
    }

    public static class SearchInstalledStickerSets extends TdApi.Function<TdApi.StickerSets> {
        public TdApi.StickerType stickerType;
        public String query;
        public int limit;
        public static final int CONSTRUCTOR = 2120122276;

        public SearchInstalledStickerSets() {
        }

        public SearchInstalledStickerSets(TdApi.StickerType var1, String var2, int var3) {
            this.stickerType = var1;
            this.query = var2;
            this.limit = var3;
        }

        public int getConstructor() {
            return 2120122276;
        }
    }

    public static class SearchHashtags extends TdApi.Function<TdApi.Hashtags> {
        public String prefix;
        public int limit;
        public static final int CONSTRUCTOR = 1043637617;

        public SearchHashtags() {
        }

        public SearchHashtags(String var1, int var2) {
            this.prefix = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return 1043637617;
        }
    }

    public static class SearchFileDownloads extends TdApi.Function<TdApi.FoundFileDownloads> {
        public String query;
        public boolean onlyActive;
        public boolean onlyCompleted;
        public String offset;
        public int limit;
        public static final int CONSTRUCTOR = 706611286;

        public SearchFileDownloads() {
        }

        public SearchFileDownloads(String var1, boolean var2, boolean var3, String var4, int var5) {
            this.query = var1;
            this.onlyActive = var2;
            this.onlyCompleted = var3;
            this.offset = var4;
            this.limit = var5;
        }

        public int getConstructor() {
            return 706611286;
        }
    }

    public static class SearchEmojis extends TdApi.Function<TdApi.Emojis> {
        public String text;
        public boolean exactMatch;
        public String[] inputLanguageCodes;
        public static final int CONSTRUCTOR = 398837927;

        public SearchEmojis() {
        }

        public SearchEmojis(String var1, boolean var2, String[] var3) {
            this.text = var1;
            this.exactMatch = var2;
            this.inputLanguageCodes = var3;
        }

        public int getConstructor() {
            return 398837927;
        }
    }

    public static class SearchContacts extends TdApi.Function<TdApi.Users> {
        public String query;
        public int limit;
        public static final int CONSTRUCTOR = -1794690715;

        public SearchContacts() {
        }

        public SearchContacts(String var1, int var2) {
            this.query = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return -1794690715;
        }
    }

    public static class SearchChatsOnServer extends TdApi.Function<TdApi.Chats> {
        public String query;
        public int limit;
        public static final int CONSTRUCTOR = -1158402188;

        public SearchChatsOnServer() {
        }

        public SearchChatsOnServer(String var1, int var2) {
            this.query = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return -1158402188;
        }
    }

    public static class SearchChatsNearby extends TdApi.Function<TdApi.ChatsNearby> {
        public TdApi.Location location;
        public static final int CONSTRUCTOR = -196753377;

        public SearchChatsNearby() {
        }

        public SearchChatsNearby(TdApi.Location var1) {
            this.location = var1;
        }

        public int getConstructor() {
            return -196753377;
        }
    }

    public static class SearchChats extends TdApi.Function<TdApi.Chats> {
        public String query;
        public int limit;
        public static final int CONSTRUCTOR = -1879787060;

        public SearchChats() {
        }

        public SearchChats(String var1, int var2) {
            this.query = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return -1879787060;
        }
    }

    public static class SearchChatRecentLocationMessages extends TdApi.Function<TdApi.Messages> {
        public long chatId;
        public int limit;
        public static final int CONSTRUCTOR = 950238950;

        public SearchChatRecentLocationMessages() {
        }

        public SearchChatRecentLocationMessages(long var1, int var3) {
            this.chatId = var1;
            this.limit = var3;
        }

        public int getConstructor() {
            return 950238950;
        }
    }

    public static class SearchChatMessages extends TdApi.Function<TdApi.FoundChatMessages> {
        public long chatId;
        public String query;
        public TdApi.MessageSender senderId;
        public long fromMessageId;
        public int offset;
        public int limit;
        public TdApi.SearchMessagesFilter filter;
        public long messageThreadId;
        public static final int CONSTRUCTOR = 1879195132;

        public SearchChatMessages() {
        }

        public SearchChatMessages(long var1, String var3, TdApi.MessageSender var4, long var5, int var7, int var8, TdApi.SearchMessagesFilter var9, long var10) {
            this.chatId = var1;
            this.query = var3;
            this.senderId = var4;
            this.fromMessageId = var5;
            this.offset = var7;
            this.limit = var8;
            this.filter = var9;
            this.messageThreadId = var10;
        }

        public int getConstructor() {
            return 1879195132;
        }
    }

    public static class SearchChatMembers extends TdApi.Function<TdApi.ChatMembers> {
        public long chatId;
        public String query;
        public int limit;
        public TdApi.ChatMembersFilter filter;
        public static final int CONSTRUCTOR = -445823291;

        public SearchChatMembers() {
        }

        public SearchChatMembers(long var1, String var3, int var4, TdApi.ChatMembersFilter var5) {
            this.chatId = var1;
            this.query = var3;
            this.limit = var4;
            this.filter = var5;
        }

        public int getConstructor() {
            return -445823291;
        }
    }

    public static class SearchCallMessages extends TdApi.Function<TdApi.FoundMessages> {
        public String offset;
        public int limit;
        public boolean onlyMissed;
        public static final int CONSTRUCTOR = -1942229221;

        public SearchCallMessages() {
        }

        public SearchCallMessages(String var1, int var2, boolean var3) {
            this.offset = var1;
            this.limit = var2;
            this.onlyMissed = var3;
        }

        public int getConstructor() {
            return -1942229221;
        }
    }

    public static class SearchBackground extends TdApi.Function<TdApi.Background> {
        public String name;
        public static final int CONSTRUCTOR = -2130996959;

        public SearchBackground() {
        }

        public SearchBackground(String var1) {
            this.name = var1;
        }

        public int getConstructor() {
            return -2130996959;
        }
    }

    public static class SaveApplicationLogEvent extends TdApi.Function<TdApi.Ok> {
        public String type;
        public long chatId;
        public TdApi.JsonValue data;
        public static final int CONSTRUCTOR = -811154930;

        public SaveApplicationLogEvent() {
        }

        public SaveApplicationLogEvent(String var1, long var2, TdApi.JsonValue var4) {
            this.type = var1;
            this.chatId = var2;
            this.data = var4;
        }

        public int getConstructor() {
            return -811154930;
        }
    }

    public static class RevokeGroupCallInviteLink extends TdApi.Function<TdApi.Ok> {
        public int groupCallId;
        public static final int CONSTRUCTOR = 501589140;

        public RevokeGroupCallInviteLink() {
        }

        public RevokeGroupCallInviteLink(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return 501589140;
        }
    }

    public static class RevokeChatInviteLink extends TdApi.Function<TdApi.ChatInviteLinks> {
        public long chatId;
        public String inviteLink;
        public static final int CONSTRUCTOR = -776514135;

        public RevokeChatInviteLink() {
        }

        public RevokeChatInviteLink(long var1, String var3) {
            this.chatId = var1;
            this.inviteLink = var3;
        }

        public int getConstructor() {
            return -776514135;
        }
    }

    public static class ResetPassword extends TdApi.Function<TdApi.ResetPasswordResult> {
        public static final int CONSTRUCTOR = -593589091;

        public ResetPassword() {
        }

        public int getConstructor() {
            return -593589091;
        }
    }

    public static class ResetNetworkStatistics extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = 1646452102;

        public ResetNetworkStatistics() {
        }

        public int getConstructor() {
            return 1646452102;
        }
    }

    public static class ResetBackgrounds extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = 204852088;

        public ResetBackgrounds() {
        }

        public int getConstructor() {
            return 204852088;
        }
    }

    public static class ResetAuthenticationEmailAddress extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = -415075796;

        public ResetAuthenticationEmailAddress() {
        }

        public int getConstructor() {
            return -415075796;
        }
    }

    public static class ResetAllNotificationSettings extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = -174020359;

        public ResetAllNotificationSettings() {
        }

        public int getConstructor() {
            return -174020359;
        }
    }

    public static class ResendRecoveryEmailAddressCode extends TdApi.Function<TdApi.PasswordState> {
        public static final int CONSTRUCTOR = 433483548;

        public ResendRecoveryEmailAddressCode() {
        }

        public int getConstructor() {
            return 433483548;
        }
    }

    public static class ResendPhoneNumberVerificationCode extends TdApi.Function<TdApi.AuthenticationCodeInfo> {
        public static final int CONSTRUCTOR = 1367629820;

        public ResendPhoneNumberVerificationCode() {
        }

        public int getConstructor() {
            return 1367629820;
        }
    }

    public static class ResendPhoneNumberConfirmationCode extends TdApi.Function<TdApi.AuthenticationCodeInfo> {
        public static final int CONSTRUCTOR = 2069068522;

        public ResendPhoneNumberConfirmationCode() {
        }

        public int getConstructor() {
            return 2069068522;
        }
    }

    public static class ResendMessages extends TdApi.Function<TdApi.Messages> {
        public long chatId;
        public long[] messageIds;
        public static final int CONSTRUCTOR = -940655817;

        public ResendMessages() {
        }

        public ResendMessages(long var1, long[] var3) {
            this.chatId = var1;
            this.messageIds = var3;
        }

        public int getConstructor() {
            return -940655817;
        }
    }

    public static class ResendLoginEmailAddressCode extends TdApi.Function<TdApi.EmailAddressAuthenticationCodeInfo> {
        public static final int CONSTRUCTOR = 292966933;

        public ResendLoginEmailAddressCode() {
        }

        public int getConstructor() {
            return 292966933;
        }
    }

    public static class ResendEmailAddressVerificationCode extends TdApi.Function<TdApi.EmailAddressAuthenticationCodeInfo> {
        public static final int CONSTRUCTOR = -1872416732;

        public ResendEmailAddressVerificationCode() {
        }

        public int getConstructor() {
            return -1872416732;
        }
    }

    public static class ResendChangePhoneNumberCode extends TdApi.Function<TdApi.AuthenticationCodeInfo> {
        public static final int CONSTRUCTOR = -786772060;

        public ResendChangePhoneNumberCode() {
        }

        public int getConstructor() {
            return -786772060;
        }
    }

    public static class ResendAuthenticationCode extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = -814377191;

        public ResendAuthenticationCode() {
        }

        public int getConstructor() {
            return -814377191;
        }
    }

    public static class RequestQrCodeAuthentication extends TdApi.Function<TdApi.Ok> {
        public long[] otherUserIds;
        public static final int CONSTRUCTOR = 1363496527;

        public RequestQrCodeAuthentication() {
        }

        public RequestQrCodeAuthentication(long[] var1) {
            this.otherUserIds = var1;
        }

        public int getConstructor() {
            return 1363496527;
        }
    }

    public static class RequestPasswordRecovery extends TdApi.Function<TdApi.EmailAddressAuthenticationCodeInfo> {
        public static final int CONSTRUCTOR = -13777582;

        public RequestPasswordRecovery() {
        }

        public int getConstructor() {
            return -13777582;
        }
    }

    public static class RequestAuthenticationPasswordRecovery extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = 1393896118;

        public RequestAuthenticationPasswordRecovery() {
        }

        public int getConstructor() {
            return 1393896118;
        }
    }

    public static class ReportSupergroupSpam extends TdApi.Function<TdApi.Ok> {
        public long supergroupId;
        public long[] messageIds;
        public static final int CONSTRUCTOR = -94825000;

        public ReportSupergroupSpam() {
        }

        public ReportSupergroupSpam(long var1, long[] var3) {
            this.supergroupId = var1;
            this.messageIds = var3;
        }

        public int getConstructor() {
            return -94825000;
        }
    }

    public static class ReportSupergroupAntiSpamFalsePositive extends TdApi.Function<TdApi.Ok> {
        public long supergroupId;
        public long messageId;
        public static final int CONSTRUCTOR = -516050872;

        public ReportSupergroupAntiSpamFalsePositive() {
        }

        public ReportSupergroupAntiSpamFalsePositive(long var1, long var3) {
            this.supergroupId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return -516050872;
        }
    }

    public static class ReportStory extends TdApi.Function<TdApi.Ok> {
        public long storySenderChatId;
        public int storyId;
        public TdApi.ReportReason reason;
        public String text;
        public static final int CONSTRUCTOR = -1688244069;

        public ReportStory() {
        }

        public ReportStory(long var1, int var3, TdApi.ReportReason var4, String var5) {
            this.storySenderChatId = var1;
            this.storyId = var3;
            this.reason = var4;
            this.text = var5;
        }

        public int getConstructor() {
            return -1688244069;
        }
    }

    public static class ReportMessageReactions extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageId;
        public TdApi.MessageSender senderId;
        public static final int CONSTRUCTOR = 919111719;

        public ReportMessageReactions() {
        }

        public ReportMessageReactions(long var1, long var3, TdApi.MessageSender var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.senderId = var5;
        }

        public int getConstructor() {
            return 919111719;
        }
    }

    public static class ReportChatPhoto extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public int fileId;
        public TdApi.ReportReason reason;
        public String text;
        public static final int CONSTRUCTOR = -646966648;

        public ReportChatPhoto() {
        }

        public ReportChatPhoto(long var1, int var3, TdApi.ReportReason var4, String var5) {
            this.chatId = var1;
            this.fileId = var3;
            this.reason = var4;
            this.text = var5;
        }

        public int getConstructor() {
            return -646966648;
        }
    }

    public static class ReportChat extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long[] messageIds;
        public TdApi.ReportReason reason;
        public String text;
        public static final int CONSTRUCTOR = -1071617544;

        public ReportChat() {
        }

        public ReportChat(long var1, long[] var3, TdApi.ReportReason var4, String var5) {
            this.chatId = var1;
            this.messageIds = var3;
            this.reason = var4;
            this.text = var5;
        }

        public int getConstructor() {
            return -1071617544;
        }
    }

    public static class ReplaceVideoChatRtmpUrl extends TdApi.Function<TdApi.RtmpUrl> {
        public long chatId;
        public static final int CONSTRUCTOR = 558862304;

        public ReplaceVideoChatRtmpUrl() {
        }

        public ReplaceVideoChatRtmpUrl(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 558862304;
        }
    }

    public static class ReplacePrimaryChatInviteLink extends TdApi.Function<TdApi.ChatInviteLink> {
        public long chatId;
        public static final int CONSTRUCTOR = 1067350941;

        public ReplacePrimaryChatInviteLink() {
        }

        public ReplacePrimaryChatInviteLink(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 1067350941;
        }
    }

    public static class ReorderSupergroupActiveUsernames extends TdApi.Function<TdApi.Ok> {
        public long supergroupId;
        public String[] usernames;
        public static final int CONSTRUCTOR = -1962466095;

        public ReorderSupergroupActiveUsernames() {
        }

        public ReorderSupergroupActiveUsernames(long var1, String[] var3) {
            this.supergroupId = var1;
            this.usernames = var3;
        }

        public int getConstructor() {
            return -1962466095;
        }
    }

    public static class ReorderInstalledStickerSets extends TdApi.Function<TdApi.Ok> {
        public TdApi.StickerType stickerType;
        public long[] stickerSetIds;
        public static final int CONSTRUCTOR = 1074928158;

        public ReorderInstalledStickerSets() {
        }

        public ReorderInstalledStickerSets(TdApi.StickerType var1, long[] var2) {
            this.stickerType = var1;
            this.stickerSetIds = var2;
        }

        public int getConstructor() {
            return 1074928158;
        }
    }

    public static class ReorderChatFolders extends TdApi.Function<TdApi.Ok> {
        public int[] chatFolderIds;
        public int mainChatListPosition;
        public static final int CONSTRUCTOR = 1665299546;

        public ReorderChatFolders() {
        }

        public ReorderChatFolders(int[] var1, int var2) {
            this.chatFolderIds = var1;
            this.mainChatListPosition = var2;
        }

        public int getConstructor() {
            return 1665299546;
        }
    }

    public static class ReorderBotActiveUsernames extends TdApi.Function<TdApi.Ok> {
        public long botUserId;
        public String[] usernames;
        public static final int CONSTRUCTOR = -1602301664;

        public ReorderBotActiveUsernames() {
        }

        public ReorderBotActiveUsernames(long var1, String[] var3) {
            this.botUserId = var1;
            this.usernames = var3;
        }

        public int getConstructor() {
            return -1602301664;
        }
    }

    public static class ReorderActiveUsernames extends TdApi.Function<TdApi.Ok> {
        public String[] usernames;
        public static final int CONSTRUCTOR = -455399375;

        public ReorderActiveUsernames() {
        }

        public ReorderActiveUsernames(String[] var1) {
            this.usernames = var1;
        }

        public int getConstructor() {
            return -455399375;
        }
    }

    public static class RemoveTopChat extends TdApi.Function<TdApi.Ok> {
        public TdApi.TopChatCategory category;
        public long chatId;
        public static final int CONSTRUCTOR = -1907876267;

        public RemoveTopChat() {
        }

        public RemoveTopChat(TdApi.TopChatCategory var1, long var2) {
            this.category = var1;
            this.chatId = var2;
        }

        public int getConstructor() {
            return -1907876267;
        }
    }

    public static class RemoveStickerFromSet extends TdApi.Function<TdApi.Ok> {
        public TdApi.InputFile sticker;
        public static final int CONSTRUCTOR = 1642196644;

        public RemoveStickerFromSet() {
        }

        public RemoveStickerFromSet(TdApi.InputFile var1) {
            this.sticker = var1;
        }

        public int getConstructor() {
            return 1642196644;
        }
    }

    public static class RemoveSavedNotificationSound extends TdApi.Function<TdApi.Ok> {
        public long notificationSoundId;
        public static final int CONSTRUCTOR = -480032946;

        public RemoveSavedNotificationSound() {
        }

        public RemoveSavedNotificationSound(long var1) {
            this.notificationSoundId = var1;
        }

        public int getConstructor() {
            return -480032946;
        }
    }

    public static class RemoveSavedAnimation extends TdApi.Function<TdApi.Ok> {
        public TdApi.InputFile animation;
        public static final int CONSTRUCTOR = -495605479;

        public RemoveSavedAnimation() {
        }

        public RemoveSavedAnimation(TdApi.InputFile var1) {
            this.animation = var1;
        }

        public int getConstructor() {
            return -495605479;
        }
    }

    public static class RemoveRecentlyFoundChat extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = 717340444;

        public RemoveRecentlyFoundChat() {
        }

        public RemoveRecentlyFoundChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 717340444;
        }
    }

    public static class RemoveRecentSticker extends TdApi.Function<TdApi.Ok> {
        public boolean isAttached;
        public TdApi.InputFile sticker;
        public static final int CONSTRUCTOR = 1246577677;

        public RemoveRecentSticker() {
        }

        public RemoveRecentSticker(boolean var1, TdApi.InputFile var2) {
            this.isAttached = var1;
            this.sticker = var2;
        }

        public int getConstructor() {
            return 1246577677;
        }
    }

    public static class RemoveRecentHashtag extends TdApi.Function<TdApi.Ok> {
        public String hashtag;
        public static final int CONSTRUCTOR = -1013735260;

        public RemoveRecentHashtag() {
        }

        public RemoveRecentHashtag(String var1) {
            this.hashtag = var1;
        }

        public int getConstructor() {
            return -1013735260;
        }
    }

    public static class RemoveProxy extends TdApi.Function<TdApi.Ok> {
        public int proxyId;
        public static final int CONSTRUCTOR = 1369219847;

        public RemoveProxy() {
        }

        public RemoveProxy(int var1) {
            this.proxyId = var1;
        }

        public int getConstructor() {
            return 1369219847;
        }
    }

    public static class RemoveNotificationGroup extends TdApi.Function<TdApi.Ok> {
        public int notificationGroupId;
        public int maxNotificationId;
        public static final int CONSTRUCTOR = 1713005454;

        public RemoveNotificationGroup() {
        }

        public RemoveNotificationGroup(int var1, int var2) {
            this.notificationGroupId = var1;
            this.maxNotificationId = var2;
        }

        public int getConstructor() {
            return 1713005454;
        }
    }

    public static class RemoveNotification extends TdApi.Function<TdApi.Ok> {
        public int notificationGroupId;
        public int notificationId;
        public static final int CONSTRUCTOR = 862630734;

        public RemoveNotification() {
        }

        public RemoveNotification(int var1, int var2) {
            this.notificationGroupId = var1;
            this.notificationId = var2;
        }

        public int getConstructor() {
            return 862630734;
        }
    }

    public static class RemoveMessageReaction extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageId;
        public TdApi.ReactionType reactionType;
        public static final int CONSTRUCTOR = -1756934789;

        public RemoveMessageReaction() {
        }

        public RemoveMessageReaction(long var1, long var3, TdApi.ReactionType var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.reactionType = var5;
        }

        public int getConstructor() {
            return -1756934789;
        }
    }

    public static class RemoveFileFromDownloads extends TdApi.Function<TdApi.Ok> {
        public int fileId;
        public boolean deleteFromCache;
        public static final int CONSTRUCTOR = 1460060142;

        public RemoveFileFromDownloads() {
        }

        public RemoveFileFromDownloads(int var1, boolean var2) {
            this.fileId = var1;
            this.deleteFromCache = var2;
        }

        public int getConstructor() {
            return 1460060142;
        }
    }

    public static class RemoveFavoriteSticker extends TdApi.Function<TdApi.Ok> {
        public TdApi.InputFile sticker;
        public static final int CONSTRUCTOR = 1152945264;

        public RemoveFavoriteSticker() {
        }

        public RemoveFavoriteSticker(TdApi.InputFile var1) {
            this.sticker = var1;
        }

        public int getConstructor() {
            return 1152945264;
        }
    }

    public static class RemoveContacts extends TdApi.Function<TdApi.Ok> {
        public long[] userIds;
        public static final int CONSTRUCTOR = 1943858054;

        public RemoveContacts() {
        }

        public RemoveContacts(long[] var1) {
            this.userIds = var1;
        }

        public int getConstructor() {
            return 1943858054;
        }
    }

    public static class RemoveChatActionBar extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = -1650968070;

        public RemoveChatActionBar() {
        }

        public RemoveChatActionBar(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -1650968070;
        }
    }

    public static class RemoveBackground extends TdApi.Function<TdApi.Ok> {
        public long backgroundId;
        public static final int CONSTRUCTOR = -1484545642;

        public RemoveBackground() {
        }

        public RemoveBackground(long var1) {
            this.backgroundId = var1;
        }

        public int getConstructor() {
            return -1484545642;
        }
    }

    public static class RemoveAllFilesFromDownloads extends TdApi.Function<TdApi.Ok> {
        public boolean onlyActive;
        public boolean onlyCompleted;
        public boolean deleteFromCache;
        public static final int CONSTRUCTOR = -1186433402;

        public RemoveAllFilesFromDownloads() {
        }

        public RemoveAllFilesFromDownloads(boolean var1, boolean var2, boolean var3) {
            this.onlyActive = var1;
            this.onlyCompleted = var2;
            this.deleteFromCache = var3;
        }

        public int getConstructor() {
            return -1186433402;
        }
    }

    public static class RegisterUser extends TdApi.Function<TdApi.Ok> {
        public String firstName;
        public String lastName;
        public static final int CONSTRUCTOR = -109994467;

        public RegisterUser() {
        }

        public RegisterUser(String var1, String var2) {
            this.firstName = var1;
            this.lastName = var2;
        }

        public int getConstructor() {
            return -109994467;
        }
    }

    public static class RegisterDevice extends TdApi.Function<TdApi.PushReceiverId> {
        public TdApi.DeviceToken deviceToken;
        public long[] otherUserIds;
        public static final int CONSTRUCTOR = 366088823;

        public RegisterDevice() {
        }

        public RegisterDevice(TdApi.DeviceToken var1, long[] var2) {
            this.deviceToken = var1;
            this.otherUserIds = var2;
        }

        public int getConstructor() {
            return 366088823;
        }
    }

    public static class RecoverPassword extends TdApi.Function<TdApi.PasswordState> {
        public String recoveryCode;
        public String newPassword;
        public String newHint;
        public static final int CONSTRUCTOR = -1524262541;

        public RecoverPassword() {
        }

        public RecoverPassword(String var1, String var2, String var3) {
            this.recoveryCode = var1;
            this.newPassword = var2;
            this.newHint = var3;
        }

        public int getConstructor() {
            return -1524262541;
        }
    }

    public static class RecoverAuthenticationPassword extends TdApi.Function<TdApi.Ok> {
        public String recoveryCode;
        public String newPassword;
        public String newHint;
        public static final int CONSTRUCTOR = -131001053;

        public RecoverAuthenticationPassword() {
        }

        public RecoverAuthenticationPassword(String var1, String var2, String var3) {
            this.recoveryCode = var1;
            this.newPassword = var2;
            this.newHint = var3;
        }

        public int getConstructor() {
            return -131001053;
        }
    }

    public static class RecognizeSpeech extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = 1741947577;

        public RecognizeSpeech() {
        }

        public RecognizeSpeech(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return 1741947577;
        }
    }

    public static class ReadFilePart extends TdApi.Function<TdApi.FilePart> {
        public int fileId;
        public long offset;
        public long count;
        public static final int CONSTRUCTOR = 906798861;

        public ReadFilePart() {
        }

        public ReadFilePart(int var1, long var2, long var4) {
            this.fileId = var1;
            this.offset = var2;
            this.count = var4;
        }

        public int getConstructor() {
            return 906798861;
        }
    }

    public static class ReadChatList extends TdApi.Function<TdApi.Ok> {
        public TdApi.ChatList chatList;
        public static final int CONSTRUCTOR = -1117480790;

        public ReadChatList() {
        }

        public ReadChatList(TdApi.ChatList var1) {
            this.chatList = var1;
        }

        public int getConstructor() {
            return -1117480790;
        }
    }

    public static class ReadAllMessageThreadReactions extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageThreadId;
        public static final int CONSTRUCTOR = -792975554;

        public ReadAllMessageThreadReactions() {
        }

        public ReadAllMessageThreadReactions(long var1, long var3) {
            this.chatId = var1;
            this.messageThreadId = var3;
        }

        public int getConstructor() {
            return -792975554;
        }
    }

    public static class ReadAllMessageThreadMentions extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageThreadId;
        public static final int CONSTRUCTOR = 1323136341;

        public ReadAllMessageThreadMentions() {
        }

        public ReadAllMessageThreadMentions(long var1, long var3) {
            this.chatId = var1;
            this.messageThreadId = var3;
        }

        public int getConstructor() {
            return 1323136341;
        }
    }

    public static class ReadAllChatReactions extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = 1421973357;

        public ReadAllChatReactions() {
        }

        public ReadAllChatReactions(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 1421973357;
        }
    }

    public static class ReadAllChatMentions extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = 1357558453;

        public ReadAllChatMentions() {
        }

        public ReadAllChatMentions(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 1357558453;
        }
    }

    public static class RateSpeechRecognition extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageId;
        public boolean isGood;
        public static final int CONSTRUCTOR = -287521867;

        public RateSpeechRecognition() {
        }

        public RateSpeechRecognition(long var1, long var3, boolean var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.isGood = var5;
        }

        public int getConstructor() {
            return -287521867;
        }
    }

    public static class ProcessPushNotification extends TdApi.Function<TdApi.Ok> {
        public String payload;
        public static final int CONSTRUCTOR = 786679952;

        public ProcessPushNotification() {
        }

        public ProcessPushNotification(String var1) {
            this.payload = var1;
        }

        public int getConstructor() {
            return 786679952;
        }
    }

    public static class ProcessChatJoinRequests extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public String inviteLink;
        public boolean approve;
        public static final int CONSTRUCTOR = 1048722894;

        public ProcessChatJoinRequests() {
        }

        public ProcessChatJoinRequests(long var1, String var3, boolean var4) {
            this.chatId = var1;
            this.inviteLink = var3;
            this.approve = var4;
        }

        public int getConstructor() {
            return 1048722894;
        }
    }

    public static class ProcessChatJoinRequest extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long userId;
        public boolean approve;
        public static final int CONSTRUCTOR = 1004876963;

        public ProcessChatJoinRequest() {
        }

        public ProcessChatJoinRequest(long var1, long var3, boolean var5) {
            this.chatId = var1;
            this.userId = var3;
            this.approve = var5;
        }

        public int getConstructor() {
            return 1004876963;
        }
    }

    public static class ProcessChatFolderNewChats extends TdApi.Function<TdApi.Ok> {
        public int chatFolderId;
        public long[] addedChatIds;
        public static final int CONSTRUCTOR = 1498280672;

        public ProcessChatFolderNewChats() {
        }

        public ProcessChatFolderNewChats(int var1, long[] var2) {
            this.chatFolderId = var1;
            this.addedChatIds = var2;
        }

        public int getConstructor() {
            return 1498280672;
        }
    }

    public static class PreliminaryUploadFile extends TdApi.Function<TdApi.File> {
        public TdApi.InputFile file;
        public TdApi.FileType fileType;
        public int priority;
        public static final int CONSTRUCTOR = 1894239129;

        public PreliminaryUploadFile() {
        }

        public PreliminaryUploadFile(TdApi.InputFile var1, TdApi.FileType var2, int var3) {
            this.file = var1;
            this.fileType = var2;
            this.priority = var3;
        }

        public int getConstructor() {
            return 1894239129;
        }
    }

    public static class PingProxy extends TdApi.Function<TdApi.Seconds> {
        public int proxyId;
        public static final int CONSTRUCTOR = -979681103;

        public PingProxy() {
        }

        public PingProxy(int var1) {
            this.proxyId = var1;
        }

        public int getConstructor() {
            return -979681103;
        }
    }

    public static class PinChatMessage extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageId;
        public boolean disableNotification;
        public boolean onlyForSelf;
        public static final int CONSTRUCTOR = 2034719663;

        public PinChatMessage() {
        }

        public PinChatMessage(long var1, long var3, boolean var5, boolean var6) {
            this.chatId = var1;
            this.messageId = var3;
            this.disableNotification = var5;
            this.onlyForSelf = var6;
        }

        public int getConstructor() {
            return 2034719663;
        }
    }

    public static class ParseTextEntities extends TdApi.Function<TdApi.FormattedText> {
        public String text;
        public TdApi.TextParseMode parseMode;
        public static final int CONSTRUCTOR = -1709194593;

        public ParseTextEntities() {
        }

        public ParseTextEntities(String var1, TdApi.TextParseMode var2) {
            this.text = var1;
            this.parseMode = var2;
        }

        public int getConstructor() {
            return -1709194593;
        }
    }

    public static class ParseMarkdown extends TdApi.Function<TdApi.FormattedText> {
        public TdApi.FormattedText text;
        public static final int CONSTRUCTOR = 756366063;

        public ParseMarkdown() {
        }

        public ParseMarkdown(TdApi.FormattedText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return 756366063;
        }
    }

    public static class OptimizeStorage extends TdApi.Function<TdApi.StorageStatistics> {
        public long size;
        public int ttl;
        public int count;
        public int immunityDelay;
        public TdApi.FileType[] fileTypes;
        public long[] chatIds;
        public long[] excludeChatIds;
        public boolean returnDeletedFileStatistics;
        public int chatLimit;
        public static final int CONSTRUCTOR = 853186759;

        public OptimizeStorage() {
        }

        public OptimizeStorage(long var1, int var3, int var4, int var5, TdApi.FileType[] var6, long[] var7, long[] var8, boolean var9, int var10) {
            this.size = var1;
            this.ttl = var3;
            this.count = var4;
            this.immunityDelay = var5;
            this.fileTypes = var6;
            this.chatIds = var7;
            this.excludeChatIds = var8;
            this.returnDeletedFileStatistics = var9;
            this.chatLimit = var10;
        }

        public int getConstructor() {
            return 853186759;
        }
    }

    public static class OpenWebApp extends TdApi.Function<TdApi.WebAppInfo> {
        public long chatId;
        public long botUserId;
        public String url;
        public TdApi.ThemeParameters theme;
        public String applicationName;
        public long messageThreadId;
        public TdApi.MessageReplyTo replyTo;
        public static final int CONSTRUCTOR = 3826202;

        public OpenWebApp() {
        }

        public OpenWebApp(long var1, long var3, String var5, TdApi.ThemeParameters var6, String var7, long var8, TdApi.MessageReplyTo var10) {
            this.chatId = var1;
            this.botUserId = var3;
            this.url = var5;
            this.theme = var6;
            this.applicationName = var7;
            this.messageThreadId = var8;
            this.replyTo = var10;
        }

        public int getConstructor() {
            return 3826202;
        }
    }

    public static class OpenStory extends TdApi.Function<TdApi.Ok> {
        public long storySenderChatId;
        public int storyId;
        public static final int CONSTRUCTOR = -824542083;

        public OpenStory() {
        }

        public OpenStory(long var1, int var3) {
            this.storySenderChatId = var1;
            this.storyId = var3;
        }

        public int getConstructor() {
            return -824542083;
        }
    }

    public static class OpenMessageContent extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = -739088005;

        public OpenMessageContent() {
        }

        public OpenMessageContent(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return -739088005;
        }
    }

    public static class OpenChat extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = -323371509;

        public OpenChat() {
        }

        public OpenChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -323371509;
        }
    }

    public static class LogOut extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = -1581923301;

        public LogOut() {
        }

        public int getConstructor() {
            return -1581923301;
        }
    }

    public static class LoadGroupCallParticipants extends TdApi.Function<TdApi.Ok> {
        public int groupCallId;
        public int limit;
        public static final int CONSTRUCTOR = 938720974;

        public LoadGroupCallParticipants() {
        }

        public LoadGroupCallParticipants(int var1, int var2) {
            this.groupCallId = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return 938720974;
        }
    }

    public static class LoadChats extends TdApi.Function<TdApi.Ok> {
        public TdApi.ChatList chatList;
        public int limit;
        public static final int CONSTRUCTOR = -1885635205;

        public LoadChats() {
        }

        public LoadChats(TdApi.ChatList var1, int var2) {
            this.chatList = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return -1885635205;
        }
    }

    public static class LoadActiveStories extends TdApi.Function<TdApi.Ok> {
        public TdApi.StoryList storyList;
        public static final int CONSTRUCTOR = 2106390328;

        public LoadActiveStories() {
        }

        public LoadActiveStories(TdApi.StoryList var1) {
            this.storyList = var1;
        }

        public int getConstructor() {
            return 2106390328;
        }
    }

    public static class LeaveGroupCall extends TdApi.Function<TdApi.Ok> {
        public int groupCallId;
        public static final int CONSTRUCTOR = 980152233;

        public LeaveGroupCall() {
        }

        public LeaveGroupCall(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return 980152233;
        }
    }

    public static class LeaveChat extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = -1825080735;

        public LeaveChat() {
        }

        public LeaveChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -1825080735;
        }
    }

    public static class JoinGroupCall extends TdApi.Function<TdApi.Text> {
        public int groupCallId;
        public TdApi.MessageSender participantId;
        public int audioSourceId;
        public String payload;
        public boolean isMuted;
        public boolean isMyVideoEnabled;
        public String inviteHash;
        public static final int CONSTRUCTOR = -1043773467;

        public JoinGroupCall() {
        }

        public JoinGroupCall(int var1, TdApi.MessageSender var2, int var3, String var4, boolean var5, boolean var6, String var7) {
            this.groupCallId = var1;
            this.participantId = var2;
            this.audioSourceId = var3;
            this.payload = var4;
            this.isMuted = var5;
            this.isMyVideoEnabled = var6;
            this.inviteHash = var7;
        }

        public int getConstructor() {
            return -1043773467;
        }
    }

    public static class JoinChatByInviteLink extends TdApi.Function<TdApi.Chat> {
        public String inviteLink;
        public static final int CONSTRUCTOR = -1049973882;

        public JoinChatByInviteLink() {
        }

        public JoinChatByInviteLink(String var1) {
            this.inviteLink = var1;
        }

        public int getConstructor() {
            return -1049973882;
        }
    }

    public static class JoinChat extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = 326769313;

        public JoinChat() {
        }

        public JoinChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 326769313;
        }
    }

    public static class InviteGroupCallParticipants extends TdApi.Function<TdApi.Ok> {
        public int groupCallId;
        public long[] userIds;
        public static final int CONSTRUCTOR = 1867097679;

        public InviteGroupCallParticipants() {
        }

        public InviteGroupCallParticipants(int var1, long[] var2) {
            this.groupCallId = var1;
            this.userIds = var2;
        }

        public int getConstructor() {
            return 1867097679;
        }
    }

    public static class ImportMessages extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public TdApi.InputFile messageFile;
        public TdApi.InputFile[] attachedFiles;
        public static final int CONSTRUCTOR = -1864116784;

        public ImportMessages() {
        }

        public ImportMessages(long var1, TdApi.InputFile var3, TdApi.InputFile[] var4) {
            this.chatId = var1;
            this.messageFile = var3;
            this.attachedFiles = var4;
        }

        public int getConstructor() {
            return -1864116784;
        }
    }

    public static class ImportContacts extends TdApi.Function<TdApi.ImportedContacts> {
        public TdApi.Contact[] contacts;
        public static final int CONSTRUCTOR = -215132767;

        public ImportContacts() {
        }

        public ImportContacts(TdApi.Contact[] var1) {
            this.contacts = var1;
        }

        public int getConstructor() {
            return -215132767;
        }
    }

    public static class HideSuggestedAction extends TdApi.Function<TdApi.Ok> {
        public TdApi.SuggestedAction action;
        public static final int CONSTRUCTOR = -1561384065;

        public HideSuggestedAction() {
        }

        public HideSuggestedAction(TdApi.SuggestedAction var1) {
            this.action = var1;
        }

        public int getConstructor() {
            return -1561384065;
        }
    }

    public static class GetWebPagePreview extends TdApi.Function<TdApi.WebPage> {
        public TdApi.FormattedText text;
        public static final int CONSTRUCTOR = 573441580;

        public GetWebPagePreview() {
        }

        public GetWebPagePreview(TdApi.FormattedText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return 573441580;
        }
    }

    public static class GetWebPageInstantView extends TdApi.Function<TdApi.WebPageInstantView> {
        public String url;
        public boolean forceFull;
        public static final int CONSTRUCTOR = -1962649975;

        public GetWebPageInstantView() {
        }

        public GetWebPageInstantView(String var1, boolean var2) {
            this.url = var1;
            this.forceFull = var2;
        }

        public int getConstructor() {
            return -1962649975;
        }
    }

    public static class GetWebAppUrl extends TdApi.Function<TdApi.HttpUrl> {
        public long botUserId;
        public String url;
        public TdApi.ThemeParameters theme;
        public String applicationName;
        public static final int CONSTRUCTOR = 1690578110;

        public GetWebAppUrl() {
        }

        public GetWebAppUrl(long var1, String var3, TdApi.ThemeParameters var4, String var5) {
            this.botUserId = var1;
            this.url = var3;
            this.theme = var4;
            this.applicationName = var5;
        }

        public int getConstructor() {
            return 1690578110;
        }
    }

    public static class GetWebAppLinkUrl extends TdApi.Function<TdApi.HttpUrl> {
        public long chatId;
        public long botUserId;
        public String webAppShortName;
        public String startParameter;
        public TdApi.ThemeParameters theme;
        public String applicationName;
        public boolean allowWriteAccess;
        public static final int CONSTRUCTOR = 1326379980;

        public GetWebAppLinkUrl() {
        }

        public GetWebAppLinkUrl(long var1, long var3, String var5, String var6, TdApi.ThemeParameters var7, String var8, boolean var9) {
            this.chatId = var1;
            this.botUserId = var3;
            this.webAppShortName = var5;
            this.startParameter = var6;
            this.theme = var7;
            this.applicationName = var8;
            this.allowWriteAccess = var9;
        }

        public int getConstructor() {
            return 1326379980;
        }
    }

    public static class GetVideoChatRtmpUrl extends TdApi.Function<TdApi.RtmpUrl> {
        public long chatId;
        public static final int CONSTRUCTOR = 1210784543;

        public GetVideoChatRtmpUrl() {
        }

        public GetVideoChatRtmpUrl(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 1210784543;
        }
    }

    public static class GetVideoChatAvailableParticipants extends TdApi.Function<TdApi.MessageSenders> {
        public long chatId;
        public static final int CONSTRUCTOR = -1000496379;

        public GetVideoChatAvailableParticipants() {
        }

        public GetVideoChatAvailableParticipants(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -1000496379;
        }
    }

    public static class GetUserSupportInfo extends TdApi.Function<TdApi.UserSupportInfo> {
        public long userId;
        public static final int CONSTRUCTOR = 1957008133;

        public GetUserSupportInfo() {
        }

        public GetUserSupportInfo(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return 1957008133;
        }
    }

    public static class GetUserProfilePhotos extends TdApi.Function<TdApi.ChatPhotos> {
        public long userId;
        public int offset;
        public int limit;
        public static final int CONSTRUCTOR = -908132798;

        public GetUserProfilePhotos() {
        }

        public GetUserProfilePhotos(long var1, int var3, int var4) {
            this.userId = var1;
            this.offset = var3;
            this.limit = var4;
        }

        public int getConstructor() {
            return -908132798;
        }
    }

    public static class GetUserPrivacySettingRules extends TdApi.Function<TdApi.UserPrivacySettingRules> {
        public TdApi.UserPrivacySetting setting;
        public static final int CONSTRUCTOR = -2077223311;

        public GetUserPrivacySettingRules() {
        }

        public GetUserPrivacySettingRules(TdApi.UserPrivacySetting var1) {
            this.setting = var1;
        }

        public int getConstructor() {
            return -2077223311;
        }
    }

    public static class GetUserLink extends TdApi.Function<TdApi.UserLink> {
        public static final int CONSTRUCTOR = 1226839270;

        public GetUserLink() {
        }

        public int getConstructor() {
            return 1226839270;
        }
    }

    public static class GetUserFullInfo extends TdApi.Function<TdApi.UserFullInfo> {
        public long userId;
        public static final int CONSTRUCTOR = -776823720;

        public GetUserFullInfo() {
        }

        public GetUserFullInfo(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return -776823720;
        }
    }

    public static class GetUser extends TdApi.Function<TdApi.User> {
        public long userId;
        public static final int CONSTRUCTOR = 1117363211;

        public GetUser() {
        }

        public GetUser(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return 1117363211;
        }
    }

    public static class GetTrendingStickerSets extends TdApi.Function<TdApi.TrendingStickerSets> {
        public TdApi.StickerType stickerType;
        public int offset;
        public int limit;
        public static final int CONSTRUCTOR = -531085986;

        public GetTrendingStickerSets() {
        }

        public GetTrendingStickerSets(TdApi.StickerType var1, int var2, int var3) {
            this.stickerType = var1;
            this.offset = var2;
            this.limit = var3;
        }

        public int getConstructor() {
            return -531085986;
        }
    }

    public static class GetTopChats extends TdApi.Function<TdApi.Chats> {
        public TdApi.TopChatCategory category;
        public int limit;
        public static final int CONSTRUCTOR = -388410847;

        public GetTopChats() {
        }

        public GetTopChats(TdApi.TopChatCategory var1, int var2) {
            this.category = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return -388410847;
        }
    }

    public static class GetThemedEmojiStatuses extends TdApi.Function<TdApi.EmojiStatuses> {
        public static final int CONSTRUCTOR = 1791346882;

        public GetThemedEmojiStatuses() {
        }

        public int getConstructor() {
            return 1791346882;
        }
    }

    public static class GetThemeParametersJsonString extends TdApi.Function<TdApi.Text> {
        public TdApi.ThemeParameters theme;
        public static final int CONSTRUCTOR = -1850145288;

        public GetThemeParametersJsonString() {
        }

        public GetThemeParametersJsonString(TdApi.ThemeParameters var1) {
            this.theme = var1;
        }

        public int getConstructor() {
            return -1850145288;
        }
    }

    public static class GetTextEntities extends TdApi.Function<TdApi.TextEntities> {
        public String text;
        public static final int CONSTRUCTOR = -341490693;

        public GetTextEntities() {
        }

        public GetTextEntities(String var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return -341490693;
        }
    }

    public static class GetTemporaryPasswordState extends TdApi.Function<TdApi.TemporaryPasswordState> {
        public static final int CONSTRUCTOR = -12670830;

        public GetTemporaryPasswordState() {
        }

        public int getConstructor() {
            return -12670830;
        }
    }

    public static class GetSupportUser extends TdApi.Function<TdApi.User> {
        public static final int CONSTRUCTOR = -1733497700;

        public GetSupportUser() {
        }

        public int getConstructor() {
            return -1733497700;
        }
    }

    public static class GetSupportName extends TdApi.Function<TdApi.Text> {
        public static final int CONSTRUCTOR = 1302205794;

        public GetSupportName() {
        }

        public int getConstructor() {
            return 1302205794;
        }
    }

    public static class GetSupergroupMembers extends TdApi.Function<TdApi.ChatMembers> {
        public long supergroupId;
        public TdApi.SupergroupMembersFilter filter;
        public int offset;
        public int limit;
        public static final int CONSTRUCTOR = -570940984;

        public GetSupergroupMembers() {
        }

        public GetSupergroupMembers(long var1, TdApi.SupergroupMembersFilter var3, int var4, int var5) {
            this.supergroupId = var1;
            this.filter = var3;
            this.offset = var4;
            this.limit = var5;
        }

        public int getConstructor() {
            return -570940984;
        }
    }

    public static class GetSupergroupFullInfo extends TdApi.Function<TdApi.SupergroupFullInfo> {
        public long supergroupId;
        public static final int CONSTRUCTOR = 1099776056;

        public GetSupergroupFullInfo() {
        }

        public GetSupergroupFullInfo(long var1) {
            this.supergroupId = var1;
        }

        public int getConstructor() {
            return 1099776056;
        }
    }

    public static class GetSupergroup extends TdApi.Function<TdApi.Supergroup> {
        public long supergroupId;
        public static final int CONSTRUCTOR = 989663458;

        public GetSupergroup() {
        }

        public GetSupergroup(long var1) {
            this.supergroupId = var1;
        }

        public int getConstructor() {
            return 989663458;
        }
    }

    public static class GetSuitableDiscussionChats extends TdApi.Function<TdApi.Chats> {
        public static final int CONSTRUCTOR = 49044982;

        public GetSuitableDiscussionChats() {
        }

        public int getConstructor() {
            return 49044982;
        }
    }

    public static class GetSuggestedStickerSetName extends TdApi.Function<TdApi.Text> {
        public String title;
        public static final int CONSTRUCTOR = -1340995520;

        public GetSuggestedStickerSetName() {
        }

        public GetSuggestedStickerSetName(String var1) {
            this.title = var1;
        }

        public int getConstructor() {
            return -1340995520;
        }
    }

    public static class GetSuggestedFileName extends TdApi.Function<TdApi.Text> {
        public int fileId;
        public String directory;
        public static final int CONSTRUCTOR = -2049399674;

        public GetSuggestedFileName() {
        }

        public GetSuggestedFileName(int var1, String var2) {
            this.fileId = var1;
            this.directory = var2;
        }

        public int getConstructor() {
            return -2049399674;
        }
    }

    public static class GetStoryViewers extends TdApi.Function<TdApi.StoryViewers> {
        public int storyId;
        public String query;
        public boolean onlyContacts;
        public boolean preferWithReaction;
        public String offset;
        public int limit;
        public static final int CONSTRUCTOR = 1088392634;

        public GetStoryViewers() {
        }

        public GetStoryViewers(int var1, String var2, boolean var3, boolean var4, String var5, int var6) {
            this.storyId = var1;
            this.query = var2;
            this.onlyContacts = var3;
            this.preferWithReaction = var4;
            this.offset = var5;
            this.limit = var6;
        }

        public int getConstructor() {
            return 1088392634;
        }
    }

    public static class GetStoryNotificationSettingsExceptions extends TdApi.Function<TdApi.Chats> {
        public static final int CONSTRUCTOR = 627715760;

        public GetStoryNotificationSettingsExceptions() {
        }

        public int getConstructor() {
            return 627715760;
        }
    }

    public static class GetStoryAvailableReactions extends TdApi.Function<TdApi.AvailableReactions> {
        public int rowSize;
        public static final int CONSTRUCTOR = 595938619;

        public GetStoryAvailableReactions() {
        }

        public GetStoryAvailableReactions(int var1) {
            this.rowSize = var1;
        }

        public int getConstructor() {
            return 595938619;
        }
    }

    public static class GetStory extends TdApi.Function<TdApi.Story> {
        public long storySenderChatId;
        public int storyId;
        public boolean onlyLocal;
        public static final int CONSTRUCTOR = 1903893624;

        public GetStory() {
        }

        public GetStory(long var1, int var3, boolean var4) {
            this.storySenderChatId = var1;
            this.storyId = var3;
            this.onlyLocal = var4;
        }

        public int getConstructor() {
            return 1903893624;
        }
    }

    public static class GetStorageStatisticsFast extends TdApi.Function<TdApi.StorageStatisticsFast> {
        public static final int CONSTRUCTOR = 61368066;

        public GetStorageStatisticsFast() {
        }

        public int getConstructor() {
            return 61368066;
        }
    }

    public static class GetStorageStatistics extends TdApi.Function<TdApi.StorageStatistics> {
        public int chatLimit;
        public static final int CONSTRUCTOR = -853193929;

        public GetStorageStatistics() {
        }

        public GetStorageStatistics(int var1) {
            this.chatLimit = var1;
        }

        public int getConstructor() {
            return -853193929;
        }
    }

    public static class GetStickers extends TdApi.Function<TdApi.Stickers> {
        public TdApi.StickerType stickerType;
        public String query;
        public int limit;
        public long chatId;
        public static final int CONSTRUCTOR = 1158058819;

        public GetStickers() {
        }

        public GetStickers(TdApi.StickerType var1, String var2, int var3, long var4) {
            this.stickerType = var1;
            this.query = var2;
            this.limit = var3;
            this.chatId = var4;
        }

        public int getConstructor() {
            return 1158058819;
        }
    }

    public static class GetStickerSet extends TdApi.Function<TdApi.StickerSet> {
        public long setId;
        public static final int CONSTRUCTOR = 1052318659;

        public GetStickerSet() {
        }

        public GetStickerSet(long var1) {
            this.setId = var1;
        }

        public int getConstructor() {
            return 1052318659;
        }
    }

    public static class GetStickerEmojis extends TdApi.Function<TdApi.Emojis> {
        public TdApi.InputFile sticker;
        public static final int CONSTRUCTOR = -1895508665;

        public GetStickerEmojis() {
        }

        public GetStickerEmojis(TdApi.InputFile var1) {
            this.sticker = var1;
        }

        public int getConstructor() {
            return -1895508665;
        }
    }

    public static class GetStatisticalGraph extends TdApi.Function<TdApi.StatisticalGraph> {
        public long chatId;
        public String token;
        public long x;
        public static final int CONSTRUCTOR = 1100975515;

        public GetStatisticalGraph() {
        }

        public GetStatisticalGraph(long var1, String var3, long var4) {
            this.chatId = var1;
            this.token = var3;
            this.x = var4;
        }

        public int getConstructor() {
            return 1100975515;
        }
    }

    public static class GetSecretChat extends TdApi.Function<TdApi.SecretChat> {
        public int secretChatId;
        public static final int CONSTRUCTOR = 40599169;

        public GetSecretChat() {
        }

        public GetSecretChat(int var1) {
            this.secretChatId = var1;
        }

        public int getConstructor() {
            return 40599169;
        }
    }

    public static class GetScopeNotificationSettings extends TdApi.Function<TdApi.ScopeNotificationSettings> {
        public TdApi.NotificationSettingsScope scope;
        public static final int CONSTRUCTOR = -995613361;

        public GetScopeNotificationSettings() {
        }

        public GetScopeNotificationSettings(TdApi.NotificationSettingsScope var1) {
            this.scope = var1;
        }

        public int getConstructor() {
            return -995613361;
        }
    }

    public static class GetSavedOrderInfo extends TdApi.Function<TdApi.OrderInfo> {
        public static final int CONSTRUCTOR = -1152016675;

        public GetSavedOrderInfo() {
        }

        public int getConstructor() {
            return -1152016675;
        }
    }

    public static class GetSavedNotificationSounds extends TdApi.Function<TdApi.NotificationSounds> {
        public static final int CONSTRUCTOR = -1070305368;

        public GetSavedNotificationSounds() {
        }

        public int getConstructor() {
            return -1070305368;
        }
    }

    public static class GetSavedNotificationSound extends TdApi.Function<TdApi.NotificationSounds> {
        public long notificationSoundId;
        public static final int CONSTRUCTOR = 459569431;

        public GetSavedNotificationSound() {
        }

        public GetSavedNotificationSound(long var1) {
            this.notificationSoundId = var1;
        }

        public int getConstructor() {
            return 459569431;
        }
    }

    public static class GetSavedAnimations extends TdApi.Function<TdApi.Animations> {
        public static final int CONSTRUCTOR = 7051032;

        public GetSavedAnimations() {
        }

        public int getConstructor() {
            return 7051032;
        }
    }

    public static class GetRepliedMessage extends TdApi.Function<TdApi.Message> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = -641918531;

        public GetRepliedMessage() {
        }

        public GetRepliedMessage(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return -641918531;
        }
    }

    public static class GetRemoteFile extends TdApi.Function<TdApi.File> {
        public String remoteFileId;
        public TdApi.FileType fileType;
        public static final int CONSTRUCTOR = 2137204530;

        public GetRemoteFile() {
        }

        public GetRemoteFile(String var1, TdApi.FileType var2) {
            this.remoteFileId = var1;
            this.fileType = var2;
        }

        public int getConstructor() {
            return 2137204530;
        }
    }

    public static class GetRecoveryEmailAddress extends TdApi.Function<TdApi.RecoveryEmailAddress> {
        public String password;
        public static final int CONSTRUCTOR = -1594770947;

        public GetRecoveryEmailAddress() {
        }

        public GetRecoveryEmailAddress(String var1) {
            this.password = var1;
        }

        public int getConstructor() {
            return -1594770947;
        }
    }

    public static class GetRecommendedChatFolders extends TdApi.Function<TdApi.RecommendedChatFolders> {
        public static final int CONSTRUCTOR = -145540217;

        public GetRecommendedChatFolders() {
        }

        public int getConstructor() {
            return -145540217;
        }
    }

    public static class GetRecentlyVisitedTMeUrls extends TdApi.Function<TdApi.TMeUrls> {
        public String referrer;
        public static final int CONSTRUCTOR = 806754961;

        public GetRecentlyVisitedTMeUrls() {
        }

        public GetRecentlyVisitedTMeUrls(String var1) {
            this.referrer = var1;
        }

        public int getConstructor() {
            return 806754961;
        }
    }

    public static class GetRecentlyOpenedChats extends TdApi.Function<TdApi.Chats> {
        public int limit;
        public static final int CONSTRUCTOR = -1924156893;

        public GetRecentlyOpenedChats() {
        }

        public GetRecentlyOpenedChats(int var1) {
            this.limit = var1;
        }

        public int getConstructor() {
            return -1924156893;
        }
    }

    public static class GetRecentStickers extends TdApi.Function<TdApi.Stickers> {
        public boolean isAttached;
        public static final int CONSTRUCTOR = -579622241;

        public GetRecentStickers() {
        }

        public GetRecentStickers(boolean var1) {
            this.isAttached = var1;
        }

        public int getConstructor() {
            return -579622241;
        }
    }

    public static class GetRecentInlineBots extends TdApi.Function<TdApi.Users> {
        public static final int CONSTRUCTOR = 1437823548;

        public GetRecentInlineBots() {
        }

        public int getConstructor() {
            return 1437823548;
        }
    }

    public static class GetRecentEmojiStatuses extends TdApi.Function<TdApi.EmojiStatuses> {
        public static final int CONSTRUCTOR = -1371914967;

        public GetRecentEmojiStatuses() {
        }

        public int getConstructor() {
            return -1371914967;
        }
    }

    public static class GetPushReceiverId extends TdApi.Function<TdApi.PushReceiverId> {
        public String payload;
        public static final int CONSTRUCTOR = -286505294;

        public GetPushReceiverId() {
        }

        public GetPushReceiverId(String var1) {
            this.payload = var1;
        }

        public int getConstructor() {
            return -286505294;
        }
    }

    public static class GetProxyLink extends TdApi.Function<TdApi.HttpUrl> {
        public int proxyId;
        public static final int CONSTRUCTOR = -1054495112;

        public GetProxyLink() {
        }

        public GetProxyLink(int var1) {
            this.proxyId = var1;
        }

        public int getConstructor() {
            return -1054495112;
        }
    }

    public static class GetProxies extends TdApi.Function<TdApi.Proxies> {
        public static final int CONSTRUCTOR = -95026381;

        public GetProxies() {
        }

        public int getConstructor() {
            return -95026381;
        }
    }

    public static class GetPremiumStickers extends TdApi.Function<TdApi.Stickers> {
        public int limit;
        public static final int CONSTRUCTOR = -280950192;

        public GetPremiumStickers() {
        }

        public GetPremiumStickers(int var1) {
            this.limit = var1;
        }

        public int getConstructor() {
            return -280950192;
        }
    }

    public static class GetPremiumStickerExamples extends TdApi.Function<TdApi.Stickers> {
        public static final int CONSTRUCTOR = 1399442328;

        public GetPremiumStickerExamples() {
        }

        public int getConstructor() {
            return 1399442328;
        }
    }

    public static class GetPremiumState extends TdApi.Function<TdApi.PremiumState> {
        public static final int CONSTRUCTOR = 663632610;

        public GetPremiumState() {
        }

        public int getConstructor() {
            return 663632610;
        }
    }

    public static class GetPremiumLimit extends TdApi.Function<TdApi.PremiumLimit> {
        public TdApi.PremiumLimitType limitType;
        public static final int CONSTRUCTOR = 1075313898;

        public GetPremiumLimit() {
        }

        public GetPremiumLimit(TdApi.PremiumLimitType var1) {
            this.limitType = var1;
        }

        public int getConstructor() {
            return 1075313898;
        }
    }

    public static class GetPremiumFeatures extends TdApi.Function<TdApi.PremiumFeatures> {
        public TdApi.PremiumSource source;
        public static final int CONSTRUCTOR = -1260640695;

        public GetPremiumFeatures() {
        }

        public GetPremiumFeatures(TdApi.PremiumSource var1) {
            this.source = var1;
        }

        public int getConstructor() {
            return -1260640695;
        }
    }

    public static class GetPreferredCountryLanguage extends TdApi.Function<TdApi.Text> {
        public String countryCode;
        public static final int CONSTRUCTOR = -933049386;

        public GetPreferredCountryLanguage() {
        }

        public GetPreferredCountryLanguage(String var1) {
            this.countryCode = var1;
        }

        public int getConstructor() {
            return -933049386;
        }
    }

    public static class GetPollVoters extends TdApi.Function<TdApi.MessageSenders> {
        public long chatId;
        public long messageId;
        public int optionId;
        public int offset;
        public int limit;
        public static final int CONSTRUCTOR = -1000625748;

        public GetPollVoters() {
        }

        public GetPollVoters(long var1, long var3, int var5, int var6, int var7) {
            this.chatId = var1;
            this.messageId = var3;
            this.optionId = var5;
            this.offset = var6;
            this.limit = var7;
        }

        public int getConstructor() {
            return -1000625748;
        }
    }

    public static class GetPhoneNumberInfoSync extends TdApi.Function<TdApi.PhoneNumberInfo> {
        public String languageCode;
        public String phoneNumberPrefix;
        public static final int CONSTRUCTOR = 547061048;

        public GetPhoneNumberInfoSync() {
        }

        public GetPhoneNumberInfoSync(String var1, String var2) {
            this.languageCode = var1;
            this.phoneNumberPrefix = var2;
        }

        public int getConstructor() {
            return 547061048;
        }
    }

    public static class GetPhoneNumberInfo extends TdApi.Function<TdApi.PhoneNumberInfo> {
        public String phoneNumberPrefix;
        public static final int CONSTRUCTOR = -1608344583;

        public GetPhoneNumberInfo() {
        }

        public GetPhoneNumberInfo(String var1) {
            this.phoneNumberPrefix = var1;
        }

        public int getConstructor() {
            return -1608344583;
        }
    }

    public static class GetPaymentReceipt extends TdApi.Function<TdApi.PaymentReceipt> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = 1013758294;

        public GetPaymentReceipt() {
        }

        public GetPaymentReceipt(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return 1013758294;
        }
    }

    public static class GetPaymentForm extends TdApi.Function<TdApi.PaymentForm> {
        public TdApi.InputInvoice inputInvoice;
        public TdApi.ThemeParameters theme;
        public static final int CONSTRUCTOR = -1924172076;

        public GetPaymentForm() {
        }

        public GetPaymentForm(TdApi.InputInvoice var1, TdApi.ThemeParameters var2) {
            this.inputInvoice = var1;
            this.theme = var2;
        }

        public int getConstructor() {
            return -1924172076;
        }
    }

    public static class GetPasswordState extends TdApi.Function<TdApi.PasswordState> {
        public static final int CONSTRUCTOR = -174752904;

        public GetPasswordState() {
        }

        public int getConstructor() {
            return -174752904;
        }
    }

    public static class GetPassportElement extends TdApi.Function<TdApi.PassportElement> {
        public TdApi.PassportElementType type;
        public String password;
        public static final int CONSTRUCTOR = -1882398342;

        public GetPassportElement() {
        }

        public GetPassportElement(TdApi.PassportElementType var1, String var2) {
            this.type = var1;
            this.password = var2;
        }

        public int getConstructor() {
            return -1882398342;
        }
    }

    public static class GetPassportAuthorizationFormAvailableElements extends TdApi.Function<TdApi.PassportElementsWithErrors> {
        public int authorizationFormId;
        public String password;
        public static final int CONSTRUCTOR = 1068700924;

        public GetPassportAuthorizationFormAvailableElements() {
        }

        public GetPassportAuthorizationFormAvailableElements(int var1, String var2) {
            this.authorizationFormId = var1;
            this.password = var2;
        }

        public int getConstructor() {
            return 1068700924;
        }
    }

    public static class GetPassportAuthorizationForm extends TdApi.Function<TdApi.PassportAuthorizationForm> {
        public long botUserId;
        public String scope;
        public String publicKey;
        public String nonce;
        public static final int CONSTRUCTOR = 1636107398;

        public GetPassportAuthorizationForm() {
        }

        public GetPassportAuthorizationForm(long var1, String var3, String var4, String var5) {
            this.botUserId = var1;
            this.scope = var3;
            this.publicKey = var4;
            this.nonce = var5;
        }

        public int getConstructor() {
            return 1636107398;
        }
    }

    public static class GetOption extends TdApi.Function<TdApi.OptionValue> {
        public String name;
        public static final int CONSTRUCTOR = -1572495746;

        public GetOption() {
        }

        public GetOption(String var1) {
            this.name = var1;
        }

        public int getConstructor() {
            return -1572495746;
        }
    }

    public static class GetNetworkStatistics extends TdApi.Function<TdApi.NetworkStatistics> {
        public boolean onlyCurrent;
        public static final int CONSTRUCTOR = -986228706;

        public GetNetworkStatistics() {
        }

        public GetNetworkStatistics(boolean var1) {
            this.onlyCurrent = var1;
        }

        public int getConstructor() {
            return -986228706;
        }
    }

    public static class GetMessages extends TdApi.Function<TdApi.Messages> {
        public long chatId;
        public long[] messageIds;
        public static final int CONSTRUCTOR = 425299338;

        public GetMessages() {
        }

        public GetMessages(long var1, long[] var3) {
            this.chatId = var1;
            this.messageIds = var3;
        }

        public int getConstructor() {
            return 425299338;
        }
    }

    public static class GetMessageViewers extends TdApi.Function<TdApi.MessageViewers> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = -1584457010;

        public GetMessageViewers() {
        }

        public GetMessageViewers(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return -1584457010;
        }
    }

    public static class GetMessageThreadHistory extends TdApi.Function<TdApi.Messages> {
        public long chatId;
        public long messageId;
        public long fromMessageId;
        public int offset;
        public int limit;
        public static final int CONSTRUCTOR = -1808411608;

        public GetMessageThreadHistory() {
        }

        public GetMessageThreadHistory(long var1, long var3, long var5, int var7, int var8) {
            this.chatId = var1;
            this.messageId = var3;
            this.fromMessageId = var5;
            this.offset = var7;
            this.limit = var8;
        }

        public int getConstructor() {
            return -1808411608;
        }
    }

    public static class GetMessageThread extends TdApi.Function<TdApi.MessageThreadInfo> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = 2062695998;

        public GetMessageThread() {
        }

        public GetMessageThread(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return 2062695998;
        }
    }

    public static class GetMessageStatistics extends TdApi.Function<TdApi.MessageStatistics> {
        public long chatId;
        public long messageId;
        public boolean isDark;
        public static final int CONSTRUCTOR = 1270194648;

        public GetMessageStatistics() {
        }

        public GetMessageStatistics(long var1, long var3, boolean var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.isDark = var5;
        }

        public int getConstructor() {
            return 1270194648;
        }
    }

    public static class GetMessagePublicForwards extends TdApi.Function<TdApi.FoundMessages> {
        public long chatId;
        public long messageId;
        public String offset;
        public int limit;
        public static final int CONSTRUCTOR = 1611049289;

        public GetMessagePublicForwards() {
        }

        public GetMessagePublicForwards(long var1, long var3, String var5, int var6) {
            this.chatId = var1;
            this.messageId = var3;
            this.offset = var5;
            this.limit = var6;
        }

        public int getConstructor() {
            return 1611049289;
        }
    }

    public static class GetMessageLocally extends TdApi.Function<TdApi.Message> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = -603575444;

        public GetMessageLocally() {
        }

        public GetMessageLocally(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return -603575444;
        }
    }

    public static class GetMessageLinkInfo extends TdApi.Function<TdApi.MessageLinkInfo> {
        public String url;
        public static final int CONSTRUCTOR = -700533672;

        public GetMessageLinkInfo() {
        }

        public GetMessageLinkInfo(String var1) {
            this.url = var1;
        }

        public int getConstructor() {
            return -700533672;
        }
    }

    public static class GetMessageLink extends TdApi.Function<TdApi.MessageLink> {
        public long chatId;
        public long messageId;
        public int mediaTimestamp;
        public boolean forAlbum;
        public boolean inMessageThread;
        public static final int CONSTRUCTOR = -984158342;

        public GetMessageLink() {
        }

        public GetMessageLink(long var1, long var3, int var5, boolean var6, boolean var7) {
            this.chatId = var1;
            this.messageId = var3;
            this.mediaTimestamp = var5;
            this.forAlbum = var6;
            this.inMessageThread = var7;
        }

        public int getConstructor() {
            return -984158342;
        }
    }

    public static class GetMessageImportConfirmationText extends TdApi.Function<TdApi.Text> {
        public long chatId;
        public static final int CONSTRUCTOR = 390627752;

        public GetMessageImportConfirmationText() {
        }

        public GetMessageImportConfirmationText(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 390627752;
        }
    }

    public static class GetMessageFileType extends TdApi.Function<TdApi.MessageFileType> {
        public String messageFileHead;
        public static final int CONSTRUCTOR = -490270764;

        public GetMessageFileType() {
        }

        public GetMessageFileType(String var1) {
            this.messageFileHead = var1;
        }

        public int getConstructor() {
            return -490270764;
        }
    }

    public static class GetMessageEmbeddingCode extends TdApi.Function<TdApi.Text> {
        public long chatId;
        public long messageId;
        public boolean forAlbum;
        public static final int CONSTRUCTOR = 1654967561;

        public GetMessageEmbeddingCode() {
        }

        public GetMessageEmbeddingCode(long var1, long var3, boolean var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.forAlbum = var5;
        }

        public int getConstructor() {
            return 1654967561;
        }
    }

    public static class GetMessageAvailableReactions extends TdApi.Function<TdApi.AvailableReactions> {
        public long chatId;
        public long messageId;
        public int rowSize;
        public static final int CONSTRUCTOR = 1994098354;

        public GetMessageAvailableReactions() {
        }

        public GetMessageAvailableReactions(long var1, long var3, int var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.rowSize = var5;
        }

        public int getConstructor() {
            return 1994098354;
        }
    }

    public static class GetMessageAddedReactions extends TdApi.Function<TdApi.AddedReactions> {
        public long chatId;
        public long messageId;
        public TdApi.ReactionType reactionType;
        public String offset;
        public int limit;
        public static final int CONSTRUCTOR = 2110172754;

        public GetMessageAddedReactions() {
        }

        public GetMessageAddedReactions(long var1, long var3, TdApi.ReactionType var5, String var6, int var7) {
            this.chatId = var1;
            this.messageId = var3;
            this.reactionType = var5;
            this.offset = var6;
            this.limit = var7;
        }

        public int getConstructor() {
            return 2110172754;
        }
    }

    public static class GetMessage extends TdApi.Function<TdApi.Message> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = -1821196160;

        public GetMessage() {
        }

        public GetMessage(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return -1821196160;
        }
    }

    public static class GetMenuButton extends TdApi.Function<TdApi.BotMenuButton> {
        public long userId;
        public static final int CONSTRUCTOR = -437324736;

        public GetMenuButton() {
        }

        public GetMenuButton(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return -437324736;
        }
    }

    public static class GetMe extends TdApi.Function<TdApi.User> {
        public static final int CONSTRUCTOR = -191516033;

        public GetMe() {
        }

        public int getConstructor() {
            return -191516033;
        }
    }

    public static class GetMarkdownText extends TdApi.Function<TdApi.FormattedText> {
        public TdApi.FormattedText text;
        public static final int CONSTRUCTOR = 164524584;

        public GetMarkdownText() {
        }

        public GetMarkdownText(TdApi.FormattedText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return 164524584;
        }
    }

    public static class GetMapThumbnailFile extends TdApi.Function<TdApi.File> {
        public TdApi.Location location;
        public int zoom;
        public int width;
        public int height;
        public int scale;
        public long chatId;
        public static final int CONSTRUCTOR = -152660070;

        public GetMapThumbnailFile() {
        }

        public GetMapThumbnailFile(TdApi.Location var1, int var2, int var3, int var4, int var5, long var6) {
            this.location = var1;
            this.zoom = var2;
            this.width = var3;
            this.height = var4;
            this.scale = var5;
            this.chatId = var6;
        }

        public int getConstructor() {
            return -152660070;
        }
    }

    public static class GetLoginUrlInfo extends TdApi.Function<TdApi.LoginUrlInfo> {
        public long chatId;
        public long messageId;
        public long buttonId;
        public static final int CONSTRUCTOR = -859202125;

        public GetLoginUrlInfo() {
        }

        public GetLoginUrlInfo(long var1, long var3, long var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.buttonId = var5;
        }

        public int getConstructor() {
            return -859202125;
        }
    }

    public static class GetLoginUrl extends TdApi.Function<TdApi.HttpUrl> {
        public long chatId;
        public long messageId;
        public long buttonId;
        public boolean allowWriteAccess;
        public static final int CONSTRUCTOR = 791844305;

        public GetLoginUrl() {
        }

        public GetLoginUrl(long var1, long var3, long var5, boolean var7) {
            this.chatId = var1;
            this.messageId = var3;
            this.buttonId = var5;
            this.allowWriteAccess = var7;
        }

        public int getConstructor() {
            return 791844305;
        }
    }

    public static class GetLogVerbosityLevel extends TdApi.Function<TdApi.LogVerbosityLevel> {
        public static final int CONSTRUCTOR = 594057956;

        public GetLogVerbosityLevel() {
        }

        public int getConstructor() {
            return 594057956;
        }
    }

    public static class GetLogTags extends TdApi.Function<TdApi.LogTags> {
        public static final int CONSTRUCTOR = -254449190;

        public GetLogTags() {
        }

        public int getConstructor() {
            return -254449190;
        }
    }

    public static class GetLogTagVerbosityLevel extends TdApi.Function<TdApi.LogVerbosityLevel> {
        public String tag;
        public static final int CONSTRUCTOR = 951004547;

        public GetLogTagVerbosityLevel() {
        }

        public GetLogTagVerbosityLevel(String var1) {
            this.tag = var1;
        }

        public int getConstructor() {
            return 951004547;
        }
    }

    public static class GetLogStream extends TdApi.Function<TdApi.LogStream> {
        public static final int CONSTRUCTOR = 1167608667;

        public GetLogStream() {
        }

        public int getConstructor() {
            return 1167608667;
        }
    }

    public static class GetLocalizationTargetInfo extends TdApi.Function<TdApi.LocalizationTargetInfo> {
        public boolean onlyLocal;
        public static final int CONSTRUCTOR = 1849499526;

        public GetLocalizationTargetInfo() {
        }

        public GetLocalizationTargetInfo(boolean var1) {
            this.onlyLocal = var1;
        }

        public int getConstructor() {
            return 1849499526;
        }
    }

    public static class GetLanguagePackStrings extends TdApi.Function<TdApi.LanguagePackStrings> {
        public String languagePackId;
        public String[] keys;
        public static final int CONSTRUCTOR = 1246259088;

        public GetLanguagePackStrings() {
        }

        public GetLanguagePackStrings(String var1, String[] var2) {
            this.languagePackId = var1;
            this.keys = var2;
        }

        public int getConstructor() {
            return 1246259088;
        }
    }

    public static class GetLanguagePackString extends TdApi.Function<TdApi.LanguagePackStringValue> {
        public String languagePackDatabasePath;
        public String localizationTarget;
        public String languagePackId;
        public String key;
        public static final int CONSTRUCTOR = 150789747;

        public GetLanguagePackString() {
        }

        public GetLanguagePackString(String var1, String var2, String var3, String var4) {
            this.languagePackDatabasePath = var1;
            this.localizationTarget = var2;
            this.languagePackId = var3;
            this.key = var4;
        }

        public int getConstructor() {
            return 150789747;
        }
    }

    public static class GetLanguagePackInfo extends TdApi.Function<TdApi.LanguagePackInfo> {
        public String languagePackId;
        public static final int CONSTRUCTOR = 2077809320;

        public GetLanguagePackInfo() {
        }

        public GetLanguagePackInfo(String var1) {
            this.languagePackId = var1;
        }

        public int getConstructor() {
            return 2077809320;
        }
    }

    public static class GetJsonValue extends TdApi.Function<TdApi.JsonValue> {
        public String json;
        public static final int CONSTRUCTOR = -1829086715;

        public GetJsonValue() {
        }

        public GetJsonValue(String var1) {
            this.json = var1;
        }

        public int getConstructor() {
            return -1829086715;
        }
    }

    public static class GetJsonString extends TdApi.Function<TdApi.Text> {
        public TdApi.JsonValue jsonValue;
        public static final int CONSTRUCTOR = 663458849;

        public GetJsonString() {
        }

        public GetJsonString(TdApi.JsonValue var1) {
            this.jsonValue = var1;
        }

        public int getConstructor() {
            return 663458849;
        }
    }

    public static class GetInternalLinkType extends TdApi.Function<TdApi.InternalLinkType> {
        public String link;
        public static final int CONSTRUCTOR = -1948428535;

        public GetInternalLinkType() {
        }

        public GetInternalLinkType(String var1) {
            this.link = var1;
        }

        public int getConstructor() {
            return -1948428535;
        }
    }

    public static class GetInternalLink extends TdApi.Function<TdApi.HttpUrl> {
        public TdApi.InternalLinkType type;
        public boolean isHttp;
        public static final int CONSTRUCTOR = 962654640;

        public GetInternalLink() {
        }

        public GetInternalLink(TdApi.InternalLinkType var1, boolean var2) {
            this.type = var1;
            this.isHttp = var2;
        }

        public int getConstructor() {
            return 962654640;
        }
    }

    public static class GetInstalledStickerSets extends TdApi.Function<TdApi.StickerSets> {
        public TdApi.StickerType stickerType;
        public static final int CONSTRUCTOR = 1630467830;

        public GetInstalledStickerSets() {
        }

        public GetInstalledStickerSets(TdApi.StickerType var1) {
            this.stickerType = var1;
        }

        public int getConstructor() {
            return 1630467830;
        }
    }

    public static class GetInlineQueryResults extends TdApi.Function<TdApi.InlineQueryResults> {
        public long botUserId;
        public long chatId;
        public TdApi.Location userLocation;
        public String query;
        public String offset;
        public static final int CONSTRUCTOR = 2044524652;

        public GetInlineQueryResults() {
        }

        public GetInlineQueryResults(long var1, long var3, TdApi.Location var5, String var6, String var7) {
            this.botUserId = var1;
            this.chatId = var3;
            this.userLocation = var5;
            this.query = var6;
            this.offset = var7;
        }

        public int getConstructor() {
            return 2044524652;
        }
    }

    public static class GetInlineGameHighScores extends TdApi.Function<TdApi.GameHighScores> {
        public String inlineMessageId;
        public long userId;
        public static final int CONSTRUCTOR = -533107798;

        public GetInlineGameHighScores() {
        }

        public GetInlineGameHighScores(String var1, long var2) {
            this.inlineMessageId = var1;
            this.userId = var2;
        }

        public int getConstructor() {
            return -533107798;
        }
    }

    public static class GetInactiveSupergroupChats extends TdApi.Function<TdApi.Chats> {
        public static final int CONSTRUCTOR = -657720907;

        public GetInactiveSupergroupChats() {
        }

        public int getConstructor() {
            return -657720907;
        }
    }

    public static class GetImportedContactCount extends TdApi.Function<TdApi.Count> {
        public static final int CONSTRUCTOR = -656336346;

        public GetImportedContactCount() {
        }

        public int getConstructor() {
            return -656336346;
        }
    }

    public static class GetGroupsInCommon extends TdApi.Function<TdApi.Chats> {
        public long userId;
        public long offsetChatId;
        public int limit;
        public static final int CONSTRUCTOR = 381539178;

        public GetGroupsInCommon() {
        }

        public GetGroupsInCommon(long var1, long var3, int var5) {
            this.userId = var1;
            this.offsetChatId = var3;
            this.limit = var5;
        }

        public int getConstructor() {
            return 381539178;
        }
    }

    public static class GetGroupCallStreams extends TdApi.Function<TdApi.GroupCallStreams> {
        public int groupCallId;
        public static final int CONSTRUCTOR = -1619226268;

        public GetGroupCallStreams() {
        }

        public GetGroupCallStreams(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return -1619226268;
        }
    }

    public static class GetGroupCallStreamSegment extends TdApi.Function<TdApi.FilePart> {
        public int groupCallId;
        public long timeOffset;
        public int scale;
        public int channelId;
        public TdApi.GroupCallVideoQuality videoQuality;
        public static final int CONSTRUCTOR = -2077959515;

        public GetGroupCallStreamSegment() {
        }

        public GetGroupCallStreamSegment(int var1, long var2, int var4, int var5, TdApi.GroupCallVideoQuality var6) {
            this.groupCallId = var1;
            this.timeOffset = var2;
            this.scale = var4;
            this.channelId = var5;
            this.videoQuality = var6;
        }

        public int getConstructor() {
            return -2077959515;
        }
    }

    public static class GetGroupCallInviteLink extends TdApi.Function<TdApi.HttpUrl> {
        public int groupCallId;
        public boolean canSelfUnmute;
        public static final int CONSTRUCTOR = 719407396;

        public GetGroupCallInviteLink() {
        }

        public GetGroupCallInviteLink(int var1, boolean var2) {
            this.groupCallId = var1;
            this.canSelfUnmute = var2;
        }

        public int getConstructor() {
            return 719407396;
        }
    }

    public static class GetGroupCall extends TdApi.Function<TdApi.GroupCall> {
        public int groupCallId;
        public static final int CONSTRUCTOR = 1468491406;

        public GetGroupCall() {
        }

        public GetGroupCall(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return 1468491406;
        }
    }

    public static class GetGameHighScores extends TdApi.Function<TdApi.GameHighScores> {
        public long chatId;
        public long messageId;
        public long userId;
        public static final int CONSTRUCTOR = 15746459;

        public GetGameHighScores() {
        }

        public GetGameHighScores(long var1, long var3, long var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.userId = var5;
        }

        public int getConstructor() {
            return 15746459;
        }
    }

    public static class GetForumTopics extends TdApi.Function<TdApi.ForumTopics> {
        public long chatId;
        public String query;
        public int offsetDate;
        public long offsetMessageId;
        public long offsetMessageThreadId;
        public int limit;
        public static final int CONSTRUCTOR = -72647334;

        public GetForumTopics() {
        }

        public GetForumTopics(long var1, String var3, int var4, long var5, long var7, int var9) {
            this.chatId = var1;
            this.query = var3;
            this.offsetDate = var4;
            this.offsetMessageId = var5;
            this.offsetMessageThreadId = var7;
            this.limit = var9;
        }

        public int getConstructor() {
            return -72647334;
        }
    }

    public static class GetForumTopicLink extends TdApi.Function<TdApi.MessageLink> {
        public long chatId;
        public long messageThreadId;
        public static final int CONSTRUCTOR = -914650933;

        public GetForumTopicLink() {
        }

        public GetForumTopicLink(long var1, long var3) {
            this.chatId = var1;
            this.messageThreadId = var3;
        }

        public int getConstructor() {
            return -914650933;
        }
    }

    public static class GetForumTopicDefaultIcons extends TdApi.Function<TdApi.Stickers> {
        public static final int CONSTRUCTOR = 1479898332;

        public GetForumTopicDefaultIcons() {
        }

        public int getConstructor() {
            return 1479898332;
        }
    }

    public static class GetForumTopic extends TdApi.Function<TdApi.ForumTopic> {
        public long chatId;
        public long messageThreadId;
        public static final int CONSTRUCTOR = -442761663;

        public GetForumTopic() {
        }

        public GetForumTopic(long var1, long var3) {
            this.chatId = var1;
            this.messageThreadId = var3;
        }

        public int getConstructor() {
            return -442761663;
        }
    }

    public static class GetFileMimeType extends TdApi.Function<TdApi.Text> {
        public String fileName;
        public static final int CONSTRUCTOR = -2073879671;

        public GetFileMimeType() {
        }

        public GetFileMimeType(String var1) {
            this.fileName = var1;
        }

        public int getConstructor() {
            return -2073879671;
        }
    }

    public static class GetFileExtension extends TdApi.Function<TdApi.Text> {
        public String mimeType;
        public static final int CONSTRUCTOR = -106055372;

        public GetFileExtension() {
        }

        public GetFileExtension(String var1) {
            this.mimeType = var1;
        }

        public int getConstructor() {
            return -106055372;
        }
    }

    public static class GetFileDownloadedPrefixSize extends TdApi.Function<TdApi.FileDownloadedPrefixSize> {
        public int fileId;
        public long offset;
        public static final int CONSTRUCTOR = 855948589;

        public GetFileDownloadedPrefixSize() {
        }

        public GetFileDownloadedPrefixSize(int var1, long var2) {
            this.fileId = var1;
            this.offset = var2;
        }

        public int getConstructor() {
            return 855948589;
        }
    }

    public static class GetFile extends TdApi.Function<TdApi.File> {
        public int fileId;
        public static final int CONSTRUCTOR = 1553923406;

        public GetFile() {
        }

        public GetFile(int var1) {
            this.fileId = var1;
        }

        public int getConstructor() {
            return 1553923406;
        }
    }

    public static class GetFavoriteStickers extends TdApi.Function<TdApi.Stickers> {
        public static final int CONSTRUCTOR = -338964672;

        public GetFavoriteStickers() {
        }

        public int getConstructor() {
            return -338964672;
        }
    }

    public static class GetExternalLinkInfo extends TdApi.Function<TdApi.LoginUrlInfo> {
        public String link;
        public static final int CONSTRUCTOR = 1175288383;

        public GetExternalLinkInfo() {
        }

        public GetExternalLinkInfo(String var1) {
            this.link = var1;
        }

        public int getConstructor() {
            return 1175288383;
        }
    }

    public static class GetExternalLink extends TdApi.Function<TdApi.HttpUrl> {
        public String link;
        public boolean allowWriteAccess;
        public static final int CONSTRUCTOR = 1586688235;

        public GetExternalLink() {
        }

        public GetExternalLink(String var1, boolean var2) {
            this.link = var1;
            this.allowWriteAccess = var2;
        }

        public int getConstructor() {
            return 1586688235;
        }
    }

    public static class GetEmojiSuggestionsUrl extends TdApi.Function<TdApi.HttpUrl> {
        public String languageCode;
        public static final int CONSTRUCTOR = -1404101841;

        public GetEmojiSuggestionsUrl() {
        }

        public GetEmojiSuggestionsUrl(String var1) {
            this.languageCode = var1;
        }

        public int getConstructor() {
            return -1404101841;
        }
    }

    public static class GetEmojiReaction extends TdApi.Function<TdApi.EmojiReaction> {
        public String emoji;
        public static final int CONSTRUCTOR = -449572388;

        public GetEmojiReaction() {
        }

        public GetEmojiReaction(String var1) {
            this.emoji = var1;
        }

        public int getConstructor() {
            return -449572388;
        }
    }

    public static class GetEmojiCategories extends TdApi.Function<TdApi.EmojiCategories> {
        public TdApi.EmojiCategoryType type;
        public static final int CONSTRUCTOR = 2139537774;

        public GetEmojiCategories() {
        }

        public GetEmojiCategories(TdApi.EmojiCategoryType var1) {
            this.type = var1;
        }

        public int getConstructor() {
            return 2139537774;
        }
    }

    public static class GetDefaultProfilePhotoCustomEmojiStickers extends TdApi.Function<TdApi.Stickers> {
        public static final int CONSTRUCTOR = 1280041655;

        public GetDefaultProfilePhotoCustomEmojiStickers() {
        }

        public int getConstructor() {
            return 1280041655;
        }
    }

    public static class GetDefaultMessageAutoDeleteTime extends TdApi.Function<TdApi.MessageAutoDeleteTime> {
        public static final int CONSTRUCTOR = -450857574;

        public GetDefaultMessageAutoDeleteTime() {
        }

        public int getConstructor() {
            return -450857574;
        }
    }

    public static class GetDefaultEmojiStatuses extends TdApi.Function<TdApi.EmojiStatuses> {
        public static final int CONSTRUCTOR = 618946243;

        public GetDefaultEmojiStatuses() {
        }

        public int getConstructor() {
            return 618946243;
        }
    }

    public static class GetDefaultChatPhotoCustomEmojiStickers extends TdApi.Function<TdApi.Stickers> {
        public static final int CONSTRUCTOR = -376342683;

        public GetDefaultChatPhotoCustomEmojiStickers() {
        }

        public int getConstructor() {
            return -376342683;
        }
    }

    public static class GetDeepLinkInfo extends TdApi.Function<TdApi.DeepLinkInfo> {
        public String link;
        public static final int CONSTRUCTOR = 680673150;

        public GetDeepLinkInfo() {
        }

        public GetDeepLinkInfo(String var1) {
            this.link = var1;
        }

        public int getConstructor() {
            return 680673150;
        }
    }

    public static class GetDatabaseStatistics extends TdApi.Function<TdApi.DatabaseStatistics> {
        public static final int CONSTRUCTOR = -1942760263;

        public GetDatabaseStatistics() {
        }

        public int getConstructor() {
            return -1942760263;
        }
    }

    public static class GetCustomEmojiStickers extends TdApi.Function<TdApi.Stickers> {
        public long[] customEmojiIds;
        public static final int CONSTRUCTOR = -2127427955;

        public GetCustomEmojiStickers() {
        }

        public GetCustomEmojiStickers(long[] var1) {
            this.customEmojiIds = var1;
        }

        public int getConstructor() {
            return -2127427955;
        }
    }

    public static class GetCustomEmojiReactionAnimations extends TdApi.Function<TdApi.Stickers> {
        public static final int CONSTRUCTOR = 1232375250;

        public GetCustomEmojiReactionAnimations() {
        }

        public int getConstructor() {
            return 1232375250;
        }
    }

    public static class GetCurrentState extends TdApi.Function<TdApi.Updates> {
        public static final int CONSTRUCTOR = -1191417719;

        public GetCurrentState() {
        }

        public int getConstructor() {
            return -1191417719;
        }
    }

    public static class GetCreatedPublicChats extends TdApi.Function<TdApi.Chats> {
        public TdApi.PublicChatType type;
        public static final int CONSTRUCTOR = 710354415;

        public GetCreatedPublicChats() {
        }

        public GetCreatedPublicChats(TdApi.PublicChatType var1) {
            this.type = var1;
        }

        public int getConstructor() {
            return 710354415;
        }
    }

    public static class GetCountryCode extends TdApi.Function<TdApi.Text> {
        public static final int CONSTRUCTOR = 1540593906;

        public GetCountryCode() {
        }

        public int getConstructor() {
            return 1540593906;
        }
    }

    public static class GetCountries extends TdApi.Function<TdApi.Countries> {
        public static final int CONSTRUCTOR = -51902050;

        public GetCountries() {
        }

        public int getConstructor() {
            return -51902050;
        }
    }

    public static class GetContacts extends TdApi.Function<TdApi.Users> {
        public static final int CONSTRUCTOR = -1417722768;

        public GetContacts() {
        }

        public int getConstructor() {
            return -1417722768;
        }
    }

    public static class GetConnectedWebsites extends TdApi.Function<TdApi.ConnectedWebsites> {
        public static final int CONSTRUCTOR = -170536110;

        public GetConnectedWebsites() {
        }

        public int getConstructor() {
            return -170536110;
        }
    }

    public static class GetCommands extends TdApi.Function<TdApi.BotCommands> {
        public TdApi.BotCommandScope scope;
        public String languageCode;
        public static final int CONSTRUCTOR = 1488621559;

        public GetCommands() {
        }

        public GetCommands(TdApi.BotCommandScope var1, String var2) {
            this.scope = var1;
            this.languageCode = var2;
        }

        public int getConstructor() {
            return 1488621559;
        }
    }

    public static class GetCloseFriends extends TdApi.Function<TdApi.Users> {
        public static final int CONSTRUCTOR = -1445628722;

        public GetCloseFriends() {
        }

        public int getConstructor() {
            return -1445628722;
        }
    }

    public static class GetChatsForChatFolderInviteLink extends TdApi.Function<TdApi.Chats> {
        public int chatFolderId;
        public static final int CONSTRUCTOR = 1873561929;

        public GetChatsForChatFolderInviteLink() {
        }

        public GetChatsForChatFolderInviteLink(int var1) {
            this.chatFolderId = var1;
        }

        public int getConstructor() {
            return 1873561929;
        }
    }

    public static class GetChats extends TdApi.Function<TdApi.Chats> {
        public TdApi.ChatList chatList;
        public int limit;
        public static final int CONSTRUCTOR = -972768574;

        public GetChats() {
        }

        public GetChats(TdApi.ChatList var1, int var2) {
            this.chatList = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return -972768574;
        }
    }

    public static class GetChatStatistics extends TdApi.Function<TdApi.ChatStatistics> {
        public long chatId;
        public boolean isDark;
        public static final int CONSTRUCTOR = 327057816;

        public GetChatStatistics() {
        }

        public GetChatStatistics(long var1, boolean var3) {
            this.chatId = var1;
            this.isDark = var3;
        }

        public int getConstructor() {
            return 327057816;
        }
    }

    public static class GetChatSponsoredMessages extends TdApi.Function<TdApi.SponsoredMessages> {
        public long chatId;
        public static final int CONSTRUCTOR = 1353203864;

        public GetChatSponsoredMessages() {
        }

        public GetChatSponsoredMessages(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 1353203864;
        }
    }

    public static class GetChatSparseMessagePositions extends TdApi.Function<TdApi.MessagePositions> {
        public long chatId;
        public TdApi.SearchMessagesFilter filter;
        public long fromMessageId;
        public int limit;
        public static final int CONSTRUCTOR = -462227580;

        public GetChatSparseMessagePositions() {
        }

        public GetChatSparseMessagePositions(long var1, TdApi.SearchMessagesFilter var3, long var4, int var6) {
            this.chatId = var1;
            this.filter = var3;
            this.fromMessageId = var4;
            this.limit = var6;
        }

        public int getConstructor() {
            return -462227580;
        }
    }

    public static class GetChatScheduledMessages extends TdApi.Function<TdApi.Messages> {
        public long chatId;
        public static final int CONSTRUCTOR = -549638149;

        public GetChatScheduledMessages() {
        }

        public GetChatScheduledMessages(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -549638149;
        }
    }

    public static class GetChatPinnedStories extends TdApi.Function<TdApi.Stories> {
        public long chatId;
        public int fromStoryId;
        public int limit;
        public static final int CONSTRUCTOR = 87851681;

        public GetChatPinnedStories() {
        }

        public GetChatPinnedStories(long var1, int var3, int var4) {
            this.chatId = var1;
            this.fromStoryId = var3;
            this.limit = var4;
        }

        public int getConstructor() {
            return 87851681;
        }
    }

    public static class GetChatPinnedMessage extends TdApi.Function<TdApi.Message> {
        public long chatId;
        public static final int CONSTRUCTOR = 359865008;

        public GetChatPinnedMessage() {
        }

        public GetChatPinnedMessage(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 359865008;
        }
    }

    public static class GetChatNotificationSettingsExceptions extends TdApi.Function<TdApi.Chats> {
        public TdApi.NotificationSettingsScope scope;
        public boolean compareSound;
        public static final int CONSTRUCTOR = 201199121;

        public GetChatNotificationSettingsExceptions() {
        }

        public GetChatNotificationSettingsExceptions(TdApi.NotificationSettingsScope var1, boolean var2) {
            this.scope = var1;
            this.compareSound = var2;
        }

        public int getConstructor() {
            return 201199121;
        }
    }

    public static class GetChatMessagePosition extends TdApi.Function<TdApi.Count> {
        public long chatId;
        public long messageId;
        public TdApi.SearchMessagesFilter filter;
        public long messageThreadId;
        public static final int CONSTRUCTOR = -559474920;

        public GetChatMessagePosition() {
        }

        public GetChatMessagePosition(long var1, long var3, TdApi.SearchMessagesFilter var5, long var6) {
            this.chatId = var1;
            this.messageId = var3;
            this.filter = var5;
            this.messageThreadId = var6;
        }

        public int getConstructor() {
            return -559474920;
        }
    }

    public static class GetChatMessageCount extends TdApi.Function<TdApi.Count> {
        public long chatId;
        public TdApi.SearchMessagesFilter filter;
        public boolean returnLocal;
        public static final int CONSTRUCTOR = 205435308;

        public GetChatMessageCount() {
        }

        public GetChatMessageCount(long var1, TdApi.SearchMessagesFilter var3, boolean var4) {
            this.chatId = var1;
            this.filter = var3;
            this.returnLocal = var4;
        }

        public int getConstructor() {
            return 205435308;
        }
    }

    public static class GetChatMessageCalendar extends TdApi.Function<TdApi.MessageCalendar> {
        public long chatId;
        public TdApi.SearchMessagesFilter filter;
        public long fromMessageId;
        public static final int CONSTRUCTOR = -326164204;

        public GetChatMessageCalendar() {
        }

        public GetChatMessageCalendar(long var1, TdApi.SearchMessagesFilter var3, long var4) {
            this.chatId = var1;
            this.filter = var3;
            this.fromMessageId = var4;
        }

        public int getConstructor() {
            return -326164204;
        }
    }

    public static class GetChatMessageByDate extends TdApi.Function<TdApi.Message> {
        public long chatId;
        public int date;
        public static final int CONSTRUCTOR = 1062564150;

        public GetChatMessageByDate() {
        }

        public GetChatMessageByDate(long var1, int var3) {
            this.chatId = var1;
            this.date = var3;
        }

        public int getConstructor() {
            return 1062564150;
        }
    }

    public static class GetChatMember extends TdApi.Function<TdApi.ChatMember> {
        public long chatId;
        public TdApi.MessageSender memberId;
        public static final int CONSTRUCTOR = -792636814;

        public GetChatMember() {
        }

        public GetChatMember(long var1, TdApi.MessageSender var3) {
            this.chatId = var1;
            this.memberId = var3;
        }

        public int getConstructor() {
            return -792636814;
        }
    }

    public static class GetChatListsToAddChat extends TdApi.Function<TdApi.ChatLists> {
        public long chatId;
        public static final int CONSTRUCTOR = 654956193;

        public GetChatListsToAddChat() {
        }

        public GetChatListsToAddChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 654956193;
        }
    }

    public static class GetChatJoinRequests extends TdApi.Function<TdApi.ChatJoinRequests> {
        public long chatId;
        public String inviteLink;
        public String query;
        public TdApi.ChatJoinRequest offsetRequest;
        public int limit;
        public static final int CONSTRUCTOR = -388428126;

        public GetChatJoinRequests() {
        }

        public GetChatJoinRequests(long var1, String var3, String var4, TdApi.ChatJoinRequest var5, int var6) {
            this.chatId = var1;
            this.inviteLink = var3;
            this.query = var4;
            this.offsetRequest = var5;
            this.limit = var6;
        }

        public int getConstructor() {
            return -388428126;
        }
    }

    public static class GetChatInviteLinks extends TdApi.Function<TdApi.ChatInviteLinks> {
        public long chatId;
        public long creatorUserId;
        public boolean isRevoked;
        public int offsetDate;
        public String offsetInviteLink;
        public int limit;
        public static final int CONSTRUCTOR = 883252396;

        public GetChatInviteLinks() {
        }

        public GetChatInviteLinks(long var1, long var3, boolean var5, int var6, String var7, int var8) {
            this.chatId = var1;
            this.creatorUserId = var3;
            this.isRevoked = var5;
            this.offsetDate = var6;
            this.offsetInviteLink = var7;
            this.limit = var8;
        }

        public int getConstructor() {
            return 883252396;
        }
    }

    public static class GetChatInviteLinkMembers extends TdApi.Function<TdApi.ChatInviteLinkMembers> {
        public long chatId;
        public String inviteLink;
        public TdApi.ChatInviteLinkMember offsetMember;
        public int limit;
        public static final int CONSTRUCTOR = -977921638;

        public GetChatInviteLinkMembers() {
        }

        public GetChatInviteLinkMembers(long var1, String var3, TdApi.ChatInviteLinkMember var4, int var5) {
            this.chatId = var1;
            this.inviteLink = var3;
            this.offsetMember = var4;
            this.limit = var5;
        }

        public int getConstructor() {
            return -977921638;
        }
    }

    public static class GetChatInviteLinkCounts extends TdApi.Function<TdApi.ChatInviteLinkCounts> {
        public long chatId;
        public static final int CONSTRUCTOR = 890299025;

        public GetChatInviteLinkCounts() {
        }

        public GetChatInviteLinkCounts(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 890299025;
        }
    }

    public static class GetChatInviteLink extends TdApi.Function<TdApi.ChatInviteLink> {
        public long chatId;
        public String inviteLink;
        public static final int CONSTRUCTOR = -479575555;

        public GetChatInviteLink() {
        }

        public GetChatInviteLink(long var1, String var3) {
            this.chatId = var1;
            this.inviteLink = var3;
        }

        public int getConstructor() {
            return -479575555;
        }
    }

    public static class GetChatHistory extends TdApi.Function<TdApi.Messages> {
        public long chatId;
        public long fromMessageId;
        public int offset;
        public int limit;
        public boolean onlyLocal;
        public static final int CONSTRUCTOR = -799960451;

        public GetChatHistory() {
        }

        public GetChatHistory(long var1, long var3, int var5, int var6, boolean var7) {
            this.chatId = var1;
            this.fromMessageId = var3;
            this.offset = var5;
            this.limit = var6;
            this.onlyLocal = var7;
        }

        public int getConstructor() {
            return -799960451;
        }
    }

    public static class GetChatFolderNewChats extends TdApi.Function<TdApi.Chats> {
        public int chatFolderId;
        public static final int CONSTRUCTOR = 2123181260;

        public GetChatFolderNewChats() {
        }

        public GetChatFolderNewChats(int var1) {
            this.chatFolderId = var1;
        }

        public int getConstructor() {
            return 2123181260;
        }
    }

    public static class GetChatFolderInviteLinks extends TdApi.Function<TdApi.ChatFolderInviteLinks> {
        public int chatFolderId;
        public static final int CONSTRUCTOR = 329079776;

        public GetChatFolderInviteLinks() {
        }

        public GetChatFolderInviteLinks(int var1) {
            this.chatFolderId = var1;
        }

        public int getConstructor() {
            return 329079776;
        }
    }

    public static class GetChatFolderDefaultIconName extends TdApi.Function<TdApi.ChatFolderIcon> {
        public TdApi.ChatFolder folder;
        public static final int CONSTRUCTOR = 754425959;

        public GetChatFolderDefaultIconName() {
        }

        public GetChatFolderDefaultIconName(TdApi.ChatFolder var1) {
            this.folder = var1;
        }

        public int getConstructor() {
            return 754425959;
        }
    }

    public static class GetChatFolderChatsToLeave extends TdApi.Function<TdApi.Chats> {
        public int chatFolderId;
        public static final int CONSTRUCTOR = -1916672337;

        public GetChatFolderChatsToLeave() {
        }

        public GetChatFolderChatsToLeave(int var1) {
            this.chatFolderId = var1;
        }

        public int getConstructor() {
            return -1916672337;
        }
    }

    public static class GetChatFolderChatCount extends TdApi.Function<TdApi.Count> {
        public TdApi.ChatFolder folder;
        public static final int CONSTRUCTOR = 2111097790;

        public GetChatFolderChatCount() {
        }

        public GetChatFolderChatCount(TdApi.ChatFolder var1) {
            this.folder = var1;
        }

        public int getConstructor() {
            return 2111097790;
        }
    }

    public static class GetChatFolder extends TdApi.Function<TdApi.ChatFolder> {
        public int chatFolderId;
        public static final int CONSTRUCTOR = 92809880;

        public GetChatFolder() {
        }

        public GetChatFolder(int var1) {
            this.chatFolderId = var1;
        }

        public int getConstructor() {
            return 92809880;
        }
    }

    public static class GetChatEventLog extends TdApi.Function<TdApi.ChatEvents> {
        public long chatId;
        public String query;
        public long fromEventId;
        public int limit;
        public TdApi.ChatEventLogFilters filters;
        public long[] userIds;
        public static final int CONSTRUCTOR = -1281344669;

        public GetChatEventLog() {
        }

        public GetChatEventLog(long var1, String var3, long var4, int var6, TdApi.ChatEventLogFilters var7, long[] var8) {
            this.chatId = var1;
            this.query = var3;
            this.fromEventId = var4;
            this.limit = var6;
            this.filters = var7;
            this.userIds = var8;
        }

        public int getConstructor() {
            return -1281344669;
        }
    }

    public static class GetChatAvailableMessageSenders extends TdApi.Function<TdApi.ChatMessageSenders> {
        public long chatId;
        public static final int CONSTRUCTOR = 1158670635;

        public GetChatAvailableMessageSenders() {
        }

        public GetChatAvailableMessageSenders(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 1158670635;
        }
    }

    public static class GetChatAdministrators extends TdApi.Function<TdApi.ChatAdministrators> {
        public long chatId;
        public static final int CONSTRUCTOR = 1544468155;

        public GetChatAdministrators() {
        }

        public GetChatAdministrators(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 1544468155;
        }
    }

    public static class GetChatActiveStories extends TdApi.Function<TdApi.ChatActiveStories> {
        public long chatId;
        public static final int CONSTRUCTOR = 776993781;

        public GetChatActiveStories() {
        }

        public GetChatActiveStories(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 776993781;
        }
    }

    public static class GetChat extends TdApi.Function<TdApi.Chat> {
        public long chatId;
        public static final int CONSTRUCTOR = 1866601536;

        public GetChat() {
        }

        public GetChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 1866601536;
        }
    }

    public static class GetCallbackQueryMessage extends TdApi.Function<TdApi.Message> {
        public long chatId;
        public long messageId;
        public long callbackQueryId;
        public static final int CONSTRUCTOR = -1121939086;

        public GetCallbackQueryMessage() {
        }

        public GetCallbackQueryMessage(long var1, long var3, long var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.callbackQueryId = var5;
        }

        public int getConstructor() {
            return -1121939086;
        }
    }

    public static class GetCallbackQueryAnswer extends TdApi.Function<TdApi.CallbackQueryAnswer> {
        public long chatId;
        public long messageId;
        public TdApi.CallbackQueryPayload payload;
        public static final int CONSTRUCTOR = 116357727;

        public GetCallbackQueryAnswer() {
        }

        public GetCallbackQueryAnswer(long var1, long var3, TdApi.CallbackQueryPayload var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.payload = var5;
        }

        public int getConstructor() {
            return 116357727;
        }
    }

    public static class GetBotName extends TdApi.Function<TdApi.Text> {
        public long botUserId;
        public String languageCode;
        public static final int CONSTRUCTOR = -1707118036;

        public GetBotName() {
        }

        public GetBotName(long var1, String var3) {
            this.botUserId = var1;
            this.languageCode = var3;
        }

        public int getConstructor() {
            return -1707118036;
        }
    }

    public static class GetBotInfoShortDescription extends TdApi.Function<TdApi.Text> {
        public long botUserId;
        public String languageCode;
        public static final int CONSTRUCTOR = 1243358740;

        public GetBotInfoShortDescription() {
        }

        public GetBotInfoShortDescription(long var1, String var3) {
            this.botUserId = var1;
            this.languageCode = var3;
        }

        public int getConstructor() {
            return 1243358740;
        }
    }

    public static class GetBotInfoDescription extends TdApi.Function<TdApi.Text> {
        public long botUserId;
        public String languageCode;
        public static final int CONSTRUCTOR = -762841035;

        public GetBotInfoDescription() {
        }

        public GetBotInfoDescription(long var1, String var3) {
            this.botUserId = var1;
            this.languageCode = var3;
        }

        public int getConstructor() {
            return -762841035;
        }
    }

    public static class GetBlockedMessageSenders extends TdApi.Function<TdApi.MessageSenders> {
        public TdApi.BlockList blockList;
        public int offset;
        public int limit;
        public static final int CONSTRUCTOR = -1931137258;

        public GetBlockedMessageSenders() {
        }

        public GetBlockedMessageSenders(TdApi.BlockList var1, int var2, int var3) {
            this.blockList = var1;
            this.offset = var2;
            this.limit = var3;
        }

        public int getConstructor() {
            return -1931137258;
        }
    }

    public static class GetBasicGroupFullInfo extends TdApi.Function<TdApi.BasicGroupFullInfo> {
        public long basicGroupId;
        public static final int CONSTRUCTOR = -1822039253;

        public GetBasicGroupFullInfo() {
        }

        public GetBasicGroupFullInfo(long var1) {
            this.basicGroupId = var1;
        }

        public int getConstructor() {
            return -1822039253;
        }
    }

    public static class GetBasicGroup extends TdApi.Function<TdApi.BasicGroup> {
        public long basicGroupId;
        public static final int CONSTRUCTOR = -1635174828;

        public GetBasicGroup() {
        }

        public GetBasicGroup(long var1) {
            this.basicGroupId = var1;
        }

        public int getConstructor() {
            return -1635174828;
        }
    }

    public static class GetBankCardInfo extends TdApi.Function<TdApi.BankCardInfo> {
        public String bankCardNumber;
        public static final int CONSTRUCTOR = -1310515792;

        public GetBankCardInfo() {
        }

        public GetBankCardInfo(String var1) {
            this.bankCardNumber = var1;
        }

        public int getConstructor() {
            return -1310515792;
        }
    }

    public static class GetBackgrounds extends TdApi.Function<TdApi.Backgrounds> {
        public boolean forDarkTheme;
        public static final int CONSTRUCTOR = 249072633;

        public GetBackgrounds() {
        }

        public GetBackgrounds(boolean var1) {
            this.forDarkTheme = var1;
        }

        public int getConstructor() {
            return 249072633;
        }
    }

    public static class GetBackgroundUrl extends TdApi.Function<TdApi.HttpUrl> {
        public String name;
        public TdApi.BackgroundType type;
        public static final int CONSTRUCTOR = 733769682;

        public GetBackgroundUrl() {
        }

        public GetBackgroundUrl(String var1, TdApi.BackgroundType var2) {
            this.name = var1;
            this.type = var2;
        }

        public int getConstructor() {
            return 733769682;
        }
    }

    public static class GetAutosaveSettings extends TdApi.Function<TdApi.AutosaveSettings> {
        public static final int CONSTRUCTOR = 2136207914;

        public GetAutosaveSettings() {
        }

        public int getConstructor() {
            return 2136207914;
        }
    }

    public static class GetAutoDownloadSettingsPresets extends TdApi.Function<TdApi.AutoDownloadSettingsPresets> {
        public static final int CONSTRUCTOR = -1721088201;

        public GetAutoDownloadSettingsPresets() {
        }

        public int getConstructor() {
            return -1721088201;
        }
    }

    public static class GetAuthorizationState extends TdApi.Function<TdApi.AuthorizationState> {
        public static final int CONSTRUCTOR = 1949154877;

        public GetAuthorizationState() {
        }

        public int getConstructor() {
            return 1949154877;
        }
    }

    public static class GetAttachmentMenuBot extends TdApi.Function<TdApi.AttachmentMenuBot> {
        public long botUserId;
        public static final int CONSTRUCTOR = 1034248699;

        public GetAttachmentMenuBot() {
        }

        public GetAttachmentMenuBot(long var1) {
            this.botUserId = var1;
        }

        public int getConstructor() {
            return 1034248699;
        }
    }

    public static class GetAttachedStickerSets extends TdApi.Function<TdApi.StickerSets> {
        public int fileId;
        public static final int CONSTRUCTOR = 1302172429;

        public GetAttachedStickerSets() {
        }

        public GetAttachedStickerSets(int var1) {
            this.fileId = var1;
        }

        public int getConstructor() {
            return 1302172429;
        }
    }

    public static class GetArchivedStories extends TdApi.Function<TdApi.Stories> {
        public int fromStoryId;
        public int limit;
        public static final int CONSTRUCTOR = 1787187175;

        public GetArchivedStories() {
        }

        public GetArchivedStories(int var1, int var2) {
            this.fromStoryId = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return 1787187175;
        }
    }

    public static class GetArchivedStickerSets extends TdApi.Function<TdApi.StickerSets> {
        public TdApi.StickerType stickerType;
        public long offsetStickerSetId;
        public int limit;
        public static final int CONSTRUCTOR = 1001931341;

        public GetArchivedStickerSets() {
        }

        public GetArchivedStickerSets(TdApi.StickerType var1, long var2, int var4) {
            this.stickerType = var1;
            this.offsetStickerSetId = var2;
            this.limit = var4;
        }

        public int getConstructor() {
            return 1001931341;
        }
    }

    public static class GetArchiveChatListSettings extends TdApi.Function<TdApi.ArchiveChatListSettings> {
        public static final int CONSTRUCTOR = -2087874976;

        public GetArchiveChatListSettings() {
        }

        public int getConstructor() {
            return -2087874976;
        }
    }

    public static class GetApplicationDownloadLink extends TdApi.Function<TdApi.HttpUrl> {
        public static final int CONSTRUCTOR = 112013252;

        public GetApplicationDownloadLink() {
        }

        public int getConstructor() {
            return 112013252;
        }
    }

    public static class GetApplicationConfig extends TdApi.Function<TdApi.JsonValue> {
        public static final int CONSTRUCTOR = -1823144318;

        public GetApplicationConfig() {
        }

        public int getConstructor() {
            return -1823144318;
        }
    }

    public static class GetAnimatedEmoji extends TdApi.Function<TdApi.AnimatedEmoji> {
        public String emoji;
        public static final int CONSTRUCTOR = 1065635702;

        public GetAnimatedEmoji() {
        }

        public GetAnimatedEmoji(String var1) {
            this.emoji = var1;
        }

        public int getConstructor() {
            return 1065635702;
        }
    }

    public static class GetAllPassportElements extends TdApi.Function<TdApi.PassportElements> {
        public String password;
        public static final int CONSTRUCTOR = -2038945045;

        public GetAllPassportElements() {
        }

        public GetAllPassportElements(String var1) {
            this.password = var1;
        }

        public int getConstructor() {
            return -2038945045;
        }
    }

    public static class GetActiveSessions extends TdApi.Function<TdApi.Sessions> {
        public static final int CONSTRUCTOR = 1119710526;

        public GetActiveSessions() {
        }

        public int getConstructor() {
            return 1119710526;
        }
    }

    public static class GetActiveLiveLocationMessages extends TdApi.Function<TdApi.Messages> {
        public static final int CONSTRUCTOR = -1425459567;

        public GetActiveLiveLocationMessages() {
        }

        public int getConstructor() {
            return -1425459567;
        }
    }

    public static class GetAccountTtl extends TdApi.Function<TdApi.AccountTtl> {
        public static final int CONSTRUCTOR = -443905161;

        public GetAccountTtl() {
        }

        public int getConstructor() {
            return -443905161;
        }
    }

    public static class ForwardMessages extends TdApi.Function<TdApi.Messages> {
        public long chatId;
        public long messageThreadId;
        public long fromChatId;
        public long[] messageIds;
        public TdApi.MessageSendOptions options;
        public boolean sendCopy;
        public boolean removeCaption;
        public boolean onlyPreview;
        public static final int CONSTRUCTOR = -1054441908;

        public ForwardMessages() {
        }

        public ForwardMessages(long var1, long var3, long var5, long[] var7, TdApi.MessageSendOptions var8, boolean var9, boolean var10, boolean var11) {
            this.chatId = var1;
            this.messageThreadId = var3;
            this.fromChatId = var5;
            this.messageIds = var7;
            this.options = var8;
            this.sendCopy = var9;
            this.removeCaption = var10;
            this.onlyPreview = var11;
        }

        public int getConstructor() {
            return -1054441908;
        }
    }

    public static class FinishFileGeneration extends TdApi.Function<TdApi.Ok> {
        public long generationId;
        public TdApi.Error error;
        public static final int CONSTRUCTOR = -1055060835;

        public FinishFileGeneration() {
        }

        public FinishFileGeneration(long var1, TdApi.Error var3) {
            this.generationId = var1;
            this.error = var3;
        }

        public int getConstructor() {
            return -1055060835;
        }
    }

    public static class EndGroupCallScreenSharing extends TdApi.Function<TdApi.Ok> {
        public int groupCallId;
        public static final int CONSTRUCTOR = -2047599540;

        public EndGroupCallScreenSharing() {
        }

        public EndGroupCallScreenSharing(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return -2047599540;
        }
    }

    public static class EndGroupCallRecording extends TdApi.Function<TdApi.Ok> {
        public int groupCallId;
        public static final int CONSTRUCTOR = -75799927;

        public EndGroupCallRecording() {
        }

        public EndGroupCallRecording(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return -75799927;
        }
    }

    public static class EndGroupCall extends TdApi.Function<TdApi.Ok> {
        public int groupCallId;
        public static final int CONSTRUCTOR = 573131959;

        public EndGroupCall() {
        }

        public EndGroupCall(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return 573131959;
        }
    }

    public static class EnableProxy extends TdApi.Function<TdApi.Ok> {
        public int proxyId;
        public static final int CONSTRUCTOR = 1494450838;

        public EnableProxy() {
        }

        public EnableProxy(int var1) {
            this.proxyId = var1;
        }

        public int getConstructor() {
            return 1494450838;
        }
    }

    public static class EditStory extends TdApi.Function<TdApi.Ok> {
        public int storyId;
        public TdApi.InputStoryContent content;
        public TdApi.InputStoryAreas areas;
        public TdApi.FormattedText caption;
        public static final int CONSTRUCTOR = -1439940986;

        public EditStory() {
        }

        public EditStory(int var1, TdApi.InputStoryContent var2, TdApi.InputStoryAreas var3, TdApi.FormattedText var4) {
            this.storyId = var1;
            this.content = var2;
            this.areas = var3;
            this.caption = var4;
        }

        public int getConstructor() {
            return -1439940986;
        }
    }

    public static class EditProxy extends TdApi.Function<TdApi.Proxy> {
        public int proxyId;
        public String server;
        public int port;
        public boolean enable;
        public TdApi.ProxyType type;
        public static final int CONSTRUCTOR = -1605883821;

        public EditProxy() {
        }

        public EditProxy(int var1, String var2, int var3, boolean var4, TdApi.ProxyType var5) {
            this.proxyId = var1;
            this.server = var2;
            this.port = var3;
            this.enable = var4;
            this.type = var5;
        }

        public int getConstructor() {
            return -1605883821;
        }
    }

    public static class EditMessageText extends TdApi.Function<TdApi.Message> {
        public long chatId;
        public long messageId;
        public TdApi.ReplyMarkup replyMarkup;
        public TdApi.InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 196272567;

        public EditMessageText() {
        }

        public EditMessageText(long var1, long var3, TdApi.ReplyMarkup var5, TdApi.InputMessageContent var6) {
            this.chatId = var1;
            this.messageId = var3;
            this.replyMarkup = var5;
            this.inputMessageContent = var6;
        }

        public int getConstructor() {
            return 196272567;
        }
    }

    public static class EditMessageSchedulingState extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageId;
        public TdApi.MessageSchedulingState schedulingState;
        public static final int CONSTRUCTOR = -1372976192;

        public EditMessageSchedulingState() {
        }

        public EditMessageSchedulingState(long var1, long var3, TdApi.MessageSchedulingState var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.schedulingState = var5;
        }

        public int getConstructor() {
            return -1372976192;
        }
    }

    public static class EditMessageReplyMarkup extends TdApi.Function<TdApi.Message> {
        public long chatId;
        public long messageId;
        public TdApi.ReplyMarkup replyMarkup;
        public static final int CONSTRUCTOR = 332127881;

        public EditMessageReplyMarkup() {
        }

        public EditMessageReplyMarkup(long var1, long var3, TdApi.ReplyMarkup var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.replyMarkup = var5;
        }

        public int getConstructor() {
            return 332127881;
        }
    }

    public static class EditMessageMedia extends TdApi.Function<TdApi.Message> {
        public long chatId;
        public long messageId;
        public TdApi.ReplyMarkup replyMarkup;
        public TdApi.InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = -1152678125;

        public EditMessageMedia() {
        }

        public EditMessageMedia(long var1, long var3, TdApi.ReplyMarkup var5, TdApi.InputMessageContent var6) {
            this.chatId = var1;
            this.messageId = var3;
            this.replyMarkup = var5;
            this.inputMessageContent = var6;
        }

        public int getConstructor() {
            return -1152678125;
        }
    }

    public static class EditMessageLiveLocation extends TdApi.Function<TdApi.Message> {
        public long chatId;
        public long messageId;
        public TdApi.ReplyMarkup replyMarkup;
        public TdApi.Location location;
        public int heading;
        public int proximityAlertRadius;
        public static final int CONSTRUCTOR = -14047982;

        public EditMessageLiveLocation() {
        }

        public EditMessageLiveLocation(long var1, long var3, TdApi.ReplyMarkup var5, TdApi.Location var6, int var7, int var8) {
            this.chatId = var1;
            this.messageId = var3;
            this.replyMarkup = var5;
            this.location = var6;
            this.heading = var7;
            this.proximityAlertRadius = var8;
        }

        public int getConstructor() {
            return -14047982;
        }
    }

    public static class EditMessageCaption extends TdApi.Function<TdApi.Message> {
        public long chatId;
        public long messageId;
        public TdApi.ReplyMarkup replyMarkup;
        public TdApi.FormattedText caption;
        public static final int CONSTRUCTOR = 1154677038;

        public EditMessageCaption() {
        }

        public EditMessageCaption(long var1, long var3, TdApi.ReplyMarkup var5, TdApi.FormattedText var6) {
            this.chatId = var1;
            this.messageId = var3;
            this.replyMarkup = var5;
            this.caption = var6;
        }

        public int getConstructor() {
            return 1154677038;
        }
    }

    public static class EditInlineMessageText extends TdApi.Function<TdApi.Ok> {
        public String inlineMessageId;
        public TdApi.ReplyMarkup replyMarkup;
        public TdApi.InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = -855457307;

        public EditInlineMessageText() {
        }

        public EditInlineMessageText(String var1, TdApi.ReplyMarkup var2, TdApi.InputMessageContent var3) {
            this.inlineMessageId = var1;
            this.replyMarkup = var2;
            this.inputMessageContent = var3;
        }

        public int getConstructor() {
            return -855457307;
        }
    }

    public static class EditInlineMessageReplyMarkup extends TdApi.Function<TdApi.Ok> {
        public String inlineMessageId;
        public TdApi.ReplyMarkup replyMarkup;
        public static final int CONSTRUCTOR = -67565858;

        public EditInlineMessageReplyMarkup() {
        }

        public EditInlineMessageReplyMarkup(String var1, TdApi.ReplyMarkup var2) {
            this.inlineMessageId = var1;
            this.replyMarkup = var2;
        }

        public int getConstructor() {
            return -67565858;
        }
    }

    public static class EditInlineMessageMedia extends TdApi.Function<TdApi.Ok> {
        public String inlineMessageId;
        public TdApi.ReplyMarkup replyMarkup;
        public TdApi.InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 23553921;

        public EditInlineMessageMedia() {
        }

        public EditInlineMessageMedia(String var1, TdApi.ReplyMarkup var2, TdApi.InputMessageContent var3) {
            this.inlineMessageId = var1;
            this.replyMarkup = var2;
            this.inputMessageContent = var3;
        }

        public int getConstructor() {
            return 23553921;
        }
    }

    public static class EditInlineMessageLiveLocation extends TdApi.Function<TdApi.Ok> {
        public String inlineMessageId;
        public TdApi.ReplyMarkup replyMarkup;
        public TdApi.Location location;
        public int heading;
        public int proximityAlertRadius;
        public static final int CONSTRUCTOR = -156902912;

        public EditInlineMessageLiveLocation() {
        }

        public EditInlineMessageLiveLocation(String var1, TdApi.ReplyMarkup var2, TdApi.Location var3, int var4, int var5) {
            this.inlineMessageId = var1;
            this.replyMarkup = var2;
            this.location = var3;
            this.heading = var4;
            this.proximityAlertRadius = var5;
        }

        public int getConstructor() {
            return -156902912;
        }
    }

    public static class EditInlineMessageCaption extends TdApi.Function<TdApi.Ok> {
        public String inlineMessageId;
        public TdApi.ReplyMarkup replyMarkup;
        public TdApi.FormattedText caption;
        public static final int CONSTRUCTOR = -760985929;

        public EditInlineMessageCaption() {
        }

        public EditInlineMessageCaption(String var1, TdApi.ReplyMarkup var2, TdApi.FormattedText var3) {
            this.inlineMessageId = var1;
            this.replyMarkup = var2;
            this.caption = var3;
        }

        public int getConstructor() {
            return -760985929;
        }
    }

    public static class EditForumTopic extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageThreadId;
        public String name;
        public boolean editIconCustomEmoji;
        public long iconCustomEmojiId;
        public static final int CONSTRUCTOR = -1485402016;

        public EditForumTopic() {
        }

        public EditForumTopic(long var1, long var3, String var5, boolean var6, long var7) {
            this.chatId = var1;
            this.messageThreadId = var3;
            this.name = var5;
            this.editIconCustomEmoji = var6;
            this.iconCustomEmojiId = var7;
        }

        public int getConstructor() {
            return -1485402016;
        }
    }

    public static class EditCustomLanguagePackInfo extends TdApi.Function<TdApi.Ok> {
        public TdApi.LanguagePackInfo info;
        public static final int CONSTRUCTOR = 1320751257;

        public EditCustomLanguagePackInfo() {
        }

        public EditCustomLanguagePackInfo(TdApi.LanguagePackInfo var1) {
            this.info = var1;
        }

        public int getConstructor() {
            return 1320751257;
        }
    }

    public static class EditChatInviteLink extends TdApi.Function<TdApi.ChatInviteLink> {
        public long chatId;
        public String inviteLink;
        public String name;
        public int expirationDate;
        public int memberLimit;
        public boolean createsJoinRequest;
        public static final int CONSTRUCTOR = 1320303996;

        public EditChatInviteLink() {
        }

        public EditChatInviteLink(long var1, String var3, String var4, int var5, int var6, boolean var7) {
            this.chatId = var1;
            this.inviteLink = var3;
            this.name = var4;
            this.expirationDate = var5;
            this.memberLimit = var6;
            this.createsJoinRequest = var7;
        }

        public int getConstructor() {
            return 1320303996;
        }
    }

    public static class EditChatFolderInviteLink extends TdApi.Function<TdApi.ChatFolderInviteLink> {
        public int chatFolderId;
        public String inviteLink;
        public String name;
        public long[] chatIds;
        public static final int CONSTRUCTOR = -2141872095;

        public EditChatFolderInviteLink() {
        }

        public EditChatFolderInviteLink(int var1, String var2, String var3, long[] var4) {
            this.chatFolderId = var1;
            this.inviteLink = var2;
            this.name = var3;
            this.chatIds = var4;
        }

        public int getConstructor() {
            return -2141872095;
        }
    }

    public static class EditChatFolder extends TdApi.Function<TdApi.ChatFolderInfo> {
        public int chatFolderId;
        public TdApi.ChatFolder folder;
        public static final int CONSTRUCTOR = 53672754;

        public EditChatFolder() {
        }

        public EditChatFolder(int var1, TdApi.ChatFolder var2) {
            this.chatFolderId = var1;
            this.folder = var2;
        }

        public int getConstructor() {
            return 53672754;
        }
    }

    public static class DownloadFile extends TdApi.Function<TdApi.File> {
        public int fileId;
        public int priority;
        public long offset;
        public long limit;
        public boolean synchronous;
        public static final int CONSTRUCTOR = 1059402292;

        public DownloadFile() {
        }

        public DownloadFile(int var1, int var2, long var3, long var5, boolean var7) {
            this.fileId = var1;
            this.priority = var2;
            this.offset = var3;
            this.limit = var5;
            this.synchronous = var7;
        }

        public int getConstructor() {
            return 1059402292;
        }
    }

    public static class DisconnectWebsite extends TdApi.Function<TdApi.Ok> {
        public long websiteId;
        public static final int CONSTRUCTOR = -778767395;

        public DisconnectWebsite() {
        }

        public DisconnectWebsite(long var1) {
            this.websiteId = var1;
        }

        public int getConstructor() {
            return -778767395;
        }
    }

    public static class DisconnectAllWebsites extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = -1082985981;

        public DisconnectAllWebsites() {
        }

        public int getConstructor() {
            return -1082985981;
        }
    }

    public static class DiscardCall extends TdApi.Function<TdApi.Ok> {
        public int callId;
        public boolean isDisconnected;
        public int duration;
        public boolean isVideo;
        public long connectionId;
        public static final int CONSTRUCTOR = -1784044162;

        public DiscardCall() {
        }

        public DiscardCall(int var1, boolean var2, int var3, boolean var4, long var5) {
            this.callId = var1;
            this.isDisconnected = var2;
            this.duration = var3;
            this.isVideo = var4;
            this.connectionId = var5;
        }

        public int getConstructor() {
            return -1784044162;
        }
    }

    public static class DisableProxy extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = -2100095102;

        public DisableProxy() {
        }

        public int getConstructor() {
            return -2100095102;
        }
    }

    public static class DisableAllSupergroupUsernames extends TdApi.Function<TdApi.Ok> {
        public long supergroupId;
        public static final int CONSTRUCTOR = 843511216;

        public DisableAllSupergroupUsernames() {
        }

        public DisableAllSupergroupUsernames(long var1) {
            this.supergroupId = var1;
        }

        public int getConstructor() {
            return 843511216;
        }
    }

    public static class Destroy extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = 685331274;

        public Destroy() {
        }

        public int getConstructor() {
            return 685331274;
        }
    }

    public static class DeleteStory extends TdApi.Function<TdApi.Ok> {
        public int storyId;
        public static final int CONSTRUCTOR = 1647520262;

        public DeleteStory() {
        }

        public DeleteStory(int var1) {
            this.storyId = var1;
        }

        public int getConstructor() {
            return 1647520262;
        }
    }

    public static class DeleteStickerSet extends TdApi.Function<TdApi.Ok> {
        public String name;
        public static final int CONSTRUCTOR = 1577745325;

        public DeleteStickerSet() {
        }

        public DeleteStickerSet(String var1) {
            this.name = var1;
        }

        public int getConstructor() {
            return 1577745325;
        }
    }

    public static class DeleteSavedOrderInfo extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = 1629058164;

        public DeleteSavedOrderInfo() {
        }

        public int getConstructor() {
            return 1629058164;
        }
    }

    public static class DeleteSavedCredentials extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = 826300114;

        public DeleteSavedCredentials() {
        }

        public int getConstructor() {
            return 826300114;
        }
    }

    public static class DeleteRevokedChatInviteLink extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public String inviteLink;
        public static final int CONSTRUCTOR = -1859711873;

        public DeleteRevokedChatInviteLink() {
        }

        public DeleteRevokedChatInviteLink(long var1, String var3) {
            this.chatId = var1;
            this.inviteLink = var3;
        }

        public int getConstructor() {
            return -1859711873;
        }
    }

    public static class DeleteProfilePhoto extends TdApi.Function<TdApi.Ok> {
        public long profilePhotoId;
        public static final int CONSTRUCTOR = 1319794625;

        public DeleteProfilePhoto() {
        }

        public DeleteProfilePhoto(long var1) {
            this.profilePhotoId = var1;
        }

        public int getConstructor() {
            return 1319794625;
        }
    }

    public static class DeletePassportElement extends TdApi.Function<TdApi.Ok> {
        public TdApi.PassportElementType type;
        public static final int CONSTRUCTOR = -1719555468;

        public DeletePassportElement() {
        }

        public DeletePassportElement(TdApi.PassportElementType var1) {
            this.type = var1;
        }

        public int getConstructor() {
            return -1719555468;
        }
    }

    public static class DeleteMessages extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long[] messageIds;
        public boolean revoke;
        public static final int CONSTRUCTOR = 1130090173;

        public DeleteMessages() {
        }

        public DeleteMessages(long var1, long[] var3, boolean var4) {
            this.chatId = var1;
            this.messageIds = var3;
            this.revoke = var4;
        }

        public int getConstructor() {
            return 1130090173;
        }
    }

    public static class DeleteLanguagePack extends TdApi.Function<TdApi.Ok> {
        public String languagePackId;
        public static final int CONSTRUCTOR = -2108761026;

        public DeleteLanguagePack() {
        }

        public DeleteLanguagePack(String var1) {
            this.languagePackId = var1;
        }

        public int getConstructor() {
            return -2108761026;
        }
    }

    public static class DeleteForumTopic extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageThreadId;
        public static final int CONSTRUCTOR = 1864916152;

        public DeleteForumTopic() {
        }

        public DeleteForumTopic(long var1, long var3) {
            this.chatId = var1;
            this.messageThreadId = var3;
        }

        public int getConstructor() {
            return 1864916152;
        }
    }

    public static class DeleteFile extends TdApi.Function<TdApi.Ok> {
        public int fileId;
        public static final int CONSTRUCTOR = 1807653676;

        public DeleteFile() {
        }

        public DeleteFile(int var1) {
            this.fileId = var1;
        }

        public int getConstructor() {
            return 1807653676;
        }
    }

    public static class DeleteCommands extends TdApi.Function<TdApi.Ok> {
        public TdApi.BotCommandScope scope;
        public String languageCode;
        public static final int CONSTRUCTOR = 1002732586;

        public DeleteCommands() {
        }

        public DeleteCommands(TdApi.BotCommandScope var1, String var2) {
            this.scope = var1;
            this.languageCode = var2;
        }

        public int getConstructor() {
            return 1002732586;
        }
    }

    public static class DeleteChatReplyMarkup extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = 100637531;

        public DeleteChatReplyMarkup() {
        }

        public DeleteChatReplyMarkup(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return 100637531;
        }
    }

    public static class DeleteChatMessagesBySender extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public TdApi.MessageSender senderId;
        public static final int CONSTRUCTOR = -1164235161;

        public DeleteChatMessagesBySender() {
        }

        public DeleteChatMessagesBySender(long var1, TdApi.MessageSender var3) {
            this.chatId = var1;
            this.senderId = var3;
        }

        public int getConstructor() {
            return -1164235161;
        }
    }

    public static class DeleteChatMessagesByDate extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public int minDate;
        public int maxDate;
        public boolean revoke;
        public static final int CONSTRUCTOR = -1639653185;

        public DeleteChatMessagesByDate() {
        }

        public DeleteChatMessagesByDate(long var1, int var3, int var4, boolean var5) {
            this.chatId = var1;
            this.minDate = var3;
            this.maxDate = var4;
            this.revoke = var5;
        }

        public int getConstructor() {
            return -1639653185;
        }
    }

    public static class DeleteChatHistory extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public boolean removeFromChatList;
        public boolean revoke;
        public static final int CONSTRUCTOR = -1472081761;

        public DeleteChatHistory() {
        }

        public DeleteChatHistory(long var1, boolean var3, boolean var4) {
            this.chatId = var1;
            this.removeFromChatList = var3;
            this.revoke = var4;
        }

        public int getConstructor() {
            return -1472081761;
        }
    }

    public static class DeleteChatFolderInviteLink extends TdApi.Function<TdApi.Ok> {
        public int chatFolderId;
        public String inviteLink;
        public static final int CONSTRUCTOR = -930057858;

        public DeleteChatFolderInviteLink() {
        }

        public DeleteChatFolderInviteLink(int var1, String var2) {
            this.chatFolderId = var1;
            this.inviteLink = var2;
        }

        public int getConstructor() {
            return -930057858;
        }
    }

    public static class DeleteChatFolder extends TdApi.Function<TdApi.Ok> {
        public int chatFolderId;
        public long[] leaveChatIds;
        public static final int CONSTRUCTOR = -1956364551;

        public DeleteChatFolder() {
        }

        public DeleteChatFolder(int var1, long[] var2) {
            this.chatFolderId = var1;
            this.leaveChatIds = var2;
        }

        public int getConstructor() {
            return -1956364551;
        }
    }

    public static class DeleteChat extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = -171253666;

        public DeleteChat() {
        }

        public DeleteChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -171253666;
        }
    }

    public static class DeleteAllRevokedChatInviteLinks extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long creatorUserId;
        public static final int CONSTRUCTOR = 1112020698;

        public DeleteAllRevokedChatInviteLinks() {
        }

        public DeleteAllRevokedChatInviteLinks(long var1, long var3) {
            this.chatId = var1;
            this.creatorUserId = var3;
        }

        public int getConstructor() {
            return 1112020698;
        }
    }

    public static class DeleteAllCallMessages extends TdApi.Function<TdApi.Ok> {
        public boolean revoke;
        public static final int CONSTRUCTOR = -1466445325;

        public DeleteAllCallMessages() {
        }

        public DeleteAllCallMessages(boolean var1) {
            this.revoke = var1;
        }

        public int getConstructor() {
            return -1466445325;
        }
    }

    public static class DeleteAccount extends TdApi.Function<TdApi.Ok> {
        public String reason;
        public String password;
        public static final int CONSTRUCTOR = 1395816134;

        public DeleteAccount() {
        }

        public DeleteAccount(String var1, String var2) {
            this.reason = var1;
            this.password = var2;
        }

        public int getConstructor() {
            return 1395816134;
        }
    }

    public static class CreateVideoChat extends TdApi.Function<TdApi.GroupCallId> {
        public long chatId;
        public String title;
        public int startDate;
        public boolean isRtmpStream;
        public static final int CONSTRUCTOR = 2124715405;

        public CreateVideoChat() {
        }

        public CreateVideoChat(long var1, String var3, int var4, boolean var5) {
            this.chatId = var1;
            this.title = var3;
            this.startDate = var4;
            this.isRtmpStream = var5;
        }

        public int getConstructor() {
            return 2124715405;
        }
    }

    public static class CreateTemporaryPassword extends TdApi.Function<TdApi.TemporaryPasswordState> {
        public String password;
        public int validFor;
        public static final int CONSTRUCTOR = -1626509434;

        public CreateTemporaryPassword() {
        }

        public CreateTemporaryPassword(String var1, int var2) {
            this.password = var1;
            this.validFor = var2;
        }

        public int getConstructor() {
            return -1626509434;
        }
    }

    public static class CreateSupergroupChat extends TdApi.Function<TdApi.Chat> {
        public long supergroupId;
        public boolean force;
        public static final int CONSTRUCTOR = 1187475691;

        public CreateSupergroupChat() {
        }

        public CreateSupergroupChat(long var1, boolean var3) {
            this.supergroupId = var1;
            this.force = var3;
        }

        public int getConstructor() {
            return 1187475691;
        }
    }

    public static class CreateSecretChat extends TdApi.Function<TdApi.Chat> {
        public int secretChatId;
        public static final int CONSTRUCTOR = 1930285615;

        public CreateSecretChat() {
        }

        public CreateSecretChat(int var1) {
            this.secretChatId = var1;
        }

        public int getConstructor() {
            return 1930285615;
        }
    }

    public static class CreatePrivateChat extends TdApi.Function<TdApi.Chat> {
        public long userId;
        public boolean force;
        public static final int CONSTRUCTOR = -947758327;

        public CreatePrivateChat() {
        }

        public CreatePrivateChat(long var1, boolean var3) {
            this.userId = var1;
            this.force = var3;
        }

        public int getConstructor() {
            return -947758327;
        }
    }

    public static class CreateNewSupergroupChat extends TdApi.Function<TdApi.Chat> {
        public String title;
        public boolean isForum;
        public boolean isChannel;
        public String description;
        public TdApi.ChatLocation location;
        public int messageAutoDeleteTime;
        public boolean forImport;
        public static final int CONSTRUCTOR = 804058822;

        public CreateNewSupergroupChat() {
        }

        public CreateNewSupergroupChat(String var1, boolean var2, boolean var3, String var4, TdApi.ChatLocation var5, int var6, boolean var7) {
            this.title = var1;
            this.isForum = var2;
            this.isChannel = var3;
            this.description = var4;
            this.location = var5;
            this.messageAutoDeleteTime = var6;
            this.forImport = var7;
        }

        public int getConstructor() {
            return 804058822;
        }
    }

    public static class CreateNewStickerSet extends TdApi.Function<TdApi.StickerSet> {
        public long userId;
        public String title;
        public String name;
        public TdApi.StickerFormat stickerFormat;
        public TdApi.StickerType stickerType;
        public boolean needsRepainting;
        public TdApi.InputSticker[] stickers;
        public String source;
        public static final int CONSTRUCTOR = 1057318406;

        public CreateNewStickerSet() {
        }

        public CreateNewStickerSet(long var1, String var3, String var4, TdApi.StickerFormat var5, TdApi.StickerType var6, boolean var7, TdApi.InputSticker[] var8, String var9) {
            this.userId = var1;
            this.title = var3;
            this.name = var4;
            this.stickerFormat = var5;
            this.stickerType = var6;
            this.needsRepainting = var7;
            this.stickers = var8;
            this.source = var9;
        }

        public int getConstructor() {
            return 1057318406;
        }
    }

    public static class CreateNewSecretChat extends TdApi.Function<TdApi.Chat> {
        public long userId;
        public static final int CONSTRUCTOR = -620682651;

        public CreateNewSecretChat() {
        }

        public CreateNewSecretChat(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return -620682651;
        }
    }

    public static class CreateNewBasicGroupChat extends TdApi.Function<TdApi.Chat> {
        public long[] userIds;
        public String title;
        public int messageAutoDeleteTime;
        public static final int CONSTRUCTOR = 624404360;

        public CreateNewBasicGroupChat() {
        }

        public CreateNewBasicGroupChat(long[] var1, String var2, int var3) {
            this.userIds = var1;
            this.title = var2;
            this.messageAutoDeleteTime = var3;
        }

        public int getConstructor() {
            return 624404360;
        }
    }

    public static class CreateInvoiceLink extends TdApi.Function<TdApi.HttpUrl> {
        public TdApi.InputMessageContent invoice;
        public static final int CONSTRUCTOR = 216787233;

        public CreateInvoiceLink() {
        }

        public CreateInvoiceLink(TdApi.InputMessageContent var1) {
            this.invoice = var1;
        }

        public int getConstructor() {
            return 216787233;
        }
    }

    public static class CreateForumTopic extends TdApi.Function<TdApi.ForumTopicInfo> {
        public long chatId;
        public String name;
        public TdApi.ForumTopicIcon icon;
        public static final int CONSTRUCTOR = -1040570140;

        public CreateForumTopic() {
        }

        public CreateForumTopic(long var1, String var3, TdApi.ForumTopicIcon var4) {
            this.chatId = var1;
            this.name = var3;
            this.icon = var4;
        }

        public int getConstructor() {
            return -1040570140;
        }
    }

    public static class CreateChatInviteLink extends TdApi.Function<TdApi.ChatInviteLink> {
        public long chatId;
        public String name;
        public int expirationDate;
        public int memberLimit;
        public boolean createsJoinRequest;
        public static final int CONSTRUCTOR = 287744833;

        public CreateChatInviteLink() {
        }

        public CreateChatInviteLink(long var1, String var3, int var4, int var5, boolean var6) {
            this.chatId = var1;
            this.name = var3;
            this.expirationDate = var4;
            this.memberLimit = var5;
            this.createsJoinRequest = var6;
        }

        public int getConstructor() {
            return 287744833;
        }
    }

    public static class CreateChatFolderInviteLink extends TdApi.Function<TdApi.ChatFolderInviteLink> {
        public int chatFolderId;
        public String name;
        public long[] chatIds;
        public static final int CONSTRUCTOR = -2037911099;

        public CreateChatFolderInviteLink() {
        }

        public CreateChatFolderInviteLink(int var1, String var2, long[] var3) {
            this.chatFolderId = var1;
            this.name = var2;
            this.chatIds = var3;
        }

        public int getConstructor() {
            return -2037911099;
        }
    }

    public static class CreateChatFolder extends TdApi.Function<TdApi.ChatFolderInfo> {
        public TdApi.ChatFolder folder;
        public static final int CONSTRUCTOR = 1015399680;

        public CreateChatFolder() {
        }

        public CreateChatFolder(TdApi.ChatFolder var1) {
            this.folder = var1;
        }

        public int getConstructor() {
            return 1015399680;
        }
    }

    public static class CreateCall extends TdApi.Function<TdApi.CallId> {
        public long userId;
        public TdApi.CallProtocol protocol;
        public boolean isVideo;
        public static final int CONSTRUCTOR = -1104663024;

        public CreateCall() {
        }

        public CreateCall(long var1, TdApi.CallProtocol var3, boolean var4) {
            this.userId = var1;
            this.protocol = var3;
            this.isVideo = var4;
        }

        public int getConstructor() {
            return -1104663024;
        }
    }

    public static class CreateBasicGroupChat extends TdApi.Function<TdApi.Chat> {
        public long basicGroupId;
        public boolean force;
        public static final int CONSTRUCTOR = 1972024548;

        public CreateBasicGroupChat() {
        }

        public CreateBasicGroupChat(long var1, boolean var3) {
            this.basicGroupId = var1;
            this.force = var3;
        }

        public int getConstructor() {
            return 1972024548;
        }
    }

    public static class ConfirmQrCodeAuthentication extends TdApi.Function<TdApi.Session> {
        public String link;
        public static final int CONSTRUCTOR = -376199379;

        public ConfirmQrCodeAuthentication() {
        }

        public ConfirmQrCodeAuthentication(String var1) {
            this.link = var1;
        }

        public int getConstructor() {
            return -376199379;
        }
    }

    public static class CloseWebApp extends TdApi.Function<TdApi.Ok> {
        public long webAppLaunchId;
        public static final int CONSTRUCTOR = 1755391174;

        public CloseWebApp() {
        }

        public CloseWebApp(long var1) {
            this.webAppLaunchId = var1;
        }

        public int getConstructor() {
            return 1755391174;
        }
    }

    public static class CloseStory extends TdApi.Function<TdApi.Ok> {
        public long storySenderChatId;
        public int storyId;
        public static final int CONSTRUCTOR = 1144852309;

        public CloseStory() {
        }

        public CloseStory(long var1, int var3) {
            this.storySenderChatId = var1;
            this.storyId = var3;
        }

        public int getConstructor() {
            return 1144852309;
        }
    }

    public static class CloseSecretChat extends TdApi.Function<TdApi.Ok> {
        public int secretChatId;
        public static final int CONSTRUCTOR = -471006133;

        public CloseSecretChat() {
        }

        public CloseSecretChat(int var1) {
            this.secretChatId = var1;
        }

        public int getConstructor() {
            return -471006133;
        }
    }

    public static class CloseChat extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = 39749353;

        public CloseChat() {
        }

        public CloseChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 39749353;
        }
    }

    public static class Close extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = -1187782273;

        public Close() {
        }

        public int getConstructor() {
            return -1187782273;
        }
    }

    public static class ClickPremiumSubscriptionButton extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = -369319162;

        public ClickPremiumSubscriptionButton() {
        }

        public int getConstructor() {
            return -369319162;
        }
    }

    public static class ClickChatSponsoredMessage extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = -641687573;

        public ClickChatSponsoredMessage() {
        }

        public ClickChatSponsoredMessage(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return -641687573;
        }
    }

    public static class ClickAnimatedEmojiMessage extends TdApi.Function<TdApi.Sticker> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = 196179554;

        public ClickAnimatedEmojiMessage() {
        }

        public ClickAnimatedEmojiMessage(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return 196179554;
        }
    }

    public static class ClearRecentlyFoundChats extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = -285582542;

        public ClearRecentlyFoundChats() {
        }

        public int getConstructor() {
            return -285582542;
        }
    }

    public static class ClearRecentStickers extends TdApi.Function<TdApi.Ok> {
        public boolean isAttached;
        public static final int CONSTRUCTOR = -321242684;

        public ClearRecentStickers() {
        }

        public ClearRecentStickers(boolean var1) {
            this.isAttached = var1;
        }

        public int getConstructor() {
            return -321242684;
        }
    }

    public static class ClearRecentReactions extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = 1298253650;

        public ClearRecentReactions() {
        }

        public int getConstructor() {
            return 1298253650;
        }
    }

    public static class ClearRecentEmojiStatuses extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = -428749986;

        public ClearRecentEmojiStatuses() {
        }

        public int getConstructor() {
            return -428749986;
        }
    }

    public static class ClearImportedContacts extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = 869503298;

        public ClearImportedContacts() {
        }

        public int getConstructor() {
            return 869503298;
        }
    }

    public static class ClearAutosaveSettingsExceptions extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = 1475109874;

        public ClearAutosaveSettingsExceptions() {
        }

        public int getConstructor() {
            return 1475109874;
        }
    }

    public static class ClearAllDraftMessages extends TdApi.Function<TdApi.Ok> {
        public boolean excludeSecretChats;
        public static final int CONSTRUCTOR = -46369573;

        public ClearAllDraftMessages() {
        }

        public ClearAllDraftMessages(boolean var1) {
            this.excludeSecretChats = var1;
        }

        public int getConstructor() {
            return -46369573;
        }
    }

    public static class CleanFileName extends TdApi.Function<TdApi.Text> {
        public String fileName;
        public static final int CONSTRUCTOR = 967964667;

        public CleanFileName() {
        }

        public CleanFileName(String var1) {
            this.fileName = var1;
        }

        public int getConstructor() {
            return 967964667;
        }
    }

    public static class CheckStickerSetName extends TdApi.Function<TdApi.CheckStickerSetNameResult> {
        public String name;
        public static final int CONSTRUCTOR = -1789392642;

        public CheckStickerSetName() {
        }

        public CheckStickerSetName(String var1) {
            this.name = var1;
        }

        public int getConstructor() {
            return -1789392642;
        }
    }

    public static class CheckRecoveryEmailAddressCode extends TdApi.Function<TdApi.PasswordState> {
        public String code;
        public static final int CONSTRUCTOR = -1997039589;

        public CheckRecoveryEmailAddressCode() {
        }

        public CheckRecoveryEmailAddressCode(String var1) {
            this.code = var1;
        }

        public int getConstructor() {
            return -1997039589;
        }
    }

    public static class CheckPhoneNumberVerificationCode extends TdApi.Function<TdApi.Ok> {
        public String code;
        public static final int CONSTRUCTOR = 1497462718;

        public CheckPhoneNumberVerificationCode() {
        }

        public CheckPhoneNumberVerificationCode(String var1) {
            this.code = var1;
        }

        public int getConstructor() {
            return 1497462718;
        }
    }

    public static class CheckPhoneNumberConfirmationCode extends TdApi.Function<TdApi.Ok> {
        public String code;
        public static final int CONSTRUCTOR = -1348060966;

        public CheckPhoneNumberConfirmationCode() {
        }

        public CheckPhoneNumberConfirmationCode(String var1) {
            this.code = var1;
        }

        public int getConstructor() {
            return -1348060966;
        }
    }

    public static class CheckPasswordRecoveryCode extends TdApi.Function<TdApi.Ok> {
        public String recoveryCode;
        public static final int CONSTRUCTOR = -200794600;

        public CheckPasswordRecoveryCode() {
        }

        public CheckPasswordRecoveryCode(String var1) {
            this.recoveryCode = var1;
        }

        public int getConstructor() {
            return -200794600;
        }
    }

    public static class CheckLoginEmailAddressCode extends TdApi.Function<TdApi.Ok> {
        public TdApi.EmailAddressAuthentication code;
        public static final int CONSTRUCTOR = -1454244766;

        public CheckLoginEmailAddressCode() {
        }

        public CheckLoginEmailAddressCode(TdApi.EmailAddressAuthentication var1) {
            this.code = var1;
        }

        public int getConstructor() {
            return -1454244766;
        }
    }

    public static class CheckEmailAddressVerificationCode extends TdApi.Function<TdApi.Ok> {
        public String code;
        public static final int CONSTRUCTOR = -426386685;

        public CheckEmailAddressVerificationCode() {
        }

        public CheckEmailAddressVerificationCode(String var1) {
            this.code = var1;
        }

        public int getConstructor() {
            return -426386685;
        }
    }

    public static class CheckCreatedPublicChatsLimit extends TdApi.Function<TdApi.Ok> {
        public TdApi.PublicChatType type;
        public static final int CONSTRUCTOR = -445546591;

        public CheckCreatedPublicChatsLimit() {
        }

        public CheckCreatedPublicChatsLimit(TdApi.PublicChatType var1) {
            this.type = var1;
        }

        public int getConstructor() {
            return -445546591;
        }
    }

    public static class CheckChatUsername extends TdApi.Function<TdApi.CheckChatUsernameResult> {
        public long chatId;
        public String username;
        public static final int CONSTRUCTOR = -119119344;

        public CheckChatUsername() {
        }

        public CheckChatUsername(long var1, String var3) {
            this.chatId = var1;
            this.username = var3;
        }

        public int getConstructor() {
            return -119119344;
        }
    }

    public static class CheckChatInviteLink extends TdApi.Function<TdApi.ChatInviteLinkInfo> {
        public String inviteLink;
        public static final int CONSTRUCTOR = -496940997;

        public CheckChatInviteLink() {
        }

        public CheckChatInviteLink(String var1) {
            this.inviteLink = var1;
        }

        public int getConstructor() {
            return -496940997;
        }
    }

    public static class CheckChatFolderInviteLink extends TdApi.Function<TdApi.ChatFolderInviteLinkInfo> {
        public String inviteLink;
        public static final int CONSTRUCTOR = 522557851;

        public CheckChatFolderInviteLink() {
        }

        public CheckChatFolderInviteLink(String var1) {
            this.inviteLink = var1;
        }

        public int getConstructor() {
            return 522557851;
        }
    }

    public static class CheckChangePhoneNumberCode extends TdApi.Function<TdApi.Ok> {
        public String code;
        public static final int CONSTRUCTOR = -1720278429;

        public CheckChangePhoneNumberCode() {
        }

        public CheckChangePhoneNumberCode(String var1) {
            this.code = var1;
        }

        public int getConstructor() {
            return -1720278429;
        }
    }

    public static class CheckAuthenticationPasswordRecoveryCode extends TdApi.Function<TdApi.Ok> {
        public String recoveryCode;
        public static final int CONSTRUCTOR = -603309083;

        public CheckAuthenticationPasswordRecoveryCode() {
        }

        public CheckAuthenticationPasswordRecoveryCode(String var1) {
            this.recoveryCode = var1;
        }

        public int getConstructor() {
            return -603309083;
        }
    }

    public static class CheckAuthenticationPassword extends TdApi.Function<TdApi.Ok> {
        public String password;
        public static final int CONSTRUCTOR = -2025698400;

        public CheckAuthenticationPassword() {
        }

        public CheckAuthenticationPassword(String var1) {
            this.password = var1;
        }

        public int getConstructor() {
            return -2025698400;
        }
    }

    public static class CheckAuthenticationEmailCode extends TdApi.Function<TdApi.Ok> {
        public TdApi.EmailAddressAuthentication code;
        public static final int CONSTRUCTOR = -582827361;

        public CheckAuthenticationEmailCode() {
        }

        public CheckAuthenticationEmailCode(TdApi.EmailAddressAuthentication var1) {
            this.code = var1;
        }

        public int getConstructor() {
            return -582827361;
        }
    }

    public static class CheckAuthenticationCode extends TdApi.Function<TdApi.Ok> {
        public String code;
        public static final int CONSTRUCTOR = -302103382;

        public CheckAuthenticationCode() {
        }

        public CheckAuthenticationCode(String var1) {
            this.code = var1;
        }

        public int getConstructor() {
            return -302103382;
        }
    }

    public static class CheckAuthenticationBotToken extends TdApi.Function<TdApi.Ok> {
        public String token;
        public static final int CONSTRUCTOR = 639321206;

        public CheckAuthenticationBotToken() {
        }

        public CheckAuthenticationBotToken(String var1) {
            this.token = var1;
        }

        public int getConstructor() {
            return 639321206;
        }
    }

    public static class ChangeStickerSet extends TdApi.Function<TdApi.Ok> {
        public long setId;
        public boolean isInstalled;
        public boolean isArchived;
        public static final int CONSTRUCTOR = 449357293;

        public ChangeStickerSet() {
        }

        public ChangeStickerSet(long var1, boolean var3, boolean var4) {
            this.setId = var1;
            this.isInstalled = var3;
            this.isArchived = var4;
        }

        public int getConstructor() {
            return 449357293;
        }
    }

    public static class ChangePhoneNumber extends TdApi.Function<TdApi.AuthenticationCodeInfo> {
        public String phoneNumber;
        public TdApi.PhoneNumberAuthenticationSettings settings;
        public static final int CONSTRUCTOR = -124666973;

        public ChangePhoneNumber() {
        }

        public ChangePhoneNumber(String var1, TdApi.PhoneNumberAuthenticationSettings var2) {
            this.phoneNumber = var1;
            this.settings = var2;
        }

        public int getConstructor() {
            return -124666973;
        }
    }

    public static class ChangeImportedContacts extends TdApi.Function<TdApi.ImportedContacts> {
        public TdApi.Contact[] contacts;
        public static final int CONSTRUCTOR = 1968207955;

        public ChangeImportedContacts() {
        }

        public ChangeImportedContacts(TdApi.Contact[] var1) {
            this.contacts = var1;
        }

        public int getConstructor() {
            return 1968207955;
        }
    }

    public static class CancelPreliminaryUploadFile extends TdApi.Function<TdApi.Ok> {
        public int fileId;
        public static final int CONSTRUCTOR = 823412414;

        public CancelPreliminaryUploadFile() {
        }

        public CancelPreliminaryUploadFile(int var1) {
            this.fileId = var1;
        }

        public int getConstructor() {
            return 823412414;
        }
    }

    public static class CancelPasswordReset extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = 940733538;

        public CancelPasswordReset() {
        }

        public int getConstructor() {
            return 940733538;
        }
    }

    public static class CancelDownloadFile extends TdApi.Function<TdApi.Ok> {
        public int fileId;
        public boolean onlyIfPending;
        public static final int CONSTRUCTOR = -1954524450;

        public CancelDownloadFile() {
        }

        public CancelDownloadFile(int var1, boolean var2) {
            this.fileId = var1;
            this.onlyIfPending = var2;
        }

        public int getConstructor() {
            return -1954524450;
        }
    }

    public static class CanTransferOwnership extends TdApi.Function<TdApi.CanTransferOwnershipResult> {
        public static final int CONSTRUCTOR = 634602508;

        public CanTransferOwnership() {
        }

        public int getConstructor() {
            return 634602508;
        }
    }

    public static class CanSendStory extends TdApi.Function<TdApi.CanSendStoryResult> {
        public static final int CONSTRUCTOR = -303744410;

        public CanSendStory() {
        }

        public int getConstructor() {
            return -303744410;
        }
    }

    public static class CanPurchasePremium extends TdApi.Function<TdApi.Ok> {
        public TdApi.StorePaymentPurpose purpose;
        public static final int CONSTRUCTOR = -371319616;

        public CanPurchasePremium() {
        }

        public CanPurchasePremium(TdApi.StorePaymentPurpose var1) {
            this.purpose = var1;
        }

        public int getConstructor() {
            return -371319616;
        }
    }

    public static class BlockMessageSenderFromReplies extends TdApi.Function<TdApi.Ok> {
        public long messageId;
        public boolean deleteMessage;
        public boolean deleteAllMessages;
        public boolean reportSpam;
        public static final int CONSTRUCTOR = -1214384757;

        public BlockMessageSenderFromReplies() {
        }

        public BlockMessageSenderFromReplies(long var1, boolean var3, boolean var4, boolean var5) {
            this.messageId = var1;
            this.deleteMessage = var3;
            this.deleteAllMessages = var4;
            this.reportSpam = var5;
        }

        public int getConstructor() {
            return -1214384757;
        }
    }

    public static class BanChatMember extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public TdApi.MessageSender memberId;
        public int bannedUntilDate;
        public boolean revokeMessages;
        public static final int CONSTRUCTOR = -888111748;

        public BanChatMember() {
        }

        public BanChatMember(long var1, TdApi.MessageSender var3, int var4, boolean var5) {
            this.chatId = var1;
            this.memberId = var3;
            this.bannedUntilDate = var4;
            this.revokeMessages = var5;
        }

        public int getConstructor() {
            return -888111748;
        }
    }

    public static class AssignGooglePlayTransaction extends TdApi.Function<TdApi.Ok> {
        public String packageName;
        public String storeProductId;
        public String purchaseToken;
        public TdApi.StorePaymentPurpose purpose;
        public static final int CONSTRUCTOR = -1992704860;

        public AssignGooglePlayTransaction() {
        }

        public AssignGooglePlayTransaction(String var1, String var2, String var3, TdApi.StorePaymentPurpose var4) {
            this.packageName = var1;
            this.storeProductId = var2;
            this.purchaseToken = var3;
            this.purpose = var4;
        }

        public int getConstructor() {
            return -1992704860;
        }
    }

    public static class AssignAppStoreTransaction extends TdApi.Function<TdApi.Ok> {
        public byte[] receipt;
        public TdApi.StorePaymentPurpose purpose;
        public static final int CONSTRUCTOR = -2030892112;

        public AssignAppStoreTransaction() {
        }

        public AssignAppStoreTransaction(byte[] var1, TdApi.StorePaymentPurpose var2) {
            this.receipt = var1;
            this.purpose = var2;
        }

        public int getConstructor() {
            return -2030892112;
        }
    }

    public static class AnswerWebAppQuery extends TdApi.Function<TdApi.SentWebAppMessage> {
        public String webAppQueryId;
        public TdApi.InputInlineQueryResult result;
        public static final int CONSTRUCTOR = -1598776079;

        public AnswerWebAppQuery() {
        }

        public AnswerWebAppQuery(String var1, TdApi.InputInlineQueryResult var2) {
            this.webAppQueryId = var1;
            this.result = var2;
        }

        public int getConstructor() {
            return -1598776079;
        }
    }

    public static class AnswerShippingQuery extends TdApi.Function<TdApi.Ok> {
        public long shippingQueryId;
        public TdApi.ShippingOption[] shippingOptions;
        public String errorMessage;
        public static final int CONSTRUCTOR = -434601324;

        public AnswerShippingQuery() {
        }

        public AnswerShippingQuery(long var1, TdApi.ShippingOption[] var3, String var4) {
            this.shippingQueryId = var1;
            this.shippingOptions = var3;
            this.errorMessage = var4;
        }

        public int getConstructor() {
            return -434601324;
        }
    }

    public static class AnswerPreCheckoutQuery extends TdApi.Function<TdApi.Ok> {
        public long preCheckoutQueryId;
        public String errorMessage;
        public static final int CONSTRUCTOR = -1486789653;

        public AnswerPreCheckoutQuery() {
        }

        public AnswerPreCheckoutQuery(long var1, String var3) {
            this.preCheckoutQueryId = var1;
            this.errorMessage = var3;
        }

        public int getConstructor() {
            return -1486789653;
        }
    }

    public static class AnswerInlineQuery extends TdApi.Function<TdApi.Ok> {
        public long inlineQueryId;
        public boolean isPersonal;
        public TdApi.InlineQueryResultsButton button;
        public TdApi.InputInlineQueryResult[] results;
        public int cacheTime;
        public String nextOffset;
        public static final int CONSTRUCTOR = 1343853844;

        public AnswerInlineQuery() {
        }

        public AnswerInlineQuery(long var1, boolean var3, TdApi.InlineQueryResultsButton var4, TdApi.InputInlineQueryResult[] var5, int var6, String var7) {
            this.inlineQueryId = var1;
            this.isPersonal = var3;
            this.button = var4;
            this.results = var5;
            this.cacheTime = var6;
            this.nextOffset = var7;
        }

        public int getConstructor() {
            return 1343853844;
        }
    }

    public static class AnswerCustomQuery extends TdApi.Function<TdApi.Ok> {
        public long customQueryId;
        public String data;
        public static final int CONSTRUCTOR = -1293603521;

        public AnswerCustomQuery() {
        }

        public AnswerCustomQuery(long var1, String var3) {
            this.customQueryId = var1;
            this.data = var3;
        }

        public int getConstructor() {
            return -1293603521;
        }
    }

    public static class AnswerCallbackQuery extends TdApi.Function<TdApi.Ok> {
        public long callbackQueryId;
        public String text;
        public boolean showAlert;
        public String url;
        public int cacheTime;
        public static final int CONSTRUCTOR = -1153028490;

        public AnswerCallbackQuery() {
        }

        public AnswerCallbackQuery(long var1, String var3, boolean var4, String var5, int var6) {
            this.callbackQueryId = var1;
            this.text = var3;
            this.showAlert = var4;
            this.url = var5;
            this.cacheTime = var6;
        }

        public int getConstructor() {
            return -1153028490;
        }
    }

    public static class AddStickerToSet extends TdApi.Function<TdApi.Ok> {
        public long userId;
        public String name;
        public TdApi.InputSticker sticker;
        public static final int CONSTRUCTOR = 1457266235;

        public AddStickerToSet() {
        }

        public AddStickerToSet(long var1, String var3, TdApi.InputSticker var4) {
            this.userId = var1;
            this.name = var3;
            this.sticker = var4;
        }

        public int getConstructor() {
            return 1457266235;
        }
    }

    public static class AddSavedNotificationSound extends TdApi.Function<TdApi.NotificationSound> {
        public TdApi.InputFile sound;
        public static final int CONSTRUCTOR = 1043956975;

        public AddSavedNotificationSound() {
        }

        public AddSavedNotificationSound(TdApi.InputFile var1) {
            this.sound = var1;
        }

        public int getConstructor() {
            return 1043956975;
        }
    }

    public static class AddSavedAnimation extends TdApi.Function<TdApi.Ok> {
        public TdApi.InputFile animation;
        public static final int CONSTRUCTOR = -1538525088;

        public AddSavedAnimation() {
        }

        public AddSavedAnimation(TdApi.InputFile var1) {
            this.animation = var1;
        }

        public int getConstructor() {
            return -1538525088;
        }
    }

    public static class AddRecentlyFoundChat extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = -1746396787;

        public AddRecentlyFoundChat() {
        }

        public AddRecentlyFoundChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -1746396787;
        }
    }

    public static class AddRecentSticker extends TdApi.Function<TdApi.Stickers> {
        public boolean isAttached;
        public TdApi.InputFile sticker;
        public static final int CONSTRUCTOR = -1478109026;

        public AddRecentSticker() {
        }

        public AddRecentSticker(boolean var1, TdApi.InputFile var2) {
            this.isAttached = var1;
            this.sticker = var2;
        }

        public int getConstructor() {
            return -1478109026;
        }
    }

    public static class AddProxy extends TdApi.Function<TdApi.Proxy> {
        public String server;
        public int port;
        public boolean enable;
        public TdApi.ProxyType type;
        public static final int CONSTRUCTOR = 331529432;

        public AddProxy() {
        }

        public AddProxy(String var1, int var2, boolean var3, TdApi.ProxyType var4) {
            this.server = var1;
            this.port = var2;
            this.enable = var3;
            this.type = var4;
        }

        public int getConstructor() {
            return 331529432;
        }
    }

    public static class AddNetworkStatistics extends TdApi.Function<TdApi.Ok> {
        public TdApi.NetworkStatisticsEntry entry;
        public static final int CONSTRUCTOR = 1264825305;

        public AddNetworkStatistics() {
        }

        public AddNetworkStatistics(TdApi.NetworkStatisticsEntry var1) {
            this.entry = var1;
        }

        public int getConstructor() {
            return 1264825305;
        }
    }

    public static class AddMessageReaction extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long messageId;
        public TdApi.ReactionType reactionType;
        public boolean isBig;
        public boolean updateRecentReactions;
        public static final int CONSTRUCTOR = 1419269613;

        public AddMessageReaction() {
        }

        public AddMessageReaction(long var1, long var3, TdApi.ReactionType var5, boolean var6, boolean var7) {
            this.chatId = var1;
            this.messageId = var3;
            this.reactionType = var5;
            this.isBig = var6;
            this.updateRecentReactions = var7;
        }

        public int getConstructor() {
            return 1419269613;
        }
    }

    public static class AddLogMessage extends TdApi.Function<TdApi.Ok> {
        public int verbosityLevel;
        public String text;
        public static final int CONSTRUCTOR = 1597427692;

        public AddLogMessage() {
        }

        public AddLogMessage(int var1, String var2) {
            this.verbosityLevel = var1;
            this.text = var2;
        }

        public int getConstructor() {
            return 1597427692;
        }
    }

    public static class AddLocalMessage extends TdApi.Function<TdApi.Message> {
        public long chatId;
        public TdApi.MessageSender senderId;
        public TdApi.MessageReplyTo replyTo;
        public boolean disableNotification;
        public TdApi.InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 1725960611;

        public AddLocalMessage() {
        }

        public AddLocalMessage(long var1, TdApi.MessageSender var3, TdApi.MessageReplyTo var4, boolean var5, TdApi.InputMessageContent var6) {
            this.chatId = var1;
            this.senderId = var3;
            this.replyTo = var4;
            this.disableNotification = var5;
            this.inputMessageContent = var6;
        }

        public int getConstructor() {
            return 1725960611;
        }
    }

    public static class AddFileToDownloads extends TdApi.Function<TdApi.File> {
        public int fileId;
        public long chatId;
        public long messageId;
        public int priority;
        public static final int CONSTRUCTOR = 867533751;

        public AddFileToDownloads() {
        }

        public AddFileToDownloads(int var1, long var2, long var4, int var6) {
            this.fileId = var1;
            this.chatId = var2;
            this.messageId = var4;
            this.priority = var6;
        }

        public int getConstructor() {
            return 867533751;
        }
    }

    public static class AddFavoriteSticker extends TdApi.Function<TdApi.Ok> {
        public TdApi.InputFile sticker;
        public static final int CONSTRUCTOR = 324504799;

        public AddFavoriteSticker() {
        }

        public AddFavoriteSticker(TdApi.InputFile var1) {
            this.sticker = var1;
        }

        public int getConstructor() {
            return 324504799;
        }
    }

    public static class AddCustomServerLanguagePack extends TdApi.Function<TdApi.Ok> {
        public String languagePackId;
        public static final int CONSTRUCTOR = 4492771;

        public AddCustomServerLanguagePack() {
        }

        public AddCustomServerLanguagePack(String var1) {
            this.languagePackId = var1;
        }

        public int getConstructor() {
            return 4492771;
        }
    }

    public static class AddContact extends TdApi.Function<TdApi.Ok> {
        public TdApi.Contact contact;
        public boolean sharePhoneNumber;
        public static final int CONSTRUCTOR = 1869640000;

        public AddContact() {
        }

        public AddContact(TdApi.Contact var1, boolean var2) {
            this.contact = var1;
            this.sharePhoneNumber = var2;
        }

        public int getConstructor() {
            return 1869640000;
        }
    }

    public static class AddChatToList extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public TdApi.ChatList chatList;
        public static final int CONSTRUCTOR = -80523595;

        public AddChatToList() {
        }

        public AddChatToList(long var1, TdApi.ChatList var3) {
            this.chatId = var1;
            this.chatList = var3;
        }

        public int getConstructor() {
            return -80523595;
        }
    }

    public static class AddChatMembers extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long[] userIds;
        public static final int CONSTRUCTOR = -519951226;

        public AddChatMembers() {
        }

        public AddChatMembers(long var1, long[] var3) {
            this.chatId = var1;
            this.userIds = var3;
        }

        public int getConstructor() {
            return -519951226;
        }
    }

    public static class AddChatMember extends TdApi.Function<TdApi.Ok> {
        public long chatId;
        public long userId;
        public int forwardLimit;
        public static final int CONSTRUCTOR = 499426810;

        public AddChatMember() {
        }

        public AddChatMember(long var1, long var3, int var5) {
            this.chatId = var1;
            this.userId = var3;
            this.forwardLimit = var5;
        }

        public int getConstructor() {
            return 499426810;
        }
    }

    public static class AddChatFolderByInviteLink extends TdApi.Function<TdApi.Ok> {
        public String inviteLink;
        public long[] chatIds;
        public static final int CONSTRUCTOR = -858593816;

        public AddChatFolderByInviteLink() {
        }

        public AddChatFolderByInviteLink(String var1, long[] var2) {
            this.inviteLink = var1;
            this.chatIds = var2;
        }

        public int getConstructor() {
            return -858593816;
        }
    }

    public static class AddApplicationChangelog extends TdApi.Function<TdApi.Ok> {
        public String previousApplicationVersion;
        public static final int CONSTRUCTOR = -1946976311;

        public AddApplicationChangelog() {
        }

        public AddApplicationChangelog(String var1) {
            this.previousApplicationVersion = var1;
        }

        public int getConstructor() {
            return -1946976311;
        }
    }

    public static class ActivateStoryStealthMode extends TdApi.Function<TdApi.Ok> {
        public static final int CONSTRUCTOR = -1009023855;

        public ActivateStoryStealthMode() {
        }

        public int getConstructor() {
            return -1009023855;
        }
    }

    public static class AcceptTermsOfService extends TdApi.Function<TdApi.Ok> {
        public String termsOfServiceId;
        public static final int CONSTRUCTOR = 2130576356;

        public AcceptTermsOfService() {
        }

        public AcceptTermsOfService(String var1) {
            this.termsOfServiceId = var1;
        }

        public int getConstructor() {
            return 2130576356;
        }
    }

    public static class AcceptCall extends TdApi.Function<TdApi.Ok> {
        public int callId;
        public TdApi.CallProtocol protocol;
        public static final int CONSTRUCTOR = -646618416;

        public AcceptCall() {
        }

        public AcceptCall(int var1, TdApi.CallProtocol var2) {
            this.callId = var1;
            this.protocol = var2;
        }

        public int getConstructor() {
            return -646618416;
        }
    }

    public static class WebPageInstantView extends TdApi.Object {
        public TdApi.PageBlock[] pageBlocks;
        public int viewCount;
        public int version;
        public boolean isRtl;
        public boolean isFull;
        public TdApi.InternalLinkType feedbackLink;
        public static final int CONSTRUCTOR = 778202453;

        public WebPageInstantView() {
        }

        public WebPageInstantView(TdApi.PageBlock[] var1, int var2, int var3, boolean var4, boolean var5, TdApi.InternalLinkType var6) {
            this.pageBlocks = var1;
            this.viewCount = var2;
            this.version = var3;
            this.isRtl = var4;
            this.isFull = var5;
            this.feedbackLink = var6;
        }

        public int getConstructor() {
            return 778202453;
        }
    }

    public static class WebPage extends TdApi.Object {
        public String url;
        public String displayUrl;
        public String type;
        public String siteName;
        public String title;
        public TdApi.FormattedText description;
        public TdApi.Photo photo;
        public String embedUrl;
        public String embedType;
        public int embedWidth;
        public int embedHeight;
        public int duration;
        public String author;
        public TdApi.Animation animation;
        public TdApi.Audio audio;
        public TdApi.Document document;
        public TdApi.Sticker sticker;
        public TdApi.Video video;
        public TdApi.VideoNote videoNote;
        public TdApi.VoiceNote voiceNote;
        public long storySenderChatId;
        public int storyId;
        public int instantViewVersion;
        public static final int CONSTRUCTOR = 448212608;

        public WebPage() {
        }

        public WebPage(String var1, String var2, String var3, String var4, String var5, TdApi.FormattedText var6, TdApi.Photo var7, String var8, String var9, int var10, int var11, int var12, String var13, TdApi.Animation var14, TdApi.Audio var15, TdApi.Document var16, TdApi.Sticker var17, TdApi.Video var18, TdApi.VideoNote var19, TdApi.VoiceNote var20, long var21, int var23, int var24) {
            this.url = var1;
            this.displayUrl = var2;
            this.type = var3;
            this.siteName = var4;
            this.title = var5;
            this.description = var6;
            this.photo = var7;
            this.embedUrl = var8;
            this.embedType = var9;
            this.embedWidth = var10;
            this.embedHeight = var11;
            this.duration = var12;
            this.author = var13;
            this.animation = var14;
            this.audio = var15;
            this.document = var16;
            this.sticker = var17;
            this.video = var18;
            this.videoNote = var19;
            this.voiceNote = var20;
            this.storySenderChatId = var21;
            this.storyId = var23;
            this.instantViewVersion = var24;
        }

        public int getConstructor() {
            return 448212608;
        }
    }

    public static class WebAppInfo extends TdApi.Object {
        public long launchId;
        public String url;
        public static final int CONSTRUCTOR = 788378344;

        public WebAppInfo() {
        }

        public WebAppInfo(long var1, String var3) {
            this.launchId = var1;
            this.url = var3;
        }

        public int getConstructor() {
            return 788378344;
        }
    }

    public static class WebApp extends TdApi.Object {
        public String shortName;
        public String title;
        public String description;
        public TdApi.Photo photo;
        public TdApi.Animation animation;
        public static final int CONSTRUCTOR = 1616619763;

        public WebApp() {
        }

        public WebApp(String var1, String var2, String var3, TdApi.Photo var4, TdApi.Animation var5) {
            this.shortName = var1;
            this.title = var2;
            this.description = var3;
            this.photo = var4;
            this.animation = var5;
        }

        public int getConstructor() {
            return 1616619763;
        }
    }

    public static class VoiceNote extends TdApi.Object {
        public int duration;
        public byte[] waveform;
        public String mimeType;
        public TdApi.SpeechRecognitionResult speechRecognitionResult;
        public TdApi.File voice;
        public static final int CONSTRUCTOR = -1175302923;

        public VoiceNote() {
        }

        public VoiceNote(int var1, byte[] var2, String var3, TdApi.SpeechRecognitionResult var4, TdApi.File var5) {
            this.duration = var1;
            this.waveform = var2;
            this.mimeType = var3;
            this.speechRecognitionResult = var4;
            this.voice = var5;
        }

        public int getConstructor() {
            return -1175302923;
        }
    }

    public static class VideoNote extends TdApi.Object {
        public int duration;
        public byte[] waveform;
        public int length;
        public TdApi.Minithumbnail minithumbnail;
        public TdApi.Thumbnail thumbnail;
        public TdApi.SpeechRecognitionResult speechRecognitionResult;
        public TdApi.File video;
        public static final int CONSTRUCTOR = 2062096581;

        public VideoNote() {
        }

        public VideoNote(int var1, byte[] var2, int var3, TdApi.Minithumbnail var4, TdApi.Thumbnail var5, TdApi.SpeechRecognitionResult var6, TdApi.File var7) {
            this.duration = var1;
            this.waveform = var2;
            this.length = var3;
            this.minithumbnail = var4;
            this.thumbnail = var5;
            this.speechRecognitionResult = var6;
            this.video = var7;
        }

        public int getConstructor() {
            return 2062096581;
        }
    }

    public static class VideoChat extends TdApi.Object {
        public int groupCallId;
        public boolean hasParticipants;
        public TdApi.MessageSender defaultParticipantId;
        public static final int CONSTRUCTOR = -1374319320;

        public VideoChat() {
        }

        public VideoChat(int var1, boolean var2, TdApi.MessageSender var3) {
            this.groupCallId = var1;
            this.hasParticipants = var2;
            this.defaultParticipantId = var3;
        }

        public int getConstructor() {
            return -1374319320;
        }
    }

    public static class Video extends TdApi.Object {
        public int duration;
        public int width;
        public int height;
        public String fileName;
        public String mimeType;
        public boolean hasStickers;
        public boolean supportsStreaming;
        public TdApi.Minithumbnail minithumbnail;
        public TdApi.Thumbnail thumbnail;
        public TdApi.File video;
        public static final int CONSTRUCTOR = 832856268;

        public Video() {
        }

        public Video(int var1, int var2, int var3, String var4, String var5, boolean var6, boolean var7, TdApi.Minithumbnail var8, TdApi.Thumbnail var9, TdApi.File var10) {
            this.duration = var1;
            this.width = var2;
            this.height = var3;
            this.fileName = var4;
            this.mimeType = var5;
            this.hasStickers = var6;
            this.supportsStreaming = var7;
            this.minithumbnail = var8;
            this.thumbnail = var9;
            this.video = var10;
        }

        public int getConstructor() {
            return 832856268;
        }
    }

    public static class Venue extends TdApi.Object {
        public TdApi.Location location;
        public String title;
        public String address;
        public String provider;
        public String id;
        public String type;
        public static final int CONSTRUCTOR = 1070406393;

        public Venue() {
        }

        public Venue(TdApi.Location var1, String var2, String var3, String var4, String var5, String var6) {
            this.location = var1;
            this.title = var2;
            this.address = var3;
            this.provider = var4;
            this.id = var5;
            this.type = var6;
        }

        public int getConstructor() {
            return 1070406393;
        }
    }

    public static class VectorPathCommandCubicBezierCurve extends TdApi.VectorPathCommand {
        public TdApi.Point startControlPoint;
        public TdApi.Point endControlPoint;
        public TdApi.Point endPoint;
        public static final int CONSTRUCTOR = 1229733434;

        public VectorPathCommandCubicBezierCurve() {
        }

        public VectorPathCommandCubicBezierCurve(TdApi.Point var1, TdApi.Point var2, TdApi.Point var3) {
            this.startControlPoint = var1;
            this.endControlPoint = var2;
            this.endPoint = var3;
        }

        public int getConstructor() {
            return 1229733434;
        }
    }

    public static class VectorPathCommandLine extends TdApi.VectorPathCommand {
        public TdApi.Point endPoint;
        public static final int CONSTRUCTOR = -614056822;

        public VectorPathCommandLine() {
        }

        public VectorPathCommandLine(TdApi.Point var1) {
            this.endPoint = var1;
        }

        public int getConstructor() {
            return -614056822;
        }
    }

    public abstract static class VectorPathCommand extends TdApi.Object {
        public VectorPathCommand() {
        }
    }

    public static class ValidatedOrderInfo extends TdApi.Object {
        public String orderInfoId;
        public TdApi.ShippingOption[] shippingOptions;
        public static final int CONSTRUCTOR = 1511451484;

        public ValidatedOrderInfo() {
        }

        public ValidatedOrderInfo(String var1, TdApi.ShippingOption[] var2) {
            this.orderInfoId = var1;
            this.shippingOptions = var2;
        }

        public int getConstructor() {
            return 1511451484;
        }
    }

    public static class Users extends TdApi.Object {
        public int totalCount;
        public long[] userIds;
        public static final int CONSTRUCTOR = 171203420;

        public Users() {
        }

        public Users(int var1, long[] var2) {
            this.totalCount = var1;
            this.userIds = var2;
        }

        public int getConstructor() {
            return 171203420;
        }
    }

    public static class Usernames extends TdApi.Object {
        public String[] activeUsernames;
        public String[] disabledUsernames;
        public String editableUsername;
        public static final int CONSTRUCTOR = 799608565;

        public Usernames() {
        }

        public Usernames(String[] var1, String[] var2, String var3) {
            this.activeUsernames = var1;
            this.disabledUsernames = var2;
            this.editableUsername = var3;
        }

        public int getConstructor() {
            return 799608565;
        }
    }

    public static class UserTypeUnknown extends TdApi.UserType {
        public static final int CONSTRUCTOR = -724541123;

        public UserTypeUnknown() {
        }

        public int getConstructor() {
            return -724541123;
        }
    }

    public static class UserTypeBot extends TdApi.UserType {
        public boolean canBeEdited;
        public boolean canJoinGroups;
        public boolean canReadAllGroupMessages;
        public boolean isInline;
        public String inlineQueryPlaceholder;
        public boolean needLocation;
        public boolean canBeAddedToAttachmentMenu;
        public static final int CONSTRUCTOR = -109451376;

        public UserTypeBot() {
        }

        public UserTypeBot(boolean var1, boolean var2, boolean var3, boolean var4, String var5, boolean var6, boolean var7) {
            this.canBeEdited = var1;
            this.canJoinGroups = var2;
            this.canReadAllGroupMessages = var3;
            this.isInline = var4;
            this.inlineQueryPlaceholder = var5;
            this.needLocation = var6;
            this.canBeAddedToAttachmentMenu = var7;
        }

        public int getConstructor() {
            return -109451376;
        }
    }

    public static class UserTypeDeleted extends TdApi.UserType {
        public static final int CONSTRUCTOR = -1807729372;

        public UserTypeDeleted() {
        }

        public int getConstructor() {
            return -1807729372;
        }
    }

    public static class UserTypeRegular extends TdApi.UserType {
        public static final int CONSTRUCTOR = -598644325;

        public UserTypeRegular() {
        }

        public int getConstructor() {
            return -598644325;
        }
    }

    public abstract static class UserType extends TdApi.Object {
        public UserType() {
        }
    }

    public static class UserSupportInfo extends TdApi.Object {
        public TdApi.FormattedText message;
        public String author;
        public int date;
        public static final int CONSTRUCTOR = -1257366487;

        public UserSupportInfo() {
        }

        public UserSupportInfo(TdApi.FormattedText var1, String var2, int var3) {
            this.message = var1;
            this.author = var2;
            this.date = var3;
        }

        public int getConstructor() {
            return -1257366487;
        }
    }

    public static class UserStatusLastMonth extends TdApi.UserStatus {
        public static final int CONSTRUCTOR = 2011940674;

        public UserStatusLastMonth() {
        }

        public int getConstructor() {
            return 2011940674;
        }
    }

    public static class UserStatusLastWeek extends TdApi.UserStatus {
        public static final int CONSTRUCTOR = 129960444;

        public UserStatusLastWeek() {
        }

        public int getConstructor() {
            return 129960444;
        }
    }

    public static class UserStatusRecently extends TdApi.UserStatus {
        public static final int CONSTRUCTOR = -496024847;

        public UserStatusRecently() {
        }

        public int getConstructor() {
            return -496024847;
        }
    }

    public static class UserStatusOffline extends TdApi.UserStatus {
        public int wasOnline;
        public static final int CONSTRUCTOR = -759984891;

        public UserStatusOffline() {
        }

        public UserStatusOffline(int var1) {
            this.wasOnline = var1;
        }

        public int getConstructor() {
            return -759984891;
        }
    }

    public static class UserStatusOnline extends TdApi.UserStatus {
        public int expires;
        public static final int CONSTRUCTOR = -1529460876;

        public UserStatusOnline() {
        }

        public UserStatusOnline(int var1) {
            this.expires = var1;
        }

        public int getConstructor() {
            return -1529460876;
        }
    }

    public static class UserStatusEmpty extends TdApi.UserStatus {
        public static final int CONSTRUCTOR = 164646985;

        public UserStatusEmpty() {
        }

        public int getConstructor() {
            return 164646985;
        }
    }

    public abstract static class UserStatus extends TdApi.Object {
        public UserStatus() {
        }
    }

    public static class UserPrivacySettingRules extends TdApi.Object {
        public TdApi.UserPrivacySettingRule[] rules;
        public static final int CONSTRUCTOR = 322477541;

        public UserPrivacySettingRules() {
        }

        public UserPrivacySettingRules(TdApi.UserPrivacySettingRule[] var1) {
            this.rules = var1;
        }

        public int getConstructor() {
            return 322477541;
        }
    }

    public static class UserPrivacySettingRuleRestrictChatMembers extends TdApi.UserPrivacySettingRule {
        public long[] chatIds;
        public static final int CONSTRUCTOR = 392530897;

        public UserPrivacySettingRuleRestrictChatMembers() {
        }

        public UserPrivacySettingRuleRestrictChatMembers(long[] var1) {
            this.chatIds = var1;
        }

        public int getConstructor() {
            return 392530897;
        }
    }

    public static class UserPrivacySettingRuleRestrictUsers extends TdApi.UserPrivacySettingRule {
        public long[] userIds;
        public static final int CONSTRUCTOR = 622796522;

        public UserPrivacySettingRuleRestrictUsers() {
        }

        public UserPrivacySettingRuleRestrictUsers(long[] var1) {
            this.userIds = var1;
        }

        public int getConstructor() {
            return 622796522;
        }
    }

    public static class UserPrivacySettingRuleRestrictContacts extends TdApi.UserPrivacySettingRule {
        public static final int CONSTRUCTOR = 1008389378;

        public UserPrivacySettingRuleRestrictContacts() {
        }

        public int getConstructor() {
            return 1008389378;
        }
    }

    public static class UserPrivacySettingRuleRestrictAll extends TdApi.UserPrivacySettingRule {
        public static final int CONSTRUCTOR = -1406495408;

        public UserPrivacySettingRuleRestrictAll() {
        }

        public int getConstructor() {
            return -1406495408;
        }
    }

    public static class UserPrivacySettingRuleAllowChatMembers extends TdApi.UserPrivacySettingRule {
        public long[] chatIds;
        public static final int CONSTRUCTOR = -2048749863;

        public UserPrivacySettingRuleAllowChatMembers() {
        }

        public UserPrivacySettingRuleAllowChatMembers(long[] var1) {
            this.chatIds = var1;
        }

        public int getConstructor() {
            return -2048749863;
        }
    }

    public static class UserPrivacySettingRuleAllowUsers extends TdApi.UserPrivacySettingRule {
        public long[] userIds;
        public static final int CONSTRUCTOR = 1110988334;

        public UserPrivacySettingRuleAllowUsers() {
        }

        public UserPrivacySettingRuleAllowUsers(long[] var1) {
            this.userIds = var1;
        }

        public int getConstructor() {
            return 1110988334;
        }
    }

    public static class UserPrivacySettingRuleAllowContacts extends TdApi.UserPrivacySettingRule {
        public static final int CONSTRUCTOR = -1892733680;

        public UserPrivacySettingRuleAllowContacts() {
        }

        public int getConstructor() {
            return -1892733680;
        }
    }

    public static class UserPrivacySettingRuleAllowAll extends TdApi.UserPrivacySettingRule {
        public static final int CONSTRUCTOR = -1967186881;

        public UserPrivacySettingRuleAllowAll() {
        }

        public int getConstructor() {
            return -1967186881;
        }
    }

    public abstract static class UserPrivacySettingRule extends TdApi.Object {
        public UserPrivacySettingRule() {
        }
    }

    public static class UserPrivacySettingAllowPrivateVoiceAndVideoNoteMessages extends TdApi.UserPrivacySetting {
        public static final int CONSTRUCTOR = 338112060;

        public UserPrivacySettingAllowPrivateVoiceAndVideoNoteMessages() {
        }

        public int getConstructor() {
            return 338112060;
        }
    }

    public static class UserPrivacySettingAllowFindingByPhoneNumber extends TdApi.UserPrivacySetting {
        public static final int CONSTRUCTOR = -1846645423;

        public UserPrivacySettingAllowFindingByPhoneNumber() {
        }

        public int getConstructor() {
            return -1846645423;
        }
    }

    public static class UserPrivacySettingAllowPeerToPeerCalls extends TdApi.UserPrivacySetting {
        public static final int CONSTRUCTOR = 352500032;

        public UserPrivacySettingAllowPeerToPeerCalls() {
        }

        public int getConstructor() {
            return 352500032;
        }
    }

    public static class UserPrivacySettingAllowCalls extends TdApi.UserPrivacySetting {
        public static final int CONSTRUCTOR = -906967291;

        public UserPrivacySettingAllowCalls() {
        }

        public int getConstructor() {
            return -906967291;
        }
    }

    public static class UserPrivacySettingAllowChatInvites extends TdApi.UserPrivacySetting {
        public static final int CONSTRUCTOR = 1271668007;

        public UserPrivacySettingAllowChatInvites() {
        }

        public int getConstructor() {
            return 1271668007;
        }
    }

    public static class UserPrivacySettingShowBio extends TdApi.UserPrivacySetting {
        public static final int CONSTRUCTOR = 959981409;

        public UserPrivacySettingShowBio() {
        }

        public int getConstructor() {
            return 959981409;
        }
    }

    public static class UserPrivacySettingShowPhoneNumber extends TdApi.UserPrivacySetting {
        public static final int CONSTRUCTOR = -791567831;

        public UserPrivacySettingShowPhoneNumber() {
        }

        public int getConstructor() {
            return -791567831;
        }
    }

    public static class UserPrivacySettingShowLinkInForwardedMessages extends TdApi.UserPrivacySetting {
        public static final int CONSTRUCTOR = 592688870;

        public UserPrivacySettingShowLinkInForwardedMessages() {
        }

        public int getConstructor() {
            return 592688870;
        }
    }

    public static class UserPrivacySettingShowProfilePhoto extends TdApi.UserPrivacySetting {
        public static final int CONSTRUCTOR = 1408485877;

        public UserPrivacySettingShowProfilePhoto() {
        }

        public int getConstructor() {
            return 1408485877;
        }
    }

    public static class UserPrivacySettingShowStatus extends TdApi.UserPrivacySetting {
        public static final int CONSTRUCTOR = 1862829310;

        public UserPrivacySettingShowStatus() {
        }

        public int getConstructor() {
            return 1862829310;
        }
    }

    public abstract static class UserPrivacySetting extends TdApi.Object {
        public UserPrivacySetting() {
        }
    }

    public static class UserLink extends TdApi.Object {
        public String url;
        public int expiresIn;
        public static final int CONSTRUCTOR = 498138872;

        public UserLink() {
        }

        public UserLink(String var1, int var2) {
            this.url = var1;
            this.expiresIn = var2;
        }

        public int getConstructor() {
            return 498138872;
        }
    }

    public static class UserFullInfo extends TdApi.Object {
        public TdApi.ChatPhoto personalPhoto;
        public TdApi.ChatPhoto photo;
        public TdApi.ChatPhoto publicPhoto;
        public TdApi.BlockList blockList;
        public boolean canBeCalled;
        public boolean supportsVideoCalls;
        public boolean hasPrivateCalls;
        public boolean hasPrivateForwards;
        public boolean hasRestrictedVoiceAndVideoNoteMessages;
        public boolean hasPinnedStories;
        public boolean needPhoneNumberPrivacyException;
        public TdApi.FormattedText bio;
        public TdApi.PremiumPaymentOption[] premiumGiftOptions;
        public int groupInCommonCount;
        public TdApi.BotInfo botInfo;
        public static final int CONSTRUCTOR = -842820179;

        public UserFullInfo() {
        }

        public UserFullInfo(TdApi.ChatPhoto var1, TdApi.ChatPhoto var2, TdApi.ChatPhoto var3, TdApi.BlockList var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9, boolean var10, boolean var11, TdApi.FormattedText var12, TdApi.PremiumPaymentOption[] var13, int var14, TdApi.BotInfo var15) {
            this.personalPhoto = var1;
            this.photo = var2;
            this.publicPhoto = var3;
            this.blockList = var4;
            this.canBeCalled = var5;
            this.supportsVideoCalls = var6;
            this.hasPrivateCalls = var7;
            this.hasPrivateForwards = var8;
            this.hasRestrictedVoiceAndVideoNoteMessages = var9;
            this.hasPinnedStories = var10;
            this.needPhoneNumberPrivacyException = var11;
            this.bio = var12;
            this.premiumGiftOptions = var13;
            this.groupInCommonCount = var14;
            this.botInfo = var15;
        }

        public int getConstructor() {
            return -842820179;
        }
    }

    public static class User extends TdApi.Object {
        public long id;
        public String firstName;
        public String lastName;
        public TdApi.Usernames usernames;
        public String phoneNumber;
        public TdApi.UserStatus status;
        public TdApi.ProfilePhoto profilePhoto;
        public TdApi.EmojiStatus emojiStatus;
        public boolean isContact;
        public boolean isMutualContact;
        public boolean isCloseFriend;
        public boolean isVerified;
        public boolean isPremium;
        public boolean isSupport;
        public String restrictionReason;
        public boolean isScam;
        public boolean isFake;
        public boolean hasActiveStories;
        public boolean hasUnreadActiveStories;
        public boolean haveAccess;
        public TdApi.UserType type;
        public String languageCode;
        public boolean addedToAttachmentMenu;
        public static final int CONSTRUCTOR = -1788161326;

        public User() {
        }

        public User(long var1, String var3, String var4, TdApi.Usernames var5, String var6, TdApi.UserStatus var7, TdApi.ProfilePhoto var8, TdApi.EmojiStatus var9, boolean var10, boolean var11, boolean var12, boolean var13, boolean var14, boolean var15, String var16, boolean var17, boolean var18, boolean var19, boolean var20, boolean var21, TdApi.UserType var22, String var23, boolean var24) {
            this.id = var1;
            this.firstName = var3;
            this.lastName = var4;
            this.usernames = var5;
            this.phoneNumber = var6;
            this.status = var7;
            this.profilePhoto = var8;
            this.emojiStatus = var9;
            this.isContact = var10;
            this.isMutualContact = var11;
            this.isCloseFriend = var12;
            this.isVerified = var13;
            this.isPremium = var14;
            this.isSupport = var15;
            this.restrictionReason = var16;
            this.isScam = var17;
            this.isFake = var18;
            this.hasActiveStories = var19;
            this.hasUnreadActiveStories = var20;
            this.haveAccess = var21;
            this.type = var22;
            this.languageCode = var23;
            this.addedToAttachmentMenu = var24;
        }

        public int getConstructor() {
            return -1788161326;
        }
    }

    public static class Updates extends TdApi.Object {
        public TdApi.Update[] updates;
        public static final int CONSTRUCTOR = 475842347;

        public Updates() {
        }

        public Updates(TdApi.Update[] var1) {
            this.updates = var1;
        }

        public int getConstructor() {
            return 475842347;
        }
    }

    public static class UpdateNewChatJoinRequest extends TdApi.Update {
        public long chatId;
        public TdApi.ChatJoinRequest request;
        public long userChatId;
        public TdApi.ChatInviteLink inviteLink;
        public static final int CONSTRUCTOR = 2118694979;

        public UpdateNewChatJoinRequest() {
        }

        public UpdateNewChatJoinRequest(long var1, TdApi.ChatJoinRequest var3, long var4, TdApi.ChatInviteLink var6) {
            this.chatId = var1;
            this.request = var3;
            this.userChatId = var4;
            this.inviteLink = var6;
        }

        public int getConstructor() {
            return 2118694979;
        }
    }

    public static class UpdateChatMember extends TdApi.Update {
        public long chatId;
        public long actorUserId;
        public int date;
        public TdApi.ChatInviteLink inviteLink;
        public boolean viaChatFolderInviteLink;
        public TdApi.ChatMember oldChatMember;
        public TdApi.ChatMember newChatMember;
        public static final int CONSTRUCTOR = 1610670748;

        public UpdateChatMember() {
        }

        public UpdateChatMember(long var1, long var3, int var5, TdApi.ChatInviteLink var6, boolean var7, TdApi.ChatMember var8, TdApi.ChatMember var9) {
            this.chatId = var1;
            this.actorUserId = var3;
            this.date = var5;
            this.inviteLink = var6;
            this.viaChatFolderInviteLink = var7;
            this.oldChatMember = var8;
            this.newChatMember = var9;
        }

        public int getConstructor() {
            return 1610670748;
        }
    }

    public static class UpdatePollAnswer extends TdApi.Update {
        public long pollId;
        public TdApi.MessageSender voterId;
        public int[] optionIds;
        public static final int CONSTRUCTOR = 1104905219;

        public UpdatePollAnswer() {
        }

        public UpdatePollAnswer(long var1, TdApi.MessageSender var3, int[] var4) {
            this.pollId = var1;
            this.voterId = var3;
            this.optionIds = var4;
        }

        public int getConstructor() {
            return 1104905219;
        }
    }

    public static class UpdatePoll extends TdApi.Update {
        public TdApi.Poll poll;
        public static final int CONSTRUCTOR = -1771342902;

        public UpdatePoll() {
        }

        public UpdatePoll(TdApi.Poll var1) {
            this.poll = var1;
        }

        public int getConstructor() {
            return -1771342902;
        }
    }

    public static class UpdateNewCustomQuery extends TdApi.Update {
        public long id;
        public String data;
        public int timeout;
        public static final int CONSTRUCTOR = -687670874;

        public UpdateNewCustomQuery() {
        }

        public UpdateNewCustomQuery(long var1, String var3, int var4) {
            this.id = var1;
            this.data = var3;
            this.timeout = var4;
        }

        public int getConstructor() {
            return -687670874;
        }
    }

    public static class UpdateNewCustomEvent extends TdApi.Update {
        public String event;
        public static final int CONSTRUCTOR = 1994222092;

        public UpdateNewCustomEvent() {
        }

        public UpdateNewCustomEvent(String var1) {
            this.event = var1;
        }

        public int getConstructor() {
            return 1994222092;
        }
    }

    public static class UpdateNewPreCheckoutQuery extends TdApi.Update {
        public long id;
        public long senderUserId;
        public String currency;
        public long totalAmount;
        public byte[] invoicePayload;
        public String shippingOptionId;
        public TdApi.OrderInfo orderInfo;
        public static final int CONSTRUCTOR = 708342217;

        public UpdateNewPreCheckoutQuery() {
        }

        public UpdateNewPreCheckoutQuery(long var1, long var3, String var5, long var6, byte[] var8, String var9, TdApi.OrderInfo var10) {
            this.id = var1;
            this.senderUserId = var3;
            this.currency = var5;
            this.totalAmount = var6;
            this.invoicePayload = var8;
            this.shippingOptionId = var9;
            this.orderInfo = var10;
        }

        public int getConstructor() {
            return 708342217;
        }
    }

    public static class UpdateNewShippingQuery extends TdApi.Update {
        public long id;
        public long senderUserId;
        public String invoicePayload;
        public TdApi.Address shippingAddress;
        public static final int CONSTRUCTOR = 693651058;

        public UpdateNewShippingQuery() {
        }

        public UpdateNewShippingQuery(long var1, long var3, String var5, TdApi.Address var6) {
            this.id = var1;
            this.senderUserId = var3;
            this.invoicePayload = var5;
            this.shippingAddress = var6;
        }

        public int getConstructor() {
            return 693651058;
        }
    }

    public static class UpdateNewInlineCallbackQuery extends TdApi.Update {
        public long id;
        public long senderUserId;
        public String inlineMessageId;
        public long chatInstance;
        public TdApi.CallbackQueryPayload payload;
        public static final int CONSTRUCTOR = -319212358;

        public UpdateNewInlineCallbackQuery() {
        }

        public UpdateNewInlineCallbackQuery(long var1, long var3, String var5, long var6, TdApi.CallbackQueryPayload var8) {
            this.id = var1;
            this.senderUserId = var3;
            this.inlineMessageId = var5;
            this.chatInstance = var6;
            this.payload = var8;
        }

        public int getConstructor() {
            return -319212358;
        }
    }

    public static class UpdateNewCallbackQuery extends TdApi.Update {
        public long id;
        public long senderUserId;
        public long chatId;
        public long messageId;
        public long chatInstance;
        public TdApi.CallbackQueryPayload payload;
        public static final int CONSTRUCTOR = -1989881762;

        public UpdateNewCallbackQuery() {
        }

        public UpdateNewCallbackQuery(long var1, long var3, long var5, long var7, long var9, TdApi.CallbackQueryPayload var11) {
            this.id = var1;
            this.senderUserId = var3;
            this.chatId = var5;
            this.messageId = var7;
            this.chatInstance = var9;
            this.payload = var11;
        }

        public int getConstructor() {
            return -1989881762;
        }
    }

    public static class UpdateNewChosenInlineResult extends TdApi.Update {
        public long senderUserId;
        public TdApi.Location userLocation;
        public String query;
        public String resultId;
        public String inlineMessageId;
        public static final int CONSTRUCTOR = -884191395;

        public UpdateNewChosenInlineResult() {
        }

        public UpdateNewChosenInlineResult(long var1, TdApi.Location var3, String var4, String var5, String var6) {
            this.senderUserId = var1;
            this.userLocation = var3;
            this.query = var4;
            this.resultId = var5;
            this.inlineMessageId = var6;
        }

        public int getConstructor() {
            return -884191395;
        }
    }

    public static class UpdateNewInlineQuery extends TdApi.Update {
        public long id;
        public long senderUserId;
        public TdApi.Location userLocation;
        public TdApi.ChatType chatType;
        public String query;
        public String offset;
        public static final int CONSTRUCTOR = 1903279924;

        public UpdateNewInlineQuery() {
        }

        public UpdateNewInlineQuery(long var1, long var3, TdApi.Location var5, TdApi.ChatType var6, String var7, String var8) {
            this.id = var1;
            this.senderUserId = var3;
            this.userLocation = var5;
            this.chatType = var6;
            this.query = var7;
            this.offset = var8;
        }

        public int getConstructor() {
            return 1903279924;
        }
    }

    public static class UpdateAutosaveSettings extends TdApi.Update {
        public TdApi.AutosaveSettingsScope scope;
        public TdApi.ScopeAutosaveSettings settings;
        public static final int CONSTRUCTOR = -634958069;

        public UpdateAutosaveSettings() {
        }

        public UpdateAutosaveSettings(TdApi.AutosaveSettingsScope var1, TdApi.ScopeAutosaveSettings var2) {
            this.scope = var1;
            this.settings = var2;
        }

        public int getConstructor() {
            return -634958069;
        }
    }

    public static class UpdateAddChatMembersPrivacyForbidden extends TdApi.Update {
        public long chatId;
        public long[] userIds;
        public static final int CONSTRUCTOR = 1435865611;

        public UpdateAddChatMembersPrivacyForbidden() {
        }

        public UpdateAddChatMembersPrivacyForbidden(long var1, long[] var3) {
            this.chatId = var1;
            this.userIds = var3;
        }

        public int getConstructor() {
            return 1435865611;
        }
    }

    public static class UpdateSuggestedActions extends TdApi.Update {
        public TdApi.SuggestedAction[] addedActions;
        public TdApi.SuggestedAction[] removedActions;
        public static final int CONSTRUCTOR = 1459452346;

        public UpdateSuggestedActions() {
        }

        public UpdateSuggestedActions(TdApi.SuggestedAction[] var1, TdApi.SuggestedAction[] var2) {
            this.addedActions = var1;
            this.removedActions = var2;
        }

        public int getConstructor() {
            return 1459452346;
        }
    }

    public static class UpdateAnimationSearchParameters extends TdApi.Update {
        public String provider;
        public String[] emojis;
        public static final int CONSTRUCTOR = -1144983202;

        public UpdateAnimationSearchParameters() {
        }

        public UpdateAnimationSearchParameters(String var1, String[] var2) {
            this.provider = var1;
            this.emojis = var2;
        }

        public int getConstructor() {
            return -1144983202;
        }
    }

    public static class UpdateAnimatedEmojiMessageClicked extends TdApi.Update {
        public long chatId;
        public long messageId;
        public TdApi.Sticker sticker;
        public static final int CONSTRUCTOR = -1558809595;

        public UpdateAnimatedEmojiMessageClicked() {
        }

        public UpdateAnimatedEmojiMessageClicked(long var1, long var3, TdApi.Sticker var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.sticker = var5;
        }

        public int getConstructor() {
            return -1558809595;
        }
    }

    public static class UpdateDiceEmojis extends TdApi.Update {
        public String[] emojis;
        public static final int CONSTRUCTOR = -1069066940;

        public UpdateDiceEmojis() {
        }

        public UpdateDiceEmojis(String[] var1) {
            this.emojis = var1;
        }

        public int getConstructor() {
            return -1069066940;
        }
    }

    public static class UpdateDefaultReactionType extends TdApi.Update {
        public TdApi.ReactionType reactionType;
        public static final int CONSTRUCTOR = 1264668933;

        public UpdateDefaultReactionType() {
        }

        public UpdateDefaultReactionType(TdApi.ReactionType var1) {
            this.reactionType = var1;
        }

        public int getConstructor() {
            return 1264668933;
        }
    }

    public static class UpdateActiveEmojiReactions extends TdApi.Update {
        public String[] emojis;
        public static final int CONSTRUCTOR = 77556818;

        public UpdateActiveEmojiReactions() {
        }

        public UpdateActiveEmojiReactions(String[] var1) {
            this.emojis = var1;
        }

        public int getConstructor() {
            return 77556818;
        }
    }

    public static class UpdateWebAppMessageSent extends TdApi.Update {
        public long webAppLaunchId;
        public static final int CONSTRUCTOR = 1480790569;

        public UpdateWebAppMessageSent() {
        }

        public UpdateWebAppMessageSent(long var1) {
            this.webAppLaunchId = var1;
        }

        public int getConstructor() {
            return 1480790569;
        }
    }

    public static class UpdateAttachmentMenuBots extends TdApi.Update {
        public TdApi.AttachmentMenuBot[] bots;
        public static final int CONSTRUCTOR = 291369922;

        public UpdateAttachmentMenuBots() {
        }

        public UpdateAttachmentMenuBots(TdApi.AttachmentMenuBot[] var1) {
            this.bots = var1;
        }

        public int getConstructor() {
            return 291369922;
        }
    }

    public static class UpdateUsersNearby extends TdApi.Update {
        public TdApi.ChatNearby[] usersNearby;
        public static final int CONSTRUCTOR = -1517109163;

        public UpdateUsersNearby() {
        }

        public UpdateUsersNearby(TdApi.ChatNearby[] var1) {
            this.usersNearby = var1;
        }

        public int getConstructor() {
            return -1517109163;
        }
    }

    public static class UpdateTermsOfService extends TdApi.Update {
        public String termsOfServiceId;
        public TdApi.TermsOfService termsOfService;
        public static final int CONSTRUCTOR = -1304640162;

        public UpdateTermsOfService() {
        }

        public UpdateTermsOfService(String var1, TdApi.TermsOfService var2) {
            this.termsOfServiceId = var1;
            this.termsOfService = var2;
        }

        public int getConstructor() {
            return -1304640162;
        }
    }

    public static class UpdateConnectionState extends TdApi.Update {
        public TdApi.ConnectionState state;
        public static final int CONSTRUCTOR = 1469292078;

        public UpdateConnectionState() {
        }

        public UpdateConnectionState(TdApi.ConnectionState var1) {
            this.state = var1;
        }

        public int getConstructor() {
            return 1469292078;
        }
    }

    public static class UpdateLanguagePackStrings extends TdApi.Update {
        public String localizationTarget;
        public String languagePackId;
        public TdApi.LanguagePackString[] strings;
        public static final int CONSTRUCTOR = -1056319886;

        public UpdateLanguagePackStrings() {
        }

        public UpdateLanguagePackStrings(String var1, String var2, TdApi.LanguagePackString[] var3) {
            this.localizationTarget = var1;
            this.languagePackId = var2;
            this.strings = var3;
        }

        public int getConstructor() {
            return -1056319886;
        }
    }

    public static class UpdateChatThemes extends TdApi.Update {
        public TdApi.ChatTheme[] chatThemes;
        public static final int CONSTRUCTOR = -1588098376;

        public UpdateChatThemes() {
        }

        public UpdateChatThemes(TdApi.ChatTheme[] var1) {
            this.chatThemes = var1;
        }

        public int getConstructor() {
            return -1588098376;
        }
    }

    public static class UpdateSelectedBackground extends TdApi.Update {
        public boolean forDarkTheme;
        public TdApi.Background background;
        public static final int CONSTRUCTOR = -1715658659;

        public UpdateSelectedBackground() {
        }

        public UpdateSelectedBackground(boolean var1, TdApi.Background var2) {
            this.forDarkTheme = var1;
            this.background = var2;
        }

        public int getConstructor() {
            return -1715658659;
        }
    }

    public static class UpdateSavedNotificationSounds extends TdApi.Update {
        public long[] notificationSoundIds;
        public static final int CONSTRUCTOR = 1052725698;

        public UpdateSavedNotificationSounds() {
        }

        public UpdateSavedNotificationSounds(long[] var1) {
            this.notificationSoundIds = var1;
        }

        public int getConstructor() {
            return 1052725698;
        }
    }

    public static class UpdateSavedAnimations extends TdApi.Update {
        public int[] animationIds;
        public static final int CONSTRUCTOR = 65563814;

        public UpdateSavedAnimations() {
        }

        public UpdateSavedAnimations(int[] var1) {
            this.animationIds = var1;
        }

        public int getConstructor() {
            return 65563814;
        }
    }

    public static class UpdateFavoriteStickers extends TdApi.Update {
        public int[] stickerIds;
        public static final int CONSTRUCTOR = 1662240999;

        public UpdateFavoriteStickers() {
        }

        public UpdateFavoriteStickers(int[] var1) {
            this.stickerIds = var1;
        }

        public int getConstructor() {
            return 1662240999;
        }
    }

    public static class UpdateRecentStickers extends TdApi.Update {
        public boolean isAttached;
        public int[] stickerIds;
        public static final int CONSTRUCTOR = 1906403540;

        public UpdateRecentStickers() {
        }

        public UpdateRecentStickers(boolean var1, int[] var2) {
            this.isAttached = var1;
            this.stickerIds = var2;
        }

        public int getConstructor() {
            return 1906403540;
        }
    }

    public static class UpdateTrendingStickerSets extends TdApi.Update {
        public TdApi.StickerType stickerType;
        public TdApi.TrendingStickerSets stickerSets;
        public static final int CONSTRUCTOR = 1266307239;

        public UpdateTrendingStickerSets() {
        }

        public UpdateTrendingStickerSets(TdApi.StickerType var1, TdApi.TrendingStickerSets var2) {
            this.stickerType = var1;
            this.stickerSets = var2;
        }

        public int getConstructor() {
            return 1266307239;
        }
    }

    public static class UpdateInstalledStickerSets extends TdApi.Update {
        public TdApi.StickerType stickerType;
        public long[] stickerSetIds;
        public static final int CONSTRUCTOR = -1735084182;

        public UpdateInstalledStickerSets() {
        }

        public UpdateInstalledStickerSets(TdApi.StickerType var1, long[] var2) {
            this.stickerType = var1;
            this.stickerSetIds = var2;
        }

        public int getConstructor() {
            return -1735084182;
        }
    }

    public static class UpdateStickerSet extends TdApi.Update {
        public TdApi.StickerSet stickerSet;
        public static final int CONSTRUCTOR = 1879268812;

        public UpdateStickerSet() {
        }

        public UpdateStickerSet(TdApi.StickerSet var1) {
            this.stickerSet = var1;
        }

        public int getConstructor() {
            return 1879268812;
        }
    }

    public static class UpdateOption extends TdApi.Update {
        public String name;
        public TdApi.OptionValue value;
        public static final int CONSTRUCTOR = 900822020;

        public UpdateOption() {
        }

        public UpdateOption(String var1, TdApi.OptionValue var2) {
            this.name = var1;
            this.value = var2;
        }

        public int getConstructor() {
            return 900822020;
        }
    }

    public static class UpdateStoryStealthMode extends TdApi.Update {
        public int activeUntilDate;
        public int cooldownUntilDate;
        public static final int CONSTRUCTOR = 1878506778;

        public UpdateStoryStealthMode() {
        }

        public UpdateStoryStealthMode(int var1, int var2) {
            this.activeUntilDate = var1;
            this.cooldownUntilDate = var2;
        }

        public int getConstructor() {
            return 1878506778;
        }
    }

    public static class UpdateStoryListChatCount extends TdApi.Update {
        public TdApi.StoryList storyList;
        public int chatCount;
        public static final int CONSTRUCTOR = -2009871041;

        public UpdateStoryListChatCount() {
        }

        public UpdateStoryListChatCount(TdApi.StoryList var1, int var2) {
            this.storyList = var1;
            this.chatCount = var2;
        }

        public int getConstructor() {
            return -2009871041;
        }
    }

    public static class UpdateChatActiveStories extends TdApi.Update {
        public TdApi.ChatActiveStories activeStories;
        public static final int CONSTRUCTOR = 2037935148;

        public UpdateChatActiveStories() {
        }

        public UpdateChatActiveStories(TdApi.ChatActiveStories var1) {
            this.activeStories = var1;
        }

        public int getConstructor() {
            return 2037935148;
        }
    }

    public static class UpdateStorySendFailed extends TdApi.Update {
        public TdApi.Story story;
        public TdApi.CanSendStoryResult error;
        public int errorCode;
        public String errorMessage;
        public static final int CONSTRUCTOR = 1142471842;

        public UpdateStorySendFailed() {
        }

        public UpdateStorySendFailed(TdApi.Story var1, TdApi.CanSendStoryResult var2, int var3, String var4) {
            this.story = var1;
            this.error = var2;
            this.errorCode = var3;
            this.errorMessage = var4;
        }

        public int getConstructor() {
            return 1142471842;
        }
    }

    public static class UpdateStorySendSucceeded extends TdApi.Update {
        public TdApi.Story story;
        public int oldStoryId;
        public static final int CONSTRUCTOR = -1188651433;

        public UpdateStorySendSucceeded() {
        }

        public UpdateStorySendSucceeded(TdApi.Story var1, int var2) {
            this.story = var1;
            this.oldStoryId = var2;
        }

        public int getConstructor() {
            return -1188651433;
        }
    }

    public static class UpdateStoryDeleted extends TdApi.Update {
        public long storySenderChatId;
        public int storyId;
        public static final int CONSTRUCTOR = 1879567261;

        public UpdateStoryDeleted() {
        }

        public UpdateStoryDeleted(long var1, int var3) {
            this.storySenderChatId = var1;
            this.storyId = var3;
        }

        public int getConstructor() {
            return 1879567261;
        }
    }

    public static class UpdateStory extends TdApi.Update {
        public TdApi.Story story;
        public static final int CONSTRUCTOR = 419845935;

        public UpdateStory() {
        }

        public UpdateStory(TdApi.Story var1) {
            this.story = var1;
        }

        public int getConstructor() {
            return 419845935;
        }
    }

    public static class UpdateUnreadChatCount extends TdApi.Update {
        public TdApi.ChatList chatList;
        public int totalCount;
        public int unreadCount;
        public int unreadUnmutedCount;
        public int markedAsUnreadCount;
        public int markedAsUnreadUnmutedCount;
        public static final int CONSTRUCTOR = 1994494530;

        public UpdateUnreadChatCount() {
        }

        public UpdateUnreadChatCount(TdApi.ChatList var1, int var2, int var3, int var4, int var5, int var6) {
            this.chatList = var1;
            this.totalCount = var2;
            this.unreadCount = var3;
            this.unreadUnmutedCount = var4;
            this.markedAsUnreadCount = var5;
            this.markedAsUnreadUnmutedCount = var6;
        }

        public int getConstructor() {
            return 1994494530;
        }
    }

    public static class UpdateUnreadMessageCount extends TdApi.Update {
        public TdApi.ChatList chatList;
        public int unreadCount;
        public int unreadUnmutedCount;
        public static final int CONSTRUCTOR = 78987721;

        public UpdateUnreadMessageCount() {
        }

        public UpdateUnreadMessageCount(TdApi.ChatList var1, int var2, int var3) {
            this.chatList = var1;
            this.unreadCount = var2;
            this.unreadUnmutedCount = var3;
        }

        public int getConstructor() {
            return 78987721;
        }
    }

    public static class UpdateUserPrivacySettingRules extends TdApi.Update {
        public TdApi.UserPrivacySetting setting;
        public TdApi.UserPrivacySettingRules rules;
        public static final int CONSTRUCTOR = -912960778;

        public UpdateUserPrivacySettingRules() {
        }

        public UpdateUserPrivacySettingRules(TdApi.UserPrivacySetting var1, TdApi.UserPrivacySettingRules var2) {
            this.setting = var1;
            this.rules = var2;
        }

        public int getConstructor() {
            return -912960778;
        }
    }

    public static class UpdateNewCallSignalingData extends TdApi.Update {
        public int callId;
        public byte[] data;
        public static final int CONSTRUCTOR = 583634317;

        public UpdateNewCallSignalingData() {
        }

        public UpdateNewCallSignalingData(int var1, byte[] var2) {
            this.callId = var1;
            this.data = var2;
        }

        public int getConstructor() {
            return 583634317;
        }
    }

    public static class UpdateGroupCallParticipant extends TdApi.Update {
        public int groupCallId;
        public TdApi.GroupCallParticipant participant;
        public static final int CONSTRUCTOR = -803128071;

        public UpdateGroupCallParticipant() {
        }

        public UpdateGroupCallParticipant(int var1, TdApi.GroupCallParticipant var2) {
            this.groupCallId = var1;
            this.participant = var2;
        }

        public int getConstructor() {
            return -803128071;
        }
    }

    public static class UpdateGroupCall extends TdApi.Update {
        public TdApi.GroupCall groupCall;
        public static final int CONSTRUCTOR = 808603136;

        public UpdateGroupCall() {
        }

        public UpdateGroupCall(TdApi.GroupCall var1) {
            this.groupCall = var1;
        }

        public int getConstructor() {
            return 808603136;
        }
    }

    public static class UpdateCall extends TdApi.Update {
        public TdApi.Call call;
        public static final int CONSTRUCTOR = 1337184477;

        public UpdateCall() {
        }

        public UpdateCall(TdApi.Call var1) {
            this.call = var1;
        }

        public int getConstructor() {
            return 1337184477;
        }
    }

    public static class UpdateFileRemovedFromDownloads extends TdApi.Update {
        public int fileId;
        public TdApi.DownloadedFileCounts counts;
        public static final int CONSTRUCTOR = 1853625576;

        public UpdateFileRemovedFromDownloads() {
        }

        public UpdateFileRemovedFromDownloads(int var1, TdApi.DownloadedFileCounts var2) {
            this.fileId = var1;
            this.counts = var2;
        }

        public int getConstructor() {
            return 1853625576;
        }
    }

    public static class UpdateFileDownload extends TdApi.Update {
        public int fileId;
        public int completeDate;
        public boolean isPaused;
        public TdApi.DownloadedFileCounts counts;
        public static final int CONSTRUCTOR = 875529162;

        public UpdateFileDownload() {
        }

        public UpdateFileDownload(int var1, int var2, boolean var3, TdApi.DownloadedFileCounts var4) {
            this.fileId = var1;
            this.completeDate = var2;
            this.isPaused = var3;
            this.counts = var4;
        }

        public int getConstructor() {
            return 875529162;
        }
    }

    public static class UpdateFileAddedToDownloads extends TdApi.Update {
        public TdApi.FileDownload fileDownload;
        public TdApi.DownloadedFileCounts counts;
        public static final int CONSTRUCTOR = 1609929242;

        public UpdateFileAddedToDownloads() {
        }

        public UpdateFileAddedToDownloads(TdApi.FileDownload var1, TdApi.DownloadedFileCounts var2) {
            this.fileDownload = var1;
            this.counts = var2;
        }

        public int getConstructor() {
            return 1609929242;
        }
    }

    public static class UpdateFileDownloads extends TdApi.Update {
        public long totalSize;
        public int totalCount;
        public long downloadedSize;
        public static final int CONSTRUCTOR = -389213497;

        public UpdateFileDownloads() {
        }

        public UpdateFileDownloads(long var1, int var3, long var4) {
            this.totalSize = var1;
            this.totalCount = var3;
            this.downloadedSize = var4;
        }

        public int getConstructor() {
            return -389213497;
        }
    }

    public static class UpdateFileGenerationStop extends TdApi.Update {
        public long generationId;
        public static final int CONSTRUCTOR = -1894449685;

        public UpdateFileGenerationStop() {
        }

        public UpdateFileGenerationStop(long var1) {
            this.generationId = var1;
        }

        public int getConstructor() {
            return -1894449685;
        }
    }

    public static class UpdateFileGenerationStart extends TdApi.Update {
        public long generationId;
        public String originalPath;
        public String destinationPath;
        public String conversion;
        public static final int CONSTRUCTOR = 216817388;

        public UpdateFileGenerationStart() {
        }

        public UpdateFileGenerationStart(long var1, String var3, String var4, String var5) {
            this.generationId = var1;
            this.originalPath = var3;
            this.destinationPath = var4;
            this.conversion = var5;
        }

        public int getConstructor() {
            return 216817388;
        }
    }

    public static class UpdateFile extends TdApi.Update {
        public TdApi.File file;
        public static final int CONSTRUCTOR = 114132831;

        public UpdateFile() {
        }

        public UpdateFile(TdApi.File var1) {
            this.file = var1;
        }

        public int getConstructor() {
            return 114132831;
        }
    }

    public static class UpdateServiceNotification extends TdApi.Update {
        public String type;
        public TdApi.MessageContent content;
        public static final int CONSTRUCTOR = 1318622637;

        public UpdateServiceNotification() {
        }

        public UpdateServiceNotification(String var1, TdApi.MessageContent var2) {
            this.type = var1;
            this.content = var2;
        }

        public int getConstructor() {
            return 1318622637;
        }
    }

    public static class UpdateSupergroupFullInfo extends TdApi.Update {
        public long supergroupId;
        public TdApi.SupergroupFullInfo supergroupFullInfo;
        public static final int CONSTRUCTOR = 435539214;

        public UpdateSupergroupFullInfo() {
        }

        public UpdateSupergroupFullInfo(long var1, TdApi.SupergroupFullInfo var3) {
            this.supergroupId = var1;
            this.supergroupFullInfo = var3;
        }

        public int getConstructor() {
            return 435539214;
        }
    }

    public static class UpdateBasicGroupFullInfo extends TdApi.Update {
        public long basicGroupId;
        public TdApi.BasicGroupFullInfo basicGroupFullInfo;
        public static final int CONSTRUCTOR = 1391881151;

        public UpdateBasicGroupFullInfo() {
        }

        public UpdateBasicGroupFullInfo(long var1, TdApi.BasicGroupFullInfo var3) {
            this.basicGroupId = var1;
            this.basicGroupFullInfo = var3;
        }

        public int getConstructor() {
            return 1391881151;
        }
    }

    public static class UpdateUserFullInfo extends TdApi.Update {
        public long userId;
        public TdApi.UserFullInfo userFullInfo;
        public static final int CONSTRUCTOR = -51197161;

        public UpdateUserFullInfo() {
        }

        public UpdateUserFullInfo(long var1, TdApi.UserFullInfo var3) {
            this.userId = var1;
            this.userFullInfo = var3;
        }

        public int getConstructor() {
            return -51197161;
        }
    }

    public static class UpdateSecretChat extends TdApi.Update {
        public TdApi.SecretChat secretChat;
        public static final int CONSTRUCTOR = -1666903253;

        public UpdateSecretChat() {
        }

        public UpdateSecretChat(TdApi.SecretChat var1) {
            this.secretChat = var1;
        }

        public int getConstructor() {
            return -1666903253;
        }
    }

    public static class UpdateSupergroup extends TdApi.Update {
        public TdApi.Supergroup supergroup;
        public static final int CONSTRUCTOR = -76782300;

        public UpdateSupergroup() {
        }

        public UpdateSupergroup(TdApi.Supergroup var1) {
            this.supergroup = var1;
        }

        public int getConstructor() {
            return -76782300;
        }
    }

    public static class UpdateBasicGroup extends TdApi.Update {
        public TdApi.BasicGroup basicGroup;
        public static final int CONSTRUCTOR = -1003239581;

        public UpdateBasicGroup() {
        }

        public UpdateBasicGroup(TdApi.BasicGroup var1) {
            this.basicGroup = var1;
        }

        public int getConstructor() {
            return -1003239581;
        }
    }

    public static class UpdateUser extends TdApi.Update {
        public TdApi.User user;
        public static final int CONSTRUCTOR = 1183394041;

        public UpdateUser() {
        }

        public UpdateUser(TdApi.User var1) {
            this.user = var1;
        }

        public int getConstructor() {
            return 1183394041;
        }
    }

    public static class UpdateUserStatus extends TdApi.Update {
        public long userId;
        public TdApi.UserStatus status;
        public static final int CONSTRUCTOR = 958468625;

        public UpdateUserStatus() {
        }

        public UpdateUserStatus(long var1, TdApi.UserStatus var3) {
            this.userId = var1;
            this.status = var3;
        }

        public int getConstructor() {
            return 958468625;
        }
    }

    public static class UpdateChatAction extends TdApi.Update {
        public long chatId;
        public long messageThreadId;
        public TdApi.MessageSender senderId;
        public TdApi.ChatAction action;
        public static final int CONSTRUCTOR = -1698703832;

        public UpdateChatAction() {
        }

        public UpdateChatAction(long var1, long var3, TdApi.MessageSender var5, TdApi.ChatAction var6) {
            this.chatId = var1;
            this.messageThreadId = var3;
            this.senderId = var5;
            this.action = var6;
        }

        public int getConstructor() {
            return -1698703832;
        }
    }

    public static class UpdateDeleteMessages extends TdApi.Update {
        public long chatId;
        public long[] messageIds;
        public boolean isPermanent;
        public boolean fromCache;
        public static final int CONSTRUCTOR = 1669252686;

        public UpdateDeleteMessages() {
        }

        public UpdateDeleteMessages(long var1, long[] var3, boolean var4, boolean var5) {
            this.chatId = var1;
            this.messageIds = var3;
            this.isPermanent = var4;
            this.fromCache = var5;
        }

        public int getConstructor() {
            return 1669252686;
        }
    }

    public static class UpdateHavePendingNotifications extends TdApi.Update {
        public boolean haveDelayedNotifications;
        public boolean haveUnreceivedNotifications;
        public static final int CONSTRUCTOR = 179233243;

        public UpdateHavePendingNotifications() {
        }

        public UpdateHavePendingNotifications(boolean var1, boolean var2) {
            this.haveDelayedNotifications = var1;
            this.haveUnreceivedNotifications = var2;
        }

        public int getConstructor() {
            return 179233243;
        }
    }

    public static class UpdateActiveNotifications extends TdApi.Update {
        public TdApi.NotificationGroup[] groups;
        public static final int CONSTRUCTOR = -1306672221;

        public UpdateActiveNotifications() {
        }

        public UpdateActiveNotifications(TdApi.NotificationGroup[] var1) {
            this.groups = var1;
        }

        public int getConstructor() {
            return -1306672221;
        }
    }

    public static class UpdateNotificationGroup extends TdApi.Update {
        public int notificationGroupId;
        public TdApi.NotificationGroupType type;
        public long chatId;
        public long notificationSettingsChatId;
        public long notificationSoundId;
        public int totalCount;
        public TdApi.Notification[] addedNotifications;
        public int[] removedNotificationIds;
        public static final int CONSTRUCTOR = 1381081378;

        public UpdateNotificationGroup() {
        }

        public UpdateNotificationGroup(int var1, TdApi.NotificationGroupType var2, long var3, long var5, long var7, int var9, TdApi.Notification[] var10, int[] var11) {
            this.notificationGroupId = var1;
            this.type = var2;
            this.chatId = var3;
            this.notificationSettingsChatId = var5;
            this.notificationSoundId = var7;
            this.totalCount = var9;
            this.addedNotifications = var10;
            this.removedNotificationIds = var11;
        }

        public int getConstructor() {
            return 1381081378;
        }
    }

    public static class UpdateNotification extends TdApi.Update {
        public int notificationGroupId;
        public TdApi.Notification notification;
        public static final int CONSTRUCTOR = -1897496876;

        public UpdateNotification() {
        }

        public UpdateNotification(int var1, TdApi.Notification var2) {
            this.notificationGroupId = var1;
            this.notification = var2;
        }

        public int getConstructor() {
            return -1897496876;
        }
    }

    public static class UpdateScopeNotificationSettings extends TdApi.Update {
        public TdApi.NotificationSettingsScope scope;
        public TdApi.ScopeNotificationSettings notificationSettings;
        public static final int CONSTRUCTOR = -1203975309;

        public UpdateScopeNotificationSettings() {
        }

        public UpdateScopeNotificationSettings(TdApi.NotificationSettingsScope var1, TdApi.ScopeNotificationSettings var2) {
            this.scope = var1;
            this.notificationSettings = var2;
        }

        public int getConstructor() {
            return -1203975309;
        }
    }

    public static class UpdateForumTopicInfo extends TdApi.Update {
        public long chatId;
        public TdApi.ForumTopicInfo info;
        public static final int CONSTRUCTOR = 1802448073;

        public UpdateForumTopicInfo() {
        }

        public UpdateForumTopicInfo(long var1, TdApi.ForumTopicInfo var3) {
            this.chatId = var1;
            this.info = var3;
        }

        public int getConstructor() {
            return 1802448073;
        }
    }

    public static class UpdateChatOnlineMemberCount extends TdApi.Update {
        public long chatId;
        public int onlineMemberCount;
        public static final int CONSTRUCTOR = 487369373;

        public UpdateChatOnlineMemberCount() {
        }

        public UpdateChatOnlineMemberCount(long var1, int var3) {
            this.chatId = var1;
            this.onlineMemberCount = var3;
        }

        public int getConstructor() {
            return 487369373;
        }
    }

    public static class UpdateChatFolders extends TdApi.Update {
        public TdApi.ChatFolderInfo[] chatFolders;
        public int mainChatListPosition;
        public static final int CONSTRUCTOR = 1892046525;

        public UpdateChatFolders() {
        }

        public UpdateChatFolders(TdApi.ChatFolderInfo[] var1, int var2) {
            this.chatFolders = var1;
            this.mainChatListPosition = var2;
        }

        public int getConstructor() {
            return 1892046525;
        }
    }

    public static class UpdateChatHasScheduledMessages extends TdApi.Update {
        public long chatId;
        public boolean hasScheduledMessages;
        public static final int CONSTRUCTOR = 2064958167;

        public UpdateChatHasScheduledMessages() {
        }

        public UpdateChatHasScheduledMessages(long var1, boolean var3) {
            this.chatId = var1;
            this.hasScheduledMessages = var3;
        }

        public int getConstructor() {
            return 2064958167;
        }
    }

    public static class UpdateChatBlockList extends TdApi.Update {
        public long chatId;
        public TdApi.BlockList blockList;
        public static final int CONSTRUCTOR = -2027228018;

        public UpdateChatBlockList() {
        }

        public UpdateChatBlockList(long var1, TdApi.BlockList var3) {
            this.chatId = var1;
            this.blockList = var3;
        }

        public int getConstructor() {
            return -2027228018;
        }
    }

    public static class UpdateChatIsMarkedAsUnread extends TdApi.Update {
        public long chatId;
        public boolean isMarkedAsUnread;
        public static final int CONSTRUCTOR = 1468347188;

        public UpdateChatIsMarkedAsUnread() {
        }

        public UpdateChatIsMarkedAsUnread(long var1, boolean var3) {
            this.chatId = var1;
            this.isMarkedAsUnread = var3;
        }

        public int getConstructor() {
            return 1468347188;
        }
    }

    public static class UpdateChatIsTranslatable extends TdApi.Update {
        public long chatId;
        public boolean isTranslatable;
        public static final int CONSTRUCTOR = 2063799831;

        public UpdateChatIsTranslatable() {
        }

        public UpdateChatIsTranslatable(long var1, boolean var3) {
            this.chatId = var1;
            this.isTranslatable = var3;
        }

        public int getConstructor() {
            return 2063799831;
        }
    }

    public static class UpdateChatHasProtectedContent extends TdApi.Update {
        public long chatId;
        public boolean hasProtectedContent;
        public static final int CONSTRUCTOR = 1800406811;

        public UpdateChatHasProtectedContent() {
        }

        public UpdateChatHasProtectedContent(long var1, boolean var3) {
            this.chatId = var1;
            this.hasProtectedContent = var3;
        }

        public int getConstructor() {
            return 1800406811;
        }
    }

    public static class UpdateChatDefaultDisableNotification extends TdApi.Update {
        public long chatId;
        public boolean defaultDisableNotification;
        public static final int CONSTRUCTOR = 464087707;

        public UpdateChatDefaultDisableNotification() {
        }

        public UpdateChatDefaultDisableNotification(long var1, boolean var3) {
            this.chatId = var1;
            this.defaultDisableNotification = var3;
        }

        public int getConstructor() {
            return 464087707;
        }
    }

    public static class UpdateChatVideoChat extends TdApi.Update {
        public long chatId;
        public TdApi.VideoChat videoChat;
        public static final int CONSTRUCTOR = 637226150;

        public UpdateChatVideoChat() {
        }

        public UpdateChatVideoChat(long var1, TdApi.VideoChat var3) {
            this.chatId = var1;
            this.videoChat = var3;
        }

        public int getConstructor() {
            return 637226150;
        }
    }

    public static class UpdateChatUnreadReactionCount extends TdApi.Update {
        public long chatId;
        public int unreadReactionCount;
        public static final int CONSTRUCTOR = -2124399395;

        public UpdateChatUnreadReactionCount() {
        }

        public UpdateChatUnreadReactionCount(long var1, int var3) {
            this.chatId = var1;
            this.unreadReactionCount = var3;
        }

        public int getConstructor() {
            return -2124399395;
        }
    }

    public static class UpdateChatUnreadMentionCount extends TdApi.Update {
        public long chatId;
        public int unreadMentionCount;
        public static final int CONSTRUCTOR = -2131461348;

        public UpdateChatUnreadMentionCount() {
        }

        public UpdateChatUnreadMentionCount(long var1, int var3) {
            this.chatId = var1;
            this.unreadMentionCount = var3;
        }

        public int getConstructor() {
            return -2131461348;
        }
    }

    public static class UpdateChatTheme extends TdApi.Update {
        public long chatId;
        public String themeName;
        public static final int CONSTRUCTOR = 838063205;

        public UpdateChatTheme() {
        }

        public UpdateChatTheme(long var1, String var3) {
            this.chatId = var1;
            this.themeName = var3;
        }

        public int getConstructor() {
            return 838063205;
        }
    }

    public static class UpdateChatBackground extends TdApi.Update {
        public long chatId;
        public TdApi.ChatBackground background;
        public static final int CONSTRUCTOR = -6473549;

        public UpdateChatBackground() {
        }

        public UpdateChatBackground(long var1, TdApi.ChatBackground var3) {
            this.chatId = var1;
            this.background = var3;
        }

        public int getConstructor() {
            return -6473549;
        }
    }

    public static class UpdateChatReplyMarkup extends TdApi.Update {
        public long chatId;
        public long replyMarkupMessageId;
        public static final int CONSTRUCTOR = 1309386144;

        public UpdateChatReplyMarkup() {
        }

        public UpdateChatReplyMarkup(long var1, long var3) {
            this.chatId = var1;
            this.replyMarkupMessageId = var3;
        }

        public int getConstructor() {
            return 1309386144;
        }
    }

    public static class UpdateChatPendingJoinRequests extends TdApi.Update {
        public long chatId;
        public TdApi.ChatJoinRequestsInfo pendingJoinRequests;
        public static final int CONSTRUCTOR = 348578785;

        public UpdateChatPendingJoinRequests() {
        }

        public UpdateChatPendingJoinRequests(long var1, TdApi.ChatJoinRequestsInfo var3) {
            this.chatId = var1;
            this.pendingJoinRequests = var3;
        }

        public int getConstructor() {
            return 348578785;
        }
    }

    public static class UpdateChatNotificationSettings extends TdApi.Update {
        public long chatId;
        public TdApi.ChatNotificationSettings notificationSettings;
        public static final int CONSTRUCTOR = -803163050;

        public UpdateChatNotificationSettings() {
        }

        public UpdateChatNotificationSettings(long var1, TdApi.ChatNotificationSettings var3) {
            this.chatId = var1;
            this.notificationSettings = var3;
        }

        public int getConstructor() {
            return -803163050;
        }
    }

    public static class UpdateChatMessageAutoDeleteTime extends TdApi.Update {
        public long chatId;
        public int messageAutoDeleteTime;
        public static final int CONSTRUCTOR = 1900174821;

        public UpdateChatMessageAutoDeleteTime() {
        }

        public UpdateChatMessageAutoDeleteTime(long var1, int var3) {
            this.chatId = var1;
            this.messageAutoDeleteTime = var3;
        }

        public int getConstructor() {
            return 1900174821;
        }
    }

    public static class UpdateChatMessageSender extends TdApi.Update {
        public long chatId;
        public TdApi.MessageSender messageSenderId;
        public static final int CONSTRUCTOR = 2003849793;

        public UpdateChatMessageSender() {
        }

        public UpdateChatMessageSender(long var1, TdApi.MessageSender var3) {
            this.chatId = var1;
            this.messageSenderId = var3;
        }

        public int getConstructor() {
            return 2003849793;
        }
    }

    public static class UpdateChatDraftMessage extends TdApi.Update {
        public long chatId;
        public TdApi.DraftMessage draftMessage;
        public TdApi.ChatPosition[] positions;
        public static final int CONSTRUCTOR = 1455190380;

        public UpdateChatDraftMessage() {
        }

        public UpdateChatDraftMessage(long var1, TdApi.DraftMessage var3, TdApi.ChatPosition[] var4) {
            this.chatId = var1;
            this.draftMessage = var3;
            this.positions = var4;
        }

        public int getConstructor() {
            return 1455190380;
        }
    }

    public static class UpdateChatAvailableReactions extends TdApi.Update {
        public long chatId;
        public TdApi.ChatAvailableReactions availableReactions;
        public static final int CONSTRUCTOR = -1967909895;

        public UpdateChatAvailableReactions() {
        }

        public UpdateChatAvailableReactions(long var1, TdApi.ChatAvailableReactions var3) {
            this.chatId = var1;
            this.availableReactions = var3;
        }

        public int getConstructor() {
            return -1967909895;
        }
    }

    public static class UpdateChatActionBar extends TdApi.Update {
        public long chatId;
        public TdApi.ChatActionBar actionBar;
        public static final int CONSTRUCTOR = -643671870;

        public UpdateChatActionBar() {
        }

        public UpdateChatActionBar(long var1, TdApi.ChatActionBar var3) {
            this.chatId = var1;
            this.actionBar = var3;
        }

        public int getConstructor() {
            return -643671870;
        }
    }

    public static class UpdateChatReadOutbox extends TdApi.Update {
        public long chatId;
        public long lastReadOutboxMessageId;
        public static final int CONSTRUCTOR = 708334213;

        public UpdateChatReadOutbox() {
        }

        public UpdateChatReadOutbox(long var1, long var3) {
            this.chatId = var1;
            this.lastReadOutboxMessageId = var3;
        }

        public int getConstructor() {
            return 708334213;
        }
    }

    public static class UpdateChatReadInbox extends TdApi.Update {
        public long chatId;
        public long lastReadInboxMessageId;
        public int unreadCount;
        public static final int CONSTRUCTOR = -797952281;

        public UpdateChatReadInbox() {
        }

        public UpdateChatReadInbox(long var1, long var3, int var5) {
            this.chatId = var1;
            this.lastReadInboxMessageId = var3;
            this.unreadCount = var5;
        }

        public int getConstructor() {
            return -797952281;
        }
    }

    public static class UpdateChatPosition extends TdApi.Update {
        public long chatId;
        public TdApi.ChatPosition position;
        public static final int CONSTRUCTOR = -8979849;

        public UpdateChatPosition() {
        }

        public UpdateChatPosition(long var1, TdApi.ChatPosition var3) {
            this.chatId = var1;
            this.position = var3;
        }

        public int getConstructor() {
            return -8979849;
        }
    }

    public static class UpdateChatLastMessage extends TdApi.Update {
        public long chatId;
        public TdApi.Message lastMessage;
        public TdApi.ChatPosition[] positions;
        public static final int CONSTRUCTOR = -923244537;

        public UpdateChatLastMessage() {
        }

        public UpdateChatLastMessage(long var1, TdApi.Message var3, TdApi.ChatPosition[] var4) {
            this.chatId = var1;
            this.lastMessage = var3;
            this.positions = var4;
        }

        public int getConstructor() {
            return -923244537;
        }
    }

    public static class UpdateChatPermissions extends TdApi.Update {
        public long chatId;
        public TdApi.ChatPermissions permissions;
        public static final int CONSTRUCTOR = -1622010003;

        public UpdateChatPermissions() {
        }

        public UpdateChatPermissions(long var1, TdApi.ChatPermissions var3) {
            this.chatId = var1;
            this.permissions = var3;
        }

        public int getConstructor() {
            return -1622010003;
        }
    }

    public static class UpdateChatPhoto extends TdApi.Update {
        public long chatId;
        public TdApi.ChatPhotoInfo photo;
        public static final int CONSTRUCTOR = -324713921;

        public UpdateChatPhoto() {
        }

        public UpdateChatPhoto(long var1, TdApi.ChatPhotoInfo var3) {
            this.chatId = var1;
            this.photo = var3;
        }

        public int getConstructor() {
            return -324713921;
        }
    }

    public static class UpdateChatTitle extends TdApi.Update {
        public long chatId;
        public String title;
        public static final int CONSTRUCTOR = -175405660;

        public UpdateChatTitle() {
        }

        public UpdateChatTitle(long var1, String var3) {
            this.chatId = var1;
            this.title = var3;
        }

        public int getConstructor() {
            return -175405660;
        }
    }

    public static class UpdateNewChat extends TdApi.Update {
        public TdApi.Chat chat;
        public static final int CONSTRUCTOR = 2075757773;

        public UpdateNewChat() {
        }

        public UpdateNewChat(TdApi.Chat var1) {
            this.chat = var1;
        }

        public int getConstructor() {
            return 2075757773;
        }
    }

    public static class UpdateMessageLiveLocationViewed extends TdApi.Update {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = -1308260971;

        public UpdateMessageLiveLocationViewed() {
        }

        public UpdateMessageLiveLocationViewed(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return -1308260971;
        }
    }

    public static class UpdateMessageUnreadReactions extends TdApi.Update {
        public long chatId;
        public long messageId;
        public TdApi.UnreadReaction[] unreadReactions;
        public int unreadReactionCount;
        public static final int CONSTRUCTOR = 942840008;

        public UpdateMessageUnreadReactions() {
        }

        public UpdateMessageUnreadReactions(long var1, long var3, TdApi.UnreadReaction[] var5, int var6) {
            this.chatId = var1;
            this.messageId = var3;
            this.unreadReactions = var5;
            this.unreadReactionCount = var6;
        }

        public int getConstructor() {
            return 942840008;
        }
    }

    public static class UpdateMessageMentionRead extends TdApi.Update {
        public long chatId;
        public long messageId;
        public int unreadMentionCount;
        public static final int CONSTRUCTOR = -252228282;

        public UpdateMessageMentionRead() {
        }

        public UpdateMessageMentionRead(long var1, long var3, int var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.unreadMentionCount = var5;
        }

        public int getConstructor() {
            return -252228282;
        }
    }

    public static class UpdateMessageContentOpened extends TdApi.Update {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = -1520523131;

        public UpdateMessageContentOpened() {
        }

        public UpdateMessageContentOpened(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return -1520523131;
        }
    }

    public static class UpdateMessageInteractionInfo extends TdApi.Update {
        public long chatId;
        public long messageId;
        public TdApi.MessageInteractionInfo interactionInfo;
        public static final int CONSTRUCTOR = -1417659394;

        public UpdateMessageInteractionInfo() {
        }

        public UpdateMessageInteractionInfo(long var1, long var3, TdApi.MessageInteractionInfo var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.interactionInfo = var5;
        }

        public int getConstructor() {
            return -1417659394;
        }
    }

    public static class UpdateMessageIsPinned extends TdApi.Update {
        public long chatId;
        public long messageId;
        public boolean isPinned;
        public static final int CONSTRUCTOR = 1102848829;

        public UpdateMessageIsPinned() {
        }

        public UpdateMessageIsPinned(long var1, long var3, boolean var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.isPinned = var5;
        }

        public int getConstructor() {
            return 1102848829;
        }
    }

    public static class UpdateMessageEdited extends TdApi.Update {
        public long chatId;
        public long messageId;
        public int editDate;
        public TdApi.ReplyMarkup replyMarkup;
        public static final int CONSTRUCTOR = -559545626;

        public UpdateMessageEdited() {
        }

        public UpdateMessageEdited(long var1, long var3, int var5, TdApi.ReplyMarkup var6) {
            this.chatId = var1;
            this.messageId = var3;
            this.editDate = var5;
            this.replyMarkup = var6;
        }

        public int getConstructor() {
            return -559545626;
        }
    }

    public static class UpdateMessageContent extends TdApi.Update {
        public long chatId;
        public long messageId;
        public TdApi.MessageContent newContent;
        public static final int CONSTRUCTOR = 506903332;

        public UpdateMessageContent() {
        }

        public UpdateMessageContent(long var1, long var3, TdApi.MessageContent var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.newContent = var5;
        }

        public int getConstructor() {
            return 506903332;
        }
    }

    public static class UpdateMessageSendFailed extends TdApi.Update {
        public TdApi.Message message;
        public long oldMessageId;
        public int errorCode;
        public String errorMessage;
        public static final int CONSTRUCTOR = -1032335779;

        public UpdateMessageSendFailed() {
        }

        public UpdateMessageSendFailed(TdApi.Message var1, long var2, int var4, String var5) {
            this.message = var1;
            this.oldMessageId = var2;
            this.errorCode = var4;
            this.errorMessage = var5;
        }

        public int getConstructor() {
            return -1032335779;
        }
    }

    public static class UpdateMessageSendSucceeded extends TdApi.Update {
        public TdApi.Message message;
        public long oldMessageId;
        public static final int CONSTRUCTOR = 1815715197;

        public UpdateMessageSendSucceeded() {
        }

        public UpdateMessageSendSucceeded(TdApi.Message var1, long var2) {
            this.message = var1;
            this.oldMessageId = var2;
        }

        public int getConstructor() {
            return 1815715197;
        }
    }

    public static class UpdateMessageSendAcknowledged extends TdApi.Update {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = 1302843961;

        public UpdateMessageSendAcknowledged() {
        }

        public UpdateMessageSendAcknowledged(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return 1302843961;
        }
    }

    public static class UpdateNewMessage extends TdApi.Update {
        public TdApi.Message message;
        public static final int CONSTRUCTOR = -563105266;

        public UpdateNewMessage() {
        }

        public UpdateNewMessage(TdApi.Message var1) {
            this.message = var1;
        }

        public int getConstructor() {
            return -563105266;
        }
    }

    public static class UpdateAuthorizationState extends TdApi.Update {
        public TdApi.AuthorizationState authorizationState;
        public static final int CONSTRUCTOR = 1622347490;

        public UpdateAuthorizationState() {
        }

        public UpdateAuthorizationState(TdApi.AuthorizationState var1) {
            this.authorizationState = var1;
        }

        public int getConstructor() {
            return 1622347490;
        }
    }

    public abstract static class Update extends TdApi.Object {
        public Update() {
        }
    }

    public static class UnreadReaction extends TdApi.Object {
        public TdApi.ReactionType type;
        public TdApi.MessageSender senderId;
        public boolean isBig;
        public static final int CONSTRUCTOR = -1940178046;

        public UnreadReaction() {
        }

        public UnreadReaction(TdApi.ReactionType var1, TdApi.MessageSender var2, boolean var3) {
            this.type = var1;
            this.senderId = var2;
            this.isBig = var3;
        }

        public int getConstructor() {
            return -1940178046;
        }
    }

    public static class TrendingStickerSets extends TdApi.Object {
        public int totalCount;
        public TdApi.StickerSetInfo[] sets;
        public boolean isPremium;
        public static final int CONSTRUCTOR = 41028940;

        public TrendingStickerSets() {
        }

        public TrendingStickerSets(int var1, TdApi.StickerSetInfo[] var2, boolean var3) {
            this.totalCount = var1;
            this.sets = var2;
            this.isPremium = var3;
        }

        public int getConstructor() {
            return 41028940;
        }
    }

    public static class TopChatCategoryForwardChats extends TdApi.TopChatCategory {
        public static final int CONSTRUCTOR = 1695922133;

        public TopChatCategoryForwardChats() {
        }

        public int getConstructor() {
            return 1695922133;
        }
    }

    public static class TopChatCategoryCalls extends TdApi.TopChatCategory {
        public static final int CONSTRUCTOR = 356208861;

        public TopChatCategoryCalls() {
        }

        public int getConstructor() {
            return 356208861;
        }
    }

    public static class TopChatCategoryInlineBots extends TdApi.TopChatCategory {
        public static final int CONSTRUCTOR = 377023356;

        public TopChatCategoryInlineBots() {
        }

        public int getConstructor() {
            return 377023356;
        }
    }

    public static class TopChatCategoryChannels extends TdApi.TopChatCategory {
        public static final int CONSTRUCTOR = -500825885;

        public TopChatCategoryChannels() {
        }

        public int getConstructor() {
            return -500825885;
        }
    }

    public static class TopChatCategoryGroups extends TdApi.TopChatCategory {
        public static final int CONSTRUCTOR = 1530056846;

        public TopChatCategoryGroups() {
        }

        public int getConstructor() {
            return 1530056846;
        }
    }

    public static class TopChatCategoryBots extends TdApi.TopChatCategory {
        public static final int CONSTRUCTOR = -1577129195;

        public TopChatCategoryBots() {
        }

        public int getConstructor() {
            return -1577129195;
        }
    }

    public static class TopChatCategoryUsers extends TdApi.TopChatCategory {
        public static final int CONSTRUCTOR = 1026706816;

        public TopChatCategoryUsers() {
        }

        public int getConstructor() {
            return 1026706816;
        }
    }

    public abstract static class TopChatCategory extends TdApi.Object {
        public TopChatCategory() {
        }
    }

    public static class ThumbnailFormatWebp extends TdApi.ThumbnailFormat {
        public static final int CONSTRUCTOR = -53588974;

        public ThumbnailFormatWebp() {
        }

        public int getConstructor() {
            return -53588974;
        }
    }

    public static class ThumbnailFormatWebm extends TdApi.ThumbnailFormat {
        public static final int CONSTRUCTOR = -660084953;

        public ThumbnailFormatWebm() {
        }

        public int getConstructor() {
            return -660084953;
        }
    }

    public static class ThumbnailFormatTgs extends TdApi.ThumbnailFormat {
        public static final int CONSTRUCTOR = 1315522642;

        public ThumbnailFormatTgs() {
        }

        public int getConstructor() {
            return 1315522642;
        }
    }

    public static class ThumbnailFormatPng extends TdApi.ThumbnailFormat {
        public static final int CONSTRUCTOR = 1577490421;

        public ThumbnailFormatPng() {
        }

        public int getConstructor() {
            return 1577490421;
        }
    }

    public static class ThumbnailFormatMpeg4 extends TdApi.ThumbnailFormat {
        public static final int CONSTRUCTOR = 278616062;

        public ThumbnailFormatMpeg4() {
        }

        public int getConstructor() {
            return 278616062;
        }
    }

    public static class ThumbnailFormatGif extends TdApi.ThumbnailFormat {
        public static final int CONSTRUCTOR = 1252205962;

        public ThumbnailFormatGif() {
        }

        public int getConstructor() {
            return 1252205962;
        }
    }

    public static class ThumbnailFormatJpeg extends TdApi.ThumbnailFormat {
        public static final int CONSTRUCTOR = -653503352;

        public ThumbnailFormatJpeg() {
        }

        public int getConstructor() {
            return -653503352;
        }
    }

    public abstract static class ThumbnailFormat extends TdApi.Object {
        public ThumbnailFormat() {
        }
    }

    public static class Thumbnail extends TdApi.Object {
        public TdApi.ThumbnailFormat format;
        public int width;
        public int height;
        public TdApi.File file;
        public static final int CONSTRUCTOR = 1243275371;

        public Thumbnail() {
        }

        public Thumbnail(TdApi.ThumbnailFormat var1, int var2, int var3, TdApi.File var4) {
            this.format = var1;
            this.width = var2;
            this.height = var3;
            this.file = var4;
        }

        public int getConstructor() {
            return 1243275371;
        }
    }

    public static class ThemeSettings extends TdApi.Object {
        public int accentColor;
        public TdApi.Background background;
        public TdApi.BackgroundFill outgoingMessageFill;
        public boolean animateOutgoingMessageFill;
        public int outgoingMessageAccentColor;
        public static final int CONSTRUCTOR = -62120942;

        public ThemeSettings() {
        }

        public ThemeSettings(int var1, TdApi.Background var2, TdApi.BackgroundFill var3, boolean var4, int var5) {
            this.accentColor = var1;
            this.background = var2;
            this.outgoingMessageFill = var3;
            this.animateOutgoingMessageFill = var4;
            this.outgoingMessageAccentColor = var5;
        }

        public int getConstructor() {
            return -62120942;
        }
    }

    public static class ThemeParameters extends TdApi.Object {
        public int backgroundColor;
        public int secondaryBackgroundColor;
        public int textColor;
        public int hintColor;
        public int linkColor;
        public int buttonColor;
        public int buttonTextColor;
        public static final int CONSTRUCTOR = -644809106;

        public ThemeParameters() {
        }

        public ThemeParameters(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
            this.backgroundColor = var1;
            this.secondaryBackgroundColor = var2;
            this.textColor = var3;
            this.hintColor = var4;
            this.linkColor = var5;
            this.buttonColor = var6;
            this.buttonTextColor = var7;
        }

        public int getConstructor() {
            return -644809106;
        }
    }

    public static class TextParseModeHTML extends TdApi.TextParseMode {
        public static final int CONSTRUCTOR = 1660208627;

        public TextParseModeHTML() {
        }

        public int getConstructor() {
            return 1660208627;
        }
    }

    public static class TextParseModeMarkdown extends TdApi.TextParseMode {
        public int version;
        public static final int CONSTRUCTOR = 360073407;

        public TextParseModeMarkdown() {
        }

        public TextParseModeMarkdown(int var1) {
            this.version = var1;
        }

        public int getConstructor() {
            return 360073407;
        }
    }

    public abstract static class TextParseMode extends TdApi.Object {
        public TextParseMode() {
        }
    }

    public static class TextEntityTypeMediaTimestamp extends TdApi.TextEntityType {
        public int mediaTimestamp;
        public static final int CONSTRUCTOR = -1841898992;

        public TextEntityTypeMediaTimestamp() {
        }

        public TextEntityTypeMediaTimestamp(int var1) {
            this.mediaTimestamp = var1;
        }

        public int getConstructor() {
            return -1841898992;
        }
    }

    public static class TextEntityTypeCustomEmoji extends TdApi.TextEntityType {
        public long customEmojiId;
        public static final int CONSTRUCTOR = 1724820677;

        public TextEntityTypeCustomEmoji() {
        }

        public TextEntityTypeCustomEmoji(long var1) {
            this.customEmojiId = var1;
        }

        public int getConstructor() {
            return 1724820677;
        }
    }

    public static class TextEntityTypeMentionName extends TdApi.TextEntityType {
        public long userId;
        public static final int CONSTRUCTOR = -1570974289;

        public TextEntityTypeMentionName() {
        }

        public TextEntityTypeMentionName(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return -1570974289;
        }
    }

    public static class TextEntityTypeTextUrl extends TdApi.TextEntityType {
        public String url;
        public static final int CONSTRUCTOR = 445719651;

        public TextEntityTypeTextUrl() {
        }

        public TextEntityTypeTextUrl(String var1) {
            this.url = var1;
        }

        public int getConstructor() {
            return 445719651;
        }
    }

    public static class TextEntityTypePreCode extends TdApi.TextEntityType {
        public String language;
        public static final int CONSTRUCTOR = -945325397;

        public TextEntityTypePreCode() {
        }

        public TextEntityTypePreCode(String var1) {
            this.language = var1;
        }

        public int getConstructor() {
            return -945325397;
        }
    }

    public static class TextEntityTypePre extends TdApi.TextEntityType {
        public static final int CONSTRUCTOR = 1648958606;

        public TextEntityTypePre() {
        }

        public int getConstructor() {
            return 1648958606;
        }
    }

    public static class TextEntityTypeCode extends TdApi.TextEntityType {
        public static final int CONSTRUCTOR = -974534326;

        public TextEntityTypeCode() {
        }

        public int getConstructor() {
            return -974534326;
        }
    }

    public static class TextEntityTypeSpoiler extends TdApi.TextEntityType {
        public static final int CONSTRUCTOR = 544019899;

        public TextEntityTypeSpoiler() {
        }

        public int getConstructor() {
            return 544019899;
        }
    }

    public static class TextEntityTypeStrikethrough extends TdApi.TextEntityType {
        public static final int CONSTRUCTOR = 961529082;

        public TextEntityTypeStrikethrough() {
        }

        public int getConstructor() {
            return 961529082;
        }
    }

    public static class TextEntityTypeUnderline extends TdApi.TextEntityType {
        public static final int CONSTRUCTOR = 792317842;

        public TextEntityTypeUnderline() {
        }

        public int getConstructor() {
            return 792317842;
        }
    }

    public static class TextEntityTypeItalic extends TdApi.TextEntityType {
        public static final int CONSTRUCTOR = -118253987;

        public TextEntityTypeItalic() {
        }

        public int getConstructor() {
            return -118253987;
        }
    }

    public static class TextEntityTypeBold extends TdApi.TextEntityType {
        public static final int CONSTRUCTOR = -1128210000;

        public TextEntityTypeBold() {
        }

        public int getConstructor() {
            return -1128210000;
        }
    }

    public static class TextEntityTypeBankCardNumber extends TdApi.TextEntityType {
        public static final int CONSTRUCTOR = 105986320;

        public TextEntityTypeBankCardNumber() {
        }

        public int getConstructor() {
            return 105986320;
        }
    }

    public static class TextEntityTypePhoneNumber extends TdApi.TextEntityType {
        public static final int CONSTRUCTOR = -1160140246;

        public TextEntityTypePhoneNumber() {
        }

        public int getConstructor() {
            return -1160140246;
        }
    }

    public static class TextEntityTypeEmailAddress extends TdApi.TextEntityType {
        public static final int CONSTRUCTOR = 1425545249;

        public TextEntityTypeEmailAddress() {
        }

        public int getConstructor() {
            return 1425545249;
        }
    }

    public static class TextEntityTypeUrl extends TdApi.TextEntityType {
        public static final int CONSTRUCTOR = -1312762756;

        public TextEntityTypeUrl() {
        }

        public int getConstructor() {
            return -1312762756;
        }
    }

    public static class TextEntityTypeBotCommand extends TdApi.TextEntityType {
        public static final int CONSTRUCTOR = -1150997581;

        public TextEntityTypeBotCommand() {
        }

        public int getConstructor() {
            return -1150997581;
        }
    }

    public static class TextEntityTypeCashtag extends TdApi.TextEntityType {
        public static final int CONSTRUCTOR = 1222915915;

        public TextEntityTypeCashtag() {
        }

        public int getConstructor() {
            return 1222915915;
        }
    }

    public static class TextEntityTypeHashtag extends TdApi.TextEntityType {
        public static final int CONSTRUCTOR = -1023958307;

        public TextEntityTypeHashtag() {
        }

        public int getConstructor() {
            return -1023958307;
        }
    }

    public static class TextEntityTypeMention extends TdApi.TextEntityType {
        public static final int CONSTRUCTOR = 934535013;

        public TextEntityTypeMention() {
        }

        public int getConstructor() {
            return 934535013;
        }
    }

    public abstract static class TextEntityType extends TdApi.Object {
        public TextEntityType() {
        }
    }

    public static class TextEntity extends TdApi.Object {
        public int offset;
        public int length;
        public TdApi.TextEntityType type;
        public static final int CONSTRUCTOR = -1951688280;

        public TextEntity() {
        }

        public TextEntity(int var1, int var2, TdApi.TextEntityType var3) {
            this.offset = var1;
            this.length = var2;
            this.type = var3;
        }

        public int getConstructor() {
            return -1951688280;
        }
    }

    public static class TextEntities extends TdApi.Object {
        public TdApi.TextEntity[] entities;
        public static final int CONSTRUCTOR = -933199172;

        public TextEntities() {
        }

        public TextEntities(TdApi.TextEntity[] var1) {
            this.entities = var1;
        }

        public int getConstructor() {
            return -933199172;
        }
    }

    public static class Text extends TdApi.Object {
        public String text;
        public static final int CONSTRUCTOR = 578181272;

        public Text() {
        }

        public Text(String var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return 578181272;
        }
    }

    public static class TestVectorStringObject extends TdApi.Object {
        public TdApi.TestString[] value;
        public static final int CONSTRUCTOR = 80780537;

        public TestVectorStringObject() {
        }

        public TestVectorStringObject(TdApi.TestString[] var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return 80780537;
        }
    }

    public static class TestVectorString extends TdApi.Object {
        public String[] value;
        public static final int CONSTRUCTOR = 79339995;

        public TestVectorString() {
        }

        public TestVectorString(String[] var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return 79339995;
        }
    }

    public static class TestVectorIntObject extends TdApi.Object {
        public TdApi.TestInt[] value;
        public static final int CONSTRUCTOR = 125891546;

        public TestVectorIntObject() {
        }

        public TestVectorIntObject(TdApi.TestInt[] var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return 125891546;
        }
    }

    public static class TestVectorInt extends TdApi.Object {
        public int[] value;
        public static final int CONSTRUCTOR = 593682027;

        public TestVectorInt() {
        }

        public TestVectorInt(int[] var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return 593682027;
        }
    }

    public static class TestString extends TdApi.Object {
        public String value;
        public static final int CONSTRUCTOR = -27891572;

        public TestString() {
        }

        public TestString(String var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return -27891572;
        }
    }

    public static class TestInt extends TdApi.Object {
        public int value;
        public static final int CONSTRUCTOR = -574804983;

        public TestInt() {
        }

        public TestInt(int var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return -574804983;
        }
    }

    public static class TestBytes extends TdApi.Object {
        public byte[] value;
        public static final int CONSTRUCTOR = -1541225250;

        public TestBytes() {
        }

        public TestBytes(byte[] var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return -1541225250;
        }
    }

    public static class TermsOfService extends TdApi.Object {
        public TdApi.FormattedText text;
        public int minUserAge;
        public boolean showPopup;
        public static final int CONSTRUCTOR = 739422597;

        public TermsOfService() {
        }

        public TermsOfService(TdApi.FormattedText var1, int var2, boolean var3) {
            this.text = var1;
            this.minUserAge = var2;
            this.showPopup = var3;
        }

        public int getConstructor() {
            return 739422597;
        }
    }

    public static class TemporaryPasswordState extends TdApi.Object {
        public boolean hasPassword;
        public int validFor;
        public static final int CONSTRUCTOR = 939837410;

        public TemporaryPasswordState() {
        }

        public TemporaryPasswordState(boolean var1, int var2) {
            this.hasPassword = var1;
            this.validFor = var2;
        }

        public int getConstructor() {
            return 939837410;
        }
    }

    public static class TargetChatInternalLink extends TdApi.TargetChat {
        public TdApi.InternalLinkType link;
        public static final int CONSTRUCTOR = -579301408;

        public TargetChatInternalLink() {
        }

        public TargetChatInternalLink(TdApi.InternalLinkType var1) {
            this.link = var1;
        }

        public int getConstructor() {
            return -579301408;
        }
    }

    public static class TargetChatChosen extends TdApi.TargetChat {
        public boolean allowUserChats;
        public boolean allowBotChats;
        public boolean allowGroupChats;
        public boolean allowChannelChats;
        public static final int CONSTRUCTOR = -307442990;

        public TargetChatChosen() {
        }

        public TargetChatChosen(boolean var1, boolean var2, boolean var3, boolean var4) {
            this.allowUserChats = var1;
            this.allowBotChats = var2;
            this.allowGroupChats = var3;
            this.allowChannelChats = var4;
        }

        public int getConstructor() {
            return -307442990;
        }
    }

    public static class TargetChatCurrent extends TdApi.TargetChat {
        public static final int CONSTRUCTOR = -416689904;

        public TargetChatCurrent() {
        }

        public int getConstructor() {
            return -416689904;
        }
    }

    public abstract static class TargetChat extends TdApi.Object {
        public TargetChat() {
        }
    }

    public static class TMeUrls extends TdApi.Object {
        public TdApi.TMeUrl[] urls;
        public static final int CONSTRUCTOR = -1130595098;

        public TMeUrls() {
        }

        public TMeUrls(TdApi.TMeUrl[] var1) {
            this.urls = var1;
        }

        public int getConstructor() {
            return -1130595098;
        }
    }

    public static class TMeUrlTypeStickerSet extends TdApi.TMeUrlType {
        public long stickerSetId;
        public static final int CONSTRUCTOR = 1602473196;

        public TMeUrlTypeStickerSet() {
        }

        public TMeUrlTypeStickerSet(long var1) {
            this.stickerSetId = var1;
        }

        public int getConstructor() {
            return 1602473196;
        }
    }

    public static class TMeUrlTypeChatInvite extends TdApi.TMeUrlType {
        public TdApi.ChatInviteLinkInfo info;
        public static final int CONSTRUCTOR = 313907785;

        public TMeUrlTypeChatInvite() {
        }

        public TMeUrlTypeChatInvite(TdApi.ChatInviteLinkInfo var1) {
            this.info = var1;
        }

        public int getConstructor() {
            return 313907785;
        }
    }

    public static class TMeUrlTypeSupergroup extends TdApi.TMeUrlType {
        public long supergroupId;
        public static final int CONSTRUCTOR = -1353369944;

        public TMeUrlTypeSupergroup() {
        }

        public TMeUrlTypeSupergroup(long var1) {
            this.supergroupId = var1;
        }

        public int getConstructor() {
            return -1353369944;
        }
    }

    public static class TMeUrlTypeUser extends TdApi.TMeUrlType {
        public long userId;
        public static final int CONSTRUCTOR = 125336602;

        public TMeUrlTypeUser() {
        }

        public TMeUrlTypeUser(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return 125336602;
        }
    }

    public abstract static class TMeUrlType extends TdApi.Object {
        public TMeUrlType() {
        }
    }

    public static class TMeUrl extends TdApi.Object {
        public String url;
        public TdApi.TMeUrlType type;
        public static final int CONSTRUCTOR = -1140786622;

        public TMeUrl() {
        }

        public TMeUrl(String var1, TdApi.TMeUrlType var2) {
            this.url = var1;
            this.type = var2;
        }

        public int getConstructor() {
            return -1140786622;
        }
    }

    public static class SupergroupMembersFilterBots extends TdApi.SupergroupMembersFilter {
        public static final int CONSTRUCTOR = 492138918;

        public SupergroupMembersFilterBots() {
        }

        public int getConstructor() {
            return 492138918;
        }
    }

    public static class SupergroupMembersFilterMention extends TdApi.SupergroupMembersFilter {
        public String query;
        public long messageThreadId;
        public static final int CONSTRUCTOR = 947915036;

        public SupergroupMembersFilterMention() {
        }

        public SupergroupMembersFilterMention(String var1, long var2) {
            this.query = var1;
            this.messageThreadId = var2;
        }

        public int getConstructor() {
            return 947915036;
        }
    }

    public static class SupergroupMembersFilterBanned extends TdApi.SupergroupMembersFilter {
        public String query;
        public static final int CONSTRUCTOR = -1210621683;

        public SupergroupMembersFilterBanned() {
        }

        public SupergroupMembersFilterBanned(String var1) {
            this.query = var1;
        }

        public int getConstructor() {
            return -1210621683;
        }
    }

    public static class SupergroupMembersFilterRestricted extends TdApi.SupergroupMembersFilter {
        public String query;
        public static final int CONSTRUCTOR = -1107800034;

        public SupergroupMembersFilterRestricted() {
        }

        public SupergroupMembersFilterRestricted(String var1) {
            this.query = var1;
        }

        public int getConstructor() {
            return -1107800034;
        }
    }

    public static class SupergroupMembersFilterSearch extends TdApi.SupergroupMembersFilter {
        public String query;
        public static final int CONSTRUCTOR = -1696358469;

        public SupergroupMembersFilterSearch() {
        }

        public SupergroupMembersFilterSearch(String var1) {
            this.query = var1;
        }

        public int getConstructor() {
            return -1696358469;
        }
    }

    public static class SupergroupMembersFilterAdministrators extends TdApi.SupergroupMembersFilter {
        public static final int CONSTRUCTOR = -2097380265;

        public SupergroupMembersFilterAdministrators() {
        }

        public int getConstructor() {
            return -2097380265;
        }
    }

    public static class SupergroupMembersFilterContacts extends TdApi.SupergroupMembersFilter {
        public String query;
        public static final int CONSTRUCTOR = -1282910856;

        public SupergroupMembersFilterContacts() {
        }

        public SupergroupMembersFilterContacts(String var1) {
            this.query = var1;
        }

        public int getConstructor() {
            return -1282910856;
        }
    }

    public static class SupergroupMembersFilterRecent extends TdApi.SupergroupMembersFilter {
        public static final int CONSTRUCTOR = 1178199509;

        public SupergroupMembersFilterRecent() {
        }

        public int getConstructor() {
            return 1178199509;
        }
    }

    public abstract static class SupergroupMembersFilter extends TdApi.Object {
        public SupergroupMembersFilter() {
        }
    }

    public static class SupergroupFullInfo extends TdApi.Object {
        public TdApi.ChatPhoto photo;
        public String description;
        public int memberCount;
        public int administratorCount;
        public int restrictedCount;
        public int bannedCount;
        public long linkedChatId;
        public int slowModeDelay;
        public double slowModeDelayExpiresIn;
        public boolean canGetMembers;
        public boolean hasHiddenMembers;
        public boolean canHideMembers;
        public boolean canSetStickerSet;
        public boolean canSetLocation;
        public boolean canGetStatistics;
        public boolean canToggleAggressiveAntiSpam;
        public boolean isAllHistoryAvailable;
        public boolean hasAggressiveAntiSpamEnabled;
        public long stickerSetId;
        public TdApi.ChatLocation location;
        public TdApi.ChatInviteLink inviteLink;
        public TdApi.BotCommands[] botCommands;
        public long upgradedFromBasicGroupId;
        public long upgradedFromMaxMessageId;
        public static final int CONSTRUCTOR = 266702736;

        public SupergroupFullInfo() {
        }

        public SupergroupFullInfo(TdApi.ChatPhoto var1, String var2, int var3, int var4, int var5, int var6, long var7, int var9, double var10, boolean var12, boolean var13, boolean var14, boolean var15, boolean var16, boolean var17, boolean var18, boolean var19, boolean var20, long var21, TdApi.ChatLocation var23, TdApi.ChatInviteLink var24, TdApi.BotCommands[] var25, long var26, long var28) {
            this.photo = var1;
            this.description = var2;
            this.memberCount = var3;
            this.administratorCount = var4;
            this.restrictedCount = var5;
            this.bannedCount = var6;
            this.linkedChatId = var7;
            this.slowModeDelay = var9;
            this.slowModeDelayExpiresIn = var10;
            this.canGetMembers = var12;
            this.hasHiddenMembers = var13;
            this.canHideMembers = var14;
            this.canSetStickerSet = var15;
            this.canSetLocation = var16;
            this.canGetStatistics = var17;
            this.canToggleAggressiveAntiSpam = var18;
            this.isAllHistoryAvailable = var19;
            this.hasAggressiveAntiSpamEnabled = var20;
            this.stickerSetId = var21;
            this.location = var23;
            this.inviteLink = var24;
            this.botCommands = var25;
            this.upgradedFromBasicGroupId = var26;
            this.upgradedFromMaxMessageId = var28;
        }

        public int getConstructor() {
            return 266702736;
        }
    }

    public static class Supergroup extends TdApi.Object {
        public long id;
        public TdApi.Usernames usernames;
        public int date;
        public TdApi.ChatMemberStatus status;
        public int memberCount;
        public boolean hasLinkedChat;
        public boolean hasLocation;
        public boolean signMessages;
        public boolean joinToSendMessages;
        public boolean joinByRequest;
        public boolean isSlowModeEnabled;
        public boolean isChannel;
        public boolean isBroadcastGroup;
        public boolean isForum;
        public boolean isVerified;
        public String restrictionReason;
        public boolean isScam;
        public boolean isFake;
        public static final int CONSTRUCTOR = -2002240425;

        public Supergroup() {
        }

        public Supergroup(long var1, TdApi.Usernames var3, int var4, TdApi.ChatMemberStatus var5, int var6, boolean var7, boolean var8, boolean var9, boolean var10, boolean var11, boolean var12, boolean var13, boolean var14, boolean var15, boolean var16, String var17, boolean var18, boolean var19) {
            this.id = var1;
            this.usernames = var3;
            this.date = var4;
            this.status = var5;
            this.memberCount = var6;
            this.hasLinkedChat = var7;
            this.hasLocation = var8;
            this.signMessages = var9;
            this.joinToSendMessages = var10;
            this.joinByRequest = var11;
            this.isSlowModeEnabled = var12;
            this.isChannel = var13;
            this.isBroadcastGroup = var14;
            this.isForum = var15;
            this.isVerified = var16;
            this.restrictionReason = var17;
            this.isScam = var18;
            this.isFake = var19;
        }

        public int getConstructor() {
            return -2002240425;
        }
    }

    public static class SuggestedActionSubscribeToAnnualPremium extends TdApi.SuggestedAction {
        public static final int CONSTRUCTOR = 373913787;

        public SuggestedActionSubscribeToAnnualPremium() {
        }

        public int getConstructor() {
            return 373913787;
        }
    }

    public static class SuggestedActionRestorePremium extends TdApi.SuggestedAction {
        public static final int CONSTRUCTOR = -385229468;

        public SuggestedActionRestorePremium() {
        }

        public int getConstructor() {
            return -385229468;
        }
    }

    public static class SuggestedActionUpgradePremium extends TdApi.SuggestedAction {
        public static final int CONSTRUCTOR = 1890220539;

        public SuggestedActionUpgradePremium() {
        }

        public int getConstructor() {
            return 1890220539;
        }
    }

    public static class SuggestedActionSetPassword extends TdApi.SuggestedAction {
        public int authorizationDelay;
        public static final int CONSTRUCTOR = 1863613848;

        public SuggestedActionSetPassword() {
        }

        public SuggestedActionSetPassword(int var1) {
            this.authorizationDelay = var1;
        }

        public int getConstructor() {
            return 1863613848;
        }
    }

    public static class SuggestedActionConvertToBroadcastGroup extends TdApi.SuggestedAction {
        public long supergroupId;
        public static final int CONSTRUCTOR = -965071304;

        public SuggestedActionConvertToBroadcastGroup() {
        }

        public SuggestedActionConvertToBroadcastGroup(long var1) {
            this.supergroupId = var1;
        }

        public int getConstructor() {
            return -965071304;
        }
    }

    public static class SuggestedActionViewChecksHint extends TdApi.SuggestedAction {
        public static final int CONSTRUCTOR = 891303239;

        public SuggestedActionViewChecksHint() {
        }

        public int getConstructor() {
            return 891303239;
        }
    }

    public static class SuggestedActionCheckPhoneNumber extends TdApi.SuggestedAction {
        public static final int CONSTRUCTOR = 648771563;

        public SuggestedActionCheckPhoneNumber() {
        }

        public int getConstructor() {
            return 648771563;
        }
    }

    public static class SuggestedActionCheckPassword extends TdApi.SuggestedAction {
        public static final int CONSTRUCTOR = 1910534839;

        public SuggestedActionCheckPassword() {
        }

        public int getConstructor() {
            return 1910534839;
        }
    }

    public static class SuggestedActionEnableArchiveAndMuteNewChats extends TdApi.SuggestedAction {
        public static final int CONSTRUCTOR = 2017586255;

        public SuggestedActionEnableArchiveAndMuteNewChats() {
        }

        public int getConstructor() {
            return 2017586255;
        }
    }

    public abstract static class SuggestedAction extends TdApi.Object {
        public SuggestedAction() {
        }
    }

    public static class StoryViewers extends TdApi.Object {
        public int totalCount;
        public TdApi.StoryViewer[] viewers;
        public String nextOffset;
        public static final int CONSTRUCTOR = -216607432;

        public StoryViewers() {
        }

        public StoryViewers(int var1, TdApi.StoryViewer[] var2, String var3) {
            this.totalCount = var1;
            this.viewers = var2;
            this.nextOffset = var3;
        }

        public int getConstructor() {
            return -216607432;
        }
    }

    public static class StoryViewer extends TdApi.Object {
        public long userId;
        public int viewDate;
        public TdApi.BlockList blockList;
        public TdApi.ReactionType chosenReactionType;
        public static final int CONSTRUCTOR = -821055182;

        public StoryViewer() {
        }

        public StoryViewer(long var1, int var3, TdApi.BlockList var4, TdApi.ReactionType var5) {
            this.userId = var1;
            this.viewDate = var3;
            this.blockList = var4;
            this.chosenReactionType = var5;
        }

        public int getConstructor() {
            return -821055182;
        }
    }

    public static class StoryVideo extends TdApi.Object {
        public double duration;
        public int width;
        public int height;
        public boolean hasStickers;
        public boolean isAnimation;
        public TdApi.Minithumbnail minithumbnail;
        public TdApi.Thumbnail thumbnail;
        public int preloadPrefixSize;
        public TdApi.File video;
        public static final int CONSTRUCTOR = 140020643;

        public StoryVideo() {
        }

        public StoryVideo(double var1, int var3, int var4, boolean var5, boolean var6, TdApi.Minithumbnail var7, TdApi.Thumbnail var8, int var9, TdApi.File var10) {
            this.duration = var1;
            this.width = var3;
            this.height = var4;
            this.hasStickers = var5;
            this.isAnimation = var6;
            this.minithumbnail = var7;
            this.thumbnail = var8;
            this.preloadPrefixSize = var9;
            this.video = var10;
        }

        public int getConstructor() {
            return 140020643;
        }
    }

    public static class StoryPrivacySettingsSelectedContacts extends TdApi.StoryPrivacySettings {
        public long[] userIds;
        public static final int CONSTRUCTOR = -909662617;

        public StoryPrivacySettingsSelectedContacts() {
        }

        public StoryPrivacySettingsSelectedContacts(long[] var1) {
            this.userIds = var1;
        }

        public int getConstructor() {
            return -909662617;
        }
    }

    public static class StoryPrivacySettingsCloseFriends extends TdApi.StoryPrivacySettings {
        public static final int CONSTRUCTOR = 2097122144;

        public StoryPrivacySettingsCloseFriends() {
        }

        public int getConstructor() {
            return 2097122144;
        }
    }

    public static class StoryPrivacySettingsContacts extends TdApi.StoryPrivacySettings {
        public long[] exceptUserIds;
        public static final int CONSTRUCTOR = 50285309;

        public StoryPrivacySettingsContacts() {
        }

        public StoryPrivacySettingsContacts(long[] var1) {
            this.exceptUserIds = var1;
        }

        public int getConstructor() {
            return 50285309;
        }
    }

    public static class StoryPrivacySettingsEveryone extends TdApi.StoryPrivacySettings {
        public long[] exceptUserIds;
        public static final int CONSTRUCTOR = 890847843;

        public StoryPrivacySettingsEveryone() {
        }

        public StoryPrivacySettingsEveryone(long[] var1) {
            this.exceptUserIds = var1;
        }

        public int getConstructor() {
            return 890847843;
        }
    }

    public abstract static class StoryPrivacySettings extends TdApi.Object {
        public StoryPrivacySettings() {
        }
    }

    public static class StoryListArchive extends TdApi.StoryList {
        public static final int CONSTRUCTOR = -41900223;

        public StoryListArchive() {
        }

        public int getConstructor() {
            return -41900223;
        }
    }

    public static class StoryListMain extends TdApi.StoryList {
        public static final int CONSTRUCTOR = -672222209;

        public StoryListMain() {
        }

        public int getConstructor() {
            return -672222209;
        }
    }

    public abstract static class StoryList extends TdApi.Object {
        public StoryList() {
        }
    }

    public static class StoryInteractionInfo extends TdApi.Object {
        public int viewCount;
        public int reactionCount;
        public long[] recentViewerUserIds;
        public static final int CONSTRUCTOR = 1396789129;

        public StoryInteractionInfo() {
        }

        public StoryInteractionInfo(int var1, int var2, long[] var3) {
            this.viewCount = var1;
            this.reactionCount = var2;
            this.recentViewerUserIds = var3;
        }

        public int getConstructor() {
            return 1396789129;
        }
    }

    public static class StoryInfo extends TdApi.Object {
        public int storyId;
        public int date;
        public boolean isForCloseFriends;
        public static final int CONSTRUCTOR = -1986542766;

        public StoryInfo() {
        }

        public StoryInfo(int var1, int var2, boolean var3) {
            this.storyId = var1;
            this.date = var2;
            this.isForCloseFriends = var3;
        }

        public int getConstructor() {
            return -1986542766;
        }
    }

    public static class StoryContentUnsupported extends TdApi.StoryContent {
        public static final int CONSTRUCTOR = -2033715858;

        public StoryContentUnsupported() {
        }

        public int getConstructor() {
            return -2033715858;
        }
    }

    public static class StoryContentVideo extends TdApi.StoryContent {
        public TdApi.StoryVideo video;
        public TdApi.StoryVideo alternativeVideo;
        public static final int CONSTRUCTOR = -1291754842;

        public StoryContentVideo() {
        }

        public StoryContentVideo(TdApi.StoryVideo var1, TdApi.StoryVideo var2) {
            this.video = var1;
            this.alternativeVideo = var2;
        }

        public int getConstructor() {
            return -1291754842;
        }
    }

    public static class StoryContentPhoto extends TdApi.StoryContent {
        public TdApi.Photo photo;
        public static final int CONSTRUCTOR = -731971504;

        public StoryContentPhoto() {
        }

        public StoryContentPhoto(TdApi.Photo var1) {
            this.photo = var1;
        }

        public int getConstructor() {
            return -731971504;
        }
    }

    public abstract static class StoryContent extends TdApi.Object {
        public StoryContent() {
        }
    }

    public static class StoryAreaTypeVenue extends TdApi.StoryAreaType {
        public TdApi.Venue venue;
        public static final int CONSTRUCTOR = 414076166;

        public StoryAreaTypeVenue() {
        }

        public StoryAreaTypeVenue(TdApi.Venue var1) {
            this.venue = var1;
        }

        public int getConstructor() {
            return 414076166;
        }
    }

    public static class StoryAreaTypeLocation extends TdApi.StoryAreaType {
        public TdApi.Location location;
        public static final int CONSTRUCTOR = -1631710842;

        public StoryAreaTypeLocation() {
        }

        public StoryAreaTypeLocation(TdApi.Location var1) {
            this.location = var1;
        }

        public int getConstructor() {
            return -1631710842;
        }
    }

    public abstract static class StoryAreaType extends TdApi.Object {
        public StoryAreaType() {
        }
    }

    public static class StoryAreaPosition extends TdApi.Object {
        public double xPercentage;
        public double yPercentage;
        public double widthPercentage;
        public double heightPercentage;
        public double rotationAngle;
        public static final int CONSTRUCTOR = 104371833;

        public StoryAreaPosition() {
        }

        public StoryAreaPosition(double var1, double var3, double var5, double var7, double var9) {
            this.xPercentage = var1;
            this.yPercentage = var3;
            this.widthPercentage = var5;
            this.heightPercentage = var7;
            this.rotationAngle = var9;
        }

        public int getConstructor() {
            return 104371833;
        }
    }

    public static class StoryArea extends TdApi.Object {
        public TdApi.StoryAreaPosition position;
        public TdApi.StoryAreaType type;
        public static final int CONSTRUCTOR = -906033314;

        public StoryArea() {
        }

        public StoryArea(TdApi.StoryAreaPosition var1, TdApi.StoryAreaType var2) {
            this.position = var1;
            this.type = var2;
        }

        public int getConstructor() {
            return -906033314;
        }
    }

    public static class Story extends TdApi.Object {
        public int id;
        public long senderChatId;
        public int date;
        public boolean isBeingSent;
        public boolean isBeingEdited;
        public boolean isEdited;
        public boolean isPinned;
        public boolean isVisibleOnlyForSelf;
        public boolean canBeForwarded;
        public boolean canBeReplied;
        public boolean canGetViewers;
        public boolean hasExpiredViewers;
        public TdApi.StoryInteractionInfo interactionInfo;
        public TdApi.ReactionType chosenReactionType;
        public TdApi.StoryPrivacySettings privacySettings;
        public TdApi.StoryContent content;
        public TdApi.StoryArea[] areas;
        public TdApi.FormattedText caption;
        public static final int CONSTRUCTOR = 1807257120;

        public Story() {
        }

        public Story(int var1, long var2, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9, boolean var10, boolean var11, boolean var12, boolean var13, TdApi.StoryInteractionInfo var14, TdApi.ReactionType var15, TdApi.StoryPrivacySettings var16, TdApi.StoryContent var17, TdApi.StoryArea[] var18, TdApi.FormattedText var19) {
            this.id = var1;
            this.senderChatId = var2;
            this.date = var4;
            this.isBeingSent = var5;
            this.isBeingEdited = var6;
            this.isEdited = var7;
            this.isPinned = var8;
            this.isVisibleOnlyForSelf = var9;
            this.canBeForwarded = var10;
            this.canBeReplied = var11;
            this.canGetViewers = var12;
            this.hasExpiredViewers = var13;
            this.interactionInfo = var14;
            this.chosenReactionType = var15;
            this.privacySettings = var16;
            this.content = var17;
            this.areas = var18;
            this.caption = var19;
        }

        public int getConstructor() {
            return 1807257120;
        }
    }

    public static class Stories extends TdApi.Object {
        public int totalCount;
        public TdApi.Story[] stories;
        public static final int CONSTRUCTOR = 1956235103;

        public Stories() {
        }

        public Stories(int var1, TdApi.Story[] var2) {
            this.totalCount = var1;
            this.stories = var2;
        }

        public int getConstructor() {
            return 1956235103;
        }
    }

    public static class StorePaymentPurposeGiftedPremium extends TdApi.StorePaymentPurpose {
        public long userId;
        public String currency;
        public long amount;
        public static final int CONSTRUCTOR = 1916846289;

        public StorePaymentPurposeGiftedPremium() {
        }

        public StorePaymentPurposeGiftedPremium(long var1, String var3, long var4) {
            this.userId = var1;
            this.currency = var3;
            this.amount = var4;
        }

        public int getConstructor() {
            return 1916846289;
        }
    }

    public static class StorePaymentPurposePremiumSubscription extends TdApi.StorePaymentPurpose {
        public boolean isRestore;
        public boolean isUpgrade;
        public static final int CONSTRUCTOR = 1263894804;

        public StorePaymentPurposePremiumSubscription() {
        }

        public StorePaymentPurposePremiumSubscription(boolean var1, boolean var2) {
            this.isRestore = var1;
            this.isUpgrade = var2;
        }

        public int getConstructor() {
            return 1263894804;
        }
    }

    public abstract static class StorePaymentPurpose extends TdApi.Object {
        public StorePaymentPurpose() {
        }
    }

    public static class StorageStatisticsFast extends TdApi.Object {
        public long filesSize;
        public int fileCount;
        public long databaseSize;
        public long languagePackDatabaseSize;
        public long logSize;
        public static final int CONSTRUCTOR = -884922271;

        public StorageStatisticsFast() {
        }

        public StorageStatisticsFast(long var1, int var3, long var4, long var6, long var8) {
            this.filesSize = var1;
            this.fileCount = var3;
            this.databaseSize = var4;
            this.languagePackDatabaseSize = var6;
            this.logSize = var8;
        }

        public int getConstructor() {
            return -884922271;
        }
    }

    public static class StorageStatisticsByFileType extends TdApi.Object {
        public TdApi.FileType fileType;
        public long size;
        public int count;
        public static final int CONSTRUCTOR = 714012840;

        public StorageStatisticsByFileType() {
        }

        public StorageStatisticsByFileType(TdApi.FileType var1, long var2, int var4) {
            this.fileType = var1;
            this.size = var2;
            this.count = var4;
        }

        public int getConstructor() {
            return 714012840;
        }
    }

    public static class StorageStatisticsByChat extends TdApi.Object {
        public long chatId;
        public long size;
        public int count;
        public TdApi.StorageStatisticsByFileType[] byFileType;
        public static final int CONSTRUCTOR = 635434531;

        public StorageStatisticsByChat() {
        }

        public StorageStatisticsByChat(long var1, long var3, int var5, TdApi.StorageStatisticsByFileType[] var6) {
            this.chatId = var1;
            this.size = var3;
            this.count = var5;
            this.byFileType = var6;
        }

        public int getConstructor() {
            return 635434531;
        }
    }

    public static class StorageStatistics extends TdApi.Object {
        public long size;
        public int count;
        public TdApi.StorageStatisticsByChat[] byChat;
        public static final int CONSTRUCTOR = 217237013;

        public StorageStatistics() {
        }

        public StorageStatistics(long var1, int var3, TdApi.StorageStatisticsByChat[] var4) {
            this.size = var1;
            this.count = var3;
            this.byChat = var4;
        }

        public int getConstructor() {
            return 217237013;
        }
    }

    public static class Stickers extends TdApi.Object {
        public TdApi.Sticker[] stickers;
        public static final int CONSTRUCTOR = 1974859260;

        public Stickers() {
        }

        public Stickers(TdApi.Sticker[] var1) {
            this.stickers = var1;
        }

        public int getConstructor() {
            return 1974859260;
        }
    }

    public static class StickerTypeCustomEmoji extends TdApi.StickerType {
        public static final int CONSTRUCTOR = -120752249;

        public StickerTypeCustomEmoji() {
        }

        public int getConstructor() {
            return -120752249;
        }
    }

    public static class StickerTypeMask extends TdApi.StickerType {
        public static final int CONSTRUCTOR = -1765394796;

        public StickerTypeMask() {
        }

        public int getConstructor() {
            return -1765394796;
        }
    }

    public static class StickerTypeRegular extends TdApi.StickerType {
        public static final int CONSTRUCTOR = 56345973;

        public StickerTypeRegular() {
        }

        public int getConstructor() {
            return 56345973;
        }
    }

    public abstract static class StickerType extends TdApi.Object {
        public StickerType() {
        }
    }

    public static class StickerSets extends TdApi.Object {
        public int totalCount;
        public TdApi.StickerSetInfo[] sets;
        public static final int CONSTRUCTOR = -1883828812;

        public StickerSets() {
        }

        public StickerSets(int var1, TdApi.StickerSetInfo[] var2) {
            this.totalCount = var1;
            this.sets = var2;
        }

        public int getConstructor() {
            return -1883828812;
        }
    }

    public static class StickerSetInfo extends TdApi.Object {
        public long id;
        public String title;
        public String name;
        public TdApi.Thumbnail thumbnail;
        public TdApi.ClosedVectorPath[] thumbnailOutline;
        public boolean isInstalled;
        public boolean isArchived;
        public boolean isOfficial;
        public TdApi.StickerFormat stickerFormat;
        public TdApi.StickerType stickerType;
        public boolean isViewed;
        public int size;
        public TdApi.Sticker[] covers;
        public static final int CONSTRUCTOR = 745543121;

        public StickerSetInfo() {
        }

        public StickerSetInfo(long var1, String var3, String var4, TdApi.Thumbnail var5, TdApi.ClosedVectorPath[] var6, boolean var7, boolean var8, boolean var9, TdApi.StickerFormat var10, TdApi.StickerType var11, boolean var12, int var13, TdApi.Sticker[] var14) {
            this.id = var1;
            this.title = var3;
            this.name = var4;
            this.thumbnail = var5;
            this.thumbnailOutline = var6;
            this.isInstalled = var7;
            this.isArchived = var8;
            this.isOfficial = var9;
            this.stickerFormat = var10;
            this.stickerType = var11;
            this.isViewed = var12;
            this.size = var13;
            this.covers = var14;
        }

        public int getConstructor() {
            return 745543121;
        }
    }

    public static class StickerSet extends TdApi.Object {
        public long id;
        public String title;
        public String name;
        public TdApi.Thumbnail thumbnail;
        public TdApi.ClosedVectorPath[] thumbnailOutline;
        public boolean isInstalled;
        public boolean isArchived;
        public boolean isOfficial;
        public TdApi.StickerFormat stickerFormat;
        public TdApi.StickerType stickerType;
        public boolean isViewed;
        public TdApi.Sticker[] stickers;
        public TdApi.Emojis[] emojis;
        public static final int CONSTRUCTOR = 1899632064;

        public StickerSet() {
        }

        public StickerSet(long var1, String var3, String var4, TdApi.Thumbnail var5, TdApi.ClosedVectorPath[] var6, boolean var7, boolean var8, boolean var9, TdApi.StickerFormat var10, TdApi.StickerType var11, boolean var12, TdApi.Sticker[] var13, TdApi.Emojis[] var14) {
            this.id = var1;
            this.title = var3;
            this.name = var4;
            this.thumbnail = var5;
            this.thumbnailOutline = var6;
            this.isInstalled = var7;
            this.isArchived = var8;
            this.isOfficial = var9;
            this.stickerFormat = var10;
            this.stickerType = var11;
            this.isViewed = var12;
            this.stickers = var13;
            this.emojis = var14;
        }

        public int getConstructor() {
            return 1899632064;
        }
    }

    public static class StickerFullTypeCustomEmoji extends TdApi.StickerFullType {
        public long customEmojiId;
        public boolean needsRepainting;
        public static final int CONSTRUCTOR = -1015085653;

        public StickerFullTypeCustomEmoji() {
        }

        public StickerFullTypeCustomEmoji(long var1, boolean var3) {
            this.customEmojiId = var1;
            this.needsRepainting = var3;
        }

        public int getConstructor() {
            return -1015085653;
        }
    }

    public static class StickerFullTypeMask extends TdApi.StickerFullType {
        public TdApi.MaskPosition maskPosition;
        public static final int CONSTRUCTOR = 652197687;

        public StickerFullTypeMask() {
        }

        public StickerFullTypeMask(TdApi.MaskPosition var1) {
            this.maskPosition = var1;
        }

        public int getConstructor() {
            return 652197687;
        }
    }

    public static class StickerFullTypeRegular extends TdApi.StickerFullType {
        public TdApi.File premiumAnimation;
        public static final int CONSTRUCTOR = -2006425865;

        public StickerFullTypeRegular() {
        }

        public StickerFullTypeRegular(TdApi.File var1) {
            this.premiumAnimation = var1;
        }

        public int getConstructor() {
            return -2006425865;
        }
    }

    public abstract static class StickerFullType extends TdApi.Object {
        public StickerFullType() {
        }
    }

    public static class StickerFormatWebm extends TdApi.StickerFormat {
        public static final int CONSTRUCTOR = -2070162097;

        public StickerFormatWebm() {
        }

        public int getConstructor() {
            return -2070162097;
        }
    }

    public static class StickerFormatTgs extends TdApi.StickerFormat {
        public static final int CONSTRUCTOR = 1614588662;

        public StickerFormatTgs() {
        }

        public int getConstructor() {
            return 1614588662;
        }
    }

    public static class StickerFormatWebp extends TdApi.StickerFormat {
        public static final int CONSTRUCTOR = -2123043040;

        public StickerFormatWebp() {
        }

        public int getConstructor() {
            return -2123043040;
        }
    }

    public abstract static class StickerFormat extends TdApi.Object {
        public StickerFormat() {
        }
    }

    public static class Sticker extends TdApi.Object {
        public long id;
        public long setId;
        public int width;
        public int height;
        public String emoji;
        public TdApi.StickerFormat format;
        public TdApi.StickerFullType fullType;
        public TdApi.ClosedVectorPath[] outline;
        public TdApi.Thumbnail thumbnail;
        public TdApi.File sticker;
        public static final int CONSTRUCTOR = 1155605331;

        public Sticker() {
        }

        public Sticker(long var1, long var3, int var5, int var6, String var7, TdApi.StickerFormat var8, TdApi.StickerFullType var9, TdApi.ClosedVectorPath[] var10, TdApi.Thumbnail var11, TdApi.File var12) {
            this.id = var1;
            this.setId = var3;
            this.width = var5;
            this.height = var6;
            this.emoji = var7;
            this.format = var8;
            this.fullType = var9;
            this.outline = var10;
            this.thumbnail = var11;
            this.sticker = var12;
        }

        public int getConstructor() {
            return 1155605331;
        }
    }

    public static class StatisticalValue extends TdApi.Object {
        public double value;
        public double previousValue;
        public double growthRatePercentage;
        public static final int CONSTRUCTOR = 1651337846;

        public StatisticalValue() {
        }

        public StatisticalValue(double var1, double var3, double var5) {
            this.value = var1;
            this.previousValue = var3;
            this.growthRatePercentage = var5;
        }

        public int getConstructor() {
            return 1651337846;
        }
    }

    public static class StatisticalGraphError extends TdApi.StatisticalGraph {
        public String errorMessage;
        public static final int CONSTRUCTOR = -1006788526;

        public StatisticalGraphError() {
        }

        public StatisticalGraphError(String var1) {
            this.errorMessage = var1;
        }

        public int getConstructor() {
            return -1006788526;
        }
    }

    public static class StatisticalGraphAsync extends TdApi.StatisticalGraph {
        public String token;
        public static final int CONSTRUCTOR = 435891103;

        public StatisticalGraphAsync() {
        }

        public StatisticalGraphAsync(String var1) {
            this.token = var1;
        }

        public int getConstructor() {
            return 435891103;
        }
    }

    public static class StatisticalGraphData extends TdApi.StatisticalGraph {
        public String jsonData;
        public String zoomToken;
        public static final int CONSTRUCTOR = -1988940244;

        public StatisticalGraphData() {
        }

        public StatisticalGraphData(String var1, String var2) {
            this.jsonData = var1;
            this.zoomToken = var2;
        }

        public int getConstructor() {
            return -1988940244;
        }
    }

    public abstract static class StatisticalGraph extends TdApi.Object {
        public StatisticalGraph() {
        }
    }

    public static class SponsoredMessages extends TdApi.Object {
        public TdApi.SponsoredMessage[] messages;
        public int messagesBetween;
        public static final int CONSTRUCTOR = -537674389;

        public SponsoredMessages() {
        }

        public SponsoredMessages(TdApi.SponsoredMessage[] var1, int var2) {
            this.messages = var1;
            this.messagesBetween = var2;
        }

        public int getConstructor() {
            return -537674389;
        }
    }

    public static class SponsoredMessage extends TdApi.Object {
        public long messageId;
        public boolean isRecommended;
        public TdApi.MessageContent content;
        public TdApi.MessageSponsor sponsor;
        public String additionalInfo;
        public static final int CONSTRUCTOR = 138735836;

        public SponsoredMessage() {
        }

        public SponsoredMessage(long var1, boolean var3, TdApi.MessageContent var4, TdApi.MessageSponsor var5, String var6) {
            this.messageId = var1;
            this.isRecommended = var3;
            this.content = var4;
            this.sponsor = var5;
            this.additionalInfo = var6;
        }

        public int getConstructor() {
            return 138735836;
        }
    }

    public static class SpeechRecognitionResultError extends TdApi.SpeechRecognitionResult {
        public TdApi.Error error;
        public static final int CONSTRUCTOR = 164774908;

        public SpeechRecognitionResultError() {
        }

        public SpeechRecognitionResultError(TdApi.Error var1) {
            this.error = var1;
        }

        public int getConstructor() {
            return 164774908;
        }
    }

    public static class SpeechRecognitionResultText extends TdApi.SpeechRecognitionResult {
        public String text;
        public static final int CONSTRUCTOR = -2132377123;

        public SpeechRecognitionResultText() {
        }

        public SpeechRecognitionResultText(String var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return -2132377123;
        }
    }

    public static class SpeechRecognitionResultPending extends TdApi.SpeechRecognitionResult {
        public String partialText;
        public static final int CONSTRUCTOR = -1631810048;

        public SpeechRecognitionResultPending() {
        }

        public SpeechRecognitionResultPending(String var1) {
            this.partialText = var1;
        }

        public int getConstructor() {
            return -1631810048;
        }
    }

    public abstract static class SpeechRecognitionResult extends TdApi.Object {
        public SpeechRecognitionResult() {
        }
    }

    public static class ShippingOption extends TdApi.Object {
        public String id;
        public String title;
        public TdApi.LabeledPricePart[] priceParts;
        public static final int CONSTRUCTOR = 1425690001;

        public ShippingOption() {
        }

        public ShippingOption(String var1, String var2, TdApi.LabeledPricePart[] var3) {
            this.id = var1;
            this.title = var2;
            this.priceParts = var3;
        }

        public int getConstructor() {
            return 1425690001;
        }
    }

    public static class Sessions extends TdApi.Object {
        public TdApi.Session[] sessions;
        public int inactiveSessionTtlDays;
        public static final int CONSTRUCTOR = 842912274;

        public Sessions() {
        }

        public Sessions(TdApi.Session[] var1, int var2) {
            this.sessions = var1;
            this.inactiveSessionTtlDays = var2;
        }

        public int getConstructor() {
            return 842912274;
        }
    }

    public static class SessionTypeXbox extends TdApi.SessionType {
        public static final int CONSTRUCTOR = 1856216492;

        public SessionTypeXbox() {
        }

        public int getConstructor() {
            return 1856216492;
        }
    }

    public static class SessionTypeWindows extends TdApi.SessionType {
        public static final int CONSTRUCTOR = -1676512600;

        public SessionTypeWindows() {
        }

        public int getConstructor() {
            return -1676512600;
        }
    }

    public static class SessionTypeVivaldi extends TdApi.SessionType {
        public static final int CONSTRUCTOR = 1120503279;

        public SessionTypeVivaldi() {
        }

        public int getConstructor() {
            return 1120503279;
        }
    }

    public static class SessionTypeUnknown extends TdApi.SessionType {
        public static final int CONSTRUCTOR = 233926704;

        public SessionTypeUnknown() {
        }

        public int getConstructor() {
            return 233926704;
        }
    }

    public static class SessionTypeUbuntu extends TdApi.SessionType {
        public static final int CONSTRUCTOR = 1569680069;

        public SessionTypeUbuntu() {
        }

        public int getConstructor() {
            return 1569680069;
        }
    }

    public static class SessionTypeSafari extends TdApi.SessionType {
        public static final int CONSTRUCTOR = 710646873;

        public SessionTypeSafari() {
        }

        public int getConstructor() {
            return 710646873;
        }
    }

    public static class SessionTypeOpera extends TdApi.SessionType {
        public static final int CONSTRUCTOR = -1463673734;

        public SessionTypeOpera() {
        }

        public int getConstructor() {
            return -1463673734;
        }
    }

    public static class SessionTypeMac extends TdApi.SessionType {
        public static final int CONSTRUCTOR = -612250975;

        public SessionTypeMac() {
        }

        public int getConstructor() {
            return -612250975;
        }
    }

    public static class SessionTypeLinux extends TdApi.SessionType {
        public static final int CONSTRUCTOR = -1487422871;

        public SessionTypeLinux() {
        }

        public int getConstructor() {
            return -1487422871;
        }
    }

    public static class SessionTypeIphone extends TdApi.SessionType {
        public static final int CONSTRUCTOR = 97616573;

        public SessionTypeIphone() {
        }

        public int getConstructor() {
            return 97616573;
        }
    }

    public static class SessionTypeIpad extends TdApi.SessionType {
        public static final int CONSTRUCTOR = 1294647023;

        public SessionTypeIpad() {
        }

        public int getConstructor() {
            return 1294647023;
        }
    }

    public static class SessionTypeFirefox extends TdApi.SessionType {
        public static final int CONSTRUCTOR = 2122579364;

        public SessionTypeFirefox() {
        }

        public int getConstructor() {
            return 2122579364;
        }
    }

    public static class SessionTypeEdge extends TdApi.SessionType {
        public static final int CONSTRUCTOR = -538916005;

        public SessionTypeEdge() {
        }

        public int getConstructor() {
            return -538916005;
        }
    }

    public static class SessionTypeChrome extends TdApi.SessionType {
        public static final int CONSTRUCTOR = 1573464425;

        public SessionTypeChrome() {
        }

        public int getConstructor() {
            return 1573464425;
        }
    }

    public static class SessionTypeBrave extends TdApi.SessionType {
        public static final int CONSTRUCTOR = -1216812563;

        public SessionTypeBrave() {
        }

        public int getConstructor() {
            return -1216812563;
        }
    }

    public static class SessionTypeApple extends TdApi.SessionType {
        public static final int CONSTRUCTOR = -1818635701;

        public SessionTypeApple() {
        }

        public int getConstructor() {
            return -1818635701;
        }
    }

    public static class SessionTypeAndroid extends TdApi.SessionType {
        public static final int CONSTRUCTOR = -2071764840;

        public SessionTypeAndroid() {
        }

        public int getConstructor() {
            return -2071764840;
        }
    }

    public abstract static class SessionType extends TdApi.Object {
        public SessionType() {
        }
    }

    public static class Session extends TdApi.Object {
        public long id;
        public boolean isCurrent;
        public boolean isPasswordPending;
        public boolean canAcceptSecretChats;
        public boolean canAcceptCalls;
        public TdApi.SessionType type;
        public int apiId;
        public String applicationName;
        public String applicationVersion;
        public boolean isOfficialApplication;
        public String deviceModel;
        public String platform;
        public String systemVersion;
        public int logInDate;
        public int lastActiveDate;
        public String ip;
        public String country;
        public String region;
        public static final int CONSTRUCTOR = -1961323642;

        public Session() {
        }

        public Session(long var1, boolean var3, boolean var4, boolean var5, boolean var6, TdApi.SessionType var7, int var8, String var9, String var10, boolean var11, String var12, String var13, String var14, int var15, int var16, String var17, String var18, String var19) {
            this.id = var1;
            this.isCurrent = var3;
            this.isPasswordPending = var4;
            this.canAcceptSecretChats = var5;
            this.canAcceptCalls = var6;
            this.type = var7;
            this.apiId = var8;
            this.applicationName = var9;
            this.applicationVersion = var10;
            this.isOfficialApplication = var11;
            this.deviceModel = var12;
            this.platform = var13;
            this.systemVersion = var14;
            this.logInDate = var15;
            this.lastActiveDate = var16;
            this.ip = var17;
            this.country = var18;
            this.region = var19;
        }

        public int getConstructor() {
            return -1961323642;
        }
    }

    public static class SentWebAppMessage extends TdApi.Object {
        public String inlineMessageId;
        public static final int CONSTRUCTOR = 1243934400;

        public SentWebAppMessage() {
        }

        public SentWebAppMessage(String var1) {
            this.inlineMessageId = var1;
        }

        public int getConstructor() {
            return 1243934400;
        }
    }

    public static class SecretChatStateClosed extends TdApi.SecretChatState {
        public static final int CONSTRUCTOR = -1945106707;

        public SecretChatStateClosed() {
        }

        public int getConstructor() {
            return -1945106707;
        }
    }

    public static class SecretChatStateReady extends TdApi.SecretChatState {
        public static final int CONSTRUCTOR = -1611352087;

        public SecretChatStateReady() {
        }

        public int getConstructor() {
            return -1611352087;
        }
    }

    public static class SecretChatStatePending extends TdApi.SecretChatState {
        public static final int CONSTRUCTOR = -1637050756;

        public SecretChatStatePending() {
        }

        public int getConstructor() {
            return -1637050756;
        }
    }

    public abstract static class SecretChatState extends TdApi.Object {
        public SecretChatState() {
        }
    }

    public static class SecretChat extends TdApi.Object {
        public int id;
        public long userId;
        public TdApi.SecretChatState state;
        public boolean isOutbound;
        public byte[] keyHash;
        public int layer;
        public static final int CONSTRUCTOR = -676918325;

        public SecretChat() {
        }

        public SecretChat(int var1, long var2, TdApi.SecretChatState var4, boolean var5, byte[] var6, int var7) {
            this.id = var1;
            this.userId = var2;
            this.state = var4;
            this.isOutbound = var5;
            this.keyHash = var6;
            this.layer = var7;
        }

        public int getConstructor() {
            return -676918325;
        }
    }

    public static class Seconds extends TdApi.Object {
        public double seconds;
        public static final int CONSTRUCTOR = 959899022;

        public Seconds() {
        }

        public Seconds(double var1) {
            this.seconds = var1;
        }

        public int getConstructor() {
            return 959899022;
        }
    }

    public static class SearchMessagesFilterPinned extends TdApi.SearchMessagesFilter {
        public static final int CONSTRUCTOR = 371805512;

        public SearchMessagesFilterPinned() {
        }

        public int getConstructor() {
            return 371805512;
        }
    }

    public static class SearchMessagesFilterFailedToSend extends TdApi.SearchMessagesFilter {
        public static final int CONSTRUCTOR = -596322564;

        public SearchMessagesFilterFailedToSend() {
        }

        public int getConstructor() {
            return -596322564;
        }
    }

    public static class SearchMessagesFilterUnreadReaction extends TdApi.SearchMessagesFilter {
        public static final int CONSTRUCTOR = -1379651328;

        public SearchMessagesFilterUnreadReaction() {
        }

        public int getConstructor() {
            return -1379651328;
        }
    }

    public static class SearchMessagesFilterUnreadMention extends TdApi.SearchMessagesFilter {
        public static final int CONSTRUCTOR = -95769149;

        public SearchMessagesFilterUnreadMention() {
        }

        public int getConstructor() {
            return -95769149;
        }
    }

    public static class SearchMessagesFilterMention extends TdApi.SearchMessagesFilter {
        public static final int CONSTRUCTOR = 2001258652;

        public SearchMessagesFilterMention() {
        }

        public int getConstructor() {
            return 2001258652;
        }
    }

    public static class SearchMessagesFilterVoiceAndVideoNote extends TdApi.SearchMessagesFilter {
        public static final int CONSTRUCTOR = 664174819;

        public SearchMessagesFilterVoiceAndVideoNote() {
        }

        public int getConstructor() {
            return 664174819;
        }
    }

    public static class SearchMessagesFilterVideoNote extends TdApi.SearchMessagesFilter {
        public static final int CONSTRUCTOR = 564323321;

        public SearchMessagesFilterVideoNote() {
        }

        public int getConstructor() {
            return 564323321;
        }
    }

    public static class SearchMessagesFilterChatPhoto extends TdApi.SearchMessagesFilter {
        public static final int CONSTRUCTOR = -1247751329;

        public SearchMessagesFilterChatPhoto() {
        }

        public int getConstructor() {
            return -1247751329;
        }
    }

    public static class SearchMessagesFilterUrl extends TdApi.SearchMessagesFilter {
        public static final int CONSTRUCTOR = -1828724341;

        public SearchMessagesFilterUrl() {
        }

        public int getConstructor() {
            return -1828724341;
        }
    }

    public static class SearchMessagesFilterPhotoAndVideo extends TdApi.SearchMessagesFilter {
        public static final int CONSTRUCTOR = 1352130963;

        public SearchMessagesFilterPhotoAndVideo() {
        }

        public int getConstructor() {
            return 1352130963;
        }
    }

    public static class SearchMessagesFilterVoiceNote extends TdApi.SearchMessagesFilter {
        public static final int CONSTRUCTOR = 1841439357;

        public SearchMessagesFilterVoiceNote() {
        }

        public int getConstructor() {
            return 1841439357;
        }
    }

    public static class SearchMessagesFilterVideo extends TdApi.SearchMessagesFilter {
        public static final int CONSTRUCTOR = 115538222;

        public SearchMessagesFilterVideo() {
        }

        public int getConstructor() {
            return 115538222;
        }
    }

    public static class SearchMessagesFilterPhoto extends TdApi.SearchMessagesFilter {
        public static final int CONSTRUCTOR = 925932293;

        public SearchMessagesFilterPhoto() {
        }

        public int getConstructor() {
            return 925932293;
        }
    }

    public static class SearchMessagesFilterDocument extends TdApi.SearchMessagesFilter {
        public static final int CONSTRUCTOR = 1526331215;

        public SearchMessagesFilterDocument() {
        }

        public int getConstructor() {
            return 1526331215;
        }
    }

    public static class SearchMessagesFilterAudio extends TdApi.SearchMessagesFilter {
        public static final int CONSTRUCTOR = 867505275;

        public SearchMessagesFilterAudio() {
        }

        public int getConstructor() {
            return 867505275;
        }
    }

    public static class SearchMessagesFilterAnimation extends TdApi.SearchMessagesFilter {
        public static final int CONSTRUCTOR = -155713339;

        public SearchMessagesFilterAnimation() {
        }

        public int getConstructor() {
            return -155713339;
        }
    }

    public static class SearchMessagesFilterEmpty extends TdApi.SearchMessagesFilter {
        public static final int CONSTRUCTOR = -869395657;

        public SearchMessagesFilterEmpty() {
        }

        public int getConstructor() {
            return -869395657;
        }
    }

    public abstract static class SearchMessagesFilter extends TdApi.Object {
        public SearchMessagesFilter() {
        }
    }

    public static class ScopeNotificationSettings extends TdApi.Object {
        public int muteFor;
        public long soundId;
        public boolean showPreview;
        public boolean useDefaultMuteStories;
        public boolean muteStories;
        public long storySoundId;
        public boolean showStorySender;
        public boolean disablePinnedMessageNotifications;
        public boolean disableMentionNotifications;
        public static final int CONSTRUCTOR = -599105185;

        public ScopeNotificationSettings() {
        }

        public ScopeNotificationSettings(int var1, long var2, boolean var4, boolean var5, boolean var6, long var7, boolean var9, boolean var10, boolean var11) {
            this.muteFor = var1;
            this.soundId = var2;
            this.showPreview = var4;
            this.useDefaultMuteStories = var5;
            this.muteStories = var6;
            this.storySoundId = var7;
            this.showStorySender = var9;
            this.disablePinnedMessageNotifications = var10;
            this.disableMentionNotifications = var11;
        }

        public int getConstructor() {
            return -599105185;
        }
    }

    public static class ScopeAutosaveSettings extends TdApi.Object {
        public boolean autosavePhotos;
        public boolean autosaveVideos;
        public long maxVideoFileSize;
        public static final int CONSTRUCTOR = 1546821427;

        public ScopeAutosaveSettings() {
        }

        public ScopeAutosaveSettings(boolean var1, boolean var2, long var3) {
            this.autosavePhotos = var1;
            this.autosaveVideos = var2;
            this.maxVideoFileSize = var3;
        }

        public int getConstructor() {
            return 1546821427;
        }
    }

    public static class SavedCredentials extends TdApi.Object {
        public String id;
        public String title;
        public static final int CONSTRUCTOR = -370273060;

        public SavedCredentials() {
        }

        public SavedCredentials(String var1, String var2) {
            this.id = var1;
            this.title = var2;
        }

        public int getConstructor() {
            return -370273060;
        }
    }

    public static class RtmpUrl extends TdApi.Object {
        public String url;
        public String streamKey;
        public static final int CONSTRUCTOR = 1009302613;

        public RtmpUrl() {
        }

        public RtmpUrl(String var1, String var2) {
            this.url = var1;
            this.streamKey = var2;
        }

        public int getConstructor() {
            return 1009302613;
        }
    }

    public static class RichTexts extends TdApi.RichText {
        public TdApi.RichText[] texts;
        public static final int CONSTRUCTOR = 1647457821;

        public RichTexts() {
        }

        public RichTexts(TdApi.RichText[] var1) {
            this.texts = var1;
        }

        public int getConstructor() {
            return 1647457821;
        }
    }

    public static class RichTextAnchorLink extends TdApi.RichText {
        public TdApi.RichText text;
        public String anchorName;
        public String url;
        public static final int CONSTRUCTOR = -1541418282;

        public RichTextAnchorLink() {
        }

        public RichTextAnchorLink(TdApi.RichText var1, String var2, String var3) {
            this.text = var1;
            this.anchorName = var2;
            this.url = var3;
        }

        public int getConstructor() {
            return -1541418282;
        }
    }

    public static class RichTextAnchor extends TdApi.RichText {
        public String name;
        public static final int CONSTRUCTOR = 1316950068;

        public RichTextAnchor() {
        }

        public RichTextAnchor(String var1) {
            this.name = var1;
        }

        public int getConstructor() {
            return 1316950068;
        }
    }

    public static class RichTextReference extends TdApi.RichText {
        public TdApi.RichText text;
        public String anchorName;
        public String url;
        public static final int CONSTRUCTOR = -1147530634;

        public RichTextReference() {
        }

        public RichTextReference(TdApi.RichText var1, String var2, String var3) {
            this.text = var1;
            this.anchorName = var2;
            this.url = var3;
        }

        public int getConstructor() {
            return -1147530634;
        }
    }

    public static class RichTextIcon extends TdApi.RichText {
        public TdApi.Document document;
        public int width;
        public int height;
        public static final int CONSTRUCTOR = -1480316158;

        public RichTextIcon() {
        }

        public RichTextIcon(TdApi.Document var1, int var2, int var3) {
            this.document = var1;
            this.width = var2;
            this.height = var3;
        }

        public int getConstructor() {
            return -1480316158;
        }
    }

    public static class RichTextPhoneNumber extends TdApi.RichText {
        public TdApi.RichText text;
        public String phoneNumber;
        public static final int CONSTRUCTOR = 128521539;

        public RichTextPhoneNumber() {
        }

        public RichTextPhoneNumber(TdApi.RichText var1, String var2) {
            this.text = var1;
            this.phoneNumber = var2;
        }

        public int getConstructor() {
            return 128521539;
        }
    }

    public static class RichTextMarked extends TdApi.RichText {
        public TdApi.RichText text;
        public static final int CONSTRUCTOR = -1271999614;

        public RichTextMarked() {
        }

        public RichTextMarked(TdApi.RichText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return -1271999614;
        }
    }

    public static class RichTextSuperscript extends TdApi.RichText {
        public TdApi.RichText text;
        public static final int CONSTRUCTOR = -382241437;

        public RichTextSuperscript() {
        }

        public RichTextSuperscript(TdApi.RichText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return -382241437;
        }
    }

    public static class RichTextSubscript extends TdApi.RichText {
        public TdApi.RichText text;
        public static final int CONSTRUCTOR = -868197812;

        public RichTextSubscript() {
        }

        public RichTextSubscript(TdApi.RichText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return -868197812;
        }
    }

    public static class RichTextEmailAddress extends TdApi.RichText {
        public TdApi.RichText text;
        public String emailAddress;
        public static final int CONSTRUCTOR = 40018679;

        public RichTextEmailAddress() {
        }

        public RichTextEmailAddress(TdApi.RichText var1, String var2) {
            this.text = var1;
            this.emailAddress = var2;
        }

        public int getConstructor() {
            return 40018679;
        }
    }

    public static class RichTextUrl extends TdApi.RichText {
        public TdApi.RichText text;
        public String url;
        public boolean isCached;
        public static final int CONSTRUCTOR = 83939092;

        public RichTextUrl() {
        }

        public RichTextUrl(TdApi.RichText var1, String var2, boolean var3) {
            this.text = var1;
            this.url = var2;
            this.isCached = var3;
        }

        public int getConstructor() {
            return 83939092;
        }
    }

    public static class RichTextFixed extends TdApi.RichText {
        public TdApi.RichText text;
        public static final int CONSTRUCTOR = -1271496249;

        public RichTextFixed() {
        }

        public RichTextFixed(TdApi.RichText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return -1271496249;
        }
    }

    public static class RichTextStrikethrough extends TdApi.RichText {
        public TdApi.RichText text;
        public static final int CONSTRUCTOR = 723413585;

        public RichTextStrikethrough() {
        }

        public RichTextStrikethrough(TdApi.RichText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return 723413585;
        }
    }

    public static class RichTextUnderline extends TdApi.RichText {
        public TdApi.RichText text;
        public static final int CONSTRUCTOR = -536019572;

        public RichTextUnderline() {
        }

        public RichTextUnderline(TdApi.RichText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return -536019572;
        }
    }

    public static class RichTextItalic extends TdApi.RichText {
        public TdApi.RichText text;
        public static final int CONSTRUCTOR = 1853354047;

        public RichTextItalic() {
        }

        public RichTextItalic(TdApi.RichText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return 1853354047;
        }
    }

    public static class RichTextBold extends TdApi.RichText {
        public TdApi.RichText text;
        public static final int CONSTRUCTOR = 1670844268;

        public RichTextBold() {
        }

        public RichTextBold(TdApi.RichText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return 1670844268;
        }
    }

    public static class RichTextPlain extends TdApi.RichText {
        public String text;
        public static final int CONSTRUCTOR = 482617702;

        public RichTextPlain() {
        }

        public RichTextPlain(String var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return 482617702;
        }
    }

    public abstract static class RichText extends TdApi.Object {
        public RichText() {
        }
    }

    public static class ResetPasswordResultDeclined extends TdApi.ResetPasswordResult {
        public int retryDate;
        public static final int CONSTRUCTOR = -1202200373;

        public ResetPasswordResultDeclined() {
        }

        public ResetPasswordResultDeclined(int var1) {
            this.retryDate = var1;
        }

        public int getConstructor() {
            return -1202200373;
        }
    }

    public static class ResetPasswordResultPending extends TdApi.ResetPasswordResult {
        public int pendingResetDate;
        public static final int CONSTRUCTOR = 1193925721;

        public ResetPasswordResultPending() {
        }

        public ResetPasswordResultPending(int var1) {
            this.pendingResetDate = var1;
        }

        public int getConstructor() {
            return 1193925721;
        }
    }

    public static class ResetPasswordResultOk extends TdApi.ResetPasswordResult {
        public static final int CONSTRUCTOR = -1397267463;

        public ResetPasswordResultOk() {
        }

        public int getConstructor() {
            return -1397267463;
        }
    }

    public abstract static class ResetPasswordResult extends TdApi.Object {
        public ResetPasswordResult() {
        }
    }

    public static class ReportReasonCustom extends TdApi.ReportReason {
        public static final int CONSTRUCTOR = -1380459917;

        public ReportReasonCustom() {
        }

        public int getConstructor() {
            return -1380459917;
        }
    }

    public static class ReportReasonPersonalDetails extends TdApi.ReportReason {
        public static final int CONSTRUCTOR = -1588882414;

        public ReportReasonPersonalDetails() {
        }

        public int getConstructor() {
            return -1588882414;
        }
    }

    public static class ReportReasonIllegalDrugs extends TdApi.ReportReason {
        public static final int CONSTRUCTOR = -61599200;

        public ReportReasonIllegalDrugs() {
        }

        public int getConstructor() {
            return -61599200;
        }
    }

    public static class ReportReasonFake extends TdApi.ReportReason {
        public static final int CONSTRUCTOR = 352862176;

        public ReportReasonFake() {
        }

        public int getConstructor() {
            return 352862176;
        }
    }

    public static class ReportReasonUnrelatedLocation extends TdApi.ReportReason {
        public static final int CONSTRUCTOR = 87562288;

        public ReportReasonUnrelatedLocation() {
        }

        public int getConstructor() {
            return 87562288;
        }
    }

    public static class ReportReasonCopyright extends TdApi.ReportReason {
        public static final int CONSTRUCTOR = 1474441135;

        public ReportReasonCopyright() {
        }

        public int getConstructor() {
            return 1474441135;
        }
    }

    public static class ReportReasonChildAbuse extends TdApi.ReportReason {
        public static final int CONSTRUCTOR = 761086718;

        public ReportReasonChildAbuse() {
        }

        public int getConstructor() {
            return 761086718;
        }
    }

    public static class ReportReasonPornography extends TdApi.ReportReason {
        public static final int CONSTRUCTOR = 1306467575;

        public ReportReasonPornography() {
        }

        public int getConstructor() {
            return 1306467575;
        }
    }

    public static class ReportReasonViolence extends TdApi.ReportReason {
        public static final int CONSTRUCTOR = 2038679353;

        public ReportReasonViolence() {
        }

        public int getConstructor() {
            return 2038679353;
        }
    }

    public static class ReportReasonSpam extends TdApi.ReportReason {
        public static final int CONSTRUCTOR = -1207032897;

        public ReportReasonSpam() {
        }

        public int getConstructor() {
            return -1207032897;
        }
    }

    public abstract static class ReportReason extends TdApi.Object {
        public ReportReason() {
        }
    }

    public static class ReplyMarkupInlineKeyboard extends TdApi.ReplyMarkup {
        public TdApi.InlineKeyboardButton[][] rows;
        public static final int CONSTRUCTOR = -619317658;

        public ReplyMarkupInlineKeyboard() {
        }

        public ReplyMarkupInlineKeyboard(TdApi.InlineKeyboardButton[][] var1) {
            this.rows = var1;
        }

        public int getConstructor() {
            return -619317658;
        }
    }

    public static class ReplyMarkupShowKeyboard extends TdApi.ReplyMarkup {
        public TdApi.KeyboardButton[][] rows;
        public boolean isPersistent;
        public boolean resizeKeyboard;
        public boolean oneTime;
        public boolean isPersonal;
        public String inputFieldPlaceholder;
        public static final int CONSTRUCTOR = -791495984;

        public ReplyMarkupShowKeyboard() {
        }

        public ReplyMarkupShowKeyboard(TdApi.KeyboardButton[][] var1, boolean var2, boolean var3, boolean var4, boolean var5, String var6) {
            this.rows = var1;
            this.isPersistent = var2;
            this.resizeKeyboard = var3;
            this.oneTime = var4;
            this.isPersonal = var5;
            this.inputFieldPlaceholder = var6;
        }

        public int getConstructor() {
            return -791495984;
        }
    }

    public static class ReplyMarkupForceReply extends TdApi.ReplyMarkup {
        public boolean isPersonal;
        public String inputFieldPlaceholder;
        public static final int CONSTRUCTOR = 1101461919;

        public ReplyMarkupForceReply() {
        }

        public ReplyMarkupForceReply(boolean var1, String var2) {
            this.isPersonal = var1;
            this.inputFieldPlaceholder = var2;
        }

        public int getConstructor() {
            return 1101461919;
        }
    }

    public static class ReplyMarkupRemoveKeyboard extends TdApi.ReplyMarkup {
        public boolean isPersonal;
        public static final int CONSTRUCTOR = -691252879;

        public ReplyMarkupRemoveKeyboard() {
        }

        public ReplyMarkupRemoveKeyboard(boolean var1) {
            this.isPersonal = var1;
        }

        public int getConstructor() {
            return -691252879;
        }
    }

    public abstract static class ReplyMarkup extends TdApi.Object {
        public ReplyMarkup() {
        }
    }

    public static class RemoteFile extends TdApi.Object {
        public String id;
        public String uniqueId;
        public boolean isUploadingActive;
        public boolean isUploadingCompleted;
        public long uploadedSize;
        public static final int CONSTRUCTOR = 747731030;

        public RemoteFile() {
        }

        public RemoteFile(String var1, String var2, boolean var3, boolean var4, long var5) {
            this.id = var1;
            this.uniqueId = var2;
            this.isUploadingActive = var3;
            this.isUploadingCompleted = var4;
            this.uploadedSize = var5;
        }

        public int getConstructor() {
            return 747731030;
        }
    }

    public static class RecoveryEmailAddress extends TdApi.Object {
        public String recoveryEmailAddress;
        public static final int CONSTRUCTOR = 1290526187;

        public RecoveryEmailAddress() {
        }

        public RecoveryEmailAddress(String var1) {
            this.recoveryEmailAddress = var1;
        }

        public int getConstructor() {
            return 1290526187;
        }
    }

    public static class RecommendedChatFolders extends TdApi.Object {
        public TdApi.RecommendedChatFolder[] chatFolders;
        public static final int CONSTRUCTOR = -739217656;

        public RecommendedChatFolders() {
        }

        public RecommendedChatFolders(TdApi.RecommendedChatFolder[] var1) {
            this.chatFolders = var1;
        }

        public int getConstructor() {
            return -739217656;
        }
    }

    public static class RecommendedChatFolder extends TdApi.Object {
        public TdApi.ChatFolder folder;
        public String description;
        public static final int CONSTRUCTOR = -2116569930;

        public RecommendedChatFolder() {
        }

        public RecommendedChatFolder(TdApi.ChatFolder var1, String var2) {
            this.folder = var1;
            this.description = var2;
        }

        public int getConstructor() {
            return -2116569930;
        }
    }

    public static class ReactionTypeCustomEmoji extends TdApi.ReactionType {
        public long customEmojiId;
        public static final int CONSTRUCTOR = -989117709;

        public ReactionTypeCustomEmoji() {
        }

        public ReactionTypeCustomEmoji(long var1) {
            this.customEmojiId = var1;
        }

        public int getConstructor() {
            return -989117709;
        }
    }

    public static class ReactionTypeEmoji extends TdApi.ReactionType {
        public String emoji;
        public static final int CONSTRUCTOR = -1942084920;

        public ReactionTypeEmoji() {
        }

        public ReactionTypeEmoji(String var1) {
            this.emoji = var1;
        }

        public int getConstructor() {
            return -1942084920;
        }
    }

    public abstract static class ReactionType extends TdApi.Object {
        public ReactionType() {
        }
    }

    public static class PushReceiverId extends TdApi.Object {
        public long id;
        public static final int CONSTRUCTOR = 371056428;

        public PushReceiverId() {
        }

        public PushReceiverId(long var1) {
            this.id = var1;
        }

        public int getConstructor() {
            return 371056428;
        }
    }

    public static class PushMessageContentMediaAlbum extends TdApi.PushMessageContent {
        public int totalCount;
        public boolean hasPhotos;
        public boolean hasVideos;
        public boolean hasAudios;
        public boolean hasDocuments;
        public static final int CONSTRUCTOR = -748426897;

        public PushMessageContentMediaAlbum() {
        }

        public PushMessageContentMediaAlbum(int var1, boolean var2, boolean var3, boolean var4, boolean var5) {
            this.totalCount = var1;
            this.hasPhotos = var2;
            this.hasVideos = var3;
            this.hasAudios = var4;
            this.hasDocuments = var5;
        }

        public int getConstructor() {
            return -748426897;
        }
    }

    public static class PushMessageContentMessageForwards extends TdApi.PushMessageContent {
        public int totalCount;
        public static final int CONSTRUCTOR = -1913083876;

        public PushMessageContentMessageForwards() {
        }

        public PushMessageContentMessageForwards(int var1) {
            this.totalCount = var1;
        }

        public int getConstructor() {
            return -1913083876;
        }
    }

    public static class PushMessageContentSuggestProfilePhoto extends TdApi.PushMessageContent {
        public static final int CONSTRUCTOR = 2104225963;

        public PushMessageContentSuggestProfilePhoto() {
        }

        public int getConstructor() {
            return 2104225963;
        }
    }

    public static class PushMessageContentRecurringPayment extends TdApi.PushMessageContent {
        public String amount;
        public static final int CONSTRUCTOR = 1619211802;

        public PushMessageContentRecurringPayment() {
        }

        public PushMessageContentRecurringPayment(String var1) {
            this.amount = var1;
        }

        public int getConstructor() {
            return 1619211802;
        }
    }

    public static class PushMessageContentChatJoinByRequest extends TdApi.PushMessageContent {
        public static final int CONSTRUCTOR = -205823627;

        public PushMessageContentChatJoinByRequest() {
        }

        public int getConstructor() {
            return -205823627;
        }
    }

    public static class PushMessageContentChatJoinByLink extends TdApi.PushMessageContent {
        public static final int CONSTRUCTOR = 1553719113;

        public PushMessageContentChatJoinByLink() {
        }

        public int getConstructor() {
            return 1553719113;
        }
    }

    public static class PushMessageContentChatDeleteMember extends TdApi.PushMessageContent {
        public String memberName;
        public boolean isCurrentUser;
        public boolean isLeft;
        public static final int CONSTRUCTOR = 598714783;

        public PushMessageContentChatDeleteMember() {
        }

        public PushMessageContentChatDeleteMember(String var1, boolean var2, boolean var3) {
            this.memberName = var1;
            this.isCurrentUser = var2;
            this.isLeft = var3;
        }

        public int getConstructor() {
            return 598714783;
        }
    }

    public static class PushMessageContentChatSetTheme extends TdApi.PushMessageContent {
        public String themeName;
        public static final int CONSTRUCTOR = 173882216;

        public PushMessageContentChatSetTheme() {
        }

        public PushMessageContentChatSetTheme(String var1) {
            this.themeName = var1;
        }

        public int getConstructor() {
            return 173882216;
        }
    }

    public static class PushMessageContentChatSetBackground extends TdApi.PushMessageContent {
        public boolean isSame;
        public static final int CONSTRUCTOR = -1490331933;

        public PushMessageContentChatSetBackground() {
        }

        public PushMessageContentChatSetBackground(boolean var1) {
            this.isSame = var1;
        }

        public int getConstructor() {
            return -1490331933;
        }
    }

    public static class PushMessageContentChatChangeTitle extends TdApi.PushMessageContent {
        public String title;
        public static final int CONSTRUCTOR = -1964902749;

        public PushMessageContentChatChangeTitle() {
        }

        public PushMessageContentChatChangeTitle(String var1) {
            this.title = var1;
        }

        public int getConstructor() {
            return -1964902749;
        }
    }

    public static class PushMessageContentChatChangePhoto extends TdApi.PushMessageContent {
        public static final int CONSTRUCTOR = -1114222051;

        public PushMessageContentChatChangePhoto() {
        }

        public int getConstructor() {
            return -1114222051;
        }
    }

    public static class PushMessageContentChatAddMembers extends TdApi.PushMessageContent {
        public String memberName;
        public boolean isCurrentUser;
        public boolean isReturned;
        public static final int CONSTRUCTOR = -1087145158;

        public PushMessageContentChatAddMembers() {
        }

        public PushMessageContentChatAddMembers(String var1, boolean var2, boolean var3) {
            this.memberName = var1;
            this.isCurrentUser = var2;
            this.isReturned = var3;
        }

        public int getConstructor() {
            return -1087145158;
        }
    }

    public static class PushMessageContentBasicGroupChatCreate extends TdApi.PushMessageContent {
        public static final int CONSTRUCTOR = -2114855172;

        public PushMessageContentBasicGroupChatCreate() {
        }

        public int getConstructor() {
            return -2114855172;
        }
    }

    public static class PushMessageContentVoiceNote extends TdApi.PushMessageContent {
        public TdApi.VoiceNote voiceNote;
        public boolean isPinned;
        public static final int CONSTRUCTOR = 88910987;

        public PushMessageContentVoiceNote() {
        }

        public PushMessageContentVoiceNote(TdApi.VoiceNote var1, boolean var2) {
            this.voiceNote = var1;
            this.isPinned = var2;
        }

        public int getConstructor() {
            return 88910987;
        }
    }

    public static class PushMessageContentVideoNote extends TdApi.PushMessageContent {
        public TdApi.VideoNote videoNote;
        public boolean isPinned;
        public static final int CONSTRUCTOR = -1122764417;

        public PushMessageContentVideoNote() {
        }

        public PushMessageContentVideoNote(TdApi.VideoNote var1, boolean var2) {
            this.videoNote = var1;
            this.isPinned = var2;
        }

        public int getConstructor() {
            return -1122764417;
        }
    }

    public static class PushMessageContentVideo extends TdApi.PushMessageContent {
        public TdApi.Video video;
        public String caption;
        public boolean isSecret;
        public boolean isPinned;
        public static final int CONSTRUCTOR = 310038831;

        public PushMessageContentVideo() {
        }

        public PushMessageContentVideo(TdApi.Video var1, String var2, boolean var3, boolean var4) {
            this.video = var1;
            this.caption = var2;
            this.isSecret = var3;
            this.isPinned = var4;
        }

        public int getConstructor() {
            return 310038831;
        }
    }

    public static class PushMessageContentText extends TdApi.PushMessageContent {
        public String text;
        public boolean isPinned;
        public static final int CONSTRUCTOR = 274587305;

        public PushMessageContentText() {
        }

        public PushMessageContentText(String var1, boolean var2) {
            this.text = var1;
            this.isPinned = var2;
        }

        public int getConstructor() {
            return 274587305;
        }
    }

    public static class PushMessageContentStory extends TdApi.PushMessageContent {
        public boolean isPinned;
        public static final int CONSTRUCTOR = -1721470519;

        public PushMessageContentStory() {
        }

        public PushMessageContentStory(boolean var1) {
            this.isPinned = var1;
        }

        public int getConstructor() {
            return -1721470519;
        }
    }

    public static class PushMessageContentSticker extends TdApi.PushMessageContent {
        public TdApi.Sticker sticker;
        public String emoji;
        public boolean isPinned;
        public static final int CONSTRUCTOR = 1553513939;

        public PushMessageContentSticker() {
        }

        public PushMessageContentSticker(TdApi.Sticker var1, String var2, boolean var3) {
            this.sticker = var1;
            this.emoji = var2;
            this.isPinned = var3;
        }

        public int getConstructor() {
            return 1553513939;
        }
    }

    public static class PushMessageContentScreenshotTaken extends TdApi.PushMessageContent {
        public static final int CONSTRUCTOR = 214245369;

        public PushMessageContentScreenshotTaken() {
        }

        public int getConstructor() {
            return 214245369;
        }
    }

    public static class PushMessageContentPoll extends TdApi.PushMessageContent {
        public String question;
        public boolean isRegular;
        public boolean isPinned;
        public static final int CONSTRUCTOR = -44403654;

        public PushMessageContentPoll() {
        }

        public PushMessageContentPoll(String var1, boolean var2, boolean var3) {
            this.question = var1;
            this.isRegular = var2;
            this.isPinned = var3;
        }

        public int getConstructor() {
            return -44403654;
        }
    }

    public static class PushMessageContentPhoto extends TdApi.PushMessageContent {
        public TdApi.Photo photo;
        public String caption;
        public boolean isSecret;
        public boolean isPinned;
        public static final int CONSTRUCTOR = 140631122;

        public PushMessageContentPhoto() {
        }

        public PushMessageContentPhoto(TdApi.Photo var1, String var2, boolean var3, boolean var4) {
            this.photo = var1;
            this.caption = var2;
            this.isSecret = var3;
            this.isPinned = var4;
        }

        public int getConstructor() {
            return 140631122;
        }
    }

    public static class PushMessageContentLocation extends TdApi.PushMessageContent {
        public boolean isLive;
        public boolean isPinned;
        public static final int CONSTRUCTOR = -1288005709;

        public PushMessageContentLocation() {
        }

        public PushMessageContentLocation(boolean var1, boolean var2) {
            this.isLive = var1;
            this.isPinned = var2;
        }

        public int getConstructor() {
            return -1288005709;
        }
    }

    public static class PushMessageContentInvoice extends TdApi.PushMessageContent {
        public String price;
        public boolean isPinned;
        public static final int CONSTRUCTOR = -1731687492;

        public PushMessageContentInvoice() {
        }

        public PushMessageContentInvoice(String var1, boolean var2) {
            this.price = var1;
            this.isPinned = var2;
        }

        public int getConstructor() {
            return -1731687492;
        }
    }

    public static class PushMessageContentGameScore extends TdApi.PushMessageContent {
        public String title;
        public int score;
        public boolean isPinned;
        public static final int CONSTRUCTOR = 901303688;

        public PushMessageContentGameScore() {
        }

        public PushMessageContentGameScore(String var1, int var2, boolean var3) {
            this.title = var1;
            this.score = var2;
            this.isPinned = var3;
        }

        public int getConstructor() {
            return 901303688;
        }
    }

    public static class PushMessageContentGame extends TdApi.PushMessageContent {
        public String title;
        public boolean isPinned;
        public static final int CONSTRUCTOR = -515131109;

        public PushMessageContentGame() {
        }

        public PushMessageContentGame(String var1, boolean var2) {
            this.title = var1;
            this.isPinned = var2;
        }

        public int getConstructor() {
            return -515131109;
        }
    }

    public static class PushMessageContentDocument extends TdApi.PushMessageContent {
        public TdApi.Document document;
        public boolean isPinned;
        public static final int CONSTRUCTOR = -458379775;

        public PushMessageContentDocument() {
        }

        public PushMessageContentDocument(TdApi.Document var1, boolean var2) {
            this.document = var1;
            this.isPinned = var2;
        }

        public int getConstructor() {
            return -458379775;
        }
    }

    public static class PushMessageContentContactRegistered extends TdApi.PushMessageContent {
        public static final int CONSTRUCTOR = -303962720;

        public PushMessageContentContactRegistered() {
        }

        public int getConstructor() {
            return -303962720;
        }
    }

    public static class PushMessageContentContact extends TdApi.PushMessageContent {
        public String name;
        public boolean isPinned;
        public static final int CONSTRUCTOR = -12219820;

        public PushMessageContentContact() {
        }

        public PushMessageContentContact(String var1, boolean var2) {
            this.name = var1;
            this.isPinned = var2;
        }

        public int getConstructor() {
            return -12219820;
        }
    }

    public static class PushMessageContentAudio extends TdApi.PushMessageContent {
        public TdApi.Audio audio;
        public boolean isPinned;
        public static final int CONSTRUCTOR = 381581426;

        public PushMessageContentAudio() {
        }

        public PushMessageContentAudio(TdApi.Audio var1, boolean var2) {
            this.audio = var1;
            this.isPinned = var2;
        }

        public int getConstructor() {
            return 381581426;
        }
    }

    public static class PushMessageContentAnimation extends TdApi.PushMessageContent {
        public TdApi.Animation animation;
        public String caption;
        public boolean isPinned;
        public static final int CONSTRUCTOR = 1034215396;

        public PushMessageContentAnimation() {
        }

        public PushMessageContentAnimation(TdApi.Animation var1, String var2, boolean var3) {
            this.animation = var1;
            this.caption = var2;
            this.isPinned = var3;
        }

        public int getConstructor() {
            return 1034215396;
        }
    }

    public static class PushMessageContentHidden extends TdApi.PushMessageContent {
        public boolean isPinned;
        public static final int CONSTRUCTOR = -316950436;

        public PushMessageContentHidden() {
        }

        public PushMessageContentHidden(boolean var1) {
            this.isPinned = var1;
        }

        public int getConstructor() {
            return -316950436;
        }
    }

    public abstract static class PushMessageContent extends TdApi.Object {
        public PushMessageContent() {
        }
    }

    public static class PublicChatTypeIsLocationBased extends TdApi.PublicChatType {
        public static final int CONSTRUCTOR = 1183735952;

        public PublicChatTypeIsLocationBased() {
        }

        public int getConstructor() {
            return 1183735952;
        }
    }

    public static class PublicChatTypeHasUsername extends TdApi.PublicChatType {
        public static final int CONSTRUCTOR = 350789758;

        public PublicChatTypeHasUsername() {
        }

        public int getConstructor() {
            return 350789758;
        }
    }

    public abstract static class PublicChatType extends TdApi.Object {
        public PublicChatType() {
        }
    }

    public static class ProxyTypeMtproto extends TdApi.ProxyType {
        public String secret;
        public static final int CONSTRUCTOR = -1964826627;

        public ProxyTypeMtproto() {
        }

        public ProxyTypeMtproto(String var1) {
            this.secret = var1;
        }

        public int getConstructor() {
            return -1964826627;
        }
    }

    public static class ProxyTypeHttp extends TdApi.ProxyType {
        public String username;
        public String password;
        public boolean httpOnly;
        public static final int CONSTRUCTOR = -1547188361;

        public ProxyTypeHttp() {
        }

        public ProxyTypeHttp(String var1, String var2, boolean var3) {
            this.username = var1;
            this.password = var2;
            this.httpOnly = var3;
        }

        public int getConstructor() {
            return -1547188361;
        }
    }

    public static class ProxyTypeSocks5 extends TdApi.ProxyType {
        public String username;
        public String password;
        public static final int CONSTRUCTOR = -890027341;

        public ProxyTypeSocks5() {
        }

        public ProxyTypeSocks5(String var1, String var2) {
            this.username = var1;
            this.password = var2;
        }

        public int getConstructor() {
            return -890027341;
        }
    }

    public abstract static class ProxyType extends TdApi.Object {
        public ProxyType() {
        }
    }

    public static class Proxy extends TdApi.Object {
        public int id;
        public String server;
        public int port;
        public int lastUsedDate;
        public boolean isEnabled;
        public TdApi.ProxyType type;
        public static final int CONSTRUCTOR = 196049779;

        public Proxy() {
        }

        public Proxy(int var1, String var2, int var3, int var4, boolean var5, TdApi.ProxyType var6) {
            this.id = var1;
            this.server = var2;
            this.port = var3;
            this.lastUsedDate = var4;
            this.isEnabled = var5;
            this.type = var6;
        }

        public int getConstructor() {
            return 196049779;
        }
    }

    public static class Proxies extends TdApi.Object {
        public TdApi.Proxy[] proxies;
        public static final int CONSTRUCTOR = 1200447205;

        public Proxies() {
        }

        public Proxies(TdApi.Proxy[] var1) {
            this.proxies = var1;
        }

        public int getConstructor() {
            return 1200447205;
        }
    }

    public static class ProfilePhoto extends TdApi.Object {
        public long id;
        public TdApi.File small;
        public TdApi.File big;
        public TdApi.Minithumbnail minithumbnail;
        public boolean hasAnimation;
        public boolean isPersonal;
        public static final int CONSTRUCTOR = -1025754018;

        public ProfilePhoto() {
        }

        public ProfilePhoto(long var1, TdApi.File var3, TdApi.File var4, TdApi.Minithumbnail var5, boolean var6, boolean var7) {
            this.id = var1;
            this.small = var3;
            this.big = var4;
            this.minithumbnail = var5;
            this.hasAnimation = var6;
            this.isPersonal = var7;
        }

        public int getConstructor() {
            return -1025754018;
        }
    }

    public static class PremiumStoryFeatureLinksAndFormatting extends TdApi.PremiumStoryFeature {
        public static final int CONSTRUCTOR = -622623753;

        public PremiumStoryFeatureLinksAndFormatting() {
        }

        public int getConstructor() {
            return -622623753;
        }
    }

    public static class PremiumStoryFeatureSaveStories extends TdApi.PremiumStoryFeature {
        public static final int CONSTRUCTOR = -1501286467;

        public PremiumStoryFeatureSaveStories() {
        }

        public int getConstructor() {
            return -1501286467;
        }
    }

    public static class PremiumStoryFeatureCustomExpirationDuration extends TdApi.PremiumStoryFeature {
        public static final int CONSTRUCTOR = -593229162;

        public PremiumStoryFeatureCustomExpirationDuration() {
        }

        public int getConstructor() {
            return -593229162;
        }
    }

    public static class PremiumStoryFeaturePermanentViewsHistory extends TdApi.PremiumStoryFeature {
        public static final int CONSTRUCTOR = -1029683296;

        public PremiumStoryFeaturePermanentViewsHistory() {
        }

        public int getConstructor() {
            return -1029683296;
        }
    }

    public static class PremiumStoryFeatureStealthMode extends TdApi.PremiumStoryFeature {
        public static final int CONSTRUCTOR = 1194605988;

        public PremiumStoryFeatureStealthMode() {
        }

        public int getConstructor() {
            return 1194605988;
        }
    }

    public static class PremiumStoryFeaturePriorityOrder extends TdApi.PremiumStoryFeature {
        public static final int CONSTRUCTOR = -1880001849;

        public PremiumStoryFeaturePriorityOrder() {
        }

        public int getConstructor() {
            return -1880001849;
        }
    }

    public abstract static class PremiumStoryFeature extends TdApi.Object {
        public PremiumStoryFeature() {
        }
    }

    public static class PremiumStatePaymentOption extends TdApi.Object {
        public TdApi.PremiumPaymentOption paymentOption;
        public boolean isCurrent;
        public boolean isUpgrade;
        public String lastTransactionId;
        public static final int CONSTRUCTOR = 2097591673;

        public PremiumStatePaymentOption() {
        }

        public PremiumStatePaymentOption(TdApi.PremiumPaymentOption var1, boolean var2, boolean var3, String var4) {
            this.paymentOption = var1;
            this.isCurrent = var2;
            this.isUpgrade = var3;
            this.lastTransactionId = var4;
        }

        public int getConstructor() {
            return 2097591673;
        }
    }

    public static class PremiumState extends TdApi.Object {
        public TdApi.FormattedText state;
        public TdApi.PremiumStatePaymentOption[] paymentOptions;
        public TdApi.PremiumFeaturePromotionAnimation[] animations;
        public static final int CONSTRUCTOR = 1203513213;

        public PremiumState() {
        }

        public PremiumState(TdApi.FormattedText var1, TdApi.PremiumStatePaymentOption[] var2, TdApi.PremiumFeaturePromotionAnimation[] var3) {
            this.state = var1;
            this.paymentOptions = var2;
            this.animations = var3;
        }

        public int getConstructor() {
            return 1203513213;
        }
    }

    public static class PremiumSourceSettings extends TdApi.PremiumSource {
        public static final int CONSTRUCTOR = -285702859;

        public PremiumSourceSettings() {
        }

        public int getConstructor() {
            return -285702859;
        }
    }

    public static class PremiumSourceLink extends TdApi.PremiumSource {
        public String referrer;
        public static final int CONSTRUCTOR = 2135071132;

        public PremiumSourceLink() {
        }

        public PremiumSourceLink(String var1) {
            this.referrer = var1;
        }

        public int getConstructor() {
            return 2135071132;
        }
    }

    public static class PremiumSourceStoryFeature extends TdApi.PremiumSource {
        public TdApi.PremiumStoryFeature feature;
        public static final int CONSTRUCTOR = -1030737556;

        public PremiumSourceStoryFeature() {
        }

        public PremiumSourceStoryFeature(TdApi.PremiumStoryFeature var1) {
            this.feature = var1;
        }

        public int getConstructor() {
            return -1030737556;
        }
    }

    public static class PremiumSourceFeature extends TdApi.PremiumSource {
        public TdApi.PremiumFeature feature;
        public static final int CONSTRUCTOR = 445813541;

        public PremiumSourceFeature() {
        }

        public PremiumSourceFeature(TdApi.PremiumFeature var1) {
            this.feature = var1;
        }

        public int getConstructor() {
            return 445813541;
        }
    }

    public static class PremiumSourceLimitExceeded extends TdApi.PremiumSource {
        public TdApi.PremiumLimitType limitType;
        public static final int CONSTRUCTOR = -2052159742;

        public PremiumSourceLimitExceeded() {
        }

        public PremiumSourceLimitExceeded(TdApi.PremiumLimitType var1) {
            this.limitType = var1;
        }

        public int getConstructor() {
            return -2052159742;
        }
    }

    public abstract static class PremiumSource extends TdApi.Object {
        public PremiumSource() {
        }
    }

    public static class PremiumPaymentOption extends TdApi.Object {
        public String currency;
        public long amount;
        public int discountPercentage;
        public int monthCount;
        public String storeProductId;
        public TdApi.InternalLinkType paymentLink;
        public static final int CONSTRUCTOR = -1945346126;

        public PremiumPaymentOption() {
        }

        public PremiumPaymentOption(String var1, long var2, int var4, int var5, String var6, TdApi.InternalLinkType var7) {
            this.currency = var1;
            this.amount = var2;
            this.discountPercentage = var4;
            this.monthCount = var5;
            this.storeProductId = var6;
            this.paymentLink = var7;
        }

        public int getConstructor() {
            return -1945346126;
        }
    }

    public static class PremiumLimitTypeStoryCaptionLength extends TdApi.PremiumLimitType {
        public static final int CONSTRUCTOR = -1093324030;

        public PremiumLimitTypeStoryCaptionLength() {
        }

        public int getConstructor() {
            return -1093324030;
        }
    }

    public static class PremiumLimitTypeMonthlySentStoryCount extends TdApi.PremiumLimitType {
        public static final int CONSTRUCTOR = 819481475;

        public PremiumLimitTypeMonthlySentStoryCount() {
        }

        public int getConstructor() {
            return 819481475;
        }
    }

    public static class PremiumLimitTypeWeeklySentStoryCount extends TdApi.PremiumLimitType {
        public static final int CONSTRUCTOR = 40485707;

        public PremiumLimitTypeWeeklySentStoryCount() {
        }

        public int getConstructor() {
            return 40485707;
        }
    }

    public static class PremiumLimitTypeActiveStoryCount extends TdApi.PremiumLimitType {
        public static final int CONSTRUCTOR = -1926486372;

        public PremiumLimitTypeActiveStoryCount() {
        }

        public int getConstructor() {
            return -1926486372;
        }
    }

    public static class PremiumLimitTypeShareableChatFolderCount extends TdApi.PremiumLimitType {
        public static final int CONSTRUCTOR = 1612625095;

        public PremiumLimitTypeShareableChatFolderCount() {
        }

        public int getConstructor() {
            return 1612625095;
        }
    }

    public static class PremiumLimitTypeChatFolderInviteLinkCount extends TdApi.PremiumLimitType {
        public static final int CONSTRUCTOR = -128702950;

        public PremiumLimitTypeChatFolderInviteLinkCount() {
        }

        public int getConstructor() {
            return -128702950;
        }
    }

    public static class PremiumLimitTypeBioLength extends TdApi.PremiumLimitType {
        public static final int CONSTRUCTOR = -1146976765;

        public PremiumLimitTypeBioLength() {
        }

        public int getConstructor() {
            return -1146976765;
        }
    }

    public static class PremiumLimitTypeCaptionLength extends TdApi.PremiumLimitType {
        public static final int CONSTRUCTOR = 293984314;

        public PremiumLimitTypeCaptionLength() {
        }

        public int getConstructor() {
            return 293984314;
        }
    }

    public static class PremiumLimitTypePinnedArchivedChatCount extends TdApi.PremiumLimitType {
        public static final int CONSTRUCTOR = 1485515276;

        public PremiumLimitTypePinnedArchivedChatCount() {
        }

        public int getConstructor() {
            return 1485515276;
        }
    }

    public static class PremiumLimitTypeChatFolderChosenChatCount extends TdApi.PremiumLimitType {
        public static final int CONSTRUCTOR = 1691435861;

        public PremiumLimitTypeChatFolderChosenChatCount() {
        }

        public int getConstructor() {
            return 1691435861;
        }
    }

    public static class PremiumLimitTypeChatFolderCount extends TdApi.PremiumLimitType {
        public static final int CONSTRUCTOR = 377489774;

        public PremiumLimitTypeChatFolderCount() {
        }

        public int getConstructor() {
            return 377489774;
        }
    }

    public static class PremiumLimitTypeFavoriteStickerCount extends TdApi.PremiumLimitType {
        public static final int CONSTRUCTOR = 639754787;

        public PremiumLimitTypeFavoriteStickerCount() {
        }

        public int getConstructor() {
            return 639754787;
        }
    }

    public static class PremiumLimitTypeSavedAnimationCount extends TdApi.PremiumLimitType {
        public static final int CONSTRUCTOR = -19759735;

        public PremiumLimitTypeSavedAnimationCount() {
        }

        public int getConstructor() {
            return -19759735;
        }
    }

    public static class PremiumLimitTypeCreatedPublicChatCount extends TdApi.PremiumLimitType {
        public static final int CONSTRUCTOR = 446086841;

        public PremiumLimitTypeCreatedPublicChatCount() {
        }

        public int getConstructor() {
            return 446086841;
        }
    }

    public static class PremiumLimitTypePinnedChatCount extends TdApi.PremiumLimitType {
        public static final int CONSTRUCTOR = -998947871;

        public PremiumLimitTypePinnedChatCount() {
        }

        public int getConstructor() {
            return -998947871;
        }
    }

    public static class PremiumLimitTypeSupergroupCount extends TdApi.PremiumLimitType {
        public static final int CONSTRUCTOR = -247467131;

        public PremiumLimitTypeSupergroupCount() {
        }

        public int getConstructor() {
            return -247467131;
        }
    }

    public abstract static class PremiumLimitType extends TdApi.Object {
        public PremiumLimitType() {
        }
    }

    public static class PremiumLimit extends TdApi.Object {
        public TdApi.PremiumLimitType type;
        public int defaultValue;
        public int premiumValue;
        public static final int CONSTRUCTOR = 2127786726;

        public PremiumLimit() {
        }

        public PremiumLimit(TdApi.PremiumLimitType var1, int var2, int var3) {
            this.type = var1;
            this.defaultValue = var2;
            this.premiumValue = var3;
        }

        public int getConstructor() {
            return 2127786726;
        }
    }

    public static class PremiumFeatures extends TdApi.Object {
        public TdApi.PremiumFeature[] features;
        public TdApi.PremiumLimit[] limits;
        public TdApi.InternalLinkType paymentLink;
        public static final int CONSTRUCTOR = 1875162172;

        public PremiumFeatures() {
        }

        public PremiumFeatures(TdApi.PremiumFeature[] var1, TdApi.PremiumLimit[] var2, TdApi.InternalLinkType var3) {
            this.features = var1;
            this.limits = var2;
            this.paymentLink = var3;
        }

        public int getConstructor() {
            return 1875162172;
        }
    }

    public static class PremiumFeaturePromotionAnimation extends TdApi.Object {
        public TdApi.PremiumFeature feature;
        public TdApi.Animation animation;
        public static final int CONSTRUCTOR = -1986155748;

        public PremiumFeaturePromotionAnimation() {
        }

        public PremiumFeaturePromotionAnimation(TdApi.PremiumFeature var1, TdApi.Animation var2) {
            this.feature = var1;
            this.animation = var2;
        }

        public int getConstructor() {
            return -1986155748;
        }
    }

    public static class PremiumFeatureUpgradedStories extends TdApi.PremiumFeature {
        public static final int CONSTRUCTOR = -1878522597;

        public PremiumFeatureUpgradedStories() {
        }

        public int getConstructor() {
            return -1878522597;
        }
    }

    public static class PremiumFeatureRealTimeChatTranslation extends TdApi.PremiumFeature {
        public static final int CONSTRUCTOR = -1143471488;

        public PremiumFeatureRealTimeChatTranslation() {
        }

        public int getConstructor() {
            return -1143471488;
        }
    }

    public static class PremiumFeatureAppIcons extends TdApi.PremiumFeature {
        public static final int CONSTRUCTOR = 1585050761;

        public PremiumFeatureAppIcons() {
        }

        public int getConstructor() {
            return 1585050761;
        }
    }

    public static class PremiumFeatureForumTopicIcon extends TdApi.PremiumFeature {
        public static final int CONSTRUCTOR = -823172286;

        public PremiumFeatureForumTopicIcon() {
        }

        public int getConstructor() {
            return -823172286;
        }
    }

    public static class PremiumFeatureAnimatedProfilePhoto extends TdApi.PremiumFeature {
        public static final int CONSTRUCTOR = -100741914;

        public PremiumFeatureAnimatedProfilePhoto() {
        }

        public int getConstructor() {
            return -100741914;
        }
    }

    public static class PremiumFeatureEmojiStatus extends TdApi.PremiumFeature {
        public static final int CONSTRUCTOR = -36516639;

        public PremiumFeatureEmojiStatus() {
        }

        public int getConstructor() {
            return -36516639;
        }
    }

    public static class PremiumFeatureProfileBadge extends TdApi.PremiumFeature {
        public static final int CONSTRUCTOR = 233648322;

        public PremiumFeatureProfileBadge() {
        }

        public int getConstructor() {
            return 233648322;
        }
    }

    public static class PremiumFeatureAdvancedChatManagement extends TdApi.PremiumFeature {
        public static final int CONSTRUCTOR = 796347674;

        public PremiumFeatureAdvancedChatManagement() {
        }

        public int getConstructor() {
            return 796347674;
        }
    }

    public static class PremiumFeatureCustomEmoji extends TdApi.PremiumFeature {
        public static final int CONSTRUCTOR = 1332599628;

        public PremiumFeatureCustomEmoji() {
        }

        public int getConstructor() {
            return 1332599628;
        }
    }

    public static class PremiumFeatureUniqueStickers extends TdApi.PremiumFeature {
        public static final int CONSTRUCTOR = -2101773312;

        public PremiumFeatureUniqueStickers() {
        }

        public int getConstructor() {
            return -2101773312;
        }
    }

    public static class PremiumFeatureUniqueReactions extends TdApi.PremiumFeature {
        public static final int CONSTRUCTOR = 766750743;

        public PremiumFeatureUniqueReactions() {
        }

        public int getConstructor() {
            return 766750743;
        }
    }

    public static class PremiumFeatureDisabledAds extends TdApi.PremiumFeature {
        public static final int CONSTRUCTOR = -2008587702;

        public PremiumFeatureDisabledAds() {
        }

        public int getConstructor() {
            return -2008587702;
        }
    }

    public static class PremiumFeatureVoiceRecognition extends TdApi.PremiumFeature {
        public static final int CONSTRUCTOR = 1288216542;

        public PremiumFeatureVoiceRecognition() {
        }

        public int getConstructor() {
            return 1288216542;
        }
    }

    public static class PremiumFeatureImprovedDownloadSpeed extends TdApi.PremiumFeature {
        public static final int CONSTRUCTOR = -267695554;

        public PremiumFeatureImprovedDownloadSpeed() {
        }

        public int getConstructor() {
            return -267695554;
        }
    }

    public static class PremiumFeatureIncreasedUploadFileSize extends TdApi.PremiumFeature {
        public static final int CONSTRUCTOR = 1825367155;

        public PremiumFeatureIncreasedUploadFileSize() {
        }

        public int getConstructor() {
            return 1825367155;
        }
    }

    public static class PremiumFeatureIncreasedLimits extends TdApi.PremiumFeature {
        public static final int CONSTRUCTOR = 1785455031;

        public PremiumFeatureIncreasedLimits() {
        }

        public int getConstructor() {
            return 1785455031;
        }
    }

    public abstract static class PremiumFeature extends TdApi.Object {
        public PremiumFeature() {
        }
    }

    public static class PollTypeQuiz extends TdApi.PollType {
        public int correctOptionId;
        public TdApi.FormattedText explanation;
        public static final int CONSTRUCTOR = 657013913;

        public PollTypeQuiz() {
        }

        public PollTypeQuiz(int var1, TdApi.FormattedText var2) {
            this.correctOptionId = var1;
            this.explanation = var2;
        }

        public int getConstructor() {
            return 657013913;
        }
    }

    public static class PollTypeRegular extends TdApi.PollType {
        public boolean allowMultipleAnswers;
        public static final int CONSTRUCTOR = 641265698;

        public PollTypeRegular() {
        }

        public PollTypeRegular(boolean var1) {
            this.allowMultipleAnswers = var1;
        }

        public int getConstructor() {
            return 641265698;
        }
    }

    public abstract static class PollType extends TdApi.Object {
        public PollType() {
        }
    }

    public static class PollOption extends TdApi.Object {
        public String text;
        public int voterCount;
        public int votePercentage;
        public boolean isChosen;
        public boolean isBeingChosen;
        public static final int CONSTRUCTOR = 1473893797;

        public PollOption() {
        }

        public PollOption(String var1, int var2, int var3, boolean var4, boolean var5) {
            this.text = var1;
            this.voterCount = var2;
            this.votePercentage = var3;
            this.isChosen = var4;
            this.isBeingChosen = var5;
        }

        public int getConstructor() {
            return 1473893797;
        }
    }

    public static class Poll extends TdApi.Object {
        public long id;
        public String question;
        public TdApi.PollOption[] options;
        public int totalVoterCount;
        public TdApi.MessageSender[] recentVoterIds;
        public boolean isAnonymous;
        public TdApi.PollType type;
        public int openPeriod;
        public int closeDate;
        public boolean isClosed;
        public static final int CONSTRUCTOR = -1397847072;

        public Poll() {
        }

        public Poll(long var1, String var3, TdApi.PollOption[] var4, int var5, TdApi.MessageSender[] var6, boolean var7, TdApi.PollType var8, int var9, int var10, boolean var11) {
            this.id = var1;
            this.question = var3;
            this.options = var4;
            this.totalVoterCount = var5;
            this.recentVoterIds = var6;
            this.isAnonymous = var7;
            this.type = var8;
            this.openPeriod = var9;
            this.closeDate = var10;
            this.isClosed = var11;
        }

        public int getConstructor() {
            return -1397847072;
        }
    }

    public static class Point extends TdApi.Object {
        public double x;
        public double y;
        public static final int CONSTRUCTOR = 437515705;

        public Point() {
        }

        public Point(double var1, double var3) {
            this.x = var1;
            this.y = var3;
        }

        public int getConstructor() {
            return 437515705;
        }
    }

    public static class PhotoSize extends TdApi.Object {
        public String type;
        public TdApi.File photo;
        public int width;
        public int height;
        public int[] progressiveSizes;
        public static final int CONSTRUCTOR = 1609182352;

        public PhotoSize() {
        }

        public PhotoSize(String var1, TdApi.File var2, int var3, int var4, int[] var5) {
            this.type = var1;
            this.photo = var2;
            this.width = var3;
            this.height = var4;
            this.progressiveSizes = var5;
        }

        public int getConstructor() {
            return 1609182352;
        }
    }

    public static class Photo extends TdApi.Object {
        public boolean hasStickers;
        public TdApi.Minithumbnail minithumbnail;
        public TdApi.PhotoSize[] sizes;
        public static final int CONSTRUCTOR = -2022871583;

        public Photo() {
        }

        public Photo(boolean var1, TdApi.Minithumbnail var2, TdApi.PhotoSize[] var3) {
            this.hasStickers = var1;
            this.minithumbnail = var2;
            this.sizes = var3;
        }

        public int getConstructor() {
            return -2022871583;
        }
    }

    public static class PhoneNumberInfo extends TdApi.Object {
        public TdApi.CountryInfo country;
        public String countryCallingCode;
        public String formattedPhoneNumber;
        public boolean isAnonymous;
        public static final int CONSTRUCTOR = -758933343;

        public PhoneNumberInfo() {
        }

        public PhoneNumberInfo(TdApi.CountryInfo var1, String var2, String var3, boolean var4) {
            this.country = var1;
            this.countryCallingCode = var2;
            this.formattedPhoneNumber = var3;
            this.isAnonymous = var4;
        }

        public int getConstructor() {
            return -758933343;
        }
    }

    public static class PhoneNumberAuthenticationSettings extends TdApi.Object {
        public boolean allowFlashCall;
        public boolean allowMissedCall;
        public boolean isCurrentPhoneNumber;
        public boolean allowSmsRetrieverApi;
        public TdApi.FirebaseAuthenticationSettings firebaseAuthenticationSettings;
        public String[] authenticationTokens;
        public static final int CONSTRUCTOR = -493266762;

        public PhoneNumberAuthenticationSettings() {
        }

        public PhoneNumberAuthenticationSettings(boolean var1, boolean var2, boolean var3, boolean var4, TdApi.FirebaseAuthenticationSettings var5, String[] var6) {
            this.allowFlashCall = var1;
            this.allowMissedCall = var2;
            this.isCurrentPhoneNumber = var3;
            this.allowSmsRetrieverApi = var4;
            this.firebaseAuthenticationSettings = var5;
            this.authenticationTokens = var6;
        }

        public int getConstructor() {
            return -493266762;
        }
    }

    public static class PersonalDocument extends TdApi.Object {
        public TdApi.DatedFile[] files;
        public TdApi.DatedFile[] translation;
        public static final int CONSTRUCTOR = -1011634661;

        public PersonalDocument() {
        }

        public PersonalDocument(TdApi.DatedFile[] var1, TdApi.DatedFile[] var2) {
            this.files = var1;
            this.translation = var2;
        }

        public int getConstructor() {
            return -1011634661;
        }
    }

    public static class PersonalDetails extends TdApi.Object {
        public String firstName;
        public String middleName;
        public String lastName;
        public String nativeFirstName;
        public String nativeMiddleName;
        public String nativeLastName;
        public TdApi.Date birthdate;
        public String gender;
        public String countryCode;
        public String residenceCountryCode;
        public static final int CONSTRUCTOR = -1061656137;

        public PersonalDetails() {
        }

        public PersonalDetails(String var1, String var2, String var3, String var4, String var5, String var6, TdApi.Date var7, String var8, String var9, String var10) {
            this.firstName = var1;
            this.middleName = var2;
            this.lastName = var3;
            this.nativeFirstName = var4;
            this.nativeMiddleName = var5;
            this.nativeLastName = var6;
            this.birthdate = var7;
            this.gender = var8;
            this.countryCode = var9;
            this.residenceCountryCode = var10;
        }

        public int getConstructor() {
            return -1061656137;
        }
    }

    public static class PaymentResult extends TdApi.Object {
        public boolean success;
        public String verificationUrl;
        public static final int CONSTRUCTOR = -804263843;

        public PaymentResult() {
        }

        public PaymentResult(boolean var1, String var2) {
            this.success = var1;
            this.verificationUrl = var2;
        }

        public int getConstructor() {
            return -804263843;
        }
    }

    public static class PaymentReceipt extends TdApi.Object {
        public String title;
        public TdApi.FormattedText description;
        public TdApi.Photo photo;
        public int date;
        public long sellerBotUserId;
        public long paymentProviderUserId;
        public TdApi.Invoice invoice;
        public TdApi.OrderInfo orderInfo;
        public TdApi.ShippingOption shippingOption;
        public String credentialsTitle;
        public long tipAmount;
        public static final int CONSTRUCTOR = -400955711;

        public PaymentReceipt() {
        }

        public PaymentReceipt(String var1, TdApi.FormattedText var2, TdApi.Photo var3, int var4, long var5, long var7, TdApi.Invoice var9, TdApi.OrderInfo var10, TdApi.ShippingOption var11, String var12, long var13) {
            this.title = var1;
            this.description = var2;
            this.photo = var3;
            this.date = var4;
            this.sellerBotUserId = var5;
            this.paymentProviderUserId = var7;
            this.invoice = var9;
            this.orderInfo = var10;
            this.shippingOption = var11;
            this.credentialsTitle = var12;
            this.tipAmount = var13;
        }

        public int getConstructor() {
            return -400955711;
        }
    }

    public static class PaymentProviderOther extends TdApi.PaymentProvider {
        public String url;
        public static final int CONSTRUCTOR = -1336876828;

        public PaymentProviderOther() {
        }

        public PaymentProviderOther(String var1) {
            this.url = var1;
        }

        public int getConstructor() {
            return -1336876828;
        }
    }

    public static class PaymentProviderStripe extends TdApi.PaymentProvider {
        public String publishableKey;
        public boolean needCountry;
        public boolean needPostalCode;
        public boolean needCardholderName;
        public static final int CONSTRUCTOR = 370467227;

        public PaymentProviderStripe() {
        }

        public PaymentProviderStripe(String var1, boolean var2, boolean var3, boolean var4) {
            this.publishableKey = var1;
            this.needCountry = var2;
            this.needPostalCode = var3;
            this.needCardholderName = var4;
        }

        public int getConstructor() {
            return 370467227;
        }
    }

    public static class PaymentProviderSmartGlocal extends TdApi.PaymentProvider {
        public String publicToken;
        public static final int CONSTRUCTOR = 1800479470;

        public PaymentProviderSmartGlocal() {
        }

        public PaymentProviderSmartGlocal(String var1) {
            this.publicToken = var1;
        }

        public int getConstructor() {
            return 1800479470;
        }
    }

    public abstract static class PaymentProvider extends TdApi.Object {
        public PaymentProvider() {
        }
    }

    public static class PaymentOption extends TdApi.Object {
        public String title;
        public String url;
        public static final int CONSTRUCTOR = -294020965;

        public PaymentOption() {
        }

        public PaymentOption(String var1, String var2) {
            this.title = var1;
            this.url = var2;
        }

        public int getConstructor() {
            return -294020965;
        }
    }

    public static class PaymentForm extends TdApi.Object {
        public long id;
        public TdApi.Invoice invoice;
        public long sellerBotUserId;
        public long paymentProviderUserId;
        public TdApi.PaymentProvider paymentProvider;
        public TdApi.PaymentOption[] additionalPaymentOptions;
        public TdApi.OrderInfo savedOrderInfo;
        public TdApi.SavedCredentials[] savedCredentials;
        public boolean canSaveCredentials;
        public boolean needPassword;
        public String productTitle;
        public TdApi.FormattedText productDescription;
        public TdApi.Photo productPhoto;
        public static final int CONSTRUCTOR = -1468471378;

        public PaymentForm() {
        }

        public PaymentForm(long var1, TdApi.Invoice var3, long var4, long var6, TdApi.PaymentProvider var8, TdApi.PaymentOption[] var9, TdApi.OrderInfo var10, TdApi.SavedCredentials[] var11, boolean var12, boolean var13, String var14, TdApi.FormattedText var15, TdApi.Photo var16) {
            this.id = var1;
            this.invoice = var3;
            this.sellerBotUserId = var4;
            this.paymentProviderUserId = var6;
            this.paymentProvider = var8;
            this.additionalPaymentOptions = var9;
            this.savedOrderInfo = var10;
            this.savedCredentials = var11;
            this.canSaveCredentials = var12;
            this.needPassword = var13;
            this.productTitle = var14;
            this.productDescription = var15;
            this.productPhoto = var16;
        }

        public int getConstructor() {
            return -1468471378;
        }
    }

    public static class PasswordState extends TdApi.Object {
        public boolean hasPassword;
        public String passwordHint;
        public boolean hasRecoveryEmailAddress;
        public boolean hasPassportData;
        public TdApi.EmailAddressAuthenticationCodeInfo recoveryEmailAddressCodeInfo;
        public String loginEmailAddressPattern;
        public int pendingResetDate;
        public static final int CONSTRUCTOR = 483801128;

        public PasswordState() {
        }

        public PasswordState(boolean var1, String var2, boolean var3, boolean var4, TdApi.EmailAddressAuthenticationCodeInfo var5, String var6, int var7) {
            this.hasPassword = var1;
            this.passwordHint = var2;
            this.hasRecoveryEmailAddress = var3;
            this.hasPassportData = var4;
            this.recoveryEmailAddressCodeInfo = var5;
            this.loginEmailAddressPattern = var6;
            this.pendingResetDate = var7;
        }

        public int getConstructor() {
            return 483801128;
        }
    }

    public static class PassportSuitableElement extends TdApi.Object {
        public TdApi.PassportElementType type;
        public boolean isSelfieRequired;
        public boolean isTranslationRequired;
        public boolean isNativeNameRequired;
        public static final int CONSTRUCTOR = -789019876;

        public PassportSuitableElement() {
        }

        public PassportSuitableElement(TdApi.PassportElementType var1, boolean var2, boolean var3, boolean var4) {
            this.type = var1;
            this.isSelfieRequired = var2;
            this.isTranslationRequired = var3;
            this.isNativeNameRequired = var4;
        }

        public int getConstructor() {
            return -789019876;
        }
    }

    public static class PassportRequiredElement extends TdApi.Object {
        public TdApi.PassportSuitableElement[] suitableElements;
        public static final int CONSTRUCTOR = -1983641651;

        public PassportRequiredElement() {
        }

        public PassportRequiredElement(TdApi.PassportSuitableElement[] var1) {
            this.suitableElements = var1;
        }

        public int getConstructor() {
            return -1983641651;
        }
    }

    public static class PassportElementsWithErrors extends TdApi.Object {
        public TdApi.PassportElement[] elements;
        public TdApi.PassportElementError[] errors;
        public static final int CONSTRUCTOR = 1308923044;

        public PassportElementsWithErrors() {
        }

        public PassportElementsWithErrors(TdApi.PassportElement[] var1, TdApi.PassportElementError[] var2) {
            this.elements = var1;
            this.errors = var2;
        }

        public int getConstructor() {
            return 1308923044;
        }
    }

    public static class PassportElements extends TdApi.Object {
        public TdApi.PassportElement[] elements;
        public static final int CONSTRUCTOR = 1264617556;

        public PassportElements() {
        }

        public PassportElements(TdApi.PassportElement[] var1) {
            this.elements = var1;
        }

        public int getConstructor() {
            return 1264617556;
        }
    }

    public static class PassportElementTypeEmailAddress extends TdApi.PassportElementType {
        public static final int CONSTRUCTOR = -79321405;

        public PassportElementTypeEmailAddress() {
        }

        public int getConstructor() {
            return -79321405;
        }
    }

    public static class PassportElementTypePhoneNumber extends TdApi.PassportElementType {
        public static final int CONSTRUCTOR = -995361172;

        public PassportElementTypePhoneNumber() {
        }

        public int getConstructor() {
            return -995361172;
        }
    }

    public static class PassportElementTypeTemporaryRegistration extends TdApi.PassportElementType {
        public static final int CONSTRUCTOR = 1092498527;

        public PassportElementTypeTemporaryRegistration() {
        }

        public int getConstructor() {
            return 1092498527;
        }
    }

    public static class PassportElementTypePassportRegistration extends TdApi.PassportElementType {
        public static final int CONSTRUCTOR = -159478209;

        public PassportElementTypePassportRegistration() {
        }

        public int getConstructor() {
            return -159478209;
        }
    }

    public static class PassportElementTypeRentalAgreement extends TdApi.PassportElementType {
        public static final int CONSTRUCTOR = -2060583280;

        public PassportElementTypeRentalAgreement() {
        }

        public int getConstructor() {
            return -2060583280;
        }
    }

    public static class PassportElementTypeBankStatement extends TdApi.PassportElementType {
        public static final int CONSTRUCTOR = 574095667;

        public PassportElementTypeBankStatement() {
        }

        public int getConstructor() {
            return 574095667;
        }
    }

    public static class PassportElementTypeUtilityBill extends TdApi.PassportElementType {
        public static final int CONSTRUCTOR = 627084906;

        public PassportElementTypeUtilityBill() {
        }

        public int getConstructor() {
            return 627084906;
        }
    }

    public static class PassportElementTypeAddress extends TdApi.PassportElementType {
        public static final int CONSTRUCTOR = 496327874;

        public PassportElementTypeAddress() {
        }

        public int getConstructor() {
            return 496327874;
        }
    }

    public static class PassportElementTypeInternalPassport extends TdApi.PassportElementType {
        public static final int CONSTRUCTOR = -793781959;

        public PassportElementTypeInternalPassport() {
        }

        public int getConstructor() {
            return -793781959;
        }
    }

    public static class PassportElementTypeIdentityCard extends TdApi.PassportElementType {
        public static final int CONSTRUCTOR = -502356132;

        public PassportElementTypeIdentityCard() {
        }

        public int getConstructor() {
            return -502356132;
        }
    }

    public static class PassportElementTypeDriverLicense extends TdApi.PassportElementType {
        public static final int CONSTRUCTOR = 1827298379;

        public PassportElementTypeDriverLicense() {
        }

        public int getConstructor() {
            return 1827298379;
        }
    }

    public static class PassportElementTypePassport extends TdApi.PassportElementType {
        public static final int CONSTRUCTOR = -436360376;

        public PassportElementTypePassport() {
        }

        public int getConstructor() {
            return -436360376;
        }
    }

    public static class PassportElementTypePersonalDetails extends TdApi.PassportElementType {
        public static final int CONSTRUCTOR = -1032136365;

        public PassportElementTypePersonalDetails() {
        }

        public int getConstructor() {
            return -1032136365;
        }
    }

    public abstract static class PassportElementType extends TdApi.Object {
        public PassportElementType() {
        }
    }

    public static class PassportElementErrorSourceFiles extends TdApi.PassportElementErrorSource {
        public static final int CONSTRUCTOR = 1894164178;

        public PassportElementErrorSourceFiles() {
        }

        public int getConstructor() {
            return 1894164178;
        }
    }

    public static class PassportElementErrorSourceFile extends TdApi.PassportElementErrorSource {
        public int fileIndex;
        public static final int CONSTRUCTOR = 2020358960;

        public PassportElementErrorSourceFile() {
        }

        public PassportElementErrorSourceFile(int var1) {
            this.fileIndex = var1;
        }

        public int getConstructor() {
            return 2020358960;
        }
    }

    public static class PassportElementErrorSourceTranslationFiles extends TdApi.PassportElementErrorSource {
        public static final int CONSTRUCTOR = 581280796;

        public PassportElementErrorSourceTranslationFiles() {
        }

        public int getConstructor() {
            return 581280796;
        }
    }

    public static class PassportElementErrorSourceTranslationFile extends TdApi.PassportElementErrorSource {
        public int fileIndex;
        public static final int CONSTRUCTOR = -689621228;

        public PassportElementErrorSourceTranslationFile() {
        }

        public PassportElementErrorSourceTranslationFile(int var1) {
            this.fileIndex = var1;
        }

        public int getConstructor() {
            return -689621228;
        }
    }

    public static class PassportElementErrorSourceSelfie extends TdApi.PassportElementErrorSource {
        public static final int CONSTRUCTOR = -797043672;

        public PassportElementErrorSourceSelfie() {
        }

        public int getConstructor() {
            return -797043672;
        }
    }

    public static class PassportElementErrorSourceReverseSide extends TdApi.PassportElementErrorSource {
        public static final int CONSTRUCTOR = 1918630391;

        public PassportElementErrorSourceReverseSide() {
        }

        public int getConstructor() {
            return 1918630391;
        }
    }

    public static class PassportElementErrorSourceFrontSide extends TdApi.PassportElementErrorSource {
        public static final int CONSTRUCTOR = 1895658292;

        public PassportElementErrorSourceFrontSide() {
        }

        public int getConstructor() {
            return 1895658292;
        }
    }

    public static class PassportElementErrorSourceDataField extends TdApi.PassportElementErrorSource {
        public String fieldName;
        public static final int CONSTRUCTOR = -308650776;

        public PassportElementErrorSourceDataField() {
        }

        public PassportElementErrorSourceDataField(String var1) {
            this.fieldName = var1;
        }

        public int getConstructor() {
            return -308650776;
        }
    }

    public static class PassportElementErrorSourceUnspecified extends TdApi.PassportElementErrorSource {
        public static final int CONSTRUCTOR = -378320830;

        public PassportElementErrorSourceUnspecified() {
        }

        public int getConstructor() {
            return -378320830;
        }
    }

    public abstract static class PassportElementErrorSource extends TdApi.Object {
        public PassportElementErrorSource() {
        }
    }

    public static class PassportElementError extends TdApi.Object {
        public TdApi.PassportElementType type;
        public String message;
        public TdApi.PassportElementErrorSource source;
        public static final int CONSTRUCTOR = -1861902395;

        public PassportElementError() {
        }

        public PassportElementError(TdApi.PassportElementType var1, String var2, TdApi.PassportElementErrorSource var3) {
            this.type = var1;
            this.message = var2;
            this.source = var3;
        }

        public int getConstructor() {
            return -1861902395;
        }
    }

    public static class PassportElementEmailAddress extends TdApi.PassportElement {
        public String emailAddress;
        public static final int CONSTRUCTOR = -1528129531;

        public PassportElementEmailAddress() {
        }

        public PassportElementEmailAddress(String var1) {
            this.emailAddress = var1;
        }

        public int getConstructor() {
            return -1528129531;
        }
    }

    public static class PassportElementPhoneNumber extends TdApi.PassportElement {
        public String phoneNumber;
        public static final int CONSTRUCTOR = -1320118375;

        public PassportElementPhoneNumber() {
        }

        public PassportElementPhoneNumber(String var1) {
            this.phoneNumber = var1;
        }

        public int getConstructor() {
            return -1320118375;
        }
    }

    public static class PassportElementTemporaryRegistration extends TdApi.PassportElement {
        public TdApi.PersonalDocument temporaryRegistration;
        public static final int CONSTRUCTOR = 1237626864;

        public PassportElementTemporaryRegistration() {
        }

        public PassportElementTemporaryRegistration(TdApi.PersonalDocument var1) {
            this.temporaryRegistration = var1;
        }

        public int getConstructor() {
            return 1237626864;
        }
    }

    public static class PassportElementPassportRegistration extends TdApi.PassportElement {
        public TdApi.PersonalDocument passportRegistration;
        public static final int CONSTRUCTOR = 618323071;

        public PassportElementPassportRegistration() {
        }

        public PassportElementPassportRegistration(TdApi.PersonalDocument var1) {
            this.passportRegistration = var1;
        }

        public int getConstructor() {
            return 618323071;
        }
    }

    public static class PassportElementRentalAgreement extends TdApi.PassportElement {
        public TdApi.PersonalDocument rentalAgreement;
        public static final int CONSTRUCTOR = -290141400;

        public PassportElementRentalAgreement() {
        }

        public PassportElementRentalAgreement(TdApi.PersonalDocument var1) {
            this.rentalAgreement = var1;
        }

        public int getConstructor() {
            return -290141400;
        }
    }

    public static class PassportElementBankStatement extends TdApi.PassportElement {
        public TdApi.PersonalDocument bankStatement;
        public static final int CONSTRUCTOR = -366464408;

        public PassportElementBankStatement() {
        }

        public PassportElementBankStatement(TdApi.PersonalDocument var1) {
            this.bankStatement = var1;
        }

        public int getConstructor() {
            return -366464408;
        }
    }

    public static class PassportElementUtilityBill extends TdApi.PassportElement {
        public TdApi.PersonalDocument utilityBill;
        public static final int CONSTRUCTOR = -234611246;

        public PassportElementUtilityBill() {
        }

        public PassportElementUtilityBill(TdApi.PersonalDocument var1) {
            this.utilityBill = var1;
        }

        public int getConstructor() {
            return -234611246;
        }
    }

    public static class PassportElementAddress extends TdApi.PassportElement {
        public TdApi.Address address;
        public static final int CONSTRUCTOR = -782625232;

        public PassportElementAddress() {
        }

        public PassportElementAddress(TdApi.Address var1) {
            this.address = var1;
        }

        public int getConstructor() {
            return -782625232;
        }
    }

    public static class PassportElementInternalPassport extends TdApi.PassportElement {
        public TdApi.IdentityDocument internalPassport;
        public static final int CONSTRUCTOR = 36220295;

        public PassportElementInternalPassport() {
        }

        public PassportElementInternalPassport(TdApi.IdentityDocument var1) {
            this.internalPassport = var1;
        }

        public int getConstructor() {
            return 36220295;
        }
    }

    public static class PassportElementIdentityCard extends TdApi.PassportElement {
        public TdApi.IdentityDocument identityCard;
        public static final int CONSTRUCTOR = 2083775797;

        public PassportElementIdentityCard() {
        }

        public PassportElementIdentityCard(TdApi.IdentityDocument var1) {
            this.identityCard = var1;
        }

        public int getConstructor() {
            return 2083775797;
        }
    }

    public static class PassportElementDriverLicense extends TdApi.PassportElement {
        public TdApi.IdentityDocument driverLicense;
        public static final int CONSTRUCTOR = 1643580589;

        public PassportElementDriverLicense() {
        }

        public PassportElementDriverLicense(TdApi.IdentityDocument var1) {
            this.driverLicense = var1;
        }

        public int getConstructor() {
            return 1643580589;
        }
    }

    public static class PassportElementPassport extends TdApi.PassportElement {
        public TdApi.IdentityDocument passport;
        public static final int CONSTRUCTOR = -263985373;

        public PassportElementPassport() {
        }

        public PassportElementPassport(TdApi.IdentityDocument var1) {
            this.passport = var1;
        }

        public int getConstructor() {
            return -263985373;
        }
    }

    public static class PassportElementPersonalDetails extends TdApi.PassportElement {
        public TdApi.PersonalDetails personalDetails;
        public static final int CONSTRUCTOR = 1217724035;

        public PassportElementPersonalDetails() {
        }

        public PassportElementPersonalDetails(TdApi.PersonalDetails var1) {
            this.personalDetails = var1;
        }

        public int getConstructor() {
            return 1217724035;
        }
    }

    public abstract static class PassportElement extends TdApi.Object {
        public PassportElement() {
        }
    }

    public static class PassportAuthorizationForm extends TdApi.Object {
        public int id;
        public TdApi.PassportRequiredElement[] requiredElements;
        public String privacyPolicyUrl;
        public static final int CONSTRUCTOR = -1070673218;

        public PassportAuthorizationForm() {
        }

        public PassportAuthorizationForm(int var1, TdApi.PassportRequiredElement[] var2, String var3) {
            this.id = var1;
            this.requiredElements = var2;
            this.privacyPolicyUrl = var3;
        }

        public int getConstructor() {
            return -1070673218;
        }
    }

    public static class PageBlockVerticalAlignmentBottom extends TdApi.PageBlockVerticalAlignment {
        public static final int CONSTRUCTOR = 2092531158;

        public PageBlockVerticalAlignmentBottom() {
        }

        public int getConstructor() {
            return 2092531158;
        }
    }

    public static class PageBlockVerticalAlignmentMiddle extends TdApi.PageBlockVerticalAlignment {
        public static final int CONSTRUCTOR = -2123096587;

        public PageBlockVerticalAlignmentMiddle() {
        }

        public int getConstructor() {
            return -2123096587;
        }
    }

    public static class PageBlockVerticalAlignmentTop extends TdApi.PageBlockVerticalAlignment {
        public static final int CONSTRUCTOR = 195500454;

        public PageBlockVerticalAlignmentTop() {
        }

        public int getConstructor() {
            return 195500454;
        }
    }

    public abstract static class PageBlockVerticalAlignment extends TdApi.Object {
        public PageBlockVerticalAlignment() {
        }
    }

    public static class PageBlockTableCell extends TdApi.Object {
        public TdApi.RichText text;
        public boolean isHeader;
        public int colspan;
        public int rowspan;
        public TdApi.PageBlockHorizontalAlignment align;
        public TdApi.PageBlockVerticalAlignment valign;
        public static final int CONSTRUCTOR = 1417658214;

        public PageBlockTableCell() {
        }

        public PageBlockTableCell(TdApi.RichText var1, boolean var2, int var3, int var4, TdApi.PageBlockHorizontalAlignment var5, TdApi.PageBlockVerticalAlignment var6) {
            this.text = var1;
            this.isHeader = var2;
            this.colspan = var3;
            this.rowspan = var4;
            this.align = var5;
            this.valign = var6;
        }

        public int getConstructor() {
            return 1417658214;
        }
    }

    public static class PageBlockRelatedArticle extends TdApi.Object {
        public String url;
        public String title;
        public String description;
        public TdApi.Photo photo;
        public String author;
        public int publishDate;
        public static final int CONSTRUCTOR = 481199251;

        public PageBlockRelatedArticle() {
        }

        public PageBlockRelatedArticle(String var1, String var2, String var3, TdApi.Photo var4, String var5, int var6) {
            this.url = var1;
            this.title = var2;
            this.description = var3;
            this.photo = var4;
            this.author = var5;
            this.publishDate = var6;
        }

        public int getConstructor() {
            return 481199251;
        }
    }

    public static class PageBlockListItem extends TdApi.Object {
        public String label;
        public TdApi.PageBlock[] pageBlocks;
        public static final int CONSTRUCTOR = 323186259;

        public PageBlockListItem() {
        }

        public PageBlockListItem(String var1, TdApi.PageBlock[] var2) {
            this.label = var1;
            this.pageBlocks = var2;
        }

        public int getConstructor() {
            return 323186259;
        }
    }

    public static class PageBlockHorizontalAlignmentRight extends TdApi.PageBlockHorizontalAlignment {
        public static final int CONSTRUCTOR = 1371369214;

        public PageBlockHorizontalAlignmentRight() {
        }

        public int getConstructor() {
            return 1371369214;
        }
    }

    public static class PageBlockHorizontalAlignmentCenter extends TdApi.PageBlockHorizontalAlignment {
        public static final int CONSTRUCTOR = -1009203990;

        public PageBlockHorizontalAlignmentCenter() {
        }

        public int getConstructor() {
            return -1009203990;
        }
    }

    public static class PageBlockHorizontalAlignmentLeft extends TdApi.PageBlockHorizontalAlignment {
        public static final int CONSTRUCTOR = 848701417;

        public PageBlockHorizontalAlignmentLeft() {
        }

        public int getConstructor() {
            return 848701417;
        }
    }

    public abstract static class PageBlockHorizontalAlignment extends TdApi.Object {
        public PageBlockHorizontalAlignment() {
        }
    }

    public static class PageBlockCaption extends TdApi.Object {
        public TdApi.RichText text;
        public TdApi.RichText credit;
        public static final int CONSTRUCTOR = -1180064650;

        public PageBlockCaption() {
        }

        public PageBlockCaption(TdApi.RichText var1, TdApi.RichText var2) {
            this.text = var1;
            this.credit = var2;
        }

        public int getConstructor() {
            return -1180064650;
        }
    }

    public static class PageBlockMap extends TdApi.PageBlock {
        public TdApi.Location location;
        public int zoom;
        public int width;
        public int height;
        public TdApi.PageBlockCaption caption;
        public static final int CONSTRUCTOR = 1510961171;

        public PageBlockMap() {
        }

        public PageBlockMap(TdApi.Location var1, int var2, int var3, int var4, TdApi.PageBlockCaption var5) {
            this.location = var1;
            this.zoom = var2;
            this.width = var3;
            this.height = var4;
            this.caption = var5;
        }

        public int getConstructor() {
            return 1510961171;
        }
    }

    public static class PageBlockRelatedArticles extends TdApi.PageBlock {
        public TdApi.RichText header;
        public TdApi.PageBlockRelatedArticle[] articles;
        public static final int CONSTRUCTOR = -1807324374;

        public PageBlockRelatedArticles() {
        }

        public PageBlockRelatedArticles(TdApi.RichText var1, TdApi.PageBlockRelatedArticle[] var2) {
            this.header = var1;
            this.articles = var2;
        }

        public int getConstructor() {
            return -1807324374;
        }
    }

    public static class PageBlockDetails extends TdApi.PageBlock {
        public TdApi.RichText header;
        public TdApi.PageBlock[] pageBlocks;
        public boolean isOpen;
        public static final int CONSTRUCTOR = -1599869809;

        public PageBlockDetails() {
        }

        public PageBlockDetails(TdApi.RichText var1, TdApi.PageBlock[] var2, boolean var3) {
            this.header = var1;
            this.pageBlocks = var2;
            this.isOpen = var3;
        }

        public int getConstructor() {
            return -1599869809;
        }
    }

    public static class PageBlockTable extends TdApi.PageBlock {
        public TdApi.RichText caption;
        public TdApi.PageBlockTableCell[][] cells;
        public boolean isBordered;
        public boolean isStriped;
        public static final int CONSTRUCTOR = -942649288;

        public PageBlockTable() {
        }

        public PageBlockTable(TdApi.RichText var1, TdApi.PageBlockTableCell[][] var2, boolean var3, boolean var4) {
            this.caption = var1;
            this.cells = var2;
            this.isBordered = var3;
            this.isStriped = var4;
        }

        public int getConstructor() {
            return -942649288;
        }
    }

    public static class PageBlockChatLink extends TdApi.PageBlock {
        public String title;
        public TdApi.ChatPhotoInfo photo;
        public String username;
        public static final int CONSTRUCTOR = -202091253;

        public PageBlockChatLink() {
        }

        public PageBlockChatLink(String var1, TdApi.ChatPhotoInfo var2, String var3) {
            this.title = var1;
            this.photo = var2;
            this.username = var3;
        }

        public int getConstructor() {
            return -202091253;
        }
    }

    public static class PageBlockSlideshow extends TdApi.PageBlock {
        public TdApi.PageBlock[] pageBlocks;
        public TdApi.PageBlockCaption caption;
        public static final int CONSTRUCTOR = 539217375;

        public PageBlockSlideshow() {
        }

        public PageBlockSlideshow(TdApi.PageBlock[] var1, TdApi.PageBlockCaption var2) {
            this.pageBlocks = var1;
            this.caption = var2;
        }

        public int getConstructor() {
            return 539217375;
        }
    }

    public static class PageBlockCollage extends TdApi.PageBlock {
        public TdApi.PageBlock[] pageBlocks;
        public TdApi.PageBlockCaption caption;
        public static final int CONSTRUCTOR = 1163760110;

        public PageBlockCollage() {
        }

        public PageBlockCollage(TdApi.PageBlock[] var1, TdApi.PageBlockCaption var2) {
            this.pageBlocks = var1;
            this.caption = var2;
        }

        public int getConstructor() {
            return 1163760110;
        }
    }

    public static class PageBlockEmbeddedPost extends TdApi.PageBlock {
        public String url;
        public String author;
        public TdApi.Photo authorPhoto;
        public int date;
        public TdApi.PageBlock[] pageBlocks;
        public TdApi.PageBlockCaption caption;
        public static final int CONSTRUCTOR = 397600949;

        public PageBlockEmbeddedPost() {
        }

        public PageBlockEmbeddedPost(String var1, String var2, TdApi.Photo var3, int var4, TdApi.PageBlock[] var5, TdApi.PageBlockCaption var6) {
            this.url = var1;
            this.author = var2;
            this.authorPhoto = var3;
            this.date = var4;
            this.pageBlocks = var5;
            this.caption = var6;
        }

        public int getConstructor() {
            return 397600949;
        }
    }

    public static class PageBlockEmbedded extends TdApi.PageBlock {
        public String url;
        public String html;
        public TdApi.Photo posterPhoto;
        public int width;
        public int height;
        public TdApi.PageBlockCaption caption;
        public boolean isFullWidth;
        public boolean allowScrolling;
        public static final int CONSTRUCTOR = -1942577763;

        public PageBlockEmbedded() {
        }

        public PageBlockEmbedded(String var1, String var2, TdApi.Photo var3, int var4, int var5, TdApi.PageBlockCaption var6, boolean var7, boolean var8) {
            this.url = var1;
            this.html = var2;
            this.posterPhoto = var3;
            this.width = var4;
            this.height = var5;
            this.caption = var6;
            this.isFullWidth = var7;
            this.allowScrolling = var8;
        }

        public int getConstructor() {
            return -1942577763;
        }
    }

    public static class PageBlockCover extends TdApi.PageBlock {
        public TdApi.PageBlock cover;
        public static final int CONSTRUCTOR = 972174080;

        public PageBlockCover() {
        }

        public PageBlockCover(TdApi.PageBlock var1) {
            this.cover = var1;
        }

        public int getConstructor() {
            return 972174080;
        }
    }

    public static class PageBlockVoiceNote extends TdApi.PageBlock {
        public TdApi.VoiceNote voiceNote;
        public TdApi.PageBlockCaption caption;
        public static final int CONSTRUCTOR = 1823310463;

        public PageBlockVoiceNote() {
        }

        public PageBlockVoiceNote(TdApi.VoiceNote var1, TdApi.PageBlockCaption var2) {
            this.voiceNote = var1;
            this.caption = var2;
        }

        public int getConstructor() {
            return 1823310463;
        }
    }

    public static class PageBlockVideo extends TdApi.PageBlock {
        public TdApi.Video video;
        public TdApi.PageBlockCaption caption;
        public boolean needAutoplay;
        public boolean isLooped;
        public static final int CONSTRUCTOR = 510041394;

        public PageBlockVideo() {
        }

        public PageBlockVideo(TdApi.Video var1, TdApi.PageBlockCaption var2, boolean var3, boolean var4) {
            this.video = var1;
            this.caption = var2;
            this.needAutoplay = var3;
            this.isLooped = var4;
        }

        public int getConstructor() {
            return 510041394;
        }
    }

    public static class PageBlockPhoto extends TdApi.PageBlock {
        public TdApi.Photo photo;
        public TdApi.PageBlockCaption caption;
        public String url;
        public static final int CONSTRUCTOR = 417601156;

        public PageBlockPhoto() {
        }

        public PageBlockPhoto(TdApi.Photo var1, TdApi.PageBlockCaption var2, String var3) {
            this.photo = var1;
            this.caption = var2;
            this.url = var3;
        }

        public int getConstructor() {
            return 417601156;
        }
    }

    public static class PageBlockAudio extends TdApi.PageBlock {
        public TdApi.Audio audio;
        public TdApi.PageBlockCaption caption;
        public static final int CONSTRUCTOR = -63371245;

        public PageBlockAudio() {
        }

        public PageBlockAudio(TdApi.Audio var1, TdApi.PageBlockCaption var2) {
            this.audio = var1;
            this.caption = var2;
        }

        public int getConstructor() {
            return -63371245;
        }
    }

    public static class PageBlockAnimation extends TdApi.PageBlock {
        public TdApi.Animation animation;
        public TdApi.PageBlockCaption caption;
        public boolean needAutoplay;
        public static final int CONSTRUCTOR = 1355669513;

        public PageBlockAnimation() {
        }

        public PageBlockAnimation(TdApi.Animation var1, TdApi.PageBlockCaption var2, boolean var3) {
            this.animation = var1;
            this.caption = var2;
            this.needAutoplay = var3;
        }

        public int getConstructor() {
            return 1355669513;
        }
    }

    public static class PageBlockPullQuote extends TdApi.PageBlock {
        public TdApi.RichText text;
        public TdApi.RichText credit;
        public static final int CONSTRUCTOR = 490242317;

        public PageBlockPullQuote() {
        }

        public PageBlockPullQuote(TdApi.RichText var1, TdApi.RichText var2) {
            this.text = var1;
            this.credit = var2;
        }

        public int getConstructor() {
            return 490242317;
        }
    }

    public static class PageBlockBlockQuote extends TdApi.PageBlock {
        public TdApi.RichText text;
        public TdApi.RichText credit;
        public static final int CONSTRUCTOR = 1657834142;

        public PageBlockBlockQuote() {
        }

        public PageBlockBlockQuote(TdApi.RichText var1, TdApi.RichText var2) {
            this.text = var1;
            this.credit = var2;
        }

        public int getConstructor() {
            return 1657834142;
        }
    }

    public static class PageBlockList extends TdApi.PageBlock {
        public TdApi.PageBlockListItem[] items;
        public static final int CONSTRUCTOR = -1037074852;

        public PageBlockList() {
        }

        public PageBlockList(TdApi.PageBlockListItem[] var1) {
            this.items = var1;
        }

        public int getConstructor() {
            return -1037074852;
        }
    }

    public static class PageBlockAnchor extends TdApi.PageBlock {
        public String name;
        public static final int CONSTRUCTOR = -837994576;

        public PageBlockAnchor() {
        }

        public PageBlockAnchor(String var1) {
            this.name = var1;
        }

        public int getConstructor() {
            return -837994576;
        }
    }

    public static class PageBlockDivider extends TdApi.PageBlock {
        public static final int CONSTRUCTOR = -618614392;

        public PageBlockDivider() {
        }

        public int getConstructor() {
            return -618614392;
        }
    }

    public static class PageBlockFooter extends TdApi.PageBlock {
        public TdApi.RichText footer;
        public static final int CONSTRUCTOR = 886429480;

        public PageBlockFooter() {
        }

        public PageBlockFooter(TdApi.RichText var1) {
            this.footer = var1;
        }

        public int getConstructor() {
            return 886429480;
        }
    }

    public static class PageBlockPreformatted extends TdApi.PageBlock {
        public TdApi.RichText text;
        public String language;
        public static final int CONSTRUCTOR = -1066346178;

        public PageBlockPreformatted() {
        }

        public PageBlockPreformatted(TdApi.RichText var1, String var2) {
            this.text = var1;
            this.language = var2;
        }

        public int getConstructor() {
            return -1066346178;
        }
    }

    public static class PageBlockParagraph extends TdApi.PageBlock {
        public TdApi.RichText text;
        public static final int CONSTRUCTOR = 1182402406;

        public PageBlockParagraph() {
        }

        public PageBlockParagraph(TdApi.RichText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return 1182402406;
        }
    }

    public static class PageBlockKicker extends TdApi.PageBlock {
        public TdApi.RichText kicker;
        public static final int CONSTRUCTOR = 1361282635;

        public PageBlockKicker() {
        }

        public PageBlockKicker(TdApi.RichText var1) {
            this.kicker = var1;
        }

        public int getConstructor() {
            return 1361282635;
        }
    }

    public static class PageBlockSubheader extends TdApi.PageBlock {
        public TdApi.RichText subheader;
        public static final int CONSTRUCTOR = 1263956774;

        public PageBlockSubheader() {
        }

        public PageBlockSubheader(TdApi.RichText var1) {
            this.subheader = var1;
        }

        public int getConstructor() {
            return 1263956774;
        }
    }

    public static class PageBlockHeader extends TdApi.PageBlock {
        public TdApi.RichText header;
        public static final int CONSTRUCTOR = 1402854811;

        public PageBlockHeader() {
        }

        public PageBlockHeader(TdApi.RichText var1) {
            this.header = var1;
        }

        public int getConstructor() {
            return 1402854811;
        }
    }

    public static class PageBlockAuthorDate extends TdApi.PageBlock {
        public TdApi.RichText author;
        public int publishDate;
        public static final int CONSTRUCTOR = 1300231184;

        public PageBlockAuthorDate() {
        }

        public PageBlockAuthorDate(TdApi.RichText var1, int var2) {
            this.author = var1;
            this.publishDate = var2;
        }

        public int getConstructor() {
            return 1300231184;
        }
    }

    public static class PageBlockSubtitle extends TdApi.PageBlock {
        public TdApi.RichText subtitle;
        public static final int CONSTRUCTOR = 264524263;

        public PageBlockSubtitle() {
        }

        public PageBlockSubtitle(TdApi.RichText var1) {
            this.subtitle = var1;
        }

        public int getConstructor() {
            return 264524263;
        }
    }

    public static class PageBlockTitle extends TdApi.PageBlock {
        public TdApi.RichText title;
        public static final int CONSTRUCTOR = 1629664784;

        public PageBlockTitle() {
        }

        public PageBlockTitle(TdApi.RichText var1) {
            this.title = var1;
        }

        public int getConstructor() {
            return 1629664784;
        }
    }

    public abstract static class PageBlock extends TdApi.Object {
        public PageBlock() {
        }
    }

    public static class OrderInfo extends TdApi.Object {
        public String name;
        public String phoneNumber;
        public String emailAddress;
        public TdApi.Address shippingAddress;
        public static final int CONSTRUCTOR = 783997294;

        public OrderInfo() {
        }

        public OrderInfo(String var1, String var2, String var3, TdApi.Address var4) {
            this.name = var1;
            this.phoneNumber = var2;
            this.emailAddress = var3;
            this.shippingAddress = var4;
        }

        public int getConstructor() {
            return 783997294;
        }
    }

    public static class OptionValueString extends TdApi.OptionValue {
        public String value;
        public static final int CONSTRUCTOR = 756248212;

        public OptionValueString() {
        }

        public OptionValueString(String var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return 756248212;
        }
    }

    public static class OptionValueInteger extends TdApi.OptionValue {
        public long value;
        public static final int CONSTRUCTOR = -186858780;

        public OptionValueInteger() {
        }

        public OptionValueInteger(long var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return -186858780;
        }
    }

    public static class OptionValueEmpty extends TdApi.OptionValue {
        public static final int CONSTRUCTOR = 918955155;

        public OptionValueEmpty() {
        }

        public int getConstructor() {
            return 918955155;
        }
    }

    public static class OptionValueBoolean extends TdApi.OptionValue {
        public boolean value;
        public static final int CONSTRUCTOR = 63135518;

        public OptionValueBoolean() {
        }

        public OptionValueBoolean(boolean var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return 63135518;
        }
    }

    public abstract static class OptionValue extends TdApi.Object {
        public OptionValue() {
        }
    }

    public static class Ok extends TdApi.Object {
        public static final int CONSTRUCTOR = -722616727;

        public Ok() {
        }

        public int getConstructor() {
            return -722616727;
        }
    }

    public static class NotificationTypeNewPushMessage extends TdApi.NotificationType {
        public long messageId;
        public TdApi.MessageSender senderId;
        public String senderName;
        public boolean isOutgoing;
        public TdApi.PushMessageContent content;
        public static final int CONSTRUCTOR = -711680462;

        public NotificationTypeNewPushMessage() {
        }

        public NotificationTypeNewPushMessage(long var1, TdApi.MessageSender var3, String var4, boolean var5, TdApi.PushMessageContent var6) {
            this.messageId = var1;
            this.senderId = var3;
            this.senderName = var4;
            this.isOutgoing = var5;
            this.content = var6;
        }

        public int getConstructor() {
            return -711680462;
        }
    }

    public static class NotificationTypeNewCall extends TdApi.NotificationType {
        public int callId;
        public static final int CONSTRUCTOR = 1712734585;

        public NotificationTypeNewCall() {
        }

        public NotificationTypeNewCall(int var1) {
            this.callId = var1;
        }

        public int getConstructor() {
            return 1712734585;
        }
    }

    public static class NotificationTypeNewSecretChat extends TdApi.NotificationType {
        public static final int CONSTRUCTOR = 1198638768;

        public NotificationTypeNewSecretChat() {
        }

        public int getConstructor() {
            return 1198638768;
        }
    }

    public static class NotificationTypeNewMessage extends TdApi.NotificationType {
        public TdApi.Message message;
        public boolean showPreview;
        public static final int CONSTRUCTOR = -254745614;

        public NotificationTypeNewMessage() {
        }

        public NotificationTypeNewMessage(TdApi.Message var1, boolean var2) {
            this.message = var1;
            this.showPreview = var2;
        }

        public int getConstructor() {
            return -254745614;
        }
    }

    public abstract static class NotificationType extends TdApi.Object {
        public NotificationType() {
        }
    }

    public static class NotificationSounds extends TdApi.Object {
        public TdApi.NotificationSound[] notificationSounds;
        public static final int CONSTRUCTOR = -630813169;

        public NotificationSounds() {
        }

        public NotificationSounds(TdApi.NotificationSound[] var1) {
            this.notificationSounds = var1;
        }

        public int getConstructor() {
            return -630813169;
        }
    }

    public static class NotificationSound extends TdApi.Object {
        public long id;
        public int duration;
        public int date;
        public String title;
        public String data;
        public TdApi.File sound;
        public static final int CONSTRUCTOR = -185638601;

        public NotificationSound() {
        }

        public NotificationSound(long var1, int var3, int var4, String var5, String var6, TdApi.File var7) {
            this.id = var1;
            this.duration = var3;
            this.date = var4;
            this.title = var5;
            this.data = var6;
            this.sound = var7;
        }

        public int getConstructor() {
            return -185638601;
        }
    }

    public static class NotificationSettingsScopeChannelChats extends TdApi.NotificationSettingsScope {
        public static final int CONSTRUCTOR = 548013448;

        public NotificationSettingsScopeChannelChats() {
        }

        public int getConstructor() {
            return 548013448;
        }
    }

    public static class NotificationSettingsScopeGroupChats extends TdApi.NotificationSettingsScope {
        public static final int CONSTRUCTOR = 1212142067;

        public NotificationSettingsScopeGroupChats() {
        }

        public int getConstructor() {
            return 1212142067;
        }
    }

    public static class NotificationSettingsScopePrivateChats extends TdApi.NotificationSettingsScope {
        public static final int CONSTRUCTOR = 937446759;

        public NotificationSettingsScopePrivateChats() {
        }

        public int getConstructor() {
            return 937446759;
        }
    }

    public abstract static class NotificationSettingsScope extends TdApi.Object {
        public NotificationSettingsScope() {
        }
    }

    public static class NotificationGroupTypeCalls extends TdApi.NotificationGroupType {
        public static final int CONSTRUCTOR = 1379123538;

        public NotificationGroupTypeCalls() {
        }

        public int getConstructor() {
            return 1379123538;
        }
    }

    public static class NotificationGroupTypeSecretChat extends TdApi.NotificationGroupType {
        public static final int CONSTRUCTOR = 1390759476;

        public NotificationGroupTypeSecretChat() {
        }

        public int getConstructor() {
            return 1390759476;
        }
    }

    public static class NotificationGroupTypeMentions extends TdApi.NotificationGroupType {
        public static final int CONSTRUCTOR = -2050324051;

        public NotificationGroupTypeMentions() {
        }

        public int getConstructor() {
            return -2050324051;
        }
    }

    public static class NotificationGroupTypeMessages extends TdApi.NotificationGroupType {
        public static final int CONSTRUCTOR = -1702481123;

        public NotificationGroupTypeMessages() {
        }

        public int getConstructor() {
            return -1702481123;
        }
    }

    public abstract static class NotificationGroupType extends TdApi.Object {
        public NotificationGroupType() {
        }
    }

    public static class NotificationGroup extends TdApi.Object {
        public int id;
        public TdApi.NotificationGroupType type;
        public long chatId;
        public int totalCount;
        public TdApi.Notification[] notifications;
        public static final int CONSTRUCTOR = 780691541;

        public NotificationGroup() {
        }

        public NotificationGroup(int var1, TdApi.NotificationGroupType var2, long var3, int var5, TdApi.Notification[] var6) {
            this.id = var1;
            this.type = var2;
            this.chatId = var3;
            this.totalCount = var5;
            this.notifications = var6;
        }

        public int getConstructor() {
            return 780691541;
        }
    }

    public static class Notification extends TdApi.Object {
        public int id;
        public int date;
        public boolean isSilent;
        public TdApi.NotificationType type;
        public static final int CONSTRUCTOR = 788743120;

        public Notification() {
        }

        public Notification(int var1, int var2, boolean var3, TdApi.NotificationType var4) {
            this.id = var1;
            this.date = var2;
            this.isSilent = var3;
            this.type = var4;
        }

        public int getConstructor() {
            return 788743120;
        }
    }

    public static class NetworkTypeOther extends TdApi.NetworkType {
        public static final int CONSTRUCTOR = 1942128539;

        public NetworkTypeOther() {
        }

        public int getConstructor() {
            return 1942128539;
        }
    }

    public static class NetworkTypeWiFi extends TdApi.NetworkType {
        public static final int CONSTRUCTOR = -633872070;

        public NetworkTypeWiFi() {
        }

        public int getConstructor() {
            return -633872070;
        }
    }

    public static class NetworkTypeMobileRoaming extends TdApi.NetworkType {
        public static final int CONSTRUCTOR = -1435199760;

        public NetworkTypeMobileRoaming() {
        }

        public int getConstructor() {
            return -1435199760;
        }
    }

    public static class NetworkTypeMobile extends TdApi.NetworkType {
        public static final int CONSTRUCTOR = 819228239;

        public NetworkTypeMobile() {
        }

        public int getConstructor() {
            return 819228239;
        }
    }

    public static class NetworkTypeNone extends TdApi.NetworkType {
        public static final int CONSTRUCTOR = -1971691759;

        public NetworkTypeNone() {
        }

        public int getConstructor() {
            return -1971691759;
        }
    }

    public abstract static class NetworkType extends TdApi.Object {
        public NetworkType() {
        }
    }

    public static class NetworkStatisticsEntryCall extends TdApi.NetworkStatisticsEntry {
        public TdApi.NetworkType networkType;
        public long sentBytes;
        public long receivedBytes;
        public double duration;
        public static final int CONSTRUCTOR = 737000365;

        public NetworkStatisticsEntryCall() {
        }

        public NetworkStatisticsEntryCall(TdApi.NetworkType var1, long var2, long var4, double var6) {
            this.networkType = var1;
            this.sentBytes = var2;
            this.receivedBytes = var4;
            this.duration = var6;
        }

        public int getConstructor() {
            return 737000365;
        }
    }

    public static class NetworkStatisticsEntryFile extends TdApi.NetworkStatisticsEntry {
        public TdApi.FileType fileType;
        public TdApi.NetworkType networkType;
        public long sentBytes;
        public long receivedBytes;
        public static final int CONSTRUCTOR = 188452706;

        public NetworkStatisticsEntryFile() {
        }

        public NetworkStatisticsEntryFile(TdApi.FileType var1, TdApi.NetworkType var2, long var3, long var5) {
            this.fileType = var1;
            this.networkType = var2;
            this.sentBytes = var3;
            this.receivedBytes = var5;
        }

        public int getConstructor() {
            return 188452706;
        }
    }

    public abstract static class NetworkStatisticsEntry extends TdApi.Object {
        public NetworkStatisticsEntry() {
        }
    }

    public static class NetworkStatistics extends TdApi.Object {
        public int sinceDate;
        public TdApi.NetworkStatisticsEntry[] entries;
        public static final int CONSTRUCTOR = 1615554212;

        public NetworkStatistics() {
        }

        public NetworkStatistics(int var1, TdApi.NetworkStatisticsEntry[] var2) {
            this.sinceDate = var1;
            this.entries = var2;
        }

        public int getConstructor() {
            return 1615554212;
        }
    }

    public static class Minithumbnail extends TdApi.Object {
        public int width;
        public int height;
        public byte[] data;
        public static final int CONSTRUCTOR = -328540758;

        public Minithumbnail() {
        }

        public Minithumbnail(int var1, int var2, byte[] var3) {
            this.width = var1;
            this.height = var2;
            this.data = var3;
        }

        public int getConstructor() {
            return -328540758;
        }
    }

    public static class Messages extends TdApi.Object {
        public int totalCount;
        public TdApi.Message[] messages;
        public static final int CONSTRUCTOR = -16498159;

        public Messages() {
        }

        public Messages(int var1, TdApi.Message[] var2) {
            this.totalCount = var1;
            this.messages = var2;
        }

        public int getConstructor() {
            return -16498159;
        }
    }

    public static class MessageViewers extends TdApi.Object {
        public TdApi.MessageViewer[] viewers;
        public static final int CONSTRUCTOR = 2116480287;

        public MessageViewers() {
        }

        public MessageViewers(TdApi.MessageViewer[] var1) {
            this.viewers = var1;
        }

        public int getConstructor() {
            return 2116480287;
        }
    }

    public static class MessageViewer extends TdApi.Object {
        public long userId;
        public int viewDate;
        public static final int CONSTRUCTOR = 1458639309;

        public MessageViewer() {
        }

        public MessageViewer(long var1, int var3) {
            this.userId = var1;
            this.viewDate = var3;
        }

        public int getConstructor() {
            return 1458639309;
        }
    }

    public static class MessageThreadInfo extends TdApi.Object {
        public long chatId;
        public long messageThreadId;
        public TdApi.MessageReplyInfo replyInfo;
        public int unreadMessageCount;
        public TdApi.Message[] messages;
        public TdApi.DraftMessage draftMessage;
        public static final int CONSTRUCTOR = -248536056;

        public MessageThreadInfo() {
        }

        public MessageThreadInfo(long var1, long var3, TdApi.MessageReplyInfo var5, int var6, TdApi.Message[] var7, TdApi.DraftMessage var8) {
            this.chatId = var1;
            this.messageThreadId = var3;
            this.replyInfo = var5;
            this.unreadMessageCount = var6;
            this.messages = var7;
            this.draftMessage = var8;
        }

        public int getConstructor() {
            return -248536056;
        }
    }

    public static class MessageStatistics extends TdApi.Object {
        public TdApi.StatisticalGraph messageInteractionGraph;
        public static final int CONSTRUCTOR = -1011383888;

        public MessageStatistics() {
        }

        public MessageStatistics(TdApi.StatisticalGraph var1) {
            this.messageInteractionGraph = var1;
        }

        public int getConstructor() {
            return -1011383888;
        }
    }

    public static class MessageSponsorTypeWebsite extends TdApi.MessageSponsorType {
        public String url;
        public String name;
        public static final int CONSTRUCTOR = -1528537189;

        public MessageSponsorTypeWebsite() {
        }

        public MessageSponsorTypeWebsite(String var1, String var2) {
            this.url = var1;
            this.name = var2;
        }

        public int getConstructor() {
            return -1528537189;
        }
    }

    public static class MessageSponsorTypePrivateChannel extends TdApi.MessageSponsorType {
        public String title;
        public String inviteLink;
        public static final int CONSTRUCTOR = 1959937448;

        public MessageSponsorTypePrivateChannel() {
        }

        public MessageSponsorTypePrivateChannel(String var1, String var2) {
            this.title = var1;
            this.inviteLink = var2;
        }

        public int getConstructor() {
            return 1959937448;
        }
    }

    public static class MessageSponsorTypePublicChannel extends TdApi.MessageSponsorType {
        public long chatId;
        public TdApi.InternalLinkType link;
        public static final int CONSTRUCTOR = -312190393;

        public MessageSponsorTypePublicChannel() {
        }

        public MessageSponsorTypePublicChannel(long var1, TdApi.InternalLinkType var3) {
            this.chatId = var1;
            this.link = var3;
        }

        public int getConstructor() {
            return -312190393;
        }
    }

    public static class MessageSponsorTypeBot extends TdApi.MessageSponsorType {
        public long botUserId;
        public TdApi.InternalLinkType link;
        public static final int CONSTRUCTOR = 1879909124;

        public MessageSponsorTypeBot() {
        }

        public MessageSponsorTypeBot(long var1, TdApi.InternalLinkType var3) {
            this.botUserId = var1;
            this.link = var3;
        }

        public int getConstructor() {
            return 1879909124;
        }
    }

    public abstract static class MessageSponsorType extends TdApi.Object {
        public MessageSponsorType() {
        }
    }

    public static class MessageSponsor extends TdApi.Object {
        public TdApi.MessageSponsorType type;
        public TdApi.ChatPhotoInfo photo;
        public String info;
        public static final int CONSTRUCTOR = -1598926735;

        public MessageSponsor() {
        }

        public MessageSponsor(TdApi.MessageSponsorType var1, TdApi.ChatPhotoInfo var2, String var3) {
            this.type = var1;
            this.photo = var2;
            this.info = var3;
        }

        public int getConstructor() {
            return -1598926735;
        }
    }

    public static class MessageSourceOther extends TdApi.MessageSource {
        public static final int CONSTRUCTOR = 901818114;

        public MessageSourceOther() {
        }

        public int getConstructor() {
            return 901818114;
        }
    }

    public static class MessageSourceScreenshot extends TdApi.MessageSource {
        public static final int CONSTRUCTOR = 469982474;

        public MessageSourceScreenshot() {
        }

        public int getConstructor() {
            return 469982474;
        }
    }

    public static class MessageSourceNotification extends TdApi.MessageSource {
        public static final int CONSTRUCTOR = -1046406163;

        public MessageSourceNotification() {
        }

        public int getConstructor() {
            return -1046406163;
        }
    }

    public static class MessageSourceChatEventLog extends TdApi.MessageSource {
        public static final int CONSTRUCTOR = -1028777540;

        public MessageSourceChatEventLog() {
        }

        public int getConstructor() {
            return -1028777540;
        }
    }

    public static class MessageSourceSearch extends TdApi.MessageSource {
        public static final int CONSTRUCTOR = 1921333105;

        public MessageSourceSearch() {
        }

        public int getConstructor() {
            return 1921333105;
        }
    }

    public static class MessageSourceChatList extends TdApi.MessageSource {
        public static final int CONSTRUCTOR = -2047406102;

        public MessageSourceChatList() {
        }

        public int getConstructor() {
            return -2047406102;
        }
    }

    public static class MessageSourceHistoryPreview extends TdApi.MessageSource {
        public static final int CONSTRUCTOR = 1024254993;

        public MessageSourceHistoryPreview() {
        }

        public int getConstructor() {
            return 1024254993;
        }
    }

    public static class MessageSourceForumTopicHistory extends TdApi.MessageSource {
        public static final int CONSTRUCTOR = -1518064457;

        public MessageSourceForumTopicHistory() {
        }

        public int getConstructor() {
            return -1518064457;
        }
    }

    public static class MessageSourceMessageThreadHistory extends TdApi.MessageSource {
        public static final int CONSTRUCTOR = 290427142;

        public MessageSourceMessageThreadHistory() {
        }

        public int getConstructor() {
            return 290427142;
        }
    }

    public static class MessageSourceChatHistory extends TdApi.MessageSource {
        public static final int CONSTRUCTOR = -1090386116;

        public MessageSourceChatHistory() {
        }

        public int getConstructor() {
            return -1090386116;
        }
    }

    public abstract static class MessageSource extends TdApi.Object {
        public MessageSource() {
        }
    }

    public static class MessageSendingStateFailed extends TdApi.MessageSendingState {
        public int errorCode;
        public String errorMessage;
        public boolean canRetry;
        public boolean needAnotherSender;
        public double retryAfter;
        public static final int CONSTRUCTOR = -1741887228;

        public MessageSendingStateFailed() {
        }

        public MessageSendingStateFailed(int var1, String var2, boolean var3, boolean var4, double var5) {
            this.errorCode = var1;
            this.errorMessage = var2;
            this.canRetry = var3;
            this.needAnotherSender = var4;
            this.retryAfter = var5;
        }

        public int getConstructor() {
            return -1741887228;
        }
    }

    public static class MessageSendingStatePending extends TdApi.MessageSendingState {
        public int sendingId;
        public static final int CONSTRUCTOR = -215260236;

        public MessageSendingStatePending() {
        }

        public MessageSendingStatePending(int var1) {
            this.sendingId = var1;
        }

        public int getConstructor() {
            return -215260236;
        }
    }

    public abstract static class MessageSendingState extends TdApi.Object {
        public MessageSendingState() {
        }
    }

    public static class MessageSenders extends TdApi.Object {
        public int totalCount;
        public TdApi.MessageSender[] senders;
        public static final int CONSTRUCTOR = -690158467;

        public MessageSenders() {
        }

        public MessageSenders(int var1, TdApi.MessageSender[] var2) {
            this.totalCount = var1;
            this.senders = var2;
        }

        public int getConstructor() {
            return -690158467;
        }
    }

    public static class MessageSenderChat extends TdApi.MessageSender {
        public long chatId;
        public static final int CONSTRUCTOR = -239660751;

        public MessageSenderChat() {
        }

        public MessageSenderChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -239660751;
        }
    }

    public static class MessageSenderUser extends TdApi.MessageSender {
        public long userId;
        public static final int CONSTRUCTOR = -336109341;

        public MessageSenderUser() {
        }

        public MessageSenderUser(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return -336109341;
        }
    }

    public abstract static class MessageSender extends TdApi.Object {
        public MessageSender() {
        }
    }

    public static class MessageSendOptions extends TdApi.Object {
        public boolean disableNotification;
        public boolean fromBackground;
        public boolean protectContent;
        public boolean updateOrderOfInstalledStickerSets;
        public TdApi.MessageSchedulingState schedulingState;
        public int sendingId;
        public static final int CONSTRUCTOR = 32902046;

        public MessageSendOptions() {
        }

        public MessageSendOptions(boolean var1, boolean var2, boolean var3, boolean var4, TdApi.MessageSchedulingState var5, int var6) {
            this.disableNotification = var1;
            this.fromBackground = var2;
            this.protectContent = var3;
            this.updateOrderOfInstalledStickerSets = var4;
            this.schedulingState = var5;
            this.sendingId = var6;
        }

        public int getConstructor() {
            return 32902046;
        }
    }

    public static class MessageSchedulingStateSendWhenOnline extends TdApi.MessageSchedulingState {
        public static final int CONSTRUCTOR = 2092947464;

        public MessageSchedulingStateSendWhenOnline() {
        }

        public int getConstructor() {
            return 2092947464;
        }
    }

    public static class MessageSchedulingStateSendAtDate extends TdApi.MessageSchedulingState {
        public int sendDate;
        public static final int CONSTRUCTOR = -1485570073;

        public MessageSchedulingStateSendAtDate() {
        }

        public MessageSchedulingStateSendAtDate(int var1) {
            this.sendDate = var1;
        }

        public int getConstructor() {
            return -1485570073;
        }
    }

    public abstract static class MessageSchedulingState extends TdApi.Object {
        public MessageSchedulingState() {
        }
    }

    public static class MessageReplyToStory extends TdApi.MessageReplyTo {
        public long storySenderChatId;
        public int storyId;
        public static final int CONSTRUCTOR = 1888266553;

        public MessageReplyToStory() {
        }

        public MessageReplyToStory(long var1, int var3) {
            this.storySenderChatId = var1;
            this.storyId = var3;
        }

        public int getConstructor() {
            return 1888266553;
        }
    }

    public static class MessageReplyToMessage extends TdApi.MessageReplyTo {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = -558878974;

        public MessageReplyToMessage() {
        }

        public MessageReplyToMessage(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return -558878974;
        }
    }

    public abstract static class MessageReplyTo extends TdApi.Object {
        public MessageReplyTo() {
        }
    }

    public static class MessageReplyInfo extends TdApi.Object {
        public int replyCount;
        public TdApi.MessageSender[] recentReplierIds;
        public long lastReadInboxMessageId;
        public long lastReadOutboxMessageId;
        public long lastMessageId;
        public static final int CONSTRUCTOR = -2093702263;

        public MessageReplyInfo() {
        }

        public MessageReplyInfo(int var1, TdApi.MessageSender[] var2, long var3, long var5, long var7) {
            this.replyCount = var1;
            this.recentReplierIds = var2;
            this.lastReadInboxMessageId = var3;
            this.lastReadOutboxMessageId = var5;
            this.lastMessageId = var7;
        }

        public int getConstructor() {
            return -2093702263;
        }
    }

    public static class MessageReaction extends TdApi.Object {
        public TdApi.ReactionType type;
        public int totalCount;
        public boolean isChosen;
        public TdApi.MessageSender[] recentSenderIds;
        public static final int CONSTRUCTOR = 583566666;

        public MessageReaction() {
        }

        public MessageReaction(TdApi.ReactionType var1, int var2, boolean var3, TdApi.MessageSender[] var4) {
            this.type = var1;
            this.totalCount = var2;
            this.isChosen = var3;
            this.recentSenderIds = var4;
        }

        public int getConstructor() {
            return 583566666;
        }
    }

    public static class MessagePositions extends TdApi.Object {
        public int totalCount;
        public TdApi.MessagePosition[] positions;
        public static final int CONSTRUCTOR = -1930466649;

        public MessagePositions() {
        }

        public MessagePositions(int var1, TdApi.MessagePosition[] var2) {
            this.totalCount = var1;
            this.positions = var2;
        }

        public int getConstructor() {
            return -1930466649;
        }
    }

    public static class MessagePosition extends TdApi.Object {
        public int position;
        public long messageId;
        public int date;
        public static final int CONSTRUCTOR = 1292189935;

        public MessagePosition() {
        }

        public MessagePosition(int var1, long var2, int var4) {
            this.position = var1;
            this.messageId = var2;
            this.date = var4;
        }

        public int getConstructor() {
            return 1292189935;
        }
    }

    public static class MessageLinkInfo extends TdApi.Object {
        public boolean isPublic;
        public long chatId;
        public long messageThreadId;
        public TdApi.Message message;
        public int mediaTimestamp;
        public boolean forAlbum;
        public static final int CONSTRUCTOR = 731315024;

        public MessageLinkInfo() {
        }

        public MessageLinkInfo(boolean var1, long var2, long var4, TdApi.Message var6, int var7, boolean var8) {
            this.isPublic = var1;
            this.chatId = var2;
            this.messageThreadId = var4;
            this.message = var6;
            this.mediaTimestamp = var7;
            this.forAlbum = var8;
        }

        public int getConstructor() {
            return 731315024;
        }
    }

    public static class MessageLink extends TdApi.Object {
        public String link;
        public boolean isPublic;
        public static final int CONSTRUCTOR = -1354089818;

        public MessageLink() {
        }

        public MessageLink(String var1, boolean var2) {
            this.link = var1;
            this.isPublic = var2;
        }

        public int getConstructor() {
            return -1354089818;
        }
    }

    public static class MessageInteractionInfo extends TdApi.Object {
        public int viewCount;
        public int forwardCount;
        public TdApi.MessageReplyInfo replyInfo;
        public TdApi.MessageReaction[] reactions;
        public static final int CONSTRUCTOR = -574858485;

        public MessageInteractionInfo() {
        }

        public MessageInteractionInfo(int var1, int var2, TdApi.MessageReplyInfo var3, TdApi.MessageReaction[] var4) {
            this.viewCount = var1;
            this.forwardCount = var2;
            this.replyInfo = var3;
            this.reactions = var4;
        }

        public int getConstructor() {
            return -574858485;
        }
    }

    public static class MessageForwardOriginMessageImport extends TdApi.MessageForwardOrigin {
        public String senderName;
        public static final int CONSTRUCTOR = -739561951;

        public MessageForwardOriginMessageImport() {
        }

        public MessageForwardOriginMessageImport(String var1) {
            this.senderName = var1;
        }

        public int getConstructor() {
            return -739561951;
        }
    }

    public static class MessageForwardOriginChannel extends TdApi.MessageForwardOrigin {
        public long chatId;
        public long messageId;
        public String authorSignature;
        public static final int CONSTRUCTOR = 1490730723;

        public MessageForwardOriginChannel() {
        }

        public MessageForwardOriginChannel(long var1, long var3, String var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.authorSignature = var5;
        }

        public int getConstructor() {
            return 1490730723;
        }
    }

    public static class MessageForwardOriginHiddenUser extends TdApi.MessageForwardOrigin {
        public String senderName;
        public static final int CONSTRUCTOR = -271257885;

        public MessageForwardOriginHiddenUser() {
        }

        public MessageForwardOriginHiddenUser(String var1) {
            this.senderName = var1;
        }

        public int getConstructor() {
            return -271257885;
        }
    }

    public static class MessageForwardOriginChat extends TdApi.MessageForwardOrigin {
        public long senderChatId;
        public String authorSignature;
        public static final int CONSTRUCTOR = 1526010724;

        public MessageForwardOriginChat() {
        }

        public MessageForwardOriginChat(long var1, String var3) {
            this.senderChatId = var1;
            this.authorSignature = var3;
        }

        public int getConstructor() {
            return 1526010724;
        }
    }

    public static class MessageForwardOriginUser extends TdApi.MessageForwardOrigin {
        public long senderUserId;
        public static final int CONSTRUCTOR = -355174191;

        public MessageForwardOriginUser() {
        }

        public MessageForwardOriginUser(long var1) {
            this.senderUserId = var1;
        }

        public int getConstructor() {
            return -355174191;
        }
    }

    public abstract static class MessageForwardOrigin extends TdApi.Object {
        public MessageForwardOrigin() {
        }
    }

    public static class MessageForwardInfo extends TdApi.Object {
        public TdApi.MessageForwardOrigin origin;
        public int date;
        public String publicServiceAnnouncementType;
        public long fromChatId;
        public long fromMessageId;
        public static final int CONSTRUCTOR = -327300408;

        public MessageForwardInfo() {
        }

        public MessageForwardInfo(TdApi.MessageForwardOrigin var1, int var2, String var3, long var4, long var6) {
            this.origin = var1;
            this.date = var2;
            this.publicServiceAnnouncementType = var3;
            this.fromChatId = var4;
            this.fromMessageId = var6;
        }

        public int getConstructor() {
            return -327300408;
        }
    }

    public static class MessageFileTypeUnknown extends TdApi.MessageFileType {
        public static final int CONSTRUCTOR = 1176353458;

        public MessageFileTypeUnknown() {
        }

        public int getConstructor() {
            return 1176353458;
        }
    }

    public static class MessageFileTypeGroup extends TdApi.MessageFileType {
        public String title;
        public static final int CONSTRUCTOR = -219836568;

        public MessageFileTypeGroup() {
        }

        public MessageFileTypeGroup(String var1) {
            this.title = var1;
        }

        public int getConstructor() {
            return -219836568;
        }
    }

    public static class MessageFileTypePrivate extends TdApi.MessageFileType {
        public String name;
        public static final int CONSTRUCTOR = -521908524;

        public MessageFileTypePrivate() {
        }

        public MessageFileTypePrivate(String var1) {
            this.name = var1;
        }

        public int getConstructor() {
            return -521908524;
        }
    }

    public abstract static class MessageFileType extends TdApi.Object {
        public MessageFileType() {
        }
    }

    public static class MessageExtendedMediaUnsupported extends TdApi.MessageExtendedMedia {
        public TdApi.FormattedText caption;
        public static final int CONSTRUCTOR = 337596448;

        public MessageExtendedMediaUnsupported() {
        }

        public MessageExtendedMediaUnsupported(TdApi.FormattedText var1) {
            this.caption = var1;
        }

        public int getConstructor() {
            return 337596448;
        }
    }

    public static class MessageExtendedMediaVideo extends TdApi.MessageExtendedMedia {
        public TdApi.Video video;
        public TdApi.FormattedText caption;
        public static final int CONSTRUCTOR = 296533819;

        public MessageExtendedMediaVideo() {
        }

        public MessageExtendedMediaVideo(TdApi.Video var1, TdApi.FormattedText var2) {
            this.video = var1;
            this.caption = var2;
        }

        public int getConstructor() {
            return 296533819;
        }
    }

    public static class MessageExtendedMediaPhoto extends TdApi.MessageExtendedMedia {
        public TdApi.Photo photo;
        public TdApi.FormattedText caption;
        public static final int CONSTRUCTOR = -963951312;

        public MessageExtendedMediaPhoto() {
        }

        public MessageExtendedMediaPhoto(TdApi.Photo var1, TdApi.FormattedText var2) {
            this.photo = var1;
            this.caption = var2;
        }

        public int getConstructor() {
            return -963951312;
        }
    }

    public static class MessageExtendedMediaPreview extends TdApi.MessageExtendedMedia {
        public int width;
        public int height;
        public int duration;
        public TdApi.Minithumbnail minithumbnail;
        public TdApi.FormattedText caption;
        public static final int CONSTRUCTOR = 1996727111;

        public MessageExtendedMediaPreview() {
        }

        public MessageExtendedMediaPreview(int var1, int var2, int var3, TdApi.Minithumbnail var4, TdApi.FormattedText var5) {
            this.width = var1;
            this.height = var2;
            this.duration = var3;
            this.minithumbnail = var4;
            this.caption = var5;
        }

        public int getConstructor() {
            return 1996727111;
        }
    }

    public abstract static class MessageExtendedMedia extends TdApi.Object {
        public MessageExtendedMedia() {
        }
    }

    public static class MessageCopyOptions extends TdApi.Object {
        public boolean sendCopy;
        public boolean replaceCaption;
        public TdApi.FormattedText newCaption;
        public static final int CONSTRUCTOR = 1208442937;

        public MessageCopyOptions() {
        }

        public MessageCopyOptions(boolean var1, boolean var2, TdApi.FormattedText var3) {
            this.sendCopy = var1;
            this.replaceCaption = var2;
            this.newCaption = var3;
        }

        public int getConstructor() {
            return 1208442937;
        }
    }

    public static class MessageUnsupported extends TdApi.MessageContent {
        public static final int CONSTRUCTOR = -1816726139;

        public MessageUnsupported() {
        }

        public int getConstructor() {
            return -1816726139;
        }
    }

    public static class MessageProximityAlertTriggered extends TdApi.MessageContent {
        public TdApi.MessageSender travelerId;
        public TdApi.MessageSender watcherId;
        public int distance;
        public static final int CONSTRUCTOR = 67761875;

        public MessageProximityAlertTriggered() {
        }

        public MessageProximityAlertTriggered(TdApi.MessageSender var1, TdApi.MessageSender var2, int var3) {
            this.travelerId = var1;
            this.watcherId = var2;
            this.distance = var3;
        }

        public int getConstructor() {
            return 67761875;
        }
    }

    public static class MessagePassportDataReceived extends TdApi.MessageContent {
        public TdApi.EncryptedPassportElement[] elements;
        public TdApi.EncryptedCredentials credentials;
        public static final int CONSTRUCTOR = -1367863624;

        public MessagePassportDataReceived() {
        }

        public MessagePassportDataReceived(TdApi.EncryptedPassportElement[] var1, TdApi.EncryptedCredentials var2) {
            this.elements = var1;
            this.credentials = var2;
        }

        public int getConstructor() {
            return -1367863624;
        }
    }

    public static class MessagePassportDataSent extends TdApi.MessageContent {
        public TdApi.PassportElementType[] types;
        public static final int CONSTRUCTOR = 1017405171;

        public MessagePassportDataSent() {
        }

        public MessagePassportDataSent(TdApi.PassportElementType[] var1) {
            this.types = var1;
        }

        public int getConstructor() {
            return 1017405171;
        }
    }

    public static class MessageWebAppDataReceived extends TdApi.MessageContent {
        public String buttonText;
        public String data;
        public static final int CONSTRUCTOR = -8578539;

        public MessageWebAppDataReceived() {
        }

        public MessageWebAppDataReceived(String var1, String var2) {
            this.buttonText = var1;
            this.data = var2;
        }

        public int getConstructor() {
            return -8578539;
        }
    }

    public static class MessageWebAppDataSent extends TdApi.MessageContent {
        public String buttonText;
        public static final int CONSTRUCTOR = -83674862;

        public MessageWebAppDataSent() {
        }

        public MessageWebAppDataSent(String var1) {
            this.buttonText = var1;
        }

        public int getConstructor() {
            return -83674862;
        }
    }

    public static class MessageBotWriteAccessAllowed extends TdApi.MessageContent {
        public TdApi.WebApp webApp;
        public static final int CONSTRUCTOR = -1055588088;

        public MessageBotWriteAccessAllowed() {
        }

        public MessageBotWriteAccessAllowed(TdApi.WebApp var1) {
            this.webApp = var1;
        }

        public int getConstructor() {
            return -1055588088;
        }
    }

    public static class MessageWebsiteConnected extends TdApi.MessageContent {
        public String domainName;
        public static final int CONSTRUCTOR = -1074551800;

        public MessageWebsiteConnected() {
        }

        public MessageWebsiteConnected(String var1) {
            this.domainName = var1;
        }

        public int getConstructor() {
            return -1074551800;
        }
    }

    public static class MessageChatShared extends TdApi.MessageContent {
        public long chatId;
        public int buttonId;
        public static final int CONSTRUCTOR = 584806545;

        public MessageChatShared() {
        }

        public MessageChatShared(long var1, int var3) {
            this.chatId = var1;
            this.buttonId = var3;
        }

        public int getConstructor() {
            return 584806545;
        }
    }

    public static class MessageUserShared extends TdApi.MessageContent {
        public long userId;
        public int buttonId;
        public static final int CONSTRUCTOR = -723732612;

        public MessageUserShared() {
        }

        public MessageUserShared(long var1, int var3) {
            this.userId = var1;
            this.buttonId = var3;
        }

        public int getConstructor() {
            return -723732612;
        }
    }

    public static class MessageContactRegistered extends TdApi.MessageContent {
        public static final int CONSTRUCTOR = -1502020353;

        public MessageContactRegistered() {
        }

        public int getConstructor() {
            return -1502020353;
        }
    }

    public static class MessageGiftedPremium extends TdApi.MessageContent {
        public long gifterUserId;
        public String currency;
        public long amount;
        public String cryptocurrency;
        public long cryptocurrencyAmount;
        public int monthCount;
        public TdApi.Sticker sticker;
        public static final int CONSTRUCTOR = 126688522;

        public MessageGiftedPremium() {
        }

        public MessageGiftedPremium(long var1, String var3, long var4, String var6, long var7, int var9, TdApi.Sticker var10) {
            this.gifterUserId = var1;
            this.currency = var3;
            this.amount = var4;
            this.cryptocurrency = var6;
            this.cryptocurrencyAmount = var7;
            this.monthCount = var9;
            this.sticker = var10;
        }

        public int getConstructor() {
            return 126688522;
        }
    }

    public static class MessagePaymentSuccessfulBot extends TdApi.MessageContent {
        public String currency;
        public long totalAmount;
        public boolean isRecurring;
        public boolean isFirstRecurring;
        public byte[] invoicePayload;
        public String shippingOptionId;
        public TdApi.OrderInfo orderInfo;
        public String telegramPaymentChargeId;
        public String providerPaymentChargeId;
        public static final int CONSTRUCTOR = 1759592121;

        public MessagePaymentSuccessfulBot() {
        }

        public MessagePaymentSuccessfulBot(String var1, long var2, boolean var4, boolean var5, byte[] var6, String var7, TdApi.OrderInfo var8, String var9, String var10) {
            this.currency = var1;
            this.totalAmount = var2;
            this.isRecurring = var4;
            this.isFirstRecurring = var5;
            this.invoicePayload = var6;
            this.shippingOptionId = var7;
            this.orderInfo = var8;
            this.telegramPaymentChargeId = var9;
            this.providerPaymentChargeId = var10;
        }

        public int getConstructor() {
            return 1759592121;
        }
    }

    public static class MessagePaymentSuccessful extends TdApi.MessageContent {
        public long invoiceChatId;
        public long invoiceMessageId;
        public String currency;
        public long totalAmount;
        public boolean isRecurring;
        public boolean isFirstRecurring;
        public String invoiceName;
        public static final int CONSTRUCTOR = 1406745820;

        public MessagePaymentSuccessful() {
        }

        public MessagePaymentSuccessful(long var1, long var3, String var5, long var6, boolean var8, boolean var9, String var10) {
            this.invoiceChatId = var1;
            this.invoiceMessageId = var3;
            this.currency = var5;
            this.totalAmount = var6;
            this.isRecurring = var8;
            this.isFirstRecurring = var9;
            this.invoiceName = var10;
        }

        public int getConstructor() {
            return 1406745820;
        }
    }

    public static class MessageGameScore extends TdApi.MessageContent {
        public long gameMessageId;
        public long gameId;
        public int score;
        public static final int CONSTRUCTOR = 1344904575;

        public MessageGameScore() {
        }

        public MessageGameScore(long var1, long var3, int var5) {
            this.gameMessageId = var1;
            this.gameId = var3;
            this.score = var5;
        }

        public int getConstructor() {
            return 1344904575;
        }
    }

    public static class MessageCustomServiceAction extends TdApi.MessageContent {
        public String text;
        public static final int CONSTRUCTOR = 1435879282;

        public MessageCustomServiceAction() {
        }

        public MessageCustomServiceAction(String var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return 1435879282;
        }
    }

    public static class MessageSuggestProfilePhoto extends TdApi.MessageContent {
        public TdApi.ChatPhoto photo;
        public static final int CONSTRUCTOR = -1251926297;

        public MessageSuggestProfilePhoto() {
        }

        public MessageSuggestProfilePhoto(TdApi.ChatPhoto var1) {
            this.photo = var1;
        }

        public int getConstructor() {
            return -1251926297;
        }
    }

    public static class MessageForumTopicIsHiddenToggled extends TdApi.MessageContent {
        public boolean isHidden;
        public static final int CONSTRUCTOR = -1751936002;

        public MessageForumTopicIsHiddenToggled() {
        }

        public MessageForumTopicIsHiddenToggled(boolean var1) {
            this.isHidden = var1;
        }

        public int getConstructor() {
            return -1751936002;
        }
    }

    public static class MessageForumTopicIsClosedToggled extends TdApi.MessageContent {
        public boolean isClosed;
        public static final int CONSTRUCTOR = 1264029664;

        public MessageForumTopicIsClosedToggled() {
        }

        public MessageForumTopicIsClosedToggled(boolean var1) {
            this.isClosed = var1;
        }

        public int getConstructor() {
            return 1264029664;
        }
    }

    public static class MessageForumTopicEdited extends TdApi.MessageContent {
        public String name;
        public boolean editIconCustomEmojiId;
        public long iconCustomEmojiId;
        public static final int CONSTRUCTOR = 12629888;

        public MessageForumTopicEdited() {
        }

        public MessageForumTopicEdited(String var1, boolean var2, long var3) {
            this.name = var1;
            this.editIconCustomEmojiId = var2;
            this.iconCustomEmojiId = var3;
        }

        public int getConstructor() {
            return 12629888;
        }
    }

    public static class MessageForumTopicCreated extends TdApi.MessageContent {
        public String name;
        public TdApi.ForumTopicIcon icon;
        public static final int CONSTRUCTOR = -1194440751;

        public MessageForumTopicCreated() {
        }

        public MessageForumTopicCreated(String var1, TdApi.ForumTopicIcon var2) {
            this.name = var1;
            this.icon = var2;
        }

        public int getConstructor() {
            return -1194440751;
        }
    }

    public static class MessageChatSetMessageAutoDeleteTime extends TdApi.MessageContent {
        public int messageAutoDeleteTime;
        public long fromUserId;
        public static final int CONSTRUCTOR = 1637745966;

        public MessageChatSetMessageAutoDeleteTime() {
        }

        public MessageChatSetMessageAutoDeleteTime(int var1, long var2) {
            this.messageAutoDeleteTime = var1;
            this.fromUserId = var2;
        }

        public int getConstructor() {
            return 1637745966;
        }
    }

    public static class MessageChatSetTheme extends TdApi.MessageContent {
        public String themeName;
        public static final int CONSTRUCTOR = -1716612088;

        public MessageChatSetTheme() {
        }

        public MessageChatSetTheme(String var1) {
            this.themeName = var1;
        }

        public int getConstructor() {
            return -1716612088;
        }
    }

    public static class MessageChatSetBackground extends TdApi.MessageContent {
        public long oldBackgroundMessageId;
        public TdApi.ChatBackground background;
        public static final int CONSTRUCTOR = -2122213583;

        public MessageChatSetBackground() {
        }

        public MessageChatSetBackground(long var1, TdApi.ChatBackground var3) {
            this.oldBackgroundMessageId = var1;
            this.background = var3;
        }

        public int getConstructor() {
            return -2122213583;
        }
    }

    public static class MessageScreenshotTaken extends TdApi.MessageContent {
        public static final int CONSTRUCTOR = -1564971605;

        public MessageScreenshotTaken() {
        }

        public int getConstructor() {
            return -1564971605;
        }
    }

    public static class MessagePinMessage extends TdApi.MessageContent {
        public long messageId;
        public static final int CONSTRUCTOR = 953503801;

        public MessagePinMessage() {
        }

        public MessagePinMessage(long var1) {
            this.messageId = var1;
        }

        public int getConstructor() {
            return 953503801;
        }
    }

    public static class MessageChatUpgradeFrom extends TdApi.MessageContent {
        public String title;
        public long basicGroupId;
        public static final int CONSTRUCTOR = 325954268;

        public MessageChatUpgradeFrom() {
        }

        public MessageChatUpgradeFrom(String var1, long var2) {
            this.title = var1;
            this.basicGroupId = var2;
        }

        public int getConstructor() {
            return 325954268;
        }
    }

    public static class MessageChatUpgradeTo extends TdApi.MessageContent {
        public long supergroupId;
        public static final int CONSTRUCTOR = 104813723;

        public MessageChatUpgradeTo() {
        }

        public MessageChatUpgradeTo(long var1) {
            this.supergroupId = var1;
        }

        public int getConstructor() {
            return 104813723;
        }
    }

    public static class MessageChatDeleteMember extends TdApi.MessageContent {
        public long userId;
        public static final int CONSTRUCTOR = 938029481;

        public MessageChatDeleteMember() {
        }

        public MessageChatDeleteMember(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return 938029481;
        }
    }

    public static class MessageChatJoinByRequest extends TdApi.MessageContent {
        public static final int CONSTRUCTOR = 1195428732;

        public MessageChatJoinByRequest() {
        }

        public int getConstructor() {
            return 1195428732;
        }
    }

    public static class MessageChatJoinByLink extends TdApi.MessageContent {
        public static final int CONSTRUCTOR = 1846493311;

        public MessageChatJoinByLink() {
        }

        public int getConstructor() {
            return 1846493311;
        }
    }

    public static class MessageChatAddMembers extends TdApi.MessageContent {
        public long[] memberUserIds;
        public static final int CONSTRUCTOR = 1701117908;

        public MessageChatAddMembers() {
        }

        public MessageChatAddMembers(long[] var1) {
            this.memberUserIds = var1;
        }

        public int getConstructor() {
            return 1701117908;
        }
    }

    public static class MessageChatDeletePhoto extends TdApi.MessageContent {
        public static final int CONSTRUCTOR = -184374809;

        public MessageChatDeletePhoto() {
        }

        public int getConstructor() {
            return -184374809;
        }
    }

    public static class MessageChatChangePhoto extends TdApi.MessageContent {
        public TdApi.ChatPhoto photo;
        public static final int CONSTRUCTOR = -813415093;

        public MessageChatChangePhoto() {
        }

        public MessageChatChangePhoto(TdApi.ChatPhoto var1) {
            this.photo = var1;
        }

        public int getConstructor() {
            return -813415093;
        }
    }

    public static class MessageChatChangeTitle extends TdApi.MessageContent {
        public String title;
        public static final int CONSTRUCTOR = 748272449;

        public MessageChatChangeTitle() {
        }

        public MessageChatChangeTitle(String var1) {
            this.title = var1;
        }

        public int getConstructor() {
            return 748272449;
        }
    }

    public static class MessageSupergroupChatCreate extends TdApi.MessageContent {
        public String title;
        public static final int CONSTRUCTOR = -434325733;

        public MessageSupergroupChatCreate() {
        }

        public MessageSupergroupChatCreate(String var1) {
            this.title = var1;
        }

        public int getConstructor() {
            return -434325733;
        }
    }

    public static class MessageBasicGroupChatCreate extends TdApi.MessageContent {
        public String title;
        public long[] memberUserIds;
        public static final int CONSTRUCTOR = 795404060;

        public MessageBasicGroupChatCreate() {
        }

        public MessageBasicGroupChatCreate(String var1, long[] var2) {
            this.title = var1;
            this.memberUserIds = var2;
        }

        public int getConstructor() {
            return 795404060;
        }
    }

    public static class MessageInviteVideoChatParticipants extends TdApi.MessageContent {
        public int groupCallId;
        public long[] userIds;
        public static final int CONSTRUCTOR = -1459065585;

        public MessageInviteVideoChatParticipants() {
        }

        public MessageInviteVideoChatParticipants(int var1, long[] var2) {
            this.groupCallId = var1;
            this.userIds = var2;
        }

        public int getConstructor() {
            return -1459065585;
        }
    }

    public static class MessageVideoChatEnded extends TdApi.MessageContent {
        public int duration;
        public static final int CONSTRUCTOR = 2032544855;

        public MessageVideoChatEnded() {
        }

        public MessageVideoChatEnded(int var1) {
            this.duration = var1;
        }

        public int getConstructor() {
            return 2032544855;
        }
    }

    public static class MessageVideoChatStarted extends TdApi.MessageContent {
        public int groupCallId;
        public static final int CONSTRUCTOR = 521225561;

        public MessageVideoChatStarted() {
        }

        public MessageVideoChatStarted(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return 521225561;
        }
    }

    public static class MessageVideoChatScheduled extends TdApi.MessageContent {
        public int groupCallId;
        public int startDate;
        public static final int CONSTRUCTOR = -1855185481;

        public MessageVideoChatScheduled() {
        }

        public MessageVideoChatScheduled(int var1, int var2) {
            this.groupCallId = var1;
            this.startDate = var2;
        }

        public int getConstructor() {
            return -1855185481;
        }
    }

    public static class MessageCall extends TdApi.MessageContent {
        public boolean isVideo;
        public TdApi.CallDiscardReason discardReason;
        public int duration;
        public static final int CONSTRUCTOR = 538893824;

        public MessageCall() {
        }

        public MessageCall(boolean var1, TdApi.CallDiscardReason var2, int var3) {
            this.isVideo = var1;
            this.discardReason = var2;
            this.duration = var3;
        }

        public int getConstructor() {
            return 538893824;
        }
    }

    public static class MessageInvoice extends TdApi.MessageContent {
        public String title;
        public TdApi.FormattedText description;
        public TdApi.Photo photo;
        public String currency;
        public long totalAmount;
        public String startParameter;
        public boolean isTest;
        public boolean needShippingAddress;
        public long receiptMessageId;
        public TdApi.MessageExtendedMedia extendedMedia;
        public static final int CONSTRUCTOR = 818077142;

        public MessageInvoice() {
        }

        public MessageInvoice(String var1, TdApi.FormattedText var2, TdApi.Photo var3, String var4, long var5, String var7, boolean var8, boolean var9, long var10, TdApi.MessageExtendedMedia var12) {
            this.title = var1;
            this.description = var2;
            this.photo = var3;
            this.currency = var4;
            this.totalAmount = var5;
            this.startParameter = var7;
            this.isTest = var8;
            this.needShippingAddress = var9;
            this.receiptMessageId = var10;
            this.extendedMedia = var12;
        }

        public int getConstructor() {
            return 818077142;
        }
    }

    public static class MessageStory extends TdApi.MessageContent {
        public long storySenderChatId;
        public int storyId;
        public boolean viaMention;
        public static final int CONSTRUCTOR = 858387156;

        public MessageStory() {
        }

        public MessageStory(long var1, int var3, boolean var4) {
            this.storySenderChatId = var1;
            this.storyId = var3;
            this.viaMention = var4;
        }

        public int getConstructor() {
            return 858387156;
        }
    }

    public static class MessagePoll extends TdApi.MessageContent {
        public TdApi.Poll poll;
        public static final int CONSTRUCTOR = -662130099;

        public MessagePoll() {
        }

        public MessagePoll(TdApi.Poll var1) {
            this.poll = var1;
        }

        public int getConstructor() {
            return -662130099;
        }
    }

    public static class MessageGame extends TdApi.MessageContent {
        public TdApi.Game game;
        public static final int CONSTRUCTOR = -69441162;

        public MessageGame() {
        }

        public MessageGame(TdApi.Game var1) {
            this.game = var1;
        }

        public int getConstructor() {
            return -69441162;
        }
    }

    public static class MessageDice extends TdApi.MessageContent {
        public TdApi.DiceStickers initialState;
        public TdApi.DiceStickers finalState;
        public String emoji;
        public int value;
        public int successAnimationFrameNumber;
        public static final int CONSTRUCTOR = 1115779641;

        public MessageDice() {
        }

        public MessageDice(TdApi.DiceStickers var1, TdApi.DiceStickers var2, String var3, int var4, int var5) {
            this.initialState = var1;
            this.finalState = var2;
            this.emoji = var3;
            this.value = var4;
            this.successAnimationFrameNumber = var5;
        }

        public int getConstructor() {
            return 1115779641;
        }
    }

    public static class MessageAnimatedEmoji extends TdApi.MessageContent {
        public TdApi.AnimatedEmoji animatedEmoji;
        public String emoji;
        public static final int CONSTRUCTOR = 908195298;

        public MessageAnimatedEmoji() {
        }

        public MessageAnimatedEmoji(TdApi.AnimatedEmoji var1, String var2) {
            this.animatedEmoji = var1;
            this.emoji = var2;
        }

        public int getConstructor() {
            return 908195298;
        }
    }

    public static class MessageContact extends TdApi.MessageContent {
        public TdApi.Contact contact;
        public static final int CONSTRUCTOR = -512684966;

        public MessageContact() {
        }

        public MessageContact(TdApi.Contact var1) {
            this.contact = var1;
        }

        public int getConstructor() {
            return -512684966;
        }
    }

    public static class MessageVenue extends TdApi.MessageContent {
        public TdApi.Venue venue;
        public static final int CONSTRUCTOR = -2146492043;

        public MessageVenue() {
        }

        public MessageVenue(TdApi.Venue var1) {
            this.venue = var1;
        }

        public int getConstructor() {
            return -2146492043;
        }
    }

    public static class MessageLocation extends TdApi.MessageContent {
        public TdApi.Location location;
        public int livePeriod;
        public int expiresIn;
        public int heading;
        public int proximityAlertRadius;
        public static final int CONSTRUCTOR = 303973492;

        public MessageLocation() {
        }

        public MessageLocation(TdApi.Location var1, int var2, int var3, int var4, int var5) {
            this.location = var1;
            this.livePeriod = var2;
            this.expiresIn = var3;
            this.heading = var4;
            this.proximityAlertRadius = var5;
        }

        public int getConstructor() {
            return 303973492;
        }
    }

    public static class MessageVoiceNote extends TdApi.MessageContent {
        public TdApi.VoiceNote voiceNote;
        public TdApi.FormattedText caption;
        public boolean isListened;
        public static final int CONSTRUCTOR = 527777781;

        public MessageVoiceNote() {
        }

        public MessageVoiceNote(TdApi.VoiceNote var1, TdApi.FormattedText var2, boolean var3) {
            this.voiceNote = var1;
            this.caption = var2;
            this.isListened = var3;
        }

        public int getConstructor() {
            return 527777781;
        }
    }

    public static class MessageVideoNote extends TdApi.MessageContent {
        public TdApi.VideoNote videoNote;
        public boolean isViewed;
        public boolean isSecret;
        public static final int CONSTRUCTOR = 963323014;

        public MessageVideoNote() {
        }

        public MessageVideoNote(TdApi.VideoNote var1, boolean var2, boolean var3) {
            this.videoNote = var1;
            this.isViewed = var2;
            this.isSecret = var3;
        }

        public int getConstructor() {
            return 963323014;
        }
    }

    public static class MessageExpiredVideo extends TdApi.MessageContent {
        public static final int CONSTRUCTOR = -1212209981;

        public MessageExpiredVideo() {
        }

        public int getConstructor() {
            return -1212209981;
        }
    }

    public static class MessageVideo extends TdApi.MessageContent {
        public TdApi.Video video;
        public TdApi.FormattedText caption;
        public boolean hasSpoiler;
        public boolean isSecret;
        public static final int CONSTRUCTOR = -1237516229;

        public MessageVideo() {
        }

        public MessageVideo(TdApi.Video var1, TdApi.FormattedText var2, boolean var3, boolean var4) {
            this.video = var1;
            this.caption = var2;
            this.hasSpoiler = var3;
            this.isSecret = var4;
        }

        public int getConstructor() {
            return -1237516229;
        }
    }

    public static class MessageSticker extends TdApi.MessageContent {
        public TdApi.Sticker sticker;
        public boolean isPremium;
        public static final int CONSTRUCTOR = -437199670;

        public MessageSticker() {
        }

        public MessageSticker(TdApi.Sticker var1, boolean var2) {
            this.sticker = var1;
            this.isPremium = var2;
        }

        public int getConstructor() {
            return -437199670;
        }
    }

    public static class MessageExpiredPhoto extends TdApi.MessageContent {
        public static final int CONSTRUCTOR = -1404641801;

        public MessageExpiredPhoto() {
        }

        public int getConstructor() {
            return -1404641801;
        }
    }

    public static class MessagePhoto extends TdApi.MessageContent {
        public TdApi.Photo photo;
        public TdApi.FormattedText caption;
        public boolean hasSpoiler;
        public boolean isSecret;
        public static final int CONSTRUCTOR = -448050478;

        public MessagePhoto() {
        }

        public MessagePhoto(TdApi.Photo var1, TdApi.FormattedText var2, boolean var3, boolean var4) {
            this.photo = var1;
            this.caption = var2;
            this.hasSpoiler = var3;
            this.isSecret = var4;
        }

        public int getConstructor() {
            return -448050478;
        }
    }

    public static class MessageDocument extends TdApi.MessageContent {
        public TdApi.Document document;
        public TdApi.FormattedText caption;
        public static final int CONSTRUCTOR = 596945783;

        public MessageDocument() {
        }

        public MessageDocument(TdApi.Document var1, TdApi.FormattedText var2) {
            this.document = var1;
            this.caption = var2;
        }

        public int getConstructor() {
            return 596945783;
        }
    }

    public static class MessageAudio extends TdApi.MessageContent {
        public TdApi.Audio audio;
        public TdApi.FormattedText caption;
        public static final int CONSTRUCTOR = 276722716;

        public MessageAudio() {
        }

        public MessageAudio(TdApi.Audio var1, TdApi.FormattedText var2) {
            this.audio = var1;
            this.caption = var2;
        }

        public int getConstructor() {
            return 276722716;
        }
    }

    public static class MessageAnimation extends TdApi.MessageContent {
        public TdApi.Animation animation;
        public TdApi.FormattedText caption;
        public boolean hasSpoiler;
        public boolean isSecret;
        public static final int CONSTRUCTOR = 1051944700;

        public MessageAnimation() {
        }

        public MessageAnimation(TdApi.Animation var1, TdApi.FormattedText var2, boolean var3, boolean var4) {
            this.animation = var1;
            this.caption = var2;
            this.hasSpoiler = var3;
            this.isSecret = var4;
        }

        public int getConstructor() {
            return 1051944700;
        }
    }

    public static class MessageText extends TdApi.MessageContent {
        public TdApi.FormattedText text;
        public TdApi.WebPage webPage;
        public static final int CONSTRUCTOR = 1989037971;

        public MessageText() {
        }

        public MessageText(TdApi.FormattedText var1, TdApi.WebPage var2) {
            this.text = var1;
            this.webPage = var2;
        }

        public int getConstructor() {
            return 1989037971;
        }
    }

    public abstract static class MessageContent extends TdApi.Object {
        public MessageContent() {
        }
    }

    public static class MessageCalendarDay extends TdApi.Object {
        public int totalCount;
        public TdApi.Message message;
        public static final int CONSTRUCTOR = -376467614;

        public MessageCalendarDay() {
        }

        public MessageCalendarDay(int var1, TdApi.Message var2) {
            this.totalCount = var1;
            this.message = var2;
        }

        public int getConstructor() {
            return -376467614;
        }
    }

    public static class MessageCalendar extends TdApi.Object {
        public int totalCount;
        public TdApi.MessageCalendarDay[] days;
        public static final int CONSTRUCTOR = -1682890519;

        public MessageCalendar() {
        }

        public MessageCalendar(int var1, TdApi.MessageCalendarDay[] var2) {
            this.totalCount = var1;
            this.days = var2;
        }

        public int getConstructor() {
            return -1682890519;
        }
    }

    public static class MessageAutoDeleteTime extends TdApi.Object {
        public int time;
        public static final int CONSTRUCTOR = 1972045589;

        public MessageAutoDeleteTime() {
        }

        public MessageAutoDeleteTime(int var1) {
            this.time = var1;
        }

        public int getConstructor() {
            return 1972045589;
        }
    }

    public static class Message extends TdApi.Object {
        public long id;
        public TdApi.MessageSender senderId;
        public long chatId;
        public TdApi.MessageSendingState sendingState;
        public TdApi.MessageSchedulingState schedulingState;
        public boolean isOutgoing;
        public boolean isPinned;
        public boolean canBeEdited;
        public boolean canBeForwarded;
        public boolean canBeSaved;
        public boolean canBeDeletedOnlyForSelf;
        public boolean canBeDeletedForAllUsers;
        public boolean canGetAddedReactions;
        public boolean canGetStatistics;
        public boolean canGetMessageThread;
        public boolean canGetViewers;
        public boolean canGetMediaTimestampLinks;
        public boolean canReportReactions;
        public boolean hasTimestampedMedia;
        public boolean isChannelPost;
        public boolean isTopicMessage;
        public boolean containsUnreadMention;
        public int date;
        public int editDate;
        public TdApi.MessageForwardInfo forwardInfo;
        public TdApi.MessageInteractionInfo interactionInfo;
        public TdApi.UnreadReaction[] unreadReactions;
        public TdApi.MessageReplyTo replyTo;
        public long messageThreadId;
        public int selfDestructTime;
        public double selfDestructIn;
        public double autoDeleteIn;
        public long viaBotUserId;
        public String authorSignature;
        public long mediaAlbumId;
        public String restrictionReason;
        public TdApi.MessageContent content;
        public TdApi.ReplyMarkup replyMarkup;
        public static final int CONSTRUCTOR = 2107427707;

        public Message() {
        }

        public Message(long var1, TdApi.MessageSender var3, long var4, TdApi.MessageSendingState var6, TdApi.MessageSchedulingState var7, boolean var8, boolean var9, boolean var10, boolean var11, boolean var12, boolean var13, boolean var14, boolean var15, boolean var16, boolean var17, boolean var18, boolean var19, boolean var20, boolean var21, boolean var22, boolean var23, boolean var24, int var25, int var26, TdApi.MessageForwardInfo var27, TdApi.MessageInteractionInfo var28, TdApi.UnreadReaction[] var29, TdApi.MessageReplyTo var30, long var31, int var33, double var34, double var36, long var38, String var40, long var41, String var43, TdApi.MessageContent var44, TdApi.ReplyMarkup var45) {
            this.id = var1;
            this.senderId = var3;
            this.chatId = var4;
            this.sendingState = var6;
            this.schedulingState = var7;
            this.isOutgoing = var8;
            this.isPinned = var9;
            this.canBeEdited = var10;
            this.canBeForwarded = var11;
            this.canBeSaved = var12;
            this.canBeDeletedOnlyForSelf = var13;
            this.canBeDeletedForAllUsers = var14;
            this.canGetAddedReactions = var15;
            this.canGetStatistics = var16;
            this.canGetMessageThread = var17;
            this.canGetViewers = var18;
            this.canGetMediaTimestampLinks = var19;
            this.canReportReactions = var20;
            this.hasTimestampedMedia = var21;
            this.isChannelPost = var22;
            this.isTopicMessage = var23;
            this.containsUnreadMention = var24;
            this.date = var25;
            this.editDate = var26;
            this.forwardInfo = var27;
            this.interactionInfo = var28;
            this.unreadReactions = var29;
            this.replyTo = var30;
            this.messageThreadId = var31;
            this.selfDestructTime = var33;
            this.selfDestructIn = var34;
            this.autoDeleteIn = var36;
            this.viaBotUserId = var38;
            this.authorSignature = var40;
            this.mediaAlbumId = var41;
            this.restrictionReason = var43;
            this.content = var44;
            this.replyMarkup = var45;
        }

        public int getConstructor() {
            return 2107427707;
        }
    }

    public static class MaskPosition extends TdApi.Object {
        public TdApi.MaskPoint point;
        public double xShift;
        public double yShift;
        public double scale;
        public static final int CONSTRUCTOR = -2097433026;

        public MaskPosition() {
        }

        public MaskPosition(TdApi.MaskPoint var1, double var2, double var4, double var6) {
            this.point = var1;
            this.xShift = var2;
            this.yShift = var4;
            this.scale = var6;
        }

        public int getConstructor() {
            return -2097433026;
        }
    }

    public static class MaskPointChin extends TdApi.MaskPoint {
        public static final int CONSTRUCTOR = 534995335;

        public MaskPointChin() {
        }

        public int getConstructor() {
            return 534995335;
        }
    }

    public static class MaskPointMouth extends TdApi.MaskPoint {
        public static final int CONSTRUCTOR = 411773406;

        public MaskPointMouth() {
        }

        public int getConstructor() {
            return 411773406;
        }
    }

    public static class MaskPointEyes extends TdApi.MaskPoint {
        public static final int CONSTRUCTOR = 1748310861;

        public MaskPointEyes() {
        }

        public int getConstructor() {
            return 1748310861;
        }
    }

    public static class MaskPointForehead extends TdApi.MaskPoint {
        public static final int CONSTRUCTOR = 1027512005;

        public MaskPointForehead() {
        }

        public int getConstructor() {
            return 1027512005;
        }
    }

    public abstract static class MaskPoint extends TdApi.Object {
        public MaskPoint() {
        }
    }

    public static class LoginUrlInfoRequestConfirmation extends TdApi.LoginUrlInfo {
        public String url;
        public String domain;
        public long botUserId;
        public boolean requestWriteAccess;
        public static final int CONSTRUCTOR = 2128290863;

        public LoginUrlInfoRequestConfirmation() {
        }

        public LoginUrlInfoRequestConfirmation(String var1, String var2, long var3, boolean var5) {
            this.url = var1;
            this.domain = var2;
            this.botUserId = var3;
            this.requestWriteAccess = var5;
        }

        public int getConstructor() {
            return 2128290863;
        }
    }

    public static class LoginUrlInfoOpen extends TdApi.LoginUrlInfo {
        public String url;
        public boolean skipConfirmation;
        public static final int CONSTRUCTOR = 837282306;

        public LoginUrlInfoOpen() {
        }

        public LoginUrlInfoOpen(String var1, boolean var2) {
            this.url = var1;
            this.skipConfirmation = var2;
        }

        public int getConstructor() {
            return 837282306;
        }
    }

    public abstract static class LoginUrlInfo extends TdApi.Object {
        public LoginUrlInfo() {
        }
    }

    public static class LogVerbosityLevel extends TdApi.Object {
        public int verbosityLevel;
        public static final int CONSTRUCTOR = 1734624234;

        public LogVerbosityLevel() {
        }

        public LogVerbosityLevel(int var1) {
            this.verbosityLevel = var1;
        }

        public int getConstructor() {
            return 1734624234;
        }
    }

    public static class LogTags extends TdApi.Object {
        public String[] tags;
        public static final int CONSTRUCTOR = -1604930601;

        public LogTags() {
        }

        public LogTags(String[] var1) {
            this.tags = var1;
        }

        public int getConstructor() {
            return -1604930601;
        }
    }

    public static class LogStreamEmpty extends TdApi.LogStream {
        public static final int CONSTRUCTOR = -499912244;

        public LogStreamEmpty() {
        }

        public int getConstructor() {
            return -499912244;
        }
    }

    public static class LogStreamFile extends TdApi.LogStream {
        public String path;
        public long maxFileSize;
        public boolean redirectStderr;
        public static final int CONSTRUCTOR = 1532136933;

        public LogStreamFile() {
        }

        public LogStreamFile(String var1, long var2, boolean var4) {
            this.path = var1;
            this.maxFileSize = var2;
            this.redirectStderr = var4;
        }

        public int getConstructor() {
            return 1532136933;
        }
    }

    public static class LogStreamDefault extends TdApi.LogStream {
        public static final int CONSTRUCTOR = 1390581436;

        public LogStreamDefault() {
        }

        public int getConstructor() {
            return 1390581436;
        }
    }

    public abstract static class LogStream extends TdApi.Object {
        public LogStream() {
        }
    }

    public static class Location extends TdApi.Object {
        public double latitude;
        public double longitude;
        public double horizontalAccuracy;
        public static final int CONSTRUCTOR = -443392141;

        public Location() {
        }

        public Location(double var1, double var3, double var5) {
            this.latitude = var1;
            this.longitude = var3;
            this.horizontalAccuracy = var5;
        }

        public int getConstructor() {
            return -443392141;
        }
    }

    public static class LocalizationTargetInfo extends TdApi.Object {
        public TdApi.LanguagePackInfo[] languagePacks;
        public static final int CONSTRUCTOR = -2048670809;

        public LocalizationTargetInfo() {
        }

        public LocalizationTargetInfo(TdApi.LanguagePackInfo[] var1) {
            this.languagePacks = var1;
        }

        public int getConstructor() {
            return -2048670809;
        }
    }

    public static class LocalFile extends TdApi.Object {
        public String path;
        public boolean canBeDownloaded;
        public boolean canBeDeleted;
        public boolean isDownloadingActive;
        public boolean isDownloadingCompleted;
        public long downloadOffset;
        public long downloadedPrefixSize;
        public long downloadedSize;
        public static final int CONSTRUCTOR = -1562732153;

        public LocalFile() {
        }

        public LocalFile(String var1, boolean var2, boolean var3, boolean var4, boolean var5, long var6, long var8, long var10) {
            this.path = var1;
            this.canBeDownloaded = var2;
            this.canBeDeleted = var3;
            this.isDownloadingActive = var4;
            this.isDownloadingCompleted = var5;
            this.downloadOffset = var6;
            this.downloadedPrefixSize = var8;
            this.downloadedSize = var10;
        }

        public int getConstructor() {
            return -1562732153;
        }
    }

    public static class LanguagePackStrings extends TdApi.Object {
        public TdApi.LanguagePackString[] strings;
        public static final int CONSTRUCTOR = 1172082922;

        public LanguagePackStrings() {
        }

        public LanguagePackStrings(TdApi.LanguagePackString[] var1) {
            this.strings = var1;
        }

        public int getConstructor() {
            return 1172082922;
        }
    }

    public static class LanguagePackStringValueDeleted extends TdApi.LanguagePackStringValue {
        public static final int CONSTRUCTOR = 1834792698;

        public LanguagePackStringValueDeleted() {
        }

        public int getConstructor() {
            return 1834792698;
        }
    }

    public static class LanguagePackStringValuePluralized extends TdApi.LanguagePackStringValue {
        public String zeroValue;
        public String oneValue;
        public String twoValue;
        public String fewValue;
        public String manyValue;
        public String otherValue;
        public static final int CONSTRUCTOR = 1906840261;

        public LanguagePackStringValuePluralized() {
        }

        public LanguagePackStringValuePluralized(String var1, String var2, String var3, String var4, String var5, String var6) {
            this.zeroValue = var1;
            this.oneValue = var2;
            this.twoValue = var3;
            this.fewValue = var4;
            this.manyValue = var5;
            this.otherValue = var6;
        }

        public int getConstructor() {
            return 1906840261;
        }
    }

    public static class LanguagePackStringValueOrdinary extends TdApi.LanguagePackStringValue {
        public String value;
        public static final int CONSTRUCTOR = -249256352;

        public LanguagePackStringValueOrdinary() {
        }

        public LanguagePackStringValueOrdinary(String var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return -249256352;
        }
    }

    public abstract static class LanguagePackStringValue extends TdApi.Object {
        public LanguagePackStringValue() {
        }
    }

    public static class LanguagePackString extends TdApi.Object {
        public String key;
        public TdApi.LanguagePackStringValue value;
        public static final int CONSTRUCTOR = 1307632736;

        public LanguagePackString() {
        }

        public LanguagePackString(String var1, TdApi.LanguagePackStringValue var2) {
            this.key = var1;
            this.value = var2;
        }

        public int getConstructor() {
            return 1307632736;
        }
    }

    public static class LanguagePackInfo extends TdApi.Object {
        public String id;
        public String baseLanguagePackId;
        public String name;
        public String nativeName;
        public String pluralCode;
        public boolean isOfficial;
        public boolean isRtl;
        public boolean isBeta;
        public boolean isInstalled;
        public int totalStringCount;
        public int translatedStringCount;
        public int localStringCount;
        public String translationUrl;
        public static final int CONSTRUCTOR = 542199642;

        public LanguagePackInfo() {
        }

        public LanguagePackInfo(String var1, String var2, String var3, String var4, String var5, boolean var6, boolean var7, boolean var8, boolean var9, int var10, int var11, int var12, String var13) {
            this.id = var1;
            this.baseLanguagePackId = var2;
            this.name = var3;
            this.nativeName = var4;
            this.pluralCode = var5;
            this.isOfficial = var6;
            this.isRtl = var7;
            this.isBeta = var8;
            this.isInstalled = var9;
            this.totalStringCount = var10;
            this.translatedStringCount = var11;
            this.localStringCount = var12;
            this.translationUrl = var13;
        }

        public int getConstructor() {
            return 542199642;
        }
    }

    public static class LabeledPricePart extends TdApi.Object {
        public String label;
        public long amount;
        public static final int CONSTRUCTOR = 552789798;

        public LabeledPricePart() {
        }

        public LabeledPricePart(String var1, long var2) {
            this.label = var1;
            this.amount = var2;
        }

        public int getConstructor() {
            return 552789798;
        }
    }

    public static class KeyboardButtonTypeWebApp extends TdApi.KeyboardButtonType {
        public String url;
        public static final int CONSTRUCTOR = 1892220770;

        public KeyboardButtonTypeWebApp() {
        }

        public KeyboardButtonTypeWebApp(String var1) {
            this.url = var1;
        }

        public int getConstructor() {
            return 1892220770;
        }
    }

    public static class KeyboardButtonTypeRequestChat extends TdApi.KeyboardButtonType {
        public int id;
        public boolean chatIsChannel;
        public boolean restrictChatIsForum;
        public boolean chatIsForum;
        public boolean restrictChatHasUsername;
        public boolean chatHasUsername;
        public boolean chatIsCreated;
        public TdApi.ChatAdministratorRights userAdministratorRights;
        public TdApi.ChatAdministratorRights botAdministratorRights;
        public boolean botIsMember;
        public static final int CONSTRUCTOR = 272541602;

        public KeyboardButtonTypeRequestChat() {
        }

        public KeyboardButtonTypeRequestChat(int var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, TdApi.ChatAdministratorRights var8, TdApi.ChatAdministratorRights var9, boolean var10) {
            this.id = var1;
            this.chatIsChannel = var2;
            this.restrictChatIsForum = var3;
            this.chatIsForum = var4;
            this.restrictChatHasUsername = var5;
            this.chatHasUsername = var6;
            this.chatIsCreated = var7;
            this.userAdministratorRights = var8;
            this.botAdministratorRights = var9;
            this.botIsMember = var10;
        }

        public int getConstructor() {
            return 272541602;
        }
    }

    public static class KeyboardButtonTypeRequestUser extends TdApi.KeyboardButtonType {
        public int id;
        public boolean restrictUserIsBot;
        public boolean userIsBot;
        public boolean restrictUserIsPremium;
        public boolean userIsPremium;
        public static final int CONSTRUCTOR = -1996508112;

        public KeyboardButtonTypeRequestUser() {
        }

        public KeyboardButtonTypeRequestUser(int var1, boolean var2, boolean var3, boolean var4, boolean var5) {
            this.id = var1;
            this.restrictUserIsBot = var2;
            this.userIsBot = var3;
            this.restrictUserIsPremium = var4;
            this.userIsPremium = var5;
        }

        public int getConstructor() {
            return -1996508112;
        }
    }

    public static class KeyboardButtonTypeRequestPoll extends TdApi.KeyboardButtonType {
        public boolean forceRegular;
        public boolean forceQuiz;
        public static final int CONSTRUCTOR = 1902435512;

        public KeyboardButtonTypeRequestPoll() {
        }

        public KeyboardButtonTypeRequestPoll(boolean var1, boolean var2) {
            this.forceRegular = var1;
            this.forceQuiz = var2;
        }

        public int getConstructor() {
            return 1902435512;
        }
    }

    public static class KeyboardButtonTypeRequestLocation extends TdApi.KeyboardButtonType {
        public static final int CONSTRUCTOR = -125661955;

        public KeyboardButtonTypeRequestLocation() {
        }

        public int getConstructor() {
            return -125661955;
        }
    }

    public static class KeyboardButtonTypeRequestPhoneNumber extends TdApi.KeyboardButtonType {
        public static final int CONSTRUCTOR = -1529235527;

        public KeyboardButtonTypeRequestPhoneNumber() {
        }

        public int getConstructor() {
            return -1529235527;
        }
    }

    public static class KeyboardButtonTypeText extends TdApi.KeyboardButtonType {
        public static final int CONSTRUCTOR = -1773037256;

        public KeyboardButtonTypeText() {
        }

        public int getConstructor() {
            return -1773037256;
        }
    }

    public abstract static class KeyboardButtonType extends TdApi.Object {
        public KeyboardButtonType() {
        }
    }

    public static class KeyboardButton extends TdApi.Object {
        public String text;
        public TdApi.KeyboardButtonType type;
        public static final int CONSTRUCTOR = -2069836172;

        public KeyboardButton() {
        }

        public KeyboardButton(String var1, TdApi.KeyboardButtonType var2) {
            this.text = var1;
            this.type = var2;
        }

        public int getConstructor() {
            return -2069836172;
        }
    }

    public static class JsonValueObject extends TdApi.JsonValue {
        public TdApi.JsonObjectMember[] members;
        public static final int CONSTRUCTOR = 520252026;

        public JsonValueObject() {
        }

        public JsonValueObject(TdApi.JsonObjectMember[] var1) {
            this.members = var1;
        }

        public int getConstructor() {
            return 520252026;
        }
    }

    public static class JsonValueArray extends TdApi.JsonValue {
        public TdApi.JsonValue[] values;
        public static final int CONSTRUCTOR = -183913546;

        public JsonValueArray() {
        }

        public JsonValueArray(TdApi.JsonValue[] var1) {
            this.values = var1;
        }

        public int getConstructor() {
            return -183913546;
        }
    }

    public static class JsonValueString extends TdApi.JsonValue {
        public String value;
        public static final int CONSTRUCTOR = 1597947313;

        public JsonValueString() {
        }

        public JsonValueString(String var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return 1597947313;
        }
    }

    public static class JsonValueNumber extends TdApi.JsonValue {
        public double value;
        public static final int CONSTRUCTOR = -1010822033;

        public JsonValueNumber() {
        }

        public JsonValueNumber(double var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return -1010822033;
        }
    }

    public static class JsonValueBoolean extends TdApi.JsonValue {
        public boolean value;
        public static final int CONSTRUCTOR = -2142186576;

        public JsonValueBoolean() {
        }

        public JsonValueBoolean(boolean var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return -2142186576;
        }
    }

    public static class JsonValueNull extends TdApi.JsonValue {
        public static final int CONSTRUCTOR = -92872499;

        public JsonValueNull() {
        }

        public int getConstructor() {
            return -92872499;
        }
    }

    public abstract static class JsonValue extends TdApi.Object {
        public JsonValue() {
        }
    }

    public static class JsonObjectMember extends TdApi.Object {
        public String key;
        public TdApi.JsonValue value;
        public static final int CONSTRUCTOR = -1803309418;

        public JsonObjectMember() {
        }

        public JsonObjectMember(String var1, TdApi.JsonValue var2) {
            this.key = var1;
            this.value = var2;
        }

        public int getConstructor() {
            return -1803309418;
        }
    }

    public static class Invoice extends TdApi.Object {
        public String currency;
        public TdApi.LabeledPricePart[] priceParts;
        public long maxTipAmount;
        public long[] suggestedTipAmounts;
        public String recurringPaymentTermsOfServiceUrl;
        public boolean isTest;
        public boolean needName;
        public boolean needPhoneNumber;
        public boolean needEmailAddress;
        public boolean needShippingAddress;
        public boolean sendPhoneNumberToProvider;
        public boolean sendEmailAddressToProvider;
        public boolean isFlexible;
        public static final int CONSTRUCTOR = 1977205639;

        public Invoice() {
        }

        public Invoice(String var1, TdApi.LabeledPricePart[] var2, long var3, long[] var5, String var6, boolean var7, boolean var8, boolean var9, boolean var10, boolean var11, boolean var12, boolean var13, boolean var14) {
            this.currency = var1;
            this.priceParts = var2;
            this.maxTipAmount = var3;
            this.suggestedTipAmounts = var5;
            this.recurringPaymentTermsOfServiceUrl = var6;
            this.isTest = var7;
            this.needName = var8;
            this.needPhoneNumber = var9;
            this.needEmailAddress = var10;
            this.needShippingAddress = var11;
            this.sendPhoneNumberToProvider = var12;
            this.sendEmailAddressToProvider = var13;
            this.isFlexible = var14;
        }

        public int getConstructor() {
            return 1977205639;
        }
    }

    public static class InternalLinkTypeWebApp extends TdApi.InternalLinkType {
        public String botUsername;
        public String webAppShortName;
        public String startParameter;
        public static final int CONSTRUCTOR = -57094065;

        public InternalLinkTypeWebApp() {
        }

        public InternalLinkTypeWebApp(String var1, String var2, String var3) {
            this.botUsername = var1;
            this.webAppShortName = var2;
            this.startParameter = var3;
        }

        public int getConstructor() {
            return -57094065;
        }
    }

    public static class InternalLinkTypeVideoChat extends TdApi.InternalLinkType {
        public String chatUsername;
        public String inviteHash;
        public boolean isLiveStream;
        public static final int CONSTRUCTOR = -2020149068;

        public InternalLinkTypeVideoChat() {
        }

        public InternalLinkTypeVideoChat(String var1, String var2, boolean var3) {
            this.chatUsername = var1;
            this.inviteHash = var2;
            this.isLiveStream = var3;
        }

        public int getConstructor() {
            return -2020149068;
        }
    }

    public static class InternalLinkTypeUserToken extends TdApi.InternalLinkType {
        public String token;
        public static final int CONSTRUCTOR = -1462248615;

        public InternalLinkTypeUserToken() {
        }

        public InternalLinkTypeUserToken(String var1) {
            this.token = var1;
        }

        public int getConstructor() {
            return -1462248615;
        }
    }

    public static class InternalLinkTypeUserPhoneNumber extends TdApi.InternalLinkType {
        public String phoneNumber;
        public static final int CONSTRUCTOR = -1955751319;

        public InternalLinkTypeUserPhoneNumber() {
        }

        public InternalLinkTypeUserPhoneNumber(String var1) {
            this.phoneNumber = var1;
        }

        public int getConstructor() {
            return -1955751319;
        }
    }

    public static class InternalLinkTypeUnsupportedProxy extends TdApi.InternalLinkType {
        public static final int CONSTRUCTOR = -566649079;

        public InternalLinkTypeUnsupportedProxy() {
        }

        public int getConstructor() {
            return -566649079;
        }
    }

    public static class InternalLinkTypeUnknownDeepLink extends TdApi.InternalLinkType {
        public String link;
        public static final int CONSTRUCTOR = 625596379;

        public InternalLinkTypeUnknownDeepLink() {
        }

        public InternalLinkTypeUnknownDeepLink(String var1) {
            this.link = var1;
        }

        public int getConstructor() {
            return 625596379;
        }
    }

    public static class InternalLinkTypeThemeSettings extends TdApi.InternalLinkType {
        public static final int CONSTRUCTOR = -1051903722;

        public InternalLinkTypeThemeSettings() {
        }

        public int getConstructor() {
            return -1051903722;
        }
    }

    public static class InternalLinkTypeTheme extends TdApi.InternalLinkType {
        public String themeName;
        public static final int CONSTRUCTOR = -200935417;

        public InternalLinkTypeTheme() {
        }

        public InternalLinkTypeTheme(String var1) {
            this.themeName = var1;
        }

        public int getConstructor() {
            return -200935417;
        }
    }

    public static class InternalLinkTypeStory extends TdApi.InternalLinkType {
        public String storySenderUsername;
        public int storyId;
        public static final int CONSTRUCTOR = 1471997511;

        public InternalLinkTypeStory() {
        }

        public InternalLinkTypeStory(String var1, int var2) {
            this.storySenderUsername = var1;
            this.storyId = var2;
        }

        public int getConstructor() {
            return 1471997511;
        }
    }

    public static class InternalLinkTypeStickerSet extends TdApi.InternalLinkType {
        public String stickerSetName;
        public boolean expectCustomEmoji;
        public static final int CONSTRUCTOR = -1589227614;

        public InternalLinkTypeStickerSet() {
        }

        public InternalLinkTypeStickerSet(String var1, boolean var2) {
            this.stickerSetName = var1;
            this.expectCustomEmoji = var2;
        }

        public int getConstructor() {
            return -1589227614;
        }
    }

    public static class InternalLinkTypeSettings extends TdApi.InternalLinkType {
        public static final int CONSTRUCTOR = 393561524;

        public InternalLinkTypeSettings() {
        }

        public int getConstructor() {
            return 393561524;
        }
    }

    public static class InternalLinkTypeRestorePurchases extends TdApi.InternalLinkType {
        public static final int CONSTRUCTOR = 606090371;

        public InternalLinkTypeRestorePurchases() {
        }

        public int getConstructor() {
            return 606090371;
        }
    }

    public static class InternalLinkTypeQrCodeAuthentication extends TdApi.InternalLinkType {
        public static final int CONSTRUCTOR = -1089332956;

        public InternalLinkTypeQrCodeAuthentication() {
        }

        public int getConstructor() {
            return -1089332956;
        }
    }

    public static class InternalLinkTypePublicChat extends TdApi.InternalLinkType {
        public String chatUsername;
        public static final int CONSTRUCTOR = -1485547717;

        public InternalLinkTypePublicChat() {
        }

        public InternalLinkTypePublicChat(String var1) {
            this.chatUsername = var1;
        }

        public int getConstructor() {
            return -1485547717;
        }
    }

    public static class InternalLinkTypeProxy extends TdApi.InternalLinkType {
        public String server;
        public int port;
        public TdApi.ProxyType type;
        public static final int CONSTRUCTOR = -1313788694;

        public InternalLinkTypeProxy() {
        }

        public InternalLinkTypeProxy(String var1, int var2, TdApi.ProxyType var3) {
            this.server = var1;
            this.port = var2;
            this.type = var3;
        }

        public int getConstructor() {
            return -1313788694;
        }
    }

    public static class InternalLinkTypePrivacyAndSecuritySettings extends TdApi.InternalLinkType {
        public static final int CONSTRUCTOR = -1386255665;

        public InternalLinkTypePrivacyAndSecuritySettings() {
        }

        public int getConstructor() {
            return -1386255665;
        }
    }

    public static class InternalLinkTypePremiumFeatures extends TdApi.InternalLinkType {
        public String referrer;
        public static final int CONSTRUCTOR = 1216892745;

        public InternalLinkTypePremiumFeatures() {
        }

        public InternalLinkTypePremiumFeatures(String var1) {
            this.referrer = var1;
        }

        public int getConstructor() {
            return 1216892745;
        }
    }

    public static class InternalLinkTypePhoneNumberConfirmation extends TdApi.InternalLinkType {
        public String hash;
        public String phoneNumber;
        public static final int CONSTRUCTOR = 1757375254;

        public InternalLinkTypePhoneNumberConfirmation() {
        }

        public InternalLinkTypePhoneNumberConfirmation(String var1, String var2) {
            this.hash = var1;
            this.phoneNumber = var2;
        }

        public int getConstructor() {
            return 1757375254;
        }
    }

    public static class InternalLinkTypePassportDataRequest extends TdApi.InternalLinkType {
        public long botUserId;
        public String scope;
        public String publicKey;
        public String nonce;
        public String callbackUrl;
        public static final int CONSTRUCTOR = -988819839;

        public InternalLinkTypePassportDataRequest() {
        }

        public InternalLinkTypePassportDataRequest(long var1, String var3, String var4, String var5, String var6) {
            this.botUserId = var1;
            this.scope = var3;
            this.publicKey = var4;
            this.nonce = var5;
            this.callbackUrl = var6;
        }

        public int getConstructor() {
            return -988819839;
        }
    }

    public static class InternalLinkTypeMessageDraft extends TdApi.InternalLinkType {
        public TdApi.FormattedText text;
        public boolean containsLink;
        public static final int CONSTRUCTOR = 661633749;

        public InternalLinkTypeMessageDraft() {
        }

        public InternalLinkTypeMessageDraft(TdApi.FormattedText var1, boolean var2) {
            this.text = var1;
            this.containsLink = var2;
        }

        public int getConstructor() {
            return 661633749;
        }
    }

    public static class InternalLinkTypeMessage extends TdApi.InternalLinkType {
        public String url;
        public static final int CONSTRUCTOR = 978541650;

        public InternalLinkTypeMessage() {
        }

        public InternalLinkTypeMessage(String var1) {
            this.url = var1;
        }

        public int getConstructor() {
            return 978541650;
        }
    }

    public static class InternalLinkTypeLanguageSettings extends TdApi.InternalLinkType {
        public static final int CONSTRUCTOR = -1340479770;

        public InternalLinkTypeLanguageSettings() {
        }

        public int getConstructor() {
            return -1340479770;
        }
    }

    public static class InternalLinkTypeLanguagePack extends TdApi.InternalLinkType {
        public String languagePackId;
        public static final int CONSTRUCTOR = -1450766996;

        public InternalLinkTypeLanguagePack() {
        }

        public InternalLinkTypeLanguagePack(String var1) {
            this.languagePackId = var1;
        }

        public int getConstructor() {
            return -1450766996;
        }
    }

    public static class InternalLinkTypeInvoice extends TdApi.InternalLinkType {
        public String invoiceName;
        public static final int CONSTRUCTOR = -213094996;

        public InternalLinkTypeInvoice() {
        }

        public InternalLinkTypeInvoice(String var1) {
            this.invoiceName = var1;
        }

        public int getConstructor() {
            return -213094996;
        }
    }

    public static class InternalLinkTypeInstantView extends TdApi.InternalLinkType {
        public String url;
        public String fallbackUrl;
        public static final int CONSTRUCTOR = 1776607039;

        public InternalLinkTypeInstantView() {
        }

        public InternalLinkTypeInstantView(String var1, String var2) {
            this.url = var1;
            this.fallbackUrl = var2;
        }

        public int getConstructor() {
            return 1776607039;
        }
    }

    public static class InternalLinkTypeGame extends TdApi.InternalLinkType {
        public String botUsername;
        public String gameShortName;
        public static final int CONSTRUCTOR = -260788787;

        public InternalLinkTypeGame() {
        }

        public InternalLinkTypeGame(String var1, String var2) {
            this.botUsername = var1;
            this.gameShortName = var2;
        }

        public int getConstructor() {
            return -260788787;
        }
    }

    public static class InternalLinkTypeEditProfileSettings extends TdApi.InternalLinkType {
        public static final int CONSTRUCTOR = -1022472090;

        public InternalLinkTypeEditProfileSettings() {
        }

        public int getConstructor() {
            return -1022472090;
        }
    }

    public static class InternalLinkTypeDefaultMessageAutoDeleteTimerSettings extends TdApi.InternalLinkType {
        public static final int CONSTRUCTOR = 732625201;

        public InternalLinkTypeDefaultMessageAutoDeleteTimerSettings() {
        }

        public int getConstructor() {
            return 732625201;
        }
    }

    public static class InternalLinkTypeChatInvite extends TdApi.InternalLinkType {
        public String inviteLink;
        public static final int CONSTRUCTOR = 428621017;

        public InternalLinkTypeChatInvite() {
        }

        public InternalLinkTypeChatInvite(String var1) {
            this.inviteLink = var1;
        }

        public int getConstructor() {
            return 428621017;
        }
    }

    public static class InternalLinkTypeChatFolderSettings extends TdApi.InternalLinkType {
        public static final int CONSTRUCTOR = -1073805988;

        public InternalLinkTypeChatFolderSettings() {
        }

        public int getConstructor() {
            return -1073805988;
        }
    }

    public static class InternalLinkTypeChatFolderInvite extends TdApi.InternalLinkType {
        public String inviteLink;
        public static final int CONSTRUCTOR = -1984804546;

        public InternalLinkTypeChatFolderInvite() {
        }

        public InternalLinkTypeChatFolderInvite(String var1) {
            this.inviteLink = var1;
        }

        public int getConstructor() {
            return -1984804546;
        }
    }

    public static class InternalLinkTypeChangePhoneNumber extends TdApi.InternalLinkType {
        public static final int CONSTRUCTOR = -265856255;

        public InternalLinkTypeChangePhoneNumber() {
        }

        public int getConstructor() {
            return -265856255;
        }
    }

    public static class InternalLinkTypeBotStartInGroup extends TdApi.InternalLinkType {
        public String botUsername;
        public String startParameter;
        public TdApi.ChatAdministratorRights administratorRights;
        public static final int CONSTRUCTOR = -905081650;

        public InternalLinkTypeBotStartInGroup() {
        }

        public InternalLinkTypeBotStartInGroup(String var1, String var2, TdApi.ChatAdministratorRights var3) {
            this.botUsername = var1;
            this.startParameter = var2;
            this.administratorRights = var3;
        }

        public int getConstructor() {
            return -905081650;
        }
    }

    public static class InternalLinkTypeBotStart extends TdApi.InternalLinkType {
        public String botUsername;
        public String startParameter;
        public boolean autostart;
        public static final int CONSTRUCTOR = 1066950637;

        public InternalLinkTypeBotStart() {
        }

        public InternalLinkTypeBotStart(String var1, String var2, boolean var3) {
            this.botUsername = var1;
            this.startParameter = var2;
            this.autostart = var3;
        }

        public int getConstructor() {
            return 1066950637;
        }
    }

    public static class InternalLinkTypeBotAddToChannel extends TdApi.InternalLinkType {
        public String botUsername;
        public TdApi.ChatAdministratorRights administratorRights;
        public static final int CONSTRUCTOR = 1401602752;

        public InternalLinkTypeBotAddToChannel() {
        }

        public InternalLinkTypeBotAddToChannel(String var1, TdApi.ChatAdministratorRights var2) {
            this.botUsername = var1;
            this.administratorRights = var2;
        }

        public int getConstructor() {
            return 1401602752;
        }
    }

    public static class InternalLinkTypeBackground extends TdApi.InternalLinkType {
        public String backgroundName;
        public static final int CONSTRUCTOR = 185411848;

        public InternalLinkTypeBackground() {
        }

        public InternalLinkTypeBackground(String var1) {
            this.backgroundName = var1;
        }

        public int getConstructor() {
            return 185411848;
        }
    }

    public static class InternalLinkTypeAuthenticationCode extends TdApi.InternalLinkType {
        public String code;
        public static final int CONSTRUCTOR = -209235982;

        public InternalLinkTypeAuthenticationCode() {
        }

        public InternalLinkTypeAuthenticationCode(String var1) {
            this.code = var1;
        }

        public int getConstructor() {
            return -209235982;
        }
    }

    public static class InternalLinkTypeAttachmentMenuBot extends TdApi.InternalLinkType {
        public TdApi.TargetChat targetChat;
        public String botUsername;
        public String url;
        public static final int CONSTRUCTOR = 1682719269;

        public InternalLinkTypeAttachmentMenuBot() {
        }

        public InternalLinkTypeAttachmentMenuBot(TdApi.TargetChat var1, String var2, String var3) {
            this.targetChat = var1;
            this.botUsername = var2;
            this.url = var3;
        }

        public int getConstructor() {
            return 1682719269;
        }
    }

    public static class InternalLinkTypeActiveSessions extends TdApi.InternalLinkType {
        public static final int CONSTRUCTOR = 1886108589;

        public InternalLinkTypeActiveSessions() {
        }

        public int getConstructor() {
            return 1886108589;
        }
    }

    public abstract static class InternalLinkType extends TdApi.Object {
        public InternalLinkType() {
        }
    }

    public static class InputThumbnail extends TdApi.Object {
        public TdApi.InputFile thumbnail;
        public int width;
        public int height;
        public static final int CONSTRUCTOR = 1582387236;

        public InputThumbnail() {
        }

        public InputThumbnail(TdApi.InputFile var1, int var2, int var3) {
            this.thumbnail = var1;
            this.width = var2;
            this.height = var3;
        }

        public int getConstructor() {
            return 1582387236;
        }
    }

    public static class InputStoryContentVideo extends TdApi.InputStoryContent {
        public TdApi.InputFile video;
        public int[] addedStickerFileIds;
        public double duration;
        public boolean isAnimation;
        public static final int CONSTRUCTOR = -738542773;

        public InputStoryContentVideo() {
        }

        public InputStoryContentVideo(TdApi.InputFile var1, int[] var2, double var3, boolean var5) {
            this.video = var1;
            this.addedStickerFileIds = var2;
            this.duration = var3;
            this.isAnimation = var5;
        }

        public int getConstructor() {
            return -738542773;
        }
    }

    public static class InputStoryContentPhoto extends TdApi.InputStoryContent {
        public TdApi.InputFile photo;
        public int[] addedStickerFileIds;
        public static final int CONSTRUCTOR = -309196727;

        public InputStoryContentPhoto() {
        }

        public InputStoryContentPhoto(TdApi.InputFile var1, int[] var2) {
            this.photo = var1;
            this.addedStickerFileIds = var2;
        }

        public int getConstructor() {
            return -309196727;
        }
    }

    public abstract static class InputStoryContent extends TdApi.Object {
        public InputStoryContent() {
        }
    }

    public static class InputStoryAreas extends TdApi.Object {
        public TdApi.InputStoryArea[] areas;
        public static final int CONSTRUCTOR = -883247088;

        public InputStoryAreas() {
        }

        public InputStoryAreas(TdApi.InputStoryArea[] var1) {
            this.areas = var1;
        }

        public int getConstructor() {
            return -883247088;
        }
    }

    public static class InputStoryAreaTypePreviousVenue extends TdApi.InputStoryAreaType {
        public String venueProvider;
        public String venueId;
        public static final int CONSTRUCTOR = 1846693388;

        public InputStoryAreaTypePreviousVenue() {
        }

        public InputStoryAreaTypePreviousVenue(String var1, String var2) {
            this.venueProvider = var1;
            this.venueId = var2;
        }

        public int getConstructor() {
            return 1846693388;
        }
    }

    public static class InputStoryAreaTypeFoundVenue extends TdApi.InputStoryAreaType {
        public long queryId;
        public String resultId;
        public static final int CONSTRUCTOR = -1395809130;

        public InputStoryAreaTypeFoundVenue() {
        }

        public InputStoryAreaTypeFoundVenue(long var1, String var3) {
            this.queryId = var1;
            this.resultId = var3;
        }

        public int getConstructor() {
            return -1395809130;
        }
    }

    public static class InputStoryAreaTypeLocation extends TdApi.InputStoryAreaType {
        public TdApi.Location location;
        public static final int CONSTRUCTOR = 1749669730;

        public InputStoryAreaTypeLocation() {
        }

        public InputStoryAreaTypeLocation(TdApi.Location var1) {
            this.location = var1;
        }

        public int getConstructor() {
            return 1749669730;
        }
    }

    public abstract static class InputStoryAreaType extends TdApi.Object {
        public InputStoryAreaType() {
        }
    }

    public static class InputStoryArea extends TdApi.Object {
        public TdApi.StoryAreaPosition position;
        public TdApi.InputStoryAreaType type;
        public static final int CONSTRUCTOR = 122859135;

        public InputStoryArea() {
        }

        public InputStoryArea(TdApi.StoryAreaPosition var1, TdApi.InputStoryAreaType var2) {
            this.position = var1;
            this.type = var2;
        }

        public int getConstructor() {
            return 122859135;
        }
    }

    public static class InputSticker extends TdApi.Object {
        public TdApi.InputFile sticker;
        public String emojis;
        public TdApi.MaskPosition maskPosition;
        public String[] keywords;
        public static final int CONSTRUCTOR = 735226185;

        public InputSticker() {
        }

        public InputSticker(TdApi.InputFile var1, String var2, TdApi.MaskPosition var3, String[] var4) {
            this.sticker = var1;
            this.emojis = var2;
            this.maskPosition = var3;
            this.keywords = var4;
        }

        public int getConstructor() {
            return 735226185;
        }
    }

    public static class InputPersonalDocument extends TdApi.Object {
        public TdApi.InputFile[] files;
        public TdApi.InputFile[] translation;
        public static final int CONSTRUCTOR = 1676966826;

        public InputPersonalDocument() {
        }

        public InputPersonalDocument(TdApi.InputFile[] var1, TdApi.InputFile[] var2) {
            this.files = var1;
            this.translation = var2;
        }

        public int getConstructor() {
            return 1676966826;
        }
    }

    public static class InputPassportElementErrorSourceFiles extends TdApi.InputPassportElementErrorSource {
        public byte[][] fileHashes;
        public static final int CONSTRUCTOR = -2008541640;

        public InputPassportElementErrorSourceFiles() {
        }

        public InputPassportElementErrorSourceFiles(byte[][] var1) {
            this.fileHashes = var1;
        }

        public int getConstructor() {
            return -2008541640;
        }
    }

    public static class InputPassportElementErrorSourceFile extends TdApi.InputPassportElementErrorSource {
        public byte[] fileHash;
        public static final int CONSTRUCTOR = -298492469;

        public InputPassportElementErrorSourceFile() {
        }

        public InputPassportElementErrorSourceFile(byte[] var1) {
            this.fileHash = var1;
        }

        public int getConstructor() {
            return -298492469;
        }
    }

    public static class InputPassportElementErrorSourceTranslationFiles extends TdApi.InputPassportElementErrorSource {
        public byte[][] fileHashes;
        public static final int CONSTRUCTOR = -527254048;

        public InputPassportElementErrorSourceTranslationFiles() {
        }

        public InputPassportElementErrorSourceTranslationFiles(byte[][] var1) {
            this.fileHashes = var1;
        }

        public int getConstructor() {
            return -527254048;
        }
    }

    public static class InputPassportElementErrorSourceTranslationFile extends TdApi.InputPassportElementErrorSource {
        public byte[] fileHash;
        public static final int CONSTRUCTOR = 505842299;

        public InputPassportElementErrorSourceTranslationFile() {
        }

        public InputPassportElementErrorSourceTranslationFile(byte[] var1) {
            this.fileHash = var1;
        }

        public int getConstructor() {
            return 505842299;
        }
    }

    public static class InputPassportElementErrorSourceSelfie extends TdApi.InputPassportElementErrorSource {
        public byte[] fileHash;
        public static final int CONSTRUCTOR = -773575528;

        public InputPassportElementErrorSourceSelfie() {
        }

        public InputPassportElementErrorSourceSelfie(byte[] var1) {
            this.fileHash = var1;
        }

        public int getConstructor() {
            return -773575528;
        }
    }

    public static class InputPassportElementErrorSourceReverseSide extends TdApi.InputPassportElementErrorSource {
        public byte[] fileHash;
        public static final int CONSTRUCTOR = 413072891;

        public InputPassportElementErrorSourceReverseSide() {
        }

        public InputPassportElementErrorSourceReverseSide(byte[] var1) {
            this.fileHash = var1;
        }

        public int getConstructor() {
            return 413072891;
        }
    }

    public static class InputPassportElementErrorSourceFrontSide extends TdApi.InputPassportElementErrorSource {
        public byte[] fileHash;
        public static final int CONSTRUCTOR = 588023741;

        public InputPassportElementErrorSourceFrontSide() {
        }

        public InputPassportElementErrorSourceFrontSide(byte[] var1) {
            this.fileHash = var1;
        }

        public int getConstructor() {
            return 588023741;
        }
    }

    public static class InputPassportElementErrorSourceDataField extends TdApi.InputPassportElementErrorSource {
        public String fieldName;
        public byte[] dataHash;
        public static final int CONSTRUCTOR = -426795002;

        public InputPassportElementErrorSourceDataField() {
        }

        public InputPassportElementErrorSourceDataField(String var1, byte[] var2) {
            this.fieldName = var1;
            this.dataHash = var2;
        }

        public int getConstructor() {
            return -426795002;
        }
    }

    public static class InputPassportElementErrorSourceUnspecified extends TdApi.InputPassportElementErrorSource {
        public byte[] elementHash;
        public static final int CONSTRUCTOR = 267230319;

        public InputPassportElementErrorSourceUnspecified() {
        }

        public InputPassportElementErrorSourceUnspecified(byte[] var1) {
            this.elementHash = var1;
        }

        public int getConstructor() {
            return 267230319;
        }
    }

    public abstract static class InputPassportElementErrorSource extends TdApi.Object {
        public InputPassportElementErrorSource() {
        }
    }

    public static class InputPassportElementError extends TdApi.Object {
        public TdApi.PassportElementType type;
        public String message;
        public TdApi.InputPassportElementErrorSource source;
        public static final int CONSTRUCTOR = 285756898;

        public InputPassportElementError() {
        }

        public InputPassportElementError(TdApi.PassportElementType var1, String var2, TdApi.InputPassportElementErrorSource var3) {
            this.type = var1;
            this.message = var2;
            this.source = var3;
        }

        public int getConstructor() {
            return 285756898;
        }
    }

    public static class InputPassportElementEmailAddress extends TdApi.InputPassportElement {
        public String emailAddress;
        public static final int CONSTRUCTOR = -248605659;

        public InputPassportElementEmailAddress() {
        }

        public InputPassportElementEmailAddress(String var1) {
            this.emailAddress = var1;
        }

        public int getConstructor() {
            return -248605659;
        }
    }

    public static class InputPassportElementPhoneNumber extends TdApi.InputPassportElement {
        public String phoneNumber;
        public static final int CONSTRUCTOR = 1319357497;

        public InputPassportElementPhoneNumber() {
        }

        public InputPassportElementPhoneNumber(String var1) {
            this.phoneNumber = var1;
        }

        public int getConstructor() {
            return 1319357497;
        }
    }

    public static class InputPassportElementTemporaryRegistration extends TdApi.InputPassportElement {
        public TdApi.InputPersonalDocument temporaryRegistration;
        public static final int CONSTRUCTOR = -1913238047;

        public InputPassportElementTemporaryRegistration() {
        }

        public InputPassportElementTemporaryRegistration(TdApi.InputPersonalDocument var1) {
            this.temporaryRegistration = var1;
        }

        public int getConstructor() {
            return -1913238047;
        }
    }

    public static class InputPassportElementPassportRegistration extends TdApi.InputPassportElement {
        public TdApi.InputPersonalDocument passportRegistration;
        public static final int CONSTRUCTOR = 1314562128;

        public InputPassportElementPassportRegistration() {
        }

        public InputPassportElementPassportRegistration(TdApi.InputPersonalDocument var1) {
            this.passportRegistration = var1;
        }

        public int getConstructor() {
            return 1314562128;
        }
    }

    public static class InputPassportElementRentalAgreement extends TdApi.InputPassportElement {
        public TdApi.InputPersonalDocument rentalAgreement;
        public static final int CONSTRUCTOR = 1736154155;

        public InputPassportElementRentalAgreement() {
        }

        public InputPassportElementRentalAgreement(TdApi.InputPersonalDocument var1) {
            this.rentalAgreement = var1;
        }

        public int getConstructor() {
            return 1736154155;
        }
    }

    public static class InputPassportElementBankStatement extends TdApi.InputPassportElement {
        public TdApi.InputPersonalDocument bankStatement;
        public static final int CONSTRUCTOR = -26585208;

        public InputPassportElementBankStatement() {
        }

        public InputPassportElementBankStatement(TdApi.InputPersonalDocument var1) {
            this.bankStatement = var1;
        }

        public int getConstructor() {
            return -26585208;
        }
    }

    public static class InputPassportElementUtilityBill extends TdApi.InputPassportElement {
        public TdApi.InputPersonalDocument utilityBill;
        public static final int CONSTRUCTOR = 1389203841;

        public InputPassportElementUtilityBill() {
        }

        public InputPassportElementUtilityBill(TdApi.InputPersonalDocument var1) {
            this.utilityBill = var1;
        }

        public int getConstructor() {
            return 1389203841;
        }
    }

    public static class InputPassportElementAddress extends TdApi.InputPassportElement {
        public TdApi.Address address;
        public static final int CONSTRUCTOR = 461630480;

        public InputPassportElementAddress() {
        }

        public InputPassportElementAddress(TdApi.Address var1) {
            this.address = var1;
        }

        public int getConstructor() {
            return 461630480;
        }
    }

    public static class InputPassportElementInternalPassport extends TdApi.InputPassportElement {
        public TdApi.InputIdentityDocument internalPassport;
        public static final int CONSTRUCTOR = 715360043;

        public InputPassportElementInternalPassport() {
        }

        public InputPassportElementInternalPassport(TdApi.InputIdentityDocument var1) {
            this.internalPassport = var1;
        }

        public int getConstructor() {
            return 715360043;
        }
    }

    public static class InputPassportElementIdentityCard extends TdApi.InputPassportElement {
        public TdApi.InputIdentityDocument identityCard;
        public static final int CONSTRUCTOR = -9963390;

        public InputPassportElementIdentityCard() {
        }

        public InputPassportElementIdentityCard(TdApi.InputIdentityDocument var1) {
            this.identityCard = var1;
        }

        public int getConstructor() {
            return -9963390;
        }
    }

    public static class InputPassportElementDriverLicense extends TdApi.InputPassportElement {
        public TdApi.InputIdentityDocument driverLicense;
        public static final int CONSTRUCTOR = 304813264;

        public InputPassportElementDriverLicense() {
        }

        public InputPassportElementDriverLicense(TdApi.InputIdentityDocument var1) {
            this.driverLicense = var1;
        }

        public int getConstructor() {
            return 304813264;
        }
    }

    public static class InputPassportElementPassport extends TdApi.InputPassportElement {
        public TdApi.InputIdentityDocument passport;
        public static final int CONSTRUCTOR = -497011356;

        public InputPassportElementPassport() {
        }

        public InputPassportElementPassport(TdApi.InputIdentityDocument var1) {
            this.passport = var1;
        }

        public int getConstructor() {
            return -497011356;
        }
    }

    public static class InputPassportElementPersonalDetails extends TdApi.InputPassportElement {
        public TdApi.PersonalDetails personalDetails;
        public static final int CONSTRUCTOR = 164791359;

        public InputPassportElementPersonalDetails() {
        }

        public InputPassportElementPersonalDetails(TdApi.PersonalDetails var1) {
            this.personalDetails = var1;
        }

        public int getConstructor() {
            return 164791359;
        }
    }

    public abstract static class InputPassportElement extends TdApi.Object {
        public InputPassportElement() {
        }
    }

    public static class InputMessageForwarded extends TdApi.InputMessageContent {
        public long fromChatId;
        public long messageId;
        public boolean inGameShare;
        public TdApi.MessageCopyOptions copyOptions;
        public static final int CONSTRUCTOR = 1696232440;

        public InputMessageForwarded() {
        }

        public InputMessageForwarded(long var1, long var3, boolean var5, TdApi.MessageCopyOptions var6) {
            this.fromChatId = var1;
            this.messageId = var3;
            this.inGameShare = var5;
            this.copyOptions = var6;
        }

        public int getConstructor() {
            return 1696232440;
        }
    }

    public static class InputMessageStory extends TdApi.InputMessageContent {
        public long storySenderChatId;
        public int storyId;
        public static final int CONSTRUCTOR = 554278243;

        public InputMessageStory() {
        }

        public InputMessageStory(long var1, int var3) {
            this.storySenderChatId = var1;
            this.storyId = var3;
        }

        public int getConstructor() {
            return 554278243;
        }
    }

    public static class InputMessagePoll extends TdApi.InputMessageContent {
        public String question;
        public String[] options;
        public boolean isAnonymous;
        public TdApi.PollType type;
        public int openPeriod;
        public int closeDate;
        public boolean isClosed;
        public static final int CONSTRUCTOR = 2054629900;

        public InputMessagePoll() {
        }

        public InputMessagePoll(String var1, String[] var2, boolean var3, TdApi.PollType var4, int var5, int var6, boolean var7) {
            this.question = var1;
            this.options = var2;
            this.isAnonymous = var3;
            this.type = var4;
            this.openPeriod = var5;
            this.closeDate = var6;
            this.isClosed = var7;
        }

        public int getConstructor() {
            return 2054629900;
        }
    }

    public static class InputMessageInvoice extends TdApi.InputMessageContent {
        public TdApi.Invoice invoice;
        public String title;
        public String description;
        public String photoUrl;
        public int photoSize;
        public int photoWidth;
        public int photoHeight;
        public byte[] payload;
        public String providerToken;
        public String providerData;
        public String startParameter;
        public TdApi.InputMessageContent extendedMediaContent;
        public static final int CONSTRUCTOR = 885857632;

        public InputMessageInvoice() {
        }

        public InputMessageInvoice(TdApi.Invoice var1, String var2, String var3, String var4, int var5, int var6, int var7, byte[] var8, String var9, String var10, String var11, TdApi.InputMessageContent var12) {
            this.invoice = var1;
            this.title = var2;
            this.description = var3;
            this.photoUrl = var4;
            this.photoSize = var5;
            this.photoWidth = var6;
            this.photoHeight = var7;
            this.payload = var8;
            this.providerToken = var9;
            this.providerData = var10;
            this.startParameter = var11;
            this.extendedMediaContent = var12;
        }

        public int getConstructor() {
            return 885857632;
        }
    }

    public static class InputMessageGame extends TdApi.InputMessageContent {
        public long botUserId;
        public String gameShortName;
        public static final int CONSTRUCTOR = 1252944610;

        public InputMessageGame() {
        }

        public InputMessageGame(long var1, String var3) {
            this.botUserId = var1;
            this.gameShortName = var3;
        }

        public int getConstructor() {
            return 1252944610;
        }
    }

    public static class InputMessageDice extends TdApi.InputMessageContent {
        public String emoji;
        public boolean clearDraft;
        public static final int CONSTRUCTOR = 841574313;

        public InputMessageDice() {
        }

        public InputMessageDice(String var1, boolean var2) {
            this.emoji = var1;
            this.clearDraft = var2;
        }

        public int getConstructor() {
            return 841574313;
        }
    }

    public static class InputMessageContact extends TdApi.InputMessageContent {
        public TdApi.Contact contact;
        public static final int CONSTRUCTOR = -982446849;

        public InputMessageContact() {
        }

        public InputMessageContact(TdApi.Contact var1) {
            this.contact = var1;
        }

        public int getConstructor() {
            return -982446849;
        }
    }

    public static class InputMessageVenue extends TdApi.InputMessageContent {
        public TdApi.Venue venue;
        public static final int CONSTRUCTOR = 1447926269;

        public InputMessageVenue() {
        }

        public InputMessageVenue(TdApi.Venue var1) {
            this.venue = var1;
        }

        public int getConstructor() {
            return 1447926269;
        }
    }

    public static class InputMessageLocation extends TdApi.InputMessageContent {
        public TdApi.Location location;
        public int livePeriod;
        public int heading;
        public int proximityAlertRadius;
        public static final int CONSTRUCTOR = 648735088;

        public InputMessageLocation() {
        }

        public InputMessageLocation(TdApi.Location var1, int var2, int var3, int var4) {
            this.location = var1;
            this.livePeriod = var2;
            this.heading = var3;
            this.proximityAlertRadius = var4;
        }

        public int getConstructor() {
            return 648735088;
        }
    }

    public static class InputMessageVoiceNote extends TdApi.InputMessageContent {
        public TdApi.InputFile voiceNote;
        public int duration;
        public byte[] waveform;
        public TdApi.FormattedText caption;
        public static final int CONSTRUCTOR = 2136519657;

        public InputMessageVoiceNote() {
        }

        public InputMessageVoiceNote(TdApi.InputFile var1, int var2, byte[] var3, TdApi.FormattedText var4) {
            this.voiceNote = var1;
            this.duration = var2;
            this.waveform = var3;
            this.caption = var4;
        }

        public int getConstructor() {
            return 2136519657;
        }
    }

    public static class InputMessageVideoNote extends TdApi.InputMessageContent {
        public TdApi.InputFile videoNote;
        public TdApi.InputThumbnail thumbnail;
        public int duration;
        public int length;
        public static final int CONSTRUCTOR = 279108859;

        public InputMessageVideoNote() {
        }

        public InputMessageVideoNote(TdApi.InputFile var1, TdApi.InputThumbnail var2, int var3, int var4) {
            this.videoNote = var1;
            this.thumbnail = var2;
            this.duration = var3;
            this.length = var4;
        }

        public int getConstructor() {
            return 279108859;
        }
    }

    public static class InputMessageVideo extends TdApi.InputMessageContent {
        public TdApi.InputFile video;
        public TdApi.InputThumbnail thumbnail;
        public int[] addedStickerFileIds;
        public int duration;
        public int width;
        public int height;
        public boolean supportsStreaming;
        public TdApi.FormattedText caption;
        public int selfDestructTime;
        public boolean hasSpoiler;
        public static final int CONSTRUCTOR = -1699308024;

        public InputMessageVideo() {
        }

        public InputMessageVideo(
                TdApi.InputFile var1,
                TdApi.InputThumbnail var2,
                int[] var3,
                int var4,
                int var5,
                int var6,
                boolean var7,
                TdApi.FormattedText var8,
                int var9,
                boolean var10) {
            this.video = var1;
            this.thumbnail = var2;
            this.addedStickerFileIds = var3;
            this.duration = var4;
            this.width = var5;
            this.height = var6;
            this.supportsStreaming = var7;
            this.caption = var8;
            this.selfDestructTime = var9;
            this.hasSpoiler = var10;
        }

        public int getConstructor() {
            return -1699308024;
        }
    }

    public static class InputMessageSticker extends TdApi.InputMessageContent {
        public TdApi.InputFile sticker;
        public TdApi.InputThumbnail thumbnail;
        public int width;
        public int height;
        public String emoji;
        public static final int CONSTRUCTOR = 1072805625;

        public InputMessageSticker() {
        }

        public InputMessageSticker(TdApi.InputFile var1, TdApi.InputThumbnail var2, int var3, int var4, String var5) {
            this.sticker = var1;
            this.thumbnail = var2;
            this.width = var3;
            this.height = var4;
            this.emoji = var5;
        }

        public int getConstructor() {
            return 1072805625;
        }
    }

    public static class InputMessagePhoto extends TdApi.InputMessageContent {
        public TdApi.InputFile photo;
        public TdApi.InputThumbnail thumbnail;
        public int[] addedStickerFileIds;
        public int width;
        public int height;
        public TdApi.FormattedText caption;
        public int selfDestructTime;
        public boolean hasSpoiler;
        public static final int CONSTRUCTOR = 1658132071;

        public InputMessagePhoto() {
        }

        public InputMessagePhoto(TdApi.InputFile var1, TdApi.InputThumbnail var2, int[] var3, int var4, int var5, TdApi.FormattedText var6, int var7, boolean var8) {
            this.photo = var1;
            this.thumbnail = var2;
            this.addedStickerFileIds = var3;
            this.width = var4;
            this.height = var5;
            this.caption = var6;
            this.selfDestructTime = var7;
            this.hasSpoiler = var8;
        }

        public int getConstructor() {
            return 1658132071;
        }
    }

    public static class InputMessageDocument extends TdApi.InputMessageContent {
        public TdApi.InputFile document;
        public TdApi.InputThumbnail thumbnail;
        public boolean disableContentTypeDetection;
        public TdApi.FormattedText caption;
        public static final int CONSTRUCTOR = 1633383097;

        public InputMessageDocument() {
        }

        public InputMessageDocument(TdApi.InputFile var1, TdApi.InputThumbnail var2, boolean var3, TdApi.FormattedText var4) {
            this.document = var1;
            this.thumbnail = var2;
            this.disableContentTypeDetection = var3;
            this.caption = var4;
        }

        public int getConstructor() {
            return 1633383097;
        }
    }

    public static class InputMessageAudio extends TdApi.InputMessageContent {
        public TdApi.InputFile audio;
        public TdApi.InputThumbnail albumCoverThumbnail;
        public int duration;
        public String title;
        public String performer;
        public TdApi.FormattedText caption;
        public static final int CONSTRUCTOR = -626786126;

        public InputMessageAudio() {
        }

        public InputMessageAudio(TdApi.InputFile var1, TdApi.InputThumbnail var2, int var3, String var4, String var5, TdApi.FormattedText var6) {
            this.audio = var1;
            this.albumCoverThumbnail = var2;
            this.duration = var3;
            this.title = var4;
            this.performer = var5;
            this.caption = var6;
        }

        public int getConstructor() {
            return -626786126;
        }
    }

    public static class InputMessageAnimation extends TdApi.InputMessageContent {
        public TdApi.InputFile animation;
        public TdApi.InputThumbnail thumbnail;
        public int[] addedStickerFileIds;
        public int duration;
        public int width;
        public int height;
        public TdApi.FormattedText caption;
        public boolean hasSpoiler;
        public static final int CONSTRUCTOR = 850750601;

        public InputMessageAnimation() {
        }

        public InputMessageAnimation(TdApi.InputFile var1, TdApi.InputThumbnail var2, int[] var3, int var4, int var5, int var6, TdApi.FormattedText var7, boolean var8) {
            this.animation = var1;
            this.thumbnail = var2;
            this.addedStickerFileIds = var3;
            this.duration = var4;
            this.width = var5;
            this.height = var6;
            this.caption = var7;
            this.hasSpoiler = var8;
        }

        public int getConstructor() {
            return 850750601;
        }
    }

    public static class InputMessageText extends TdApi.InputMessageContent {
        public TdApi.FormattedText text;
        public boolean disableWebPagePreview;
        public boolean clearDraft;
        public static final int CONSTRUCTOR = 247050392;

        public InputMessageText() {
        }

        public InputMessageText(TdApi.FormattedText var1, boolean var2, boolean var3) {
            this.text = var1;
            this.disableWebPagePreview = var2;
            this.clearDraft = var3;
        }

        public int getConstructor() {
            return 247050392;
        }
    }

    public abstract static class InputMessageContent extends TdApi.Object {
        public InputMessageContent() {
        }
    }

    public static class InputInvoiceName extends TdApi.InputInvoice {
        public String name;
        public static final int CONSTRUCTOR = -1312155917;

        public InputInvoiceName() {
        }

        public InputInvoiceName(String var1) {
            this.name = var1;
        }

        public int getConstructor() {
            return -1312155917;
        }
    }

    public static class InputInvoiceMessage extends TdApi.InputInvoice {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = 1490872848;

        public InputInvoiceMessage() {
        }

        public InputInvoiceMessage(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return 1490872848;
        }
    }

    public abstract static class InputInvoice extends TdApi.Object {
        public InputInvoice() {
        }
    }

    public static class InputInlineQueryResultVoiceNote extends TdApi.InputInlineQueryResult {
        public String id;
        public String title;
        public String voiceNoteUrl;
        public int voiceNoteDuration;
        public TdApi.ReplyMarkup replyMarkup;
        public TdApi.InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = -1790072503;

        public InputInlineQueryResultVoiceNote() {
        }

        public InputInlineQueryResultVoiceNote(String var1, String var2, String var3, int var4, TdApi.ReplyMarkup var5, TdApi.InputMessageContent var6) {
            this.id = var1;
            this.title = var2;
            this.voiceNoteUrl = var3;
            this.voiceNoteDuration = var4;
            this.replyMarkup = var5;
            this.inputMessageContent = var6;
        }

        public int getConstructor() {
            return -1790072503;
        }
    }

    public static class InputInlineQueryResultVideo extends TdApi.InputInlineQueryResult {
        public String id;
        public String title;
        public String description;
        public String thumbnailUrl;
        public String videoUrl;
        public String mimeType;
        public int videoWidth;
        public int videoHeight;
        public int videoDuration;
        public TdApi.ReplyMarkup replyMarkup;
        public TdApi.InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 1724073191;

        public InputInlineQueryResultVideo() {
        }

        public InputInlineQueryResultVideo(String var1, String var2, String var3, String var4, String var5, String var6, int var7, int var8, int var9, TdApi.ReplyMarkup var10, TdApi.InputMessageContent var11) {
            this.id = var1;
            this.title = var2;
            this.description = var3;
            this.thumbnailUrl = var4;
            this.videoUrl = var5;
            this.mimeType = var6;
            this.videoWidth = var7;
            this.videoHeight = var8;
            this.videoDuration = var9;
            this.replyMarkup = var10;
            this.inputMessageContent = var11;
        }

        public int getConstructor() {
            return 1724073191;
        }
    }

    public static class InputInlineQueryResultVenue extends TdApi.InputInlineQueryResult {
        public String id;
        public TdApi.Venue venue;
        public String thumbnailUrl;
        public int thumbnailWidth;
        public int thumbnailHeight;
        public TdApi.ReplyMarkup replyMarkup;
        public TdApi.InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 541704509;

        public InputInlineQueryResultVenue() {
        }

        public InputInlineQueryResultVenue(String var1, TdApi.Venue var2, String var3, int var4, int var5, TdApi.ReplyMarkup var6, TdApi.InputMessageContent var7) {
            this.id = var1;
            this.venue = var2;
            this.thumbnailUrl = var3;
            this.thumbnailWidth = var4;
            this.thumbnailHeight = var5;
            this.replyMarkup = var6;
            this.inputMessageContent = var7;
        }

        public int getConstructor() {
            return 541704509;
        }
    }

    public static class InputInlineQueryResultSticker extends TdApi.InputInlineQueryResult {
        public String id;
        public String thumbnailUrl;
        public String stickerUrl;
        public int stickerWidth;
        public int stickerHeight;
        public TdApi.ReplyMarkup replyMarkup;
        public TdApi.InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 274007129;

        public InputInlineQueryResultSticker() {
        }

        public InputInlineQueryResultSticker(String var1, String var2, String var3, int var4, int var5, TdApi.ReplyMarkup var6, TdApi.InputMessageContent var7) {
            this.id = var1;
            this.thumbnailUrl = var2;
            this.stickerUrl = var3;
            this.stickerWidth = var4;
            this.stickerHeight = var5;
            this.replyMarkup = var6;
            this.inputMessageContent = var7;
        }

        public int getConstructor() {
            return 274007129;
        }
    }

    public static class InputInlineQueryResultPhoto extends TdApi.InputInlineQueryResult {
        public String id;
        public String title;
        public String description;
        public String thumbnailUrl;
        public String photoUrl;
        public int photoWidth;
        public int photoHeight;
        public TdApi.ReplyMarkup replyMarkup;
        public TdApi.InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = -1123338721;

        public InputInlineQueryResultPhoto() {
        }

        public InputInlineQueryResultPhoto(String var1, String var2, String var3, String var4, String var5, int var6, int var7, TdApi.ReplyMarkup var8, TdApi.InputMessageContent var9) {
            this.id = var1;
            this.title = var2;
            this.description = var3;
            this.thumbnailUrl = var4;
            this.photoUrl = var5;
            this.photoWidth = var6;
            this.photoHeight = var7;
            this.replyMarkup = var8;
            this.inputMessageContent = var9;
        }

        public int getConstructor() {
            return -1123338721;
        }
    }

    public static class InputInlineQueryResultLocation extends TdApi.InputInlineQueryResult {
        public String id;
        public TdApi.Location location;
        public int livePeriod;
        public String title;
        public String thumbnailUrl;
        public int thumbnailWidth;
        public int thumbnailHeight;
        public TdApi.ReplyMarkup replyMarkup;
        public TdApi.InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = -1887650218;

        public InputInlineQueryResultLocation() {
        }

        public InputInlineQueryResultLocation(String var1, TdApi.Location var2, int var3, String var4, String var5, int var6, int var7, TdApi.ReplyMarkup var8, TdApi.InputMessageContent var9) {
            this.id = var1;
            this.location = var2;
            this.livePeriod = var3;
            this.title = var4;
            this.thumbnailUrl = var5;
            this.thumbnailWidth = var6;
            this.thumbnailHeight = var7;
            this.replyMarkup = var8;
            this.inputMessageContent = var9;
        }

        public int getConstructor() {
            return -1887650218;
        }
    }

    public static class InputInlineQueryResultGame extends TdApi.InputInlineQueryResult {
        public String id;
        public String gameShortName;
        public TdApi.ReplyMarkup replyMarkup;
        public static final int CONSTRUCTOR = 966074327;

        public InputInlineQueryResultGame() {
        }

        public InputInlineQueryResultGame(String var1, String var2, TdApi.ReplyMarkup var3) {
            this.id = var1;
            this.gameShortName = var2;
            this.replyMarkup = var3;
        }

        public int getConstructor() {
            return 966074327;
        }
    }

    public static class InputInlineQueryResultDocument extends TdApi.InputInlineQueryResult {
        public String id;
        public String title;
        public String description;
        public String documentUrl;
        public String mimeType;
        public String thumbnailUrl;
        public int thumbnailWidth;
        public int thumbnailHeight;
        public TdApi.ReplyMarkup replyMarkup;
        public TdApi.InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 578801869;

        public InputInlineQueryResultDocument() {
        }

        public InputInlineQueryResultDocument(String var1, String var2, String var3, String var4, String var5, String var6, int var7, int var8, TdApi.ReplyMarkup var9, TdApi.InputMessageContent var10) {
            this.id = var1;
            this.title = var2;
            this.description = var3;
            this.documentUrl = var4;
            this.mimeType = var5;
            this.thumbnailUrl = var6;
            this.thumbnailWidth = var7;
            this.thumbnailHeight = var8;
            this.replyMarkup = var9;
            this.inputMessageContent = var10;
        }

        public int getConstructor() {
            return 578801869;
        }
    }

    public static class InputInlineQueryResultContact extends TdApi.InputInlineQueryResult {
        public String id;
        public TdApi.Contact contact;
        public String thumbnailUrl;
        public int thumbnailWidth;
        public int thumbnailHeight;
        public TdApi.ReplyMarkup replyMarkup;
        public TdApi.InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 1846064594;

        public InputInlineQueryResultContact() {
        }

        public InputInlineQueryResultContact(String var1, TdApi.Contact var2, String var3, int var4, int var5, TdApi.ReplyMarkup var6, TdApi.InputMessageContent var7) {
            this.id = var1;
            this.contact = var2;
            this.thumbnailUrl = var3;
            this.thumbnailWidth = var4;
            this.thumbnailHeight = var5;
            this.replyMarkup = var6;
            this.inputMessageContent = var7;
        }

        public int getConstructor() {
            return 1846064594;
        }
    }

    public static class InputInlineQueryResultAudio extends TdApi.InputInlineQueryResult {
        public String id;
        public String title;
        public String performer;
        public String audioUrl;
        public int audioDuration;
        public TdApi.ReplyMarkup replyMarkup;
        public TdApi.InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 1260139988;

        public InputInlineQueryResultAudio() {
        }

        public InputInlineQueryResultAudio(String var1, String var2, String var3, String var4, int var5, TdApi.ReplyMarkup var6, TdApi.InputMessageContent var7) {
            this.id = var1;
            this.title = var2;
            this.performer = var3;
            this.audioUrl = var4;
            this.audioDuration = var5;
            this.replyMarkup = var6;
            this.inputMessageContent = var7;
        }

        public int getConstructor() {
            return 1260139988;
        }
    }

    public static class InputInlineQueryResultArticle extends TdApi.InputInlineQueryResult {
        public String id;
        public String url;
        public boolean hideUrl;
        public String title;
        public String description;
        public String thumbnailUrl;
        public int thumbnailWidth;
        public int thumbnailHeight;
        public TdApi.ReplyMarkup replyMarkup;
        public TdApi.InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 1973670156;

        public InputInlineQueryResultArticle() {
        }

        public InputInlineQueryResultArticle(String var1, String var2, boolean var3, String var4, String var5, String var6, int var7, int var8, TdApi.ReplyMarkup var9, TdApi.InputMessageContent var10) {
            this.id = var1;
            this.url = var2;
            this.hideUrl = var3;
            this.title = var4;
            this.description = var5;
            this.thumbnailUrl = var6;
            this.thumbnailWidth = var7;
            this.thumbnailHeight = var8;
            this.replyMarkup = var9;
            this.inputMessageContent = var10;
        }

        public int getConstructor() {
            return 1973670156;
        }
    }

    public static class InputInlineQueryResultAnimation extends TdApi.InputInlineQueryResult {
        public String id;
        public String title;
        public String thumbnailUrl;
        public String thumbnailMimeType;
        public String videoUrl;
        public String videoMimeType;
        public int videoDuration;
        public int videoWidth;
        public int videoHeight;
        public TdApi.ReplyMarkup replyMarkup;
        public TdApi.InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = -1489808874;

        public InputInlineQueryResultAnimation() {
        }

        public InputInlineQueryResultAnimation(String var1, String var2, String var3, String var4, String var5, String var6, int var7, int var8, int var9, TdApi.ReplyMarkup var10, TdApi.InputMessageContent var11) {
            this.id = var1;
            this.title = var2;
            this.thumbnailUrl = var3;
            this.thumbnailMimeType = var4;
            this.videoUrl = var5;
            this.videoMimeType = var6;
            this.videoDuration = var7;
            this.videoWidth = var8;
            this.videoHeight = var9;
            this.replyMarkup = var10;
            this.inputMessageContent = var11;
        }

        public int getConstructor() {
            return -1489808874;
        }
    }

    public abstract static class InputInlineQueryResult extends TdApi.Object {
        public InputInlineQueryResult() {
        }
    }

    public static class InputIdentityDocument extends TdApi.Object {
        public String number;
        public TdApi.Date expirationDate;
        public TdApi.InputFile frontSide;
        public TdApi.InputFile reverseSide;
        public TdApi.InputFile selfie;
        public TdApi.InputFile[] translation;
        public static final int CONSTRUCTOR = 767353688;

        public InputIdentityDocument() {
        }

        public InputIdentityDocument(String var1, TdApi.Date var2, TdApi.InputFile var3, TdApi.InputFile var4, TdApi.InputFile var5, TdApi.InputFile[] var6) {
            this.number = var1;
            this.expirationDate = var2;
            this.frontSide = var3;
            this.reverseSide = var4;
            this.selfie = var5;
            this.translation = var6;
        }

        public int getConstructor() {
            return 767353688;
        }
    }

    public static class InputFileGenerated extends TdApi.InputFile {
        public String originalPath;
        public String conversion;
        public long expectedSize;
        public static final int CONSTRUCTOR = -1333385216;

        public InputFileGenerated() {
        }

        public InputFileGenerated(String var1, String var2, long var3) {
            this.originalPath = var1;
            this.conversion = var2;
            this.expectedSize = var3;
        }

        public int getConstructor() {
            return -1333385216;
        }
    }

    public static class InputFileLocal extends TdApi.InputFile {
        public String path;
        public static final int CONSTRUCTOR = 2056030919;

        public InputFileLocal() {
        }

        public InputFileLocal(String var1) {
            this.path = var1;
        }

        public int getConstructor() {
            return 2056030919;
        }
    }

    public static class InputFileRemote extends TdApi.InputFile {
        public String id;
        public static final int CONSTRUCTOR = -107574466;

        public InputFileRemote() {
        }

        public InputFileRemote(String var1) {
            this.id = var1;
        }

        public int getConstructor() {
            return -107574466;
        }
    }

    public static class InputFileId extends TdApi.InputFile {
        public int id;
        public static final int CONSTRUCTOR = 1788906253;

        public InputFileId() {
        }

        public InputFileId(int var1) {
            this.id = var1;
        }

        public int getConstructor() {
            return 1788906253;
        }
    }

    public abstract static class InputFile extends TdApi.Object {
        public InputFile() {
        }
    }

    public static class InputCredentialsGooglePay extends TdApi.InputCredentials {
        public String data;
        public static final int CONSTRUCTOR = 844384100;

        public InputCredentialsGooglePay() {
        }

        public InputCredentialsGooglePay(String var1) {
            this.data = var1;
        }

        public int getConstructor() {
            return 844384100;
        }
    }

    public static class InputCredentialsApplePay extends TdApi.InputCredentials {
        public String data;
        public static final int CONSTRUCTOR = -1246570799;

        public InputCredentialsApplePay() {
        }

        public InputCredentialsApplePay(String var1) {
            this.data = var1;
        }

        public int getConstructor() {
            return -1246570799;
        }
    }

    public static class InputCredentialsNew extends TdApi.InputCredentials {
        public String data;
        public boolean allowSave;
        public static final int CONSTRUCTOR = -829689558;

        public InputCredentialsNew() {
        }

        public InputCredentialsNew(String var1, boolean var2) {
            this.data = var1;
            this.allowSave = var2;
        }

        public int getConstructor() {
            return -829689558;
        }
    }

    public static class InputCredentialsSaved extends TdApi.InputCredentials {
        public String savedCredentialsId;
        public static final int CONSTRUCTOR = -2034385364;

        public InputCredentialsSaved() {
        }

        public InputCredentialsSaved(String var1) {
            this.savedCredentialsId = var1;
        }

        public int getConstructor() {
            return -2034385364;
        }
    }

    public abstract static class InputCredentials extends TdApi.Object {
        public InputCredentials() {
        }
    }

    public static class InputChatPhotoSticker extends TdApi.InputChatPhoto {
        public TdApi.ChatPhotoSticker sticker;
        public static final int CONSTRUCTOR = 1315861341;

        public InputChatPhotoSticker() {
        }

        public InputChatPhotoSticker(TdApi.ChatPhotoSticker var1) {
            this.sticker = var1;
        }

        public int getConstructor() {
            return 1315861341;
        }
    }

    public static class InputChatPhotoAnimation extends TdApi.InputChatPhoto {
        public TdApi.InputFile animation;
        public double mainFrameTimestamp;
        public static final int CONSTRUCTOR = 90846242;

        public InputChatPhotoAnimation() {
        }

        public InputChatPhotoAnimation(TdApi.InputFile var1, double var2) {
            this.animation = var1;
            this.mainFrameTimestamp = var2;
        }

        public int getConstructor() {
            return 90846242;
        }
    }

    public static class InputChatPhotoStatic extends TdApi.InputChatPhoto {
        public TdApi.InputFile photo;
        public static final int CONSTRUCTOR = 1979179699;

        public InputChatPhotoStatic() {
        }

        public InputChatPhotoStatic(TdApi.InputFile var1) {
            this.photo = var1;
        }

        public int getConstructor() {
            return 1979179699;
        }
    }

    public static class InputChatPhotoPrevious extends TdApi.InputChatPhoto {
        public long chatPhotoId;
        public static final int CONSTRUCTOR = 23128529;

        public InputChatPhotoPrevious() {
        }

        public InputChatPhotoPrevious(long var1) {
            this.chatPhotoId = var1;
        }

        public int getConstructor() {
            return 23128529;
        }
    }

    public abstract static class InputChatPhoto extends TdApi.Object {
        public InputChatPhoto() {
        }
    }

    public static class InputBackgroundPrevious extends TdApi.InputBackground {
        public long messageId;
        public static final int CONSTRUCTOR = -351905954;

        public InputBackgroundPrevious() {
        }

        public InputBackgroundPrevious(long var1) {
            this.messageId = var1;
        }

        public int getConstructor() {
            return -351905954;
        }
    }

    public static class InputBackgroundRemote extends TdApi.InputBackground {
        public long backgroundId;
        public static final int CONSTRUCTOR = -274976231;

        public InputBackgroundRemote() {
        }

        public InputBackgroundRemote(long var1) {
            this.backgroundId = var1;
        }

        public int getConstructor() {
            return -274976231;
        }
    }

    public static class InputBackgroundLocal extends TdApi.InputBackground {
        public TdApi.InputFile background;
        public static final int CONSTRUCTOR = -1747094364;

        public InputBackgroundLocal() {
        }

        public InputBackgroundLocal(TdApi.InputFile var1) {
            this.background = var1;
        }

        public int getConstructor() {
            return -1747094364;
        }
    }

    public abstract static class InputBackground extends TdApi.Object {
        public InputBackground() {
        }
    }

    public static class InlineQueryResultsButtonTypeWebApp extends TdApi.InlineQueryResultsButtonType {
        public String url;
        public static final int CONSTRUCTOR = -1197382814;

        public InlineQueryResultsButtonTypeWebApp() {
        }

        public InlineQueryResultsButtonTypeWebApp(String var1) {
            this.url = var1;
        }

        public int getConstructor() {
            return -1197382814;
        }
    }

    public static class InlineQueryResultsButtonTypeStartBot extends TdApi.InlineQueryResultsButtonType {
        public String parameter;
        public static final int CONSTRUCTOR = -23400235;

        public InlineQueryResultsButtonTypeStartBot() {
        }

        public InlineQueryResultsButtonTypeStartBot(String var1) {
            this.parameter = var1;
        }

        public int getConstructor() {
            return -23400235;
        }
    }

    public abstract static class InlineQueryResultsButtonType extends TdApi.Object {
        public InlineQueryResultsButtonType() {
        }
    }

    public static class InlineQueryResultsButton extends TdApi.Object {
        public String text;
        public TdApi.InlineQueryResultsButtonType type;
        public static final int CONSTRUCTOR = -790689618;

        public InlineQueryResultsButton() {
        }

        public InlineQueryResultsButton(String var1, TdApi.InlineQueryResultsButtonType var2) {
            this.text = var1;
            this.type = var2;
        }

        public int getConstructor() {
            return -790689618;
        }
    }

    public static class InlineQueryResults extends TdApi.Object {
        public long inlineQueryId;
        public TdApi.InlineQueryResultsButton button;
        public TdApi.InlineQueryResult[] results;
        public String nextOffset;
        public static final int CONSTRUCTOR = 1830685615;

        public InlineQueryResults() {
        }

        public InlineQueryResults(long var1, TdApi.InlineQueryResultsButton var3, TdApi.InlineQueryResult[] var4, String var5) {
            this.inlineQueryId = var1;
            this.button = var3;
            this.results = var4;
            this.nextOffset = var5;
        }

        public int getConstructor() {
            return 1830685615;
        }
    }

    public static class InlineQueryResultVoiceNote extends TdApi.InlineQueryResult {
        public String id;
        public TdApi.VoiceNote voiceNote;
        public String title;
        public static final int CONSTRUCTOR = -1897393105;

        public InlineQueryResultVoiceNote() {
        }

        public InlineQueryResultVoiceNote(String var1, TdApi.VoiceNote var2, String var3) {
            this.id = var1;
            this.voiceNote = var2;
            this.title = var3;
        }

        public int getConstructor() {
            return -1897393105;
        }
    }

    public static class InlineQueryResultVideo extends TdApi.InlineQueryResult {
        public String id;
        public TdApi.Video video;
        public String title;
        public String description;
        public static final int CONSTRUCTOR = -1373158683;

        public InlineQueryResultVideo() {
        }

        public InlineQueryResultVideo(String var1, TdApi.Video var2, String var3, String var4) {
            this.id = var1;
            this.video = var2;
            this.title = var3;
            this.description = var4;
        }

        public int getConstructor() {
            return -1373158683;
        }
    }

    public static class InlineQueryResultSticker extends TdApi.InlineQueryResult {
        public String id;
        public TdApi.Sticker sticker;
        public static final int CONSTRUCTOR = -1848224245;

        public InlineQueryResultSticker() {
        }

        public InlineQueryResultSticker(String var1, TdApi.Sticker var2) {
            this.id = var1;
            this.sticker = var2;
        }

        public int getConstructor() {
            return -1848224245;
        }
    }

    public static class InlineQueryResultPhoto extends TdApi.InlineQueryResult {
        public String id;
        public TdApi.Photo photo;
        public String title;
        public String description;
        public static final int CONSTRUCTOR = 1848319440;

        public InlineQueryResultPhoto() {
        }

        public InlineQueryResultPhoto(String var1, TdApi.Photo var2, String var3, String var4) {
            this.id = var1;
            this.photo = var2;
            this.title = var3;
            this.description = var4;
        }

        public int getConstructor() {
            return 1848319440;
        }
    }

    public static class InlineQueryResultDocument extends TdApi.InlineQueryResult {
        public String id;
        public TdApi.Document document;
        public String title;
        public String description;
        public static final int CONSTRUCTOR = -1491268539;

        public InlineQueryResultDocument() {
        }

        public InlineQueryResultDocument(String var1, TdApi.Document var2, String var3, String var4) {
            this.id = var1;
            this.document = var2;
            this.title = var3;
            this.description = var4;
        }

        public int getConstructor() {
            return -1491268539;
        }
    }

    public static class InlineQueryResultAudio extends TdApi.InlineQueryResult {
        public String id;
        public TdApi.Audio audio;
        public static final int CONSTRUCTOR = 842650360;

        public InlineQueryResultAudio() {
        }

        public InlineQueryResultAudio(String var1, TdApi.Audio var2) {
            this.id = var1;
            this.audio = var2;
        }

        public int getConstructor() {
            return 842650360;
        }
    }

    public static class InlineQueryResultAnimation extends TdApi.InlineQueryResult {
        public String id;
        public TdApi.Animation animation;
        public String title;
        public static final int CONSTRUCTOR = 2009984267;

        public InlineQueryResultAnimation() {
        }

        public InlineQueryResultAnimation(String var1, TdApi.Animation var2, String var3) {
            this.id = var1;
            this.animation = var2;
            this.title = var3;
        }

        public int getConstructor() {
            return 2009984267;
        }
    }

    public static class InlineQueryResultGame extends TdApi.InlineQueryResult {
        public String id;
        public TdApi.Game game;
        public static final int CONSTRUCTOR = 1706916987;

        public InlineQueryResultGame() {
        }

        public InlineQueryResultGame(String var1, TdApi.Game var2) {
            this.id = var1;
            this.game = var2;
        }

        public int getConstructor() {
            return 1706916987;
        }
    }

    public static class InlineQueryResultVenue extends TdApi.InlineQueryResult {
        public String id;
        public TdApi.Venue venue;
        public TdApi.Thumbnail thumbnail;
        public static final int CONSTRUCTOR = 1281036382;

        public InlineQueryResultVenue() {
        }

        public InlineQueryResultVenue(String var1, TdApi.Venue var2, TdApi.Thumbnail var3) {
            this.id = var1;
            this.venue = var2;
            this.thumbnail = var3;
        }

        public int getConstructor() {
            return 1281036382;
        }
    }

    public static class InlineQueryResultLocation extends TdApi.InlineQueryResult {
        public String id;
        public TdApi.Location location;
        public String title;
        public TdApi.Thumbnail thumbnail;
        public static final int CONSTRUCTOR = 466004752;

        public InlineQueryResultLocation() {
        }

        public InlineQueryResultLocation(String var1, TdApi.Location var2, String var3, TdApi.Thumbnail var4) {
            this.id = var1;
            this.location = var2;
            this.title = var3;
            this.thumbnail = var4;
        }

        public int getConstructor() {
            return 466004752;
        }
    }

    public static class InlineQueryResultContact extends TdApi.InlineQueryResult {
        public String id;
        public TdApi.Contact contact;
        public TdApi.Thumbnail thumbnail;
        public static final int CONSTRUCTOR = -181960174;

        public InlineQueryResultContact() {
        }

        public InlineQueryResultContact(String var1, TdApi.Contact var2, TdApi.Thumbnail var3) {
            this.id = var1;
            this.contact = var2;
            this.thumbnail = var3;
        }

        public int getConstructor() {
            return -181960174;
        }
    }

    public static class InlineQueryResultArticle extends TdApi.InlineQueryResult {
        public String id;
        public String url;
        public boolean hideUrl;
        public String title;
        public String description;
        public TdApi.Thumbnail thumbnail;
        public static final int CONSTRUCTOR = 206340825;

        public InlineQueryResultArticle() {
        }

        public InlineQueryResultArticle(String var1, String var2, boolean var3, String var4, String var5, TdApi.Thumbnail var6) {
            this.id = var1;
            this.url = var2;
            this.hideUrl = var3;
            this.title = var4;
            this.description = var5;
            this.thumbnail = var6;
        }

        public int getConstructor() {
            return 206340825;
        }
    }

    public abstract static class InlineQueryResult extends TdApi.Object {
        public InlineQueryResult() {
        }
    }

    public static class InlineKeyboardButtonTypeUser extends TdApi.InlineKeyboardButtonType {
        public long userId;
        public static final int CONSTRUCTOR = 1836574114;

        public InlineKeyboardButtonTypeUser() {
        }

        public InlineKeyboardButtonTypeUser(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return 1836574114;
        }
    }

    public static class InlineKeyboardButtonTypeBuy extends TdApi.InlineKeyboardButtonType {
        public static final int CONSTRUCTOR = 1360739440;

        public InlineKeyboardButtonTypeBuy() {
        }

        public int getConstructor() {
            return 1360739440;
        }
    }

    public static class InlineKeyboardButtonTypeSwitchInline extends TdApi.InlineKeyboardButtonType {
        public String query;
        public TdApi.TargetChat targetChat;
        public static final int CONSTRUCTOR = 544906485;

        public InlineKeyboardButtonTypeSwitchInline() {
        }

        public InlineKeyboardButtonTypeSwitchInline(String var1, TdApi.TargetChat var2) {
            this.query = var1;
            this.targetChat = var2;
        }

        public int getConstructor() {
            return 544906485;
        }
    }

    public static class InlineKeyboardButtonTypeCallbackGame extends TdApi.InlineKeyboardButtonType {
        public static final int CONSTRUCTOR = -383429528;

        public InlineKeyboardButtonTypeCallbackGame() {
        }

        public int getConstructor() {
            return -383429528;
        }
    }

    public static class InlineKeyboardButtonTypeCallbackWithPassword extends TdApi.InlineKeyboardButtonType {
        public byte[] data;
        public static final int CONSTRUCTOR = 908018248;

        public InlineKeyboardButtonTypeCallbackWithPassword() {
        }

        public InlineKeyboardButtonTypeCallbackWithPassword(byte[] var1) {
            this.data = var1;
        }

        public int getConstructor() {
            return 908018248;
        }
    }

    public static class InlineKeyboardButtonTypeCallback extends TdApi.InlineKeyboardButtonType {
        public byte[] data;
        public static final int CONSTRUCTOR = -1127515139;

        public InlineKeyboardButtonTypeCallback() {
        }

        public InlineKeyboardButtonTypeCallback(byte[] var1) {
            this.data = var1;
        }

        public int getConstructor() {
            return -1127515139;
        }
    }

    public static class InlineKeyboardButtonTypeWebApp extends TdApi.InlineKeyboardButtonType {
        public String url;
        public static final int CONSTRUCTOR = -1767471672;

        public InlineKeyboardButtonTypeWebApp() {
        }

        public InlineKeyboardButtonTypeWebApp(String var1) {
            this.url = var1;
        }

        public int getConstructor() {
            return -1767471672;
        }
    }

    public static class InlineKeyboardButtonTypeLoginUrl extends TdApi.InlineKeyboardButtonType {
        public String url;
        public long id;
        public String forwardText;
        public static final int CONSTRUCTOR = -1203413081;

        public InlineKeyboardButtonTypeLoginUrl() {
        }

        public InlineKeyboardButtonTypeLoginUrl(String var1, long var2, String var4) {
            this.url = var1;
            this.id = var2;
            this.forwardText = var4;
        }

        public int getConstructor() {
            return -1203413081;
        }
    }

    public static class InlineKeyboardButtonTypeUrl extends TdApi.InlineKeyboardButtonType {
        public String url;
        public static final int CONSTRUCTOR = 1130741420;

        public InlineKeyboardButtonTypeUrl() {
        }

        public InlineKeyboardButtonTypeUrl(String var1) {
            this.url = var1;
        }

        public int getConstructor() {
            return 1130741420;
        }
    }

    public abstract static class InlineKeyboardButtonType extends TdApi.Object {
        public InlineKeyboardButtonType() {
        }
    }

    public static class InlineKeyboardButton extends TdApi.Object {
        public String text;
        public TdApi.InlineKeyboardButtonType type;
        public static final int CONSTRUCTOR = -372105704;

        public InlineKeyboardButton() {
        }

        public InlineKeyboardButton(String var1, TdApi.InlineKeyboardButtonType var2) {
            this.text = var1;
            this.type = var2;
        }

        public int getConstructor() {
            return -372105704;
        }
    }

    public static class ImportedContacts extends TdApi.Object {
        public long[] userIds;
        public int[] importerCount;
        public static final int CONSTRUCTOR = 2068432290;

        public ImportedContacts() {
        }

        public ImportedContacts(long[] var1, int[] var2) {
            this.userIds = var1;
            this.importerCount = var2;
        }

        public int getConstructor() {
            return 2068432290;
        }
    }

    public static class IdentityDocument extends TdApi.Object {
        public String number;
        public TdApi.Date expirationDate;
        public TdApi.DatedFile frontSide;
        public TdApi.DatedFile reverseSide;
        public TdApi.DatedFile selfie;
        public TdApi.DatedFile[] translation;
        public static final int CONSTRUCTOR = 1001703606;

        public IdentityDocument() {
        }

        public IdentityDocument(String var1, TdApi.Date var2, TdApi.DatedFile var3, TdApi.DatedFile var4, TdApi.DatedFile var5, TdApi.DatedFile[] var6) {
            this.number = var1;
            this.expirationDate = var2;
            this.frontSide = var3;
            this.reverseSide = var4;
            this.selfie = var5;
            this.translation = var6;
        }

        public int getConstructor() {
            return 1001703606;
        }
    }

    public static class HttpUrl extends TdApi.Object {
        public String url;
        public static final int CONSTRUCTOR = -2018019930;

        public HttpUrl() {
        }

        public HttpUrl(String var1) {
            this.url = var1;
        }

        public int getConstructor() {
            return -2018019930;
        }
    }

    public static class Hashtags extends TdApi.Object {
        public String[] hashtags;
        public static final int CONSTRUCTOR = 676798885;

        public Hashtags() {
        }

        public Hashtags(String[] var1) {
            this.hashtags = var1;
        }

        public int getConstructor() {
            return 676798885;
        }
    }

    public static class GroupCallVideoSourceGroup extends TdApi.Object {
        public String semantics;
        public int[] sourceIds;
        public static final int CONSTRUCTOR = -1190900785;

        public GroupCallVideoSourceGroup() {
        }

        public GroupCallVideoSourceGroup(String var1, int[] var2) {
            this.semantics = var1;
            this.sourceIds = var2;
        }

        public int getConstructor() {
            return -1190900785;
        }
    }

    public static class GroupCallVideoQualityFull extends TdApi.GroupCallVideoQuality {
        public static final int CONSTRUCTOR = -2125916617;

        public GroupCallVideoQualityFull() {
        }

        public int getConstructor() {
            return -2125916617;
        }
    }

    public static class GroupCallVideoQualityMedium extends TdApi.GroupCallVideoQuality {
        public static final int CONSTRUCTOR = 394968234;

        public GroupCallVideoQualityMedium() {
        }

        public int getConstructor() {
            return 394968234;
        }
    }

    public static class GroupCallVideoQualityThumbnail extends TdApi.GroupCallVideoQuality {
        public static final int CONSTRUCTOR = -379186304;

        public GroupCallVideoQualityThumbnail() {
        }

        public int getConstructor() {
            return -379186304;
        }
    }

    public abstract static class GroupCallVideoQuality extends TdApi.Object {
        public GroupCallVideoQuality() {
        }
    }

    public static class GroupCallStreams extends TdApi.Object {
        public TdApi.GroupCallStream[] streams;
        public static final int CONSTRUCTOR = -1032959578;

        public GroupCallStreams() {
        }

        public GroupCallStreams(TdApi.GroupCallStream[] var1) {
            this.streams = var1;
        }

        public int getConstructor() {
            return -1032959578;
        }
    }

    public static class GroupCallStream extends TdApi.Object {
        public int channelId;
        public int scale;
        public long timeOffset;
        public static final int CONSTRUCTOR = -264564795;

        public GroupCallStream() {
        }

        public GroupCallStream(int var1, int var2, long var3) {
            this.channelId = var1;
            this.scale = var2;
            this.timeOffset = var3;
        }

        public int getConstructor() {
            return -264564795;
        }
    }

    public static class GroupCallRecentSpeaker extends TdApi.Object {
        public TdApi.MessageSender participantId;
        public boolean isSpeaking;
        public static final int CONSTRUCTOR = 1819519436;

        public GroupCallRecentSpeaker() {
        }

        public GroupCallRecentSpeaker(TdApi.MessageSender var1, boolean var2) {
            this.participantId = var1;
            this.isSpeaking = var2;
        }

        public int getConstructor() {
            return 1819519436;
        }
    }

    public static class GroupCallParticipantVideoInfo extends TdApi.Object {
        public TdApi.GroupCallVideoSourceGroup[] sourceGroups;
        public String endpointId;
        public boolean isPaused;
        public static final int CONSTRUCTOR = -14294645;

        public GroupCallParticipantVideoInfo() {
        }

        public GroupCallParticipantVideoInfo(TdApi.GroupCallVideoSourceGroup[] var1, String var2, boolean var3) {
            this.sourceGroups = var1;
            this.endpointId = var2;
            this.isPaused = var3;
        }

        public int getConstructor() {
            return -14294645;
        }
    }

    public static class GroupCallParticipant extends TdApi.Object {
        public TdApi.MessageSender participantId;
        public int audioSourceId;
        public int screenSharingAudioSourceId;
        public TdApi.GroupCallParticipantVideoInfo videoInfo;
        public TdApi.GroupCallParticipantVideoInfo screenSharingVideoInfo;
        public String bio;
        public boolean isCurrentUser;
        public boolean isSpeaking;
        public boolean isHandRaised;
        public boolean canBeMutedForAllUsers;
        public boolean canBeUnmutedForAllUsers;
        public boolean canBeMutedForCurrentUser;
        public boolean canBeUnmutedForCurrentUser;
        public boolean isMutedForAllUsers;
        public boolean isMutedForCurrentUser;
        public boolean canUnmuteSelf;
        public int volumeLevel;
        public String order;
        public static final int CONSTRUCTOR = 2059182571;

        public GroupCallParticipant() {
        }

        public GroupCallParticipant(TdApi.MessageSender var1, int var2, int var3, TdApi.GroupCallParticipantVideoInfo var4, TdApi.GroupCallParticipantVideoInfo var5, String var6, boolean var7, boolean var8, boolean var9, boolean var10, boolean var11, boolean var12, boolean var13, boolean var14, boolean var15, boolean var16, int var17, String var18) {
            this.participantId = var1;
            this.audioSourceId = var2;
            this.screenSharingAudioSourceId = var3;
            this.videoInfo = var4;
            this.screenSharingVideoInfo = var5;
            this.bio = var6;
            this.isCurrentUser = var7;
            this.isSpeaking = var8;
            this.isHandRaised = var9;
            this.canBeMutedForAllUsers = var10;
            this.canBeUnmutedForAllUsers = var11;
            this.canBeMutedForCurrentUser = var12;
            this.canBeUnmutedForCurrentUser = var13;
            this.isMutedForAllUsers = var14;
            this.isMutedForCurrentUser = var15;
            this.canUnmuteSelf = var16;
            this.volumeLevel = var17;
            this.order = var18;
        }

        public int getConstructor() {
            return 2059182571;
        }
    }

    public static class GroupCallId extends TdApi.Object {
        public int id;
        public static final int CONSTRUCTOR = 350534469;

        public GroupCallId() {
        }

        public GroupCallId(int var1) {
            this.id = var1;
        }

        public int getConstructor() {
            return 350534469;
        }
    }

    public static class GroupCall extends TdApi.Object {
        public int id;
        public String title;
        public int scheduledStartDate;
        public boolean enabledStartNotification;
        public boolean isActive;
        public boolean isRtmpStream;
        public boolean isJoined;
        public boolean needRejoin;
        public boolean canBeManaged;
        public int participantCount;
        public boolean hasHiddenListeners;
        public boolean loadedAllParticipants;
        public TdApi.GroupCallRecentSpeaker[] recentSpeakers;
        public boolean isMyVideoEnabled;
        public boolean isMyVideoPaused;
        public boolean canEnableVideo;
        public boolean muteNewParticipants;
        public boolean canToggleMuteNewParticipants;
        public int recordDuration;
        public boolean isVideoRecorded;
        public int duration;
        public static final int CONSTRUCTOR = -123443355;

        public GroupCall() {
        }

        public GroupCall(int var1, String var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9, int var10, boolean var11, boolean var12, TdApi.GroupCallRecentSpeaker[] var13, boolean var14, boolean var15, boolean var16, boolean var17, boolean var18, int var19, boolean var20, int var21) {
            this.id = var1;
            this.title = var2;
            this.scheduledStartDate = var3;
            this.enabledStartNotification = var4;
            this.isActive = var5;
            this.isRtmpStream = var6;
            this.isJoined = var7;
            this.needRejoin = var8;
            this.canBeManaged = var9;
            this.participantCount = var10;
            this.hasHiddenListeners = var11;
            this.loadedAllParticipants = var12;
            this.recentSpeakers = var13;
            this.isMyVideoEnabled = var14;
            this.isMyVideoPaused = var15;
            this.canEnableVideo = var16;
            this.muteNewParticipants = var17;
            this.canToggleMuteNewParticipants = var18;
            this.recordDuration = var19;
            this.isVideoRecorded = var20;
            this.duration = var21;
        }

        public int getConstructor() {
            return -123443355;
        }
    }

    public static class GameHighScores extends TdApi.Object {
        public TdApi.GameHighScore[] scores;
        public static final int CONSTRUCTOR = -725770727;

        public GameHighScores() {
        }

        public GameHighScores(TdApi.GameHighScore[] var1) {
            this.scores = var1;
        }

        public int getConstructor() {
            return -725770727;
        }
    }

    public static class GameHighScore extends TdApi.Object {
        public int position;
        public long userId;
        public int score;
        public static final int CONSTRUCTOR = 342871838;

        public GameHighScore() {
        }

        public GameHighScore(int var1, long var2, int var4) {
            this.position = var1;
            this.userId = var2;
            this.score = var4;
        }

        public int getConstructor() {
            return 342871838;
        }
    }

    public static class Game extends TdApi.Object {
        public long id;
        public String shortName;
        public String title;
        public TdApi.FormattedText text;
        public String description;
        public TdApi.Photo photo;
        public TdApi.Animation animation;
        public static final int CONSTRUCTOR = -1565597752;

        public Game() {
        }

        public Game(long var1, String var3, String var4, TdApi.FormattedText var5, String var6, TdApi.Photo var7, TdApi.Animation var8) {
            this.id = var1;
            this.shortName = var3;
            this.title = var4;
            this.text = var5;
            this.description = var6;
            this.photo = var7;
            this.animation = var8;
        }

        public int getConstructor() {
            return -1565597752;
        }
    }

    public static class FoundWebApp extends TdApi.Object {
        public TdApi.WebApp webApp;
        public boolean requestWriteAccess;
        public boolean skipConfirmation;
        public static final int CONSTRUCTOR = -290926562;

        public FoundWebApp() {
        }

        public FoundWebApp(TdApi.WebApp var1, boolean var2, boolean var3) {
            this.webApp = var1;
            this.requestWriteAccess = var2;
            this.skipConfirmation = var3;
        }

        public int getConstructor() {
            return -290926562;
        }
    }

    public static class FoundMessages extends TdApi.Object {
        public int totalCount;
        public TdApi.Message[] messages;
        public String nextOffset;
        public static final int CONSTRUCTOR = -529809608;

        public FoundMessages() {
        }

        public FoundMessages(int var1, TdApi.Message[] var2, String var3) {
            this.totalCount = var1;
            this.messages = var2;
            this.nextOffset = var3;
        }

        public int getConstructor() {
            return -529809608;
        }
    }

    public static class FoundFileDownloads extends TdApi.Object {
        public TdApi.DownloadedFileCounts totalCounts;
        public TdApi.FileDownload[] files;
        public String nextOffset;
        public static final int CONSTRUCTOR = 1395890392;

        public FoundFileDownloads() {
        }

        public FoundFileDownloads(TdApi.DownloadedFileCounts var1, TdApi.FileDownload[] var2, String var3) {
            this.totalCounts = var1;
            this.files = var2;
            this.nextOffset = var3;
        }

        public int getConstructor() {
            return 1395890392;
        }
    }

    public static class FoundChatMessages extends TdApi.Object {
        public int totalCount;
        public TdApi.Message[] messages;
        public long nextFromMessageId;
        public static final int CONSTRUCTOR = 427484196;

        public FoundChatMessages() {
        }

        public FoundChatMessages(int var1, TdApi.Message[] var2, long var3) {
            this.totalCount = var1;
            this.messages = var2;
            this.nextFromMessageId = var3;
        }

        public int getConstructor() {
            return 427484196;
        }
    }

    public static class ForumTopics extends TdApi.Object {
        public int totalCount;
        public TdApi.ForumTopic[] topics;
        public int nextOffsetDate;
        public long nextOffsetMessageId;
        public long nextOffsetMessageThreadId;
        public static final int CONSTRUCTOR = 732819537;

        public ForumTopics() {
        }

        public ForumTopics(int var1, TdApi.ForumTopic[] var2, int var3, long var4, long var6) {
            this.totalCount = var1;
            this.topics = var2;
            this.nextOffsetDate = var3;
            this.nextOffsetMessageId = var4;
            this.nextOffsetMessageThreadId = var6;
        }

        public int getConstructor() {
            return 732819537;
        }
    }

    public static class ForumTopicInfo extends TdApi.Object {
        public long messageThreadId;
        public String name;
        public TdApi.ForumTopicIcon icon;
        public int creationDate;
        public TdApi.MessageSender creatorId;
        public boolean isGeneral;
        public boolean isOutgoing;
        public boolean isClosed;
        public boolean isHidden;
        public static final int CONSTRUCTOR = -1879842914;

        public ForumTopicInfo() {
        }

        public ForumTopicInfo(long var1, String var3, TdApi.ForumTopicIcon var4, int var5, TdApi.MessageSender var6, boolean var7, boolean var8, boolean var9, boolean var10) {
            this.messageThreadId = var1;
            this.name = var3;
            this.icon = var4;
            this.creationDate = var5;
            this.creatorId = var6;
            this.isGeneral = var7;
            this.isOutgoing = var8;
            this.isClosed = var9;
            this.isHidden = var10;
        }

        public int getConstructor() {
            return -1879842914;
        }
    }

    public static class ForumTopicIcon extends TdApi.Object {
        public int color;
        public long customEmojiId;
        public static final int CONSTRUCTOR = -818765421;

        public ForumTopicIcon() {
        }

        public ForumTopicIcon(int var1, long var2) {
            this.color = var1;
            this.customEmojiId = var2;
        }

        public int getConstructor() {
            return -818765421;
        }
    }

    public static class ForumTopic extends TdApi.Object {
        public TdApi.ForumTopicInfo info;
        public TdApi.Message lastMessage;
        public boolean isPinned;
        public int unreadCount;
        public long lastReadInboxMessageId;
        public long lastReadOutboxMessageId;
        public int unreadMentionCount;
        public int unreadReactionCount;
        public TdApi.ChatNotificationSettings notificationSettings;
        public TdApi.DraftMessage draftMessage;
        public static final int CONSTRUCTOR = 303279334;

        public ForumTopic() {
        }

        public ForumTopic(TdApi.ForumTopicInfo var1, TdApi.Message var2, boolean var3, int var4, long var5, long var7, int var9, int var10, TdApi.ChatNotificationSettings var11, TdApi.DraftMessage var12) {
            this.info = var1;
            this.lastMessage = var2;
            this.isPinned = var3;
            this.unreadCount = var4;
            this.lastReadInboxMessageId = var5;
            this.lastReadOutboxMessageId = var7;
            this.unreadMentionCount = var9;
            this.unreadReactionCount = var10;
            this.notificationSettings = var11;
            this.draftMessage = var12;
        }

        public int getConstructor() {
            return 303279334;
        }
    }

    public static class FormattedText extends TdApi.Object {
        public String text;
        public TdApi.TextEntity[] entities;
        public static final int CONSTRUCTOR = -252624564;

        public FormattedText() {
        }

        public FormattedText(String var1, TdApi.TextEntity[] var2) {
            this.text = var1;
            this.entities = var2;
        }

        public int getConstructor() {
            return -252624564;
        }
    }

    public static class FirebaseAuthenticationSettingsIos extends TdApi.FirebaseAuthenticationSettings {
        public String deviceToken;
        public boolean isAppSandbox;
        public static final int CONSTRUCTOR = 222930116;

        public FirebaseAuthenticationSettingsIos() {
        }

        public FirebaseAuthenticationSettingsIos(String var1, boolean var2) {
            this.deviceToken = var1;
            this.isAppSandbox = var2;
        }

        public int getConstructor() {
            return 222930116;
        }
    }

    public static class FirebaseAuthenticationSettingsAndroid extends TdApi.FirebaseAuthenticationSettings {
        public static final int CONSTRUCTOR = -1771112932;

        public FirebaseAuthenticationSettingsAndroid() {
        }

        public int getConstructor() {
            return -1771112932;
        }
    }

    public abstract static class FirebaseAuthenticationSettings extends TdApi.Object {
        public FirebaseAuthenticationSettings() {
        }
    }

    public static class FileTypeWallpaper extends TdApi.FileType {
        public static final int CONSTRUCTOR = 1854930076;

        public FileTypeWallpaper() {
        }

        public int getConstructor() {
            return 1854930076;
        }
    }

    public static class FileTypeVoiceNote extends TdApi.FileType {
        public static final int CONSTRUCTOR = -588681661;

        public FileTypeVoiceNote() {
        }

        public int getConstructor() {
            return -588681661;
        }
    }

    public static class FileTypeVideoStory extends TdApi.FileType {
        public static final int CONSTRUCTOR = -2146754143;

        public FileTypeVideoStory() {
        }

        public int getConstructor() {
            return -2146754143;
        }
    }

    public static class FileTypeVideoNote extends TdApi.FileType {
        public static final int CONSTRUCTOR = -518412385;

        public FileTypeVideoNote() {
        }

        public int getConstructor() {
            return -518412385;
        }
    }

    public static class FileTypeVideo extends TdApi.FileType {
        public static final int CONSTRUCTOR = 1430816539;

        public FileTypeVideo() {
        }

        public int getConstructor() {
            return 1430816539;
        }
    }

    public static class FileTypeUnknown extends TdApi.FileType {
        public static final int CONSTRUCTOR = -2011566768;

        public FileTypeUnknown() {
        }

        public int getConstructor() {
            return -2011566768;
        }
    }

    public static class FileTypeThumbnail extends TdApi.FileType {
        public static final int CONSTRUCTOR = -12443298;

        public FileTypeThumbnail() {
        }

        public int getConstructor() {
            return -12443298;
        }
    }

    public static class FileTypeSticker extends TdApi.FileType {
        public static final int CONSTRUCTOR = 475233385;

        public FileTypeSticker() {
        }

        public int getConstructor() {
            return 475233385;
        }
    }

    public static class FileTypeSecure extends TdApi.FileType {
        public static final int CONSTRUCTOR = -1419133146;

        public FileTypeSecure() {
        }

        public int getConstructor() {
            return -1419133146;
        }
    }

    public static class FileTypeSecretThumbnail extends TdApi.FileType {
        public static final int CONSTRUCTOR = -1401326026;

        public FileTypeSecretThumbnail() {
        }

        public int getConstructor() {
            return -1401326026;
        }
    }

    public static class FileTypeSecret extends TdApi.FileType {
        public static final int CONSTRUCTOR = -1871899401;

        public FileTypeSecret() {
        }

        public int getConstructor() {
            return -1871899401;
        }
    }

    public static class FileTypeProfilePhoto extends TdApi.FileType {
        public static final int CONSTRUCTOR = 1795089315;

        public FileTypeProfilePhoto() {
        }

        public int getConstructor() {
            return 1795089315;
        }
    }

    public static class FileTypePhotoStory extends TdApi.FileType {
        public static final int CONSTRUCTOR = 2018995956;

        public FileTypePhotoStory() {
        }

        public int getConstructor() {
            return 2018995956;
        }
    }

    public static class FileTypePhoto extends TdApi.FileType {
        public static final int CONSTRUCTOR = -1718914651;

        public FileTypePhoto() {
        }

        public int getConstructor() {
            return -1718914651;
        }
    }

    public static class FileTypeNotificationSound extends TdApi.FileType {
        public static final int CONSTRUCTOR = -1020289271;

        public FileTypeNotificationSound() {
        }

        public int getConstructor() {
            return -1020289271;
        }
    }

    public static class FileTypeDocument extends TdApi.FileType {
        public static final int CONSTRUCTOR = -564722929;

        public FileTypeDocument() {
        }

        public int getConstructor() {
            return -564722929;
        }
    }

    public static class FileTypeAudio extends TdApi.FileType {
        public static final int CONSTRUCTOR = -709112160;

        public FileTypeAudio() {
        }

        public int getConstructor() {
            return -709112160;
        }
    }

    public static class FileTypeAnimation extends TdApi.FileType {
        public static final int CONSTRUCTOR = -290816582;

        public FileTypeAnimation() {
        }

        public int getConstructor() {
            return -290816582;
        }
    }

    public static class FileTypeNone extends TdApi.FileType {
        public static final int CONSTRUCTOR = 2003009189;

        public FileTypeNone() {
        }

        public int getConstructor() {
            return 2003009189;
        }
    }

    public abstract static class FileType extends TdApi.Object {
        public FileType() {
        }
    }

    public static class FilePart extends TdApi.Object {
        public byte[] data;
        public static final int CONSTRUCTOR = 911821878;

        public FilePart() {
        }

        public FilePart(byte[] var1) {
            this.data = var1;
        }

        public int getConstructor() {
            return 911821878;
        }
    }

    public static class FileDownloadedPrefixSize extends TdApi.Object {
        public long size;
        public static final int CONSTRUCTOR = -2015205381;

        public FileDownloadedPrefixSize() {
        }

        public FileDownloadedPrefixSize(long var1) {
            this.size = var1;
        }

        public int getConstructor() {
            return -2015205381;
        }
    }

    public static class FileDownload extends TdApi.Object {
        public int fileId;
        public TdApi.Message message;
        public int addDate;
        public int completeDate;
        public boolean isPaused;
        public static final int CONSTRUCTOR = -2092100780;

        public FileDownload() {
        }

        public FileDownload(int var1, TdApi.Message var2, int var3, int var4, boolean var5) {
            this.fileId = var1;
            this.message = var2;
            this.addDate = var3;
            this.completeDate = var4;
            this.isPaused = var5;
        }

        public int getConstructor() {
            return -2092100780;
        }
    }

    public static class     File extends TdApi.Object {
        public int id;
        public long size;
        public long expectedSize;
        public TdApi.LocalFile local;
        public TdApi.RemoteFile remote;
        public static final int CONSTRUCTOR = 1263291956;

        public File() {
        }

        public File(int var1, long var2, long var4, TdApi.LocalFile var6, TdApi.RemoteFile var7) {
            this.id = var1;
            this.size = var2;
            this.expectedSize = var4;
            this.local = var6;
            this.remote = var7;
        }

        public int getConstructor() {
            return 1263291956;
        }
    }

    public static class Error extends TdApi.Object {
        public int code;
        public String message;
        public static final int CONSTRUCTOR = -1679978726;

        public Error() {
        }

        public Error(int var1, String var2) {
            this.code = var1;
            this.message = var2;
        }

        public int getConstructor() {
            return -1679978726;
        }
    }

    public static class EncryptedPassportElement extends TdApi.Object {
        public TdApi.PassportElementType type;
        public byte[] data;
        public TdApi.DatedFile frontSide;
        public TdApi.DatedFile reverseSide;
        public TdApi.DatedFile selfie;
        public TdApi.DatedFile[] translation;
        public TdApi.DatedFile[] files;
        public String value;
        public String hash;
        public static final int CONSTRUCTOR = 2002386193;

        public EncryptedPassportElement() {
        }

        public EncryptedPassportElement(TdApi.PassportElementType var1, byte[] var2, TdApi.DatedFile var3, TdApi.DatedFile var4, TdApi.DatedFile var5, TdApi.DatedFile[] var6, TdApi.DatedFile[] var7, String var8, String var9) {
            this.type = var1;
            this.data = var2;
            this.frontSide = var3;
            this.reverseSide = var4;
            this.selfie = var5;
            this.translation = var6;
            this.files = var7;
            this.value = var8;
            this.hash = var9;
        }

        public int getConstructor() {
            return 2002386193;
        }
    }

    public static class EncryptedCredentials extends TdApi.Object {
        public byte[] data;
        public byte[] hash;
        public byte[] secret;
        public static final int CONSTRUCTOR = 1331106766;

        public EncryptedCredentials() {
        }

        public EncryptedCredentials(byte[] var1, byte[] var2, byte[] var3) {
            this.data = var1;
            this.hash = var2;
            this.secret = var3;
        }

        public int getConstructor() {
            return 1331106766;
        }
    }

    public static class Emojis extends TdApi.Object {
        public String[] emojis;
        public static final int CONSTRUCTOR = 950339552;

        public Emojis() {
        }

        public Emojis(String[] var1) {
            this.emojis = var1;
        }

        public int getConstructor() {
            return 950339552;
        }
    }

    public static class EmojiStatuses extends TdApi.Object {
        public long[] customEmojiIds;
        public static final int CONSTRUCTOR = -377859594;

        public EmojiStatuses() {
        }

        public EmojiStatuses(long[] var1) {
            this.customEmojiIds = var1;
        }

        public int getConstructor() {
            return -377859594;
        }
    }

    public static class EmojiStatus extends TdApi.Object {
        public long customEmojiId;
        public int expirationDate;
        public static final int CONSTRUCTOR = -606529994;

        public EmojiStatus() {
        }

        public EmojiStatus(long var1, int var3) {
            this.customEmojiId = var1;
            this.expirationDate = var3;
        }

        public int getConstructor() {
            return -606529994;
        }
    }

    public static class EmojiReaction extends TdApi.Object {
        public String emoji;
        public String title;
        public boolean isActive;
        public TdApi.Sticker staticIcon;
        public TdApi.Sticker appearAnimation;
        public TdApi.Sticker selectAnimation;
        public TdApi.Sticker activateAnimation;
        public TdApi.Sticker effectAnimation;
        public TdApi.Sticker aroundAnimation;
        public TdApi.Sticker centerAnimation;
        public static final int CONSTRUCTOR = 1616063583;

        public EmojiReaction() {
        }

        public EmojiReaction(String var1, String var2, boolean var3, TdApi.Sticker var4, TdApi.Sticker var5, TdApi.Sticker var6, TdApi.Sticker var7, TdApi.Sticker var8, TdApi.Sticker var9, TdApi.Sticker var10) {
            this.emoji = var1;
            this.title = var2;
            this.isActive = var3;
            this.staticIcon = var4;
            this.appearAnimation = var5;
            this.selectAnimation = var6;
            this.activateAnimation = var7;
            this.effectAnimation = var8;
            this.aroundAnimation = var9;
            this.centerAnimation = var10;
        }

        public int getConstructor() {
            return 1616063583;
        }
    }

    public static class EmojiCategoryTypeChatPhoto extends TdApi.EmojiCategoryType {
        public static final int CONSTRUCTOR = 1059063081;

        public EmojiCategoryTypeChatPhoto() {
        }

        public int getConstructor() {
            return 1059063081;
        }
    }

    public static class EmojiCategoryTypeEmojiStatus extends TdApi.EmojiCategoryType {
        public static final int CONSTRUCTOR = 1381282631;

        public EmojiCategoryTypeEmojiStatus() {
        }

        public int getConstructor() {
            return 1381282631;
        }
    }

    public static class EmojiCategoryTypeDefault extends TdApi.EmojiCategoryType {
        public static final int CONSTRUCTOR = 1188782699;

        public EmojiCategoryTypeDefault() {
        }

        public int getConstructor() {
            return 1188782699;
        }
    }

    public abstract static class EmojiCategoryType extends TdApi.Object {
        public EmojiCategoryType() {
        }
    }

    public static class EmojiCategory extends TdApi.Object {
        public String name;
        public TdApi.Sticker icon;
        public String[] emojis;
        public static final int CONSTRUCTOR = 1019393600;

        public EmojiCategory() {
        }

        public EmojiCategory(String var1, TdApi.Sticker var2, String[] var3) {
            this.name = var1;
            this.icon = var2;
            this.emojis = var3;
        }

        public int getConstructor() {
            return 1019393600;
        }
    }

    public static class EmojiCategories extends TdApi.Object {
        public TdApi.EmojiCategory[] categories;
        public static final int CONSTRUCTOR = -1455387824;

        public EmojiCategories() {
        }

        public EmojiCategories(TdApi.EmojiCategory[] var1) {
            this.categories = var1;
        }

        public int getConstructor() {
            return -1455387824;
        }
    }

    public static class EmailAddressResetStatePending extends TdApi.EmailAddressResetState {
        public int resetIn;
        public static final int CONSTRUCTOR = -1885966805;

        public EmailAddressResetStatePending() {
        }

        public EmailAddressResetStatePending(int var1) {
            this.resetIn = var1;
        }

        public int getConstructor() {
            return -1885966805;
        }
    }

    public static class EmailAddressResetStateAvailable extends TdApi.EmailAddressResetState {
        public int waitPeriod;
        public static final int CONSTRUCTOR = -1917177600;

        public EmailAddressResetStateAvailable() {
        }

        public EmailAddressResetStateAvailable(int var1) {
            this.waitPeriod = var1;
        }

        public int getConstructor() {
            return -1917177600;
        }
    }

    public abstract static class EmailAddressResetState extends TdApi.Object {
        public EmailAddressResetState() {
        }
    }

    public static class EmailAddressAuthenticationCodeInfo extends TdApi.Object {
        public String emailAddressPattern;
        public int length;
        public static final int CONSTRUCTOR = 1151066659;

        public EmailAddressAuthenticationCodeInfo() {
        }

        public EmailAddressAuthenticationCodeInfo(String var1, int var2) {
            this.emailAddressPattern = var1;
            this.length = var2;
        }

        public int getConstructor() {
            return 1151066659;
        }
    }

    public static class EmailAddressAuthenticationGoogleId extends TdApi.EmailAddressAuthentication {
        public String token;
        public static final int CONSTRUCTOR = -19142846;

        public EmailAddressAuthenticationGoogleId() {
        }

        public EmailAddressAuthenticationGoogleId(String var1) {
            this.token = var1;
        }

        public int getConstructor() {
            return -19142846;
        }
    }

    public static class EmailAddressAuthenticationAppleId extends TdApi.EmailAddressAuthentication {
        public String token;
        public static final int CONSTRUCTOR = 633948265;

        public EmailAddressAuthenticationAppleId() {
        }

        public EmailAddressAuthenticationAppleId(String var1) {
            this.token = var1;
        }

        public int getConstructor() {
            return 633948265;
        }
    }

    public static class EmailAddressAuthenticationCode extends TdApi.EmailAddressAuthentication {
        public String code;
        public static final int CONSTRUCTOR = -993257022;

        public EmailAddressAuthenticationCode() {
        }

        public EmailAddressAuthenticationCode(String var1) {
            this.code = var1;
        }

        public int getConstructor() {
            return -993257022;
        }
    }

    public abstract static class EmailAddressAuthentication extends TdApi.Object {
        public EmailAddressAuthentication() {
        }
    }

    public static class DraftMessage extends TdApi.Object {
        public long replyToMessageId;
        public int date;
        public TdApi.InputMessageContent inputMessageText;
        public static final int CONSTRUCTOR = 1373050112;

        public DraftMessage() {
        }

        public DraftMessage(long var1, int var3, TdApi.InputMessageContent var4) {
            this.replyToMessageId = var1;
            this.date = var3;
            this.inputMessageText = var4;
        }

        public int getConstructor() {
            return 1373050112;
        }
    }

    public static class DownloadedFileCounts extends TdApi.Object {
        public int activeCount;
        public int pausedCount;
        public int completedCount;
        public static final int CONSTRUCTOR = -1973999550;

        public DownloadedFileCounts() {
        }

        public DownloadedFileCounts(int var1, int var2, int var3) {
            this.activeCount = var1;
            this.pausedCount = var2;
            this.completedCount = var3;
        }

        public int getConstructor() {
            return -1973999550;
        }
    }

    public static class Document extends TdApi.Object {
        public String fileName;
        public String mimeType;
        public TdApi.Minithumbnail minithumbnail;
        public TdApi.Thumbnail thumbnail;
        public TdApi.File document;
        public static final int CONSTRUCTOR = -1357271080;

        public Document() {
        }

        public Document(String var1, String var2, TdApi.Minithumbnail var3, TdApi.Thumbnail var4, TdApi.File var5) {
            this.fileName = var1;
            this.mimeType = var2;
            this.minithumbnail = var3;
            this.thumbnail = var4;
            this.document = var5;
        }

        public int getConstructor() {
            return -1357271080;
        }
    }

    public static class DiceStickersSlotMachine extends TdApi.DiceStickers {
        public TdApi.Sticker background;
        public TdApi.Sticker lever;
        public TdApi.Sticker leftReel;
        public TdApi.Sticker centerReel;
        public TdApi.Sticker rightReel;
        public static final int CONSTRUCTOR = -375223124;

        public DiceStickersSlotMachine() {
        }

        public DiceStickersSlotMachine(TdApi.Sticker var1, TdApi.Sticker var2, TdApi.Sticker var3, TdApi.Sticker var4, TdApi.Sticker var5) {
            this.background = var1;
            this.lever = var2;
            this.leftReel = var3;
            this.centerReel = var4;
            this.rightReel = var5;
        }

        public int getConstructor() {
            return -375223124;
        }
    }

    public static class DiceStickersRegular extends TdApi.DiceStickers {
        public TdApi.Sticker sticker;
        public static final int CONSTRUCTOR = -740299570;

        public DiceStickersRegular() {
        }

        public DiceStickersRegular(TdApi.Sticker var1) {
            this.sticker = var1;
        }

        public int getConstructor() {
            return -740299570;
        }
    }

    public abstract static class DiceStickers extends TdApi.Object {
        public DiceStickers() {
        }
    }

    public static class DeviceTokenHuaweiPush extends TdApi.DeviceToken {
        public String token;
        public boolean encrypt;
        public static final int CONSTRUCTOR = 1989103142;

        public DeviceTokenHuaweiPush() {
        }

        public DeviceTokenHuaweiPush(String var1, boolean var2) {
            this.token = var1;
            this.encrypt = var2;
        }

        public int getConstructor() {
            return 1989103142;
        }
    }

    public static class DeviceTokenTizenPush extends TdApi.DeviceToken {
        public String regId;
        public static final int CONSTRUCTOR = -1359947213;

        public DeviceTokenTizenPush() {
        }

        public DeviceTokenTizenPush(String var1) {
            this.regId = var1;
        }

        public int getConstructor() {
            return -1359947213;
        }
    }

    public static class DeviceTokenBlackBerryPush extends TdApi.DeviceToken {
        public String token;
        public static final int CONSTRUCTOR = 1559167234;

        public DeviceTokenBlackBerryPush() {
        }

        public DeviceTokenBlackBerryPush(String var1) {
            this.token = var1;
        }

        public int getConstructor() {
            return 1559167234;
        }
    }

    public static class DeviceTokenUbuntuPush extends TdApi.DeviceToken {
        public String token;
        public static final int CONSTRUCTOR = 1782320422;

        public DeviceTokenUbuntuPush() {
        }

        public DeviceTokenUbuntuPush(String var1) {
            this.token = var1;
        }

        public int getConstructor() {
            return 1782320422;
        }
    }

    public static class DeviceTokenSimplePush extends TdApi.DeviceToken {
        public String endpoint;
        public static final int CONSTRUCTOR = 49584736;

        public DeviceTokenSimplePush() {
        }

        public DeviceTokenSimplePush(String var1) {
            this.endpoint = var1;
        }

        public int getConstructor() {
            return 49584736;
        }
    }

    public static class DeviceTokenWebPush extends TdApi.DeviceToken {
        public String endpoint;
        public String p256dhBase64url;
        public String authBase64url;
        public static final int CONSTRUCTOR = -1694507273;

        public DeviceTokenWebPush() {
        }

        public DeviceTokenWebPush(String var1, String var2, String var3) {
            this.endpoint = var1;
            this.p256dhBase64url = var2;
            this.authBase64url = var3;
        }

        public int getConstructor() {
            return -1694507273;
        }
    }

    public static class DeviceTokenMicrosoftPushVoIP extends TdApi.DeviceToken {
        public String channelUri;
        public static final int CONSTRUCTOR = -785603759;

        public DeviceTokenMicrosoftPushVoIP() {
        }

        public DeviceTokenMicrosoftPushVoIP(String var1) {
            this.channelUri = var1;
        }

        public int getConstructor() {
            return -785603759;
        }
    }

    public static class DeviceTokenMicrosoftPush extends TdApi.DeviceToken {
        public String channelUri;
        public static final int CONSTRUCTOR = 1224269900;

        public DeviceTokenMicrosoftPush() {
        }

        public DeviceTokenMicrosoftPush(String var1) {
            this.channelUri = var1;
        }

        public int getConstructor() {
            return 1224269900;
        }
    }

    public static class DeviceTokenWindowsPush extends TdApi.DeviceToken {
        public String accessToken;
        public static final int CONSTRUCTOR = -1410514289;

        public DeviceTokenWindowsPush() {
        }

        public DeviceTokenWindowsPush(String var1) {
            this.accessToken = var1;
        }

        public int getConstructor() {
            return -1410514289;
        }
    }

    public static class DeviceTokenApplePushVoIP extends TdApi.DeviceToken {
        public String deviceToken;
        public boolean isAppSandbox;
        public boolean encrypt;
        public static final int CONSTRUCTOR = 804275689;

        public DeviceTokenApplePushVoIP() {
        }

        public DeviceTokenApplePushVoIP(String var1, boolean var2, boolean var3) {
            this.deviceToken = var1;
            this.isAppSandbox = var2;
            this.encrypt = var3;
        }

        public int getConstructor() {
            return 804275689;
        }
    }

    public static class DeviceTokenApplePush extends TdApi.DeviceToken {
        public String deviceToken;
        public boolean isAppSandbox;
        public static final int CONSTRUCTOR = 387541955;

        public DeviceTokenApplePush() {
        }

        public DeviceTokenApplePush(String var1, boolean var2) {
            this.deviceToken = var1;
            this.isAppSandbox = var2;
        }

        public int getConstructor() {
            return 387541955;
        }
    }

    public static class DeviceTokenFirebaseCloudMessaging extends TdApi.DeviceToken {
        public String token;
        public boolean encrypt;
        public static final int CONSTRUCTOR = -797881849;

        public DeviceTokenFirebaseCloudMessaging() {
        }

        public DeviceTokenFirebaseCloudMessaging(String var1, boolean var2) {
            this.token = var1;
            this.encrypt = var2;
        }

        public int getConstructor() {
            return -797881849;
        }
    }

    public abstract static class DeviceToken extends TdApi.Object {
        public DeviceToken() {
        }
    }

    public static class DeepLinkInfo extends TdApi.Object {
        public TdApi.FormattedText text;
        public boolean needUpdateApplication;
        public static final int CONSTRUCTOR = 1864081662;

        public DeepLinkInfo() {
        }

        public DeepLinkInfo(TdApi.FormattedText var1, boolean var2) {
            this.text = var1;
            this.needUpdateApplication = var2;
        }

        public int getConstructor() {
            return 1864081662;
        }
    }

    public static class DatedFile extends TdApi.Object {
        public TdApi.File file;
        public int date;
        public static final int CONSTRUCTOR = -1840795491;

        public DatedFile() {
        }

        public DatedFile(TdApi.File var1, int var2) {
            this.file = var1;
            this.date = var2;
        }

        public int getConstructor() {
            return -1840795491;
        }
    }

    public static class DateRange extends TdApi.Object {
        public int startDate;
        public int endDate;
        public static final int CONSTRUCTOR = 1360333926;

        public DateRange() {
        }

        public DateRange(int var1, int var2) {
            this.startDate = var1;
            this.endDate = var2;
        }

        public int getConstructor() {
            return 1360333926;
        }
    }

    public static class Date extends TdApi.Object {
        public int day;
        public int month;
        public int year;
        public static final int CONSTRUCTOR = -277956960;

        public Date() {
        }

        public Date(int var1, int var2, int var3) {
            this.day = var1;
            this.month = var2;
            this.year = var3;
        }

        public int getConstructor() {
            return -277956960;
        }
    }

    public static class DatabaseStatistics extends TdApi.Object {
        public String statistics;
        public static final int CONSTRUCTOR = -1123912880;

        public DatabaseStatistics() {
        }

        public DatabaseStatistics(String var1) {
            this.statistics = var1;
        }

        public int getConstructor() {
            return -1123912880;
        }
    }

    public static class CustomRequestResult extends TdApi.Object {
        public String result;
        public static final int CONSTRUCTOR = -2009960452;

        public CustomRequestResult() {
        }

        public CustomRequestResult(String var1) {
            this.result = var1;
        }

        public int getConstructor() {
            return -2009960452;
        }
    }

    public static class CountryInfo extends TdApi.Object {
        public String countryCode;
        public String name;
        public String englishName;
        public boolean isHidden;
        public String[] callingCodes;
        public static final int CONSTRUCTOR = 1617195722;

        public CountryInfo() {
        }

        public CountryInfo(String var1, String var2, String var3, boolean var4, String[] var5) {
            this.countryCode = var1;
            this.name = var2;
            this.englishName = var3;
            this.isHidden = var4;
            this.callingCodes = var5;
        }

        public int getConstructor() {
            return 1617195722;
        }
    }

    public static class Countries extends TdApi.Object {
        public TdApi.CountryInfo[] countries;
        public static final int CONSTRUCTOR = 1854211813;

        public Countries() {
        }

        public Countries(TdApi.CountryInfo[] var1) {
            this.countries = var1;
        }

        public int getConstructor() {
            return 1854211813;
        }
    }

    public static class Count extends TdApi.Object {
        public int count;
        public static final int CONSTRUCTOR = 1295577348;

        public Count() {
        }

        public Count(int var1) {
            this.count = var1;
        }

        public int getConstructor() {
            return 1295577348;
        }
    }

    public static class Contact extends TdApi.Object {
        public String phoneNumber;
        public String firstName;
        public String lastName;
        public String vcard;
        public long userId;
        public static final int CONSTRUCTOR = -1993844876;

        public Contact() {
        }

        public Contact(String var1, String var2, String var3, String var4, long var5) {
            this.phoneNumber = var1;
            this.firstName = var2;
            this.lastName = var3;
            this.vcard = var4;
            this.userId = var5;
        }

        public int getConstructor() {
            return -1993844876;
        }
    }

    public static class ConnectionStateReady extends TdApi.ConnectionState {
        public static final int CONSTRUCTOR = 48608492;

        public ConnectionStateReady() {
        }

        public int getConstructor() {
            return 48608492;
        }
    }

    public static class ConnectionStateUpdating extends TdApi.ConnectionState {
        public static final int CONSTRUCTOR = -188104009;

        public ConnectionStateUpdating() {
        }

        public int getConstructor() {
            return -188104009;
        }
    }

    public static class ConnectionStateConnecting extends TdApi.ConnectionState {
        public static final int CONSTRUCTOR = -1298400670;

        public ConnectionStateConnecting() {
        }

        public int getConstructor() {
            return -1298400670;
        }
    }

    public static class ConnectionStateConnectingToProxy extends TdApi.ConnectionState {
        public static final int CONSTRUCTOR = -93187239;

        public ConnectionStateConnectingToProxy() {
        }

        public int getConstructor() {
            return -93187239;
        }
    }

    public static class ConnectionStateWaitingForNetwork extends TdApi.ConnectionState {
        public static final int CONSTRUCTOR = 1695405912;

        public ConnectionStateWaitingForNetwork() {
        }

        public int getConstructor() {
            return 1695405912;
        }
    }

    public abstract static class ConnectionState extends TdApi.Object {
        public ConnectionState() {
        }
    }

    public static class ConnectedWebsites extends TdApi.Object {
        public TdApi.ConnectedWebsite[] websites;
        public static final int CONSTRUCTOR = -1727949694;

        public ConnectedWebsites() {
        }

        public ConnectedWebsites(TdApi.ConnectedWebsite[] var1) {
            this.websites = var1;
        }

        public int getConstructor() {
            return -1727949694;
        }
    }

    public static class ConnectedWebsite extends TdApi.Object {
        public long id;
        public String domainName;
        public long botUserId;
        public String browser;
        public String platform;
        public int logInDate;
        public int lastActiveDate;
        public String ip;
        public String location;
        public static final int CONSTRUCTOR = 844014445;

        public ConnectedWebsite() {
        }

        public ConnectedWebsite(long var1, String var3, long var4, String var6, String var7, int var8, int var9, String var10, String var11) {
            this.id = var1;
            this.domainName = var3;
            this.botUserId = var4;
            this.browser = var6;
            this.platform = var7;
            this.logInDate = var8;
            this.lastActiveDate = var9;
            this.ip = var10;
            this.location = var11;
        }

        public int getConstructor() {
            return 844014445;
        }
    }

    public static class ClosedVectorPath extends TdApi.Object {
        public TdApi.VectorPathCommand[] commands;
        public static final int CONSTRUCTOR = 589951657;

        public ClosedVectorPath() {
        }

        public ClosedVectorPath(TdApi.VectorPathCommand[] var1) {
            this.commands = var1;
        }

        public int getConstructor() {
            return 589951657;
        }
    }

    public static class CheckStickerSetNameResultNameOccupied extends TdApi.CheckStickerSetNameResult {
        public static final int CONSTRUCTOR = 1012980872;

        public CheckStickerSetNameResultNameOccupied() {
        }

        public int getConstructor() {
            return 1012980872;
        }
    }

    public static class CheckStickerSetNameResultNameInvalid extends TdApi.CheckStickerSetNameResult {
        public static final int CONSTRUCTOR = 177992244;

        public CheckStickerSetNameResultNameInvalid() {
        }

        public int getConstructor() {
            return 177992244;
        }
    }

    public static class CheckStickerSetNameResultOk extends TdApi.CheckStickerSetNameResult {
        public static final int CONSTRUCTOR = -1404308904;

        public CheckStickerSetNameResultOk() {
        }

        public int getConstructor() {
            return -1404308904;
        }
    }

    public abstract static class CheckStickerSetNameResult extends TdApi.Object {
        public CheckStickerSetNameResult() {
        }
    }

    public static class CheckChatUsernameResultPublicGroupsUnavailable extends TdApi.CheckChatUsernameResult {
        public static final int CONSTRUCTOR = -51833641;

        public CheckChatUsernameResultPublicGroupsUnavailable() {
        }

        public int getConstructor() {
            return -51833641;
        }
    }

    public static class CheckChatUsernameResultPublicChatsTooMany extends TdApi.CheckChatUsernameResult {
        public static final int CONSTRUCTOR = -659264388;

        public CheckChatUsernameResultPublicChatsTooMany() {
        }

        public int getConstructor() {
            return -659264388;
        }
    }

    public static class CheckChatUsernameResultUsernamePurchasable extends TdApi.CheckChatUsernameResult {
        public static final int CONSTRUCTOR = 5885529;

        public CheckChatUsernameResultUsernamePurchasable() {
        }

        public int getConstructor() {
            return 5885529;
        }
    }

    public static class CheckChatUsernameResultUsernameOccupied extends TdApi.CheckChatUsernameResult {
        public static final int CONSTRUCTOR = 1320892201;

        public CheckChatUsernameResultUsernameOccupied() {
        }

        public int getConstructor() {
            return 1320892201;
        }
    }

    public static class CheckChatUsernameResultUsernameInvalid extends TdApi.CheckChatUsernameResult {
        public static final int CONSTRUCTOR = -636979370;

        public CheckChatUsernameResultUsernameInvalid() {
        }

        public int getConstructor() {
            return -636979370;
        }
    }

    public static class CheckChatUsernameResultOk extends TdApi.CheckChatUsernameResult {
        public static final int CONSTRUCTOR = -1498956964;

        public CheckChatUsernameResultOk() {
        }

        public int getConstructor() {
            return -1498956964;
        }
    }

    public abstract static class CheckChatUsernameResult extends TdApi.Object {
        public CheckChatUsernameResult() {
        }
    }

    public static class ChatsNearby extends TdApi.Object {
        public TdApi.ChatNearby[] usersNearby;
        public TdApi.ChatNearby[] supergroupsNearby;
        public static final int CONSTRUCTOR = 187746081;

        public ChatsNearby() {
        }

        public ChatsNearby(TdApi.ChatNearby[] var1, TdApi.ChatNearby[] var2) {
            this.usersNearby = var1;
            this.supergroupsNearby = var2;
        }

        public int getConstructor() {
            return 187746081;
        }
    }

    public static class Chats extends TdApi.Object {
        public int totalCount;
        public long[] chatIds;
        public static final int CONSTRUCTOR = 1809654812;

        public Chats() {
        }

        public Chats(int var1, long[] var2) {
            this.totalCount = var1;
            this.chatIds = var2;
        }

        public int getConstructor() {
            return 1809654812;
        }
    }

    public static class ChatTypeSecret extends TdApi.ChatType {
        public int secretChatId;
        public long userId;
        public static final int CONSTRUCTOR = 862366513;

        public ChatTypeSecret() {
        }

        public ChatTypeSecret(int var1, long var2) {
            this.secretChatId = var1;
            this.userId = var2;
        }

        public int getConstructor() {
            return 862366513;
        }
    }

    public static class ChatTypeSupergroup extends TdApi.ChatType {
        public long supergroupId;
        public boolean isChannel;
        public static final int CONSTRUCTOR = -1472570774;

        public ChatTypeSupergroup() {
        }

        public ChatTypeSupergroup(long var1, boolean var3) {
            this.supergroupId = var1;
            this.isChannel = var3;
        }

        public int getConstructor() {
            return -1472570774;
        }
    }

    public static class ChatTypeBasicGroup extends TdApi.ChatType {
        public long basicGroupId;
        public static final int CONSTRUCTOR = 973884508;

        public ChatTypeBasicGroup() {
        }

        public ChatTypeBasicGroup(long var1) {
            this.basicGroupId = var1;
        }

        public int getConstructor() {
            return 973884508;
        }
    }

    public static class ChatTypePrivate extends TdApi.ChatType {
        public long userId;
        public static final int CONSTRUCTOR = 1579049844;

        public ChatTypePrivate() {
        }

        public ChatTypePrivate(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return 1579049844;
        }
    }

    public abstract static class ChatType extends TdApi.Object {
        public ChatType() {
        }
    }

    public static class ChatTheme extends TdApi.Object {
        public String name;
        public TdApi.ThemeSettings lightSettings;
        public TdApi.ThemeSettings darkSettings;
        public static final int CONSTRUCTOR = -113218503;

        public ChatTheme() {
        }

        public ChatTheme(String var1, TdApi.ThemeSettings var2, TdApi.ThemeSettings var3) {
            this.name = var1;
            this.lightSettings = var2;
            this.darkSettings = var3;
        }

        public int getConstructor() {
            return -113218503;
        }
    }

    public static class ChatStatisticsMessageSenderInfo extends TdApi.Object {
        public long userId;
        public int sentMessageCount;
        public int averageCharacterCount;
        public static final int CONSTRUCTOR = 1762295371;

        public ChatStatisticsMessageSenderInfo() {
        }

        public ChatStatisticsMessageSenderInfo(long var1, int var3, int var4) {
            this.userId = var1;
            this.sentMessageCount = var3;
            this.averageCharacterCount = var4;
        }

        public int getConstructor() {
            return 1762295371;
        }
    }

    public static class ChatStatisticsMessageInteractionInfo extends TdApi.Object {
        public long messageId;
        public int viewCount;
        public int forwardCount;
        public static final int CONSTRUCTOR = -765580756;

        public ChatStatisticsMessageInteractionInfo() {
        }

        public ChatStatisticsMessageInteractionInfo(long var1, int var3, int var4) {
            this.messageId = var1;
            this.viewCount = var3;
            this.forwardCount = var4;
        }

        public int getConstructor() {
            return -765580756;
        }
    }

    public static class ChatStatisticsInviterInfo extends TdApi.Object {
        public long userId;
        public int addedMemberCount;
        public static final int CONSTRUCTOR = 629396619;

        public ChatStatisticsInviterInfo() {
        }

        public ChatStatisticsInviterInfo(long var1, int var3) {
            this.userId = var1;
            this.addedMemberCount = var3;
        }

        public int getConstructor() {
            return 629396619;
        }
    }

    public static class ChatStatisticsAdministratorActionsInfo extends TdApi.Object {
        public long userId;
        public int deletedMessageCount;
        public int bannedUserCount;
        public int restrictedUserCount;
        public static final int CONSTRUCTOR = -406467202;

        public ChatStatisticsAdministratorActionsInfo() {
        }

        public ChatStatisticsAdministratorActionsInfo(long var1, int var3, int var4, int var5) {
            this.userId = var1;
            this.deletedMessageCount = var3;
            this.bannedUserCount = var4;
            this.restrictedUserCount = var5;
        }

        public int getConstructor() {
            return -406467202;
        }
    }

    public static class ChatStatisticsChannel extends TdApi.ChatStatistics {
        public TdApi.DateRange period;
        public TdApi.StatisticalValue memberCount;
        public TdApi.StatisticalValue meanViewCount;
        public TdApi.StatisticalValue meanShareCount;
        public double enabledNotificationsPercentage;
        public TdApi.StatisticalGraph memberCountGraph;
        public TdApi.StatisticalGraph joinGraph;
        public TdApi.StatisticalGraph muteGraph;
        public TdApi.StatisticalGraph viewCountByHourGraph;
        public TdApi.StatisticalGraph viewCountBySourceGraph;
        public TdApi.StatisticalGraph joinBySourceGraph;
        public TdApi.StatisticalGraph languageGraph;
        public TdApi.StatisticalGraph messageInteractionGraph;
        public TdApi.StatisticalGraph instantViewInteractionGraph;
        public TdApi.ChatStatisticsMessageInteractionInfo[] recentMessageInteractions;
        public static final int CONSTRUCTOR = -825434183;

        public ChatStatisticsChannel() {
        }

        public ChatStatisticsChannel(TdApi.DateRange var1, TdApi.StatisticalValue var2, TdApi.StatisticalValue var3, TdApi.StatisticalValue var4, double var5, TdApi.StatisticalGraph var7, TdApi.StatisticalGraph var8, TdApi.StatisticalGraph var9, TdApi.StatisticalGraph var10, TdApi.StatisticalGraph var11, TdApi.StatisticalGraph var12, TdApi.StatisticalGraph var13, TdApi.StatisticalGraph var14, TdApi.StatisticalGraph var15, TdApi.ChatStatisticsMessageInteractionInfo[] var16) {
            this.period = var1;
            this.memberCount = var2;
            this.meanViewCount = var3;
            this.meanShareCount = var4;
            this.enabledNotificationsPercentage = var5;
            this.memberCountGraph = var7;
            this.joinGraph = var8;
            this.muteGraph = var9;
            this.viewCountByHourGraph = var10;
            this.viewCountBySourceGraph = var11;
            this.joinBySourceGraph = var12;
            this.languageGraph = var13;
            this.messageInteractionGraph = var14;
            this.instantViewInteractionGraph = var15;
            this.recentMessageInteractions = var16;
        }

        public int getConstructor() {
            return -825434183;
        }
    }

    public static class ChatStatisticsSupergroup extends TdApi.ChatStatistics {
        public TdApi.DateRange period;
        public TdApi.StatisticalValue memberCount;
        public TdApi.StatisticalValue messageCount;
        public TdApi.StatisticalValue viewerCount;
        public TdApi.StatisticalValue senderCount;
        public TdApi.StatisticalGraph memberCountGraph;
        public TdApi.StatisticalGraph joinGraph;
        public TdApi.StatisticalGraph joinBySourceGraph;
        public TdApi.StatisticalGraph languageGraph;
        public TdApi.StatisticalGraph messageContentGraph;
        public TdApi.StatisticalGraph actionGraph;
        public TdApi.StatisticalGraph dayGraph;
        public TdApi.StatisticalGraph weekGraph;
        public TdApi.ChatStatisticsMessageSenderInfo[] topSenders;
        public TdApi.ChatStatisticsAdministratorActionsInfo[] topAdministrators;
        public TdApi.ChatStatisticsInviterInfo[] topInviters;
        public static final int CONSTRUCTOR = -17244633;

        public ChatStatisticsSupergroup() {
        }

        public ChatStatisticsSupergroup(TdApi.DateRange var1, TdApi.StatisticalValue var2, TdApi.StatisticalValue var3, TdApi.StatisticalValue var4, TdApi.StatisticalValue var5, TdApi.StatisticalGraph var6, TdApi.StatisticalGraph var7, TdApi.StatisticalGraph var8, TdApi.StatisticalGraph var9, TdApi.StatisticalGraph var10, TdApi.StatisticalGraph var11, TdApi.StatisticalGraph var12, TdApi.StatisticalGraph var13, TdApi.ChatStatisticsMessageSenderInfo[] var14, TdApi.ChatStatisticsAdministratorActionsInfo[] var15, TdApi.ChatStatisticsInviterInfo[] var16) {
            this.period = var1;
            this.memberCount = var2;
            this.messageCount = var3;
            this.viewerCount = var4;
            this.senderCount = var5;
            this.memberCountGraph = var6;
            this.joinGraph = var7;
            this.joinBySourceGraph = var8;
            this.languageGraph = var9;
            this.messageContentGraph = var10;
            this.actionGraph = var11;
            this.dayGraph = var12;
            this.weekGraph = var13;
            this.topSenders = var14;
            this.topAdministrators = var15;
            this.topInviters = var16;
        }

        public int getConstructor() {
            return -17244633;
        }
    }

    public abstract static class ChatStatistics extends TdApi.Object {
        public ChatStatistics() {
        }
    }

    public static class ChatSourcePublicServiceAnnouncement extends TdApi.ChatSource {
        public String type;
        public String text;
        public static final int CONSTRUCTOR = -328571244;

        public ChatSourcePublicServiceAnnouncement() {
        }

        public ChatSourcePublicServiceAnnouncement(String var1, String var2) {
            this.type = var1;
            this.text = var2;
        }

        public int getConstructor() {
            return -328571244;
        }
    }

    public static class ChatSourceMtprotoProxy extends TdApi.ChatSource {
        public static final int CONSTRUCTOR = 394074115;

        public ChatSourceMtprotoProxy() {
        }

        public int getConstructor() {
            return 394074115;
        }
    }

    public abstract static class ChatSource extends TdApi.Object {
        public ChatSource() {
        }
    }

    public static class ChatPosition extends TdApi.Object {
        public TdApi.ChatList list;
        public long order;
        public boolean isPinned;
        public TdApi.ChatSource source;
        public static final int CONSTRUCTOR = -622557355;

        public ChatPosition() {
        }

        public ChatPosition(TdApi.ChatList var1, long var2, boolean var4, TdApi.ChatSource var5) {
            this.list = var1;
            this.order = var2;
            this.isPinned = var4;
            this.source = var5;
        }

        public int getConstructor() {
            return -622557355;
        }
    }

    public static class ChatPhotos extends TdApi.Object {
        public int totalCount;
        public TdApi.ChatPhoto[] photos;
        public static final int CONSTRUCTOR = -1510699180;

        public ChatPhotos() {
        }

        public ChatPhotos(int var1, TdApi.ChatPhoto[] var2) {
            this.totalCount = var1;
            this.photos = var2;
        }

        public int getConstructor() {
            return -1510699180;
        }
    }

    public static class ChatPhotoStickerTypeCustomEmoji extends TdApi.ChatPhotoStickerType {
        public long customEmojiId;
        public static final int CONSTRUCTOR = -266224943;

        public ChatPhotoStickerTypeCustomEmoji() {
        }

        public ChatPhotoStickerTypeCustomEmoji(long var1) {
            this.customEmojiId = var1;
        }

        public int getConstructor() {
            return -266224943;
        }
    }

    public static class ChatPhotoStickerTypeRegularOrMask extends TdApi.ChatPhotoStickerType {
        public long stickerSetId;
        public long stickerId;
        public static final int CONSTRUCTOR = -415147620;

        public ChatPhotoStickerTypeRegularOrMask() {
        }

        public ChatPhotoStickerTypeRegularOrMask(long var1, long var3) {
            this.stickerSetId = var1;
            this.stickerId = var3;
        }

        public int getConstructor() {
            return -415147620;
        }
    }

    public abstract static class ChatPhotoStickerType extends TdApi.Object {
        public ChatPhotoStickerType() {
        }
    }

    public static class ChatPhotoSticker extends TdApi.Object {
        public TdApi.ChatPhotoStickerType type;
        public TdApi.BackgroundFill backgroundFill;
        public static final int CONSTRUCTOR = -1459387485;

        public ChatPhotoSticker() {
        }

        public ChatPhotoSticker(TdApi.ChatPhotoStickerType var1, TdApi.BackgroundFill var2) {
            this.type = var1;
            this.backgroundFill = var2;
        }

        public int getConstructor() {
            return -1459387485;
        }
    }

    public static class ChatPhotoInfo extends TdApi.Object {
        public TdApi.File small;
        public TdApi.File big;
        public TdApi.Minithumbnail minithumbnail;
        public boolean hasAnimation;
        public boolean isPersonal;
        public static final int CONSTRUCTOR = 281195686;

        public ChatPhotoInfo() {
        }

        public ChatPhotoInfo(TdApi.File var1, TdApi.File var2, TdApi.Minithumbnail var3, boolean var4, boolean var5) {
            this.small = var1;
            this.big = var2;
            this.minithumbnail = var3;
            this.hasAnimation = var4;
            this.isPersonal = var5;
        }

        public int getConstructor() {
            return 281195686;
        }
    }

    public static class ChatPhoto extends TdApi.Object {
        public long id;
        public int addedDate;
        public TdApi.Minithumbnail minithumbnail;
        public TdApi.PhotoSize[] sizes;
        public TdApi.AnimatedChatPhoto animation;
        public TdApi.AnimatedChatPhoto smallAnimation;
        public TdApi.ChatPhotoSticker sticker;
        public static final int CONSTRUCTOR = -1430870201;

        public ChatPhoto() {
        }

        public ChatPhoto(long var1, int var3, TdApi.Minithumbnail var4, TdApi.PhotoSize[] var5, TdApi.AnimatedChatPhoto var6, TdApi.AnimatedChatPhoto var7, TdApi.ChatPhotoSticker var8) {
            this.id = var1;
            this.addedDate = var3;
            this.minithumbnail = var4;
            this.sizes = var5;
            this.animation = var6;
            this.smallAnimation = var7;
            this.sticker = var8;
        }

        public int getConstructor() {
            return -1430870201;
        }
    }

    public static class ChatPermissions extends TdApi.Object {
        public boolean canSendBasicMessages;
        public boolean canSendAudios;
        public boolean canSendDocuments;
        public boolean canSendPhotos;
        public boolean canSendVideos;
        public boolean canSendVideoNotes;
        public boolean canSendVoiceNotes;
        public boolean canSendPolls;
        public boolean canSendOtherMessages;
        public boolean canAddWebPagePreviews;
        public boolean canChangeInfo;
        public boolean canInviteUsers;
        public boolean canPinMessages;
        public boolean canManageTopics;
        public static final int CONSTRUCTOR = -1355062837;

        public ChatPermissions() {
        }

        public ChatPermissions(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9, boolean var10, boolean var11, boolean var12, boolean var13, boolean var14) {
            this.canSendBasicMessages = var1;
            this.canSendAudios = var2;
            this.canSendDocuments = var3;
            this.canSendPhotos = var4;
            this.canSendVideos = var5;
            this.canSendVideoNotes = var6;
            this.canSendVoiceNotes = var7;
            this.canSendPolls = var8;
            this.canSendOtherMessages = var9;
            this.canAddWebPagePreviews = var10;
            this.canChangeInfo = var11;
            this.canInviteUsers = var12;
            this.canPinMessages = var13;
            this.canManageTopics = var14;
        }

        public int getConstructor() {
            return -1355062837;
        }
    }

    public static class ChatNotificationSettings extends TdApi.Object {
        public boolean useDefaultMuteFor;
        public int muteFor;
        public boolean useDefaultSound;
        public long soundId;
        public boolean useDefaultShowPreview;
        public boolean showPreview;
        public boolean useDefaultMuteStories;
        public boolean muteStories;
        public boolean useDefaultStorySound;
        public long storySoundId;
        public boolean useDefaultShowStorySender;
        public boolean showStorySender;
        public boolean useDefaultDisablePinnedMessageNotifications;
        public boolean disablePinnedMessageNotifications;
        public boolean useDefaultDisableMentionNotifications;
        public boolean disableMentionNotifications;
        public static final int CONSTRUCTOR = -572779825;

        public ChatNotificationSettings() {
        }

        public ChatNotificationSettings(boolean var1, int var2, boolean var3, long var4, boolean var6, boolean var7, boolean var8, boolean var9, boolean var10, long var11, boolean var13, boolean var14, boolean var15, boolean var16, boolean var17, boolean var18) {
            this.useDefaultMuteFor = var1;
            this.muteFor = var2;
            this.useDefaultSound = var3;
            this.soundId = var4;
            this.useDefaultShowPreview = var6;
            this.showPreview = var7;
            this.useDefaultMuteStories = var8;
            this.muteStories = var9;
            this.useDefaultStorySound = var10;
            this.storySoundId = var11;
            this.useDefaultShowStorySender = var13;
            this.showStorySender = var14;
            this.useDefaultDisablePinnedMessageNotifications = var15;
            this.disablePinnedMessageNotifications = var16;
            this.useDefaultDisableMentionNotifications = var17;
            this.disableMentionNotifications = var18;
        }

        public int getConstructor() {
            return -572779825;
        }
    }

    public static class ChatNearby extends TdApi.Object {
        public long chatId;
        public int distance;
        public static final int CONSTRUCTOR = 48120405;

        public ChatNearby() {
        }

        public ChatNearby(long var1, int var3) {
            this.chatId = var1;
            this.distance = var3;
        }

        public int getConstructor() {
            return 48120405;
        }
    }

    public static class ChatMessageSenders extends TdApi.Object {
        public TdApi.ChatMessageSender[] senders;
        public static final int CONSTRUCTOR = -1866230970;

        public ChatMessageSenders() {
        }

        public ChatMessageSenders(TdApi.ChatMessageSender[] var1) {
            this.senders = var1;
        }

        public int getConstructor() {
            return -1866230970;
        }
    }

    public static class ChatMessageSender extends TdApi.Object {
        public TdApi.MessageSender sender;
        public boolean needsPremium;
        public static final int CONSTRUCTOR = 760590010;

        public ChatMessageSender() {
        }

        public ChatMessageSender(TdApi.MessageSender var1, boolean var2) {
            this.sender = var1;
            this.needsPremium = var2;
        }

        public int getConstructor() {
            return 760590010;
        }
    }

    public static class ChatMembersFilterBots extends TdApi.ChatMembersFilter {
        public static final int CONSTRUCTOR = -1422567288;

        public ChatMembersFilterBots() {
        }

        public int getConstructor() {
            return -1422567288;
        }
    }

    public static class ChatMembersFilterBanned extends TdApi.ChatMembersFilter {
        public static final int CONSTRUCTOR = -1863102648;

        public ChatMembersFilterBanned() {
        }

        public int getConstructor() {
            return -1863102648;
        }
    }

    public static class ChatMembersFilterRestricted extends TdApi.ChatMembersFilter {
        public static final int CONSTRUCTOR = 1256282813;

        public ChatMembersFilterRestricted() {
        }

        public int getConstructor() {
            return 1256282813;
        }
    }

    public static class ChatMembersFilterMention extends TdApi.ChatMembersFilter {
        public long messageThreadId;
        public static final int CONSTRUCTOR = 856419831;

        public ChatMembersFilterMention() {
        }

        public ChatMembersFilterMention(long var1) {
            this.messageThreadId = var1;
        }

        public int getConstructor() {
            return 856419831;
        }
    }

    public static class ChatMembersFilterMembers extends TdApi.ChatMembersFilter {
        public static final int CONSTRUCTOR = 670504342;

        public ChatMembersFilterMembers() {
        }

        public int getConstructor() {
            return 670504342;
        }
    }

    public static class ChatMembersFilterAdministrators extends TdApi.ChatMembersFilter {
        public static final int CONSTRUCTOR = -1266893796;

        public ChatMembersFilterAdministrators() {
        }

        public int getConstructor() {
            return -1266893796;
        }
    }

    public static class ChatMembersFilterContacts extends TdApi.ChatMembersFilter {
        public static final int CONSTRUCTOR = 1774485671;

        public ChatMembersFilterContacts() {
        }

        public int getConstructor() {
            return 1774485671;
        }
    }

    public abstract static class ChatMembersFilter extends TdApi.Object {
        public ChatMembersFilter() {
        }
    }

    public static class ChatMembers extends TdApi.Object {
        public int totalCount;
        public TdApi.ChatMember[] members;
        public static final int CONSTRUCTOR = -497558622;

        public ChatMembers() {
        }

        public ChatMembers(int var1, TdApi.ChatMember[] var2) {
            this.totalCount = var1;
            this.members = var2;
        }

        public int getConstructor() {
            return -497558622;
        }
    }

    public static class ChatMemberStatusBanned extends TdApi.ChatMemberStatus {
        public int bannedUntilDate;
        public static final int CONSTRUCTOR = -1653518666;

        public ChatMemberStatusBanned() {
        }

        public ChatMemberStatusBanned(int var1) {
            this.bannedUntilDate = var1;
        }

        public int getConstructor() {
            return -1653518666;
        }
    }

    public static class ChatMemberStatusLeft extends TdApi.ChatMemberStatus {
        public static final int CONSTRUCTOR = -5815259;

        public ChatMemberStatusLeft() {
        }

        public int getConstructor() {
            return -5815259;
        }
    }

    public static class ChatMemberStatusRestricted extends TdApi.ChatMemberStatus {
        public boolean isMember;
        public int restrictedUntilDate;
        public TdApi.ChatPermissions permissions;
        public static final int CONSTRUCTOR = 1661432998;

        public ChatMemberStatusRestricted() {
        }

        public ChatMemberStatusRestricted(boolean var1, int var2, TdApi.ChatPermissions var3) {
            this.isMember = var1;
            this.restrictedUntilDate = var2;
            this.permissions = var3;
        }

        public int getConstructor() {
            return 1661432998;
        }
    }

    public static class ChatMemberStatusMember extends TdApi.ChatMemberStatus {
        public static final int CONSTRUCTOR = 844723285;

        public ChatMemberStatusMember() {
        }

        public int getConstructor() {
            return 844723285;
        }
    }

    public static class ChatMemberStatusAdministrator extends TdApi.ChatMemberStatus {
        public String customTitle;
        public boolean canBeEdited;
        public TdApi.ChatAdministratorRights rights;
        public static final int CONSTRUCTOR = -70024163;

        public ChatMemberStatusAdministrator() {
        }

        public ChatMemberStatusAdministrator(String var1, boolean var2, TdApi.ChatAdministratorRights var3) {
            this.customTitle = var1;
            this.canBeEdited = var2;
            this.rights = var3;
        }

        public int getConstructor() {
            return -70024163;
        }
    }

    public static class ChatMemberStatusCreator extends TdApi.ChatMemberStatus {
        public String customTitle;
        public boolean isAnonymous;
        public boolean isMember;
        public static final int CONSTRUCTOR = -160019714;

        public ChatMemberStatusCreator() {
        }

        public ChatMemberStatusCreator(String var1, boolean var2, boolean var3) {
            this.customTitle = var1;
            this.isAnonymous = var2;
            this.isMember = var3;
        }

        public int getConstructor() {
            return -160019714;
        }
    }

    public abstract static class ChatMemberStatus extends TdApi.Object {
        public ChatMemberStatus() {
        }
    }

    public static class ChatMember extends TdApi.Object {
        public TdApi.MessageSender memberId;
        public long inviterUserId;
        public int joinedChatDate;
        public TdApi.ChatMemberStatus status;
        public static final int CONSTRUCTOR = 1829953909;

        public ChatMember() {
        }

        public ChatMember(TdApi.MessageSender var1, long var2, int var4, TdApi.ChatMemberStatus var5) {
            this.memberId = var1;
            this.inviterUserId = var2;
            this.joinedChatDate = var4;
            this.status = var5;
        }

        public int getConstructor() {
            return 1829953909;
        }
    }

    public static class ChatLocation extends TdApi.Object {
        public TdApi.Location location;
        public String address;
        public static final int CONSTRUCTOR = -1566863583;

        public ChatLocation() {
        }

        public ChatLocation(TdApi.Location var1, String var2) {
            this.location = var1;
            this.address = var2;
        }

        public int getConstructor() {
            return -1566863583;
        }
    }

    public static class ChatLists extends TdApi.Object {
        public TdApi.ChatList[] chatLists;
        public static final int CONSTRUCTOR = -258292771;

        public ChatLists() {
        }

        public ChatLists(TdApi.ChatList[] var1) {
            this.chatLists = var1;
        }

        public int getConstructor() {
            return -258292771;
        }
    }

    public static class ChatListFolder extends TdApi.ChatList {
        public int chatFolderId;
        public static final int CONSTRUCTOR = 385760856;

        public ChatListFolder() {
        }

        public ChatListFolder(int var1) {
            this.chatFolderId = var1;
        }

        public int getConstructor() {
            return 385760856;
        }
    }

    public static class ChatListArchive extends TdApi.ChatList {
        public static final int CONSTRUCTOR = 362770115;

        public ChatListArchive() {
        }

        public int getConstructor() {
            return 362770115;
        }
    }

    public static class ChatListMain extends TdApi.ChatList {
        public static final int CONSTRUCTOR = -400991316;

        public ChatListMain() {
        }

        public int getConstructor() {
            return -400991316;
        }
    }

    public abstract static class ChatList extends TdApi.Object {
        public ChatList() {
        }
    }

    public static class ChatJoinRequestsInfo extends TdApi.Object {
        public int totalCount;
        public long[] userIds;
        public static final int CONSTRUCTOR = 888534463;

        public ChatJoinRequestsInfo() {
        }

        public ChatJoinRequestsInfo(int var1, long[] var2) {
            this.totalCount = var1;
            this.userIds = var2;
        }

        public int getConstructor() {
            return 888534463;
        }
    }

    public static class ChatJoinRequests extends TdApi.Object {
        public int totalCount;
        public TdApi.ChatJoinRequest[] requests;
        public static final int CONSTRUCTOR = 1291680519;

        public ChatJoinRequests() {
        }

        public ChatJoinRequests(int var1, TdApi.ChatJoinRequest[] var2) {
            this.totalCount = var1;
            this.requests = var2;
        }

        public int getConstructor() {
            return 1291680519;
        }
    }

    public static class ChatJoinRequest extends TdApi.Object {
        public long userId;
        public int date;
        public String bio;
        public static final int CONSTRUCTOR = 59341416;

        public ChatJoinRequest() {
        }

        public ChatJoinRequest(long var1, int var3, String var4) {
            this.userId = var1;
            this.date = var3;
            this.bio = var4;
        }

        public int getConstructor() {
            return 59341416;
        }
    }

    public static class ChatInviteLinks extends TdApi.Object {
        public int totalCount;
        public TdApi.ChatInviteLink[] inviteLinks;
        public static final int CONSTRUCTOR = 112891427;

        public ChatInviteLinks() {
        }

        public ChatInviteLinks(int var1, TdApi.ChatInviteLink[] var2) {
            this.totalCount = var1;
            this.inviteLinks = var2;
        }

        public int getConstructor() {
            return 112891427;
        }
    }

    public static class ChatInviteLinkMembers extends TdApi.Object {
        public int totalCount;
        public TdApi.ChatInviteLinkMember[] members;
        public static final int CONSTRUCTOR = 315635051;

        public ChatInviteLinkMembers() {
        }

        public ChatInviteLinkMembers(int var1, TdApi.ChatInviteLinkMember[] var2) {
            this.totalCount = var1;
            this.members = var2;
        }

        public int getConstructor() {
            return 315635051;
        }
    }

    public static class ChatInviteLinkMember extends TdApi.Object {
        public long userId;
        public int joinedChatDate;
        public boolean viaChatFolderInviteLink;
        public long approverUserId;
        public static final int CONSTRUCTOR = 29156795;

        public ChatInviteLinkMember() {
        }

        public ChatInviteLinkMember(long var1, int var3, boolean var4, long var5) {
            this.userId = var1;
            this.joinedChatDate = var3;
            this.viaChatFolderInviteLink = var4;
            this.approverUserId = var5;
        }

        public int getConstructor() {
            return 29156795;
        }
    }

    public static class ChatInviteLinkInfo extends TdApi.Object {
        public long chatId;
        public int accessibleFor;
        public TdApi.ChatType type;
        public String title;
        public TdApi.ChatPhotoInfo photo;
        public String description;
        public int memberCount;
        public long[] memberUserIds;
        public boolean createsJoinRequest;
        public boolean isPublic;
        public static final int CONSTRUCTOR = 546234276;

        public ChatInviteLinkInfo() {
        }

        public ChatInviteLinkInfo(long var1, int var3, TdApi.ChatType var4, String var5, TdApi.ChatPhotoInfo var6, String var7, int var8, long[] var9, boolean var10, boolean var11) {
            this.chatId = var1;
            this.accessibleFor = var3;
            this.type = var4;
            this.title = var5;
            this.photo = var6;
            this.description = var7;
            this.memberCount = var8;
            this.memberUserIds = var9;
            this.createsJoinRequest = var10;
            this.isPublic = var11;
        }

        public int getConstructor() {
            return 546234276;
        }
    }

    public static class ChatInviteLinkCounts extends TdApi.Object {
        public TdApi.ChatInviteLinkCount[] inviteLinkCounts;
        public static final int CONSTRUCTOR = 920326637;

        public ChatInviteLinkCounts() {
        }

        public ChatInviteLinkCounts(TdApi.ChatInviteLinkCount[] var1) {
            this.inviteLinkCounts = var1;
        }

        public int getConstructor() {
            return 920326637;
        }
    }

    public static class ChatInviteLinkCount extends TdApi.Object {
        public long userId;
        public int inviteLinkCount;
        public int revokedInviteLinkCount;
        public static final int CONSTRUCTOR = -1021999210;

        public ChatInviteLinkCount() {
        }

        public ChatInviteLinkCount(long var1, int var3, int var4) {
            this.userId = var1;
            this.inviteLinkCount = var3;
            this.revokedInviteLinkCount = var4;
        }

        public int getConstructor() {
            return -1021999210;
        }
    }

    public static class ChatInviteLink extends TdApi.Object {
        public String inviteLink;
        public String name;
        public long creatorUserId;
        public int date;
        public int editDate;
        public int expirationDate;
        public int memberLimit;
        public int memberCount;
        public int pendingJoinRequestCount;
        public boolean createsJoinRequest;
        public boolean isPrimary;
        public boolean isRevoked;
        public static final int CONSTRUCTOR = -205812476;

        public ChatInviteLink() {
        }

        public ChatInviteLink(String var1, String var2, long var3, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11, boolean var12, boolean var13) {
            this.inviteLink = var1;
            this.name = var2;
            this.creatorUserId = var3;
            this.date = var5;
            this.editDate = var6;
            this.expirationDate = var7;
            this.memberLimit = var8;
            this.memberCount = var9;
            this.pendingJoinRequestCount = var10;
            this.createsJoinRequest = var11;
            this.isPrimary = var12;
            this.isRevoked = var13;
        }

        public int getConstructor() {
            return -205812476;
        }
    }

    public static class ChatFolderInviteLinks extends TdApi.Object {
        public TdApi.ChatFolderInviteLink[] inviteLinks;
        public static final int CONSTRUCTOR = 1853351525;

        public ChatFolderInviteLinks() {
        }

        public ChatFolderInviteLinks(TdApi.ChatFolderInviteLink[] var1) {
            this.inviteLinks = var1;
        }

        public int getConstructor() {
            return 1853351525;
        }
    }

    public static class ChatFolderInviteLinkInfo extends TdApi.Object {
        public TdApi.ChatFolderInfo chatFolderInfo;
        public long[] missingChatIds;
        public long[] addedChatIds;
        public static final int CONSTRUCTOR = 1119450395;

        public ChatFolderInviteLinkInfo() {
        }

        public ChatFolderInviteLinkInfo(TdApi.ChatFolderInfo var1, long[] var2, long[] var3) {
            this.chatFolderInfo = var1;
            this.missingChatIds = var2;
            this.addedChatIds = var3;
        }

        public int getConstructor() {
            return 1119450395;
        }
    }

    public static class ChatFolderInviteLink extends TdApi.Object {
        public String inviteLink;
        public String name;
        public long[] chatIds;
        public static final int CONSTRUCTOR = 493969661;

        public ChatFolderInviteLink() {
        }

        public ChatFolderInviteLink(String var1, String var2, long[] var3) {
            this.inviteLink = var1;
            this.name = var2;
            this.chatIds = var3;
        }

        public int getConstructor() {
            return 493969661;
        }
    }

    public static class ChatFolderInfo extends TdApi.Object {
        public int id;
        public String title;
        public TdApi.ChatFolderIcon icon;
        public boolean isShareable;
        public boolean hasMyInviteLinks;
        public static final int CONSTRUCTOR = 1279189204;

        public ChatFolderInfo() {
        }

        public ChatFolderInfo(int var1, String var2, TdApi.ChatFolderIcon var3, boolean var4, boolean var5) {
            this.id = var1;
            this.title = var2;
            this.icon = var3;
            this.isShareable = var4;
            this.hasMyInviteLinks = var5;
        }

        public int getConstructor() {
            return 1279189204;
        }
    }

    public static class ChatFolderIcon extends TdApi.Object {
        public String name;
        public static final int CONSTRUCTOR = -146104090;

        public ChatFolderIcon() {
        }

        public ChatFolderIcon(String var1) {
            this.name = var1;
        }

        public int getConstructor() {
            return -146104090;
        }
    }

    public static class ChatFolder extends TdApi.Object {
        public String title;
        public TdApi.ChatFolderIcon icon;
        public boolean isShareable;
        public long[] pinnedChatIds;
        public long[] includedChatIds;
        public long[] excludedChatIds;
        public boolean excludeMuted;
        public boolean excludeRead;
        public boolean excludeArchived;
        public boolean includeContacts;
        public boolean includeNonContacts;
        public boolean includeBots;
        public boolean includeGroups;
        public boolean includeChannels;
        public static final int CONSTRUCTOR = -459081051;

        public ChatFolder() {
        }

        public ChatFolder(String var1, TdApi.ChatFolderIcon var2, boolean var3, long[] var4, long[] var5, long[] var6, boolean var7, boolean var8, boolean var9, boolean var10, boolean var11, boolean var12, boolean var13, boolean var14) {
            this.title = var1;
            this.icon = var2;
            this.isShareable = var3;
            this.pinnedChatIds = var4;
            this.includedChatIds = var5;
            this.excludedChatIds = var6;
            this.excludeMuted = var7;
            this.excludeRead = var8;
            this.excludeArchived = var9;
            this.includeContacts = var10;
            this.includeNonContacts = var11;
            this.includeBots = var12;
            this.includeGroups = var13;
            this.includeChannels = var14;
        }

        public int getConstructor() {
            return -459081051;
        }
    }

    public static class ChatEvents extends TdApi.Object {
        public TdApi.ChatEvent[] events;
        public static final int CONSTRUCTOR = -585329664;

        public ChatEvents() {
        }

        public ChatEvents(TdApi.ChatEvent[] var1) {
            this.events = var1;
        }

        public int getConstructor() {
            return -585329664;
        }
    }

    public static class ChatEventLogFilters extends TdApi.Object {
        public boolean messageEdits;
        public boolean messageDeletions;
        public boolean messagePins;
        public boolean memberJoins;
        public boolean memberLeaves;
        public boolean memberInvites;
        public boolean memberPromotions;
        public boolean memberRestrictions;
        public boolean infoChanges;
        public boolean settingChanges;
        public boolean inviteLinkChanges;
        public boolean videoChatChanges;
        public boolean forumChanges;
        public static final int CONSTRUCTOR = 1648261677;

        public ChatEventLogFilters() {
        }

        public ChatEventLogFilters(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9, boolean var10, boolean var11, boolean var12, boolean var13) {
            this.messageEdits = var1;
            this.messageDeletions = var2;
            this.messagePins = var3;
            this.memberJoins = var4;
            this.memberLeaves = var5;
            this.memberInvites = var6;
            this.memberPromotions = var7;
            this.memberRestrictions = var8;
            this.infoChanges = var9;
            this.settingChanges = var10;
            this.inviteLinkChanges = var11;
            this.videoChatChanges = var12;
            this.forumChanges = var13;
        }

        public int getConstructor() {
            return 1648261677;
        }
    }

    public static class ChatEventForumTopicPinned extends TdApi.ChatEventAction {
        public TdApi.ForumTopicInfo oldTopicInfo;
        public TdApi.ForumTopicInfo newTopicInfo;
        public static final int CONSTRUCTOR = 2143626222;

        public ChatEventForumTopicPinned() {
        }

        public ChatEventForumTopicPinned(TdApi.ForumTopicInfo var1, TdApi.ForumTopicInfo var2) {
            this.oldTopicInfo = var1;
            this.newTopicInfo = var2;
        }

        public int getConstructor() {
            return 2143626222;
        }
    }

    public static class ChatEventForumTopicDeleted extends TdApi.ChatEventAction {
        public TdApi.ForumTopicInfo topicInfo;
        public static final int CONSTRUCTOR = -1332795123;

        public ChatEventForumTopicDeleted() {
        }

        public ChatEventForumTopicDeleted(TdApi.ForumTopicInfo var1) {
            this.topicInfo = var1;
        }

        public int getConstructor() {
            return -1332795123;
        }
    }

    public static class ChatEventForumTopicToggleIsHidden extends TdApi.ChatEventAction {
        public TdApi.ForumTopicInfo topicInfo;
        public static final int CONSTRUCTOR = -1609175250;

        public ChatEventForumTopicToggleIsHidden() {
        }

        public ChatEventForumTopicToggleIsHidden(TdApi.ForumTopicInfo var1) {
            this.topicInfo = var1;
        }

        public int getConstructor() {
            return -1609175250;
        }
    }

    public static class ChatEventForumTopicToggleIsClosed extends TdApi.ChatEventAction {
        public TdApi.ForumTopicInfo topicInfo;
        public static final int CONSTRUCTOR = -962704070;

        public ChatEventForumTopicToggleIsClosed() {
        }

        public ChatEventForumTopicToggleIsClosed(TdApi.ForumTopicInfo var1) {
            this.topicInfo = var1;
        }

        public int getConstructor() {
            return -962704070;
        }
    }

    public static class ChatEventForumTopicEdited extends TdApi.ChatEventAction {
        public TdApi.ForumTopicInfo oldTopicInfo;
        public TdApi.ForumTopicInfo newTopicInfo;
        public static final int CONSTRUCTOR = 1624910860;

        public ChatEventForumTopicEdited() {
        }

        public ChatEventForumTopicEdited(TdApi.ForumTopicInfo var1, TdApi.ForumTopicInfo var2) {
            this.oldTopicInfo = var1;
            this.newTopicInfo = var2;
        }

        public int getConstructor() {
            return 1624910860;
        }
    }

    public static class ChatEventForumTopicCreated extends TdApi.ChatEventAction {
        public TdApi.ForumTopicInfo topicInfo;
        public static final int CONSTRUCTOR = 2005269314;

        public ChatEventForumTopicCreated() {
        }

        public ChatEventForumTopicCreated(TdApi.ForumTopicInfo var1) {
            this.topicInfo = var1;
        }

        public int getConstructor() {
            return 2005269314;
        }
    }

    public static class ChatEventIsForumToggled extends TdApi.ChatEventAction {
        public boolean isForum;
        public static final int CONSTRUCTOR = 1516491033;

        public ChatEventIsForumToggled() {
        }

        public ChatEventIsForumToggled(boolean var1) {
            this.isForum = var1;
        }

        public int getConstructor() {
            return 1516491033;
        }
    }

    public static class ChatEventVideoChatParticipantVolumeLevelChanged extends TdApi.ChatEventAction {
        public TdApi.MessageSender participantId;
        public int volumeLevel;
        public static final int CONSTRUCTOR = 1131385534;

        public ChatEventVideoChatParticipantVolumeLevelChanged() {
        }

        public ChatEventVideoChatParticipantVolumeLevelChanged(TdApi.MessageSender var1, int var2) {
            this.participantId = var1;
            this.volumeLevel = var2;
        }

        public int getConstructor() {
            return 1131385534;
        }
    }

    public static class ChatEventVideoChatParticipantIsMutedToggled extends TdApi.ChatEventAction {
        public TdApi.MessageSender participantId;
        public boolean isMuted;
        public static final int CONSTRUCTOR = 521165047;

        public ChatEventVideoChatParticipantIsMutedToggled() {
        }

        public ChatEventVideoChatParticipantIsMutedToggled(TdApi.MessageSender var1, boolean var2) {
            this.participantId = var1;
            this.isMuted = var2;
        }

        public int getConstructor() {
            return 521165047;
        }
    }

    public static class ChatEventVideoChatMuteNewParticipantsToggled extends TdApi.ChatEventAction {
        public boolean muteNewParticipants;
        public static final int CONSTRUCTOR = -126547970;

        public ChatEventVideoChatMuteNewParticipantsToggled() {
        }

        public ChatEventVideoChatMuteNewParticipantsToggled(boolean var1) {
            this.muteNewParticipants = var1;
        }

        public int getConstructor() {
            return -126547970;
        }
    }

    public static class ChatEventVideoChatEnded extends TdApi.ChatEventAction {
        public int groupCallId;
        public static final int CONSTRUCTOR = 1630039112;

        public ChatEventVideoChatEnded() {
        }

        public ChatEventVideoChatEnded(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return 1630039112;
        }
    }

    public static class ChatEventVideoChatCreated extends TdApi.ChatEventAction {
        public int groupCallId;
        public static final int CONSTRUCTOR = 1822853755;

        public ChatEventVideoChatCreated() {
        }

        public ChatEventVideoChatCreated(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return 1822853755;
        }
    }

    public static class ChatEventInviteLinkDeleted extends TdApi.ChatEventAction {
        public TdApi.ChatInviteLink inviteLink;
        public static final int CONSTRUCTOR = -1394974361;

        public ChatEventInviteLinkDeleted() {
        }

        public ChatEventInviteLinkDeleted(TdApi.ChatInviteLink var1) {
            this.inviteLink = var1;
        }

        public int getConstructor() {
            return -1394974361;
        }
    }

    public static class ChatEventInviteLinkRevoked extends TdApi.ChatEventAction {
        public TdApi.ChatInviteLink inviteLink;
        public static final int CONSTRUCTOR = -1579417629;

        public ChatEventInviteLinkRevoked() {
        }

        public ChatEventInviteLinkRevoked(TdApi.ChatInviteLink var1) {
            this.inviteLink = var1;
        }

        public int getConstructor() {
            return -1579417629;
        }
    }

    public static class ChatEventInviteLinkEdited extends TdApi.ChatEventAction {
        public TdApi.ChatInviteLink oldInviteLink;
        public TdApi.ChatInviteLink newInviteLink;
        public static final int CONSTRUCTOR = -460190366;

        public ChatEventInviteLinkEdited() {
        }

        public ChatEventInviteLinkEdited(TdApi.ChatInviteLink var1, TdApi.ChatInviteLink var2) {
            this.oldInviteLink = var1;
            this.newInviteLink = var2;
        }

        public int getConstructor() {
            return -460190366;
        }
    }

    public static class ChatEventSignMessagesToggled extends TdApi.ChatEventAction {
        public boolean signMessages;
        public static final int CONSTRUCTOR = -1313265634;

        public ChatEventSignMessagesToggled() {
        }

        public ChatEventSignMessagesToggled(boolean var1) {
            this.signMessages = var1;
        }

        public int getConstructor() {
            return -1313265634;
        }
    }

    public static class ChatEventHasAggressiveAntiSpamEnabledToggled extends TdApi.ChatEventAction {
        public boolean hasAggressiveAntiSpamEnabled;
        public static final int CONSTRUCTOR = -125348094;

        public ChatEventHasAggressiveAntiSpamEnabledToggled() {
        }

        public ChatEventHasAggressiveAntiSpamEnabledToggled(boolean var1) {
            this.hasAggressiveAntiSpamEnabled = var1;
        }

        public int getConstructor() {
            return -125348094;
        }
    }

    public static class ChatEventIsAllHistoryAvailableToggled extends TdApi.ChatEventAction {
        public boolean isAllHistoryAvailable;
        public static final int CONSTRUCTOR = -1599063019;

        public ChatEventIsAllHistoryAvailableToggled() {
        }

        public ChatEventIsAllHistoryAvailableToggled(boolean var1) {
            this.isAllHistoryAvailable = var1;
        }

        public int getConstructor() {
            return -1599063019;
        }
    }

    public static class ChatEventInvitesToggled extends TdApi.ChatEventAction {
        public boolean canInviteUsers;
        public static final int CONSTRUCTOR = -62548373;

        public ChatEventInvitesToggled() {
        }

        public ChatEventInvitesToggled(boolean var1) {
            this.canInviteUsers = var1;
        }

        public int getConstructor() {
            return -62548373;
        }
    }

    public static class ChatEventHasProtectedContentToggled extends TdApi.ChatEventAction {
        public boolean hasProtectedContent;
        public static final int CONSTRUCTOR = -184270335;

        public ChatEventHasProtectedContentToggled() {
        }

        public ChatEventHasProtectedContentToggled(boolean var1) {
            this.hasProtectedContent = var1;
        }

        public int getConstructor() {
            return -184270335;
        }
    }

    public static class ChatEventActiveUsernamesChanged extends TdApi.ChatEventAction {
        public String[] oldUsernames;
        public String[] newUsernames;
        public static final int CONSTRUCTOR = -1508790810;

        public ChatEventActiveUsernamesChanged() {
        }

        public ChatEventActiveUsernamesChanged(String[] var1, String[] var2) {
            this.oldUsernames = var1;
            this.newUsernames = var2;
        }

        public int getConstructor() {
            return -1508790810;
        }
    }

    public static class ChatEventUsernameChanged extends TdApi.ChatEventAction {
        public String oldUsername;
        public String newUsername;
        public static final int CONSTRUCTOR = 1728558443;

        public ChatEventUsernameChanged() {
        }

        public ChatEventUsernameChanged(String var1, String var2) {
            this.oldUsername = var1;
            this.newUsername = var2;
        }

        public int getConstructor() {
            return 1728558443;
        }
    }

    public static class ChatEventTitleChanged extends TdApi.ChatEventAction {
        public String oldTitle;
        public String newTitle;
        public static final int CONSTRUCTOR = 1134103250;

        public ChatEventTitleChanged() {
        }

        public ChatEventTitleChanged(String var1, String var2) {
            this.oldTitle = var1;
            this.newTitle = var2;
        }

        public int getConstructor() {
            return 1134103250;
        }
    }

    public static class ChatEventStickerSetChanged extends TdApi.ChatEventAction {
        public long oldStickerSetId;
        public long newStickerSetId;
        public static final int CONSTRUCTOR = -1243130481;

        public ChatEventStickerSetChanged() {
        }

        public ChatEventStickerSetChanged(long var1, long var3) {
            this.oldStickerSetId = var1;
            this.newStickerSetId = var3;
        }

        public int getConstructor() {
            return -1243130481;
        }
    }

    public static class ChatEventSlowModeDelayChanged extends TdApi.ChatEventAction {
        public int oldSlowModeDelay;
        public int newSlowModeDelay;
        public static final int CONSTRUCTOR = -1653195765;

        public ChatEventSlowModeDelayChanged() {
        }

        public ChatEventSlowModeDelayChanged(int var1, int var2) {
            this.oldSlowModeDelay = var1;
            this.newSlowModeDelay = var2;
        }

        public int getConstructor() {
            return -1653195765;
        }
    }

    public static class ChatEventPhotoChanged extends TdApi.ChatEventAction {
        public TdApi.ChatPhoto oldPhoto;
        public TdApi.ChatPhoto newPhoto;
        public static final int CONSTRUCTOR = -811572541;

        public ChatEventPhotoChanged() {
        }

        public ChatEventPhotoChanged(TdApi.ChatPhoto var1, TdApi.ChatPhoto var2) {
            this.oldPhoto = var1;
            this.newPhoto = var2;
        }

        public int getConstructor() {
            return -811572541;
        }
    }

    public static class ChatEventPermissionsChanged extends TdApi.ChatEventAction {
        public TdApi.ChatPermissions oldPermissions;
        public TdApi.ChatPermissions newPermissions;
        public static final int CONSTRUCTOR = -1311557720;

        public ChatEventPermissionsChanged() {
        }

        public ChatEventPermissionsChanged(TdApi.ChatPermissions var1, TdApi.ChatPermissions var2) {
            this.oldPermissions = var1;
            this.newPermissions = var2;
        }

        public int getConstructor() {
            return -1311557720;
        }
    }

    public static class ChatEventMessageAutoDeleteTimeChanged extends TdApi.ChatEventAction {
        public int oldMessageAutoDeleteTime;
        public int newMessageAutoDeleteTime;
        public static final int CONSTRUCTOR = 17317668;

        public ChatEventMessageAutoDeleteTimeChanged() {
        }

        public ChatEventMessageAutoDeleteTimeChanged(int var1, int var2) {
            this.oldMessageAutoDeleteTime = var1;
            this.newMessageAutoDeleteTime = var2;
        }

        public int getConstructor() {
            return 17317668;
        }
    }

    public static class ChatEventLocationChanged extends TdApi.ChatEventAction {
        public TdApi.ChatLocation oldLocation;
        public TdApi.ChatLocation newLocation;
        public static final int CONSTRUCTOR = -405930674;

        public ChatEventLocationChanged() {
        }

        public ChatEventLocationChanged(TdApi.ChatLocation var1, TdApi.ChatLocation var2) {
            this.oldLocation = var1;
            this.newLocation = var2;
        }

        public int getConstructor() {
            return -405930674;
        }
    }

    public static class ChatEventLinkedChatChanged extends TdApi.ChatEventAction {
        public long oldLinkedChatId;
        public long newLinkedChatId;
        public static final int CONSTRUCTOR = 1797419439;

        public ChatEventLinkedChatChanged() {
        }

        public ChatEventLinkedChatChanged(long var1, long var3) {
            this.oldLinkedChatId = var1;
            this.newLinkedChatId = var3;
        }

        public int getConstructor() {
            return 1797419439;
        }
    }

    public static class ChatEventDescriptionChanged extends TdApi.ChatEventAction {
        public String oldDescription;
        public String newDescription;
        public static final int CONSTRUCTOR = 39112478;

        public ChatEventDescriptionChanged() {
        }

        public ChatEventDescriptionChanged(String var1, String var2) {
            this.oldDescription = var1;
            this.newDescription = var2;
        }

        public int getConstructor() {
            return 39112478;
        }
    }

    public static class ChatEventAvailableReactionsChanged extends TdApi.ChatEventAction {
        public TdApi.ChatAvailableReactions oldAvailableReactions;
        public TdApi.ChatAvailableReactions newAvailableReactions;
        public static final int CONSTRUCTOR = -1749491521;

        public ChatEventAvailableReactionsChanged() {
        }

        public ChatEventAvailableReactionsChanged(TdApi.ChatAvailableReactions var1, TdApi.ChatAvailableReactions var2) {
            this.oldAvailableReactions = var1;
            this.newAvailableReactions = var2;
        }

        public int getConstructor() {
            return -1749491521;
        }
    }

    public static class ChatEventMemberRestricted extends TdApi.ChatEventAction {
        public TdApi.MessageSender memberId;
        public TdApi.ChatMemberStatus oldStatus;
        public TdApi.ChatMemberStatus newStatus;
        public static final int CONSTRUCTOR = 1603608069;

        public ChatEventMemberRestricted() {
        }

        public ChatEventMemberRestricted(TdApi.MessageSender var1, TdApi.ChatMemberStatus var2, TdApi.ChatMemberStatus var3) {
            this.memberId = var1;
            this.oldStatus = var2;
            this.newStatus = var3;
        }

        public int getConstructor() {
            return 1603608069;
        }
    }

    public static class ChatEventMemberPromoted extends TdApi.ChatEventAction {
        public long userId;
        public TdApi.ChatMemberStatus oldStatus;
        public TdApi.ChatMemberStatus newStatus;
        public static final int CONSTRUCTOR = 525297761;

        public ChatEventMemberPromoted() {
        }

        public ChatEventMemberPromoted(long var1, TdApi.ChatMemberStatus var3, TdApi.ChatMemberStatus var4) {
            this.userId = var1;
            this.oldStatus = var3;
            this.newStatus = var4;
        }

        public int getConstructor() {
            return 525297761;
        }
    }

    public static class ChatEventMemberLeft extends TdApi.ChatEventAction {
        public static final int CONSTRUCTOR = -948420593;

        public ChatEventMemberLeft() {
        }

        public int getConstructor() {
            return -948420593;
        }
    }

    public static class ChatEventMemberInvited extends TdApi.ChatEventAction {
        public long userId;
        public TdApi.ChatMemberStatus status;
        public static final int CONSTRUCTOR = 953663433;

        public ChatEventMemberInvited() {
        }

        public ChatEventMemberInvited(long var1, TdApi.ChatMemberStatus var3) {
            this.userId = var1;
            this.status = var3;
        }

        public int getConstructor() {
            return 953663433;
        }
    }

    public static class ChatEventMemberJoinedByRequest extends TdApi.ChatEventAction {
        public long approverUserId;
        public TdApi.ChatInviteLink inviteLink;
        public static final int CONSTRUCTOR = -1647804865;

        public ChatEventMemberJoinedByRequest() {
        }

        public ChatEventMemberJoinedByRequest(long var1, TdApi.ChatInviteLink var3) {
            this.approverUserId = var1;
            this.inviteLink = var3;
        }

        public int getConstructor() {
            return -1647804865;
        }
    }

    public static class ChatEventMemberJoinedByInviteLink extends TdApi.ChatEventAction {
        public TdApi.ChatInviteLink inviteLink;
        public boolean viaChatFolderInviteLink;
        public static final int CONSTRUCTOR = -1445536390;

        public ChatEventMemberJoinedByInviteLink() {
        }

        public ChatEventMemberJoinedByInviteLink(TdApi.ChatInviteLink var1, boolean var2) {
            this.inviteLink = var1;
            this.viaChatFolderInviteLink = var2;
        }

        public int getConstructor() {
            return -1445536390;
        }
    }

    public static class ChatEventMemberJoined extends TdApi.ChatEventAction {
        public static final int CONSTRUCTOR = -235468508;

        public ChatEventMemberJoined() {
        }

        public int getConstructor() {
            return -235468508;
        }
    }

    public static class ChatEventPollStopped extends TdApi.ChatEventAction {
        public TdApi.Message message;
        public static final int CONSTRUCTOR = 2009893861;

        public ChatEventPollStopped() {
        }

        public ChatEventPollStopped(TdApi.Message var1) {
            this.message = var1;
        }

        public int getConstructor() {
            return 2009893861;
        }
    }

    public static class ChatEventMessageUnpinned extends TdApi.ChatEventAction {
        public TdApi.Message message;
        public static final int CONSTRUCTOR = -376161513;

        public ChatEventMessageUnpinned() {
        }

        public ChatEventMessageUnpinned(TdApi.Message var1) {
            this.message = var1;
        }

        public int getConstructor() {
            return -376161513;
        }
    }

    public static class ChatEventMessagePinned extends TdApi.ChatEventAction {
        public TdApi.Message message;
        public static final int CONSTRUCTOR = 438742298;

        public ChatEventMessagePinned() {
        }

        public ChatEventMessagePinned(TdApi.Message var1) {
            this.message = var1;
        }

        public int getConstructor() {
            return 438742298;
        }
    }

    public static class ChatEventMessageDeleted extends TdApi.ChatEventAction {
        public TdApi.Message message;
        public boolean canReportAntiSpamFalsePositive;
        public static final int CONSTRUCTOR = 935316851;

        public ChatEventMessageDeleted() {
        }

        public ChatEventMessageDeleted(TdApi.Message var1, boolean var2) {
            this.message = var1;
            this.canReportAntiSpamFalsePositive = var2;
        }

        public int getConstructor() {
            return 935316851;
        }
    }

    public static class ChatEventMessageEdited extends TdApi.ChatEventAction {
        public TdApi.Message oldMessage;
        public TdApi.Message newMessage;
        public static final int CONSTRUCTOR = -430967304;

        public ChatEventMessageEdited() {
        }

        public ChatEventMessageEdited(TdApi.Message var1, TdApi.Message var2) {
            this.oldMessage = var1;
            this.newMessage = var2;
        }

        public int getConstructor() {
            return -430967304;
        }
    }

    public abstract static class ChatEventAction extends TdApi.Object {
        public ChatEventAction() {
        }
    }

    public static class ChatEvent extends TdApi.Object {
        public long id;
        public int date;
        public TdApi.MessageSender memberId;
        public TdApi.ChatEventAction action;
        public static final int CONSTRUCTOR = -652102704;

        public ChatEvent() {
        }

        public ChatEvent(long var1, int var3, TdApi.MessageSender var4, TdApi.ChatEventAction var5) {
            this.id = var1;
            this.date = var3;
            this.memberId = var4;
            this.action = var5;
        }

        public int getConstructor() {
            return -652102704;
        }
    }

    public static class ChatBackground extends TdApi.Object {
        public TdApi.Background background;
        public int darkThemeDimming;
        public static final int CONSTRUCTOR = 1653152104;

        public ChatBackground() {
        }

        public ChatBackground(TdApi.Background var1, int var2) {
            this.background = var1;
            this.darkThemeDimming = var2;
        }

        public int getConstructor() {
            return 1653152104;
        }
    }

    public static class ChatAvailableReactionsSome extends TdApi.ChatAvailableReactions {
        public TdApi.ReactionType[] reactions;
        public static final int CONSTRUCTOR = -640810821;

        public ChatAvailableReactionsSome() {
        }

        public ChatAvailableReactionsSome(TdApi.ReactionType[] var1) {
            this.reactions = var1;
        }

        public int getConstructor() {
            return -640810821;
        }
    }

    public static class ChatAvailableReactionsAll extends TdApi.ChatAvailableReactions {
        public static final int CONSTRUCTOR = -537887666;

        public ChatAvailableReactionsAll() {
        }

        public int getConstructor() {
            return -537887666;
        }
    }

    public abstract static class ChatAvailableReactions extends TdApi.Object {
        public ChatAvailableReactions() {
        }
    }

    public static class ChatAdministrators extends TdApi.Object {
        public TdApi.ChatAdministrator[] administrators;
        public static final int CONSTRUCTOR = -2126186435;

        public ChatAdministrators() {
        }

        public ChatAdministrators(TdApi.ChatAdministrator[] var1) {
            this.administrators = var1;
        }

        public int getConstructor() {
            return -2126186435;
        }
    }

    public static class ChatAdministratorRights extends TdApi.Object {
        public boolean canManageChat;
        public boolean canChangeInfo;
        public boolean canPostMessages;
        public boolean canEditMessages;
        public boolean canDeleteMessages;
        public boolean canInviteUsers;
        public boolean canRestrictMembers;
        public boolean canPinMessages;
        public boolean canManageTopics;
        public boolean canPromoteMembers;
        public boolean canManageVideoChats;
        public boolean isAnonymous;
        public static final int CONSTRUCTOR = -1384650041;

        public ChatAdministratorRights() {
        }

        public ChatAdministratorRights(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9, boolean var10, boolean var11, boolean var12) {
            this.canManageChat = var1;
            this.canChangeInfo = var2;
            this.canPostMessages = var3;
            this.canEditMessages = var4;
            this.canDeleteMessages = var5;
            this.canInviteUsers = var6;
            this.canRestrictMembers = var7;
            this.canPinMessages = var8;
            this.canManageTopics = var9;
            this.canPromoteMembers = var10;
            this.canManageVideoChats = var11;
            this.isAnonymous = var12;
        }

        public int getConstructor() {
            return -1384650041;
        }
    }

    public static class ChatAdministrator extends TdApi.Object {
        public long userId;
        public String customTitle;
        public boolean isOwner;
        public static final int CONSTRUCTOR = 1920449836;

        public ChatAdministrator() {
        }

        public ChatAdministrator(long var1, String var3, boolean var4) {
            this.userId = var1;
            this.customTitle = var3;
            this.isOwner = var4;
        }

        public int getConstructor() {
            return 1920449836;
        }
    }

    public static class ChatActiveStories extends TdApi.Object {
        public long chatId;
        public TdApi.StoryList list;
        public long order;
        public int maxReadStoryId;
        public TdApi.StoryInfo[] stories;
        public static final int CONSTRUCTOR = -1398869529;

        public ChatActiveStories() {
        }

        public ChatActiveStories(long var1, TdApi.StoryList var3, long var4, int var6, TdApi.StoryInfo[] var7) {
            this.chatId = var1;
            this.list = var3;
            this.order = var4;
            this.maxReadStoryId = var6;
            this.stories = var7;
        }

        public int getConstructor() {
            return -1398869529;
        }
    }

    public static class ChatActionBarJoinRequest extends TdApi.ChatActionBar {
        public String title;
        public boolean isChannel;
        public int requestDate;
        public static final int CONSTRUCTOR = 1037140744;

        public ChatActionBarJoinRequest() {
        }

        public ChatActionBarJoinRequest(String var1, boolean var2, int var3) {
            this.title = var1;
            this.isChannel = var2;
            this.requestDate = var3;
        }

        public int getConstructor() {
            return 1037140744;
        }
    }

    public static class ChatActionBarSharePhoneNumber extends TdApi.ChatActionBar {
        public static final int CONSTRUCTOR = 35188697;

        public ChatActionBarSharePhoneNumber() {
        }

        public int getConstructor() {
            return 35188697;
        }
    }

    public static class ChatActionBarAddContact extends TdApi.ChatActionBar {
        public static final int CONSTRUCTOR = -733325295;

        public ChatActionBarAddContact() {
        }

        public int getConstructor() {
            return -733325295;
        }
    }

    public static class ChatActionBarReportAddBlock extends TdApi.ChatActionBar {
        public boolean canUnarchive;
        public int distance;
        public static final int CONSTRUCTOR = -914150419;

        public ChatActionBarReportAddBlock() {
        }

        public ChatActionBarReportAddBlock(boolean var1, int var2) {
            this.canUnarchive = var1;
            this.distance = var2;
        }

        public int getConstructor() {
            return -914150419;
        }
    }

    public static class ChatActionBarInviteMembers extends TdApi.ChatActionBar {
        public static final int CONSTRUCTOR = 1985313904;

        public ChatActionBarInviteMembers() {
        }

        public int getConstructor() {
            return 1985313904;
        }
    }

    public static class ChatActionBarReportUnrelatedLocation extends TdApi.ChatActionBar {
        public static final int CONSTRUCTOR = 758175489;

        public ChatActionBarReportUnrelatedLocation() {
        }

        public int getConstructor() {
            return 758175489;
        }
    }

    public static class ChatActionBarReportSpam extends TdApi.ChatActionBar {
        public boolean canUnarchive;
        public static final int CONSTRUCTOR = -1312758246;

        public ChatActionBarReportSpam() {
        }

        public ChatActionBarReportSpam(boolean var1) {
            this.canUnarchive = var1;
        }

        public int getConstructor() {
            return -1312758246;
        }
    }

    public abstract static class ChatActionBar extends TdApi.Object {
        public ChatActionBar() {
        }
    }

    public static class ChatActionCancel extends TdApi.ChatAction {
        public static final int CONSTRUCTOR = 1160523958;

        public ChatActionCancel() {
        }

        public int getConstructor() {
            return 1160523958;
        }
    }

    public static class ChatActionWatchingAnimations extends TdApi.ChatAction {
        public String emoji;
        public static final int CONSTRUCTOR = 2052990641;

        public ChatActionWatchingAnimations() {
        }

        public ChatActionWatchingAnimations(String var1) {
            this.emoji = var1;
        }

        public int getConstructor() {
            return 2052990641;
        }
    }

    public static class ChatActionUploadingVideoNote extends TdApi.ChatAction {
        public int progress;
        public static final int CONSTRUCTOR = 1172364918;

        public ChatActionUploadingVideoNote() {
        }

        public ChatActionUploadingVideoNote(int var1) {
            this.progress = var1;
        }

        public int getConstructor() {
            return 1172364918;
        }
    }

    public static class ChatActionRecordingVideoNote extends TdApi.ChatAction {
        public static final int CONSTRUCTOR = 16523393;

        public ChatActionRecordingVideoNote() {
        }

        public int getConstructor() {
            return 16523393;
        }
    }

    public static class ChatActionStartPlayingGame extends TdApi.ChatAction {
        public static final int CONSTRUCTOR = -865884164;

        public ChatActionStartPlayingGame() {
        }

        public int getConstructor() {
            return -865884164;
        }
    }

    public static class ChatActionChoosingContact extends TdApi.ChatAction {
        public static final int CONSTRUCTOR = -1222507496;

        public ChatActionChoosingContact() {
        }

        public int getConstructor() {
            return -1222507496;
        }
    }

    public static class ChatActionChoosingLocation extends TdApi.ChatAction {
        public static final int CONSTRUCTOR = -2017893596;

        public ChatActionChoosingLocation() {
        }

        public int getConstructor() {
            return -2017893596;
        }
    }

    public static class ChatActionChoosingSticker extends TdApi.ChatAction {
        public static final int CONSTRUCTOR = 372753697;

        public ChatActionChoosingSticker() {
        }

        public int getConstructor() {
            return 372753697;
        }
    }

    public static class ChatActionUploadingDocument extends TdApi.ChatAction {
        public int progress;
        public static final int CONSTRUCTOR = 167884362;

        public ChatActionUploadingDocument() {
        }

        public ChatActionUploadingDocument(int var1) {
            this.progress = var1;
        }

        public int getConstructor() {
            return 167884362;
        }
    }

    public static class ChatActionUploadingPhoto extends TdApi.ChatAction {
        public int progress;
        public static final int CONSTRUCTOR = 654240583;

        public ChatActionUploadingPhoto() {
        }

        public ChatActionUploadingPhoto(int var1) {
            this.progress = var1;
        }

        public int getConstructor() {
            return 654240583;
        }
    }

    public static class ChatActionUploadingVoiceNote extends TdApi.ChatAction {
        public int progress;
        public static final int CONSTRUCTOR = -613643666;

        public ChatActionUploadingVoiceNote() {
        }

        public ChatActionUploadingVoiceNote(int var1) {
            this.progress = var1;
        }

        public int getConstructor() {
            return -613643666;
        }
    }

    public static class ChatActionRecordingVoiceNote extends TdApi.ChatAction {
        public static final int CONSTRUCTOR = -808850058;

        public ChatActionRecordingVoiceNote() {
        }

        public int getConstructor() {
            return -808850058;
        }
    }

    public static class ChatActionUploadingVideo extends TdApi.ChatAction {
        public int progress;
        public static final int CONSTRUCTOR = 1234185270;

        public ChatActionUploadingVideo() {
        }

        public ChatActionUploadingVideo(int var1) {
            this.progress = var1;
        }

        public int getConstructor() {
            return 1234185270;
        }
    }

    public static class ChatActionRecordingVideo extends TdApi.ChatAction {
        public static final int CONSTRUCTOR = 216553362;

        public ChatActionRecordingVideo() {
        }

        public int getConstructor() {
            return 216553362;
        }
    }

    public static class ChatActionTyping extends TdApi.ChatAction {
        public static final int CONSTRUCTOR = 380122167;

        public ChatActionTyping() {
        }

        public int getConstructor() {
            return 380122167;
        }
    }

    public abstract static class ChatAction extends TdApi.Object {
        public ChatAction() {
        }
    }

    public static class Chat extends TdApi.Object {
        public long id;
        public TdApi.ChatType type;
        public String title;
        public TdApi.ChatPhotoInfo photo;
        public TdApi.ChatPermissions permissions;
        public TdApi.Message lastMessage;
        public TdApi.ChatPosition[] positions;
        public TdApi.MessageSender messageSenderId;
        public TdApi.BlockList blockList;
        public boolean hasProtectedContent;
        public boolean isTranslatable;
        public boolean isMarkedAsUnread;
        public boolean hasScheduledMessages;
        public boolean canBeDeletedOnlyForSelf;
        public boolean canBeDeletedForAllUsers;
        public boolean canBeReported;
        public boolean defaultDisableNotification;
        public int unreadCount;
        public long lastReadInboxMessageId;
        public long lastReadOutboxMessageId;
        public int unreadMentionCount;
        public int unreadReactionCount;
        public TdApi.ChatNotificationSettings notificationSettings;
        public TdApi.ChatAvailableReactions availableReactions;
        public int messageAutoDeleteTime;
        public TdApi.ChatBackground background;
        public String themeName;
        public TdApi.ChatActionBar actionBar;
        public TdApi.VideoChat videoChat;
        public TdApi.ChatJoinRequestsInfo pendingJoinRequests;
        public long replyMarkupMessageId;
        public TdApi.DraftMessage draftMessage;
        public String clientData;
        public static final int CONSTRUCTOR = 1546777568;

        public Chat() {
        }

        public Chat(long var1, TdApi.ChatType var3, String var4, TdApi.ChatPhotoInfo var5, TdApi.ChatPermissions var6, TdApi.Message var7, TdApi.ChatPosition[] var8, TdApi.MessageSender var9, TdApi.BlockList var10, boolean var11, boolean var12, boolean var13, boolean var14, boolean var15, boolean var16, boolean var17, boolean var18, int var19, long var20, long var22, int var24, int var25, TdApi.ChatNotificationSettings var26, TdApi.ChatAvailableReactions var27, int var28, TdApi.ChatBackground var29, String var30, TdApi.ChatActionBar var31, TdApi.VideoChat var32, TdApi.ChatJoinRequestsInfo var33, long var34, TdApi.DraftMessage var36, String var37) {
            this.id = var1;
            this.type = var3;
            this.title = var4;
            this.photo = var5;
            this.permissions = var6;
            this.lastMessage = var7;
            this.positions = var8;
            this.messageSenderId = var9;
            this.blockList = var10;
            this.hasProtectedContent = var11;
            this.isTranslatable = var12;
            this.isMarkedAsUnread = var13;
            this.hasScheduledMessages = var14;
            this.canBeDeletedOnlyForSelf = var15;
            this.canBeDeletedForAllUsers = var16;
            this.canBeReported = var17;
            this.defaultDisableNotification = var18;
            this.unreadCount = var19;
            this.lastReadInboxMessageId = var20;
            this.lastReadOutboxMessageId = var22;
            this.unreadMentionCount = var24;
            this.unreadReactionCount = var25;
            this.notificationSettings = var26;
            this.availableReactions = var27;
            this.messageAutoDeleteTime = var28;
            this.background = var29;
            this.themeName = var30;
            this.actionBar = var31;
            this.videoChat = var32;
            this.pendingJoinRequests = var33;
            this.replyMarkupMessageId = var34;
            this.draftMessage = var36;
            this.clientData = var37;
        }

        public int getConstructor() {
            return 1546777568;
        }
    }

    public static class CanTransferOwnershipResultSessionTooFresh extends TdApi.CanTransferOwnershipResult {
        public int retryAfter;
        public static final int CONSTRUCTOR = 984664289;

        public CanTransferOwnershipResultSessionTooFresh() {
        }

        public CanTransferOwnershipResultSessionTooFresh(int var1) {
            this.retryAfter = var1;
        }

        public int getConstructor() {
            return 984664289;
        }
    }

    public static class CanTransferOwnershipResultPasswordTooFresh extends TdApi.CanTransferOwnershipResult {
        public int retryAfter;
        public static final int CONSTRUCTOR = 811440913;

        public CanTransferOwnershipResultPasswordTooFresh() {
        }

        public CanTransferOwnershipResultPasswordTooFresh(int var1) {
            this.retryAfter = var1;
        }

        public int getConstructor() {
            return 811440913;
        }
    }

    public static class CanTransferOwnershipResultPasswordNeeded extends TdApi.CanTransferOwnershipResult {
        public static final int CONSTRUCTOR = 1548372703;

        public CanTransferOwnershipResultPasswordNeeded() {
        }

        public int getConstructor() {
            return 1548372703;
        }
    }

    public static class CanTransferOwnershipResultOk extends TdApi.CanTransferOwnershipResult {
        public static final int CONSTRUCTOR = -89881021;

        public CanTransferOwnershipResultOk() {
        }

        public int getConstructor() {
            return -89881021;
        }
    }

    public abstract static class CanTransferOwnershipResult extends TdApi.Object {
        public CanTransferOwnershipResult() {
        }
    }

    public static class CanSendStoryResultMonthlyLimitExceeded extends TdApi.CanSendStoryResult {
        public int retryAfter;
        public static final int CONSTRUCTOR = -578665771;

        public CanSendStoryResultMonthlyLimitExceeded() {
        }

        public CanSendStoryResultMonthlyLimitExceeded(int var1) {
            this.retryAfter = var1;
        }

        public int getConstructor() {
            return -578665771;
        }
    }

    public static class CanSendStoryResultWeeklyLimitExceeded extends TdApi.CanSendStoryResult {
        public int retryAfter;
        public static final int CONSTRUCTOR = 323068088;

        public CanSendStoryResultWeeklyLimitExceeded() {
        }

        public CanSendStoryResultWeeklyLimitExceeded(int var1) {
            this.retryAfter = var1;
        }

        public int getConstructor() {
            return 323068088;
        }
    }

    public static class CanSendStoryResultActiveStoryLimitExceeded extends TdApi.CanSendStoryResult {
        public static final int CONSTRUCTOR = -1344689450;

        public CanSendStoryResultActiveStoryLimitExceeded() {
        }

        public int getConstructor() {
            return -1344689450;
        }
    }

    public static class CanSendStoryResultPremiumNeeded extends TdApi.CanSendStoryResult {
        public static final int CONSTRUCTOR = 1451220585;

        public CanSendStoryResultPremiumNeeded() {
        }

        public int getConstructor() {
            return 1451220585;
        }
    }

    public static class CanSendStoryResultOk extends TdApi.CanSendStoryResult {
        public static final int CONSTRUCTOR = 1346171133;

        public CanSendStoryResultOk() {
        }

        public int getConstructor() {
            return 1346171133;
        }
    }

    public abstract static class CanSendStoryResult extends TdApi.Object {
        public CanSendStoryResult() {
        }
    }

    public static class CallbackQueryPayloadGame extends TdApi.CallbackQueryPayload {
        public String gameShortName;
        public static final int CONSTRUCTOR = 1303571512;

        public CallbackQueryPayloadGame() {
        }

        public CallbackQueryPayloadGame(String var1) {
            this.gameShortName = var1;
        }

        public int getConstructor() {
            return 1303571512;
        }
    }

    public static class CallbackQueryPayloadDataWithPassword extends TdApi.CallbackQueryPayload {
        public String password;
        public byte[] data;
        public static final int CONSTRUCTOR = 1340266738;

        public CallbackQueryPayloadDataWithPassword() {
        }

        public CallbackQueryPayloadDataWithPassword(String var1, byte[] var2) {
            this.password = var1;
            this.data = var2;
        }

        public int getConstructor() {
            return 1340266738;
        }
    }

    public static class CallbackQueryPayloadData extends TdApi.CallbackQueryPayload {
        public byte[] data;
        public static final int CONSTRUCTOR = -1977729946;

        public CallbackQueryPayloadData() {
        }

        public CallbackQueryPayloadData(byte[] var1) {
            this.data = var1;
        }

        public int getConstructor() {
            return -1977729946;
        }
    }

    public abstract static class CallbackQueryPayload extends TdApi.Object {
        public CallbackQueryPayload() {
        }
    }

    public static class CallbackQueryAnswer extends TdApi.Object {
        public String text;
        public boolean showAlert;
        public String url;
        public static final int CONSTRUCTOR = 360867933;

        public CallbackQueryAnswer() {
        }

        public CallbackQueryAnswer(String var1, boolean var2, String var3) {
            this.text = var1;
            this.showAlert = var2;
            this.url = var3;
        }

        public int getConstructor() {
            return 360867933;
        }
    }

    public static class CallStateError extends TdApi.CallState {
        public TdApi.Error error;
        public static final int CONSTRUCTOR = -975215467;

        public CallStateError() {
        }

        public CallStateError(TdApi.Error var1) {
            this.error = var1;
        }

        public int getConstructor() {
            return -975215467;
        }
    }

    public static class CallStateDiscarded extends TdApi.CallState {
        public TdApi.CallDiscardReason reason;
        public boolean needRating;
        public boolean needDebugInformation;
        public boolean needLog;
        public static final int CONSTRUCTOR = 1394310213;

        public CallStateDiscarded() {
        }

        public CallStateDiscarded(TdApi.CallDiscardReason var1, boolean var2, boolean var3, boolean var4) {
            this.reason = var1;
            this.needRating = var2;
            this.needDebugInformation = var3;
            this.needLog = var4;
        }

        public int getConstructor() {
            return 1394310213;
        }
    }

    public static class CallStateHangingUp extends TdApi.CallState {
        public static final int CONSTRUCTOR = -2133790038;

        public CallStateHangingUp() {
        }

        public int getConstructor() {
            return -2133790038;
        }
    }

    public static class CallStateReady extends TdApi.CallState {
        public TdApi.CallProtocol protocol;
        public TdApi.CallServer[] servers;
        public String config;
        public byte[] encryptionKey;
        public String[] emojis;
        public boolean allowP2p;
        public static final int CONSTRUCTOR = -2000107571;

        public CallStateReady() {
        }

        public CallStateReady(TdApi.CallProtocol var1, TdApi.CallServer[] var2, String var3, byte[] var4, String[] var5, boolean var6) {
            this.protocol = var1;
            this.servers = var2;
            this.config = var3;
            this.encryptionKey = var4;
            this.emojis = var5;
            this.allowP2p = var6;
        }

        public int getConstructor() {
            return -2000107571;
        }
    }

    public static class CallStateExchangingKeys extends TdApi.CallState {
        public static final int CONSTRUCTOR = -1848149403;

        public CallStateExchangingKeys() {
        }

        public int getConstructor() {
            return -1848149403;
        }
    }

    public static class CallStatePending extends TdApi.CallState {
        public boolean isCreated;
        public boolean isReceived;
        public static final int CONSTRUCTOR = 1073048620;

        public CallStatePending() {
        }

        public CallStatePending(boolean var1, boolean var2) {
            this.isCreated = var1;
            this.isReceived = var2;
        }

        public int getConstructor() {
            return 1073048620;
        }
    }

    public abstract static class CallState extends TdApi.Object {
        public CallState() {
        }
    }

    public static class CallServerTypeWebrtc extends TdApi.CallServerType {
        public String username;
        public String password;
        public boolean supportsTurn;
        public boolean supportsStun;
        public static final int CONSTRUCTOR = 1250622821;

        public CallServerTypeWebrtc() {
        }

        public CallServerTypeWebrtc(String var1, String var2, boolean var3, boolean var4) {
            this.username = var1;
            this.password = var2;
            this.supportsTurn = var3;
            this.supportsStun = var4;
        }

        public int getConstructor() {
            return 1250622821;
        }
    }

    public static class CallServerTypeTelegramReflector extends TdApi.CallServerType {
        public byte[] peerTag;
        public boolean isTcp;
        public static final int CONSTRUCTOR = 850343189;

        public CallServerTypeTelegramReflector() {
        }

        public CallServerTypeTelegramReflector(byte[] var1, boolean var2) {
            this.peerTag = var1;
            this.isTcp = var2;
        }

        public int getConstructor() {
            return 850343189;
        }
    }

    public abstract static class CallServerType extends TdApi.Object {
        public CallServerType() {
        }
    }

    public static class CallServer extends TdApi.Object {
        public long id;
        public String ipAddress;
        public String ipv6Address;
        public int port;
        public TdApi.CallServerType type;
        public static final int CONSTRUCTOR = 1865932695;

        public CallServer() {
        }

        public CallServer(long var1, String var3, String var4, int var5, TdApi.CallServerType var6) {
            this.id = var1;
            this.ipAddress = var3;
            this.ipv6Address = var4;
            this.port = var5;
            this.type = var6;
        }

        public int getConstructor() {
            return 1865932695;
        }
    }

    public static class CallProtocol extends TdApi.Object {
        public boolean udpP2p;
        public boolean udpReflector;
        public int minLayer;
        public int maxLayer;
        public String[] libraryVersions;
        public static final int CONSTRUCTOR = -1075562897;

        public CallProtocol() {
        }

        public CallProtocol(boolean var1, boolean var2, int var3, int var4, String[] var5) {
            this.udpP2p = var1;
            this.udpReflector = var2;
            this.minLayer = var3;
            this.maxLayer = var4;
            this.libraryVersions = var5;
        }

        public int getConstructor() {
            return -1075562897;
        }
    }

    public static class CallProblemPixelatedVideo extends TdApi.CallProblem {
        public static final int CONSTRUCTOR = 2115315411;

        public CallProblemPixelatedVideo() {
        }

        public int getConstructor() {
            return 2115315411;
        }
    }

    public static class CallProblemDistortedVideo extends TdApi.CallProblem {
        public static final int CONSTRUCTOR = 385245706;

        public CallProblemDistortedVideo() {
        }

        public int getConstructor() {
            return 385245706;
        }
    }

    public static class CallProblemDropped extends TdApi.CallProblem {
        public static final int CONSTRUCTOR = -1207311487;

        public CallProblemDropped() {
        }

        public int getConstructor() {
            return -1207311487;
        }
    }

    public static class CallProblemSilentRemote extends TdApi.CallProblem {
        public static final int CONSTRUCTOR = 573634714;

        public CallProblemSilentRemote() {
        }

        public int getConstructor() {
            return 573634714;
        }
    }

    public static class CallProblemSilentLocal extends TdApi.CallProblem {
        public static final int CONSTRUCTOR = 253652790;

        public CallProblemSilentLocal() {
        }

        public int getConstructor() {
            return 253652790;
        }
    }

    public static class CallProblemDistortedSpeech extends TdApi.CallProblem {
        public static final int CONSTRUCTOR = 379960581;

        public CallProblemDistortedSpeech() {
        }

        public int getConstructor() {
            return 379960581;
        }
    }

    public static class CallProblemInterruptions extends TdApi.CallProblem {
        public static final int CONSTRUCTOR = 1119493218;

        public CallProblemInterruptions() {
        }

        public int getConstructor() {
            return 1119493218;
        }
    }

    public static class CallProblemNoise extends TdApi.CallProblem {
        public static final int CONSTRUCTOR = 1053065359;

        public CallProblemNoise() {
        }

        public int getConstructor() {
            return 1053065359;
        }
    }

    public static class CallProblemEcho extends TdApi.CallProblem {
        public static final int CONSTRUCTOR = 801116548;

        public CallProblemEcho() {
        }

        public int getConstructor() {
            return 801116548;
        }
    }

    public abstract static class CallProblem extends TdApi.Object {
        public CallProblem() {
        }
    }

    public static class CallId extends TdApi.Object {
        public int id;
        public static final int CONSTRUCTOR = 65717769;

        public CallId() {
        }

        public CallId(int var1) {
            this.id = var1;
        }

        public int getConstructor() {
            return 65717769;
        }
    }

    public static class CallDiscardReasonHungUp extends TdApi.CallDiscardReason {
        public static final int CONSTRUCTOR = 438216166;

        public CallDiscardReasonHungUp() {
        }

        public int getConstructor() {
            return 438216166;
        }
    }

    public static class CallDiscardReasonDisconnected extends TdApi.CallDiscardReason {
        public static final int CONSTRUCTOR = -1342872670;

        public CallDiscardReasonDisconnected() {
        }

        public int getConstructor() {
            return -1342872670;
        }
    }

    public static class CallDiscardReasonDeclined extends TdApi.CallDiscardReason {
        public static final int CONSTRUCTOR = -1729926094;

        public CallDiscardReasonDeclined() {
        }

        public int getConstructor() {
            return -1729926094;
        }
    }

    public static class CallDiscardReasonMissed extends TdApi.CallDiscardReason {
        public static final int CONSTRUCTOR = 1680358012;

        public CallDiscardReasonMissed() {
        }

        public int getConstructor() {
            return 1680358012;
        }
    }

    public static class CallDiscardReasonEmpty extends TdApi.CallDiscardReason {
        public static final int CONSTRUCTOR = -1258917949;

        public CallDiscardReasonEmpty() {
        }

        public int getConstructor() {
            return -1258917949;
        }
    }

    public abstract static class CallDiscardReason extends TdApi.Object {
        public CallDiscardReason() {
        }
    }

    public static class Call extends TdApi.Object {
        public int id;
        public long userId;
        public boolean isOutgoing;
        public boolean isVideo;
        public TdApi.CallState state;
        public static final int CONSTRUCTOR = 920360804;

        public Call() {
        }

        public Call(int var1, long var2, boolean var4, boolean var5, TdApi.CallState var6) {
            this.id = var1;
            this.userId = var2;
            this.isOutgoing = var4;
            this.isVideo = var5;
            this.state = var6;
        }

        public int getConstructor() {
            return 920360804;
        }
    }

    public static class BotMenuButton extends TdApi.Object {
        public String text;
        public String url;
        public static final int CONSTRUCTOR = -944407322;

        public BotMenuButton() {
        }

        public BotMenuButton(String var1, String var2) {
            this.text = var1;
            this.url = var2;
        }

        public int getConstructor() {
            return -944407322;
        }
    }

    public static class BotInfo extends TdApi.Object {
        public String shortDescription;
        public String description;
        public TdApi.Photo photo;
        public TdApi.Animation animation;
        public TdApi.BotMenuButton menuButton;
        public TdApi.BotCommand[] commands;
        public TdApi.ChatAdministratorRights defaultGroupAdministratorRights;
        public TdApi.ChatAdministratorRights defaultChannelAdministratorRights;
        public TdApi.InternalLinkType editCommandsLink;
        public TdApi.InternalLinkType editDescriptionLink;
        public TdApi.InternalLinkType editDescriptionMediaLink;
        public TdApi.InternalLinkType editSettingsLink;
        public static final int CONSTRUCTOR = -1472546735;

        public BotInfo() {
        }

        public BotInfo(String var1, String var2, TdApi.Photo var3, TdApi.Animation var4, TdApi.BotMenuButton var5, TdApi.BotCommand[] var6, TdApi.ChatAdministratorRights var7, TdApi.ChatAdministratorRights var8, TdApi.InternalLinkType var9, TdApi.InternalLinkType var10, TdApi.InternalLinkType var11, TdApi.InternalLinkType var12) {
            this.shortDescription = var1;
            this.description = var2;
            this.photo = var3;
            this.animation = var4;
            this.menuButton = var5;
            this.commands = var6;
            this.defaultGroupAdministratorRights = var7;
            this.defaultChannelAdministratorRights = var8;
            this.editCommandsLink = var9;
            this.editDescriptionLink = var10;
            this.editDescriptionMediaLink = var11;
            this.editSettingsLink = var12;
        }

        public int getConstructor() {
            return -1472546735;
        }
    }

    public static class BotCommands extends TdApi.Object {
        public long botUserId;
        public TdApi.BotCommand[] commands;
        public static final int CONSTRUCTOR = 1741364468;

        public BotCommands() {
        }

        public BotCommands(long var1, TdApi.BotCommand[] var3) {
            this.botUserId = var1;
            this.commands = var3;
        }

        public int getConstructor() {
            return 1741364468;
        }
    }

    public static class BotCommandScopeChatMember extends TdApi.BotCommandScope {
        public long chatId;
        public long userId;
        public static final int CONSTRUCTOR = -211380494;

        public BotCommandScopeChatMember() {
        }

        public BotCommandScopeChatMember(long var1, long var3) {
            this.chatId = var1;
            this.userId = var3;
        }

        public int getConstructor() {
            return -211380494;
        }
    }

    public static class BotCommandScopeChatAdministrators extends TdApi.BotCommandScope {
        public long chatId;
        public static final int CONSTRUCTOR = 1119682126;

        public BotCommandScopeChatAdministrators() {
        }

        public BotCommandScopeChatAdministrators(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 1119682126;
        }
    }

    public static class BotCommandScopeChat extends TdApi.BotCommandScope {
        public long chatId;
        public static final int CONSTRUCTOR = -430234971;

        public BotCommandScopeChat() {
        }

        public BotCommandScopeChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -430234971;
        }
    }

    public static class BotCommandScopeAllChatAdministrators extends TdApi.BotCommandScope {
        public static final int CONSTRUCTOR = 1998329169;

        public BotCommandScopeAllChatAdministrators() {
        }

        public int getConstructor() {
            return 1998329169;
        }
    }

    public static class BotCommandScopeAllGroupChats extends TdApi.BotCommandScope {
        public static final int CONSTRUCTOR = -981088162;

        public BotCommandScopeAllGroupChats() {
        }

        public int getConstructor() {
            return -981088162;
        }
    }

    public static class BotCommandScopeAllPrivateChats extends TdApi.BotCommandScope {
        public static final int CONSTRUCTOR = -344889543;

        public BotCommandScopeAllPrivateChats() {
        }

        public int getConstructor() {
            return -344889543;
        }
    }

    public static class BotCommandScopeDefault extends TdApi.BotCommandScope {
        public static final int CONSTRUCTOR = 795652779;

        public BotCommandScopeDefault() {
        }

        public int getConstructor() {
            return 795652779;
        }
    }

    public abstract static class BotCommandScope extends TdApi.Object {
        public BotCommandScope() {
        }
    }

    public static class BotCommand extends TdApi.Object {
        public String command;
        public String description;
        public static final int CONSTRUCTOR = -1032140601;

        public BotCommand() {
        }

        public BotCommand(String var1, String var2) {
            this.command = var1;
            this.description = var2;
        }

        public int getConstructor() {
            return -1032140601;
        }
    }

    public static class BlockListStories extends TdApi.BlockList {
        public static final int CONSTRUCTOR = 103323228;

        public BlockListStories() {
        }

        public int getConstructor() {
            return 103323228;
        }
    }

    public static class BlockListMain extends TdApi.BlockList {
        public static final int CONSTRUCTOR = 1352930172;

        public BlockListMain() {
        }

        public int getConstructor() {
            return 1352930172;
        }
    }

    public abstract static class BlockList extends TdApi.Object {
        public BlockList() {
        }
    }

    public static class BasicGroupFullInfo extends TdApi.Object {
        public TdApi.ChatPhoto photo;
        public String description;
        public long creatorUserId;
        public TdApi.ChatMember[] members;
        public boolean canHideMembers;
        public boolean canToggleAggressiveAntiSpam;
        public TdApi.ChatInviteLink inviteLink;
        public TdApi.BotCommands[] botCommands;
        public static final int CONSTRUCTOR = -1879035520;

        public BasicGroupFullInfo() {
        }

        public BasicGroupFullInfo(TdApi.ChatPhoto var1, String var2, long var3, TdApi.ChatMember[] var5, boolean var6, boolean var7, TdApi.ChatInviteLink var8, TdApi.BotCommands[] var9) {
            this.photo = var1;
            this.description = var2;
            this.creatorUserId = var3;
            this.members = var5;
            this.canHideMembers = var6;
            this.canToggleAggressiveAntiSpam = var7;
            this.inviteLink = var8;
            this.botCommands = var9;
        }

        public int getConstructor() {
            return -1879035520;
        }
    }

    public static class BasicGroup extends TdApi.Object {
        public long id;
        public int memberCount;
        public TdApi.ChatMemberStatus status;
        public boolean isActive;
        public long upgradedToSupergroupId;
        public static final int CONSTRUCTOR = -194767217;

        public BasicGroup() {
        }

        public BasicGroup(long var1, int var3, TdApi.ChatMemberStatus var4, boolean var5, long var6) {
            this.id = var1;
            this.memberCount = var3;
            this.status = var4;
            this.isActive = var5;
            this.upgradedToSupergroupId = var6;
        }

        public int getConstructor() {
            return -194767217;
        }
    }

    public static class BankCardInfo extends TdApi.Object {
        public String title;
        public TdApi.BankCardActionOpenUrl[] actions;
        public static final int CONSTRUCTOR = -2116647730;

        public BankCardInfo() {
        }

        public BankCardInfo(String var1, TdApi.BankCardActionOpenUrl[] var2) {
            this.title = var1;
            this.actions = var2;
        }

        public int getConstructor() {
            return -2116647730;
        }
    }

    public static class BankCardActionOpenUrl extends TdApi.Object {
        public String text;
        public String url;
        public static final int CONSTRUCTOR = -196454267;

        public BankCardActionOpenUrl() {
        }

        public BankCardActionOpenUrl(String var1, String var2) {
            this.text = var1;
            this.url = var2;
        }

        public int getConstructor() {
            return -196454267;
        }
    }

    public static class Backgrounds extends TdApi.Object {
        public TdApi.Background[] backgrounds;
        public static final int CONSTRUCTOR = 724728704;

        public Backgrounds() {
        }

        public Backgrounds(TdApi.Background[] var1) {
            this.backgrounds = var1;
        }

        public int getConstructor() {
            return 724728704;
        }
    }

    public static class BackgroundTypeFill extends TdApi.BackgroundType {
        public TdApi.BackgroundFill fill;
        public static final int CONSTRUCTOR = 993008684;

        public BackgroundTypeFill() {
        }

        public BackgroundTypeFill(TdApi.BackgroundFill var1) {
            this.fill = var1;
        }

        public int getConstructor() {
            return 993008684;
        }
    }

    public static class BackgroundTypePattern extends TdApi.BackgroundType {
        public TdApi.BackgroundFill fill;
        public int intensity;
        public boolean isInverted;
        public boolean isMoving;
        public static final int CONSTRUCTOR = 1290213117;

        public BackgroundTypePattern() {
        }

        public BackgroundTypePattern(TdApi.BackgroundFill var1, int var2, boolean var3, boolean var4) {
            this.fill = var1;
            this.intensity = var2;
            this.isInverted = var3;
            this.isMoving = var4;
        }

        public int getConstructor() {
            return 1290213117;
        }
    }

    public static class BackgroundTypeWallpaper extends TdApi.BackgroundType {
        public boolean isBlurred;
        public boolean isMoving;
        public static final int CONSTRUCTOR = 1972128891;

        public BackgroundTypeWallpaper() {
        }

        public BackgroundTypeWallpaper(boolean var1, boolean var2) {
            this.isBlurred = var1;
            this.isMoving = var2;
        }

        public int getConstructor() {
            return 1972128891;
        }
    }

    public abstract static class BackgroundType extends TdApi.Object {
        public BackgroundType() {
        }
    }

    public static class BackgroundFillFreeformGradient extends TdApi.BackgroundFill {
        public int[] colors;
        public static final int CONSTRUCTOR = -1145469255;

        public BackgroundFillFreeformGradient() {
        }

        public BackgroundFillFreeformGradient(int[] var1) {
            this.colors = var1;
        }

        public int getConstructor() {
            return -1145469255;
        }
    }

    public static class BackgroundFillGradient extends TdApi.BackgroundFill {
        public int topColor;
        public int bottomColor;
        public int rotationAngle;
        public static final int CONSTRUCTOR = -1839206017;

        public BackgroundFillGradient() {
        }

        public BackgroundFillGradient(int var1, int var2, int var3) {
            this.topColor = var1;
            this.bottomColor = var2;
            this.rotationAngle = var3;
        }

        public int getConstructor() {
            return -1839206017;
        }
    }

    public static class BackgroundFillSolid extends TdApi.BackgroundFill {
        public int color;
        public static final int CONSTRUCTOR = 1010678813;

        public BackgroundFillSolid() {
        }

        public BackgroundFillSolid(int var1) {
            this.color = var1;
        }

        public int getConstructor() {
            return 1010678813;
        }
    }

    public abstract static class BackgroundFill extends TdApi.Object {
        public BackgroundFill() {
        }
    }

    public static class Background extends TdApi.Object {
        public long id;
        public boolean isDefault;
        public boolean isDark;
        public String name;
        public TdApi.Document document;
        public TdApi.BackgroundType type;
        public static final int CONSTRUCTOR = -429971172;

        public Background() {
        }

        public Background(long var1, boolean var3, boolean var4, String var5, TdApi.Document var6, TdApi.BackgroundType var7) {
            this.id = var1;
            this.isDefault = var3;
            this.isDark = var4;
            this.name = var5;
            this.document = var6;
            this.type = var7;
        }

        public int getConstructor() {
            return -429971172;
        }
    }

    public static class AvailableReactions extends TdApi.Object {
        public TdApi.AvailableReaction[] topReactions;
        public TdApi.AvailableReaction[] recentReactions;
        public TdApi.AvailableReaction[] popularReactions;
        public boolean allowCustomEmoji;
        public static final int CONSTRUCTOR = 1995943616;

        public AvailableReactions() {
        }

        public AvailableReactions(TdApi.AvailableReaction[] var1, TdApi.AvailableReaction[] var2, TdApi.AvailableReaction[] var3, boolean var4) {
            this.topReactions = var1;
            this.recentReactions = var2;
            this.popularReactions = var3;
            this.allowCustomEmoji = var4;
        }

        public int getConstructor() {
            return 1995943616;
        }
    }

    public static class AvailableReaction extends TdApi.Object {
        public TdApi.ReactionType type;
        public boolean needsPremium;
        public static final int CONSTRUCTOR = -117292153;

        public AvailableReaction() {
        }

        public AvailableReaction(TdApi.ReactionType var1, boolean var2) {
            this.type = var1;
            this.needsPremium = var2;
        }

        public int getConstructor() {
            return -117292153;
        }
    }

    public static class AutosaveSettingsScopeChat extends TdApi.AutosaveSettingsScope {
        public long chatId;
        public static final int CONSTRUCTOR = -1632255255;

        public AutosaveSettingsScopeChat() {
        }

        public AutosaveSettingsScopeChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -1632255255;
        }
    }

    public static class AutosaveSettingsScopeChannelChats extends TdApi.AutosaveSettingsScope {
        public static final int CONSTRUCTOR = -499572783;

        public AutosaveSettingsScopeChannelChats() {
        }

        public int getConstructor() {
            return -499572783;
        }
    }

    public static class AutosaveSettingsScopeGroupChats extends TdApi.AutosaveSettingsScope {
        public static final int CONSTRUCTOR = 853544526;

        public AutosaveSettingsScopeGroupChats() {
        }

        public int getConstructor() {
            return 853544526;
        }
    }

    public static class AutosaveSettingsScopePrivateChats extends TdApi.AutosaveSettingsScope {
        public static final int CONSTRUCTOR = 1395227007;

        public AutosaveSettingsScopePrivateChats() {
        }

        public int getConstructor() {
            return 1395227007;
        }
    }

    public abstract static class AutosaveSettingsScope extends TdApi.Object {
        public AutosaveSettingsScope() {
        }
    }

    public static class AutosaveSettingsException extends TdApi.Object {
        public long chatId;
        public TdApi.ScopeAutosaveSettings settings;
        public static final int CONSTRUCTOR = 1483470280;

        public AutosaveSettingsException() {
        }

        public AutosaveSettingsException(long var1, TdApi.ScopeAutosaveSettings var3) {
            this.chatId = var1;
            this.settings = var3;
        }

        public int getConstructor() {
            return 1483470280;
        }
    }

    public static class AutosaveSettings extends TdApi.Object {
        public TdApi.ScopeAutosaveSettings privateChatSettings;
        public TdApi.ScopeAutosaveSettings groupSettings;
        public TdApi.ScopeAutosaveSettings channelSettings;
        public TdApi.AutosaveSettingsException[] exceptions;
        public static final int CONSTRUCTOR = 1629412502;

        public AutosaveSettings() {
        }

        public AutosaveSettings(TdApi.ScopeAutosaveSettings var1, TdApi.ScopeAutosaveSettings var2, TdApi.ScopeAutosaveSettings var3, TdApi.AutosaveSettingsException[] var4) {
            this.privateChatSettings = var1;
            this.groupSettings = var2;
            this.channelSettings = var3;
            this.exceptions = var4;
        }

        public int getConstructor() {
            return 1629412502;
        }
    }

    public static class AutoDownloadSettingsPresets extends TdApi.Object {
        public TdApi.AutoDownloadSettings low;
        public TdApi.AutoDownloadSettings medium;
        public TdApi.AutoDownloadSettings high;
        public static final int CONSTRUCTOR = -782099166;

        public AutoDownloadSettingsPresets() {
        }

        public AutoDownloadSettingsPresets(TdApi.AutoDownloadSettings var1, TdApi.AutoDownloadSettings var2, TdApi.AutoDownloadSettings var3) {
            this.low = var1;
            this.medium = var2;
            this.high = var3;
        }

        public int getConstructor() {
            return -782099166;
        }
    }

    public static class AutoDownloadSettings extends TdApi.Object {
        public boolean isAutoDownloadEnabled;
        public int maxPhotoFileSize;
        public long maxVideoFileSize;
        public long maxOtherFileSize;
        public int videoUploadBitrate;
        public boolean preloadLargeVideos;
        public boolean preloadNextAudio;
        public boolean preloadStories;
        public boolean useLessDataForCalls;
        public static final int CONSTRUCTOR = 991433696;

        public AutoDownloadSettings() {
        }

        public AutoDownloadSettings(boolean var1, int var2, long var3, long var5, int var7, boolean var8, boolean var9, boolean var10, boolean var11) {
            this.isAutoDownloadEnabled = var1;
            this.maxPhotoFileSize = var2;
            this.maxVideoFileSize = var3;
            this.maxOtherFileSize = var5;
            this.videoUploadBitrate = var7;
            this.preloadLargeVideos = var8;
            this.preloadNextAudio = var9;
            this.preloadStories = var10;
            this.useLessDataForCalls = var11;
        }

        public int getConstructor() {
            return 991433696;
        }
    }

    public static class AuthorizationStateClosed extends TdApi.AuthorizationState {
        public static final int CONSTRUCTOR = 1526047584;

        public AuthorizationStateClosed() {
        }

        public int getConstructor() {
            return 1526047584;
        }
    }

    public static class AuthorizationStateClosing extends TdApi.AuthorizationState {
        public static final int CONSTRUCTOR = 445855311;

        public AuthorizationStateClosing() {
        }

        public int getConstructor() {
            return 445855311;
        }
    }

    public static class AuthorizationStateLoggingOut extends TdApi.AuthorizationState {
        public static final int CONSTRUCTOR = 154449270;

        public AuthorizationStateLoggingOut() {
        }

        public int getConstructor() {
            return 154449270;
        }
    }

    public static class AuthorizationStateReady extends TdApi.AuthorizationState {
        public static final int CONSTRUCTOR = -1834871737;

        public AuthorizationStateReady() {
        }

        public int getConstructor() {
            return -1834871737;
        }
    }

    public static class AuthorizationStateWaitPassword extends TdApi.AuthorizationState {
        public String passwordHint;
        public boolean hasRecoveryEmailAddress;
        public boolean hasPassportData;
        public String recoveryEmailAddressPattern;
        public static final int CONSTRUCTOR = 112238030;

        public AuthorizationStateWaitPassword() {
        }

        public AuthorizationStateWaitPassword(String var1, boolean var2, boolean var3, String var4) {
            this.passwordHint = var1;
            this.hasRecoveryEmailAddress = var2;
            this.hasPassportData = var3;
            this.recoveryEmailAddressPattern = var4;
        }

        public int getConstructor() {
            return 112238030;
        }
    }

    public static class AuthorizationStateWaitRegistration extends TdApi.AuthorizationState {
        public TdApi.TermsOfService termsOfService;
        public static final int CONSTRUCTOR = 550350511;

        public AuthorizationStateWaitRegistration() {
        }

        public AuthorizationStateWaitRegistration(TdApi.TermsOfService var1) {
            this.termsOfService = var1;
        }

        public int getConstructor() {
            return 550350511;
        }
    }

    public static class AuthorizationStateWaitOtherDeviceConfirmation extends TdApi.AuthorizationState {
        public String link;
        public static final int CONSTRUCTOR = 860166378;

        public AuthorizationStateWaitOtherDeviceConfirmation() {
        }

        public AuthorizationStateWaitOtherDeviceConfirmation(String var1) {
            this.link = var1;
        }

        public int getConstructor() {
            return 860166378;
        }
    }

    public static class AuthorizationStateWaitCode extends TdApi.AuthorizationState {
        public TdApi.AuthenticationCodeInfo codeInfo;
        public static final int CONSTRUCTOR = 52643073;

        public AuthorizationStateWaitCode() {
        }

        public AuthorizationStateWaitCode(TdApi.AuthenticationCodeInfo var1) {
            this.codeInfo = var1;
        }

        public int getConstructor() {
            return 52643073;
        }
    }

    public static class AuthorizationStateWaitEmailCode extends TdApi.AuthorizationState {
        public boolean allowAppleId;
        public boolean allowGoogleId;
        public TdApi.EmailAddressAuthenticationCodeInfo codeInfo;
        public TdApi.EmailAddressResetState emailAddressResetState;
        public static final int CONSTRUCTOR = -1868627365;

        public AuthorizationStateWaitEmailCode() {
        }

        public AuthorizationStateWaitEmailCode(boolean var1, boolean var2, TdApi.EmailAddressAuthenticationCodeInfo var3, TdApi.EmailAddressResetState var4) {
            this.allowAppleId = var1;
            this.allowGoogleId = var2;
            this.codeInfo = var3;
            this.emailAddressResetState = var4;
        }

        public int getConstructor() {
            return -1868627365;
        }
    }

    public static class AuthorizationStateWaitEmailAddress extends TdApi.AuthorizationState {
        public boolean allowAppleId;
        public boolean allowGoogleId;
        public static final int CONSTRUCTOR = 1040478663;

        public AuthorizationStateWaitEmailAddress() {
        }

        public AuthorizationStateWaitEmailAddress(boolean var1, boolean var2) {
            this.allowAppleId = var1;
            this.allowGoogleId = var2;
        }

        public int getConstructor() {
            return 1040478663;
        }
    }

    public static class AuthorizationStateWaitPhoneNumber extends TdApi.AuthorizationState {
        public static final int CONSTRUCTOR = 306402531;

        public AuthorizationStateWaitPhoneNumber() {
        }

        public int getConstructor() {
            return 306402531;
        }
    }

    public static class AuthorizationStateWaitTdlibParameters extends TdApi.AuthorizationState {
        public static final int CONSTRUCTOR = 904720988;

        public AuthorizationStateWaitTdlibParameters() {
        }

        public int getConstructor() {
            return 904720988;
        }
    }

    public abstract static class AuthorizationState extends TdApi.Object {
        public AuthorizationState() {
        }
    }

    public static class AuthenticationCodeTypeFirebaseIos extends TdApi.AuthenticationCodeType {
        public String receipt;
        public int pushTimeout;
        public int length;
        public static final int CONSTRUCTOR = -11162989;

        public AuthenticationCodeTypeFirebaseIos() {
        }

        public AuthenticationCodeTypeFirebaseIos(String var1, int var2, int var3) {
            this.receipt = var1;
            this.pushTimeout = var2;
            this.length = var3;
        }

        public int getConstructor() {
            return -11162989;
        }
    }

    public static class AuthenticationCodeTypeFirebaseAndroid extends TdApi.AuthenticationCodeType {
        public byte[] nonce;
        public int length;
        public static final int CONSTRUCTOR = -1978562535;

        public AuthenticationCodeTypeFirebaseAndroid() {
        }

        public AuthenticationCodeTypeFirebaseAndroid(byte[] var1, int var2) {
            this.nonce = var1;
            this.length = var2;
        }

        public int getConstructor() {
            return -1978562535;
        }
    }

    public static class AuthenticationCodeTypeFragment extends TdApi.AuthenticationCodeType {
        public String url;
        public int length;
        public static final int CONSTRUCTOR = -2129693491;

        public AuthenticationCodeTypeFragment() {
        }

        public AuthenticationCodeTypeFragment(String var1, int var2) {
            this.url = var1;
            this.length = var2;
        }

        public int getConstructor() {
            return -2129693491;
        }
    }

    public static class AuthenticationCodeTypeMissedCall extends TdApi.AuthenticationCodeType {
        public String phoneNumberPrefix;
        public int length;
        public static final int CONSTRUCTOR = 700123783;

        public AuthenticationCodeTypeMissedCall() {
        }

        public AuthenticationCodeTypeMissedCall(String var1, int var2) {
            this.phoneNumberPrefix = var1;
            this.length = var2;
        }

        public int getConstructor() {
            return 700123783;
        }
    }

    public static class AuthenticationCodeTypeFlashCall extends TdApi.AuthenticationCodeType {
        public String pattern;
        public static final int CONSTRUCTOR = 1395882402;

        public AuthenticationCodeTypeFlashCall() {
        }

        public AuthenticationCodeTypeFlashCall(String var1) {
            this.pattern = var1;
        }

        public int getConstructor() {
            return 1395882402;
        }
    }

    public static class AuthenticationCodeTypeCall extends TdApi.AuthenticationCodeType {
        public int length;
        public static final int CONSTRUCTOR = 1636265063;

        public AuthenticationCodeTypeCall() {
        }

        public AuthenticationCodeTypeCall(int var1) {
            this.length = var1;
        }

        public int getConstructor() {
            return 1636265063;
        }
    }

    public static class AuthenticationCodeTypeSms extends TdApi.AuthenticationCodeType {
        public int length;
        public static final int CONSTRUCTOR = 962650760;

        public AuthenticationCodeTypeSms() {
        }

        public AuthenticationCodeTypeSms(int var1) {
            this.length = var1;
        }

        public int getConstructor() {
            return 962650760;
        }
    }

    public static class AuthenticationCodeTypeTelegramMessage extends TdApi.AuthenticationCodeType {
        public int length;
        public static final int CONSTRUCTOR = 2079628074;

        public AuthenticationCodeTypeTelegramMessage() {
        }

        public AuthenticationCodeTypeTelegramMessage(int var1) {
            this.length = var1;
        }

        public int getConstructor() {
            return 2079628074;
        }
    }

    public abstract static class AuthenticationCodeType extends TdApi.Object {
        public AuthenticationCodeType() {
        }
    }

    public static class AuthenticationCodeInfo extends TdApi.Object {
        public String phoneNumber;
        public TdApi.AuthenticationCodeType type;
        public TdApi.AuthenticationCodeType nextType;
        public int timeout;
        public static final int CONSTRUCTOR = -860345416;

        public AuthenticationCodeInfo() {
        }

        public AuthenticationCodeInfo(String var1, TdApi.AuthenticationCodeType var2, TdApi.AuthenticationCodeType var3, int var4) {
            this.phoneNumber = var1;
            this.type = var2;
            this.nextType = var3;
            this.timeout = var4;
        }

        public int getConstructor() {
            return -860345416;
        }
    }

    public static class Audio extends TdApi.Object {
        public int duration;
        public String title;
        public String performer;
        public String fileName;
        public String mimeType;
        public TdApi.Minithumbnail albumCoverMinithumbnail;
        public TdApi.Thumbnail albumCoverThumbnail;
        public TdApi.Thumbnail[] externalAlbumCovers;
        public TdApi.File audio;
        public static final int CONSTRUCTOR = -166398841;

        public Audio() {
        }

        public Audio(int var1, String var2, String var3, String var4, String var5, TdApi.Minithumbnail var6, TdApi.Thumbnail var7, TdApi.Thumbnail[] var8, TdApi.File var9) {
            this.duration = var1;
            this.title = var2;
            this.performer = var3;
            this.fileName = var4;
            this.mimeType = var5;
            this.albumCoverMinithumbnail = var6;
            this.albumCoverThumbnail = var7;
            this.externalAlbumCovers = var8;
            this.audio = var9;
        }

        public int getConstructor() {
            return -166398841;
        }
    }

    public static class AttachmentMenuBotColor extends TdApi.Object {
        public int lightColor;
        public int darkColor;
        public static final int CONSTRUCTOR = 1680039612;

        public AttachmentMenuBotColor() {
        }

        public AttachmentMenuBotColor(int var1, int var2) {
            this.lightColor = var1;
            this.darkColor = var2;
        }

        public int getConstructor() {
            return 1680039612;
        }
    }

    public static class AttachmentMenuBot extends TdApi.Object {
        public long botUserId;
        public boolean supportsSelfChat;
        public boolean supportsUserChats;
        public boolean supportsBotChats;
        public boolean supportsGroupChats;
        public boolean supportsChannelChats;
        public boolean supportsSettings;
        public boolean requestWriteAccess;
        public String name;
        public TdApi.AttachmentMenuBotColor nameColor;
        public TdApi.File defaultIcon;
        public TdApi.File iosStaticIcon;
        public TdApi.File iosAnimatedIcon;
        public TdApi.File androidIcon;
        public TdApi.File macosIcon;
        public TdApi.AttachmentMenuBotColor iconColor;
        public TdApi.File webAppPlaceholder;
        public static final int CONSTRUCTOR = 1495310429;

        public AttachmentMenuBot() {
        }

        public AttachmentMenuBot(long var1, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9, String var10, TdApi.AttachmentMenuBotColor var11, TdApi.File var12, TdApi.File var13, TdApi.File var14, TdApi.File var15, TdApi.File var16, TdApi.AttachmentMenuBotColor var17, TdApi.File var18) {
            this.botUserId = var1;
            this.supportsSelfChat = var3;
            this.supportsUserChats = var4;
            this.supportsBotChats = var5;
            this.supportsGroupChats = var6;
            this.supportsChannelChats = var7;
            this.supportsSettings = var8;
            this.requestWriteAccess = var9;
            this.name = var10;
            this.nameColor = var11;
            this.defaultIcon = var12;
            this.iosStaticIcon = var13;
            this.iosAnimatedIcon = var14;
            this.androidIcon = var15;
            this.macosIcon = var16;
            this.iconColor = var17;
            this.webAppPlaceholder = var18;
        }

        public int getConstructor() {
            return 1495310429;
        }
    }

    public static class ArchiveChatListSettings extends TdApi.Object {
        public boolean archiveAndMuteNewChatsFromUnknownUsers;
        public boolean keepUnmutedChatsArchived;
        public boolean keepChatsFromFoldersArchived;
        public static final int CONSTRUCTOR = 1058499236;

        public ArchiveChatListSettings() {
        }

        public ArchiveChatListSettings(boolean var1, boolean var2, boolean var3) {
            this.archiveAndMuteNewChatsFromUnknownUsers = var1;
            this.keepUnmutedChatsArchived = var2;
            this.keepChatsFromFoldersArchived = var3;
        }

        public int getConstructor() {
            return 1058499236;
        }
    }

    public static class Animations extends TdApi.Object {
        public TdApi.Animation[] animations;
        public static final int CONSTRUCTOR = 344216945;

        public Animations() {
        }

        public Animations(TdApi.Animation[] var1) {
            this.animations = var1;
        }

        public int getConstructor() {
            return 344216945;
        }
    }

    public static class Animation extends TdApi.Object {
        public int duration;
        public int width;
        public int height;
        public String fileName;
        public String mimeType;
        public boolean hasStickers;
        public TdApi.Minithumbnail minithumbnail;
        public TdApi.Thumbnail thumbnail;
        public TdApi.File animation;
        public static final int CONSTRUCTOR = -872359106;

        public Animation() {
        }

        public Animation(int var1, int var2, int var3, String var4, String var5, boolean var6, TdApi.Minithumbnail var7, TdApi.Thumbnail var8, TdApi.File var9) {
            this.duration = var1;
            this.width = var2;
            this.height = var3;
            this.fileName = var4;
            this.mimeType = var5;
            this.hasStickers = var6;
            this.minithumbnail = var7;
            this.thumbnail = var8;
            this.animation = var9;
        }

        public int getConstructor() {
            return -872359106;
        }
    }

    public static class AnimatedEmoji extends TdApi.Object {
        public TdApi.Sticker sticker;
        public int stickerWidth;
        public int stickerHeight;
        public int fitzpatrickType;
        public TdApi.File sound;
        public static final int CONSTRUCTOR = 1378918079;

        public AnimatedEmoji() {
        }

        public AnimatedEmoji(TdApi.Sticker var1, int var2, int var3, int var4, TdApi.File var5) {
            this.sticker = var1;
            this.stickerWidth = var2;
            this.stickerHeight = var3;
            this.fitzpatrickType = var4;
            this.sound = var5;
        }

        public int getConstructor() {
            return 1378918079;
        }
    }

    public static class AnimatedChatPhoto extends TdApi.Object {
        public int length;
        public TdApi.File file;
        public double mainFrameTimestamp;
        public static final int CONSTRUCTOR = 191994926;

        public AnimatedChatPhoto() {
        }

        public AnimatedChatPhoto(int var1, TdApi.File var2, double var3) {
            this.length = var1;
            this.file = var2;
            this.mainFrameTimestamp = var3;
        }

        public int getConstructor() {
            return 191994926;
        }
    }

    public static class Address extends TdApi.Object {
        public String countryCode;
        public String state;
        public String city;
        public String streetLine1;
        public String streetLine2;
        public String postalCode;
        public static final int CONSTRUCTOR = -2043654342;

        public Address() {
        }

        public Address(String var1, String var2, String var3, String var4, String var5, String var6) {
            this.countryCode = var1;
            this.state = var2;
            this.city = var3;
            this.streetLine1 = var4;
            this.streetLine2 = var5;
            this.postalCode = var6;
        }

        public int getConstructor() {
            return -2043654342;
        }
    }

    public static class AddedReactions extends TdApi.Object {
        public int totalCount;
        public TdApi.AddedReaction[] reactions;
        public String nextOffset;
        public static final int CONSTRUCTOR = 226352304;

        public AddedReactions() {
        }

        public AddedReactions(int var1, TdApi.AddedReaction[] var2, String var3) {
            this.totalCount = var1;
            this.reactions = var2;
            this.nextOffset = var3;
        }

        public int getConstructor() {
            return 226352304;
        }
    }

    public static class AddedReaction extends TdApi.Object {
        public TdApi.ReactionType type;
        public TdApi.MessageSender senderId;
        public int date;
        public static final int CONSTRUCTOR = 1666271766;

        public AddedReaction() {
        }

        public AddedReaction(TdApi.ReactionType var1, TdApi.MessageSender var2, int var3) {
            this.type = var1;
            this.senderId = var2;
            this.date = var3;
        }

        public int getConstructor() {
            return 1666271766;
        }
    }

    public static class AccountTtl extends TdApi.Object {
        public int days;
        public static final int CONSTRUCTOR = 1324495492;

        public AccountTtl() {
        }

        public AccountTtl(int var1) {
            this.days = var1;
        }

        public int getConstructor() {
            return 1324495492;
        }
    }

    public abstract static class Function<R extends TdApi.Object> extends TdApi.Object {
        public Function() {
        }

        public native String toString();
    }

    public abstract static class Object {
        public Object() {
        }

        public native String toString();

        public abstract int getConstructor();
    }
}