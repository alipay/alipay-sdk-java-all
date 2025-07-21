package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpPatentDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.patent.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 14:17:23
 */
public class ZhimaCreditEpDossierPatentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2843848136415961216L;

	/** 
	 * 查询专利内容
	 */
	@ApiField("data")
	private EpPatentDataInfo data;

	public void setData(EpPatentDataInfo data) {
		this.data = data;
	}
	public EpPatentDataInfo getData( ) {
		return this.data;
	}

}
