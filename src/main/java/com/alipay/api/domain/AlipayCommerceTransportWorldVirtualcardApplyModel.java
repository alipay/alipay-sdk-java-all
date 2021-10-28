package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 非中国大陆用户领取虚拟卡
 *
 * @author auto create
 * @since 1.0, 2020-03-24 17:40:09
 */
public class AlipayCommerceTransportWorldVirtualcardApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2756789667548839135L;

	/**
	 * 虚拟卡行为，暂时只有海外用户领卡WORLD_ISSUE
	 */
	@ApiField("action")
	private String action;

	/**
	 * 用户的卡数据，领卡时可不填
	 */
	@ApiField("card_data")
	private String cardData;

	/**
	 * 用户的卡号，销号和卡更新时必填，领卡时不填。
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 卡类型，城市交通部门维度，如羊城通是一种cardtype，上海公交也是一种cardtype。
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * json格式字符串，存放扩展信息。agreement_id--代扣协议号。本期的大湾区必填。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 领卡的目标商户ID，比如羊城通的PID。
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 请求来源，本期大湾区只支持GN_HK。
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

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

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
