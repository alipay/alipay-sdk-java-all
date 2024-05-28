package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于查询单位性质
 *
 * @author auto create
 * @since 1.0, 2024-01-19 17:02:59
 */
public class IcpSubjectTypeList extends AlipayObject {

	private static final long serialVersionUID = 2599194422328467254L;

	/**
	 * 单位性质中文名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 单位性质编码
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
