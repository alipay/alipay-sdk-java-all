package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniTemplateApp;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.templatelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 14:56:46
 */
public class AlipayOpenMiniTemplatelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4575892234912377448L;

	/** 
	 * 三方应用关联的小程序模板应用列表
	 */
	@ApiListField("app_list")
	@ApiField("mini_template_app")
	private List<MiniTemplateApp> appList;

	public void setAppList(List<MiniTemplateApp> appList) {
		this.appList = appList;
	}
	public List<MiniTemplateApp> getAppList( ) {
		return this.appList;
	}

}
