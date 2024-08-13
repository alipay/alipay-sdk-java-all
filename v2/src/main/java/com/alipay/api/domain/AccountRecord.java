package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账务记录详情
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:41
 */
public class AccountRecord extends AlipayObject {

	private static final long serialVersionUID = 8679376645566621886L;

	/**
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 当时账户的余额
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 业务类型
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 收入金额
	 */
	@ApiField("in_amount")
	private String inAmount;

	/**
	 * 账务备注说明
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 对方支付宝账户ID
	 */
	@ApiField("opt_user_id")
	private String optUserId;

	/**
	 * 支出金额
	 */
	@ApiField("out_amount")
	private String outAmount;

	/**
	 * 本方支付宝账户ID
	 */
	@ApiField("self_user_id")
	private String selfUserId;

	/**
	 * 账务类型
	 */
	@ApiField("type")
	private String type;

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getInAmount() {
		return this.inAmount;
	}
	public void setInAmount(String inAmount) {
		this.inAmount = inAmount;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOptUserId() {
		return this.optUserId;
	}
	public void setOptUserId(String optUserId) {
		this.optUserId = optUserId;
	}

	public String getOutAmount() {
		return this.outAmount;
	}
	public void setOutAmount(String outAmount) {
		this.outAmount = outAmount;
	}

	public String getSelfUserId() {
		return this.selfUserId;
	}
	public void setSelfUserId(String selfUserId) {
		this.selfUserId = selfUserId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
