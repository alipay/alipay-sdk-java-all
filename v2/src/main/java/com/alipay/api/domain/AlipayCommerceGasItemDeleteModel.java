package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加油商品信息删除
 *
 * @author auto create
 * @since 1.0, 2025-10-10 14:02:41
 */
public class AlipayCommerceGasItemDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4414919898218491629L;

	/**
	 * 外部商品ID（item_id不为空则以item_id作为删除KEY,item_id为空则以external_item_id作为删除KEY,两者不能同时为空）
	 */
	@ApiField("external_item_id")
	private String externalItemId;

	/**
	 * 商品ID（item_id不为空则以item_id作为删除KEY,item_id为空则以external_item_id作为删除KEY,两者不能同时为空）
	 */
	@ApiField("item_id")
	private String itemId;

	public String getExternalItemId() {
		return this.externalItemId;
	}
	public void setExternalItemId(String externalItemId) {
		this.externalItemId = externalItemId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
