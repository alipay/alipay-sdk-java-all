package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车信息
 *
 * @author auto create
 * @since 1.0, 2024-01-24 18:55:22
 */
public class ParkInfo extends AlipayObject {

	private static final long serialVersionUID = 2493955294616441493L;

	/**
	 * 停车信息详情
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 停车信息标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 停车信息类型
	 */
	@ApiField("type")
	private String type;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
