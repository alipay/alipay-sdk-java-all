package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘宝绑定支付宝账号信息查询
 *
 * @author auto create
 * @since 1.0, 2025-03-27 13:32:26
 */
public class AlipayUserAccountTaobaoBindQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2246536226714642476L;

	/**
	 * 淘宝havanaId
	 */
	@ApiField("havana_id")
	private String havanaId;

	/**
	 * 安全SDK生成的设备指纹
	 */
	@ApiField("umid")
	private String umid;

	/**
	 * 为核身后支付宝生成的授权用户信息token，用来获取要绑定的支付宝账号信息
	 */
	@ApiField("user_token")
	private String userToken;

	public String getHavanaId() {
		return this.havanaId;
	}
	public void setHavanaId(String havanaId) {
		this.havanaId = havanaId;
	}

	public String getUmid() {
		return this.umid;
	}
	public void setUmid(String umid) {
		this.umid = umid;
	}

	public String getUserToken() {
		return this.userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

}
