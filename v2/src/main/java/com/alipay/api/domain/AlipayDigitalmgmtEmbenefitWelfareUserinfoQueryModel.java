package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户福利权限查询
 *
 * @author auto create
 * @since 1.0, 2026-10-27 10:57:57
 */
public class AlipayDigitalmgmtEmbenefitWelfareUserinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1382273977567672723L;

	/**
	 * token信息
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 供应商接口标识
	 */
	@ApiField("api_key")
	private String apiKey;

	/**
	 * 跳转链接中产品id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 支付宝小程序登录id
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 供应商id，由技术提供
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getApiKey() {
		return this.apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
