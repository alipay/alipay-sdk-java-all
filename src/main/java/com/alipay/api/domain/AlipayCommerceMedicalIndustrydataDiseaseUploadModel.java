package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 疾病信息上传
 *
 * @author auto create
 * @since 1.0, 2022-02-18 09:33:13
 */
public class AlipayCommerceMedicalIndustrydataDiseaseUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7126857249847779268L;

	/**
	 * 疾病信息
	 */
	@ApiListField("disease_list")
	@ApiField("disease_base_data")
	private List<DiseaseBaseData> diseaseList;

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

	public List<DiseaseBaseData> getDiseaseList() {
		return this.diseaseList;
	}
	public void setDiseaseList(List<DiseaseBaseData> diseaseList) {
		this.diseaseList = diseaseList;
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
