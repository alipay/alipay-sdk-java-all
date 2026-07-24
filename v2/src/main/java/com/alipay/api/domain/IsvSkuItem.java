package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品报价明细信息
 *
 * @author auto create
 * @since 1.0, 2026-06-11 14:35:50
 */
public class IsvSkuItem extends AlipayObject {

	private static final long serialVersionUID = 6757742288943123461L;

	/**
	 * 报价过期时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 保障期限（单位：年）
	 */
	@ApiField("guarantee_duration")
	private Long guaranteeDuration;

	/**
	 * 保障公里数（单位：公里）
	 */
	@ApiField("guarantee_mileage")
	private Long guaranteeMileage;

	/**
	 * 划线价（单位：元）
	 */
	@ApiField("marked_price")
	private String markedPrice;

	/**
	 * 服务商报价ID
	 */
	@ApiField("quote_id")
	private String quoteId;

	/**
	 * 报价时间
	 */
	@ApiField("quote_time")
	private Date quoteTime;

	/**
	 * 售价（单位：元）
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 服务商SKU标识
	 */
	@ApiField("sku_id")
	private String skuId;

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public Long getGuaranteeDuration() {
		return this.guaranteeDuration;
	}
	public void setGuaranteeDuration(Long guaranteeDuration) {
		this.guaranteeDuration = guaranteeDuration;
	}

	public Long getGuaranteeMileage() {
		return this.guaranteeMileage;
	}
	public void setGuaranteeMileage(Long guaranteeMileage) {
		this.guaranteeMileage = guaranteeMileage;
	}

	public String getMarkedPrice() {
		return this.markedPrice;
	}
	public void setMarkedPrice(String markedPrice) {
		this.markedPrice = markedPrice;
	}

	public String getQuoteId() {
		return this.quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	public Date getQuoteTime() {
		return this.quoteTime;
	}
	public void setQuoteTime(Date quoteTime) {
		this.quoteTime = quoteTime;
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

}
