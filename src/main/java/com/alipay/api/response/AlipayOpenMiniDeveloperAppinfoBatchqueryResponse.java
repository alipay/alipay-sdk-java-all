package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppBaseInfoQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.developer.appinfo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 12:57:01
 */
public class AlipayOpenMiniDeveloperAppinfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4791224824536857955L;

	/** 
	 * 多端应用信息
	 */
	@ApiListField("app_base_info_list")
	@ApiField("mini_app_base_info_query_response")
	private List<MiniAppBaseInfoQueryResponse> appBaseInfoList;

	public void setAppBaseInfoList(List<MiniAppBaseInfoQueryResponse> appBaseInfoList) {
		this.appBaseInfoList = appBaseInfoList;
	}
	public List<MiniAppBaseInfoQueryResponse> getAppBaseInfoList( ) {
		return this.appBaseInfoList;
	}

}
