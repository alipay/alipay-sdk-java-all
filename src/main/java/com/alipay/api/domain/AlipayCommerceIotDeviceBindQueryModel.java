package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT设备-商家-店铺绑定查询
 *
 * @author auto create
 * @since 1.0, 2020-12-01 10:32:28
 */
public class AlipayCommerceIotDeviceBindQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6781285537953861822L;

	/**
	 * 应用类型，目前只支持小程序MINI_APP
	 */
	@ApiField("app_type")
	private String appType;

	/**
	 * 应用ID，目前暂不使用，可不填
	 */
	@ApiField("application_id")
	private String applicationId;

	/**
	 * 设备ID：biztid
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 可选项[SN,ID] SN-使用supplier_id、device_sn联合作为设备唯一识别标识 ID-使用biztid作为设备唯一识别标识
	 */
	@ApiField("device_id_type")
	private String deviceIdType;

	/**
	 * 设备序列号：SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 小程序ID，当app_type为MINI_APP时，设置该值； 如意LITE设备，请填写"RUYI_LITE"
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 设备供应商ID：supplierId
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getAppType() {
		return this.appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getApplicationId() {
		return this.applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getDeviceIdType() {
		return this.deviceIdType;
	}
	public void setDeviceIdType(String deviceIdType) {
		this.deviceIdType = deviceIdType;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
