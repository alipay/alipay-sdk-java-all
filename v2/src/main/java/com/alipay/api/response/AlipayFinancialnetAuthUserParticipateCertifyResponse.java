package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.user.participate.certify response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-22 20:42:27
 */
public class AlipayFinancialnetAuthUserParticipateCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5176956993893439746L;

	/** 
	 * 认证成功的id， 如果未认证成功 则返回为空。
	 */
	@ApiField("certify_id")
	private String certifyId;

	/** 
	 * 以旧换新接口实名认证校验失败，会返回source对应类型的认证链接。注：动态字段biz_code是根据source映射的。
	 */
	@ApiField("certify_url")
	private String certifyUrl;

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

	public void setCertifyUrl(String certifyUrl) {
		this.certifyUrl = certifyUrl;
	}
	public String getCertifyUrl( ) {
		return this.certifyUrl;
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
