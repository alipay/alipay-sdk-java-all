package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvokeAppInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.invokeapp.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-14 10:50:37
 */
public class AlipayOpenMiniAmpeInvokeappBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3889694462811682396L;

	/** 
	 * 调用应用信息列表
	 */
	@ApiListField("invoke_app_list")
	@ApiField("invoke_app_info")
	private List<InvokeAppInfo> invokeAppList;

	public void setInvokeAppList(List<InvokeAppInfo> invokeAppList) {
		this.invokeAppList = invokeAppList;
	}
	public List<InvokeAppInfo> getInvokeAppList( ) {
		return this.invokeAppList;
	}

}
