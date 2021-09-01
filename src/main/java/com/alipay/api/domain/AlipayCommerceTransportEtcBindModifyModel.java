package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC绑定用户信息修改
 *
 * @author auto create
 * @since 1.0, 2021-03-10 10:30:34
 */
public class AlipayCommerceTransportEtcBindModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8618773794632355357L;

	/**
	 * 绑定申请协议号
	 */
	@ApiField("bind_agreement_no")
	private String bindAgreementNo;

	/**
	 * 用户办理ETC时预留的手机号
	 */
	@ApiField("binded_mobile")
	private String bindedMobile;

	/**
	 * 卡号，带省份前缀
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * OBUID，设备号
	 */
	@ApiField("device_no")
	private String deviceNo;

	public String getBindAgreementNo() {
		return this.bindAgreementNo;
	}
	public void setBindAgreementNo(String bindAgreementNo) {
		this.bindAgreementNo = bindAgreementNo;
	}

	public String getBindedMobile() {
		return this.bindedMobile;
	}
	public void setBindedMobile(String bindedMobile) {
		this.bindedMobile = bindedMobile;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getDeviceNo() {
		return this.deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

}
