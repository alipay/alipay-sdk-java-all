package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.twc.userinfo.match response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:56
 */
public class AnttechBlockchainTwcUserinfoMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 3178713667567379761L;

	/** 
	 * 蚂蚁统一会员ID对应的sha256的hash值
	 */
	@ApiField("cousumer_id_hash")
	private String cousumerIdHash;

	/** 
	 * 不匹配的原因描述
	 */
	@ApiField("desc")
	private String desc;

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

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
	}

	public void setMatchSuccess(Boolean matchSuccess) {
		this.matchSuccess = matchSuccess;
	}
	public Boolean getMatchSuccess( ) {
		return this.matchSuccess;
	}

}
