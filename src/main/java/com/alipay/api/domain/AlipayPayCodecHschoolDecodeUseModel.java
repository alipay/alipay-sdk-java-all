package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 双离线码在线解码API
 *
 * @author auto create
 * @since 1.0, 2020-04-02 21:02:42
 */
public class AlipayPayCodecHschoolDecodeUseModel extends AlipayObject {

	private static final long serialVersionUID = 3615976652427517744L;

	/**
	 * 码值
	 */
	@ApiField("code_value")
	private String codeValue;

	/**
	 * 机构号
	 */
	@ApiField("institution_code")
	private String institutionCode;

	public String getCodeValue() {
		return this.codeValue;
	}
	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}

	public String getInstitutionCode() {
		return this.institutionCode;
	}
	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}

}
