package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 星云客户端用户查询接口
 *
 * @author auto create
 * @since 1.0, 2024-07-24 17:54:30
 */
public class AlipayIserviceIcontroldcUserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5791646544634725793L;

	/**
	 * 设备唯一标识
	 */
	@ApiField("dev_identifier")
	private String devIdentifier;

	/**
	 * 设备授权token
	 */
	@ApiField("dev_token")
	private String devToken;

	public String getDevIdentifier() {
		return this.devIdentifier;
	}
	public void setDevIdentifier(String devIdentifier) {
		this.devIdentifier = devIdentifier;
	}

	public String getDevToken() {
		return this.devToken;
	}
	public void setDevToken(String devToken) {
		this.devToken = devToken;
	}

}
