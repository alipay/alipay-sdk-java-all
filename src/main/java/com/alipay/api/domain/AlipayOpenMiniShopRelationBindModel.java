package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序门店绑定
 *
 * @author auto create
 * @since 1.0, 2021-08-12 18:50:01
 */
public class AlipayOpenMiniShopRelationBindModel extends AlipayObject {

	private static final long serialVersionUID = 6187766622998229155L;

	/**
	 * 门店信息，entity_id为平台侧门店id，property_list属性列表详见 <a href="https://opendocs.alipay.com/mini/00nvud">绑定门店</a>。
	 */
	@ApiListField("entity_info")
	@ApiField("mini_entity_bind_info")
	private List<MiniEntityBindInfo> entityInfo;

	/**
	 * 操作类型，固定为：MINIAPP_SHOP
	 */
	@ApiField("operation")
	private String operation;

	public List<MiniEntityBindInfo> getEntityInfo() {
		return this.entityInfo;
	}
	public void setEntityInfo(List<MiniEntityBindInfo> entityInfo) {
		this.entityInfo = entityInfo;
	}

	public String getOperation() {
		return this.operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

}
