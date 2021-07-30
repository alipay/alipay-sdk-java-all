package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询口碑轻店微信登录信息
 *
 * @author auto create
 * @since 1.0, 2020-02-26 22:52:39
 */
public class KoubeiShopWxloginQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5254424544592716661L;

	/**
	 * 业务类型，轻店业务传MERCHANT_APP
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 授权，固定值，传authorization_code
	 */
	@ApiField("grant_type")
	private String grantType;

	/**
	 * 前端页面获取的js_code
	 */
	@ApiField("js_code")
	private String jsCode;

	/**
	 * 微信的app_id
	 */
	@ApiField("wx_app_id")
	private String wxAppId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getGrantType() {
		return this.grantType;
	}
	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getJsCode() {
		return this.jsCode;
	}
	public void setJsCode(String jsCode) {
		this.jsCode = jsCode;
	}

	public String getWxAppId() {
		return this.wxAppId;
	}
	public void setWxAppId(String wxAppId) {
		this.wxAppId = wxAppId;
	}

}
