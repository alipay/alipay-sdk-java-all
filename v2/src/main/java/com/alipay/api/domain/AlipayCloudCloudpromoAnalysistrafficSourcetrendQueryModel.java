package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 经营分析流量分析流量来源趋势
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:50
 */
public class AlipayCloudCloudpromoAnalysistrafficSourcetrendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5516886466973658862L;

	/**
	 * 经营分析、经营概况模块公用入参
	 */
	@ApiField("common_request")
	private OpenApiAnalysisCommonRequest commonRequest;

	/**
	 * 一级来源渠道
	 */
	@ApiListField("first_source_type")
	@ApiField("string")
	private List<String> firstSourceType;

	/**
	 * 二级来源渠道
	 */
	@ApiListField("second_source_type")
	@ApiField("string")
	private List<String> secondSourceType;

	public OpenApiAnalysisCommonRequest getCommonRequest() {
		return this.commonRequest;
	}
	public void setCommonRequest(OpenApiAnalysisCommonRequest commonRequest) {
		this.commonRequest = commonRequest;
	}

	public List<String> getFirstSourceType() {
		return this.firstSourceType;
	}
	public void setFirstSourceType(List<String> firstSourceType) {
		this.firstSourceType = firstSourceType;
	}

	public List<String> getSecondSourceType() {
		return this.secondSourceType;
	}
	public void setSecondSourceType(List<String> secondSourceType) {
		this.secondSourceType = secondSourceType;
	}

}
