package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序商品SPU ID对
 *
 * @author auto create
 * @since 1.0, 2023-03-14 09:19:11
 */
public class AppItemSpuIdPair extends AlipayObject {

	private static final long serialVersionUID = 1782772645493945775L;

	/**
	 * 商家侧商品spu编码
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 平台侧商品spu编码
	 */
	@ApiField("platform_item_id")
	private String platformItemId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getPlatformItemId() {
		return this.platformItemId;
	}
	public void setPlatformItemId(String platformItemId) {
		this.platformItemId = platformItemId;
	}

}
