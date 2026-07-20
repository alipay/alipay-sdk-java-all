package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息
 *
 * @author auto create
 * @since 1.0, 2026-07-20 11:34:34
 */
public class ItemInfoForFulfillmentList extends AlipayObject {

	private static final long serialVersionUID = 3136135251252632957L;

	/**
	 * 是否已删除，0：正常 1：删除
	 */
	@ApiField("is_deleted")
	private Long isDeleted;

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

	public Long getIsDeleted() {
		return this.isDeleted;
	}
	public void setIsDeleted(Long isDeleted) {
		this.isDeleted = isDeleted;
	}

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
