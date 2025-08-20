package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemOrderBean;
import com.alipay.api.domain.RequireBean;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.smdd.order.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 11:17:38
 */
public class AlipayOfflineSmddOrderDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6316843349329884411L;

	/** 
	 * 取餐号
	 */
	@ApiField("claim_code")
	private String claimCode;

	/** 
	 * 创建日期，1970至今毫秒值
	 */
	@ApiField("create_time")
	private Long createTime;

	/** 
	 * 商品订单列表
	 */
	@ApiListField("item_order_list")
	@ApiField("item_order_bean")
	private List<ItemOrderBean> itemOrderList;

	/** 
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 订单状态,详见OrderStatusEnum，枚举数量大于10
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 订单状态说明，详见OrderStatusEnum，枚举数量大于10
	 */
	@ApiField("order_status_desc")
	private String orderStatusDesc;

	/** 
	 * 订单超时时间，指定到具体时间，不度量
	 */
	@ApiField("order_timeout")
	private String orderTimeout;

	/** 
	 * 业务类型
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/** 
	 * 订单实际支付价格 单位：元
	 */
	@ApiField("real_price")
	private String realPrice;

	/** 
	 * 必填信息
	 */
	@ApiListField("require_info_list")
	@ApiField("require_bean")
	private List<RequireBean> requireInfoList;

	/** 
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 桌号
	 */
	@ApiField("table_no")
	private String tableNo;

	/** 
	 * 超时时间 1970至今毫秒值
	 */
	@ApiField("timeout_stamp")
	private Long timeoutStamp;

	/** 
	 * 订单总价格 单位：元
	 */
	@ApiField("total_price")
	private String totalPrice;

	/** 
	 * 交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setClaimCode(String claimCode) {
		this.claimCode = claimCode;
	}
	public String getClaimCode( ) {
		return this.claimCode;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public Long getCreateTime( ) {
		return this.createTime;
	}

	public void setItemOrderList(List<ItemOrderBean> itemOrderList) {
		this.itemOrderList = itemOrderList;
	}
	public List<ItemOrderBean> getItemOrderList( ) {
		return this.itemOrderList;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOrderStatusDesc(String orderStatusDesc) {
		this.orderStatusDesc = orderStatusDesc;
	}
	public String getOrderStatusDesc( ) {
		return this.orderStatusDesc;
	}

	public void setOrderTimeout(String orderTimeout) {
		this.orderTimeout = orderTimeout;
	}
	public String getOrderTimeout( ) {
		return this.orderTimeout;
	}

	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}
	public String getOutBizType( ) {
		return this.outBizType;
	}

	public void setRealPrice(String realPrice) {
		this.realPrice = realPrice;
	}
	public String getRealPrice( ) {
		return this.realPrice;
	}

	public void setRequireInfoList(List<RequireBean> requireInfoList) {
		this.requireInfoList = requireInfoList;
	}
	public List<RequireBean> getRequireInfoList( ) {
		return this.requireInfoList;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setTableNo(String tableNo) {
		this.tableNo = tableNo;
	}
	public String getTableNo( ) {
		return this.tableNo;
	}

	public void setTimeoutStamp(Long timeoutStamp) {
		this.timeoutStamp = timeoutStamp;
	}
	public Long getTimeoutStamp( ) {
		return this.timeoutStamp;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getTotalPrice( ) {
		return this.totalPrice;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
