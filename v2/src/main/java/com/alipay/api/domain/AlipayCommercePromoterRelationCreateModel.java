package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 导购员关系绑定
 *
 * @author auto create
 * @since 1.0, 2024-09-13 21:14:20
 */
public class AlipayCommercePromoterRelationCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5291783814181198822L;

	/**
	 * 商家id
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 小程序appid
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 导购员id
	 */
	@ApiField("promoter_id")
	private String promoterId;

	/**
	 * 导购员id
	 */
	@ApiField("promoter_open_id")
	private String promoterOpenId;

	/**
	 * 角色为督导员时，需要传入该字段，表示督导员管理的门店列表
	 */
	@ApiListField("related_shop_list")
	@ApiField("string")
	private List<String> relatedShopList;

	/**
	 * 导购员角色
店长 MANAGER
普通导购员 GENERAL
临促员 TEMPORARY
默认值GENERAL
	 */
	@ApiField("role")
	private String role;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 域外店铺id
	 */
	@ApiField("store_id")
	private String storeId;

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPromoterId() {
		return this.promoterId;
	}
	public void setPromoterId(String promoterId) {
		this.promoterId = promoterId;
	}

	public String getPromoterOpenId() {
		return this.promoterOpenId;
	}
	public void setPromoterOpenId(String promoterOpenId) {
		this.promoterOpenId = promoterOpenId;
	}

	public List<String> getRelatedShopList() {
		return this.relatedShopList;
	}
	public void setRelatedShopList(List<String> relatedShopList) {
		this.relatedShopList = relatedShopList;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
