package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 饮酒史
 *
 * @author auto create
 * @since 1.0, 2025-12-15 13:37:41
 */
public class AlcoholHistory extends AlipayObject {

	private static final long serialVersionUID = 4238127811521435297L;

	/**
	 * 是否戒酒（Y/N）
	 */
	@ApiField("alcohol_abstinence")
	private String alcoholAbstinence;

	/**
	 * 饮酒种类(白酒、黄酒）
	 */
	@ApiField("alcohol_type")
	private String alcoholType;

	/**
	 * 饮酒频率
	 */
	@ApiField("drink_frequency")
	private DrinkFrequency drinkFrequency;

	/**
	 * 日饮酒量单位 ml/两
	 */
	@ApiField("drinking")
	private String drinking;

	/**
	 * 饮酒时长（年）
	 */
	@ApiField("drinking_time")
	private String drinkingTime;

	/**
	 * 饮酒时长单位 年
	 */
	@ApiField("drinking_time_unit")
	private String drinkingTimeUnit;

	/**
	 *   "drinkingUnit": "两", //单位 ml/两
	 */
	@ApiField("drinking_unit")
	private String drinkingUnit;

	/**
	 * 戒酒时间（最后一次饮酒时间）
	 */
	@ApiField("last_drink")
	private String lastDrink;

	public String getAlcoholAbstinence() {
		return this.alcoholAbstinence;
	}
	public void setAlcoholAbstinence(String alcoholAbstinence) {
		this.alcoholAbstinence = alcoholAbstinence;
	}

	public String getAlcoholType() {
		return this.alcoholType;
	}
	public void setAlcoholType(String alcoholType) {
		this.alcoholType = alcoholType;
	}

	public DrinkFrequency getDrinkFrequency() {
		return this.drinkFrequency;
	}
	public void setDrinkFrequency(DrinkFrequency drinkFrequency) {
		this.drinkFrequency = drinkFrequency;
	}

	public String getDrinking() {
		return this.drinking;
	}
	public void setDrinking(String drinking) {
		this.drinking = drinking;
	}

	public String getDrinkingTime() {
		return this.drinkingTime;
	}
	public void setDrinkingTime(String drinkingTime) {
		this.drinkingTime = drinkingTime;
	}

	public String getDrinkingTimeUnit() {
		return this.drinkingTimeUnit;
	}
	public void setDrinkingTimeUnit(String drinkingTimeUnit) {
		this.drinkingTimeUnit = drinkingTimeUnit;
	}

	public String getDrinkingUnit() {
		return this.drinkingUnit;
	}
	public void setDrinkingUnit(String drinkingUnit) {
		this.drinkingUnit = drinkingUnit;
	}

	public String getLastDrink() {
		return this.lastDrink;
	}
	public void setLastDrink(String lastDrink) {
		this.lastDrink = lastDrink;
	}

}
