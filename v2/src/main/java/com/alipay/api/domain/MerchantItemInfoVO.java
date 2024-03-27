package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家侧商品信息
 *
 * @author auto create
 * @since 1.0, 2024-01-03 15:12:11
 */
public class MerchantItemInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1675842266962427536L;

	/**
	 * 商家侧商品ID，要求 APPID 下全局唯一。
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商家侧sku信息。
	 */
	@ApiListField("skus")
	@ApiField("merchant_sku_info_v_o")
	private List<MerchantSkuInfoVO> skus;

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public List<MerchantSkuInfoVO> getSkus() {
		return this.skus;
	}
	public void setSkus(List<MerchantSkuInfoVO> skus) {
		this.skus = skus;
	}

}
