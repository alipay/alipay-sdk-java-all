package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.torchrelayoffline.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:01:41
 */
public class AlipayDataMdaTorchrelayofflineQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7317772653128995976L;

	/** 
	 * 火炬传递人次国家TOP5,json字符串
	 */
	@ApiField("top_5_country")
	private String top5Country;

	/** 
	 * 累计火炬传递次数，long类型
	 */
	@ApiField("total_pv")
	private Long totalPv;

	/** 
	 * 累计火炬传递人数，long类型
	 */
	@ApiField("total_uv")
	private Long totalUv;

	public void setTop5Country(String top5Country) {
		this.top5Country = top5Country;
	}
	public String getTop5Country( ) {
		return this.top5Country;
	}

	public void setTotalPv(Long totalPv) {
		this.totalPv = totalPv;
	}
	public Long getTotalPv( ) {
		return this.totalPv;
	}

	public void setTotalUv(Long totalUv) {
		this.totalUv = totalUv;
	}
	public Long getTotalUv( ) {
		return this.totalUv;
	}

}
