package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保电子凭证参保人信息查询接口
 *
 * @author auto create
 * @since 1.0, 2023-09-19 10:14:36
 */
public class AlipayCommerceMedicalCardUserinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6871217799239313263L;

	/**
	 * 通过亲情账户绑定关系插件地址接口或其他方式获取到的有效访问令牌
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
