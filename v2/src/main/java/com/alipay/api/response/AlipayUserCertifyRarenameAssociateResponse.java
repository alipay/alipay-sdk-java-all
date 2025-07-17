package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RareNameInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.rarename.associate response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:11
 */
public class AlipayUserCertifyRarenameAssociateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7521188915287288213L;

	/** 
	 * rare_name_infos
	 */
	@ApiField("rare_name_infos")
	private RareNameInfo rareNameInfos;

	public void setRareNameInfos(RareNameInfo rareNameInfos) {
		this.rareNameInfos = rareNameInfos;
	}
	public RareNameInfo getRareNameInfos( ) {
		return this.rareNameInfos;
	}

}
