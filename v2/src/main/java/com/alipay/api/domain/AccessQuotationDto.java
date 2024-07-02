package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 报价明细
 *
 * @author auto create
 * @since 1.0, 2023-05-10 14:03:48
 */
public class AccessQuotationDto extends AlipayObject {

	private static final long serialVersionUID = 5558517681233761824L;

	/**
	 * currency_code，用于商品同步，由调用方传入
	 */
	@ApiField("currency_code")
	private String currencyCode;

	/**
	 * effective_date，用于商品同步，由调用方传入
	 */
	@ApiField("effective_date")
	private Date effectiveDate;

	/**
	 * expire_date，用于商品同步，由调用方传入
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * ladder_price，用于商品同步，由调用方传入
	 */
	@ApiField("ladder_price")
	private Boolean ladderPrice;

	/**
	 * ladder_price_list，用于商品同步，由调用方传入
	 */
	@ApiListField("ladder_price_list")
	@ApiField("access_ladder_price_dto")
	private List<AccessLadderPriceDto> ladderPriceList;

	/**
	 * origin_unit_price，用于商品同步，由调用方传入
	 */
	@ApiField("origin_unit_price")
	private String originUnitPrice;

	/**
	 * sku_attr_value_list，用于商品同步，由调用方传入
	 */
	@ApiListField("sku_attr_value_list")
	@ApiField("access_sku_attr_value_dto")
	private List<AccessSkuAttrValueDto> skuAttrValueList;

	/**
	 * source_sku_id，用于商品同步，由调用方传入
	 */
	@ApiField("source_sku_id")
	private String sourceSkuId;

	/**
	 * unit_price，用于商品同步，由调用方传入
	 */
	@ApiField("unit_price")
	private String unitPrice;

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public Boolean getLadderPrice() {
		return this.ladderPrice;
	}
	public void setLadderPrice(Boolean ladderPrice) {
		this.ladderPrice = ladderPrice;
	}

	public List<AccessLadderPriceDto> getLadderPriceList() {
		return this.ladderPriceList;
	}
	public void setLadderPriceList(List<AccessLadderPriceDto> ladderPriceList) {
		this.ladderPriceList = ladderPriceList;
	}

	public String getOriginUnitPrice() {
		return this.originUnitPrice;
	}
	public void setOriginUnitPrice(String originUnitPrice) {
		this.originUnitPrice = originUnitPrice;
	}

	public List<AccessSkuAttrValueDto> getSkuAttrValueList() {
		return this.skuAttrValueList;
	}
	public void setSkuAttrValueList(List<AccessSkuAttrValueDto> skuAttrValueList) {
		this.skuAttrValueList = skuAttrValueList;
	}

	public String getSourceSkuId() {
		return this.sourceSkuId;
	}
	public void setSourceSkuId(String sourceSkuId) {
		this.sourceSkuId = sourceSkuId;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
