package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多步转账明确返回
 *
 * @author auto create
 * @since 1.0, 2024-08-08 11:29:16
 */
public class MultiStepTransOrderDetailResponse extends AlipayObject {

	private static final long serialVersionUID = 5114539258487295132L;

	/**
	 * 转账额度 单位：元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 支付时间 格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_pay")
	private Date gmtPay;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单执行顺序 单位：个
	 */
	@ApiField("order_seq")
	private Long orderSeq;

	/**
	 * 订单标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 外部幂等号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 收款方信息
	 */
	@ApiField("payee_info")
	private MultiStepTransferParticipant payeeInfo;

	/**
	 * 付款方信息
	 */
	@ApiField("payer_info")
	private MultiStepTransferParticipant payerInfo;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 请求方ID
	 */
	@ApiField("request_user_id")
	private String requestUserId;

	/**
	 * 单据交易状态
	 */
	@ApiField("status")
	private String status;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getGmtPay() {
		return this.gmtPay;
	}
	public void setGmtPay(Date gmtPay) {
		this.gmtPay = gmtPay;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Long getOrderSeq() {
		return this.orderSeq;
	}
	public void setOrderSeq(Long orderSeq) {
		this.orderSeq = orderSeq;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public MultiStepTransferParticipant getPayeeInfo() {
		return this.payeeInfo;
	}
	public void setPayeeInfo(MultiStepTransferParticipant payeeInfo) {
		this.payeeInfo = payeeInfo;
	}

	public MultiStepTransferParticipant getPayerInfo() {
		return this.payerInfo;
	}
	public void setPayerInfo(MultiStepTransferParticipant payerInfo) {
		this.payerInfo = payerInfo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRequestUserId() {
		return this.requestUserId;
	}
	public void setRequestUserId(String requestUserId) {
		this.requestUserId = requestUserId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
