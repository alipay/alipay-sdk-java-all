package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单同步接口
 *
 * @author auto create
 * @since 1.0, 2024-07-24 11:13:27
 */
public class AlipayEcoMycarParkingOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4149541866244619616L;

	/**
	 * 该笔停车交易需要返佣的对象实体PID，可能是商户，可能是ISV；只做下沉，用于离线表层面对账。
	 */
	@ApiField("agent_pid")
	private String agentPid;

	/**
	 * 车牌
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 如果是停车卡缴费，则填入停车卡卡号，否则为'*'
	 */
	@ApiField("card_number")
	private String cardNumber;

	/**
	 * 停车时长（以分为单位）
	 */
	@ApiField("in_duration")
	private String inDuration;

	/**
	 * 入场时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("in_time")
	private String inTime;

	/**
	 * 应用用户ID，唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝支付流水，系统唯一
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 设备商订单状态，枚举支持：
* 0：成功。
* 1：失败。
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单创建时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("order_time")
	private String orderTime;

	/**
	 * 设备商订单号，由ISV系统生成
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * ISV停车场ID，由ISV定义的停车场标识，同一个isv或商户范围内唯一。需与 <a href="https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create">alipay.eco.mycar.parking.parkinglotinfo.create</a>(录入停车场信息)接口传入值一致。
	 */
	@ApiField("out_parking_id")
	private String outParkingId;

	/**
	 * 出场时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("out_time")
	private String outTime;

	/**
	 * 支付宝停车平台ID，由支付宝定义的该停车场标识，同一个isv或商户范围内唯一。通过 <a href="https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create">alipay.eco.mycar.parking.parkinglotinfo.create</a>(录入停车场信息)接口获取。
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 停车场名称，需与<a href="https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create">alipay.eco.mycar.parking.parkinglotinfo.create</a>(录入停车场信息)接口传入值一致。
	 */
	@ApiField("parking_name")
	private String parkingName;

	/**
	 * 支付宝业务流水号，用于记录车辆从驶入到驶出的全流程。通过 alipay.eco.mycar.parking.enterinfo.sync(车辆驶入接口)接口获取。
	 */
	@ApiField("parking_record_id")
	private String parkingRecordId;

	/**
	 * 缴费金额，保留小数点后两位
	 */
	@ApiField("pay_money")
	private String payMoney;

	/**
	 * 支付场景：INPARKINGLOT_PAY：场内在线缴费；ENTRANCE_EXIT_PAY：出入口缴费、VEH_DEVICE_PAY：车机缴费；会根据场景判断是否发放能量，当前只有场内支付场景会发能量，需要能量发放请与服务接入支持同学提前沟通。
	 */
	@ApiField("pay_scene")
	private String payScene;

	/**
	 * 缴费时间, 格式"YYYYMM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 付款方式，枚举支持：
*1：支付宝在线缴费。
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 间连商户ID
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 停车缴费用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
注意：ISV需保证用户 id的正确性，以免导致用户在停车平台查询不到相关的订单信息。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgentPid() {
		return this.agentPid;
	}
	public void setAgentPid(String agentPid) {
		this.agentPid = agentPid;
	}

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getCardNumber() {
		return this.cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getInDuration() {
		return this.inDuration;
	}
	public void setInDuration(String inDuration) {
		this.inDuration = inDuration;
	}

	public String getInTime() {
		return this.inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutParkingId() {
		return this.outParkingId;
	}
	public void setOutParkingId(String outParkingId) {
		this.outParkingId = outParkingId;
	}

	public String getOutTime() {
		return this.outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

	public String getParkingName() {
		return this.parkingName;
	}
	public void setParkingName(String parkingName) {
		this.parkingName = parkingName;
	}

	public String getParkingRecordId() {
		return this.parkingRecordId;
	}
	public void setParkingRecordId(String parkingRecordId) {
		this.parkingRecordId = parkingRecordId;
	}

	public String getPayMoney() {
		return this.payMoney;
	}
	public void setPayMoney(String payMoney) {
		this.payMoney = payMoney;
	}

	public String getPayScene() {
		return this.payScene;
	}
	public void setPayScene(String payScene) {
		this.payScene = payScene;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
