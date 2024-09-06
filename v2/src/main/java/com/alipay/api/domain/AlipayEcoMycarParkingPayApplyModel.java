package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车交易受理咨询API
 *
 * @author auto create
 * @since 1.0, 2023-11-30 15:07:52
 */
public class AlipayEcoMycarParkingPayApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1272324172181161731L;

	/**
	 * 进场时间(格式"YYYY-MM-DD HH:mm:ss"，24小时制)
	 */
	@ApiField("in_time")
	private String inTime;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部进场流水号，与serial_no不能同时为空
	 */
	@ApiField("out_serial_no")
	private String outSerialNo;

	/**
	 * 出场时间(格式"YYYY-MM-DD HH:mm:ss"，24小时制)
	 */
	@ApiField("out_time")
	private String outTime;

	/**
	 * 支付宝车场ID
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 支付场景（PLATE_PAY：OCR识别车牌代扣。ETC_PAY：ETC识别车牌代扣。
	 */
	@ApiField("pay_scene")
	private String payScene;

	/**
	 * 车牌颜色：
BLUE("BLUE", "蓝色" );
GREEN("GREEN", "绿色" );
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 营销对象
	 */
	@ApiField("promo")
	private ParkingOrderPromo promo;

	/**
	 * 收款人支付宝账号
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 进场流水号，与out_serial_no不能同时为空
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 订单标题，描述订单用途
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单金额(元)，精确到小数点后两位
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getInTime() {
		return this.inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
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

	public String getPayScene() {
		return this.payScene;
	}
	public void setPayScene(String payScene) {
		this.payScene = payScene;
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

	public ParkingOrderPromo getPromo() {
		return this.promo;
	}
	public void setPromo(ParkingOrderPromo promo) {
		this.promo = promo;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
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

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
