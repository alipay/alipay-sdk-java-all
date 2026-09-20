package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 专家问诊医生状态实时同步接口
 *
 * @author auto create
 * @since 1.0, 2026-08-25 10:10:23
 */
public class AlipayCommerceMedicalIndustrydataInquirydoctorstatusUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5315669758635828174L;

	/**
	 * 医生问诊状态信息列表
	 */
	@ApiListField("doctor_status_list")
	@ApiField("inquery_doctor_status_data")
	private List<InqueryDoctorStatusData> doctorStatusList;

	/**
	 * 服务商编码
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 问诊平台编码
	 */
	@ApiField("platform_code")
	private String platformCode;

	public List<InqueryDoctorStatusData> getDoctorStatusList() {
		return this.doctorStatusList;
	}
	public void setDoctorStatusList(List<InqueryDoctorStatusData> doctorStatusList) {
		this.doctorStatusList = doctorStatusList;
	}

	public String getIsvCode() {
		return this.isvCode;
	}
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

}
