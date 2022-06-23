package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.user.auth.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-12 10:53:49
 */
public class ZhimaCreditPeUserAuthApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8118395845561335323L;

	/** 
	 * 临时授权码，一次性有效，同时若超过有效期未使用，则会失效。有效期目前至少为5分钟，最长为24小时。请获取auth_code后尽快通过调用alipay.system.oauth.token接口获取访问令牌
	 */
	@ApiField("auth_code")
	private String authCode;

	/** 
	 * error_scope表示授权是失败的scope列表及对应的错误信息，个数不定，少于请求授权时scope个数
	 */
	@ApiField("error_scope")
	private String errorScope;

	/** 
	 * 成功授权的接口权限值，目前只支持auth_user（获取用户信息、网站支付宝登录）、auth_base（用户信息授权）、auth_ecard（商户会员卡）、auth_invoice_info（支付宝闪电开票）、auth_puc_charge（生活缴费）五个值;多个scope时用“,”分隔，如scope为“auth_user,auth_ecard”时，此时获取到的access_token，既可以用来获取用户信息，又可以给用户发送会员卡。
	 */
	@ApiField("scope")
	private String scope;

	/** 
	 * 商户自定义参数，用户授权后，重定向到redirect_uri时会原样回传给商户。 为防止CSRF攻击，建议开发者请求授权时传入state参数，该参数要做到既不可预测，又可以证明客户端和当前第三方网站的登录认证状态存在关联。
	 */
	@ApiField("state")
	private String state;

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getAuthCode( ) {
		return this.authCode;
	}

	public void setErrorScope(String errorScope) {
		this.errorScope = errorScope;
	}
	public String getErrorScope( ) {
		return this.errorScope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getScope( ) {
		return this.scope;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getState( ) {
		return this.state;
	}

}
