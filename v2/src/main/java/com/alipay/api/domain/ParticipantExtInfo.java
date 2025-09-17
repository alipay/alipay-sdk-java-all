package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 参与方扩展信息
 *
 * @author auto create
 * @since 1.0, 2024-09-14 15:22:04
 */
public class ParticipantExtInfo extends AlipayObject {

	private static final long serialVersionUID = 5259717696798693424L;

	/**
	 * 参与方关联的协议号，部分委托场景需要提供，默认可选。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

}
