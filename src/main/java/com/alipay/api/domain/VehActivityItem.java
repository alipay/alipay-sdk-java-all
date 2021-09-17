package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动项
 *
 * @author auto create
 * @since 1.0, 2021-05-31 15:52:07
 */
public class VehActivityItem extends AlipayObject {

	private static final long serialVersionUID = 5241716417669165578L;

	/**
	 * 活动id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 活动名称
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
