package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业缴费ISV收款方DTO
 *
 * @author auto create
 * @since 1.0, 2023-05-06 14:29:20
 */
public class IndrISVBeneficiaryDTO extends AlipayObject {

	private static final long serialVersionUID = 3857412866985727671L;

	/**
	 * 收款方id
	 */
	@ApiField("beneficiary_id")
	private String beneficiaryId;

	/**
	 * 收款方名称(结果为success才会返回...
	 */
	@ApiField("beneficiary_name")
	private String beneficiaryName;

	/**
	 * 国家码，ISO-3166 2位国家码 https://www.iso.org/iso-3166-country-codes.html
	 */
	@ApiField("country")
	private String country;

	public String getBeneficiaryId() {
		return this.beneficiaryId;
	}
	public void setBeneficiaryId(String beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public String getBeneficiaryName() {
		return this.beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
