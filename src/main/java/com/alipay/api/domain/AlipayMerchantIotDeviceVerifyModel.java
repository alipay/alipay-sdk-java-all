package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT设备、商户绑定校验
 *
 * @author auto create
 * @since 1.0, 2021-01-12 09:47:02
 */
public class AlipayMerchantIotDeviceVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 5626159342594741268L;

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
	 * 商户类型，直连商户填写direct，间连商户填写indirect
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 直连场景填写商户收单pid，间连场景不填
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 直连场景不填，间连场景填写商户收单smid
	 */
	@ApiField("smid")
	private String smid;

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

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
