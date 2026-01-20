package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户资料
 *
 * @author auto create
 * @since 1.0, 2025-12-15 13:37:41
 */
public class HealthcareData extends AlipayObject {

	private static final long serialVersionUID = 1415872211666435722L;

	/**
	 * null
	 */
	@ApiListField("check_report_list")
	@ApiField("check_report")
	private List<CheckReport> checkReportList;

	/**
	 * null
	 */
	@ApiListField("inpatient_record_list")
	@ApiField("inpatient_record")
	private List<InpatientRecord> inpatientRecordList;

	/**
	 * null
	 */
	@ApiListField("outpatient_prescription_list")
	@ApiField("outpatient_prescription")
	private List<OutpatientPrescription> outpatientPrescriptionList;

	/**
	 * null
	 */
	@ApiListField("outpatient_record_list")
	@ApiField("outpatient_record")
	private List<OutpatientRecord> outpatientRecordList;

	/**
	 * 文件类型 图片:PIC PDF:PDF
	 */
	@ApiField("pic_type")
	private String picType;

	/**
	 * 图片或PDF链接
	 */
	@ApiField("pic_url")
	private String picUrl;

	public List<CheckReport> getCheckReportList() {
		return this.checkReportList;
	}
	public void setCheckReportList(List<CheckReport> checkReportList) {
		this.checkReportList = checkReportList;
	}

	public List<InpatientRecord> getInpatientRecordList() {
		return this.inpatientRecordList;
	}
	public void setInpatientRecordList(List<InpatientRecord> inpatientRecordList) {
		this.inpatientRecordList = inpatientRecordList;
	}

	public List<OutpatientPrescription> getOutpatientPrescriptionList() {
		return this.outpatientPrescriptionList;
	}
	public void setOutpatientPrescriptionList(List<OutpatientPrescription> outpatientPrescriptionList) {
		this.outpatientPrescriptionList = outpatientPrescriptionList;
	}

	public List<OutpatientRecord> getOutpatientRecordList() {
		return this.outpatientRecordList;
	}
	public void setOutpatientRecordList(List<OutpatientRecord> outpatientRecordList) {
		this.outpatientRecordList = outpatientRecordList;
	}

	public String getPicType() {
		return this.picType;
	}
	public void setPicType(String picType) {
		this.picType = picType;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

}
