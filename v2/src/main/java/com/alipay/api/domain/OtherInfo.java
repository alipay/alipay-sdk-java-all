package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展信息，附属的其他信息
 *
 * @author auto create
 * @since 1.0, 2026-01-05 17:47:42
 */
public class OtherInfo extends AlipayObject {

	private static final long serialVersionUID = 6546385868569651234L;

	/**
	 * 药房业务必填；
是否支持医保
true: 是
false: 否
	 */
	@ApiField("medical_insurance")
	private Boolean medicalInsurance;

	public Boolean getMedicalInsurance() {
		return this.medicalInsurance;
	}
	public void setMedicalInsurance(Boolean medicalInsurance) {
		this.medicalInsurance = medicalInsurance;
	}

}
