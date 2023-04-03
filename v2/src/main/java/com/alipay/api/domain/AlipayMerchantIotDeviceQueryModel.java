package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT设备、商户查询接口
 *
 * @author auto create
 * @since 1.0, 2020-11-19 16:02:32
 */
public class AlipayMerchantIotDeviceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4485591184659954835L;

	/**
	 * 设备 ID ，device_id_type 为 ID 时填写。
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 可选方式 [ID,SN]。ID-使用biztid作为设备唯一识别标识；SN-使用supplier_id、device_sn联合作为设备唯一识别标识。由于不同机型的supplier_id不同，推荐使用 ID 。
	 */
	@ApiField("device_id_type")
	private String deviceIdType;

	/**
	 * 设备序列号 ，device_id_type 为 SN 时填写。需配合supplier_id使用。
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 设备供应商ID ，device_id_type 为 SN 时填写。需注意不同机型的供应商ID可能不同。
	 */
	@ApiField("supplier_id")
	private String supplierId;

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

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
