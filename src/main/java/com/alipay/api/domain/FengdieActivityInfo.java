package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动信息
 *
 * @author auto create
 * @since 1.0, 2017-05-23 16:52:52
 */
public class FengdieActivityInfo extends AlipayObject {

	private static final long serialVersionUID = 8116961354845963291L;

	/**
	 * id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 活动名称
	 */
	@ApiField("name")
	private String name;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
