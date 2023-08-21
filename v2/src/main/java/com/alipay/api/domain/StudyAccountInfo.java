package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学习账号信息
 *
 * @author auto create
 * @since 1.0, 2019-03-08 00:01:23
 */
public class StudyAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 3249225729298628792L;

	/**
	 * 校园卡ID
	 */
	@ApiField("alipay_card_no")
	private String alipayCardNo;

	/**
	 * 校园卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 支付宝终身学习账户id
	 */
	@ApiField("study_id")
	private String studyId;

	public String getAlipayCardNo() {
		return this.alipayCardNo;
	}
	public void setAlipayCardNo(String alipayCardNo) {
		this.alipayCardNo = alipayCardNo;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getStudyId() {
		return this.studyId;
	}
	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}

}
