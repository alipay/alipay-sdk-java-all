package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 停车支付信息同步接口
 *
 * @author auto create
 * @since 1.0, 2025-04-22 19:21:18
 */
public class AlipayCommerceTransportParkingPaymentinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8754556496684893149L;

	/**
	 * 支付宝交易号；
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 停车费折扣金额；单位元；
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 停车费缴费折扣信息；
	 */
	@ApiListField("discount_information")
	@ApiField("parking_payment_discount_info")
	private List<ParkingPaymentDiscountInfo> discountInformation;

	/**
	 * 停车场内缴费后，允许出场的免费时长分钟数
	 */
	@ApiField("free_exit_minutes")
	private String freeExitMinutes;

	/**
	 * 365天未使用支付宝付停车费用户
	 */
	@ApiField("inactive_user")
	private Boolean inactiveUser;

	/**
	 * 车牌是否加密，true为加密，false为不加密，默认为false
	 */
	@ApiField("is_encrypt_plate_no")
	private Boolean isEncryptPlateNo;

	/**
	 * 缴费用户的手机号；
	 */
	@ApiField("mobile_number")
	private String mobileNumber;

	/**
	 * 表示当前请求类型：用户缴费或用户在岗亭前缴费准备离场状态
	 */
	@ApiField("node_type")
	private String nodeType;

	/**
	 * 蚂蚁会员统一ID对应的归属应用appid
	 */
	@ApiField("open_appid")
	private String openAppid;

	/**
	 * 蚂蚁会员统一ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 停车岗亭前订单创建时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制，请保证服务器时间准确，创建时不应晚于当前网络时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 服务商停车费支付订单号；
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部停车流水号(用于串通进场与出场信息)
	 */
	@ApiField("out_serial_no")
	private String outSerialNo;

	/**
	 * 用户在支付宝侧支付停车费次数
	 */
	@ApiField("pay_frequency")
	private String payFrequency;

	/**
	 * 停车费实付金额；单位元；
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/**
	 * 场内缴费时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制，请保证服务器时间准确，场内缴费不应晚于当前网络时间
	 */
	@ApiField("payment_time")
	private Date paymentTime;

	/**
	 * 支付方式；
ALIPAY：支付宝
WECHAT：微信
CUQP：云闪付
CASH：现金
OTHER：其他渠道
FREE: 免费
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 停车缴费用户的OPENID；
	 */
	@ApiField("payment_user_open_id")
	private String paymentUserOpenId;

	/**
	 * 车牌颜色，车牌颜色，枚举支持：
*BLUE：蓝。
*GREEN：绿。
*YELLOW：黄。
*WHITE：白。
*BLACK：黑。
*LIMEGREEN：黄绿色。
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号（支持加密格式）
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 停车服务页面地址。
1、服务商停车服务页面地址必须是支付宝小程序URL（无需转换https），详见： <a href="https://opendocs.alipay.com/support/01rb18#URL%20%E6%A0%BC%E5%BC%8F "> https://opendocs.alipay.com/support/01rb18#URL%20%E6%A0%BC%E5%BC%8F  </a>
2、若服务商没有服务链接，可传输支付宝停车官方小程序的服务链接：alipays://platformapi/startapp?appId=2021001102642986&page=pages%2Fparking-fee%2Findex 
3、若此次对接的是无感支付，则服务链接传输为：alipays://platformapi/startapp?appId=2021001102642986&page=%2Fpages%2Fparking-bill%2Findex
	 */
	@ApiField("service_url")
	private String serviceUrl;

	/**
	 * 停车费总金额；单位元；理论应等于实付金额+折扣金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public List<ParkingPaymentDiscountInfo> getDiscountInformation() {
		return this.discountInformation;
	}
	public void setDiscountInformation(List<ParkingPaymentDiscountInfo> discountInformation) {
		this.discountInformation = discountInformation;
	}

	public String getFreeExitMinutes() {
		return this.freeExitMinutes;
	}
	public void setFreeExitMinutes(String freeExitMinutes) {
		this.freeExitMinutes = freeExitMinutes;
	}

	public Boolean getInactiveUser() {
		return this.inactiveUser;
	}
	public void setInactiveUser(Boolean inactiveUser) {
		this.inactiveUser = inactiveUser;
	}

	public Boolean getIsEncryptPlateNo() {
		return this.isEncryptPlateNo;
	}
	public void setIsEncryptPlateNo(Boolean isEncryptPlateNo) {
		this.isEncryptPlateNo = isEncryptPlateNo;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getNodeType() {
		return this.nodeType;
	}
	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public String getOpenAppid() {
		return this.openAppid;
	}
	public void setOpenAppid(String openAppid) {
		this.openAppid = openAppid;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutSerialNo() {
		return this.outSerialNo;
	}
	public void setOutSerialNo(String outSerialNo) {
		this.outSerialNo = outSerialNo;
	}

	public String getPayFrequency() {
		return this.payFrequency;
	}
	public void setPayFrequency(String payFrequency) {
		this.payFrequency = payFrequency;
	}

	public String getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public Date getPaymentTime() {
		return this.paymentTime;
	}
	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}

	public String getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPaymentUserOpenId() {
		return this.paymentUserOpenId;
	}
	public void setPaymentUserOpenId(String paymentUserOpenId) {
		this.paymentUserOpenId = paymentUserOpenId;
	}

	public String getPlateColor() {
		return this.plateColor;
	}
	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
