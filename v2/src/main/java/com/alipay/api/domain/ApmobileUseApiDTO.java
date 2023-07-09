package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 端权限检测报告-sdk调用隐私api具体情况DTO
 *
 * @author auto create
 * @since 1.0, 2023-07-03 11:36:29
 */
public class ApmobileUseApiDTO extends AlipayObject {

	private static final long serialVersionUID = 2315138816642668212L;

	/**
	 * 具体api的调用次数
	 */
	@ApiField("api_used_num")
	private Long apiUsedNum;

	/**
	 * 使用apilist
	 */
	@ApiListField("app_used_api_dto_list")
	@ApiField("apmobile_api_detail_d_t_o")
	private List<ApmobileApiDetailDTO> appUsedApiDtoList;

	/**
	 * api名称
	 */
	@ApiField("sdk_api_name")
	private String sdkApiName;

	public Long getApiUsedNum() {
		return this.apiUsedNum;
	}
	public void setApiUsedNum(Long apiUsedNum) {
		this.apiUsedNum = apiUsedNum;
	}

	public List<ApmobileApiDetailDTO> getAppUsedApiDtoList() {
		return this.appUsedApiDtoList;
	}
	public void setAppUsedApiDtoList(List<ApmobileApiDetailDTO> appUsedApiDtoList) {
		this.appUsedApiDtoList = appUsedApiDtoList;
	}

	public String getSdkApiName() {
		return this.sdkApiName;
	}
	public void setSdkApiName(String sdkApiName) {
		this.sdkApiName = sdkApiName;
	}

}
