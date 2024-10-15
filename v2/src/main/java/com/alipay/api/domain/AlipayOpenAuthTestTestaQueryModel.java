package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * test1
 *
 * @author auto create
 * @since 1.0, 2023-12-15 16:21:26
 */
public class AlipayOpenAuthTestTestaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2556624297528764941L;

	/**
	 * 应用id
	 */
	@ApiField("appid")
	private String appid;

	public String getAppid() {
		return this.appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}

}
