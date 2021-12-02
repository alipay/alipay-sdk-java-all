package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TemplateUsageInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.template.usage.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-24 16:32:30
 */
public class AlipayOpenMiniTemplateUsageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5823225177419772769L;

	/** 
	 * 小程序appId列表
	 */
	@ApiListField("app_ids")
	@ApiField("string")
	private List<String> appIds;

	/** 
	 * 模板使用信息
	 */
	@ApiListField("template_usage_info_list")
	@ApiField("template_usage_info")
	private List<TemplateUsageInfo> templateUsageInfoList;

	public void setAppIds(List<String> appIds) {
		this.appIds = appIds;
	}
	public List<String> getAppIds( ) {
		return this.appIds;
	}

	public void setTemplateUsageInfoList(List<TemplateUsageInfo> templateUsageInfoList) {
		this.templateUsageInfoList = templateUsageInfoList;
	}
	public List<TemplateUsageInfo> getTemplateUsageInfoList( ) {
		return this.templateUsageInfoList;
	}

}
