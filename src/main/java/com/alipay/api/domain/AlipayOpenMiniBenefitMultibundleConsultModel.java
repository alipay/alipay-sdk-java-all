package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 端外权益咨询
 *
 * @author auto create
 * @since 1.0, 2022-05-20 14:50:17
 */
public class AlipayOpenMiniBenefitMultibundleConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2156416416461761266L;

	/**
	 * 业务场景，由支付宝分配
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 权益类目，类目列表请参见文档
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 设备id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 手机号
	 */
	@ApiField("login_mobile_id")
	private String loginMobileId;

	/**
	 * 纬度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 产品id
	 */
	@ApiField("product_id")
	private String productId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLoginMobileId() {
		return this.loginMobileId;
	}
	public void setLoginMobileId(String loginMobileId) {
		this.loginMobileId = loginMobileId;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

}
