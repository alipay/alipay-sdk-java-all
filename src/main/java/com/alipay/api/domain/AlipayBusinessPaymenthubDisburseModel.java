package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 聚合支付资金打款接口
 *
 * @author auto create
 * @since 1.0, 2020-03-23 21:59:46
 */
public class AlipayBusinessPaymenthubDisburseModel extends AlipayObject {

	private static final long serialVersionUID = 2767163476681572491L;

	/**
	 * 打款金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("disburse_amount")
	private String disburseAmount;

	/**
	 * 打款请求号，对应一笔业务订单下的一次打款请求，不同打款请求需保证请求号唯一
	 */
	@ApiField("disburse_request_no")
	private String disburseRequestNo;

	/**
	 * 收款方信息
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
	 * 打款说明
	 */
	@ApiField("remark")
	private String remark;

	public String getDisburseAmount() {
		return this.disburseAmount;
	}
	public void setDisburseAmount(String disburseAmount) {
		this.disburseAmount = disburseAmount;
	}

	public String getDisburseRequestNo() {
		return this.disburseRequestNo;
	}
	public void setDisburseRequestNo(String disburseRequestNo) {
		this.disburseRequestNo = disburseRequestNo;
	}

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

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
