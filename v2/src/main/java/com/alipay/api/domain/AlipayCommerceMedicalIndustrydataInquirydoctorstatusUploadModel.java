package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 专家问诊医生状态实时同步接口
 *
 * @author auto create
 * @since 1.0, 2025-04-23 14:17:51
 */
public class AlipayCommerceMedicalIndustrydataInquirydoctorstatusUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3299687582524381762L;

	/**
	 * 医生问诊状态信息列表
	 */
	@ApiListField("doctor_status_list")
	@ApiField("inquery_doctor_status_data")
	private List<InqueryDoctorStatusData> doctorStatusList;

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

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

}
