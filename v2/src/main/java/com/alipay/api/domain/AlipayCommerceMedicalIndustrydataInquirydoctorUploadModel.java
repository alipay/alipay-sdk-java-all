package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 专家问诊医生数据同步接口
 *
 * @author auto create
 * @since 1.0, 2024-08-01 17:07:50
 */
public class AlipayCommerceMedicalIndustrydataInquirydoctorUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7858755313283571888L;

	/**
	 * 医生信息列表
	 */
	@ApiListField("doctor_list")
	@ApiField("inquery_doctor_data")
	private List<InqueryDoctorData> doctorList;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 医生执业问诊平台编码，有新方向会新增，数量不固定
	 */
	@ApiField("platform_code")
	private String platformCode;

	public List<InqueryDoctorData> getDoctorList() {
		return this.doctorList;
	}
	public void setDoctorList(List<InqueryDoctorData> doctorList) {
		this.doctorList = doctorList;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

}
