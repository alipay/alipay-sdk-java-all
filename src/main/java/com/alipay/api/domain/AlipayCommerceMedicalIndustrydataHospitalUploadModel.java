package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗行业医院数据上传接口
 *
 * @author auto create
 * @since 1.0, 2022-05-30 16:33:32
 */
public class AlipayCommerceMedicalIndustrydataHospitalUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7467179271474934975L;

	/**
	 * 医院信息
	 */
	@ApiListField("hospital_list")
	@ApiField("hospital_data")
	private List<HospitalData> hospitalList;

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

	public List<HospitalData> getHospitalList() {
		return this.hospitalList;
	}
	public void setHospitalList(List<HospitalData> hospitalList) {
		this.hospitalList = hospitalList;
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
