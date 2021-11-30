package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡查询
 *
 * @author auto create
 * @since 1.0, 2021-11-04 11:53:53
 */
public class AlipayMarketingCardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6836278794765388364L;

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
若target_card_no_type为 BIZ_CARD，则该值为业务卡号，即alipay.marketing.card.open(会员卡开卡)返回结果中的card_info#biz_card_no。
若target_card_no_type为 D_QR_CODE 或D_BAR_CODE，则该值为动态码值。
	 */
	@ApiField("target_card_no")
	private String targetCardNo;

	/**
	 * 卡号ID类型（会员卡查询，只能提供支付宝端的卡号）
BIZ_CARD：支付宝卡号
D_QR_CODE：动态二维码（业务卡号对应的）
D_BAR_CODE：动态条码（业务卡号对应的）
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
