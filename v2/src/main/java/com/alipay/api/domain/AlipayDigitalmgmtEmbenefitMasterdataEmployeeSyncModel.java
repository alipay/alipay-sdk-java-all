package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 员工信息同步
 *
 * @author auto create
 * @since 1.0, 2026-10-27 10:57:57
 */
public class AlipayDigitalmgmtEmbenefitMasterdataEmployeeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4387219899648752777L;

	/**
	 * 供应商接口标识
	 */
	@ApiField("api_key")
	private String apiKey;

	/**
	 * null
	 */
	@ApiListField("data_list")
	@ApiField("employee_data_item")
	private List<EmployeeDataItem> dataList;

	/**
	 * 教师：TEACHER
学生：STUDENT
	 */
	@ApiField("identity_type")
	private String identityType;

	public String getApiKey() {
		return this.apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public List<EmployeeDataItem> getDataList() {
		return this.dataList;
	}
	public void setDataList(List<EmployeeDataItem> dataList) {
		this.dataList = dataList;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

}
