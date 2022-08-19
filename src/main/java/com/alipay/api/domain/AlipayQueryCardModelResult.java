package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 虚拟卡信息查询结果
 *
 * @author auto create
 * @since 1.0, 2018-04-13 11:00:57
 */
public class AlipayQueryCardModelResult extends AlipayObject {

	private static final long serialVersionUID = 2497312249547146482L;

	/**
	 * 卡余额
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 卡公司自定义卡数据
	 */
	@ApiField("card_data")
	private String cardData;

	/**
	 * 卡号。和卡类型一起，唯一确定一张卡。
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 卡状态
	 */
	@ApiField("card_status")
	private String cardStatus;

	/**
	 * 卡类型。每种虚拟卡都有对应的卡类型，该值由支付宝分配给商户。
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 最后更新时间
	 */
	@ApiField("last_update_time")
	private String lastUpdateTime;

	/**
	 * 商户卡状态
	 */
	@ApiField("status_code")
	private String statusCode;

	/**
	 * 商户卡状态信息，与status_code对应，用于描述status_code处于某个状态的原因。
	 */
	@ApiField("status_msg")
	private String statusMsg;

	/**
	 * 用户授权信息
	 */
	@ApiField("user_auth_info")
	private String userAuthInfo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
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

	public String getCardStatus() {
		return this.cardStatus;
	}
	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
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

	public String getLastUpdateTime() {
		return this.lastUpdateTime;
	}
	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public String getStatusCode() {
		return this.statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMsg() {
		return this.statusMsg;
	}
	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}

	public String getUserAuthInfo() {
		return this.userAuthInfo;
	}
	public void setUserAuthInfo(String userAuthInfo) {
		this.userAuthInfo = userAuthInfo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
