package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FuelVoucherInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.gas.order.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-18 16:21:25
 */
public class AlipayCommerceGasOrderDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8366546955431288939L;

	/** 
	 * 订单使用的支付宝券信息
	 */
	@ApiField("alipay_voucher")
	private FuelVoucherInfo alipayVoucher;

	/** 
	 * 订单的直降金额 单位分
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/** 
	 * 订单选择的油品类型
	 */
	@ApiField("gas_type")
	private String gasType;

	/** 
	 * 商家订单号
	 */
	@ApiField("merchant_order_id")
	private String merchantOrderId;

	/** 
	 * 订单选择的油枪
	 */
	@ApiField("nozzle_number")
	private String nozzleNumber;

	/** 
	 * 订单的总金额 单位分
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/** 
	 * 订单需要支付的金额，单位分
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 订单的服务费
	 */
	@ApiField("service_amount")
	private String serviceAmount;

	/** 
	 * 油站的唯一编号
	 */
	@ApiField("station_code")
	private String stationCode;

	/** 
	 * 订单各种状态 WAIT_PAY 待支付 CLOSE 关闭 PAY 支付完成 FINISH 加油完成 REFUNDING 退款中 REFUND 已退款
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 用户唯一id
	 */
	@ApiField("user_unique_id")
	private String userUniqueId;

	public void setAlipayVoucher(FuelVoucherInfo alipayVoucher) {
		this.alipayVoucher = alipayVoucher;
	}
	public FuelVoucherInfo getAlipayVoucher( ) {
		return this.alipayVoucher;
	}

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getDiscountAmount( ) {
		return this.discountAmount;
	}

	public void setGasType(String gasType) {
		this.gasType = gasType;
	}
	public String getGasType( ) {
		return this.gasType;
	}

	public void setMerchantOrderId(String merchantOrderId) {
		this.merchantOrderId = merchantOrderId;
	}
	public String getMerchantOrderId( ) {
		return this.merchantOrderId;
	}

	public void setNozzleNumber(String nozzleNumber) {
		this.nozzleNumber = nozzleNumber;
	}
	public String getNozzleNumber( ) {
		return this.nozzleNumber;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrderAmount( ) {
		return this.orderAmount;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount( ) {
		return this.payAmount;
	}

	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}
	public String getServiceAmount( ) {
		return this.serviceAmount;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	public String getStationCode( ) {
		return this.stationCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setUserUniqueId(String userUniqueId) {
		this.userUniqueId = userUniqueId;
	}
	public String getUserUniqueId( ) {
		return this.userUniqueId;
	}

}
