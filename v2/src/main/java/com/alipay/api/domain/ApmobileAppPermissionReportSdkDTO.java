package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 端权限检测报告-SDK集成使用情况分析DTO
 *
 * @author auto create
 * @since 1.0, 2023-07-04 14:09:35
 */
public class ApmobileAppPermissionReportSdkDTO extends AlipayObject {

	private static final long serialVersionUID = 3191293273152788957L;

	/**
	 * 集成SDK调用信息和权限详情
	 */
	@ApiListField("sdk_list")
	@ApiField("apmobile_sdk_d_t_o")
	private List<ApmobileSdkDTO> sdkList;

	/**
	 * 所调用的SDK总数
	 */
	@ApiField("sdk_sum")
	private Long sdkSum;

	/**
	 * 使用权限的SDK数量
	 */
	@ApiField("sdk_used")
	private Long sdkUsed;

	public List<ApmobileSdkDTO> getSdkList() {
		return this.sdkList;
	}
	public void setSdkList(List<ApmobileSdkDTO> sdkList) {
		this.sdkList = sdkList;
	}

	public Long getSdkSum() {
		return this.sdkSum;
	}
	public void setSdkSum(Long sdkSum) {
		this.sdkSum = sdkSum;
	}

	public Long getSdkUsed() {
		return this.sdkUsed;
	}
	public void setSdkUsed(Long sdkUsed) {
		this.sdkUsed = sdkUsed;
	}

}
