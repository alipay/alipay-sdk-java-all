package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ampe对话服务发送query
 *
 * @author auto create
 * @since 1.0, 2025-04-29 13:38:58
 */
public class AlipayOpenMiniAmpeChatSendModel extends AlipayObject {

	private static final long serialVersionUID = 8439963922445223691L;

	/**
	 * AMPE设备id，代表唯一一台设备，在支付宝开放平台，或者通过openapi接口注册。
	 */
	@ApiField("ampe_device_id")
	private String ampeDeviceId;

	/**
	 * AMPE产品id，在AMPE平台申请，代表一种设备产品。
	 */
	@ApiField("ampe_product_id")
	private String ampeProductId;

	/**
	 * AMPE运行时的设备信息，仅用于云卡片场景
	 */
	@ApiField("device_info")
	private AmpeDeviceInfo deviceInfo;

	/**
	 * 支付宝的意图code，由支付宝定义，意图列表可从参见BD提供的意图code列表，不定期更新。接入方可以根据支付宝提供的语料对自由的模型进行训练标注，经过自有模型意图分析后，在调用本接口时传入，这样会提高query的识别准确度，并提高响应速度。如果不传入，支付宝将根据自己的模型对query进行意图识别。目前可选值为:SMART_ORDER（智能点单）
	 */
	@ApiField("intent_code")
	private String intentCode;

	/**
	 * 地理位置列表，包含对话所需要的各种地理位置信息，例如当前位置、目标位置、家庭等等
	 */
	@ApiListField("locations")
	@ApiField("chat_location")
	private List<ChatLocation> locations;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户输入的原始query，不能改写。
	 */
	@ApiField("query")
	private String query;

	/**
	 * 用户的会话流水，代表用户的一次query。
	 */
	@ApiField("req_no")
	private String reqNo;

	/**
	 * 会话id，代表用户一个完整的会话周期，用户串联用户会话的上下文，需要有过期机制，以避免会话过长。不同sessionId下的会话相互隔离。
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 支付宝用户uid的加密串，可以通过客户端接口获取。不涉及用户个人数据操作的可为空，其他场景都为非空。
	 */
	@ApiField("user_key")
	private String userKey;

	public String getAmpeDeviceId() {
		return this.ampeDeviceId;
	}
	public void setAmpeDeviceId(String ampeDeviceId) {
		this.ampeDeviceId = ampeDeviceId;
	}

	public String getAmpeProductId() {
		return this.ampeProductId;
	}
	public void setAmpeProductId(String ampeProductId) {
		this.ampeProductId = ampeProductId;
	}

	public AmpeDeviceInfo getDeviceInfo() {
		return this.deviceInfo;
	}
	public void setDeviceInfo(AmpeDeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getIntentCode() {
		return this.intentCode;
	}
	public void setIntentCode(String intentCode) {
		this.intentCode = intentCode;
	}

	public List<ChatLocation> getLocations() {
		return this.locations;
	}
	public void setLocations(List<ChatLocation> locations) {
		this.locations = locations;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getReqNo() {
		return this.reqNo;
	}
	public void setReqNo(String reqNo) {
		this.reqNo = reqNo;
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

	public String getUserKey() {
		return this.userKey;
	}
	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}

}
