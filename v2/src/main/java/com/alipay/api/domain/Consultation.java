package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约问诊类
 *
 * @author auto create
 * @since 1.0, 2026-04-10 16:25:12
 */
public class Consultation extends AlipayObject {

	private static final long serialVersionUID = 8797994941285554228L;

	/**
	 * 端类型字段，文本非枚举
	 */
	@ApiField("app_type")
	private String appType;

	/**
	 * 所属业务渠道，文本非枚举类型
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 医生ID
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 供应商问诊履约场景是否可以进行履约字段
	 */
	@ApiField("fulfillable")
	private Boolean fulfillable;

	/**
	 * SAAS履约单ID
	 */
	@ApiField("fulfillment_id")
	private String fulfillmentId;

	/**
	 * 履约状态
	 */
	@ApiField("fulfillment_status")
	private String fulfillmentStatus;

	/**
	 * 外部商品Id
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 患者id
	 */
	@ApiField("patient_id")
	private String patientId;

	/**
	 * 服务项Id
	 */
	@ApiField("service_item_id")
	private String serviceItemId;

	/**
	 * 服务包id
	 */
	@ApiField("service_package_id")
	private String servicePackageId;

	/**
	 * 服务包名称
	 */
	@ApiField("service_package_name")
	private String servicePackageName;

	public String getAppType() {
		return this.appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public Boolean getFulfillable() {
		return this.fulfillable;
	}
	public void setFulfillable(Boolean fulfillable) {
		this.fulfillable = fulfillable;
	}

	public String getFulfillmentId() {
		return this.fulfillmentId;
	}
	public void setFulfillmentId(String fulfillmentId) {
		this.fulfillmentId = fulfillmentId;
	}

	public String getFulfillmentStatus() {
		return this.fulfillmentStatus;
	}
	public void setFulfillmentStatus(String fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getPatientId() {
		return this.patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getServiceItemId() {
		return this.serviceItemId;
	}
	public void setServiceItemId(String serviceItemId) {
		this.serviceItemId = serviceItemId;
	}

	public String getServicePackageId() {
		return this.servicePackageId;
	}
	public void setServicePackageId(String servicePackageId) {
		this.servicePackageId = servicePackageId;
	}

	public String getServicePackageName() {
		return this.servicePackageName;
	}
	public void setServicePackageName(String servicePackageName) {
		this.servicePackageName = servicePackageName;
	}

}
