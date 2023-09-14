package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设备绑定
 *
 * @author auto create
 * @since 1.0, 2021-12-21 11:24:25
 */
public class AlipayCommerceIotMdeviceprodDeviceBindModel extends AlipayObject {

	private static final long serialVersionUID = 1844911579442473691L;

	/**
	 * 设备唯一标识，设备id;identity_type='ID'时必填
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 设备SN，与supplier_id配合作为设备识别的唯一标识;identity_type='SN'时必填
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 绑定扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 可选项[SN,ID]
SN-使用device_sn、supplier_id联合作为设备唯一识别标识
ID-使用biz_tid作为设备唯一识别标识
	 */
	@ApiField("identify_type")
	private String identifyType;

	/**
	 * 绑定关系
	 */
	@ApiListField("principal")
	@ApiField("iot_device_principal")
	private List<IotDevicePrincipal> principal;

	/**
	 * 设备供应商id，与device_sn配合作为设备识别唯一标识;identity_type='SN'时必填
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getIdentifyType() {
		return this.identifyType;
	}
	public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}

	public List<IotDevicePrincipal> getPrincipal() {
		return this.principal;
	}
	public void setPrincipal(List<IotDevicePrincipal> principal) {
		this.principal = principal;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
