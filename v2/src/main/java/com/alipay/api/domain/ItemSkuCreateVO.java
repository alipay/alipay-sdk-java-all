package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建商品时使用当前sku对象进行传参
 *
 * @author auto create
 * @since 1.0, 2023-06-27 10:38:54
 */
public class ItemSkuCreateVO extends AlipayObject {

	private static final long serialVersionUID = 5559763549246697937L;

	/**
	 * sku条形码信息
	 */
	@ApiField("barcode")
	private String barcode;

	/**
	 * sku原价，分为单位。
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
	 * sku售价，分为单位
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * sku售卖状态，包含以下两种状态： 已下架(DELISTING) 可售卖(AVAILABLE)
	 */
	@ApiField("sale_status")
	private String saleStatus;

	/**
	 * 销售属性列表
	 */
	@ApiListField("sku_attrs")
	@ApiField("item_sku_attr_v_o")
	private List<ItemSkuAttrVO> skuAttrs;

	/**
	 * sku库存，目前支持库存区间为0-99999
	 */
	@ApiField("stock_num")
	private String stockNum;

	/**
	 * sku小图。图片宽高为400px*400px，宽高比1:1。
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

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getSaleStatus() {
		return this.saleStatus;
	}
	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}

	public List<ItemSkuAttrVO> getSkuAttrs() {
		return this.skuAttrs;
	}
	public void setSkuAttrs(List<ItemSkuAttrVO> skuAttrs) {
		this.skuAttrs = skuAttrs;
	}

	public String getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(String stockNum) {
		this.stockNum = stockNum;
	}

	public String getThumbImg() {
		return this.thumbImg;
	}
	public void setThumbImg(String thumbImg) {
		this.thumbImg = thumbImg;
	}

}
