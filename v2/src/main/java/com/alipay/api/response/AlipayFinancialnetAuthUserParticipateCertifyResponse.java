package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.user.participate.certify response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-23 19:12:08
 */
public class AlipayFinancialnetAuthUserParticipateCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8768221155883493123L;

	/** 
	 * 认证成功的id， 如果未认证成功 则返回为空。
	 */
	@ApiField("certify_id")
	private String certifyId;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}
	public String getCertifyId( ) {
		return this.certifyId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
