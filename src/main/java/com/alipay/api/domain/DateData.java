package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 每日数据
 *
 * @author auto create
 * @since 1.0, 2022-09-06 20:01:18
 */
public class DateData extends AlipayObject {

	private static final long serialVersionUID = 3412657645216587886L;

	/**
	 * 数据日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 多个指标的数据
	 */
	@ApiListField("indicator_data_list")
	@ApiField("indicator_data")
	private List<IndicatorData> indicatorDataList;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public List<IndicatorData> getIndicatorDataList() {
		return this.indicatorDataList;
	}
	public void setIndicatorDataList(List<IndicatorData> indicatorDataList) {
		this.indicatorDataList = indicatorDataList;
	}

}
