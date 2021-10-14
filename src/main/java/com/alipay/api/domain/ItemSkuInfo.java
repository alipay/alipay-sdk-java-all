package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品SKU查询模型
 *
 * @author auto create
 * @since 1.0, 2019-07-31 14:55:03
 */
public class ItemSkuInfo extends AlipayObject {

	private static final long serialVersionUID = 2492297827378874885L;

	/**
	 * 成本价，单位分
	 */
	@ApiField("cost_price")
	private Long costPrice;

	/**
	 * SKU扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("item_ext_info")
	private List<ItemExtInfo> extInfo;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 标价，单位分
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 售价，单位分
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 商品sku id
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 商品SKU状态：EFFECT、INVALID
	 */
	@ApiField("status")
	private String status;

	public Long getCostPrice() {
		return this.costPrice;
	}
	public void setCostPrice(Long costPrice) {
		this.costPrice = costPrice;
	}

	public List<ItemExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<ItemExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
