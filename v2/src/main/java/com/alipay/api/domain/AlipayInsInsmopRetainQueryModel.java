package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询保险维系挽留用户电话信息
 *
 * @author auto create
 * @since 1.0, 2022-12-07 17:43:51
 */
public class AlipayInsInsmopRetainQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5319365659975963191L;

	/**
	 * 机构接入云呼的口令
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 保险机构ID
	 */
	@ApiField("ins_code")
	private String insCode;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getInsCode() {
		return this.insCode;
	}
	public void setInsCode(String insCode) {
		this.insCode = insCode;
	}

}
