package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 港人就医签到
 *
 * @author auto create
 * @since 1.0, 2025-12-24 09:37:42
 */
public class AlipayCommerceMedicalInsuranceHkmedicalSigninModel extends AlipayObject {

	private static final long serialVersionUID = 5487429122692262684L;

	/**
	 * 医院 id
	 */
	@ApiField("hosp_id")
	private String hospId;

	/**
	 * 商保码二维码串
	 */
	@ApiField("qr_code")
	private String qrCode;

	public String getHospId() {
		return this.hospId;
	}
	public void setHospId(String hospId) {
		this.hospId = hospId;
	}

	public String getQrCode() {
		return this.qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

}
