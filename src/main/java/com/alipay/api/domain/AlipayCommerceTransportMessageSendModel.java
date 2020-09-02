package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 票务消息通知接口
 *
 * @author auto create
 * @since 1.0, 2019-07-30 17:51:52
 */
public class AlipayCommerceTransportMessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 1498927733682338232L;

	/**
	 * 卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 商户业务时间。格式为"yyyy-MM-dd HH:mm:ss"。
	 */
	@ApiField("merchant_biz_time")
	private String merchantBizTime;

	/**
	 * 消息通知数据。该字段格式请与支付宝技术人员沟通。
	 */
	@ApiField("notify_data")
	private String notifyData;

	/**
	 * 消息发送时间。格式为"yyyy-MM-dd HH:mm:ss"。指定后，将会在这个指定时间点发送消息。不指定，则消息会立即发送。
	 */
	@ApiField("notify_time")
	private String notifyTime;

	/**
	 * 通知类型，由支付宝配置提供。具体的通知类型请与支付宝技术人员沟通。
	 */
	@ApiField("notify_type")
	private String notifyType;

	/**
	 * 目标用户ID列表，最大支持50个。
	 */
	@ApiListField("user_ids")
	@ApiField("string")
	private List<String> userIds;

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getMerchantBizTime() {
		return this.merchantBizTime;
	}
	public void setMerchantBizTime(String merchantBizTime) {
		this.merchantBizTime = merchantBizTime;
	}

	public String getNotifyData() {
		return this.notifyData;
	}
	public void setNotifyData(String notifyData) {
		this.notifyData = notifyData;
	}

	public String getNotifyTime() {
		return this.notifyTime;
	}
	public void setNotifyTime(String notifyTime) {
		this.notifyTime = notifyTime;
	}

	public String getNotifyType() {
		return this.notifyType;
	}
	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public List<String> getUserIds() {
		return this.userIds;
	}
	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}

}
