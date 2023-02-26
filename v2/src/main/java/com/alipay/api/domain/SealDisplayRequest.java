package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用印展示给法务的信息
 *
 * @author auto create
 * @since 1.0, 2021-11-12 14:33:20
 */
public class SealDisplayRequest extends AlipayObject {

	private static final long serialVersionUID = 2893767372482384963L;

	/**
	 * 展示名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 属性名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 节点类型  text：普通文本；href ：超链接
	 */
	@ApiField("type")
	private String type;

	/**
	 * 链接地址 可空，当type为href时使用
	 */
	@ApiField("url")
	private String url;

	/**
	 * 属性value
	 */
	@ApiField("value")
	private String value;

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

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

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
