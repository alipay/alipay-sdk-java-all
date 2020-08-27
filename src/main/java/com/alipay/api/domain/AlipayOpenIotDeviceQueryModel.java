package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT设备-商户绑定查询
 *
 * @author auto create
 * @since 1.0, 2020-06-12 22:52:05
 */
public class AlipayOpenIotDeviceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4169398431256768257L;

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
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 设备供应商ID：supplierId
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 查询类型[MERCHANT,SHOP]，MERCHANT-设备商户绑定关系
	 */
	@ApiField("type")
	private String type;

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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
