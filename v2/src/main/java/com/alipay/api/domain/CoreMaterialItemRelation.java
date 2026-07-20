package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核心原材料关联的物料信息
 *
 * @author auto create
 * @since 1.0, 2026-04-21 15:32:12
 */
public class CoreMaterialItemRelation extends AlipayObject {

	private static final long serialVersionUID = 2739493547786158996L;

	/**
	 * 整机比（数量）
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 物料ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 物料名称
	 */
	@ApiField("item_name")
	private String itemName;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
