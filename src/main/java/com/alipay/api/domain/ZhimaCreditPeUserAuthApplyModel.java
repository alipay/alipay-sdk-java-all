package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用用户授权申请接口
 *
 * @author auto create
 * @since 1.0, 2021-03-12 10:53:49
 */
public class ZhimaCreditPeUserAuthApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8118581191274494546L;

	/**
	 * 产品码，固定值: w1010100001000002428
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 授权回调地址，是经过URLENCODE转义的url链接（url必须以http或者https开头）;在请求之前，开发者需要先到开发者中心对应应用内，配置授权回调地址。 redirect_uri与应用配置的授权回调地址域名部分必须一致。
	 */
	@ApiField("redirect_uri")
	private String redirectUri;

	/**
	 * 接口权限值，目前只支持auth_user（获取用户信息、网站支付宝登录）、auth_base（用户信息授权）、auth_ecard（商户会员卡）、auth_invoice_info（支付宝闪电开票）、auth_puc_charge（生活缴费），auth_zhima等;多个scope时用”,”分隔，如scope为”auth_user,auth_ecard”时，此时获取到的access_token，既可以用来获取用户信息，又可以给用户发送会员卡。
	 */
	@ApiField("scope")
	private String scope;

	/**
	 * 商户自定义参数，用户授权后，重定向到redirect_uri时会原样回传给商户。 为防止CSRF攻击，建议开发者请求授权时传入state参数，该参数要做到既不可预测，又可以证明客户端和当前第三方网站的登录认证状态存在关联。
只允许base64字符（长度小于等于100）
	 */
	@ApiField("state")
	private String state;

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRedirectUri() {
		return this.redirectUri;
	}
	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

	public String getScope() {
		return this.scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
