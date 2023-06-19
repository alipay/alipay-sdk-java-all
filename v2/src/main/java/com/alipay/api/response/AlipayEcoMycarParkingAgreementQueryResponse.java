package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UserAdvanceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 02:06:55
 */
public class AlipayEcoMycarParkingAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8561645746954472967L;

	/** 
	 * 车牌垫资状态:
0 可垫资
1 不可垫资
2 未知请重试
	 */
	@ApiField("advance_status")
	private String advanceStatus;

	/** 
	 * 用户签约的代扣场景字符集，多个英文逗号分割，当车场为ORC识别车牌的场景，返回值包含PLATE_PAY时，表示代扣协议可用。 当车场为ETC设备识别车牌，返回值包含ETC_PAY时表示协议可用。当用户未签约代扣场景|不可垫资|车场不允许代扣时返回NO_AGREEMENT_SCENE，用户NSF校验不通过时，返回NSF_CHECK_FAILED
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
	 * 有效时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("expire_time")
	private String expireTime;

	/** 
	 * 仅当当前车场服务商签约了停车无感垫资产品，且指定车牌被当前传入的支付宝用户开通代扣条件下返回
	 */
	@ApiField("user_advance_info")
	private UserAdvanceInfo userAdvanceInfo;

	public void setAdvanceStatus(String advanceStatus) {
		this.advanceStatus = advanceStatus;
	}
	public String getAdvanceStatus( ) {
		return this.advanceStatus;
	}

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

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}
	public String getExpireTime( ) {
		return this.expireTime;
	}

	public void setUserAdvanceInfo(UserAdvanceInfo userAdvanceInfo) {
		this.userAdvanceInfo = userAdvanceInfo;
	}
	public UserAdvanceInfo getUserAdvanceInfo( ) {
		return this.userAdvanceInfo;
	}

}
