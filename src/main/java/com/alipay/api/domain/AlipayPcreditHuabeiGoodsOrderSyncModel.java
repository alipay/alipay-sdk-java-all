package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗商家商品订单同步
 *
 * @author auto create
 * @since 1.0, 2022-08-11 18:46:28
 */
public class AlipayPcreditHuabeiGoodsOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1343491444259962237L;

	/**
	 * 支付宝订单ID
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * 支付宝userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 外部商品ID
	 */
	@ApiField("biz_item_id")
	private String bizItemId;

	/**
	 * 商品名称
	 */
	@ApiField("biz_item_name")
	private String bizItemName;

	/**
	 * 标识识别码
	 */
	@ApiField("biz_src")
	private String bizSrc;

	/**
	 * 业务时间戳，用于解决请求乱序问题，如同时调用则会抛弃较早时间请求
	 */
	@ApiField("biz_timestamp")
	private Long bizTimestamp;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 开始时间（生效）
	 */
	@ApiField("gmt_active")
	private Date gmtActive;

	/**
	 * 结束时间（过期）
	 */
	@ApiField("gmt_expired")
	private Date gmtExpired;

	/**
	 * 图片地址
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 订单总数量
	 */
	@ApiField("number")
	private Long number;

	/**
	 * 外部订单ID
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 退款金额（单位分）
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 当前订单退款数量
	 */
	@ApiField("refund_number")
	private Long refundNumber;

	/**
	 * 交易金额（单位分）
	 */
	@ApiField("trade_amount")
	private Long tradeAmount;

	/**
	 * 交易产生的时间
	 */
	@ApiField("trade_dt")
	private Date tradeDt;

	/**
	 * 当前订单核销数量
	 */
	@ApiField("use_number")
	private Long useNumber;

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizItemId() {
		return this.bizItemId;
	}
	public void setBizItemId(String bizItemId) {
		this.bizItemId = bizItemId;
	}

	public String getBizItemName() {
		return this.bizItemName;
	}
	public void setBizItemName(String bizItemName) {
		this.bizItemName = bizItemName;
	}

	public String getBizSrc() {
		return this.bizSrc;
	}
	public void setBizSrc(String bizSrc) {
		this.bizSrc = bizSrc;
	}

	public Long getBizTimestamp() {
		return this.bizTimestamp;
	}
	public void setBizTimestamp(Long bizTimestamp) {
		this.bizTimestamp = bizTimestamp;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public Date getGmtActive() {
		return this.gmtActive;
	}
	public void setGmtActive(Date gmtActive) {
		this.gmtActive = gmtActive;
	}

	public Date getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(Date gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Long getNumber() {
		return this.number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public Long getRefundNumber() {
		return this.refundNumber;
	}
	public void setRefundNumber(Long refundNumber) {
		this.refundNumber = refundNumber;
	}

	public Long getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(Long tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public Date getTradeDt() {
		return this.tradeDt;
	}
	public void setTradeDt(Date tradeDt) {
		this.tradeDt = tradeDt;
	}

	public Long getUseNumber() {
		return this.useNumber;
	}
	public void setUseNumber(Long useNumber) {
		this.useNumber = useNumber;
	}

}
