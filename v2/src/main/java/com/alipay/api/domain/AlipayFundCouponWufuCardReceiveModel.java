package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新春五福福卡领取接口
 *
 * @author auto create
 * @since 1.0, 2019-12-20 16:18:11
 */
public class AlipayFundCouponWufuCardReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 5346978129524338839L;

	/**
	 * 业务流水号，用于数据关联核对，不做为幂等使用。
	 */
	@ApiField("front_biz_no")
	private String frontBizNo;

	/**
	 * 福卡领取场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getFrontBizNo() {
		return this.frontBizNo;
	}
	public void setFrontBizNo(String frontBizNo) {
		this.frontBizNo = frontBizNo;
	}

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
