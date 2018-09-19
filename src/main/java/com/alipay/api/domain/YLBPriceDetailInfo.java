package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 余利宝行情信息数据结构
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class YLBPriceDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 5755969272575279525L;

	/**
	 * 余利宝行情日期，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("price_date")
	private Date priceDate;

	/**
	 * 七日年化收益率（%），精确到小数点后4位
	 */
	@ApiField("sevendays_yeild_rate")
	private String sevendaysYeildRate;

	/**
	 * 万份收益金额，单位为元
	 */
	@ApiField("tenthousand_income")
	private String tenthousandIncome;

	public Date getPriceDate() {
		return this.priceDate;
	}
	public void setPriceDate(Date priceDate) {
		this.priceDate = priceDate;
	}

	public String getSevendaysYeildRate() {
		return this.sevendaysYeildRate;
	}
	public void setSevendaysYeildRate(String sevendaysYeildRate) {
		this.sevendaysYeildRate = sevendaysYeildRate;
	}

	public String getTenthousandIncome() {
		return this.tenthousandIncome;
	}
	public void setTenthousandIncome(String tenthousandIncome) {
		this.tenthousandIncome = tenthousandIncome;
	}

}
