package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 爱奇艺支付意向用户挽回
 *
 * @author auto create
 * @since 1.0, 2024-07-25 09:59:04
 */
public class AlipayPaymentPayoperationIntentionOrderApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6845572424993146726L;

	/**
	 * 业务id，作为幂等，需要确保唯一性，用于表示该业务的唯一编码
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 用户手机号
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * 订单交易是的订单交易号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 是否为支付宝支付（true表示为支付宝支付）
	 */
	@ApiField("pay_by_alipay")
	private Boolean payByAlipay;

	/**
	 * 表示具体订单创建的时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 用于匹配用户权益文案
	 */
	@ApiField("right_code")
	private String rightCode;

	/**
	 * 来源场景Code,用于作为日志来源
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 发送消息原因
	 */
	@ApiField("send_reason")
	private String sendReason;

	/**
	 * 调用方系统名称
	 */
	@ApiField("source_code")
	private String sourceCode;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public Boolean getPayByAlipay() {
		return this.payByAlipay;
	}
	public void setPayByAlipay(Boolean payByAlipay) {
		this.payByAlipay = payByAlipay;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getRightCode() {
		return this.rightCode;
	}
	public void setRightCode(String rightCode) {
		this.rightCode = rightCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSendReason() {
		return this.sendReason;
	}
	public void setSendReason(String sendReason) {
		this.sendReason = sendReason;
	}

	public String getSourceCode() {
		return this.sourceCode;
	}
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

}
