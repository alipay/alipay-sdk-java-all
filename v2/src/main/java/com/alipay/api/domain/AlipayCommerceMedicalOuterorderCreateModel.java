package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 好大夫合作方履约创建参数透传
 *
 * @author auto create
 * @since 1.0, 2025-11-24 20:27:41
 */
public class AlipayCommerceMedicalOuterorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6128337616655439556L;

	/**
	 * 业务身份
	 */
	@ApiField("biz_identity")
	private String bizIdentity;

	/**
	 * 下发业务类型
	 */
	@ApiField("consult_business")
	private String consultBusiness;

	/**
	 * 好大夫生成的履约单id
	 */
	@ApiField("fulfillment_order_id")
	private String fulfillmentOrderId;

	/**
	 * 好大夫用户user
	 */
	@ApiField("hdf_user")
	private String hdfUser;

	/**
	 * null
	 */
	@ApiListField("medical_record_info_list")
	@ApiField("h_d_f_medical_record_info")
	private List<HDFMedicalRecordInfo> medicalRecordInfoList;

	/**
	 * 一方userid
	 */
	@ApiField("partner_user")
	private String partnerUser;

	/**
	 * 好大夫的患者信息
	 */
	@ApiField("patient_info")
	private HDFPatientInfo patientInfo;

	/**
	 * 信息
	 */
	@ApiField("transer_info")
	private String transerInfo;

	public String getBizIdentity() {
		return this.bizIdentity;
	}
	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}

	public String getConsultBusiness() {
		return this.consultBusiness;
	}
	public void setConsultBusiness(String consultBusiness) {
		this.consultBusiness = consultBusiness;
	}

	public String getFulfillmentOrderId() {
		return this.fulfillmentOrderId;
	}
	public void setFulfillmentOrderId(String fulfillmentOrderId) {
		this.fulfillmentOrderId = fulfillmentOrderId;
	}

	public String getHdfUser() {
		return this.hdfUser;
	}
	public void setHdfUser(String hdfUser) {
		this.hdfUser = hdfUser;
	}

	public List<HDFMedicalRecordInfo> getMedicalRecordInfoList() {
		return this.medicalRecordInfoList;
	}
	public void setMedicalRecordInfoList(List<HDFMedicalRecordInfo> medicalRecordInfoList) {
		this.medicalRecordInfoList = medicalRecordInfoList;
	}

	public String getPartnerUser() {
		return this.partnerUser;
	}
	public void setPartnerUser(String partnerUser) {
		this.partnerUser = partnerUser;
	}

	public HDFPatientInfo getPatientInfo() {
		return this.patientInfo;
	}
	public void setPatientInfo(HDFPatientInfo patientInfo) {
		this.patientInfo = patientInfo;
	}

	public String getTranserInfo() {
		return this.transerInfo;
	}
	public void setTranserInfo(String transerInfo) {
		this.transerInfo = transerInfo;
	}

}
