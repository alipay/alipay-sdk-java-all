package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校验领取权益资格
 *
 * @author auto create
 * @since 1.0, 2023-07-14 10:47:29
 */
public class AlipayOverseasTravelRatePromotionVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 1153733312887874221L;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_param")
	private String extendParam;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 跨境游发现平台优惠id
	 */
	@ApiField("travel_promotion_id")
	private String travelPromotionId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getExtendParam() {
		return this.extendParam;
	}
	public void setExtendParam(String extendParam) {
		this.extendParam = extendParam;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTravelPromotionId() {
		return this.travelPromotionId;
	}
	public void setTravelPromotionId(String travelPromotionId) {
		this.travelPromotionId = travelPromotionId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
