package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 扩展信息，附属的其他信息
 *
 * @author auto create
 * @since 1.0, 2026-04-21 14:52:46
 */
public class OtherInfo extends AlipayObject {

	private static final long serialVersionUID = 6117467772312985127L;

	/**
	 * null
	 */
	@ApiListField("ext_info_attrs")
	@ApiField("ext_info_attrs")
	private List<ExtInfoAttrs> extInfoAttrs;

	/**
	 * 药房业务必填；
是否支持医保
true: 是
false: 否
	 */
	@ApiField("medical_insurance")
	private Boolean medicalInsurance;

	public List<ExtInfoAttrs> getExtInfoAttrs() {
		return this.extInfoAttrs;
	}
	public void setExtInfoAttrs(List<ExtInfoAttrs> extInfoAttrs) {
		this.extInfoAttrs = extInfoAttrs;
	}

	public Boolean getMedicalInsurance() {
		return this.medicalInsurance;
	}
	public void setMedicalInsurance(Boolean medicalInsurance) {
		this.medicalInsurance = medicalInsurance;
	}

}
