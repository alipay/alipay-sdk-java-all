package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医生信息上传接口
 *
 * @author auto create
 * @since 1.0, 2022-02-18 09:19:42
 */
public class AlipayCommerceMedicalIndustrydataDoctorUploadModel extends AlipayObject {

	private static final long serialVersionUID = 2119589228737794587L;

	/**
	 * 医生数据
	 */
	@ApiListField("doctor_list")
	@ApiField("doctor_data")
	private List<DoctorData> doctorList;

	/**
	 * isvpid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 请求id，保证每次请求唯一
	 */
	@ApiField("request_id")
	private String requestId;

	public List<DoctorData> getDoctorList() {
		return this.doctorList;
	}
	public void setDoctorList(List<DoctorData> doctorList) {
		this.doctorList = doctorList;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
