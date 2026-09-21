package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付券联合营销发奖接口
 *
 * @author auto create
 * @since 1.0, 2026-09-17 18:47:57
 */
public class AlipayPayAppOperationPromoTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 4178784345422878239L;

	/**
	 * 手机号MD5加密结果
	 */
	@ApiField("app_mobile")
	private String appMobile;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 设备号，设备号类型由device_type字段指定
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备号类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 运营信息，用于串联多阶段营销。
	 */
	@ApiField("pay_operation_info")
	private String payOperationInfo;

	/**
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 触发方式
	 */
	@ApiField("trigger_type")
	private String triggerType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAppMobile() {
		return this.appMobile;
	}
	public void setAppMobile(String appMobile) {
		this.appMobile = appMobile;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPayOperationInfo() {
		return this.payOperationInfo;
	}
	public void setPayOperationInfo(String payOperationInfo) {
		this.payOperationInfo = payOperationInfo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTriggerType() {
		return this.triggerType;
	}
	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
