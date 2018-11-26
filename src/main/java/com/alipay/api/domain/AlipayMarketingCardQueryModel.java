package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡查询
 *
 * @author auto create
 * @since 1.0, 2018-01-31 17:43:09
 */
public class AlipayMarketingCardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7444372871253236714L;

	/**
	 * 用户信息 填写则作为附加条件查询
	 */
	@ApiField("card_user_info")
	private CardUserInfo cardUserInfo;

	/**
	 * 扩展信息，暂时没有
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 操作卡号。
target_card_no为业务卡号，由开卡流程中，支付宝返回的业务卡号
	 */
	@ApiField("target_card_no")
	private String targetCardNo;

	/**
	 * 卡号ID类型（会员卡查询，只能提供支付宝端的卡号）
BIZ_CARD：支付宝卡号
D_QR_CODE：动态二维码（业务卡号对应的）
D_BAR_CODE：动态条码（业务卡号对应的）
如果卡号不空，则类型不能为空
	 */
	@ApiField("target_card_no_type")
	private String targetCardNoType;

	public CardUserInfo getCardUserInfo() {
		return this.cardUserInfo;
	}
	public void setCardUserInfo(CardUserInfo cardUserInfo) {
		this.cardUserInfo = cardUserInfo;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getTargetCardNo() {
		return this.targetCardNo;
	}
	public void setTargetCardNo(String targetCardNo) {
		this.targetCardNo = targetCardNo;
	}

	public String getTargetCardNoType() {
		return this.targetCardNoType;
	}
	public void setTargetCardNoType(String targetCardNoType) {
		this.targetCardNoType = targetCardNoType;
	}

}
