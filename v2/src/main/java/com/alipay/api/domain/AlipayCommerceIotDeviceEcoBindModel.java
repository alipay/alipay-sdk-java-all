package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生态设备绑定
 *
 * @author auto create
 * @since 1.0, 2025-08-27 10:50:57
 */
public class AlipayCommerceIotDeviceEcoBindModel extends AlipayObject {

	private static final long serialVersionUID = 8325812354315427962L;

	/**
	 * 绑定类型，可选项[SUB_MERCHANT,DIRECT_MERCHANT]
	 */
	@ApiField("bind_type")
	private String bindType;

	/**
	 * 绑定用户id
	 */
	@ApiField("bind_user_id")
	private String bindUserId;

	/**
	 * 设备唯一标识，设备id;identity_type='ID'时必填
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 可选项[SN,ID]
SN-使用device_sn、supplier_id联合作为设备唯一识别标识
ID-使用biz_tid作为设备唯一识别标识
	 */
	@ApiField("identify_type")
	private String identifyType;

	/**
	 * 收钱码SN，按需写入
	 */
	@ApiField("paycode_sn")
	private String paycodeSn;

	/**
	 * 设备sn，与supplier_id配合作为设备识别的唯一标识;identity_type='SN'时必填
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 设备供应商id，与sn配合作为设备识别唯一标识;identity_type='SN'时必填
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getBindType() {
		return this.bindType;
	}
	public void setBindType(String bindType) {
		this.bindType = bindType;
	}

	public String getBindUserId() {
		return this.bindUserId;
	}
	public void setBindUserId(String bindUserId) {
		this.bindUserId = bindUserId;
	}

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getIdentifyType() {
		return this.identifyType;
	}
	public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}

	public String getPaycodeSn() {
		return this.paycodeSn;
	}
	public void setPaycodeSn(String paycodeSn) {
		this.paycodeSn = paycodeSn;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
