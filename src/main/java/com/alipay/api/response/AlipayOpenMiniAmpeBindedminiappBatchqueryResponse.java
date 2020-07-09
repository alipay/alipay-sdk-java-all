package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BindedMiniAppInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.bindedminiapp.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-08 09:52:14
 */
public class AlipayOpenMiniAmpeBindedminiappBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7583283517673435724L;

	/** 
	 * 绑定的小程序信息列表
	 */
	@ApiListField("binded_mini_app_list")
	@ApiField("binded_mini_app_info")
	private List<BindedMiniAppInfo> bindedMiniAppList;

	public void setBindedMiniAppList(List<BindedMiniAppInfo> bindedMiniAppList) {
		this.bindedMiniAppList = bindedMiniAppList;
	}
	public List<BindedMiniAppInfo> getBindedMiniAppList( ) {
		return this.bindedMiniAppList;
	}

}
