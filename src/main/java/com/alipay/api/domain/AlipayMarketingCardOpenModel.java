package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡开卡接口
 *
 * @author auto create
 * @since 1.0, 2022-11-08 21:21:08
 */
public class AlipayMarketingCardOpenModel extends AlipayObject {

	private static final long serialVersionUID = 8874572516735142262L;

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
	 * 领卡渠道，用于记录外部商户端领卡来源的渠道信息，渠道值可自行定义（仅限数字、字母、下划线） 
可直接标识领卡渠道，也可配合open_card_channel_id标识领卡渠道类型：
例如：
线下门店领取:20161534000000000008863（直接标识领卡渠道，门店shopId）
线下扫二维码领取:QR（标识领卡类型）;
线下活动领取:20170522000000000003609（直接标识领卡渠道，商户活动ID）
	 */
	@ApiField("open_card_channel")
	private String openCardChannel;

	/**
	 * 领卡来源的渠道id，注意区别于open_card_channel领卡渠道；
一般使用场景：
open_card_channel用于区分渠道类型，例如取值为"SHOP"（门店），"ACTIVITY"（活动）；
则open_card_channel_id可用于区分同渠道的不同实体，对应取各门店ID或各活动的标识ID等；
	 */
	@ApiField("open_card_channel_id")
	private String openCardChannelId;

	/**
	 * 外部商户流水号。由商户自定义，需保证商户系统中唯一。
	 */
	@ApiField("out_serial_no")
	private String outSerialNo;

	/**
	 * 付费外卡信息，只供特定业务使用，通常接入无需关注
	 */
	@ApiField("paid_outer_card_info")
	private PaidOuterCardExtraInfoDTO paidOuterCardInfo;

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

	public String getOpenCardChannel() {
		return this.openCardChannel;
	}
	public void setOpenCardChannel(String openCardChannel) {
		this.openCardChannel = openCardChannel;
	}

	public String getOpenCardChannelId() {
		return this.openCardChannelId;
	}
	public void setOpenCardChannelId(String openCardChannelId) {
		this.openCardChannelId = openCardChannelId;
	}

	public String getOutSerialNo() {
		return this.outSerialNo;
	}
	public void setOutSerialNo(String outSerialNo) {
		this.outSerialNo = outSerialNo;
	}

	public PaidOuterCardExtraInfoDTO getPaidOuterCardInfo() {
		return this.paidOuterCardInfo;
	}
	public void setPaidOuterCardInfo(PaidOuterCardExtraInfoDTO paidOuterCardInfo) {
		this.paidOuterCardInfo = paidOuterCardInfo;
	}

}
