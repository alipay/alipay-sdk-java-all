package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpLitigationNoticeDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.litigationnotice.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-04 19:06:46
 */
public class ZhimaCreditEpDossierLitigationnoticeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8471992941766649856L;

	/** 
	 * 企业涉诉公告内容
	 */
	@ApiField("data")
	private EpLitigationNoticeDataInfo data;

	public void setData(EpLitigationNoticeDataInfo data) {
		this.data = data;
	}
	public EpLitigationNoticeDataInfo getData( ) {
		return this.data;
	}

}
