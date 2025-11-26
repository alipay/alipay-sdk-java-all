package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AppBasicInfoResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.appinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:26:14
 */
public class AlipayOpenMiniAppinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2581974557877198862L;

	/** 
	 * 应用信息列表
	 */
	@ApiListField("app_basic_info_response_list")
	@ApiField("app_basic_info_response")
	private List<AppBasicInfoResponse> appBasicInfoResponseList;

	public void setAppBasicInfoResponseList(List<AppBasicInfoResponse> appBasicInfoResponseList) {
		this.appBasicInfoResponseList = appBasicInfoResponseList;
	}
	public List<AppBasicInfoResponse> getAppBasicInfoResponseList( ) {
		return this.appBasicInfoResponseList;
	}

}
