package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.ocr.mobile.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-24 19:11:47
 */
public class DatadigitalFincloudGeneralsaasOcrMobileInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3893673451494237428L;

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
