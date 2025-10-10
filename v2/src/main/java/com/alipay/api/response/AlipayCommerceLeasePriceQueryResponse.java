package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LeaseItemSkuDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lease.price.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 10:09:51
 */
public class AlipayCommerceLeasePriceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1426911669166684115L;

	/** 
	 * 支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * sku最低价格
	 */
	@ApiField("lowest_price")
	private String lowestPrice;

	/** 
	 * 最低价格的sku_id，如果有一样价格的随机返回一个
	 */
	@ApiField("lowest_price_sku_id")
	private String lowestPriceSkuId;

	/** 
	 * sku价格信息
	 */
	@ApiListField("skus")
	@ApiField("lease_item_sku_d_t_o")
	private List<LeaseItemSkuDTO> skus;

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setLowestPrice(String lowestPrice) {
		this.lowestPrice = lowestPrice;
	}
	public String getLowestPrice( ) {
		return this.lowestPrice;
	}

	public void setLowestPriceSkuId(String lowestPriceSkuId) {
		this.lowestPriceSkuId = lowestPriceSkuId;
	}
	public String getLowestPriceSkuId( ) {
		return this.lowestPriceSkuId;
	}

	public void setSkus(List<LeaseItemSkuDTO> skus) {
		this.skus = skus;
	}
	public List<LeaseItemSkuDTO> getSkus( ) {
		return this.skus;
	}

}
