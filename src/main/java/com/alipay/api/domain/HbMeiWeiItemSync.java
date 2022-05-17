package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗美味宝贝同步信息请求
 *
 * @author auto create
 * @since 1.0, 2021-12-01 20:59:09
 */
public class HbMeiWeiItemSync extends AlipayObject {

	private static final long serialVersionUID = 5597329796676731522L;

	/**
	 * 宝贝票面价值,单位为分
	 */
	@ApiField("amount_rights")
	private Long amountRights;

	/**
	 * 宝贝ID
	 */
	@ApiField("biz_item_id")
	private String bizItemId;

	/**
	 * 库存
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * 宝贝售价,单位为分
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 销量
	 */
	@ApiField("sale_count")
	private Long saleCount;

	/**
	 * 宝贝状态，1:上架状态，0:下架状态，默认为0
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 访问量
	 */
	@ApiField("uv_count")
	private Long uvCount;

	public Long getAmountRights() {
		return this.amountRights;
	}
	public void setAmountRights(Long amountRights) {
		this.amountRights = amountRights;
	}

	public String getBizItemId() {
		return this.bizItemId;
	}
	public void setBizItemId(String bizItemId) {
		this.bizItemId = bizItemId;
	}

	public Long getInventory() {
		return this.inventory;
	}
	public void setInventory(Long inventory) {
		this.inventory = inventory;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getSaleCount() {
		return this.saleCount;
	}
	public void setSaleCount(Long saleCount) {
		this.saleCount = saleCount;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getUvCount() {
		return this.uvCount;
	}
	public void setUvCount(Long uvCount) {
		this.uvCount = uvCount;
	}

}
