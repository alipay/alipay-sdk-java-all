package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpCourtNoticeDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.courtnotice.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 14:32:22
 */
public class ZhimaCreditEpDossierCourtnoticeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8269465539776172781L;

	/** 
	 * 企业开庭公告返回内容
	 */
	@ApiField("data")
	private EpCourtNoticeDataInfo data;

	public void setData(EpCourtNoticeDataInfo data) {
		this.data = data;
	}
	public EpCourtNoticeDataInfo getData( ) {
		return this.data;
	}

}
