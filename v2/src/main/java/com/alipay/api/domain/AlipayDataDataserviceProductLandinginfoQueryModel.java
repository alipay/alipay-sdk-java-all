package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品落地页信息查询
 *
 * @author auto create
 * @since 1.0, 2026-06-25 17:00:29
 */
public class AlipayDataDataserviceProductLandinginfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5479143917862526986L;

	/**
	 * 支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID。
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商家侧商品ID，要求 APPID 下全局唯一。
	 */
	@ApiField("out_item_id")
	private String outItemId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

}
