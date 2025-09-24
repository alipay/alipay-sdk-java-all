package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EbikeChargeQrCodeResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.industry.qrcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-27 10:12:29
 */
public class AlipayCommerceTransportIndustryQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4543131335421818468L;

	/** 
	 * null
	 */
	@ApiListField("qr_code_result_list")
	@ApiField("ebike_charge_qr_code_result")
	private List<EbikeChargeQrCodeResult> qrCodeResultList;

	public void setQrCodeResultList(List<EbikeChargeQrCodeResult> qrCodeResultList) {
		this.qrCodeResultList = qrCodeResultList;
	}
	public List<EbikeChargeQrCodeResult> getQrCodeResultList( ) {
		return this.qrCodeResultList;
	}

}
