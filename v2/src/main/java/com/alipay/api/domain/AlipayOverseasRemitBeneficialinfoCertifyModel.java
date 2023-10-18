package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汇款信息的验证
 *
 * @author auto create
 * @since 1.0, 2020-05-27 20:09:34
 */
public class AlipayOverseasRemitBeneficialinfoCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 4711513916439756764L;

	/**
	 * 中文名
	 */
	@ApiField("chinese_full_name")
	private String chineseFullName;

	/**
	 * 用户的名，拼音
	 */
	@ApiField("first_name")
	private String firstName;

	/**
	 * 用户的姓，拼音
	 */
	@ApiField("last_name")
	private String lastName;

	/**
	 * 登录ID
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 用户中间的名字
	 */
	@ApiField("middle_name")
	private String middleName;

	/**
	 * 汇款金额
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 汇款金额的币种
	 */
	@ApiField("order_currency")
	private String orderCurrency;

	/**
	 * 接收端的mid
	 */
	@ApiField("receiver_mid")
	private String receiverMid;

	/**
	 * 发端的mid
	 */
	@ApiField("sender_mid")
	private String senderMid;

	public String getChineseFullName() {
		return this.chineseFullName;
	}
	public void setChineseFullName(String chineseFullName) {
		this.chineseFullName = chineseFullName;
	}

	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getMiddleName() {
		return this.middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderCurrency() {
		return this.orderCurrency;
	}
	public void setOrderCurrency(String orderCurrency) {
		this.orderCurrency = orderCurrency;
	}

	public String getReceiverMid() {
		return this.receiverMid;
	}
	public void setReceiverMid(String receiverMid) {
		this.receiverMid = receiverMid;
	}

	public String getSenderMid() {
		return this.senderMid;
	}
	public void setSenderMid(String senderMid) {
		this.senderMid = senderMid;
	}

}
