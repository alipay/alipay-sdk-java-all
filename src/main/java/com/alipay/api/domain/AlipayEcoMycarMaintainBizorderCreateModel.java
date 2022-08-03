package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建保养洗车订单接口
 *
 * @author auto create
 * @since 1.0, 2019-08-15 20:08:48
 */
public class AlipayEcoMycarMaintainBizorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2386724877461614681L;

	/**
	 * 预约确认时间yyyy-MM-dd HH:mm:ss。门店确认预约时间。门店确认后，预约流程生效，用户可到店服务。
	 */
	@ApiField("appoint_affirm_time")
	private String appointAffirmTime;

	/**
	 * 预约结束时间yyyy-MM-dd HH:mm:ss。用户选择的预约结束时间，用于判断用户是否在预约时间到店服务。
	 */
	@ApiField("appoint_end_time")
	private String appointEndTime;

	/**
	 * 预约开始时间yyyy-MM-dd HH:mm:ss，用户选择的预约开始时间，用于判断用户是否在预约时间到店服务。
	 */
	@ApiField("appoint_start_time")
	private String appointStartTime;

	/**
	 * 预约状态(0-待确认预约 1-确认预约)。有预约流程的订单，门店确认前为待确认预约，门店确认后为 确认预约。
	 */
	@ApiField("appoint_status")
	private Long appointStatus;

	/**
	 * 到店时间yyyy-MM-dd HH:mm:ss。 用户到店时间，用于判断用户是否在预约时间到店服务。
	 */
	@ApiField("arrive_time")
	private String arriveTime;

	/**
	 * ISV订单状态文案。由ISV上传自己订单的状态，用于订单数据的匹配和对账。
	 */
	@ApiField("biz_status_txt")
	private String bizStatusTxt;

	/**
	 * 订单类型，1：洗车，2：保养，4：4s店
	 */
	@ApiField("biz_type")
	private Long bizType;

	/**
	 * 车主平台我的爱车ID。可通过接口查询爱车详情。 请查看alipay.eco.mycar.dataservice.maintainvehicle.share接口。
	 */
	@ApiField("car_id")
	private String carId;

	/**
	 * 服务项列表
	 */
	@ApiListField("order_server_list")
	@ApiField("maintain_biz_order")
	private List<MaintainBizOrder> orderServerList;

	/**
	 * 车主平台业务订单状态
1-未支付；
4-已关闭；
6-支付完成；
7-已出库；
8-已收货； 
11-服务开始；
55-服务完成/已核销；
56-订单完成；
	 */
	@ApiField("order_status")
	private Long orderStatus;

	/**
	 * 原始金额，服务原价累计后金额。金额单位(元)，保留两位小数。
原始金额 = 服务原始价格 * 数量 + 商品售卖价格 * 数量
	 */
	@ApiField("original_cost")
	private String originalCost;

	/**
	 * ISV业务订单号，ISV上传订单场景，由业务方保证唯一
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部门店编号，订单创建时对应的门店的外部编号，要保证编码在车主平台已经创建对应的门店数据，即有与之唯一匹配的车主平台shop_id
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 支付时间yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 交易金额。下单时实际支付金额。金额单位(元)，保留两位小数。
交易金额 = 服务售卖价格 * 数量 + 商品售卖价格 * 数量
	 */
	@ApiField("real_cost")
	private String realCost;

	/**
	 * 车主平台门店编号
	 */
	@ApiField("shop_id")
	private Long shopId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAppointAffirmTime() {
		return this.appointAffirmTime;
	}
	public void setAppointAffirmTime(String appointAffirmTime) {
		this.appointAffirmTime = appointAffirmTime;
	}

	public String getAppointEndTime() {
		return this.appointEndTime;
	}
	public void setAppointEndTime(String appointEndTime) {
		this.appointEndTime = appointEndTime;
	}

	public String getAppointStartTime() {
		return this.appointStartTime;
	}
	public void setAppointStartTime(String appointStartTime) {
		this.appointStartTime = appointStartTime;
	}

	public Long getAppointStatus() {
		return this.appointStatus;
	}
	public void setAppointStatus(Long appointStatus) {
		this.appointStatus = appointStatus;
	}

	public String getArriveTime() {
		return this.arriveTime;
	}
	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}

	public String getBizStatusTxt() {
		return this.bizStatusTxt;
	}
	public void setBizStatusTxt(String bizStatusTxt) {
		this.bizStatusTxt = bizStatusTxt;
	}

	public Long getBizType() {
		return this.bizType;
	}
	public void setBizType(Long bizType) {
		this.bizType = bizType;
	}

	public String getCarId() {
		return this.carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}

	public List<MaintainBizOrder> getOrderServerList() {
		return this.orderServerList;
	}
	public void setOrderServerList(List<MaintainBizOrder> orderServerList) {
		this.orderServerList = orderServerList;
	}

	public Long getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(Long orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOriginalCost() {
		return this.originalCost;
	}
	public void setOriginalCost(String originalCost) {
		this.originalCost = originalCost;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getRealCost() {
		return this.realCost;
	}
	public void setRealCost(String realCost) {
		this.realCost = realCost;
	}

	public Long getShopId() {
		return this.shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
