package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * sku信息
 *
 * @author auto create
 * @since 1.0, 2022-09-20 15:33:49
 */
public class ApeSkuInfo extends AlipayObject {

	private static final long serialVersionUID = 2616187223611227256L;

	/**
	 * 原价
	 */
	@ApiField("origin_price")
	private String originPrice;

	/**
	 * 售卖价格
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * sku的唯一标识
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * sku规格
	 */
	@ApiField("specification")
	private String specification;

	/**
	 * 状态，1为有效、0为无效，对应sku的上架和下架
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 库存数量
	 */
	@ApiField("stock_num")
	private Long stockNum;

	public String getOriginPrice() {
		return this.originPrice;
	}
	public void setOriginPrice(String originPrice) {
		this.originPrice = originPrice;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSpecification() {
		return this.specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

}
