package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BatchModifyResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.inputinvoice.beforedistribute.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-19 11:33:18
 */
public class AlipayBossFncInputinvoiceBeforedistributeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1314744525775669251L;

	/** 
	 * 批量修改结果
	 */
	@ApiField("result_set")
	private BatchModifyResponse resultSet;

	public void setResultSet(BatchModifyResponse resultSet) {
		this.resultSet = resultSet;
	}
	public BatchModifyResponse getResultSet( ) {
		return this.resultSet;
	}

}
