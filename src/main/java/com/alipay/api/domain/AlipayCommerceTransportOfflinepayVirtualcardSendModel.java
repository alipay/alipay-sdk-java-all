package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 虚拟卡信息同步
 *
 * @author auto create
 * @since 1.0, 2019-08-06 20:05:06
 */
public class AlipayCommerceTransportOfflinepayVirtualcardSendModel extends AlipayObject {

	private static final long serialVersionUID = 3572274753136175532L;

	/**
	 * 虚拟卡信息同步动作
	 */
	@ApiField("action")
	private String action;

	/**
	 * 用户虚拟卡余额，单位元。
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * hex格式表示的虚拟卡数据，卡数据将在虚拟卡二维码中透传。
	 */
	@ApiField("card_data")
	private String cardData;

	/**
	 * 用户虚拟卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 虚拟卡卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 表示虚拟卡是否可用
	 */
	@ApiField("disabled")
	private String disabled;

	/**
	 * 卡状态不可用时，标示卡的具体不可用状态。
CARD_OVERDUE ---- 欠费，CARD_REVOKING ---- 退卡中
	 */
	@ApiField("disabled_code")
	private String disabledCode;

	/**
	 * 当虚拟卡不可用时，提示用户不可用原因。
	 */
	@ApiField("disabled_tips")
	private String disabledTips;

	/**
	 * json格式字符串，存放扩展信息。discount_type ---- 优惠标识
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 虚拟卡最后更新时间 使用标准java时间格式
	 */
	@ApiField("last_update_time")
	private String lastUpdateTime;

	/**
	 * 子动作类型。取值为：VERIFY：表示核销；EXPIRE：表示过期
	 */
	@ApiField("sub_action")
	private String subAction;

	/**
	 * 交易场景，标示卡当前的支付模式，如为空，则默认PCREDIT。
PCREDIT ---- 先享后付
EXTRA_PREPAY ---- 域外储值卡
	 */
	@ApiField("trade_scene")
	private String tradeScene;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

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

	public String getDisabledCode() {
		return this.disabledCode;
	}
	public void setDisabledCode(String disabledCode) {
		this.disabledCode = disabledCode;
	}

	public String getDisabledTips() {
		return this.disabledTips;
	}
	public void setDisabledTips(String disabledTips) {
		this.disabledTips = disabledTips;
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

	public String getSubAction() {
		return this.subAction;
	}
	public void setSubAction(String subAction) {
		this.subAction = subAction;
	}

	public String getTradeScene() {
		return this.tradeScene;
	}
	public void setTradeScene(String tradeScene) {
		this.tradeScene = tradeScene;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
