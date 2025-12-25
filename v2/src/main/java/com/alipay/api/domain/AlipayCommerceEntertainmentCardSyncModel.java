package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡同步
 *
 * @author auto create
 * @since 1.0, 2024-06-14 10:42:48
 */
public class AlipayCommerceEntertainmentCardSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6191481621936637256L;

	/**
	 * 卡生效时间，请传生效时间对应毫秒级时间戳。
	 */
	@ApiField("active_date")
	private String activeDate;

	/**
	 * 业务变更时间。毫秒级时间戳，serial_number+biz_date为请求幂等键，biz_date小于等于serial_number对应会员卡在数据库的最新变更时间则请求幂等。
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 卡失效时间，请传失效日期对应毫秒级时间戳
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 会员卡的等级名称。
	 */
	@ApiField("level")
	private String level;

	/**
	 * SEND_MESSAGE：正常发送卡待过期和已过期消息
SEND_WILL_EXPIRED_MESSAGE：仅发会员卡待过期消息
SEND_EXPIRED_MESSAGE：仅发会员卡已过期消息
NOT_SEND_MESSAGE：不发任何消息
	 */
	@ApiField("message_flag")
	private String messageFlag;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 会员卡编号，用户维度下该值唯一。
	 */
	@ApiField("serial_number")
	private String serialNumber;

	/**
	 * 定向开放业务，请联系支付宝业务BD获取对接业务的卡模板编号。
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getActiveDate() {
		return this.activeDate;
	}
	public void setActiveDate(String activeDate) {
		this.activeDate = activeDate;
	}

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public String getMessageFlag() {
		return this.messageFlag;
	}
	public void setMessageFlag(String messageFlag) {
		this.messageFlag = messageFlag;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
