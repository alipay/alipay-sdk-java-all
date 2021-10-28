package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.twc.user.match response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-08 17:29:57
 */
public class AnttechBlockchainTwcUserMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 4529379921197837222L;

	/** 
	 * 不匹配
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 是否匹配
	 */
	@ApiField("match_success")
	private Boolean matchSuccess;

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
