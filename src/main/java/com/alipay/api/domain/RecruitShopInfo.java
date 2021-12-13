package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商活动信息
 *
 * @author auto create
 * @since 1.0, 2019-06-25 19:48:21
 */
public class RecruitShopInfo extends AlipayObject {

	private static final long serialVersionUID = 7247562188414952676L;

	/**
	 * 已确认还是未确认
	 */
	@ApiField("confirm_status")
	private String confirmStatus;

	/**
	 * 一级和二级类目名称
	 */
	@ApiField("shop_category")
	private String shopCategory;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public String getConfirmStatus() {
		return this.confirmStatus;
	}
	public void setConfirmStatus(String confirmStatus) {
		this.confirmStatus = confirmStatus;
	}

	public String getShopCategory() {
		return this.shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
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
