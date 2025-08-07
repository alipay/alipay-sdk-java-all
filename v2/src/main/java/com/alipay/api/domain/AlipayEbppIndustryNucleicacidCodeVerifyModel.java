package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核酸码核验
 *
 * @author auto create
 * @since 1.0, 2022-12-12 10:07:53
 */
public class AlipayEbppIndustryNucleicacidCodeVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 2841529853123179667L;

	/**
	 * 核酸码值。对该码值进行核验，得知该码值的有效性
	 */
	@ApiField("nucleic_acid_code")
	private String nucleicAcidCode;

	public String getNucleicAcidCode() {
		return this.nucleicAcidCode;
	}
	public void setNucleicAcidCode(String nucleicAcidCode) {
		this.nucleicAcidCode = nucleicAcidCode;
	}

}
