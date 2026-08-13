package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-28 19:22:54
 */
public class AdAppInfo extends AlipayObject {

	private static final long serialVersionUID = 3333112897382953856L;

	/**
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 小程序id
	 */
	@ApiField("series_app_id")
	private String seriesAppId;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSeriesAppId() {
		return this.seriesAppId;
	}
	public void setSeriesAppId(String seriesAppId) {
		this.seriesAppId = seriesAppId;
	}

}
