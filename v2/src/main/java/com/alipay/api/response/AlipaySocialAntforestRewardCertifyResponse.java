package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.reward.certify response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-09 20:42:28
 */
public class AlipaySocialAntforestRewardCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3743217264452429834L;

	/** 
	 * 实体证书上打印的证书编号
	 */
	@ApiField("cert_id")
	private String certId;

	/** 
	 * 用于实体证书上打印的名称，仅当scene_code='CERT_ENTITY'时有返回值
	 */
	@ApiField("cert_name")
	private String certName;

	/** 
	 * true-有对应奖励的领取资格
false-无资格
	 */
	@ApiField("has_reward")
	private Boolean hasReward;

	public void setCertId(String certId) {
		this.certId = certId;
	}
	public String getCertId( ) {
		return this.certId;
	}

	public void setCertName(String certName) {
		this.certName = certName;
	}
	public String getCertName( ) {
		return this.certName;
	}

	public void setHasReward(Boolean hasReward) {
		this.hasReward = hasReward;
	}
	public Boolean getHasReward( ) {
		return this.hasReward;
	}

}
