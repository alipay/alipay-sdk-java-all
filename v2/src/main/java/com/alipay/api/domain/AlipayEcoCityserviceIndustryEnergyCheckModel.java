package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 市民中心绿色能量发放记录查询接口
 *
 * @author auto create
 * @since 1.0, 2024-08-26 16:34:19
 */
public class AlipayEcoCityserviceIndustryEnergyCheckModel extends AlipayObject {

	private static final long serialVersionUID = 1183718961391516766L;

	/**
	 * 服务编码
	 */
	@ApiField("app_code")
	private String appCode;

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

	/**
	 * 支付宝用户uid
	 */
	@ApiField("user_open_id")
	private String userOpenId;

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
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

	public String getUserOpenId() {
		return this.userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

}
