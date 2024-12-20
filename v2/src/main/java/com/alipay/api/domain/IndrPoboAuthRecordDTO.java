package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代缴单刷卡记录
 *
 * @author auto create
 * @since 1.0, 2024-11-04 15:05:34
 */
public class IndrPoboAuthRecordDTO extends AlipayObject {

	private static final long serialVersionUID = 4277956777758121462L;

	/**
	 * 刷卡 auth 金额
	 */
	@ApiField("auth_amount")
	private IndrMoneyDTO authAmount;

	/**
	 * 刷卡 auth 结果
	 */
	@ApiField("auth_result")
	private String authResult;

	/**
	 * 渠道响应信息
	 */
	@ApiField("channel_message")
	private String channelMessage;

	/**
	 * auth 记录创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 商户类型
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 单次 auth 记录唯一交易 id
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public IndrMoneyDTO getAuthAmount() {
		return this.authAmount;
	}
	public void setAuthAmount(IndrMoneyDTO authAmount) {
		this.authAmount = authAmount;
	}

	public String getAuthResult() {
		return this.authResult;
	}
	public void setAuthResult(String authResult) {
		this.authResult = authResult;
	}

	public String getChannelMessage() {
		return this.channelMessage;
	}
	public void setChannelMessage(String channelMessage) {
		this.channelMessage = channelMessage;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getMcc() {
		return this.mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
