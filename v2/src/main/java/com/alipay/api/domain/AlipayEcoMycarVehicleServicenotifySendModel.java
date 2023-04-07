package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务通知发送
 *
 * @author auto create
 * @since 1.0, 2022-11-18 21:27:48
 */
public class AlipayEcoMycarVehicleServicenotifySendModel extends AlipayObject {

	private static final long serialVersionUID = 2882183663332796791L;

	/**
	 * 商户业务响应码
	 */
	@ApiField("merchant_status_code")
	private String merchantStatusCode;

	/**
	 * 商户响应码描述
	 */
	@ApiField("merchant_status_desc")
	private String merchantStatusDesc;

	/**
	 * 支付宝用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 服务操作的业务时间戳
	 */
	@ApiField("service_operate_timestamp")
	private String serviceOperateTimestamp;

	/**
	 * 服务状态
	 */
	@ApiField("service_status")
	private String serviceStatus;

	/**
	 * 服务类型
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 当前系统时间戳
	 */
	@ApiField("system_timestamp")
	private String systemTimestamp;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 车企openid
	 */
	@ApiField("vehicle_open_id")
	private String vehicleOpenId;

	/**
	 * 车企token
	 */
	@ApiField("vehicle_token")
	private VehicleToken vehicleToken;

	/**
	 * 车辆id
	 */
	@ApiField("vi_id")
	private String viId;

	public String getMerchantStatusCode() {
		return this.merchantStatusCode;
	}
	public void setMerchantStatusCode(String merchantStatusCode) {
		this.merchantStatusCode = merchantStatusCode;
	}

	public String getMerchantStatusDesc() {
		return this.merchantStatusDesc;
	}
	public void setMerchantStatusDesc(String merchantStatusDesc) {
		this.merchantStatusDesc = merchantStatusDesc;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getServiceOperateTimestamp() {
		return this.serviceOperateTimestamp;
	}
	public void setServiceOperateTimestamp(String serviceOperateTimestamp) {
		this.serviceOperateTimestamp = serviceOperateTimestamp;
	}

	public String getServiceStatus() {
		return this.serviceStatus;
	}
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getSystemTimestamp() {
		return this.systemTimestamp;
	}
	public void setSystemTimestamp(String systemTimestamp) {
		this.systemTimestamp = systemTimestamp;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVehicleOpenId() {
		return this.vehicleOpenId;
	}
	public void setVehicleOpenId(String vehicleOpenId) {
		this.vehicleOpenId = vehicleOpenId;
	}

	public VehicleToken getVehicleToken() {
		return this.vehicleToken;
	}
	public void setVehicleToken(VehicleToken vehicleToken) {
		this.vehicleToken = vehicleToken;
	}

	public String getViId() {
		return this.viId;
	}
	public void setViId(String viId) {
		this.viId = viId;
	}

}
