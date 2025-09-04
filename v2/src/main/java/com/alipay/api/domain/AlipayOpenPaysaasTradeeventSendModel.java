package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手持设备外部关联交易事件上报
 *
 * @author auto create
 * @since 1.0, 2025-03-26 17:13:02
 */
public class AlipayOpenPaysaasTradeeventSendModel extends AlipayObject {

	private static final long serialVersionUID = 3797833273117534228L;

	/**
	 * 单位为分，最大值为100000000分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 设备的bizTid，通过sn查询获取
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 按照枚举类型，传入交易事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 直连商户输入商户pid，间连商户输入商户smid
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商家的直间连类型，按照商家类型，选择正确的枚举值。
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 设备sn
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 触发提醒的时间戳，可以不填，不填写，默认为接收到请求的时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 供应商ID
	 */
	@ApiField("supply_id")
	private String supplyId;

	/**
	 * 交易订单id,生产环境必传
	 */
	@ApiField("trade_id")
	private String tradeId;

	/**
	 * ALIPAY_TRADE 支付宝交易 OTHER 其他交易途径
	 */
	@ApiField("trade_type")
	private String tradeType;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getSupplyId() {
		return this.supplyId;
	}
	public void setSupplyId(String supplyId) {
		this.supplyId = supplyId;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
