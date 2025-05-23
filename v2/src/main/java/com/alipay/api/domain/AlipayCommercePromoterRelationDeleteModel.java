package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 导购员关系解绑
 *
 * @author auto create
 * @since 1.0, 2024-09-13 21:15:18
 */
public class AlipayCommercePromoterRelationDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7123921275669615665L;

	/**
	 * 角色类型，如店长、督导员、导购员
	 */
	@ApiField("delete_role")
	private String deleteRole;

	/**
	 * 商家id
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

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
	 * 关联店铺id
	 */
	@ApiListField("related_shop_list")
	@ApiField("string")
	private List<String> relatedShopList;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getDeleteRole() {
		return this.deleteRole;
	}
	public void setDeleteRole(String deleteRole) {
		this.deleteRole = deleteRole;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
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

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
