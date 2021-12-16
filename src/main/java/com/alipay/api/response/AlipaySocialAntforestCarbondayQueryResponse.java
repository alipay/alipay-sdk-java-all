package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CarbonTrans;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.carbonday.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-17 17:15:31
 */
public class AlipaySocialAntforestCarbondayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6178596341188599868L;

	/** 
	 * 日账单数据
	 */
	@ApiListField("day_trans_list")
	@ApiField("carbon_trans")
	private List<CarbonTrans> dayTransList;

	/** 
	 * 是否开通森林
	 */
	@ApiField("forest_open")
	private Boolean forestOpen;

	/** 
	 * 当前数据年份
	 */
	@ApiField("year")
	private String year;

	public void setDayTransList(List<CarbonTrans> dayTransList) {
		this.dayTransList = dayTransList;
	}
	public List<CarbonTrans> getDayTransList( ) {
		return this.dayTransList;
	}

	public void setForestOpen(Boolean forestOpen) {
		this.forestOpen = forestOpen;
	}
	public Boolean getForestOpen( ) {
		return this.forestOpen;
	}

	public void setYear(String year) {
		this.year = year;
	}
	public String getYear( ) {
		return this.year;
	}

}
