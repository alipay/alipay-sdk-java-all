package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发起对话
 *
 * @author auto create
 * @since 1.0, 2025-09-25 17:37:41
 */
public class AlipayCloudCloudpromoChatCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3887449889862726379L;

	/**
	 * 要进行会话聊天的智能体ID。
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 要进行会话聊天的智能体版本。智能体的版本号是”v1.0“，这里需要传入”1.0“。
	 */
	@ApiField("agent_version")
	private String agentVersion;

	/**
	 * 创建消息时的附加消息，获取消息时也会返回此附加消息。对应智能体应用中的自定义参数，即对话时的附加数据。
	 */
	@ApiField("business_data")
	private String businessData;

	/**
	 * 会话 ID，即会话的唯一标识。
	 */
	@ApiField("conversation_id")
	private String conversationId;

	/**
	 * 附加参数，通常用于特殊场景下指定一些必要参数供模型判断，例如指定经纬度，并询问智能体此位置的天气。
	 */
	@ApiField("extra_params")
	private ChatExtraParams extraParams;

	/**
	 * 用于验证客户端身份的API-Key。你可以在百宝箱中生成API-Key，详细信息可参考<a href="https://alipaytbox.yuque.com/sxs0ba/huntb8/hhmpxnxaoxaulyil">链接</a>。
	 */
	@ApiField("inc_access_id")
	private String incAccessId;

	/**
	 * 压测标识。默认为 false。
	 */
	@ApiField("load_test")
	private Boolean loadTest;

	/**
	 * null
	 */
	@ApiListField("media_contents")
	@ApiField("media_content")
	private List<MediaContent> mediaContents;

	/**
	 * 用户发给智能体的问题内容。
	 */
	@ApiField("question")
	private String question;

	/**
	 * 重试标识。默认为 false。
	 */
	@ApiField("retry")
	private Boolean retry;

	/**
	 * 会话 ID，即会话的唯一标识。
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 标识当前与智能体对话的用户，由使用方自行定义、生成与维护。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentVersion() {
		return this.agentVersion;
	}
	public void setAgentVersion(String agentVersion) {
		this.agentVersion = agentVersion;
	}

	public String getBusinessData() {
		return this.businessData;
	}
	public void setBusinessData(String businessData) {
		this.businessData = businessData;
	}

	public String getConversationId() {
		return this.conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public ChatExtraParams getExtraParams() {
		return this.extraParams;
	}
	public void setExtraParams(ChatExtraParams extraParams) {
		this.extraParams = extraParams;
	}

	public String getIncAccessId() {
		return this.incAccessId;
	}
	public void setIncAccessId(String incAccessId) {
		this.incAccessId = incAccessId;
	}

	public Boolean getLoadTest() {
		return this.loadTest;
	}
	public void setLoadTest(Boolean loadTest) {
		this.loadTest = loadTest;
	}

	public List<MediaContent> getMediaContents() {
		return this.mediaContents;
	}
	public void setMediaContents(List<MediaContent> mediaContents) {
		this.mediaContents = mediaContents;
	}

	public String getQuestion() {
		return this.question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public Boolean getRetry() {
		return this.retry;
	}
	public void setRetry(Boolean retry) {
		this.retry = retry;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
