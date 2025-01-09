package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品sku信息
 *
 * @author auto create
 * @since 1.0, 2024-04-10 15:18:56
 */
public class ItemSkuDto extends AlipayObject {

	private static final long serialVersionUID = 4181599116976656923L;

	/**
	 * sku条形码信息
	 */
	@ApiField("barcode")
	private String barcode;

	/**
	 * sku原价，单位为分
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 商家侧sku ID，要求 APPID 下全局唯一。
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 商品价格单元
	 */
	@ApiField("price_unit")
	private String priceUnit;

	/**
	 * sku售价，单位为分
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * 商品售卖状态
	 */
	@ApiField("sale_status")
	private String saleStatus;

	/**
	 * 销售属性列表
	 */
	@ApiListField("sku_attrs")
	@ApiField("item_attr_dto")
	private List<ItemAttrDto> skuAttrs;

	/**
	 * sku库存，目前支持库存区间为0-99999
	 */
	@ApiField("stock_num")
	private Long stockNum;

	/**
	 * 商品sku小图
	 */
	@ApiField("thumb_img")
	private String thumbImg;

	public String getBarcode() {
		return this.barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getPriceUnit() {
		return this.priceUnit;
	}
	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public String getSaleStatus() {
		return this.saleStatus;
	}
	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}

	public List<ItemAttrDto> getSkuAttrs() {
		return this.skuAttrs;
	}
	public void setSkuAttrs(List<ItemAttrDto> skuAttrs) {
		this.skuAttrs = skuAttrs;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

	public String getThumbImg() {
		return this.thumbImg;
	}
	public void setThumbImg(String thumbImg) {
		this.thumbImg = thumbImg;
	}

}
