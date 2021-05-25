package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜谱查询
 *
 * @author auto create
 * @since 1.0, 2020-09-08 17:19:50
 */
public class KoubeiCateringDishCookQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1631488478687859492L;

	/**
	 * 菜谱id
	 */
	@ApiField("cook_id")
	private String cookId;

	/**
	 * 菜谱状态
	 */
	@ApiField("cook_status")
	private String cookStatus;

	/**
	 * 菜谱中菜品的分类id
	 */
	@ApiField("detail_catetory_big_id")
	private String detailCatetoryBigId;

	/**
	 * 菜谱中菜品分类小类id
	 */
	@ApiField("detail_catetory_small_id")
	private String detailCatetorySmallId;

	/**
	 * 菜谱中菜品的状态
	 */
	@ApiField("detail_status")
	private String detailStatus;

	/**
	 * 菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 商户的支付宝user_id. 商户授权后,isv能获得
	 */
	@ApiField("merchant_id")
	private String merchantId;

	public String getCookId() {
		return this.cookId;
	}
	public void setCookId(String cookId) {
		this.cookId = cookId;
	}

	public String getCookStatus() {
		return this.cookStatus;
	}
	public void setCookStatus(String cookStatus) {
		this.cookStatus = cookStatus;
	}

	public String getDetailCatetoryBigId() {
		return this.detailCatetoryBigId;
	}
	public void setDetailCatetoryBigId(String detailCatetoryBigId) {
		this.detailCatetoryBigId = detailCatetoryBigId;
	}

	public String getDetailCatetorySmallId() {
		return this.detailCatetorySmallId;
	}
	public void setDetailCatetorySmallId(String detailCatetorySmallId) {
		this.detailCatetorySmallId = detailCatetorySmallId;
	}

	public String getDetailStatus() {
		return this.detailStatus;
	}
	public void setDetailStatus(String detailStatus) {
		this.detailStatus = detailStatus;
	}

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
