package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医院科室信息上传接口
 *
 * @author auto create
 * @since 1.0, 2022-05-30 16:33:14
 */
public class AlipayCommerceMedicalIndustrydataDepartmentUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4745592887537285847L;

	/**
	 * 科室数据
	 */
	@ApiListField("department_list")
	@ApiField("department_data")
	private List<DepartmentData> departmentList;

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

	public List<DepartmentData> getDepartmentList() {
		return this.departmentList;
	}
	public void setDepartmentList(List<DepartmentData> departmentList) {
		this.departmentList = departmentList;
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
