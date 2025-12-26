package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.taxdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-19 11:12:41
 */
public class AlipayOverseasTaxTaxdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1517517322689327477L;

	/** 
	 * 最终退税金额，单位为元
	 */
	@ApiField("final_refund_amount")
	private String finalRefundAmount;

	/** 
	 * 实际退税金额，当前仅支持CNY
	 */
	@ApiField("final_refund_currency")
	private String finalRefundCurrency;

	/** 
	 * 用户全名
	 */
	@ApiField("full_name")
	private String fullName;

	/** 
	 * 外部商户单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 退税机构id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * The actual payment time. 仅放款完成时存在，格式为yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("pay_time")
	private String payTime;

	/** 
	 * 手机号场景时回传（当前无此场景，返回null）
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/** 
	 * 退税单状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 退税单号支付宝流水号
	 */
	@ApiField("tax_no")
	private String taxNo;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("user_id_open_id")
	private String userIdOpenId;

	/** 
	 * 用户登录id
	 */
	@ApiField("user_login_id")
	private String userLoginId;

	public void setFinalRefundAmount(String finalRefundAmount) {
		this.finalRefundAmount = finalRefundAmount;
	}
	public String getFinalRefundAmount( ) {
		return this.finalRefundAmount;
	}

	public void setFinalRefundCurrency(String finalRefundCurrency) {
		this.finalRefundCurrency = finalRefundCurrency;
	}
	public String getFinalRefundCurrency( ) {
		return this.finalRefundCurrency;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getFullName( ) {
		return this.fullName;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getPayTime( ) {
		return this.payTime;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPhoneNo( ) {
		return this.phoneNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}
	public String getTaxNo( ) {
		return this.taxNo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserIdOpenId(String userIdOpenId) {
		this.userIdOpenId = userIdOpenId;
	}
	public String getUserIdOpenId( ) {
		return this.userIdOpenId;
	}

	public void setUserLoginId(String userLoginId) {
		this.userLoginId = userLoginId;
	}
	public String getUserLoginId( ) {
		return this.userLoginId;
	}

}
