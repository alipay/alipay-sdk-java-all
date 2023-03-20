package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序商品SKU
 *
 * @author auto create
 * @since 1.0, 2023-03-16 15:31:22
 */
public class AppItemSku extends AlipayObject {

	private static final long serialVersionUID = 3146539678112833544L;

	/**
	 * sku条形码信息，应用于扫一扫场景。
	 */
	@ApiField("barcode_info")
	private BarcodeInfo barcodeInfo;

	/**
	 * sku小图。如果数据保存操作（创建/更新），此字段为文件id（例如A*pHfaSaEsF_0AAAAAAAAAAAAAATcnAQ）。否则（数据读取操作）为图片url（例如https://mdn.alipayobjects.com/openpt_appstore/afts/img/A*pHfaSaEsF_0AAAAAAAAAAAAAATcnAQ/original）
	 */
	@ApiField("image")
	private String image;

	/**
	 * sku原价，分为单位。
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 支付宝平台侧商品sku ID
	 */
	@ApiField("platform_sku_id")
	private String platformSkuId;

	/**
	 * sku价格，分为单位
	 */
	@ApiField("price")
	private Long price;

	/**
	 * sku售卖状态，包含以下两种状态：
已下架(DELISTING)
 可售卖(AVAILABLE)
	 */
	@ApiField("sell_status")
	private String sellStatus;

	/**
	 * 销售属性
	 */
	@ApiListField("sku_attrs")
	@ApiField("app_item_attr")
	private List<AppItemAttr> skuAttrs;

	/**
	 * 商家侧商品sku ID，要求 APPID 下全局唯一。
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * sku库存
	 */
	@ApiField("stock_num")
	private Long stockNum;

	public BarcodeInfo getBarcodeInfo() {
		return this.barcodeInfo;
	}
	public void setBarcodeInfo(BarcodeInfo barcodeInfo) {
		this.barcodeInfo = barcodeInfo;
	}

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getPlatformSkuId() {
		return this.platformSkuId;
	}
	public void setPlatformSkuId(String platformSkuId) {
		this.platformSkuId = platformSkuId;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public String getSellStatus() {
		return this.sellStatus;
	}
	public void setSellStatus(String sellStatus) {
		this.sellStatus = sellStatus;
	}

	public List<AppItemAttr> getSkuAttrs() {
		return this.skuAttrs;
	}
	public void setSkuAttrs(List<AppItemAttr> skuAttrs) {
		this.skuAttrs = skuAttrs;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

}
