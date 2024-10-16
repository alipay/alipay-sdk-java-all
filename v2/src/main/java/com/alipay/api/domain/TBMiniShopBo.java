package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 淘宝轻店铺信息
 *
 * @author auto create
 * @since 1.0, 2018-11-22 10:43:59
 */
public class TBMiniShopBo extends AlipayObject {

	private static final long serialVersionUID = 5579216868222783957L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * json 字符串
	 */
	@ApiField("attribute")
	private String attribute;

	/**
	 * 优惠券信息
	 */
	@ApiListField("coupons")
	@ApiField("item_bo")
	private List<ItemBo> coupons;

	/**
	 * 商品信息
	 */
	@ApiListField("items")
	@ApiField("item_bo")
	private List<ItemBo> items;

	/**
	 * 门店图片url
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 轻店铺id
	 */
	@ApiField("mini_shop_id")
	private String miniShopId;

	/**
	 * 主店名
	 */
	@ApiField("shop_head_name")
	private String shopHeadName;

	/**
	 * 口碑店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺名
	 */
	@ApiField("shop_name")
	private String shopName;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAttribute() {
		return this.attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public List<ItemBo> getCoupons() {
		return this.coupons;
	}
	public void setCoupons(List<ItemBo> coupons) {
		this.coupons = coupons;
	}

	public List<ItemBo> getItems() {
		return this.items;
	}
	public void setItems(List<ItemBo> items) {
		this.items = items;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getMiniShopId() {
		return this.miniShopId;
	}
	public void setMiniShopId(String miniShopId) {
		this.miniShopId = miniShopId;
	}

	public String getShopHeadName() {
		return this.shopHeadName;
	}
	public void setShopHeadName(String shopHeadName) {
		this.shopHeadName = shopHeadName;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
