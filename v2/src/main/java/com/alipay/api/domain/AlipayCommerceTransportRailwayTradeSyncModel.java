package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝出行行业-铁路数据同步接口
 *
 * @author auto create
 * @since 1.0, 2023-01-06 19:58:19
 */
public class AlipayCommerceTransportRailwayTradeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2179478137534593831L;

	/**
	 * 业务日期，用于判断对账时间，格式为yyyyMMdd
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 数据版本号，从1开始。当铁路需要修改订单信息时，新增一个版本号并重传所有数据
	 */
	@ApiField("data_version")
	private Long dataVersion;

	/**
	 * 扩展字段，具体取值需要双方沟通
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 用户的蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 当前订单金额，精确到分
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 当前业务日期里所有订单的总金额，精确到分
	 */
	@ApiField("order_total_amount")
	private String orderTotalAmount;

	/**
	 * 业务日期里所有订单的总笔数
	 */
	@ApiField("order_total_num")
	private Long orderTotalNum;

	/**
	 * 外部交易号。铁路在收单请求时传递给支付宝，支付宝根据该单据号进行幂等控制
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 本次数据同步请求ID，支付宝根据此ID进行数据同步幂等控制，铁路侧需要自行保证该ID唯一
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 收款PID，不同路局可能使用不同seller_id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 支付宝交易号，铁路无此单号时允许为空。如非空则优先使用该参数查询支付宝订单
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 用户的蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public Long getDataVersion() {
		return this.dataVersion;
	}
	public void setDataVersion(Long dataVersion) {
		this.dataVersion = dataVersion;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderTotalAmount() {
		return this.orderTotalAmount;
	}
	public void setOrderTotalAmount(String orderTotalAmount) {
		this.orderTotalAmount = orderTotalAmount;
	}

	public Long getOrderTotalNum() {
		return this.orderTotalNum;
	}
	public void setOrderTotalNum(Long orderTotalNum) {
		this.orderTotalNum = orderTotalNum;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
