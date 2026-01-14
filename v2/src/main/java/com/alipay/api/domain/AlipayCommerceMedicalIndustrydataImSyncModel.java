package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * im医生回复消息
 *
 * @author auto create
 * @since 1.0, 2025-11-18 13:54:22
 */
public class AlipayCommerceMedicalIndustrydataImSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2342515316822799879L;

	/**
	 * 内部im会话chatId
	 */
	@ApiField("alipay_chat_id")
	private String alipayChatId;

	/**
	 * 问诊订单回流接口出参的order_id
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * 渠道编码
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 消息内容：文本-内容、图片-url、语音-url、视频-url、定制卡片
	 */
	@ApiField("content")
	private ContentVo content;

	/**
	 * 外部自有用户id，无特殊校验
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 消息发送时间戳
	 */
	@ApiField("msg_time")
	private Long msgTime;

	/**
	 * 消息类型
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * out_biz_no，唯一，外部商户自有问诊订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部im会话chatId
	 */
	@ApiField("out_chat_id")
	private String outChatId;

	/**
	 * 服务提供者:外部医生/医助id
	 */
	@ApiField("out_doctor_id")
	private String outDoctorId;

	/**
	 * 外部对话id
	 */
	@ApiField("out_msg_id")
	private String outMsgId;

	/**
	 * 服务提供者角色类型
	 */
	@ApiField("provider_type")
	private String providerType;

	/**
	 * 场景编码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 服务提供者:医生/医助姓名
	 */
	@ApiField("service_provider_name")
	private String serviceProviderName;

	public String getAlipayChatId() {
		return this.alipayChatId;
	}
	public void setAlipayChatId(String alipayChatId) {
		this.alipayChatId = alipayChatId;
	}

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public ContentVo getContent() {
		return this.content;
	}
	public void setContent(ContentVo content) {
		this.content = content;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public Long getMsgTime() {
		return this.msgTime;
	}
	public void setMsgTime(Long msgTime) {
		this.msgTime = msgTime;
	}

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutChatId() {
		return this.outChatId;
	}
	public void setOutChatId(String outChatId) {
		this.outChatId = outChatId;
	}

	public String getOutDoctorId() {
		return this.outDoctorId;
	}
	public void setOutDoctorId(String outDoctorId) {
		this.outDoctorId = outDoctorId;
	}

	public String getOutMsgId() {
		return this.outMsgId;
	}
	public void setOutMsgId(String outMsgId) {
		this.outMsgId = outMsgId;
	}

	public String getProviderType() {
		return this.providerType;
	}
	public void setProviderType(String providerType) {
		this.providerType = providerType;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getServiceProviderName() {
		return this.serviceProviderName;
	}
	public void setServiceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
	}

}
