package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡开卡（内部无需授权）
 *
 * @author auto create
 * @since 1.0, 2025-01-20 15:55:01
 */
public class AlipayMarketingCardOpenApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7875242518868287264L;

	/**
	 * 外部卡信息(biz_card_no无需填写)
	 */
	@ApiField("card_ext_info")
	private MerchantCard cardExtInfo;

	/**
	 * 支付宝分配的卡模板Id（卡模板创建接口返回的模板ID）
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 发卡用户信息
	 */
	@ApiField("card_user_info")
	private CardUserInfo cardUserInfo;

	/**
	 * 商户会员信息
	 */
	@ApiField("member_ext_info")
	private MerchantMenber memberExtInfo;

	/**
	 * 外部商户流水号（商户需要确保唯一性控制，类似request_id唯一请求标识）
	 */
	@ApiField("out_serial_no")
	private String outSerialNo;

	public MerchantCard getCardExtInfo() {
		return this.cardExtInfo;
	}
	public void setCardExtInfo(MerchantCard cardExtInfo) {
		this.cardExtInfo = cardExtInfo;
	}

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public CardUserInfo getCardUserInfo() {
		return this.cardUserInfo;
	}
	public void setCardUserInfo(CardUserInfo cardUserInfo) {
		this.cardUserInfo = cardUserInfo;
	}

	public MerchantMenber getMemberExtInfo() {
		return this.memberExtInfo;
	}
	public void setMemberExtInfo(MerchantMenber memberExtInfo) {
		this.memberExtInfo = memberExtInfo;
	}

	public String getOutSerialNo() {
		return this.outSerialNo;
	}
	public void setOutSerialNo(String outSerialNo) {
		this.outSerialNo = outSerialNo;
	}

}
