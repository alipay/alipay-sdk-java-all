package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代扣签约信息
 *
 * @author auto create
 * @since 1.0, 2023-06-26 13:59:21
 */
public class WithholdSignInfo extends AlipayObject {

	private static final long serialVersionUID = 4349416147454419493L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 代扣签约结协议状态
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	/**
	 * 协议签约场景码,商户和支付宝签约时确定
	 */
	@ApiField("sign_scene")
	private String signScene;

	/**
	 * 签约时间，签约结果同步时非空
	 */
	@ApiField("sign_time")
	private String signTime;

	/**
	 * 解约时间，解约结果同步时非空
	 */
	@ApiField("unsign_time")
	private String unsignTime;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAgreementStatus() {
		return this.agreementStatus;
	}
	public void setAgreementStatus(String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}

	public String getSignScene() {
		return this.signScene;
	}
	public void setSignScene(String signScene) {
		this.signScene = signScene;
	}

	public String getSignTime() {
		return this.signTime;
	}
	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}

	public String getUnsignTime() {
		return this.unsignTime;
	}
	public void setUnsignTime(String unsignTime) {
		this.unsignTime = unsignTime;
	}

}
