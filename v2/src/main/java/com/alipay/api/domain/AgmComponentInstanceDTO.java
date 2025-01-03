package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 组件实例对象
 *
 * @author auto create
 * @since 1.0, 2023-03-01 16:08:50
 */
public class AgmComponentInstanceDTO extends AlipayObject {

	private static final long serialVersionUID = 1741183516335177772L;

	/**
	 * 组件唯一标识
	 */
	@ApiField("id")
	private String id;

	/**
	 * 组件名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 模板编码
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 组件具体填写结果
	 */
	@ApiField("value")
	private String value;

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

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
