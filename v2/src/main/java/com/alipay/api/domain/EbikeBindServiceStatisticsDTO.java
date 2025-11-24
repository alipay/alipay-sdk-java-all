package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 两轮车服务绑车相关服务统计数据
 *
 * @author auto create
 * @since 1.0, 2025-09-17 15:37:26
 */
public class EbikeBindServiceStatisticsDTO extends AlipayObject {

	private static final long serialVersionUID = 6732331845867247961L;

	/**
	 * 用户年龄段
	 */
	@ApiField("age_flag")
	private String ageFlag;

	/**
	 * 阵地绑车用户数
	 */
	@ApiField("bind_user_cnt")
	private Long bindUserCnt;

	/**
	 * 充电服务点击uv
	 */
	@ApiField("charge_uv")
	private Long chargeUv;

	/**
	 * 换电服务点击uv
	 */
	@ApiField("exchange_uv")
	private Long exchangeUv;

	/**
	 * 领取绿色能量点击uv
	 */
	@ApiField("green_energy_uv")
	private Long greenEnergyUv;

	/**
	 * 用户职业
	 */
	@ApiField("occupation")
	private String occupation;

	/**
	 * 租电动车点击uv
	 */
	@ApiField("rent_car_uv")
	private Long rentCarUv;

	/**
	 * 场景活跃用户数
	 */
	@ApiField("scene_vst_uv")
	private Long sceneVstUv;

	/**
	 * 服务点击总用户数
	 */
	@ApiField("service_uv")
	private Long serviceUv;

	/**
	 * 值为：F/M/未知
F：女；M：男；未知：未知
	 */
	@ApiField("user_gender")
	private String userGender;

	public String getAgeFlag() {
		return this.ageFlag;
	}
	public void setAgeFlag(String ageFlag) {
		this.ageFlag = ageFlag;
	}

	public Long getBindUserCnt() {
		return this.bindUserCnt;
	}
	public void setBindUserCnt(Long bindUserCnt) {
		this.bindUserCnt = bindUserCnt;
	}

	public Long getChargeUv() {
		return this.chargeUv;
	}
	public void setChargeUv(Long chargeUv) {
		this.chargeUv = chargeUv;
	}

	public Long getExchangeUv() {
		return this.exchangeUv;
	}
	public void setExchangeUv(Long exchangeUv) {
		this.exchangeUv = exchangeUv;
	}

	public Long getGreenEnergyUv() {
		return this.greenEnergyUv;
	}
	public void setGreenEnergyUv(Long greenEnergyUv) {
		this.greenEnergyUv = greenEnergyUv;
	}

	public String getOccupation() {
		return this.occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Long getRentCarUv() {
		return this.rentCarUv;
	}
	public void setRentCarUv(Long rentCarUv) {
		this.rentCarUv = rentCarUv;
	}

	public Long getSceneVstUv() {
		return this.sceneVstUv;
	}
	public void setSceneVstUv(Long sceneVstUv) {
		this.sceneVstUv = sceneVstUv;
	}

	public Long getServiceUv() {
		return this.serviceUv;
	}
	public void setServiceUv(Long serviceUv) {
		this.serviceUv = serviceUv;
	}

	public String getUserGender() {
		return this.userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

}
