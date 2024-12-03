package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益发放
 *
 * @author auto create
 * @since 1.0, 2024-08-09 16:35:52
 */
public class AlipayCommerceTransportVehownerbaseBenefitTakeModel extends AlipayObject {

	private static final long serialVersionUID = 4154559677178383924L;

	/**
	 * 城市编码，用于判断城市过滤规则。例如330310等，非固定值，由业务运营圈定权益参加范围。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 权益组件集
	 */
	@ApiField("components")
	private BenefitActionComponents components;

	/**
	 * 设备信息
	 */
	@ApiField("device_info")
	private BenefitDeviceInfo deviceInfo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 权益方案标识，指定业务场景，从运营业务方获取
	 */
	@ApiField("operation_param_identify")
	private String operationParamIdentify;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public BenefitActionComponents getComponents() {
		return this.components;
	}
	public void setComponents(BenefitActionComponents components) {
		this.components = components;
	}

	public BenefitDeviceInfo getDeviceInfo() {
		return this.deviceInfo;
	}
	public void setDeviceInfo(BenefitDeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperationParamIdentify() {
		return this.operationParamIdentify;
	}
	public void setOperationParamIdentify(String operationParamIdentify) {
		this.operationParamIdentify = operationParamIdentify;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
