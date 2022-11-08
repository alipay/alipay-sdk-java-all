package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个商品
 *
 * @author auto create
 * @since 1.0, 2022-08-18 16:59:11
 */
public class Singltem extends AlipayObject {

	private static final long serialVersionUID = 8732629589372524932L;

	/**
	 * 外部商品ID
	 */
	@ApiField("biz_item_id")
	private String bizItemId;

	/**
	 * 商品品牌
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 商品有效期结束
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 商品的有效期开始
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * https://XX/zos/XX/zVDYRQDMoJaeJteGZtwx.png
	 */
	@ApiField("item_redirect_url")
	private String itemRedirectUrl;

	/**
	 * 商品展示图片链接
	 */
	@ApiField("item_url")
	private String itemUrl;

	/**
	 * 商品原价（单位：分）
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 售价（单位：分）
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 商品当前剩余库存，用于通知花呗测商品已售罄
	 */
	@ApiField("remain_stock")
	private Long remainStock;

	/**
	 * 商品的总库存，用于展示“限量xx个”
	 */
	@ApiField("total_stock")
	private Long totalStock;

	public String getBizItemId() {
		return this.bizItemId;
	}
	public void setBizItemId(String bizItemId) {
		this.bizItemId = bizItemId;
	}

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Date getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemRedirectUrl() {
		return this.itemRedirectUrl;
	}
	public void setItemRedirectUrl(String itemRedirectUrl) {
		this.itemRedirectUrl = itemRedirectUrl;
	}

	public String getItemUrl() {
		return this.itemUrl;
	}
	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getRemainStock() {
		return this.remainStock;
	}
	public void setRemainStock(Long remainStock) {
		this.remainStock = remainStock;
	}

	public Long getTotalStock() {
		return this.totalStock;
	}
	public void setTotalStock(Long totalStock) {
		this.totalStock = totalStock;
	}

}
