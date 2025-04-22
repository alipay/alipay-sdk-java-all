package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * sku查询透出VO
 *
 * @author auto create
 * @since 1.0, 2024-11-19 20:14:19
 */
public class ItemSkuSearchVO extends AlipayObject {

	private static final long serialVersionUID = 1659255888532681817L;

	/**
	 * sku条形码
	 */
	@ApiField("barcode")
	private String barcode;

	/**
	 * sku原价，分为单位
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 商家侧sku ID，要求 APPID 下全局唯一。
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * sku价格单位
	 */
	@ApiField("price_unit")
	private String priceUnit;

	/**
	 * sku售价，分为单位
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * sku售卖状态，包含以下两种状态： 已下架(DELISTING) 可售卖(AVAILABLE)
	 */
	@ApiField("sale_status")
	private String saleStatus;

	/**
	 * sku销售属性
	 */
	@ApiListField("sku_attrs")
	@ApiField("item_sku_attr_v_o")
	private List<ItemSkuAttrVO> skuAttrs;

	/**
	 * 支付宝平台侧商品sku的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * sku类型
	 */
	@ApiField("sku_type")
	private String skuType;

	/**
	 * sku库存，目前支持库存区间为0-99999
	 */
	@ApiField("stock_num")
	private Long stockNum;

	/**
	 * 图片url，图片宽高为400px*400px，宽高比1:1。
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

	public List<ItemSkuAttrVO> getSkuAttrs() {
		return this.skuAttrs;
	}
	public void setSkuAttrs(List<ItemSkuAttrVO> skuAttrs) {
		this.skuAttrs = skuAttrs;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSkuType() {
		return this.skuType;
	}
	public void setSkuType(String skuType) {
		this.skuType = skuType;
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
