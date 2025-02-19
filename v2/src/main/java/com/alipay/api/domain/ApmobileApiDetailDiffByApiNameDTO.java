package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 端权限检测报告-sdk使用敏感信息分析实体
 *
 * @author auto create
 * @since 1.0, 2023-07-03 11:35:59
 */
public class ApmobileApiDetailDiffByApiNameDTO extends AlipayObject {

	private static final long serialVersionUID = 2463749677442445661L;

	/**
	 * 敏感信息名称
	 */
	@ApiField("api_name")
	private String apiName;

	/**
	 * 敏感信息类型
	 */
	@ApiField("api_type")
	private String apiType;

	/**
	 * 调用详情
	 */
	@ApiField("app_used_api_dto_list")
	private ApmobileApiDetailDTO appUsedApiDtoList;

	/**
	 * 调用次数
	 */
	@ApiField("count")
	private Long count;

	public String getApiName() {
		return this.apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getApiType() {
		return this.apiType;
	}
	public void setApiType(String apiType) {
		this.apiType = apiType;
	}

	public ApmobileApiDetailDTO getAppUsedApiDtoList() {
		return this.appUsedApiDtoList;
	}
	public void setAppUsedApiDtoList(ApmobileApiDetailDTO appUsedApiDtoList) {
		this.appUsedApiDtoList = appUsedApiDtoList;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

}
