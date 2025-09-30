package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VulList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.afsrc.vul.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class AlipaySecurityProdAfsrcVulBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8564284196316289226L;

	/** 
	 * 漏洞信息列表
	 */
	@ApiListField("data")
	@ApiField("vul_list")
	private List<VulList> data;

	public void setData(List<VulList> data) {
		this.data = data;
	}
	public List<VulList> getData( ) {
		return this.data;
	}

}
