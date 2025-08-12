package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模板组件列表查询
 *
 * @author auto create
 * @since 1.0, 2023-05-08 14:53:46
 */
public class TemplateComponentListResponse extends AlipayObject {

	private static final long serialVersionUID = 5755463643693618226L;

	/**
	 * 模板组件对象列表
	 */
	@ApiListField("component")
	@ApiField("component_d_t_o")
	private List<ComponentDTO> component;

	/**
	 * 模板编码
	 */
	@ApiField("template_code")
	private String templateCode;

	public List<ComponentDTO> getComponent() {
		return this.component;
	}
	public void setComponent(List<ComponentDTO> component) {
		this.component = component;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

}
