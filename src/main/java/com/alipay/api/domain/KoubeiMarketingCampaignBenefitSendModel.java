package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑权益发放接口
 *
 * @author auto create
 * @since 1.0, 2020-06-01 13:12:46
 */
public class KoubeiMarketingCampaignBenefitSendModel extends AlipayObject {

	private static final long serialVersionUID = 8486152366159955487L;

	/**
	 * 身份证号码
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 领券渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 优惠类型，CAMPAIGN：活动，ITEM：商品
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * 是否需要控制发奖幂等
	 */
	@ApiField("idem_camp_trigger")
	private Boolean idemCampTrigger;

	/**
	 * 触发权益的优惠id，当discount_type是ITEM的时候这个内容是商品id，当discount_type是CAMPAIGN的时候这个内容是活动id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 支付宝的登陆账号，可以为邮箱、手机号等。
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 用户手机号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 外部流水号，用于控制幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 领券的门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getDiscountType() {
		return this.discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public Boolean getIdemCampTrigger() {
		return this.idemCampTrigger;
	}
	public void setIdemCampTrigger(Boolean idemCampTrigger) {
		this.idemCampTrigger = idemCampTrigger;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
