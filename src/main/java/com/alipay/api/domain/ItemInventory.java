package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品库存信息
 *
 * @author auto create
 * @since 1.0, 2018-11-28 22:08:44
 */
public class ItemInventory extends AlipayObject {

	private static final long serialVersionUID = 7564756551673898338L;

	/**
	 * 商品库存扩展属性
	 */
	@ApiField("ext_prop")
	private String extProp;

	/**
	 * 外部商品ID
	 */
	@ApiField("external_item_id")
	private String externalItemId;

	/**
	 * 商品库存数量
	 */
	@ApiField("inventory")
	private Long inventory;

	public String getExtProp() {
		return this.extProp;
	}
	public void setExtProp(String extProp) {
		this.extProp = extProp;
	}

	public String getExternalItemId() {
		return this.externalItemId;
	}
	public void setExternalItemId(String externalItemId) {
		this.externalItemId = externalItemId;
	}

	public Long getInventory() {
		return this.inventory;
	}
	public void setInventory(Long inventory) {
		this.inventory = inventory;
	}

}
