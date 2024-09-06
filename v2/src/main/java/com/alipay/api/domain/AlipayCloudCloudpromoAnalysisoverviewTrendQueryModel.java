package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营概况总览趋势
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:57
 */
public class AlipayCloudCloudpromoAnalysisoverviewTrendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5229959984772582566L;

	/**
	 * 经营分析、经营概况模块公用入参
	 */
	@ApiField("common_request")
	private OpenApiAnalysisCommonRequest commonRequest;

	/**
	 * 经营概况模块，多端分析中支付宝端的小程序app_id
	 */
	@ApiField("hit_app_id")
	private String hitAppId;

	/**
	 * 小程序模板，指创建商家小程序的模版，传入后根据该小程序模版对分析数据过滤
	 */
	@ApiField("template")
	private String template;

	public OpenApiAnalysisCommonRequest getCommonRequest() {
		return this.commonRequest;
	}
	public void setCommonRequest(OpenApiAnalysisCommonRequest commonRequest) {
		this.commonRequest = commonRequest;
	}

	public String getHitAppId() {
		return this.hitAppId;
	}
	public void setHitAppId(String hitAppId) {
		this.hitAppId = hitAppId;
	}

	public String getTemplate() {
		return this.template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}

}
