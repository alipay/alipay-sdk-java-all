package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.operator.mobile.bind response.
 * 
 * @author auto create
 * @since 1.0, 2018-09-13 13:55:27
 */
public class AlipayOperatorMobileBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 1559391993598653225L;

	/** 
	 * 用户签约的支付宝账号对应的支付宝唯一用户号。
以2088开头的16位纯数字组成。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 身份证号：显示前1位+*（实际位数）+后1位，如：5****************9
	 */
	@ApiField("certificate")
	private String certificate;

	/** 
	 * 用户手机号码
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/** 
	 * 绑定状态：
&#61548;	S表示绑定成功
&#61548;	F表示绑定失败
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 显示除姓名第一个字以外的其它部分
	 */
	@ApiField("user_name")
	private String userName;

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public String getCertificate( ) {
		return this.certificate;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getMobileNo( ) {
		return this.mobileNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
