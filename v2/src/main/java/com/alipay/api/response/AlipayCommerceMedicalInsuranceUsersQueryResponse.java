package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsuranceUserInformation;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.users.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-25 09:22:36
 */
public class AlipayCommerceMedicalInsuranceUsersQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1633235457374893917L;

	/** 
	 * 用户信息(包含亲情账户)
	 */
	@ApiListField("insurance_user_models")
	@ApiField("insurance_user_information")
	private List<InsuranceUserInformation> insuranceUserModels;

	/** 
	 * 是否签约
	 */
	@ApiField("signed")
	private Boolean signed;

	/** 
	 * 授权查询凭证
	 */
	@ApiField("user_token")
	private String userToken;

	public void setInsuranceUserModels(List<InsuranceUserInformation> insuranceUserModels) {
		this.insuranceUserModels = insuranceUserModels;
	}
	public List<InsuranceUserInformation> getInsuranceUserModels( ) {
		return this.insuranceUserModels;
	}

	public void setSigned(Boolean signed) {
		this.signed = signed;
	}
	public Boolean getSigned( ) {
		return this.signed;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	public String getUserToken( ) {
		return this.userToken;
	}

}
