package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值记录
 *
 * @author auto create
 * @since 1.0, 2023-08-22 21:20:39
 */
public class FundHistory extends AlipayObject {

	private static final long serialVersionUID = 1117692514488979623L;

	/**
	 * 充值金额(分)
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 订单号
	 */
	@ApiField("fund_order_no")
	private String fundOrderNo;

	/**
	 * 支付时间
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 充值状态
	 */
	@ApiField("status")
	private String status;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getFundOrderNo() {
		return this.fundOrderNo;
	}
	public void setFundOrderNo(String fundOrderNo) {
		this.fundOrderNo = fundOrderNo;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
