package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务下拉列表的数据结构对象
 *
 * @author auto create
 * @since 1.0, 2016-12-21 11:03:11
 */
public class BizListDataInfo extends AlipayObject {

	private static final long serialVersionUID = 3765554474392482947L;

	/**
	 * 下拉列表编号
	 */
	@ApiField("code")
	private String code;

	/**
	 * 下拉列表名称
	 */
	@ApiField("name")
	private String name;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
