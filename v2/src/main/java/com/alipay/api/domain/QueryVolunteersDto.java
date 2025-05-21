package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询志愿者活动时返回值
 *
 * @author auto create
 * @since 1.0, 2023-06-16 11:22:55
 */
public class QueryVolunteersDto extends AlipayObject {

	private static final long serialVersionUID = 5661459999791621199L;

	/**
	 * 活动时
	 */
	@ApiField("hours")
	private String hours;

	/**
	 * 人员ID
	 */
	@ApiField("id")
	private String id;

	public String getHours() {
		return this.hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
