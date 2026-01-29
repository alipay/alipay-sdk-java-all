package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车控信息
 *
 * @author auto create
 * @since 1.0, 2026-01-28 17:58:40
 */
public class RoboCarControlInfo extends AlipayObject {

	private static final long serialVersionUID = 4151587138944653714L;

	/**
	 * 空调信息
	 */
	@ApiField("air_conditioner")
	private RoboAirConditionerInfo airConditioner;

	/**
	 * 车窗信息
	 */
	@ApiField("car_window")
	private RoboCarWindowInfo carWindow;

	/**
	 * 车前灯信息
	 */
	@ApiField("front_light")
	private RoboFrontLightInfo frontLight;

	/**
	 * 座椅加热信息
	 */
	@ApiField("seat_heating")
	private RoboSeatHeatingInfo seatHeating;

	/**
	 * 迎宾灯信息
	 */
	@ApiField("welcome_light")
	private RoboWelcomeLightInfo welcomeLight;

	/**
	 * 鸣笛信息
	 */
	@ApiField("whistle")
	private RoboWhistleInfo whistle;

	public RoboAirConditionerInfo getAirConditioner() {
		return this.airConditioner;
	}
	public void setAirConditioner(RoboAirConditionerInfo airConditioner) {
		this.airConditioner = airConditioner;
	}

	public RoboCarWindowInfo getCarWindow() {
		return this.carWindow;
	}
	public void setCarWindow(RoboCarWindowInfo carWindow) {
		this.carWindow = carWindow;
	}

	public RoboFrontLightInfo getFrontLight() {
		return this.frontLight;
	}
	public void setFrontLight(RoboFrontLightInfo frontLight) {
		this.frontLight = frontLight;
	}

	public RoboSeatHeatingInfo getSeatHeating() {
		return this.seatHeating;
	}
	public void setSeatHeating(RoboSeatHeatingInfo seatHeating) {
		this.seatHeating = seatHeating;
	}

	public RoboWelcomeLightInfo getWelcomeLight() {
		return this.welcomeLight;
	}
	public void setWelcomeLight(RoboWelcomeLightInfo welcomeLight) {
		this.welcomeLight = welcomeLight;
	}

	public RoboWhistleInfo getWhistle() {
		return this.whistle;
	}
	public void setWhistle(RoboWhistleInfo whistle) {
		this.whistle = whistle;
	}

}
