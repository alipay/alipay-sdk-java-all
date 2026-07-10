package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息
 *
 * @author auto create
 * @since 1.0, 2026-07-09 10:44:42
 */
public class ItemInfoForFulfillmentList extends AlipayObject {

	private static final long serialVersionUID = 4839929475629642411L;

	/**
	 * saas关联的标品id（好大夫侧使用）
	 */
	@ApiField("relation_spu_id")
	private String relationSpuId;

	/**
	 * 外部商户的商品编码（对应商品的店内码）
	 */
	@ApiField("sku_code")
	private String skuCode;

	/**
	 * saas商品id
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * saas标品id
	 */
	@ApiField("spu_id")
	private String spuId;

	public String getRelationSpuId() {
		return this.relationSpuId;
	}
	public void setRelationSpuId(String relationSpuId) {
		this.relationSpuId = relationSpuId;
	}

	public String getSkuCode() {
		return this.skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

}
