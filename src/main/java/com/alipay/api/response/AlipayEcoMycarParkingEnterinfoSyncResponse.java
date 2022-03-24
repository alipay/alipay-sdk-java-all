package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.enterinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-17 18:09:14
 */
public class AlipayEcoMycarParkingEnterinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4112725131191995622L;

	/** 
	 * 用户签约的代扣场景字符集，多个英文逗号分割，当车场为ORC识别车牌的场景，返回值包含PLATE_PAY时，表示代扣协议可用。 当车场为ETC设备识别车牌，返回值包含ETC_PAY时表示协议可用。当用户未签约任何代扣场景时返回NO_AGREEMENT_SCENE
	 */
	@ApiField("agreement_scene")
	private String agreementScene;

	/** 
	 * 该字段已废弃,请使用agreement_scene字段
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	/** 
	 * 当前车辆在支付宝侧的信息，是否可以使用无感支付，可选返回项为： NORMAL：正常缴费用户 NON-SENSE-PAY：可无感支付用户
	 */
	@ApiField("car_status")
	private String carStatus;

	/** 
	 * 当前时间戳(查询签约状态和是否支持无感支付仅代表当前时间点查询结果，不作为最后代扣结果，应在发起代扣前再次查询)
	 */
	@ApiField("current_time")
	private String currentTime;

	/** 
	 * 支付宝业务流水号，用于记录车辆从驶入到驶出的全流程
	 */
	@ApiField("serial_no")
	private String serialNo;

	public void setAgreementScene(String agreementScene) {
		this.agreementScene = agreementScene;
	}
	public String getAgreementScene( ) {
		return this.agreementScene;
	}

	public void setAgreementStatus(String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}
	public String getAgreementStatus( ) {
		return this.agreementStatus;
	}

	public void setCarStatus(String carStatus) {
		this.carStatus = carStatus;
	}
	public String getCarStatus( ) {
		return this.carStatus;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}
	public String getCurrentTime( ) {
		return this.currentTime;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getSerialNo( ) {
		return this.serialNo;
	}

}
