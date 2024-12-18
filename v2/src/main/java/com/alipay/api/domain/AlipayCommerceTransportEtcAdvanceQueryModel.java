package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询ETC协议设备垫资未还
 *
 * @author auto create
 * @since 1.0, 2024-03-06 16:18:06
 */
public class AlipayCommerceTransportEtcAdvanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3559973168733323318L;

	/**
	 * 支付宝ETC平台设备协议号
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/**
	 * 业务查询场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	public String getBizAgreementNo() {
		return this.bizAgreementNo;
	}
	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

}
