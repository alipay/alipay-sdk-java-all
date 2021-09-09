package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序与其他实体绑定信息
 *
 * @author auto create
 * @since 1.0, 2020-11-10 13:58:08
 */
public class MiniEntityBindVO extends AlipayObject {

	private static final long serialVersionUID = 5287496826272528467L;

	/**
	 * 实体id，具体场景见产品文档
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 主体id，具体场景含义见产品文档
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 属性列表，具体属性见产品文档
	 */
	@ApiListField("property_list")
	@ApiField("mini_content_property")
	private List<MiniContentProperty> propertyList;

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public List<MiniContentProperty> getPropertyList() {
		return this.propertyList;
	}
	public void setPropertyList(List<MiniContentProperty> propertyList) {
		this.propertyList = propertyList;
	}

}
