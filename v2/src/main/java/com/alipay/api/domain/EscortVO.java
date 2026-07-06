package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 陪诊对象
 *
 * @author auto create
 * @since 1.0, 2026-06-26 10:16:55
 */
public class EscortVO extends AlipayObject {

	private static final long serialVersionUID = 8424638156446193342L;

	/**
	 * 履约单号
	 */
	@ApiField("fulfillment_no")
	private String fulfillmentNo;

	/**
	 * 履约状态
	 */
	@ApiField("fulfillment_status")
	private String fulfillmentStatus;

	/**
	 * 履约状态描述
	 */
	@ApiField("fulfillment_status_desc")
	private String fulfillmentStatusDesc;

	/**
	 * 履约类型
	 */
	@ApiField("fulfillment_type")
	private String fulfillmentType;

	/**
	 * 商品编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 患者年龄
	 */
	@ApiField("patient_age")
	private String patientAge;

	/**
	 * 患者性别
	 */
	@ApiField("patient_gender")
	private String patientGender;

	/**
	 * 患者ID
	 */
	@ApiField("patient_id")
	private String patientId;

	/**
	 * 患者姓名
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 患者电话
	 */
	@ApiField("patient_phone")
	private String patientPhone;

	/**
	 * 服务包ID
	 */
	@ApiField("service_package_id")
	private String servicePackageId;

	/**
	 * 服务包名称
	 */
	@ApiField("service_package_name")
	private String servicePackageName;

	public String getFulfillmentNo() {
		return this.fulfillmentNo;
	}
	public void setFulfillmentNo(String fulfillmentNo) {
		this.fulfillmentNo = fulfillmentNo;
	}

	public String getFulfillmentStatus() {
		return this.fulfillmentStatus;
	}
	public void setFulfillmentStatus(String fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
	}

	public String getFulfillmentStatusDesc() {
		return this.fulfillmentStatusDesc;
	}
	public void setFulfillmentStatusDesc(String fulfillmentStatusDesc) {
		this.fulfillmentStatusDesc = fulfillmentStatusDesc;
	}

	public String getFulfillmentType() {
		return this.fulfillmentType;
	}
	public void setFulfillmentType(String fulfillmentType) {
		this.fulfillmentType = fulfillmentType;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getPatientAge() {
		return this.patientAge;
	}
	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientGender() {
		return this.patientGender;
	}
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientId() {
		return this.patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return this.patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientPhone() {
		return this.patientPhone;
	}
	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
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
