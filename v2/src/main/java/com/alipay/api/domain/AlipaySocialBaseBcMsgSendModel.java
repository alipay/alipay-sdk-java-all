package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * BC互动消息发送接口
 *
 * @author auto create
 * @since 1.0, 2022-11-02 17:59:51
 */
public class AlipaySocialBaseBcMsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 8678912542488297645L;

	/**
	 * BC消息，收到消息的客户端的最低版本号，如收到消息的最低版本低于该字段，怎客户端不会收到消息
	 */
	@ApiField("app_min_version")
	private String appMinVersion;

	/**
	 * 所属应用ID，目前仅用于统计
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 业务附加信息字段
	 */
	@ApiField("biz_context")
	private String bizContext;

	/**
	 * BC消息内容的简短描述，如可用与客户端聊天列表盒子上的展示，具体使用方式业务方可根据自身业务决定
	 */
	@ApiField("biz_memo")
	private String bizMemo;

	/**
	 * 业务类型，接入时由社交侧分配
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 消息发送渠道，为空则默认为BUSINESS，枚举：
业务消息：BUSINESS
营销消息：MARKETING
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * BC互动发消息的唯一ID,不可为空，防止消息重复发送，请用reltionType+业务主键控制唯一
	 */
	@ApiField("client_msg_id")
	private String clientMsgId;

	/**
	 * bc互动c端商家openId
	 */
	@ApiField("consumer_open_id")
	private String consumerOpenId;

	/**
	 * BC互动，C端帐号，如C端在支付宝内则为支付宝统一用户id
	 */
	@ApiField("consumer_user_id")
	private String consumerUserId;

	/**
	 * 消息隐藏方案，默认不隐藏
例如 ：A给B发消息
(空): 不隐藏，A看到一条上行消息，B看到一条下行消息(消息内容完全一样，如果需要两边看到的消息不同，需要发两条消息，一条上行隐藏，一条下行隐藏)
(1): 上行隐藏，A给B发消息，A看不到消息，B看到消息
(0): 下行隐藏，A给B发消息，A看到消息，B看不到消息
	 */
	@ApiField("hidden_side")
	private String hiddenSide;

	/**
	 * 消息点击后可跳转的地址,由业务方指定，为整个卡片的点击时间，默认为空，点击无反应
	 */
	@ApiField("link")
	private String link;

	/**
	 * BC消息，标记是否已读，默认为未读，设置未读时客户端会有红点或数字提示有未读消息
	 */
	@ApiField("mark_read")
	private Boolean markRead;

	/**
	 * BC互动，B端帐号，为业务方内部标识唯一B端帐号的id，如B端为商家，则为商家唯一ID
	 */
	@ApiField("merchant_entity_id")
	private String merchantEntityId;

	/**
	 * BC互动消息，业务方指定的消息产生时间
	 */
	@ApiField("message_time")
	private Date messageTime;

	/**
	 * 客户端业务埋点参数，Map<String,String>的json格式，传入值会在客户端拼接成key1=value1^key2=value2的格式计入埋点
	 */
	@ApiField("monitor_param_map")
	private String monitorParamMap;

	/**
	 * BC消息消息操作类型，为空则为正常消息，有值则表示对已有消息进行特殊操作，此时cliemt_msg_id字段与要操作的原消息对应，枚举： 更新传update 删除传delete
	 */
	@ApiField("msg_op_type")
	private String msgOpType;

	/**
	 * BC消息，除了主消息外，可以一个附加子文本信息，此字段为该文本信息的文案，如不传则没有此子文本信息
	 */
	@ApiField("next_msg_content")
	private String nextMsgContent;

	/**
	 * 支付宝社交聊天，消息内带push提醒的push信息模型
	 */
	@ApiField("notify_param")
	private NotifyParam notifyParam;

	/**
	 * BC互动消息的消息发送者id，可能是B端或C端的ID本身，也可能是B端或C端id背后对应的B端操作人id
	 */
	@ApiField("receiver_id")
	private String receiverId;

	/**
	 * 接收方商家openId
	 */
	@ApiField("receiver_open_id")
	private String receiverOpenId;

	/**
	 * BC互动消息，发送者类型，标识是B端还是C端，枚举： C端传1，B端传2
	 */
	@ApiField("receiver_user_type")
	private String receiverUserType;

	/**
	 * BC互动中的B端类型，每个不同业务对应一个type，在接入时由社交侧开放进行分配，对单个业务来说是固定值
	 */
	@ApiField("relation_type")
	private String relationType;

	/**
	 * BC互动消息的消息发送者id，可能是B端或C端的ID本身，也可能是B端或C端id背后对应的B端操作人id
	 */
	@ApiField("sender_id")
	private String senderId;

	/**
	 * 发送方openId
	 */
	@ApiField("sender_open_id")
	private String senderOpenId;

	/**
	 * BC互动关系id，C端id+B端id+关系类型组成唯一值，调用绑定关系接口返回的sessionId
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * BC互动消息一类数据的模版号，请联系社交pd查看已经支持的模版，并获取模版号
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * C互动顶部通栏，与模版号对应的具体数据，json格式且与模版号对应
	 */
	@ApiField("template_data")
	private String templateData;

	public String getAppMinVersion() {
		return this.appMinVersion;
	}
	public void setAppMinVersion(String appMinVersion) {
		this.appMinVersion = appMinVersion;
	}

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizContext() {
		return this.bizContext;
	}
	public void setBizContext(String bizContext) {
		this.bizContext = bizContext;
	}

	public String getBizMemo() {
		return this.bizMemo;
	}
	public void setBizMemo(String bizMemo) {
		this.bizMemo = bizMemo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getClientMsgId() {
		return this.clientMsgId;
	}
	public void setClientMsgId(String clientMsgId) {
		this.clientMsgId = clientMsgId;
	}

	public String getConsumerOpenId() {
		return this.consumerOpenId;
	}
	public void setConsumerOpenId(String consumerOpenId) {
		this.consumerOpenId = consumerOpenId;
	}

	public String getConsumerUserId() {
		return this.consumerUserId;
	}
	public void setConsumerUserId(String consumerUserId) {
		this.consumerUserId = consumerUserId;
	}

	public String getHiddenSide() {
		return this.hiddenSide;
	}
	public void setHiddenSide(String hiddenSide) {
		this.hiddenSide = hiddenSide;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public Boolean getMarkRead() {
		return this.markRead;
	}
	public void setMarkRead(Boolean markRead) {
		this.markRead = markRead;
	}

	public String getMerchantEntityId() {
		return this.merchantEntityId;
	}
	public void setMerchantEntityId(String merchantEntityId) {
		this.merchantEntityId = merchantEntityId;
	}

	public Date getMessageTime() {
		return this.messageTime;
	}
	public void setMessageTime(Date messageTime) {
		this.messageTime = messageTime;
	}

	public String getMonitorParamMap() {
		return this.monitorParamMap;
	}
	public void setMonitorParamMap(String monitorParamMap) {
		this.monitorParamMap = monitorParamMap;
	}

	public String getMsgOpType() {
		return this.msgOpType;
	}
	public void setMsgOpType(String msgOpType) {
		this.msgOpType = msgOpType;
	}

	public String getNextMsgContent() {
		return this.nextMsgContent;
	}
	public void setNextMsgContent(String nextMsgContent) {
		this.nextMsgContent = nextMsgContent;
	}

	public NotifyParam getNotifyParam() {
		return this.notifyParam;
	}
	public void setNotifyParam(NotifyParam notifyParam) {
		this.notifyParam = notifyParam;
	}

	public String getReceiverId() {
		return this.receiverId;
	}
	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	public String getReceiverOpenId() {
		return this.receiverOpenId;
	}
	public void setReceiverOpenId(String receiverOpenId) {
		this.receiverOpenId = receiverOpenId;
	}

	public String getReceiverUserType() {
		return this.receiverUserType;
	}
	public void setReceiverUserType(String receiverUserType) {
		this.receiverUserType = receiverUserType;
	}

	public String getRelationType() {
		return this.relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public String getSenderId() {
		return this.senderId;
	}
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getSenderOpenId() {
		return this.senderOpenId;
	}
	public void setSenderOpenId(String senderOpenId) {
		this.senderOpenId = senderOpenId;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getTemplateData() {
		return this.templateData;
	}
	public void setTemplateData(String templateData) {
		this.templateData = templateData;
	}

}
