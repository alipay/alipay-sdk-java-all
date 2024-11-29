package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品sku
 *
 * @author auto create
 * @since 1.0, 2023-03-31 14:59:02
 */
public class IndustryItemSkuSyncRequest extends AlipayObject {

	private static final long serialVersionUID = 3835313949362949924L;

	/**
	 * sku扩展属性
	 */
	@ApiListField("ext_info")
	@ApiField("ext_info_pair")
	private List<ExtInfoPair> extInfo;

	/**
	 * sku商品原价（划线价）
	 */
	@ApiField("origin_price")
	private String originPrice;

	/**
	 * 商品价格（标价/刊例价）
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品价格类型（件/次/日/年）
	 */
	@ApiField("price_unit")
	private String priceUnit;

	/**
	 * 商品营销玩法信息
	 */
	@ApiListField("promo_infos")
	@ApiField("item_promo_info_sync_request")
	private List<ItemPromoInfoSyncRequest> promoInfos;

	/**
	 * 商品售卖状态，AVAILABLE：上架，DELISTING，下架
	 */
	@ApiField("sell_status")
	private String sellStatus;

	/**
	 * sku的售卖特征，list<kv>类型
	 */
	@ApiListField("sku_attrs")
	@ApiField("ext_info_pair")
	private List<ExtInfoPair> skuAttrs;

	/**
	 * 商户侧skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * sku主图通过alipay.open.file.upload上传得到的fileId
	 */
	@ApiField("sku_image")
	private String skuImage;

	/**
	 * sku商品名称
	 */
	@ApiField("sku_name")
	private String skuName;

	/**
	 * sku商品的库存
	 */
	@ApiField("stock_num")
	private Long stockNum;

	public List<ExtInfoPair> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<ExtInfoPair> extInfo) {
		this.extInfo = extInfo;
	}

	public String getOriginPrice() {
		return this.originPrice;
	}
	public void setOriginPrice(String originPrice) {
		this.originPrice = originPrice;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getPriceUnit() {
		return this.priceUnit;
	}
	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

	public List<ItemPromoInfoSyncRequest> getPromoInfos() {
		return this.promoInfos;
	}
	public void setPromoInfos(List<ItemPromoInfoSyncRequest> promoInfos) {
		this.promoInfos = promoInfos;
	}

	public String getSellStatus() {
		return this.sellStatus;
	}
	public void setSellStatus(String sellStatus) {
		this.sellStatus = sellStatus;
	}

	public List<ExtInfoPair> getSkuAttrs() {
		return this.skuAttrs;
	}
	public void setSkuAttrs(List<ExtInfoPair> skuAttrs) {
		this.skuAttrs = skuAttrs;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSkuImage() {
		return this.skuImage;
	}
	public void setSkuImage(String skuImage) {
		this.skuImage = skuImage;
	}

	public String getSkuName() {
		return this.skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

}
