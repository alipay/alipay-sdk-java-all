package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提供给高德查询小程序基本信息
 *
 * @author auto create
 * @since 1.0, 2018-12-28 00:02:46
 */
public class AlipayOpenMiniBaseinfoAmapQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5518767546927459147L;

	/**
	 * 小程序应用id
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
