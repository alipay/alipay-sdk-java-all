package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发起代扣
 *
 * @author auto create
 * @since 1.0, 2023-03-08 14:28:17
 */
public class AlipayCommerceTransportVehicleownerSettlementApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7184187685738872416L;

	/**
	 * 阿里门店编号
	 */
	@ApiField("alipay_store_id")
	private String alipayStoreId;

	/**
	 * 银行追款场景数据
	 */
	@ApiField("bank_repay_data")
	private BankRepayData bankRepayData;

	/**
	 * 业务扣款协议号，由用户申请办理时生成并同步给外部；ETC卡号、车牌号码、OBU设备号、扣款协议号四者不能同时为空。
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/**
	 * 交易场景:
HIGHWAY 高速场景;
PARKING 车场停车场景;
PARKING_SPACE 车位停车场景; 
GAS 加油场景;
BRIDGE 路桥场景;
BANK_REPAY_SETTLE 银行追款;
	 */
	@ApiField("biz_scene_code")
	private String bizSceneCode;

	/**
	 * 业务数据json
	 */
	@ApiField("business_params")
	private String businessParams;

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
	 * 禁用渠道,用户不可用指定渠道支付，多个渠道以逗号分割 
注，与enable_pay_channels互斥 
渠道列表：https://docs.open.alipay.com/common/wifww7
	 */
	@ApiField("disable_pay_channels")
	private String disablePayChannels;

	/**
	 * 参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。
	 */
	@ApiField("discountable_amount")
	private String discountableAmount;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 高速场景，该值必传
	 */
	@ApiField("highway_data")
	private HighwaySceneData highwayData;

	/**
	 * 商户操作员编号
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 外部订单号,商户端唯一
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

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
	 * 卖家的支付宝UID 如果该值为空，则默认为商户 签约账号对应的支付宝用户ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 结算描述信息
	 */
	@ApiField("settle_info")
	private VehicleSettleInfo settleInfo;

	/**
	 * 商户门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 商户终端机具编号
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/**
	 * 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

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

	public String getAlipayStoreId() {
		return this.alipayStoreId;
	}
	public void setAlipayStoreId(String alipayStoreId) {
		this.alipayStoreId = alipayStoreId;
	}

	public BankRepayData getBankRepayData() {
		return this.bankRepayData;
	}
	public void setBankRepayData(BankRepayData bankRepayData) {
		this.bankRepayData = bankRepayData;
	}

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

	public String getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
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

	public String getDisablePayChannels() {
		return this.disablePayChannels;
	}
	public void setDisablePayChannels(String disablePayChannels) {
		this.disablePayChannels = disablePayChannels;
	}

	public String getDiscountableAmount() {
		return this.discountableAmount;
	}
	public void setDiscountableAmount(String discountableAmount) {
		this.discountableAmount = discountableAmount;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public HighwaySceneData getHighwayData() {
		return this.highwayData;
	}
	public void setHighwayData(HighwaySceneData highwayData) {
		this.highwayData = highwayData;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
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

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public VehicleSettleInfo getSettleInfo() {
		return this.settleInfo;
	}
	public void setSettleInfo(VehicleSettleInfo settleInfo) {
		this.settleInfo = settleInfo;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTerminalId() {
		return this.terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
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
