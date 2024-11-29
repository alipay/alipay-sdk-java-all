package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车缴费代扣接口API
 *
 * @author auto create
 * @since 1.0, 2022-11-16 14:53:50
 */
public class AlipayEcoMycarParkingOrderPayModel extends AlipayObject {

	private static final long serialVersionUID = 5837868456833188135L;

	/**
	 * 先离后付订单：true；
普通先付后离订单：false
	 */
	@ApiField("after_pay_order")
	private Boolean afterPayOrder;

	/**
	 * 代扣返佣的支付宝用户号。
以2088开头的纯16位数。
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 计费时长(以分为单位)
	 */
	@ApiField("billing_duration")
	private String billingDuration;

	/**
	 * 订单描述
	 */
	@ApiField("body")
	private String body;

	/**
	 * 车牌，需要进行停车缴费代扣的车辆牌照
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 车牌颜色，可选蓝-BLUE、绿-GREEN、黄-YELLOW、白-WHITE、黑-BLACK、黄绿色-LIMEGREEN
	 */
	@ApiField("car_number_color")
	private String carNumberColor;

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
	 * 车场服务商指定是否开启垫付功能（若需开启，须实现签约支付宝停车垫资协议）：
true开启，
false不开启(默认)
	 */
	@ApiField("is_advance")
	private Boolean isAdvance;

	/**
	 * ISV停车场ID，由ISV定义的停车场标识，系统唯一，必填
	 */
	@ApiField("out_parking_id")
	private String outParkingId;

	/**
	 * 出场时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("out_time")
	private String outTime;

	/**
	 * 支付宝合作商户网站唯一订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付宝停车平台ID，由支付宝定义的该停车场标识，系统唯一, 必填
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 代扣场景，PLATE_PAY：OCR识别车牌代扣。ETC_PAY：ETC识别车牌代扣。
	 */
	@ApiField("pay_scene")
	private String payScene;

	/**
	 * 版本号,最新版本为：3.0
	 */
	@ApiField("pay_version")
	private String payVersion;

	/**
	 * 卖家支付宝用户号
卖家支付宝账号对应的支付宝唯一用户号。
以2088开头的纯16位数。
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 卖家支付宝账号，可以为email或者手机号。
如果seller_id不为空，则以seller_id的值作为卖家账号，忽略本参数。
	 */
	@ApiField("seller_logon_id")
	private String sellerLogonId;

	/**
	 * 支付宝业务流水号，用于记录车辆从驶入到驶出的全流程
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 订单标题，描述订单用途
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单金额，精确到小数点后两位
	 */
	@ApiField("total_fee")
	private String totalFee;

	public Boolean getAfterPayOrder() {
		return this.afterPayOrder;
	}
	public void setAfterPayOrder(Boolean afterPayOrder) {
		this.afterPayOrder = afterPayOrder;
	}

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getBillingDuration() {
		return this.billingDuration;
	}
	public void setBillingDuration(String billingDuration) {
		this.billingDuration = billingDuration;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarNumberColor() {
		return this.carNumberColor;
	}
	public void setCarNumberColor(String carNumberColor) {
		this.carNumberColor = carNumberColor;
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

	public Boolean getIsAdvance() {
		return this.isAdvance;
	}
	public void setIsAdvance(Boolean isAdvance) {
		this.isAdvance = isAdvance;
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

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

	public String getPayScene() {
		return this.payScene;
	}
	public void setPayScene(String payScene) {
		this.payScene = payScene;
	}

	public String getPayVersion() {
		return this.payVersion;
	}
	public void setPayVersion(String payVersion) {
		this.payVersion = payVersion;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerLogonId() {
		return this.sellerLogonId;
	}
	public void setSellerLogonId(String sellerLogonId) {
		this.sellerLogonId = sellerLogonId;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

}
