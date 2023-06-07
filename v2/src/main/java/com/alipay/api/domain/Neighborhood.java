package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区信息
 *
 * @author auto create
 * @since 1.0, 2018-12-14 17:31:44
 */
public class Neighborhood extends AlipayObject {

	private static final long serialVersionUID = 5746422514871283993L;

	/**
	 * 社区名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * POI类型
	 */
	@ApiField("type")
	private String type;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
