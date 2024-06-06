package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公益林维度浇水统计信息，包含总的浇水人数、总的浇水次数、总浇水克数等信息
 *
 * @author auto create
 * @since 1.0, 2024-05-22 15:27:14
 */
public class WelfareForestWaterSummaryDTO extends AlipayObject {

	private static final long serialVersionUID = 6752562375998466481L;

	/**
	 * 当前浇水量可种植多少颗对应的树
	 */
	@ApiField("plant_sum")
	private Long plantSum;

	/**
	 * 该公益林总共被浇水的次数
	 */
	@ApiField("water_count")
	private Long waterCount;

	/**
	 * 浇水的人数，比如100人浇过水
	 */
	@ApiField("water_people_count")
	private Long waterPeopleCount;

	/**
	 * 浇水总量
	 */
	@ApiField("water_sum")
	private Long waterSum;

	public Long getPlantSum() {
		return this.plantSum;
	}
	public void setPlantSum(Long plantSum) {
		this.plantSum = plantSum;
	}

	public Long getWaterCount() {
		return this.waterCount;
	}
	public void setWaterCount(Long waterCount) {
		this.waterCount = waterCount;
	}

	public Long getWaterPeopleCount() {
		return this.waterPeopleCount;
	}
	public void setWaterPeopleCount(Long waterPeopleCount) {
		this.waterPeopleCount = waterPeopleCount;
	}

	public Long getWaterSum() {
		return this.waterSum;
	}
	public void setWaterSum(Long waterSum) {
		this.waterSum = waterSum;
	}

}
