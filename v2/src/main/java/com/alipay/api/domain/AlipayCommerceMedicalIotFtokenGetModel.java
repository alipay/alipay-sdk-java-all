package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询医疗IOT刷脸ftoken
 *
 * @author auto create
 * @since 1.0, 2024-03-28 09:53:31
 */
public class AlipayCommerceMedicalIotFtokenGetModel extends AlipayObject {

	private static final long serialVersionUID = 3335813982167467694L;

	/**
	 * 用户医保码值
	 */
	@ApiField("medical_code")
	private String medicalCode;

	public String getMedicalCode() {
		return this.medicalCode;
	}
	public void setMedicalCode(String medicalCode) {
		this.medicalCode = medicalCode;
	}

}
