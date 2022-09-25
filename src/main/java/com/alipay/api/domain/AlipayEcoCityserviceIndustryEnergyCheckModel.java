package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 市民中心绿色能量发放记录查询接口
 *
 * @author auto create
 * @since 1.0, 2022-08-23 10:52:46
 */
public class AlipayEcoCityserviceIndustryEnergyCheckModel extends AlipayObject {

	private static final long serialVersionUID = 3622787767699345739L;

	/**
	 * 绿色能量查询场景，如：社保=social_security，具体值请找相关同学确认
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 支付宝用户uid
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
