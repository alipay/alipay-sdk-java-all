package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 理赔报案核对
 *
 * @author auto create
 * @since 1.0, 2026-07-02 16:32:56
 */
public class AlipayCommerceMedicalInsuranceClaimreportVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 5637521998916475277L;

	/**
	 * 核对场景字段。
	 */
	@ApiField("check_scene")
	private String checkScene;

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

	public String getCheckScene() {
		return this.checkScene;
	}
	public void setCheckScene(String checkScene) {
		this.checkScene = checkScene;
	}

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
