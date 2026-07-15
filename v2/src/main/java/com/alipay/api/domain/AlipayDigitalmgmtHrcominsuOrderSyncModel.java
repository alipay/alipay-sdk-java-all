package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单同步
 *
 * @author auto create
 * @since 1.0, 2026-07-09 17:57:52
 */
public class AlipayDigitalmgmtHrcominsuOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3465566542785764899L;

	/**
	 * 支付宝UID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 渠道订单号（闪购侧订单号）
	 */
	@ApiField("channel_order_no")
	private String channelOrderNo;

	/**
	 * 渠道原始状态，保留用于追溯。
	 */
	@ApiField("channel_raw_status")
	private String channelRawStatus;

	/**
	 * 家空间统一订单状态，用于查询和状态机驱动。支付宝商家渠道由系统根据channel_raw_status自动映射；闪购渠道由调用方直接传入
	 */
	@ApiField("channel_status")
	private String channelStatus;

	/**
	 * 渠道类型，支付宝商家传 ALIPAY_MERCHANT、淘宝闪购传 TAOBAO_FLASH_SALE、企业码传 ENTERPRISE_CODE、自营传 SELF_OPERATED
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 客户租户
家空间的客户例如 ：蚂蚁、数马
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 外部订单详情跳转URL（静态）
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * null
	 */
	@ApiListField("items")
	@ApiField("order_item_d_t_o")
	private List<OrderItemDTO> items;

	/**
	 * 商家名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商家编号
	 */
	@ApiField("merchant_no")
	private String merchantNo;

	/**
	 * 下单时手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 支付宝下的应用ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单创建时间 13位时间戳
	 */
	@ApiField("order_time")
	private Date orderTime;

	/**
	 * 实付款金额（单位：元，必须为两位小数点的正数，如 99.90）
	 */
	@ApiField("pay_amount")
	private String payAmount;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getChannelOrderNo() {
		return this.channelOrderNo;
	}
	public void setChannelOrderNo(String channelOrderNo) {
		this.channelOrderNo = channelOrderNo;
	}

	public String getChannelRawStatus() {
		return this.channelRawStatus;
	}
	public void setChannelRawStatus(String channelRawStatus) {
		this.channelRawStatus = channelRawStatus;
	}

	public String getChannelStatus() {
		return this.channelStatus;
	}
	public void setChannelStatus(String channelStatus) {
		this.channelStatus = channelStatus;
	}

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public List<OrderItemDTO> getItems() {
		return this.items;
	}
	public void setItems(List<OrderItemDTO> items) {
		this.items = items;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantNo() {
		return this.merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

}
