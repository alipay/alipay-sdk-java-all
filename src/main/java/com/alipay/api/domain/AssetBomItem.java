package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料bom明细
 *
 * @author auto create
 * @since 1.0, 2022-02-23 15:44:53
 */
public class AssetBomItem extends AlipayObject {

	private static final long serialVersionUID = 6877543335232695172L;

	/**
	 * 子物料数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 物料id
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
