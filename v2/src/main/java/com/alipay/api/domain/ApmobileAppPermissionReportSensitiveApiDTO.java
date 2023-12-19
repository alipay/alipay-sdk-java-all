package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 端权限检测报告-敏感api使用分析DTO
 *
 * @author auto create
 * @since 1.0, 2023-07-03 17:06:47
 */
public class ApmobileAppPermissionReportSensitiveApiDTO extends AlipayObject {

	private static final long serialVersionUID = 1761845866464629399L;

	/**
	 * 端权限检测报告-sdk调用隐私api具体情况DTO
	 */
	@ApiListField("api_used_list")
	@ApiField("apmobile_use_api_d_t_o")
	private List<ApmobileUseApiDTO> apiUsedList;

	/**
	 * 端权限检测报告-敏感信息使用总览DTO
	 */
	@ApiListField("api_used_overview_list")
	@ApiField("apmobile_app_api_used_overview_d_t_o")
	private List<ApmobileAppApiUsedOverviewDTO> apiUsedOverviewList;

	/**
	 * 敏感api调用总数
	 */
	@ApiField("api_used_total")
	private Long apiUsedTotal;

	public List<ApmobileUseApiDTO> getApiUsedList() {
		return this.apiUsedList;
	}
	public void setApiUsedList(List<ApmobileUseApiDTO> apiUsedList) {
		this.apiUsedList = apiUsedList;
	}

	public List<ApmobileAppApiUsedOverviewDTO> getApiUsedOverviewList() {
		return this.apiUsedOverviewList;
	}
	public void setApiUsedOverviewList(List<ApmobileAppApiUsedOverviewDTO> apiUsedOverviewList) {
		this.apiUsedOverviewList = apiUsedOverviewList;
	}

	public Long getApiUsedTotal() {
		return this.apiUsedTotal;
	}
	public void setApiUsedTotal(Long apiUsedTotal) {
		this.apiUsedTotal = apiUsedTotal;
	}

}
