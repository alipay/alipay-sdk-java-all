package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单信息
 *
 * @author auto create
 * @since 1.0, 2020-09-14 15:49:04
 */
public class KdsOrderInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1264218262332223211L;

	/**
	 * 订单业务产品类型.  "KB_ORDER_DISHES": 口碑c端点餐; "KB_RESERVATION": 口碑预约点餐; "KB_POS_ORDER_DISHES": 口碑B端盒子订单
"ISV_ORDER_DISHES": ISV服务商订单
"ISV_RESERVATION": ISV服务商预点餐订单

备注: 口碑的订单, 如果普通订单传 KB_ORDER_DISHES, 预约单传KB_RESERVATION
其他来源订单, 包括客如云和other, 默认ISV_ORDER_DISHES,  如果是预订单就传ISV_RESERVATION
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 下厨时间 (可选, 默认是立即下厨)
	 */
	@ApiField("cook_time")
	private Date cookTime;

	/**
	 * 就餐区域
	 */
	@ApiField("dinner_area")
	private String dinnerArea;

	/**
	 * 就餐号：桌号或取餐号
	 */
	@ApiField("dinner_no")
	private String dinnerNo;

	/**
	 * 就餐类型. "TO_GO": 外带; "TAKE_OUT": 外卖; "FOR_HERE": 堂食
	 */
	@ApiField("dinner_type")
	private String dinnerType;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 整单备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 手机号 (能取到则传入)
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 口碑订单号 (口碑订单必传)
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_time")
	private Date orderTime;

	/**
	 * 原始订单数据(JSON格式)
	 */
	@ApiField("out_order_info")
	private String outOrderInfo;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 口碑商户PID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 支付类型. "ADVANCE_PAYMENT": 先付; "AFTER_PAYMENT": 后付
	 */
	@ApiField("pay_style")
	private String payStyle;

	/**
	 * 预定时间 (预订单必传)
	 */
	@ApiField("schedule_time")
	private Date scheduleTime;

	/**
	 * 口碑门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 取餐渠道. "CABINET" 取餐柜;  "COUNTER":取餐台
(预留字段 客如云无需传入)
	 */
	@ApiField("take_channel")
	private String takeChannel;

	/**
	 * 支付宝用户id (能取到则传入)
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public Date getCookTime() {
		return this.cookTime;
	}
	public void setCookTime(Date cookTime) {
		this.cookTime = cookTime;
	}

	public String getDinnerArea() {
		return this.dinnerArea;
	}
	public void setDinnerArea(String dinnerArea) {
		this.dinnerArea = dinnerArea;
	}

	public String getDinnerNo() {
		return this.dinnerNo;
	}
	public void setDinnerNo(String dinnerNo) {
		this.dinnerNo = dinnerNo;
	}

	public String getDinnerType() {
		return this.dinnerType;
	}
	public void setDinnerType(String dinnerType) {
		this.dinnerType = dinnerType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getOutOrderInfo() {
		return this.outOrderInfo;
	}
	public void setOutOrderInfo(String outOrderInfo) {
		this.outOrderInfo = outOrderInfo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPayStyle() {
		return this.payStyle;
	}
	public void setPayStyle(String payStyle) {
		this.payStyle = payStyle;
	}

	public Date getScheduleTime() {
		return this.scheduleTime;
	}
	public void setScheduleTime(Date scheduleTime) {
		this.scheduleTime = scheduleTime;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getTakeChannel() {
		return this.takeChannel;
	}
	public void setTakeChannel(String takeChannel) {
		this.takeChannel = takeChannel;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
