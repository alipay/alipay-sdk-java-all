package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缴费当面付账单状态查询接口
 *
 * @author auto create
 * @since 1.0, 2022-05-11 16:34:08
 */
public class AlipayEbppFacepayBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7657226649192659151L;

	/**
	 * 支付宝交易流水号(和user_id、user_identity_code三者至少传一个) 
（缴税业务：out_order_no/user_id/bill_no都可以不传）
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * ISV流水号，用于控制幂等，须确保全局唯一。
（缴税业务：可采用{征收机关代码}-{外部申报号}的形式）
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 支付宝用户ID(和user_identity_code、bill_no三者至少传一个) 
（缴税业务：out_order_no/user_id/bill_no都可以不传）
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户支付宝付款码 (需使用下单时用的码值，10分钟内有效）(和user_id、bill_no三者至少传一个)
（缴税业务：out_order_no/user_id/bill_no都可以不传）
	 */
	@ApiField("user_identity_code")
	private String userIdentityCode;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserIdentityCode() {
		return this.userIdentityCode;
	}
	public void setUserIdentityCode(String userIdentityCode) {
		this.userIdentityCode = userIdentityCode;
	}

}
