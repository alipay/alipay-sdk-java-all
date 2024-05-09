package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁商品sku提报信息
 *
 * @author auto create
 * @since 1.0, 2023-06-28 14:05:28
 */
public class LeaseSkuSubmitDTO extends AlipayObject {

	private static final long serialVersionUID = 3593663593154219234L;

	/**
	 * 租赁商下单跳转地址
	 */
	@ApiField("lessor_path")
	private String lessorPath;

	/**
	 * 租赁商skuid
	 */
	@ApiField("lessor_sku_id")
	private String lessorSkuId;

	/**
	 * 出价
	 */
	@ApiField("price")
	private String price;

	/**
	 * 规格ID
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getLessorPath() {
		return this.lessorPath;
	}
	public void setLessorPath(String lessorPath) {
		this.lessorPath = lessorPath;
	}

	public String getLessorSkuId() {
		return this.lessorSkuId;
	}
	public void setLessorSkuId(String lessorSkuId) {
		this.lessorSkuId = lessorSkuId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
