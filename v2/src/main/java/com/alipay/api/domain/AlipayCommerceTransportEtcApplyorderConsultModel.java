package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC注销咨询
 *
 * @author auto create
 * @since 1.0, 2023-10-13 15:21:22
 */
public class AlipayCommerceTransportEtcApplyorderConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2648918115483489344L;

	/**
	 * 申请ETC时的协议号
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/**
	 * 注销咨询
	 */
	@ApiField("consult_scene")
	private String consultScene;

	public String getBizAgreementNo() {
		return this.bizAgreementNo;
	}
	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}

	public String getConsultScene() {
		return this.consultScene;
	}
	public void setConsultScene(String consultScene) {
		this.consultScene = consultScene;
	}

}
