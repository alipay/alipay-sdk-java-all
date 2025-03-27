package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpEquityPledgeDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.equitypledge.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-23 16:52:23
 */
public class ZhimaCreditEpDossierEquitypledgeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1676943791837299625L;

	/** 
	 * 企业股权出质内容
	 */
	@ApiField("data")
	private EpEquityPledgeDataInfo data;

	public void setData(EpEquityPledgeDataInfo data) {
		this.data = data;
	}
	public EpEquityPledgeDataInfo getData( ) {
		return this.data;
	}

}
