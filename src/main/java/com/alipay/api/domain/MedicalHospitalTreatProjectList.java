package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医院诊疗项目明细
 *
 * @author auto create
 * @since 1.0, 2016-10-08 17:36:39
 */
public class MedicalHospitalTreatProjectList extends AlipayObject {

	private static final long serialVersionUID = 5136354331662661748L;

	/**
	 * 数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 项目名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 单价精确到元。
单位：元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 单位
	 */
	@ApiField("unit")
	private String unit;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
