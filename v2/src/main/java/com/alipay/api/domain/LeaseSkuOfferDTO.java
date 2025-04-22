package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁sku租赁商报价信息
 *
 * @author auto create
 * @since 1.0, 2023-06-28 14:03:20
 */
public class LeaseSkuOfferDTO extends AlipayObject {

	private static final long serialVersionUID = 7864979527926223799L;

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

	/**
	 * 状态 Confirmed、Unconfirmed
	 */
	@ApiField("status")
	private String status;

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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
