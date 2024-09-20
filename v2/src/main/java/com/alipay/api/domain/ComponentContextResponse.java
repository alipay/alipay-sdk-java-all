package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 组件上下文
 *
 * @author auto create
 * @since 1.0, 2023-11-16 13:31:37
 */
public class ComponentContextResponse extends AlipayObject {

	private static final long serialVersionUID = 5843194545385147647L;

	/**
	 * 查找的目标组件的code，方舟颁发给插件的唯一code
	 */
	@ApiField("component_code")
	private String componentCode;

	/**
	 * 方舟提供的一种通用的插件数据传输的机制，插件可以使用该字段进行存储或获取其他插件的数据。
	 */
	@ApiField("property_model_map")
	private String propertyModelMap;

	public String getComponentCode() {
		return this.componentCode;
	}
	public void setComponentCode(String componentCode) {
		this.componentCode = componentCode;
	}

	public String getPropertyModelMap() {
		return this.propertyModelMap;
	}
	public void setPropertyModelMap(String propertyModelMap) {
		this.propertyModelMap = propertyModelMap;
	}

}
