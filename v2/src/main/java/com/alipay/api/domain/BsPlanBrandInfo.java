package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联营-计划-品牌信息
 *
 * @author auto create
 * @since 1.0, 2023-04-17 20:20:44
 */
public class BsPlanBrandInfo extends AlipayObject {

	private static final long serialVersionUID = 5227759378275119163L;

	/**
	 * 品牌id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 品牌名称
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
