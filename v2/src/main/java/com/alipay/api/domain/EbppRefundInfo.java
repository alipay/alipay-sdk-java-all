package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款单对象
 *
 * @author auto create
 * @since 1.0, 2026-09-22 16:09:05
 */
public class EbppRefundInfo extends AlipayObject {

	private static final long serialVersionUID = 1363845923156528534L;

	/**
	 * 描述业务的归属类
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 订单归属的出账机构
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 业务归属的销账机构
	 */
	@ApiField("chargeoff_inst")
	private String chargeoffInst;

	/**
	 * 收到退款请求的时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 退款时间，yyyy-MM-dd hh:mm:ss格式，未退款的订单无退款时间。
	 */
	@ApiField("gmt_refund")
	private Date gmtRefund;

	/**
	 * 外部流水号
	 */
	@ApiField("out_ext_id")
	private String outExtId;

	/**
	 * 退款金额，单位是元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款单号，已经退款的订单有此编号，其他状态可能暂未生成。
	 */
	@ApiField("refund_id")
	private String refundId;

	/**
	 * 退款支付单号
	 */
	@ApiField("refund_payment_id")
	private String refundPaymentId;

	/**
	 * 描述退款的原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退款状态代码
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * 退款类型
	 */
	@ApiField("refund_type")
	private String refundType;

	/**
	 * 重试次数
	 */
	@ApiField("retry_times")
	private String retryTimes;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getChargeoffInst() {
		return this.chargeoffInst;
	}
	public void setChargeoffInst(String chargeoffInst) {
		this.chargeoffInst = chargeoffInst;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtRefund() {
		return this.gmtRefund;
	}
	public void setGmtRefund(Date gmtRefund) {
		this.gmtRefund = gmtRefund;
	}

	public String getOutExtId() {
		return this.outExtId;
	}
	public void setOutExtId(String outExtId) {
		this.outExtId = outExtId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundId() {
		return this.refundId;
	}
	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public String getRefundPaymentId() {
		return this.refundPaymentId;
	}
	public void setRefundPaymentId(String refundPaymentId) {
		this.refundPaymentId = refundPaymentId;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getRefundType() {
		return this.refundType;
	}
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

	public String getRetryTimes() {
		return this.retryTimes;
	}
	public void setRetryTimes(String retryTimes) {
		this.retryTimes = retryTimes;
	}

}
