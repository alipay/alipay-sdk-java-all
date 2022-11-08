package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.parking.enterinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 19:31:36
 */
public class AlipayCommerceTransportParkingEnterinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5264762851518231739L;

	/** 
	 * 用户签约的代扣场景字符集，多个英文逗号分割，当车场为ORC识别车牌的场景，返回值包含PLATE_PAY时，表示代扣协议可用。 当车场为ETC设备识别车牌，返回值包含ETC_PAY时表示协议可用。当用户未签约任何代扣场景时返回NO_AGREEMENT_SCENE
	 */
	@ApiField("agreement_scene")
	private String agreementScene;

	/** 
	 * 具体错误code
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 具体错误描述
	 */
	@ApiField("biz_msg")
	private String bizMsg;

	public void setAgreementScene(String agreementScene) {
		this.agreementScene = agreementScene;
	}
	public String getAgreementScene( ) {
		return this.agreementScene;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setBizMsg(String bizMsg) {
		this.bizMsg = bizMsg;
	}
	public String getBizMsg( ) {
		return this.bizMsg;
	}

}
