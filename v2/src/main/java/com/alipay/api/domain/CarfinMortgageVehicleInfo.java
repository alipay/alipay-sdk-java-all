package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 抵押重推场景下的车辆信息
 *
 * @author auto create
 * @since 1.0, 2025-09-18 15:56:03
 */
public class CarfinMortgageVehicleInfo extends AlipayObject {

	private static final long serialVersionUID = 4645992122614238396L;

	/**
	 * 车辆品牌
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 车辆车型
	 */
	@ApiField("model_name")
	private String modelName;

	/**
	 * 车辆车系名称
	 */
	@ApiField("series_name")
	private String seriesName;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return this.modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getSeriesName() {
		return this.seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

}
