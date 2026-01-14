package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.single.taxdata.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-19 11:12:41
 */
public class AlipayOverseasTaxSingleTaxdataSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6636127299912841419L;

	/** 
	 * 用户名称
	 */
	@ApiField("full_name")
	private String fullName;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * The actual payment time. 仅放款完成时存在，格式为yyyy-mm-dd hh:mm:ss format.
	 */
	@ApiField("pay_time")
	private String payTime;

	/** 
	 * 支付宝流水号,退税单号
	 */
	@ApiField("refund_order_no")
	private String refundOrderNo;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 用户登录id
	 */
	@ApiField("user_login_id")
	private String userLoginId;

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getFullName( ) {
		return this.fullName;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getPayTime( ) {
		return this.payTime;
	}

	public void setRefundOrderNo(String refundOrderNo) {
		this.refundOrderNo = refundOrderNo;
	}
	public String getRefundOrderNo( ) {
		return this.refundOrderNo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserLoginId(String userLoginId) {
		this.userLoginId = userLoginId;
	}
	public String getUserLoginId( ) {
		return this.userLoginId;
	}

}
