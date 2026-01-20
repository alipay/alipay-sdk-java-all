package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * N核身物料绑定
 *
 * @author auto create
 * @since 1.0, 2026-01-15 15:37:42
 */
public class AlipayOfflineProviderNpassporterMaterialCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7219541469489537912L;

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
	 * 活动解决方案code
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
