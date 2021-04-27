package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.contract.management.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-23 13:59:47
 */
public class AlipayBossContractManagementCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 4372433393463456894L;

	/** 
	 * 撤销操作提示
	 */
	@ApiField("result_set")
	private String resultSet;

	public void setResultSet(String resultSet) {
		this.resultSet = resultSet;
	}
	public String getResultSet( ) {
		return this.resultSet;
	}

}
