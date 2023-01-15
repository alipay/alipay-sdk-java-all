package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 三方商户对接智能助理
 *
 * @author auto create
 * @since 1.0, 2022-08-01 09:56:34
 */
public class AlipayIserviceItaskMerchantRecordSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7275473942189529218L;

	/**
	 * 业务标识
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 业务数据主键
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 消费用户id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 用户信息详情
	 */
	@ApiField("buyer_info")
	private BuyerInfo buyerInfo;

	/**
	 * 内容扩展参数
	 */
	@ApiField("content")
	private HomeNormalApiContent content;

	/**
	 * 如果buyer_id是支付宝userId...
	 */
	@ApiField("is_alipay_user")
	private String isAlipayUser;

	/**
	 * 用户是否授权
	 */
	@ApiField("is_authorize")
	private String isAuthorize;

	/**
	 * 消息时间戳，毫秒级别
	 */
	@ApiField("msg_time")
	private String msgTime;

	/**
	 * 业务数据订单状态
	 */
	@ApiField("node_code")
	private String nodeCode;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public BuyerInfo getBuyerInfo() {
		return this.buyerInfo;
	}
	public void setBuyerInfo(BuyerInfo buyerInfo) {
		this.buyerInfo = buyerInfo;
	}

	public HomeNormalApiContent getContent() {
		return this.content;
	}
	public void setContent(HomeNormalApiContent content) {
		this.content = content;
	}

	public String getIsAlipayUser() {
		return this.isAlipayUser;
	}
	public void setIsAlipayUser(String isAlipayUser) {
		this.isAlipayUser = isAlipayUser;
	}

	public String getIsAuthorize() {
		return this.isAuthorize;
	}
	public void setIsAuthorize(String isAuthorize) {
		this.isAuthorize = isAuthorize;
	}

	public String getMsgTime() {
		return this.msgTime;
	}
	public void setMsgTime(String msgTime) {
		this.msgTime = msgTime;
	}

	public String getNodeCode() {
		return this.nodeCode;
	}
	public void setNodeCode(String nodeCode) {
		this.nodeCode = nodeCode;
	}

}
