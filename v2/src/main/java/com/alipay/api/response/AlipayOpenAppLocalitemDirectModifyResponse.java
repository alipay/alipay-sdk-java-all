package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemSkuIdPair;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.localitem.direct.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-04 10:32:09
 */
public class AlipayOpenAppLocalitemDirectModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6467938512345647881L;

	/** 
	 * 支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 商家侧商品ID，要求 APPID 下全局唯一.
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
