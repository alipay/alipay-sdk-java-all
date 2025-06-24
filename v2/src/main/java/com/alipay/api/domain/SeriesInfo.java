package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汽车车系信息
 *
 * @author auto create
 * @since 1.0, 2024-11-29 18:30:57
 */
public class SeriesInfo extends AlipayObject {

	private static final long serialVersionUID = 6664936397168686734L;

	/**
	 * 车系ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 车系名称
	 */
	@ApiField("name")
	private String name;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
