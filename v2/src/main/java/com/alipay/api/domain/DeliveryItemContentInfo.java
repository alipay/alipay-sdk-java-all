package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广的商品内容信息
 *
 * @author auto create
 * @since 1.0, 2023-08-15 10:20:05
 */
public class DeliveryItemContentInfo extends AlipayObject {

	private static final long serialVersionUID = 7491975896987237274L;

	/**
	 * 支付宝侧商品id。
注意事项：支持状态为“出售中”的商品
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品模版类型
	 */
	@ApiField("item_type")
	private String itemType;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

}
