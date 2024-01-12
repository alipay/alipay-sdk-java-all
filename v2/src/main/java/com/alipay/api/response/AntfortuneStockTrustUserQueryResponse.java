package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.trust.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-15 14:06:50
 */
public class AntfortuneStockTrustUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3332781965967379372L;

	/** 
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 用户支付宝注册使用的手机号码
	 */
	@ApiField("phone")
	private String phone;

	/** 
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone( ) {
		return this.phone;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
