package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * test1
 *
 * @author auto create
 * @since 1.0, 2025-06-25 12:43:18
 */
public class AlipayOpenAuthTestTestaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2876849532254277955L;

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
