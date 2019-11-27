package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 高速ETC行程上传
 *
 * @author auto create
 * @since 1.0, 2019-09-25 11:29:07
 */
public class AlipayCommerceTransportVehicleownerTripUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5388549665915552556L;

	/**
	 * 业务扣款协议号，由用户申请办理时生成并同步给外部；ETC卡号、车牌号码、OBU设备号、扣款协议号四者不能同时为空。
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/**
	 * 交易场景: 

HW_INDIRECT 高速间联场景;
HIGHWAY 高速场景; 
PARKING 车场停车场景; 
PARKING_SPACE 车位停车场景; 
GAS 加油场景; 
BRIDGE 路桥场景;
	 */
	@ApiField("biz_scene_code")
	private String bizSceneCode;

	/**
	 * ETC卡号；扣款协议号、车牌号码、ETC卡号和OBU设备号四者不能同时为空。
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * OBU设备号；扣款协议号、车牌号码、ETC卡号和OBU设备号四者不能同时为空。
	 */
	@ApiField("device_no")
	private String deviceNo;

	/**
	 * 参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。
	 */
	@ApiField("discountable_amount")
	private String discountableAmount;

	/**
	 * 高速场景、高速间连场景，该值必传
	 */
	@ApiField("highway_data")
	private HighwaySceneData highwayData;

	/**
	 * 间连银行是否已垫付
	 */
	@ApiField("is_bank_payed")
	private Boolean isBankPayed;

	/**
	 * 外部订单号,商户端唯一
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 是否支付成功，true代表成功
	 */
	@ApiField("pay_status")
	private Boolean payStatus;

	/**
	 * 车牌颜色： 
0：蓝；
1：黄；
2：黑；
3：白；
4：绿
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号。仅包括省份+车牌，不包括特殊字符。
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 不参与优惠计算的金额，单位 为元，精确到小数点后两位 ，取值范围 [0.01,100000000]。如果该值 未传入，但传入了【订单总金 额】和【可打折金额】，则该 值默认为【订单总金额】-【 可打折金额】
	 */
	@ApiField("undiscountable_amount")
	private String undiscountableAmount;

	public String getBizAgreementNo() {
		return this.bizAgreementNo;
	}
	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}

	public String getBizSceneCode() {
		return this.bizSceneCode;
	}
	public void setBizSceneCode(String bizSceneCode) {
		this.bizSceneCode = bizSceneCode;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getDeviceNo() {
		return this.deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getDiscountableAmount() {
		return this.discountableAmount;
	}
	public void setDiscountableAmount(String discountableAmount) {
		this.discountableAmount = discountableAmount;
	}

	public HighwaySceneData getHighwayData() {
		return this.highwayData;
	}
	public void setHighwayData(HighwaySceneData highwayData) {
		this.highwayData = highwayData;
	}

	public Boolean getIsBankPayed() {
		return this.isBankPayed;
	}
	public void setIsBankPayed(Boolean isBankPayed) {
		this.isBankPayed = isBankPayed;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public Boolean getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(Boolean payStatus) {
		this.payStatus = payStatus;
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

	public String getUndiscountableAmount() {
		return this.undiscountableAmount;
	}
	public void setUndiscountableAmount(String undiscountableAmount) {
		this.undiscountableAmount = undiscountableAmount;
	}

}
