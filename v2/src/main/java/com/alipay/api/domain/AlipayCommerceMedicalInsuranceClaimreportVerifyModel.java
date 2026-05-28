package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 理赔报案核对
 *
 * @author auto create
 * @since 1.0, 2026-05-26 19:52:48
 */
public class AlipayCommerceMedicalInsuranceClaimreportVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 1494311842165146889L;

	/**
	 * 密钥，加密时使用
	 */
	@ApiField("secret_key")
	private String secretKey;

	/**
	 * null
	 */
	@ApiListField("verify_param_list")
	@ApiField("verify_param_list")
	private List<VerifyParamList> verifyParamList;

	public String getSecretKey() {
		return this.secretKey;
	}
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public List<VerifyParamList> getVerifyParamList() {
		return this.verifyParamList;
	}
	public void setVerifyParamList(List<VerifyParamList> verifyParamList) {
		this.verifyParamList = verifyParamList;
	}

}
