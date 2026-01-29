package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * N核身物料解绑
 *
 * @author auto create
 * @since 1.0, 2025-12-31 17:52:42
 */
public class AlipayOfflineProviderNpassporterMaterialDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6153383436236667395L;

	/**
	 * 活动code
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * null
	 */
	@ApiListField("coil_no_list")
	@ApiField("string")
	private List<String> coilNoList;

	/**
	 * 方案配置code
	 */
	@ApiField("solution_code")
	private String solutionCode;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public List<String> getCoilNoList() {
		return this.coilNoList;
	}
	public void setCoilNoList(List<String> coilNoList) {
		this.coilNoList = coilNoList;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

}
