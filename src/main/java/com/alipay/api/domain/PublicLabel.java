package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公众号标签模型
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class PublicLabel extends AlipayObject {

	private static final long serialVersionUID = 7242791248757553928L;

	/**
	 * 标签用户量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 标签编号
	 */
	@ApiField("id")
	private String id;

	/**
	 * 标签名称
	 */
	@ApiField("name")
	private String name;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

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
