package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenapiServerDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.appservice.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-15 11:52:06
 */
public class AlipayCloudCloudrunAppserviceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1618369581798738254L;

	/** 
	 * 服务实例列表
	 */
	@ApiListField("server_list")
	@ApiField("openapi_server_d_t_o")
	private List<OpenapiServerDTO> serverList;

	public void setServerList(List<OpenapiServerDTO> serverList) {
		this.serverList = serverList;
	}
	public List<OpenapiServerDTO> getServerList( ) {
		return this.serverList;
	}

}
