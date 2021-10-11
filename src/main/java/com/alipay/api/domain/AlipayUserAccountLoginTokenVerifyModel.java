package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二方登录token校验
 *
 * @author auto create
 * @since 1.0, 2020-11-23 20:39:54
 */
public class AlipayUserAccountLoginTokenVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 5752442211498862246L;

	/**
	 * 扩展参数
	 */
	@ApiField("extra_params")
	private VerifyExtraParams extraParams;

	/**
	 * 二方登录token
	 */
	@ApiField("login_token")
	private String loginToken;

	/**
	 * 渠道来源
	 */
	@ApiField("source")
	private String source;

	public VerifyExtraParams getExtraParams() {
		return this.extraParams;
	}
	public void setExtraParams(VerifyExtraParams extraParams) {
		this.extraParams = extraParams;
	}

	public String getLoginToken() {
		return this.loginToken;
	}
	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
