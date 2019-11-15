package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新春五福福卡查询接口
 *
 * @author auto create
 * @since 1.0, 2018-12-28 19:49:49
 */
public class AlipayFundCouponWufuCardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5847563831129955733L;

	/**
	 * 业务场景码
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
