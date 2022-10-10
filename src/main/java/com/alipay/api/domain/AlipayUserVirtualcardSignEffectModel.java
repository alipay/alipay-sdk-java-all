package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝个人虚拟卡生效接口
 *
 * @author auto create
 * @since 1.0, 2018-07-17 18:53:23
 */
public class AlipayUserVirtualcardSignEffectModel extends AlipayObject {

	private static final long serialVersionUID = 5191424658444376348L;

	/**
	 * hex格式表示的虚拟卡数据，卡数据将在虚拟卡二维码中透传。
	 */
	@ApiField("card_data")
	private String cardData;

	/**
	 * 商户定义的卡号，card_type+card_no要控制唯一性
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 卡类型，由支付宝指定。目前每个商户都有自己的卡类型，一家商户还可能有多个卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 表示虚拟卡是否可用
	 */
	@ApiField("disabled")
	private String disabled;

	/**
	 * 当虚拟卡不可用时，提示用户不可用原因
	 */
	@ApiField("disabled_tips")
	private String disabledTips;

	/**
	 * 卡不可用时引导用户的链接
	 */
	@ApiField("disabled_url")
	private String disabledUrl;

	/**
	 * json格式字符串，存放扩展信息。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getCardData() {
		return this.cardData;
	}
	public void setCardData(String cardData) {
		this.cardData = cardData;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getDisabled() {
		return this.disabled;
	}
	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

	public String getDisabledTips() {
		return this.disabledTips;
	}
	public void setDisabledTips(String disabledTips) {
		this.disabledTips = disabledTips;
	}

	public String getDisabledUrl() {
		return this.disabledUrl;
	}
	public void setDisabledUrl(String disabledUrl) {
		this.disabledUrl = disabledUrl;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
