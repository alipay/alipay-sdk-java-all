package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 销量预测模型
 *
 * @author auto create
 * @since 1.0, 2020-09-14 15:48:31
 */
public class KmsBakingSalesForecastDTO extends AlipayObject {

	private static final long serialVersionUID = 1111827154232721234L;

	/**
	 * 预测日期
	 */
	@ApiField("forecast_date")
	private String forecastDate;

	/**
	 * 预测级别预测分为5个等级 A、B、C、D、E（不可预测）
1、E（不可预测）：当sku的历史数据小于等于14条，不进行预测，提示数据量较少，无法进行预测。T+1，T+2，T+3均为空。
2、D：当sku的历史数据大于14条，小于等于60条。只有库存数据为D-；有营销数据为D；
3、C：当sku的历史数据大于60条，小于等于180条。只有库存数据为C-；有营销库存数据为C；
4、B：当sku的历史数据大于180条，小于等于400条。只有库存数据为B-；有营销数据为B；
5、A：当sku的历史数据大于400条。只有库存数据为A-；有营销o数据为A；
	 */
	@ApiField("forecast_level")
	private String forecastLevel;

	/**
	 * 商品skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * t+1日预测数据
	 */
	@ApiField("t_plus_one")
	private String tPlusOne;

	/**
	 * t+3日预测数据
	 */
	@ApiField("t_plus_three")
	private String tPlusThree;

	/**
	 * t+2日预测数据
	 */
	@ApiField("t_plus_two")
	private String tPlusTwo;

	public String getForecastDate() {
		return this.forecastDate;
	}
	public void setForecastDate(String forecastDate) {
		this.forecastDate = forecastDate;
	}

	public String getForecastLevel() {
		return this.forecastLevel;
	}
	public void setForecastLevel(String forecastLevel) {
		this.forecastLevel = forecastLevel;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String gettPlusOne() {
		return this.tPlusOne;
	}
	public void settPlusOne(String tPlusOne) {
		this.tPlusOne = tPlusOne;
	}

	public String gettPlusThree() {
		return this.tPlusThree;
	}
	public void settPlusThree(String tPlusThree) {
		this.tPlusThree = tPlusThree;
	}

	public String gettPlusTwo() {
		return this.tPlusTwo;
	}
	public void settPlusTwo(String tPlusTwo) {
		this.tPlusTwo = tPlusTwo;
	}

}
