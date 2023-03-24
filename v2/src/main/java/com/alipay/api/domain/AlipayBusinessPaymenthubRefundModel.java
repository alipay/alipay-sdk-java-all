package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 聚合支付资金退款接口
 *
 * @author auto create
 * @since 1.0, 2022-12-26 14:45:45
 */
public class AlipayBusinessPaymenthubRefundModel extends AlipayObject {

	private static final long serialVersionUID = 1312111513784697385L;

	/**
	 * 支付的收款方信息，如果涉及多收款方需传入该信息
	 */
	@ApiField("payee")
	private UserIdentity payee;

	/**
	 * 收款方的额外信息，包含会员信息和支付机构账号信息
	 */
	@ApiField("payee_ext")
	private UserIdentityExt payeeExt;

	/**
	 * 支付id，支付宝针对每一笔支付请求生成的唯一支付凭证
	 */
	@ApiField("payment_id")
	private String paymentId;

	/**
	 * 退款金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款请求号，对应一笔业务订单下的一次退款请求，不同退款请求需保证请求号唯一
	 */
	@ApiField("refund_request_no")
	private String refundRequestNo;

	/**
	 * 退款说明
	 */
	@ApiField("remark")
	private String remark;

	public UserIdentity getPayee() {
		return this.payee;
	}
	public void setPayee(UserIdentity payee) {
		this.payee = payee;
	}

	public UserIdentityExt getPayeeExt() {
		return this.payeeExt;
	}
	public void setPayeeExt(UserIdentityExt payeeExt) {
		this.payeeExt = payeeExt;
	}

	public String getPaymentId() {
		return this.paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundRequestNo() {
		return this.refundRequestNo;
	}
	public void setRefundRequestNo(String refundRequestNo) {
		this.refundRequestNo = refundRequestNo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
