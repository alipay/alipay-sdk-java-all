package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析流量分析页面效果列表
 *
 * @author auto create
 * @since 1.0, 2024-09-20 17:32:56
 */
public class AlipayCloudCloudpromoAnalysistrafficPageeffectivelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4119283724615514583L;

	/**
	 * 经营分析、经营概况模块公用入参
	 */
	@ApiField("common_request")
	private OpenApiAnalysisCommonRequest commonRequest;

	/**
	 * 查询单个页面的趋势数据
且需要传入trend==true
	 */
	@ApiField("page_name")
	private String pageName;

	/**
	 * 搭配trend==true时 传入，且必须为MD5转化的值
	 */
	@ApiField("page_url_md5")
	private String pageUrlMd5;

	/**
	 * 此接口在列表数据中，需要查询单个页面或者单个url的趋势时候传入trend=true
	 */
	@ApiField("trend")
	private Boolean trend;

	public OpenApiAnalysisCommonRequest getCommonRequest() {
		return this.commonRequest;
	}
	public void setCommonRequest(OpenApiAnalysisCommonRequest commonRequest) {
		this.commonRequest = commonRequest;
	}

	public String getPageName() {
		return this.pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPageUrlMd5() {
		return this.pageUrlMd5;
	}
	public void setPageUrlMd5(String pageUrlMd5) {
		this.pageUrlMd5 = pageUrlMd5;
	}

	public Boolean getTrend() {
		return this.trend;
	}
	public void setTrend(Boolean trend) {
		this.trend = trend;
	}

}
