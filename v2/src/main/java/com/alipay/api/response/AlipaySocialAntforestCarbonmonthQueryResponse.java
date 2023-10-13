package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CarbonTrans;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.carbonmonth.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:22:48
 */
public class AlipaySocialAntforestCarbonmonthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7137288642476663938L;

	/** 
	 * 是否开通森林
	 */
	@ApiField("forest_open")
	private Boolean forestOpen;

	/** 
	 * 月账单数据
	 */
	@ApiListField("month_trans_list")
	@ApiField("carbon_trans")
	private List<CarbonTrans> monthTransList;

	/** 
	 * 对应数据的年份
	 */
	@ApiField("year")
	private String year;

	public void setForestOpen(Boolean forestOpen) {
		this.forestOpen = forestOpen;
	}
	public Boolean getForestOpen( ) {
		return this.forestOpen;
	}

	public void setMonthTransList(List<CarbonTrans> monthTransList) {
		this.monthTransList = monthTransList;
	}
	public List<CarbonTrans> getMonthTransList( ) {
		return this.monthTransList;
	}

	public void setYear(String year) {
		this.year = year;
	}
	public String getYear( ) {
		return this.year;
	}

}
