package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 五福AI年画查询
 *
 * @author auto create
 * @since 1.0, 2023-01-05 16:12:16
 */
public class AlipayFundCouponWufuAipictureQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8483954171498418354L;

	/**
	 * 蚂蚁统一开放id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 场景码，由支付宝侧生成
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
