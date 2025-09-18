package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UserInvoiceInfoOpenApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.userinvoiceinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:33
 */
public class AlipayBossFncUserinvoiceinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4229648177624425721L;

	/** 
	 * 查询返回结果：开票资料
	 */
	@ApiField("result_set")
	private UserInvoiceInfoOpenApiResponse resultSet;

	public void setResultSet(UserInvoiceInfoOpenApiResponse resultSet) {
		this.resultSet = resultSet;
	}
	public UserInvoiceInfoOpenApiResponse getResultSet( ) {
		return this.resultSet;
	}

}
