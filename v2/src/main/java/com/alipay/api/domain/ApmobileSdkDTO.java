package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 端权限检测报告-集成SDK调用信息和权限详情DTO
 *
 * @author auto create
 * @since 1.0, 2023-07-03 17:06:19
 */
public class ApmobileSdkDTO extends AlipayObject {

	private static final long serialVersionUID = 1565764526625336444L;

	/**
	 * 隐私api调用次数
	 */
	@ApiField("api_used_num")
	private Long apiUsedNum;

	/**
	 * 端权限检测报告-sdk使用敏感信息分析实体
	 */
	@ApiField("sdk_api_used_diff_by_api_list")
	private ApmobileApiDetailDiffByApiNameDTO sdkApiUsedDiffByApiList;

	/**
	 * SDK名称
	 */
	@ApiField("sdk_name")
	private String sdkName;

	/**
	 * SDK描述
	 */
	@ApiField("sdk_summary")
	private String sdkSummary;

	/**
	 * 端权限检测报告-SDK调用权限DTO
	 */
	@ApiListField("sdk_used_list")
	@ApiField("apmobile_sdk_used_d_t_o")
	private List<ApmobileSdkUsedDTO> sdkUsedList;

	public Long getApiUsedNum() {
		return this.apiUsedNum;
	}
	public void setApiUsedNum(Long apiUsedNum) {
		this.apiUsedNum = apiUsedNum;
	}

	public ApmobileApiDetailDiffByApiNameDTO getSdkApiUsedDiffByApiList() {
		return this.sdkApiUsedDiffByApiList;
	}
	public void setSdkApiUsedDiffByApiList(ApmobileApiDetailDiffByApiNameDTO sdkApiUsedDiffByApiList) {
		this.sdkApiUsedDiffByApiList = sdkApiUsedDiffByApiList;
	}

	public String getSdkName() {
		return this.sdkName;
	}
	public void setSdkName(String sdkName) {
		this.sdkName = sdkName;
	}

	public String getSdkSummary() {
		return this.sdkSummary;
	}
	public void setSdkSummary(String sdkSummary) {
		this.sdkSummary = sdkSummary;
	}

	public List<ApmobileSdkUsedDTO> getSdkUsedList() {
		return this.sdkUsedList;
	}
	public void setSdkUsedList(List<ApmobileSdkUsedDTO> sdkUsedList) {
		this.sdkUsedList = sdkUsedList;
	}

}
