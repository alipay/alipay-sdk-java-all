package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.twc.preauthinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-12 11:37:38
 */
public class AnttechBlockchainTwcPreauthinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6174556416827575376L;

	/** 
	 * 订单信息若不一致，错误信息状态描述
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 是否核验通过
	 */
	@ApiField("match")
	private Boolean match;

	/** 
	 * 订单信息是否匹配
	 */
	@ApiField("status")
	private Long status;

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
	}

	public void setMatch(Boolean match) {
		this.match = match;
	}
	public Boolean getMatch( ) {
		return this.match;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

}
