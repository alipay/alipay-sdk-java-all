package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpEquityPledgeDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.equitypledge.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 10:17:42
 */
public class ZhimaCreditEpDossierEquitypledgeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4472252131792858498L;

	/** 
	 * 企业股权出质内容
	 */
	@ApiField("data")
	private EpEquityPledgeDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpEquityPledgeDataInfo data) {
		this.data = data;
	}
	public EpEquityPledgeDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
