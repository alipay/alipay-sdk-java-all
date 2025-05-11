package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可信价值中心资金订单
 *
 * @author auto create
 * @since 1.0, 2024-10-23 17:07:23
 */
public class TrustFundOrder extends AlipayObject {

	private static final long serialVersionUID = 6354934719984794317L;

	/**
	 * 划拨金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 机构侧资金划拨流水，机构侧唯一。和机构侧对账使用
	 */
	@ApiField("channel_order_id")
	private String channelOrderId;

	/**
	 * 资金单状态
	 */
	@ApiField("fund_status")
	private String fundStatus;

	/**
	 * 支付时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 收款方账号
	 */
	@ApiField("payee_account_no")
	private String payeeAccountNo;

	/**
	 * 收款方账号类型
	 */
	@ApiField("payee_account_type")
	private String payeeAccountType;

	/**
	 * 收款方（账号）名称
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 付款方账号
	 */
	@ApiField("payer_account_no")
	private String payerAccountNo;

	/**
	 * 账号类型
	 */
	@ApiField("payer_account_type")
	private String payerAccountType;

	/**
	 * 付款方（账号）名称
	 */
	@ApiField("payer_name")
	private String payerName;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getChannelOrderId() {
		return this.channelOrderId;
	}
	public void setChannelOrderId(String channelOrderId) {
		this.channelOrderId = channelOrderId;
	}

	public String getFundStatus() {
		return this.fundStatus;
	}
	public void setFundStatus(String fundStatus) {
		this.fundStatus = fundStatus;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayeeAccountNo() {
		return this.payeeAccountNo;
	}
	public void setPayeeAccountNo(String payeeAccountNo) {
		this.payeeAccountNo = payeeAccountNo;
	}

	public String getPayeeAccountType() {
		return this.payeeAccountType;
	}
	public void setPayeeAccountType(String payeeAccountType) {
		this.payeeAccountType = payeeAccountType;
	}

	public String getPayeeName() {
		return this.payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayerAccountNo() {
		return this.payerAccountNo;
	}
	public void setPayerAccountNo(String payerAccountNo) {
		this.payerAccountNo = payerAccountNo;
	}

	public String getPayerAccountType() {
		return this.payerAccountType;
	}
	public void setPayerAccountType(String payerAccountType) {
		this.payerAccountType = payerAccountType;
	}

	public String getPayerName() {
		return this.payerName;
	}
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
