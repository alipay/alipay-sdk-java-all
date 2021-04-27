package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.twc.tradeinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-22 17:02:31
 */
public class AnttechBlockchainTwcTradeinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7645578762111676556L;

	/** 
	 * 订单核验的结果说明
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 是否与订单的信息一致
	 */
	@ApiField("match")
	private Boolean match;

	/** 
	 * 订单核验的结果状态码
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
