package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * im消息撤回
 *
 * @author auto create
 * @since 1.0, 2025-01-06 14:58:30
 */
public class AlipayCommerceMedicalIndustrydataImCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6776427296982958443L;

	/**
	 * 内部im会话sessionId
	 */
	@ApiField("alipay_chat_id")
	private String alipayChatId;

	/**
	 * 支付宝im消息id
	 */
	@ApiField("alipay_msg_id")
	private String alipayMsgId;

	/**
	 * 问诊订单回流接口出参的order_id
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * 外部自有用户id，无特殊校验
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * out_biz_no，唯一，外部商户自有问诊订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部im会话sessionId
	 */
	@ApiField("out_chat_id")
	private String outChatId;

	/**
	 * 外部对话id
	 */
	@ApiField("out_msg_id")
	private String outMsgId;

	/**
	 * 撤销原因
	 */
	@ApiField("recall_reason")
	private String recallReason;

	public String getAlipayChatId() {
		return this.alipayChatId;
	}
	public void setAlipayChatId(String alipayChatId) {
		this.alipayChatId = alipayChatId;
	}

	public String getAlipayMsgId() {
		return this.alipayMsgId;
	}
	public void setAlipayMsgId(String alipayMsgId) {
		this.alipayMsgId = alipayMsgId;
	}

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
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

	public String getOutMsgId() {
		return this.outMsgId;
	}
	public void setOutMsgId(String outMsgId) {
		this.outMsgId = outMsgId;
	}

	public String getRecallReason() {
		return this.recallReason;
	}
	public void setRecallReason(String recallReason) {
		this.recallReason = recallReason;
	}

}
