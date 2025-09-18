package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单对象
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:19
 */
public class OrderBean extends AlipayObject {

	private static final long serialVersionUID = 2628437384845244523L;

	/**
	 * 活动列表
	 */
	@ApiListField("activity_list")
	@ApiField("activity_bean")
	private List<ActivityBean> activityList;

	/**
	 * 取餐号
	 */
	@ApiField("claim_code")
	private String claimCode;

	/**
	 * 桌码扩展信息
	 */
	@ApiField("code_ext")
	private CodeExtBean codeExt;

	/**
	 * 创建时间，1970至今毫秒值
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
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单状态是枚举，数量大于10，具体参见OrderStatusEnum
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 跟order_status对应，枚举数量大于10，枚举详见OrderStatusEnum
	 */
	@ApiField("order_status_desc")
	private String orderStatusDesc;

	/**
	 * 指定的时刻，非时间戳，
为不可度量参数
	 */
	@ApiField("order_timeout")
	private String orderTimeout;

	/**
	 * TO_SHOP，当前只支持到店类型
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 实际价格
	 */
	@ApiField("real_price")
	private String realPrice;

	/**
	 * 订单必填信息
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
	 * 超时时间，1970至今毫秒值
	 */
	@ApiField("timeout_stamp")
	private Long timeoutStamp;

	/**
	 * 商品总价
	 */
	@ApiField("total_price")
	private String totalPrice;

	/**
	 * 交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public List<ActivityBean> getActivityList() {
		return this.activityList;
	}
	public void setActivityList(List<ActivityBean> activityList) {
		this.activityList = activityList;
	}

	public String getClaimCode() {
		return this.claimCode;
	}
	public void setClaimCode(String claimCode) {
		this.claimCode = claimCode;
	}

	public CodeExtBean getCodeExt() {
		return this.codeExt;
	}
	public void setCodeExt(CodeExtBean codeExt) {
		this.codeExt = codeExt;
	}

	public Long getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public List<ItemOrderBean> getItemOrderList() {
		return this.itemOrderList;
	}
	public void setItemOrderList(List<ItemOrderBean> itemOrderList) {
		this.itemOrderList = itemOrderList;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
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

	public String getOrderStatusDesc() {
		return this.orderStatusDesc;
	}
	public void setOrderStatusDesc(String orderStatusDesc) {
		this.orderStatusDesc = orderStatusDesc;
	}

	public String getOrderTimeout() {
		return this.orderTimeout;
	}
	public void setOrderTimeout(String orderTimeout) {
		this.orderTimeout = orderTimeout;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public String getRealPrice() {
		return this.realPrice;
	}
	public void setRealPrice(String realPrice) {
		this.realPrice = realPrice;
	}

	public List<RequireBean> getRequireInfoList() {
		return this.requireInfoList;
	}
	public void setRequireInfoList(List<RequireBean> requireInfoList) {
		this.requireInfoList = requireInfoList;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getTableNo() {
		return this.tableNo;
	}
	public void setTableNo(String tableNo) {
		this.tableNo = tableNo;
	}

	public Long getTimeoutStamp() {
		return this.timeoutStamp;
	}
	public void setTimeoutStamp(Long timeoutStamp) {
		this.timeoutStamp = timeoutStamp;
	}

	public String getTotalPrice() {
		return this.totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
