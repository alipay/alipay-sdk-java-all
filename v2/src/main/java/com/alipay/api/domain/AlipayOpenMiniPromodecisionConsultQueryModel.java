package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品营销活动商详咨询
 *
 * @author auto create
 * @since 1.0, 2024-07-03 14:36:29
 */
public class AlipayOpenMiniPromodecisionConsultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3197266463755156813L;

	/**
	 * 商品信息
	 */
	@ApiField("item_detail_info")
	private ItemDetailInfo itemDetailInfo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部优惠信息
	 */
	@ApiField("out_promo_info")
	private OutPromoInfo outPromoInfo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public ItemDetailInfo getItemDetailInfo() {
		return this.itemDetailInfo;
	}
	public void setItemDetailInfo(ItemDetailInfo itemDetailInfo) {
		this.itemDetailInfo = itemDetailInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public OutPromoInfo getOutPromoInfo() {
		return this.outPromoInfo;
	}
	public void setOutPromoInfo(OutPromoInfo outPromoInfo) {
		this.outPromoInfo = outPromoInfo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
