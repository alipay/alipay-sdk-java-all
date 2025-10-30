package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AddressBean;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.smdd.shop.base.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 11:22:37
 */
public class AlipayOfflineSmddShopBaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7253129245562629777L;

	/** 
	 * 商品图展示类型，小图（SMALL）/无图（NO_PIC）
	 */
	@ApiField("item_pic_show_type")
	private String itemPicShowType;

	/** 
	 * 有其仅有为 true 时表示设置了必选分类，需要引导用户设置必选分类中的商品
	 */
	@ApiField("required_category")
	private Boolean requiredCategory;

	/** 
	 * 当商家选择了每人一份，用户访问店铺时，需要选择人数，选择人数后，自动添加 x 份商品到购物车。当商家选择每单一份，自动添加该商品到购物车。购物车需要做一些校验
	 */
	@ApiField("required_item_type")
	private String requiredItemType;

	/** 
	 * 店铺地址
	 */
	@ApiField("shop_address")
	private AddressBean shopAddress;

	/** 
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/** 
	 * 店铺公告
	 */
	@ApiField("shop_notice")
	private String shopNotice;

	public void setItemPicShowType(String itemPicShowType) {
		this.itemPicShowType = itemPicShowType;
	}
	public String getItemPicShowType( ) {
		return this.itemPicShowType;
	}

	public void setRequiredCategory(Boolean requiredCategory) {
		this.requiredCategory = requiredCategory;
	}
	public Boolean getRequiredCategory( ) {
		return this.requiredCategory;
	}

	public void setRequiredItemType(String requiredItemType) {
		this.requiredItemType = requiredItemType;
	}
	public String getRequiredItemType( ) {
		return this.requiredItemType;
	}

	public void setShopAddress(AddressBean shopAddress) {
		this.shopAddress = shopAddress;
	}
	public AddressBean getShopAddress( ) {
		return this.shopAddress;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopName( ) {
		return this.shopName;
	}

	public void setShopNotice(String shopNotice) {
		this.shopNotice = shopNotice;
	}
	public String getShopNotice( ) {
		return this.shopNotice;
	}

}
