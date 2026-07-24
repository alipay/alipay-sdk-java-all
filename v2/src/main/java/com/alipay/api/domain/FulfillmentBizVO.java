package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 履约数据VO
 *
 * @author auto create
 * @since 1.0, 2026-07-17 11:22:51
 */
public class FulfillmentBizVO extends AlipayObject {

	private static final long serialVersionUID = 2383877576791726989L;

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
	 * 商品信息列表
	 */
	@ApiListField("items")
	@ApiField("examination_item_v_o")
	private List<ExaminationItemVO> items;

	/**
	 * 就诊人信息
	 */
	@ApiListField("patient_infos")
	@ApiField("fulfillment_biz_patient_info")
	private List<FulfillmentBizPatientInfo> patientInfos;

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

	public List<ExaminationItemVO> getItems() {
		return this.items;
	}
	public void setItems(List<ExaminationItemVO> items) {
		this.items = items;
	}

	public List<FulfillmentBizPatientInfo> getPatientInfos() {
		return this.patientInfos;
	}
	public void setPatientInfos(List<FulfillmentBizPatientInfo> patientInfos) {
		this.patientInfos = patientInfos;
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
