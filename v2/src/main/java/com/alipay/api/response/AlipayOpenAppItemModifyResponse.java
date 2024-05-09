package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemSkuIdPair;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.item.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-23 21:51:00
 */
public class AlipayOpenAppItemModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8153711947288292578L;

	/** 
	 * 支付宝平台侧spu ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 商家侧spu商品 ID，要求 APPID 下全局唯一.
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/** 
	 * sku数组
	 */
	@ApiListField("skus")
	@ApiField("item_sku_id_pair")
	private List<ItemSkuIdPair> skus;

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}
	public String getOutItemId( ) {
		return this.outItemId;
	}

	public void setSkus(List<ItemSkuIdPair> skus) {
		this.skus = skus;
	}
	public List<ItemSkuIdPair> getSkus( ) {
		return this.skus;
	}

}
