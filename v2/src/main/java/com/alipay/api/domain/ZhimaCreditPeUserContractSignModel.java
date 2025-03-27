package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用受理服务签约
 *
 * @author auto create
 * @since 1.0, 2022-12-15 19:26:51
 */
public class ZhimaCreditPeUserContractSignModel extends AlipayObject {

	private static final long serialVersionUID = 6549449332546558549L;

	/**
	 * 芝麻信用场景，由芝麻信用侧分配，如：天猫信用购，淘宝租赁等
	 */
	@ApiField("credit_scene")
	private String creditScene;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCreditScene() {
		return this.creditScene;
	}
	public void setCreditScene(String creditScene) {
		this.creditScene = creditScene;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
