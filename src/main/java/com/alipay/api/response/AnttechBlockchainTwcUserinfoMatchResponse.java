package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.twc.userinfo.match response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-10 11:10:11
 */
public class AnttechBlockchainTwcUserinfoMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 2644619364354659371L;

	/** 
	 * 蚂蚁统一会员ID对应的sha256的hash值
	 */
	@ApiField("cousumer_id_hash")
	private String cousumerIdHash;

	/** 
	 * 匹配是否成功
	 */
	@ApiField("match_success")
	private Boolean matchSuccess;

	public void setCousumerIdHash(String cousumerIdHash) {
		this.cousumerIdHash = cousumerIdHash;
	}
	public String getCousumerIdHash( ) {
		return this.cousumerIdHash;
	}

	public void setMatchSuccess(Boolean matchSuccess) {
		this.matchSuccess = matchSuccess;
	}
	public Boolean getMatchSuccess( ) {
		return this.matchSuccess;
	}

}
