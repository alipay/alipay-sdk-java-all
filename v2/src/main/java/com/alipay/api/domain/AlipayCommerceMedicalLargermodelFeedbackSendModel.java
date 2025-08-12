package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反馈保存
 *
 * @author auto create
 * @since 1.0, 2025-08-08 11:33:16
 */
public class AlipayCommerceMedicalLargermodelFeedbackSendModel extends AlipayObject {

	private static final long serialVersionUID = 6574526817666145761L;

	/**
	 * 卡片信息
	 */
	@ApiField("card_data")
	private String cardData;

	/**
	 * 云陪诊卡片事件名称
	 */
	@ApiField("card_event")
	private String cardEvent;

	/**
	 * 卡片服务
	 */
	@ApiField("card_service")
	private String cardService;

	/**
	 * 对话id
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 是
	 */
	@ApiField("close_cloud_escort_flag")
	private Boolean closeCloudEscortFlag;

	/**
	 * 反馈行动点：
● 右下角：lowerRightCorner
● 长按：tapAndHold
● 选取文字：selectText
● 云陪诊首页服务：ypzHomePage
● 云陪诊消息进对话：ypzMessageForwardSession
● 云陪诊浮层：ypzSuperposeLayer
	 */
	@ApiField("feedback_ap")
	private String feedbackAp;

	/**
	 * 反馈渠道：
● 安诊儿app：azeApp
● 安诊儿小程序：azeMiniProgram
● 健康管家app：healthManagerApp
● 健康管家小程序：healthManagerMiniProgram
	 */
	@ApiField("feedback_channel")
	private String feedbackChannel;

	/**
	 * 反馈类别：
● 常规问答：generalQA
● 深度思考：deepThinking
● 深入问答追问：depthQAFollowUp
● 多模态反馈（报告解读、药盒识别）：multimodal
● 云陪诊：cloudAccompaniedAiagnosis
● 深度思考+多模态反馈：deepThinkingAndMultimodal
云陪诊住院反馈：ypzHospitalized
	 */
	@ApiField("feedback_class")
	private String feedbackClass;

	/**
	 * 用户手动输入的内容
	 */
	@ApiField("feedback_input")
	private String feedbackInput;

	/**
	 * 用户选择文字
	 */
	@ApiField("feedback_select_content")
	private String feedbackSelectContent;

	/**
	 * 反馈标签
	 */
	@ApiField("feedback_tag")
	private String feedbackTag;

	/**
	 * 反馈类型：
● 点赞：praise
● 点踩：stepOn
● 取消：cancel
	 */
	@ApiField("feedback_type")
	private String feedbackType;

	/**
	 * 医院id
	 */
	@ApiField("hospital_id")
	private String hospitalId;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 机构id
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 支付宝用户id，为对外开放新增字段，对外开放时必填。（可以为外部用户ID，同一次陪诊需要传同一个ID）
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 当out_user_id为2088uid时，需将这个值设置为：ALIPAY_UID；当out_user_id为其他值时，可将这个值设置为：OTHER_UID；
	 */
	@ApiField("outer_user_type")
	private String outerUserType;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 云陪诊id
	 */
	@ApiField("ypz_id")
	private String ypzId;

	public String getCardData() {
		return this.cardData;
	}
	public void setCardData(String cardData) {
		this.cardData = cardData;
	}

	public String getCardEvent() {
		return this.cardEvent;
	}
	public void setCardEvent(String cardEvent) {
		this.cardEvent = cardEvent;
	}

	public String getCardService() {
		return this.cardService;
	}
	public void setCardService(String cardService) {
		this.cardService = cardService;
	}

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public Boolean getCloseCloudEscortFlag() {
		return this.closeCloudEscortFlag;
	}
	public void setCloseCloudEscortFlag(Boolean closeCloudEscortFlag) {
		this.closeCloudEscortFlag = closeCloudEscortFlag;
	}

	public String getFeedbackAp() {
		return this.feedbackAp;
	}
	public void setFeedbackAp(String feedbackAp) {
		this.feedbackAp = feedbackAp;
	}

	public String getFeedbackChannel() {
		return this.feedbackChannel;
	}
	public void setFeedbackChannel(String feedbackChannel) {
		this.feedbackChannel = feedbackChannel;
	}

	public String getFeedbackClass() {
		return this.feedbackClass;
	}
	public void setFeedbackClass(String feedbackClass) {
		this.feedbackClass = feedbackClass;
	}

	public String getFeedbackInput() {
		return this.feedbackInput;
	}
	public void setFeedbackInput(String feedbackInput) {
		this.feedbackInput = feedbackInput;
	}

	public String getFeedbackSelectContent() {
		return this.feedbackSelectContent;
	}
	public void setFeedbackSelectContent(String feedbackSelectContent) {
		this.feedbackSelectContent = feedbackSelectContent;
	}

	public String getFeedbackTag() {
		return this.feedbackTag;
	}
	public void setFeedbackTag(String feedbackTag) {
		this.feedbackTag = feedbackTag;
	}

	public String getFeedbackType() {
		return this.feedbackType;
	}
	public void setFeedbackType(String feedbackType) {
		this.feedbackType = feedbackType;
	}

	public String getHospitalId() {
		return this.hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getOuterUserType() {
		return this.outerUserType;
	}
	public void setOuterUserType(String outerUserType) {
		this.outerUserType = outerUserType;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getYpzId() {
		return this.ypzId;
	}
	public void setYpzId(String ypzId) {
		this.ypzId = ypzId;
	}

}
