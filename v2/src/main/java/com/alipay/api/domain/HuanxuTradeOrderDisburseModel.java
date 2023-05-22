package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 焕旭科技聚合支付资金打款接口
 *
 * @author auto create
 * @since 1.0, 2022-12-30 17:32:53
 */
public class HuanxuTradeOrderDisburseModel extends AlipayObject {

	private static final long serialVersionUID = 8287415451894234482L;

	/**
	 * 打款金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("disburse_amount")
	private String disburseAmount;

	/**
	 * 打款请求号，对应一笔业务订单下的一次打款请求，不同打款请求需保证请求号不同
	 */
	@ApiField("disburse_request_no")
	private String disburseRequestNo;

	/**
	 * 收款方信息
	 */
	@ApiField("payee")
	private UserIdentity payee;

	/**
	 * 支付id，焕旭针对每一笔支付请求生成的唯一支付凭证
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
