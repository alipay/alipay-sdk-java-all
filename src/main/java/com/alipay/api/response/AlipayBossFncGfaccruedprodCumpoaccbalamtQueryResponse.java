package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PoCumAccruedBalanceAmtDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfaccruedprod.cumpoaccbalamt.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 19:39:04
 */
public class AlipayBossFncGfaccruedprodCumpoaccbalamtQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4169639929388952494L;

	/** 
	 * po的累计余额信息
	 */
	@ApiField("result_data")
	private PoCumAccruedBalanceAmtDTO resultData;

	public void setResultData(PoCumAccruedBalanceAmtDTO resultData) {
		this.resultData = resultData;
	}
	public PoCumAccruedBalanceAmtDTO getResultData( ) {
		return this.resultData;
	}

}
