package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EpDossierLiteDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.name.match response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 17:27:45
 */
public class ZhimaCreditEpDossierNameMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 4728686586272395221L;

	/** 
	 * 企业简版档案信息
	 */
	@ApiListField("ep_dossier_lite_detail")
	@ApiField("ep_dossier_lite_detail")
	private List<EpDossierLiteDetail> epDossierLiteDetail;

	public void setEpDossierLiteDetail(List<EpDossierLiteDetail> epDossierLiteDetail) {
		this.epDossierLiteDetail = epDossierLiteDetail;
	}
	public List<EpDossierLiteDetail> getEpDossierLiteDetail( ) {
		return this.epDossierLiteDetail;
	}

}
