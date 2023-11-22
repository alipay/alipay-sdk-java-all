package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序与其他实体绑定信息
 *
 * @author auto create
 * @since 1.0, 2022-12-15 19:38:16
 */
public class MiniEntityBindInfo extends AlipayObject {

	private static final long serialVersionUID = 5349781316581484941L;

	/**
	 * 实体id
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 属性列表
	 */
	@ApiListField("property_list")
	@ApiField("mini_content_property_info")
	private List<MiniContentPropertyInfo> propertyList;

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public List<MiniContentPropertyInfo> getPropertyList() {
		return this.propertyList;
	}
	public void setPropertyList(List<MiniContentPropertyInfo> propertyList) {
		this.propertyList = propertyList;
	}

}
