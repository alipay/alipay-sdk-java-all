package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 高德POI信息
 *
 * @author auto create
 * @since 1.0, 2018-10-19 15:59:59
 */
public class AmapPoi extends AlipayObject {

	private static final long serialVersionUID = 5252294631812162641L;

	/**
	 * 唯一ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 室内地图相关数据
	 */
	@ApiField("indoor_data")
	private AmapIndoorData indoorData;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public AmapIndoorData getIndoorData() {
		return this.indoorData;
	}
	public void setIndoorData(AmapIndoorData indoorData) {
		this.indoorData = indoorData;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
