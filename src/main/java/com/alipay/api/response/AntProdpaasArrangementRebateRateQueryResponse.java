package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.prodpaas.arrangement.rebate.rate.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AntProdpaasArrangementRebateRateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4347425548698892376L;

	/** 
	 * 一级类目ID
	 */
	@ApiField("category_1_id")
	private String category1Id;

	/** 
	 * 一级类目名称
	 */
	@ApiField("category_1_name")
	private String category1Name;

	/** 
	 * 结束时间，精确到天
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/** 
	 * 开始时间，精确到天
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/** 
	 * 费率
	 */
	@ApiField("rate")
	private String rate;

	public void setCategory1Id(String category1Id) {
		this.category1Id = category1Id;
	}
	public String getCategory1Id( ) {
		return this.category1Id;
	}

	public void setCategory1Name(String category1Name) {
		this.category1Name = category1Name;
	}
	public String getCategory1Name( ) {
		return this.category1Name;
	}

	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}
	public String getGmtEnd( ) {
		return this.gmtEnd;
	}

	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}
	public String getGmtStart( ) {
		return this.gmtStart;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getRate( ) {
		return this.rate;
	}

}
