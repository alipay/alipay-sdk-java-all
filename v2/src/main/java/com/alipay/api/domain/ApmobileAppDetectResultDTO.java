package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * app检测结果实体
 *
 * @author auto create
 * @since 1.0, 2023-07-04 17:26:05
 */
public class ApmobileAppDetectResultDTO extends AlipayObject {

	private static final long serialVersionUID = 3264363634111982437L;

	/**
	 * 检测项详情分析
	 */
	@ApiField("app_permission_report_detail_dto")
	private ApmobileAppPermissionReportDetailDTO appPermissionReportDetailDto;

	/**
	 * 检测报告基本信息
	 */
	@ApiField("app_permission_report_index_dto")
	private ApmobileAppPermissionReportIndexDTO appPermissionReportIndexDto;

	/**
	 * 端权限检测报告-SDK集成使用情况分析DTO
	 */
	@ApiField("app_permission_report_sdk_dto")
	private ApmobileAppPermissionReportSdkDTO appPermissionReportSdkDto;

	/**
	 * 端权限检测报告-敏感api使用分析DTO
	 */
	@ApiField("app_permission_report_sensitive_api_dto")
	private ApmobileAppPermissionReportSensitiveApiDTO appPermissionReportSensitiveApiDto;

	/**
	 * 端权限检测报告-敏感权限使用分析DTO
	 */
	@ApiField("app_permission_report_sensitive_dto")
	private ApmobileAppPermissionReportSensitiveDTO appPermissionReportSensitiveDto;

	/**
	 * 隐私合规检测结果
	 */
	@ApiField("app_permission_report_summary_dto")
	private ApmobileAppPermissionReportSummaryDTO appPermissionReportSummaryDto;

	public ApmobileAppPermissionReportDetailDTO getAppPermissionReportDetailDto() {
		return this.appPermissionReportDetailDto;
	}
	public void setAppPermissionReportDetailDto(ApmobileAppPermissionReportDetailDTO appPermissionReportDetailDto) {
		this.appPermissionReportDetailDto = appPermissionReportDetailDto;
	}

	public ApmobileAppPermissionReportIndexDTO getAppPermissionReportIndexDto() {
		return this.appPermissionReportIndexDto;
	}
	public void setAppPermissionReportIndexDto(ApmobileAppPermissionReportIndexDTO appPermissionReportIndexDto) {
		this.appPermissionReportIndexDto = appPermissionReportIndexDto;
	}

	public ApmobileAppPermissionReportSdkDTO getAppPermissionReportSdkDto() {
		return this.appPermissionReportSdkDto;
	}
	public void setAppPermissionReportSdkDto(ApmobileAppPermissionReportSdkDTO appPermissionReportSdkDto) {
		this.appPermissionReportSdkDto = appPermissionReportSdkDto;
	}

	public ApmobileAppPermissionReportSensitiveApiDTO getAppPermissionReportSensitiveApiDto() {
		return this.appPermissionReportSensitiveApiDto;
	}
	public void setAppPermissionReportSensitiveApiDto(ApmobileAppPermissionReportSensitiveApiDTO appPermissionReportSensitiveApiDto) {
		this.appPermissionReportSensitiveApiDto = appPermissionReportSensitiveApiDto;
	}

	public ApmobileAppPermissionReportSensitiveDTO getAppPermissionReportSensitiveDto() {
		return this.appPermissionReportSensitiveDto;
	}
	public void setAppPermissionReportSensitiveDto(ApmobileAppPermissionReportSensitiveDTO appPermissionReportSensitiveDto) {
		this.appPermissionReportSensitiveDto = appPermissionReportSensitiveDto;
	}

	public ApmobileAppPermissionReportSummaryDTO getAppPermissionReportSummaryDto() {
		return this.appPermissionReportSummaryDto;
	}
	public void setAppPermissionReportSummaryDto(ApmobileAppPermissionReportSummaryDTO appPermissionReportSummaryDto) {
		this.appPermissionReportSummaryDto = appPermissionReportSummaryDto;
	}

}
