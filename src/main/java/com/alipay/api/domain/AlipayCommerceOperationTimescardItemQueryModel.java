package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡商品详情查询
 *
 * @author auto create
 * @since 1.0, 2022-03-18 15:57:16
 */
public class AlipayCommerceOperationTimescardItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3325289387538574443L;

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
