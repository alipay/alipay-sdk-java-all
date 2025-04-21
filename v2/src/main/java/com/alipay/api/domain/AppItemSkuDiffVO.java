package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品sku数据变更比对内容
 *
 * @author auto create
 * @since 1.0, 2023-10-24 14:37:12
 */
public class AppItemSkuDiffVO extends AlipayObject {

	private static final long serialVersionUID = 3591799565165332693L;

	/**
	 * sku条形码
	 */
	@ApiField("bar_code")
	private String barCode;

	/**
	 * sku原价，分为单位
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 商家侧sku ID，APPID维度下全局唯一
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

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
	 * sku信息新增（CREATE），sku信息修改（MODIFY），sku信息删除（DELETE）
	 */
	@ApiField("sku_modify_type")
	private String skuModifyType;

	/**
	 * sku库存，目前支持库存区间为0-99999
	 */
	@ApiField("stock_num")
	private Long stockNum;

	/**
	 * 图片url，宽高为400px*400px，宽高比1:1
	 */
	@ApiField("thumb_img")
	private String thumbImg;

	public String getBarCode() {
		return this.barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
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

	public String getSkuModifyType() {
		return this.skuModifyType;
	}
	public void setSkuModifyType(String skuModifyType) {
		this.skuModifyType = skuModifyType;
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
