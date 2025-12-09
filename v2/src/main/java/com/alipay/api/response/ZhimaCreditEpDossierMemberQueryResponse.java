package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpMemberDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.member.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-04 19:03:01
 */
public class ZhimaCreditEpDossierMemberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6798282255366528486L;

	/** 
	 * 企业成员查询返回内容
	 */
	@ApiField("data")
	private EpMemberDataInfo data;

	public void setData(EpMemberDataInfo data) {
		this.data = data;
	}
	public EpMemberDataInfo getData( ) {
		return this.data;
	}

}
