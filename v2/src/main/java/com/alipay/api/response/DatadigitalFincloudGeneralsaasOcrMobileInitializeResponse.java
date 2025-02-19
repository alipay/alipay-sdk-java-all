package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.ocr.mobile.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-14 09:51:54
 */
public class DatadigitalFincloudGeneralsaasOcrMobileInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3615255113345483513L;

	/** 
	 * OCR识别流水ID，计费依据，请保留方便排查问题
	 */
	@ApiField("certify_id")
	private String certifyId;

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}
	public String getCertifyId( ) {
		return this.certifyId;
	}

}
