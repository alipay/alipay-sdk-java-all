package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.electronicid.userbarcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-19 14:10:15
 */
public class AlipayUserElectronicidUserbarcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8722735262696341644L;

	/** 
	 * 用户电子身份证码串
	 */
	@ApiField("barcode")
	private String barcode;

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getBarcode( ) {
		return this.barcode;
	}

}
