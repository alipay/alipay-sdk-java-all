package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * data数据
 *
 * @author auto create
 * @since 1.0, 2023-08-28 19:58:59
 */
public class AosDataItem extends AlipayObject {

	private static final long serialVersionUID = 5545856123235442163L;

	/**
	 * 业务主键
	 */
	@ApiField("id")
	private String id;

	/**
	 * 原始数据
	 */
	@ApiField("meta")
	private String meta;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMeta() {
		return this.meta;
	}
	public void setMeta(String meta) {
		this.meta = meta;
	}

}
