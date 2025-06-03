package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 当面付撤消订单
 *
 * @author auto create
 * @since 1.0, 2022-12-26 16:36:16
 */
public class AlipayEbppFacepayBillCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1233147951444144254L;

	/**
	 * 支付宝交易流水号(和user_identity_code、user_id三者至少传一个)
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 支付宝用户ID(和user_identity_code、bill_no三者至少传一个)
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * ISV交易流水号( 要求全局唯一)
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 支付宝用户ID(和user_identity_code、bill_no三者至少传一个)
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户支付宝付款码(需使用下单时用的码值，10分钟内有效）(和user_id、bill_no三者至少传一个)
	 */
	@ApiField("user_identity_code")
	private String userIdentityCode;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
