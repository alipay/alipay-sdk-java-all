package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡商品上架
 *
 * @author auto create
 * @since 1.0, 2024-04-10 16:33:57
 */
public class AlipayCommerceOperationTimescardItemOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 1692158127429324352L;

	/**
	 * 次卡商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
