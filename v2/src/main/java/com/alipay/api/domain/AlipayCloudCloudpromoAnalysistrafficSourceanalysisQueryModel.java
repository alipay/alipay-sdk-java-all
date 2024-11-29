package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 经营分析流量分析流量来源分析
 *
 * @author auto create
 * @since 1.0, 2024-09-20 17:33:05
 */
public class AlipayCloudCloudpromoAnalysistrafficSourceanalysisQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4372669967184875615L;

	/**
	 * 经营分析、经营概况模块公用入参
	 */
	@ApiField("common_request")
	private OpenApiAnalysisCommonRequest commonRequest;

	/**
	 * 此接口必须与参数trend同时使用，且trend 为true的时候
	 */
	@ApiListField("first_source_type")
	@ApiField("string")
	private List<String> firstSourceType;

	/**
	 * 此接口必须搭配 trend==true的时候传入，如果没有可以省略
	 */
	@ApiListField("second_source_type")
	@ApiField("string")
	private List<String> secondSourceType;

	/**
	 * 默认不传为false，需要查询趋势图 为true，在此接口需要搭配 一级、二级来源渠道入参使用
	 */
	@ApiField("trend")
	private Boolean trend;

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

	public Boolean getTrend() {
		return this.trend;
	}
	public void setTrend(Boolean trend) {
		this.trend = trend;
	}

}
