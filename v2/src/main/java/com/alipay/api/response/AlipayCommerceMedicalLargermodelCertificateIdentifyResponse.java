package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BirthCertificateDTO;
import com.alipay.api.domain.HouseholdRegistrationDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.largermodel.certificate.identify response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-01 09:57:30
 */
public class AlipayCommerceMedicalLargermodelCertificateIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5465797765981398794L;

	/** 
	 * 出生证明信息
	 */
	@ApiField("birth_certificate")
	private BirthCertificateDTO birthCertificate;

	/** 
	 * 户口本信息
	 */
	@ApiField("household_registration")
	private HouseholdRegistrationDTO householdRegistration;

	public void setBirthCertificate(BirthCertificateDTO birthCertificate) {
		this.birthCertificate = birthCertificate;
	}
	public BirthCertificateDTO getBirthCertificate( ) {
		return this.birthCertificate;
	}

	public void setHouseholdRegistration(HouseholdRegistrationDTO householdRegistration) {
		this.householdRegistration = householdRegistration;
	}
	public HouseholdRegistrationDTO getHouseholdRegistration( ) {
		return this.householdRegistration;
	}

}
