package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品删除接口
 *
 * @author auto create
 * @since 1.0, 2023-07-05 10:57:50
 */
public class AntMerchantExpandItemDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1415981554648636466L;

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
