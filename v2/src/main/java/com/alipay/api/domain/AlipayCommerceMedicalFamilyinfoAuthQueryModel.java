package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户已授权的医疗健康家人信息
 *
 * @author auto create
 * @since 1.0, 2025-12-02 11:24:22
 */
public class AlipayCommerceMedicalFamilyinfoAuthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6491152143616449397L;

	/**
	 * 通过亲情账户我的家人信息插件地址接口或其他方式获取到的有效访问令牌
	 */
	@ApiField("access_token")
	private String accessToken;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

}
