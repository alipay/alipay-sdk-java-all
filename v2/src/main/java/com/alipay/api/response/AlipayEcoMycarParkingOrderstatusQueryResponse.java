package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.orderstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:53
 */
public class AlipayEcoMycarParkingOrderstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1575353127424646623L;

	/** 
	 * 支付宝交易流水号订单
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/** 
	 * 车平台订单
	 */
	@ApiField("car_order_id")
	private String carOrderId;

	/** 
	 * 设备商订单id
	 */
	@ApiField("equipment_order_id")
	private String equipmentOrderId;

	/** 
	 * 支付金额
	 */
	@ApiField("pay_money")
	private String payMoney;

	/** 
	 * 支付状态
	 */
	@ApiField("pay_status")
	private String payStatus;

	/** 
	 * 支付的时间
	 */
	@ApiField("pay_time")
	private String payTime;

	/** 
	 * 支付方式（1为支付宝在线缴费，2为支付宝代扣缴费）
	 */
	@ApiField("pay_type")
	private String payType;

	/** 
	 * 返回状态(1为成功,0为失败)
	 */
	@ApiField("status")
	private String status;

	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}
	public String getAlipayOrderId( ) {
		return this.alipayOrderId;
	}

	public void setCarOrderId(String carOrderId) {
		this.carOrderId = carOrderId;
	}
	public String getCarOrderId( ) {
		return this.carOrderId;
	}

	public void setEquipmentOrderId(String equipmentOrderId) {
		this.equipmentOrderId = equipmentOrderId;
	}
	public String getEquipmentOrderId( ) {
		return this.equipmentOrderId;
	}

	public void setPayMoney(String payMoney) {
		this.payMoney = payMoney;
	}
	public String getPayMoney( ) {
		return this.payMoney;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getPayStatus( ) {
		return this.payStatus;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getPayTime( ) {
		return this.payTime;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getPayType( ) {
		return this.payType;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
