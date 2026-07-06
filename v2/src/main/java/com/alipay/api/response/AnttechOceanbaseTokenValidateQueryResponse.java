package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.token.validate.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-20 16:52:44
 */
public class AnttechOceanbaseTokenValidateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6563291725557731374L;

	/** 
	 * 身份证认证状态
	 */
	@ApiField("id_card_auth_status")
	private Boolean idCardAuthStatus;

	/** 
	 * 姓名的最后一个字
	 */
	@ApiField("last_name")
	private String lastName;

	/** 
	 * 该用户考试通过的考试等级列表
	 */
	@ApiListField("passed_certificate_levels")
	@ApiField("string")
	private List<String> passedCertificateLevels;

	/** 
	 * 用户信息状态
	 */
	@ApiField("token_auth_status")
	private Boolean tokenAuthStatus;

	public void setIdCardAuthStatus(Boolean idCardAuthStatus) {
		this.idCardAuthStatus = idCardAuthStatus;
	}
	public Boolean getIdCardAuthStatus( ) {
		return this.idCardAuthStatus;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName( ) {
		return this.lastName;
	}

	public void setPassedCertificateLevels(List<String> passedCertificateLevels) {
		this.passedCertificateLevels = passedCertificateLevels;
	}
	public List<String> getPassedCertificateLevels( ) {
		return this.passedCertificateLevels;
	}

	public void setTokenAuthStatus(Boolean tokenAuthStatus) {
		this.tokenAuthStatus = tokenAuthStatus;
	}
	public Boolean getTokenAuthStatus( ) {
		return this.tokenAuthStatus;
	}

}
