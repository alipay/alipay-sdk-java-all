package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MultiAppBaseInfoDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.appinfo.multi.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 05:00:36
 */
public class AlipayOpenMiniAppinfoMultiBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6413874996159699717L;

	/** 
	 * 多端应用信息
	 */
	@ApiListField("app_base_info_list")
	@ApiField("multi_app_base_info_dto")
	private List<MultiAppBaseInfoDto> appBaseInfoList;

	public void setAppBaseInfoList(List<MultiAppBaseInfoDto> appBaseInfoList) {
		this.appBaseInfoList = appBaseInfoList;
	}
	public List<MultiAppBaseInfoDto> getAppBaseInfoList( ) {
		return this.appBaseInfoList;
	}

}
