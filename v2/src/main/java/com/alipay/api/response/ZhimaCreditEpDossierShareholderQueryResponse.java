package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpShareHolderDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.shareholder.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 14:32:22
 */
public class ZhimaCreditEpDossierShareholderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2522373633274545193L;

	/** 
	 * 企业股东信息查询
	 */
	@ApiField("data")
	private EpShareHolderDataInfo data;

	public void setData(EpShareHolderDataInfo data) {
		this.data = data;
	}
	public EpShareHolderDataInfo getData( ) {
		return this.data;
	}

}
