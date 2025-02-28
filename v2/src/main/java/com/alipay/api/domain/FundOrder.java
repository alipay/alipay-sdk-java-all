package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 纯资金交易，充值，提现，转账等
 *
 * @author auto create
 * @since 1.0, 2023-06-21 13:57:43
 */
public class FundOrder extends AlipayObject {

	private static final long serialVersionUID = 2627323469452719866L;

	/**
	 * 订单金额。单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 商户交易创建时间，可用于双方对账。标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 订单币种
	 */
	@ApiField("order_currency")
	private String orderCurrency;

	/**
	 * 交易超时自动关单时间
	 */
	@ApiField("order_expiry_time")
	private Date orderExpiryTime;

	/**
	 * 交易类型，ACQUIRE 收单业务；DEPOSIT 纯资金充值业务；TRANSFER 纯资金转账业务；WITHDRAW 纯资金提现业务
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 外部业务平台原始交易号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 收款方外部业务平台会员ID，充值，提现不用填，转账给非云企付会员不用填
	 */
	@ApiField("payee_out_member_id")
	private ReferenceId payeeOutMemberId;

	/**
	 * 付款方外部业务平台会员ID
	 */
	@ApiField("payer_out_member_id")
	private ReferenceId payerOutMemberId;

	/**
	 * 交易备注
	 */
	@ApiField("remark")
	private String remark;

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderCurrency() {
		return this.orderCurrency;
	}
	public void setOrderCurrency(String orderCurrency) {
		this.orderCurrency = orderCurrency;
	}

	public Date getOrderExpiryTime() {
		return this.orderExpiryTime;
	}
	public void setOrderExpiryTime(Date orderExpiryTime) {
		this.orderExpiryTime = orderExpiryTime;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public ReferenceId getPayeeOutMemberId() {
		return this.payeeOutMemberId;
	}
	public void setPayeeOutMemberId(ReferenceId payeeOutMemberId) {
		this.payeeOutMemberId = payeeOutMemberId;
	}

	public ReferenceId getPayerOutMemberId() {
		return this.payerOutMemberId;
	}
	public void setPayerOutMemberId(ReferenceId payerOutMemberId) {
		this.payerOutMemberId = payerOutMemberId;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
