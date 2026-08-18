package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询待入账数据 Result
 *
 * @author auto create
 * @since 1.0, 2026-07-29 09:51:22
 */
public class DepositQueryOpenResult extends AlipayObject {

	private static final long serialVersionUID = 4499549781836642645L;

	/**
	 * 出资账户名称
	 */
	@ApiField("deposit_account_name")
	private String depositAccountName;

	/**
	 * 出资银行卡号
	 */
	@ApiField("deposit_account_no")
	private String depositAccountNo;

	/**
	 * 出资银行名称
	 */
	@ApiField("deposit_bank_name")
	private String depositBankName;

	/**
	 * 当前订单金额(单位：元)
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 资金待调拨订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部订单号，用于服务商上幂等使用
	 */
	@ApiField("outer_order_id")
	private String outerOrderId;

	/**
	 * 自然人名称
	 */
	@ApiField("seller_name")
	private String sellerName;

	public String getDepositAccountName() {
		return this.depositAccountName;
	}
	public void setDepositAccountName(String depositAccountName) {
		this.depositAccountName = depositAccountName;
	}

	public String getDepositAccountNo() {
		return this.depositAccountNo;
	}
	public void setDepositAccountNo(String depositAccountNo) {
		this.depositAccountNo = depositAccountNo;
	}

	public String getDepositBankName() {
		return this.depositBankName;
	}
	public void setDepositBankName(String depositBankName) {
		this.depositBankName = depositBankName;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOuterOrderId() {
		return this.outerOrderId;
	}
	public void setOuterOrderId(String outerOrderId) {
		this.outerOrderId = outerOrderId;
	}

	public String getSellerName() {
		return this.sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

}
