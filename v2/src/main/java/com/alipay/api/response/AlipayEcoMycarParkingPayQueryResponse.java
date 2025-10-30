package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.pay.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:53
 */
public class AlipayEcoMycarParkingPayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1549622114642195673L;

	/** 
	 * 业务失败详细错误码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 业务返回码描述
	 */
	@ApiField("biz_msg")
	private String bizMsg;

	/** 
	 * 扣款时间
	 */
	@ApiField("gmt_pay")
	private String gmtPay;

	/** 
	 * SUCCESS("SUCCESS","成功"),
FAIL("FAIL","失败"),
DOING("DOING","交易处理中"),
CANCELING("CANCELING","撤销处理中"),
CANCELED("CANCELED","已撤销"),
REFUNDED("REFUNDED","已退款"),
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 支付宝停车平台订单号
	 */
	@ApiField("parking_order_no")
	private String parkingOrderNo;

	/** 
	 * 车牌颜色，可选蓝-BLUE、绿-GREEN、黄-YELLOW、白-WHITE、黑-BLACK、黄绿色-LIMEGREEN
	 */
	@ApiField("plate_color")
	private String plateColor;

	/** 
	 * 车牌号，入参回传
	 */
	@ApiField("plate_no")
	private String plateNo;

	/** 
	 * 订单金额，单位为元，精确到小数点后两位
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 交易失败原因描述
	 */
	@ApiField("trade_desc")
	private String tradeDesc;

	/** 
	 * 支付宝的唯一交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setBizMsg(String bizMsg) {
		this.bizMsg = bizMsg;
	}
	public String getBizMsg( ) {
		return this.bizMsg;
	}

	public void setGmtPay(String gmtPay) {
		this.gmtPay = gmtPay;
	}
	public String getGmtPay( ) {
		return this.gmtPay;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setParkingOrderNo(String parkingOrderNo) {
		this.parkingOrderNo = parkingOrderNo;
	}
	public String getParkingOrderNo( ) {
		return this.parkingOrderNo;
	}

	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}
	public String getPlateColor( ) {
		return this.plateColor;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public String getPlateNo( ) {
		return this.plateNo;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeDesc(String tradeDesc) {
		this.tradeDesc = tradeDesc;
	}
	public String getTradeDesc( ) {
		return this.tradeDesc;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
