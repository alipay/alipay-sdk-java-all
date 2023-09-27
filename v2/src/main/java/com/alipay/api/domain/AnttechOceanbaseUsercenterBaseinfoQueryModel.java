package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 从主站获取用户基本信息
 *
 * @author auto create
 * @since 1.0, 2023-09-22 15:41:30
 */
public class AnttechOceanbaseUsercenterBaseinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4454626694691955413L;

	/**
	 * 登录态
	 */
	@ApiField("authorization")
	private String authorization;

	public String getAuthorization() {
		return this.authorization;
	}
	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}

}
