package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SubAccountInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.subaccount.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:32:19
 */
public class AlipayBossFncSubaccountAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8181584284214471976L;

	/** 
	 * 查询子户结果信息
	 */
	@ApiField("result_set")
	private SubAccountInfoDTO resultSet;

	public void setResultSet(SubAccountInfoDTO resultSet) {
		this.resultSet = resultSet;
	}
	public SubAccountInfoDTO getResultSet( ) {
		return this.resultSet;
	}

}
