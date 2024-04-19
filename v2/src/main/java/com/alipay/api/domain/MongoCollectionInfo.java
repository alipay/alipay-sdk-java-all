package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可回档集合列表
 *
 * @author auto create
 * @since 1.0, 2024-03-13 15:55:27
 */
public class MongoCollectionInfo extends AlipayObject {

	private static final long serialVersionUID = 8484191348447928873L;

	/**
	 * 集合名称
	 */
	@ApiField("name")
	private String name;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
