package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.validate response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:09:58
 */
public class AlipayUserValidateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6776557682561657477L;

	/** 
	 * 支付宝userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * true标识通过认证.false标识没有
	 */
	@ApiField("certified")
	private String certified;

	/** 
	 * 隐藏的真实姓名，如 *三(张三)
	 */
	@ApiField("real_name")
	private String realName;

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setCertified(String certified) {
		this.certified = certified;
	}
	public String getCertified( ) {
		return this.certified;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getRealName( ) {
		return this.realName;
	}

}
