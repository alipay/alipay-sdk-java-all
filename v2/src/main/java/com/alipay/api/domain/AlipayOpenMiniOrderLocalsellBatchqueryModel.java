package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询售卖商品账单信息列表
 *
 * @author auto create
 * @since 1.0, 2024-10-22 17:11:19
 */
public class AlipayOpenMiniOrderLocalsellBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2628263456173846988L;

	/**
	 * 订单创建结束日期，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_end_time")
	private Date createEndTime;

	/**
	 * 订单创建开始日期，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_start_time")
	private Date createStartTime;

	/**
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 商户订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 平台订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单状态，传入此参数可查询指定状态的订单
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 分页页码，从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小，单位：条目数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public Date getCreateEndTime() {
		return this.createEndTime;
	}
	public void setCreateEndTime(Date createEndTime) {
		this.createEndTime = createEndTime;
	}

	public Date getCreateStartTime() {
		return this.createStartTime;
	}
	public void setCreateStartTime(Date createStartTime) {
		this.createStartTime = createStartTime;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
