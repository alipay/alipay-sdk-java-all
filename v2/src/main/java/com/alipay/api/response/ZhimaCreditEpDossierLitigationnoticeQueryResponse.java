package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpLitigationNoticeDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.litigationnotice.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 10:17:43
 */
public class ZhimaCreditEpDossierLitigationnoticeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3213475452523881995L;

	/** 
	 * 企业涉诉公告内容
	 */
	@ApiField("data")
	private EpLitigationNoticeDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpLitigationNoticeDataInfo data) {
		this.data = data;
	}
	public EpLitigationNoticeDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
