package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QRcode;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.cardbarcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-08-25 17:10:39
 */
public class AlipayEcoMycarParkingCardbarcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1854438515764344192L;

	/** 
	 * 停车车卡对应二维码列表
	 */
	@ApiListField("qrcodes")
	@ApiField("q_rcode")
	private List<QRcode> qrcodes;

	public void setQrcodes(List<QRcode> qrcodes) {
		this.qrcodes = qrcodes;
	}
	public List<QRcode> getQrcodes( ) {
		return this.qrcodes;
	}

}
