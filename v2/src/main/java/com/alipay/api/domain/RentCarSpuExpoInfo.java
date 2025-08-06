package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租车spu曝光信息
 *
 * @author auto create
 * @since 1.0, 2025-04-07 14:48:58
 */
public class RentCarSpuExpoInfo extends AlipayObject {

	private static final long serialVersionUID = 6784681928872268456L;

	/**
	 * 车型类型
	 */
	@ApiField("car_type")
	private String carType;

	/**
	 * 城市名
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 曝光排名(曝光量越大值越小)
	 */
	@ApiField("expo_rank")
	private Long expoRank;

	/**
	 * 分城市订单排名（订单量越大值越小）
	 */
	@ApiField("order_rank")
	private Long orderRank;

	/**
	 * spu的标识
	 */
	@ApiField("spu_id")
	private String spuId;

	/**
	 * spu名称
	 */
	@ApiField("spu_name")
	private String spuName;

	/**
	 * 车型品牌
	 */
	@ApiField("veh_name")
	private String vehName;

	public String getCarType() {
		return this.carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Long getExpoRank() {
		return this.expoRank;
	}
	public void setExpoRank(Long expoRank) {
		this.expoRank = expoRank;
	}

	public Long getOrderRank() {
		return this.orderRank;
	}
	public void setOrderRank(Long orderRank) {
		this.orderRank = orderRank;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

	public String getSpuName() {
		return this.spuName;
	}
	public void setSpuName(String spuName) {
		this.spuName = spuName;
	}

	public String getVehName() {
		return this.vehName;
	}
	public void setVehName(String vehName) {
		this.vehName = vehName;
	}

}
