package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MedicalHospInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.medicalcare.hospital.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-17 22:53:33
 */
public class AlipayEcoMedicalcareHospitalQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3381392886684958315L;

	/** 
	 * 医院信息列表,hos_code为医院唯一标识,该列表中的记录为入参所属时间段内发生变化(或新增)的所有医院数据
	 */
	@ApiListField("hospitallist")
	@ApiField("medical_hosp_info")
	private List<MedicalHospInfo> hospitallist;

	public void setHospitallist(List<MedicalHospInfo> hospitallist) {
		this.hospitallist = hospitallist;
	}
	public List<MedicalHospInfo> getHospitallist( ) {
		return this.hospitallist;
	}

}
