package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家侧商品信息
 *
 * @author auto create
 * @since 1.0, 2024-03-27 16:20:56
 */
public class MerchantItemInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3457946754429858155L;

	/**
	 * 商家侧商品维度的属性信息
	 */
	@ApiListField("item_attrs")
	@ApiField("merchant_item_attr_v_o")
	private List<MerchantItemAttrVO> itemAttrs;

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

	public List<MerchantItemAttrVO> getItemAttrs() {
		return this.itemAttrs;
	}
	public void setItemAttrs(List<MerchantItemAttrVO> itemAttrs) {
		this.itemAttrs = itemAttrs;
	}

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
