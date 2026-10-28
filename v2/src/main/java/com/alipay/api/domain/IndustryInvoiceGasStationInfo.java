package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加油站特定要素明细
 *
 * @author auto create
 * @since 1.0, 2026-10-20 15:05:47
 */
public class IndustryInvoiceGasStationInfo extends AlipayObject {

	private static final long serialVersionUID = 8221674356548921521L;

	/**
	 * 支付渠道
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 加油枪号
	 */
	@ApiField("gas_gun_no")
	private String gasGunNo;

	/**
	 * 加油站站点名称
	 */
	@ApiField("gas_station_name")
	private String gasStationName;

	/**
	 * 加油站纳税人识别号
	 */
	@ApiField("gas_station_tax_no")
	private String gasStationTaxNo;

	/**
	 * 开票触发方式
	 */
	@ApiField("invoice_trigger_type")
	private String invoiceTriggerType;

	/**
	 * 金额，最多2位小数，最大18位，单位元
	 */
	@ApiField("item_amount")
	private String itemAmount;

	/**
	 * 数量，最大长度25位
	 */
	@ApiField("item_num")
	private String itemNum;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 支付时间，格式必须是"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 车牌号码
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 对应发票明细序号
	 */
	@ApiField("related_item_serial_no")
	private Long relatedItemSerialNo;

	/**
	 * 序号
	 */
	@ApiField("serial_no")
	private Long serialNo;

	/**
	 * 交易流水号： 销售管理系统或者相关业务系统中的业务订单号，需长期保存用以支持税务事后抽查。支付宝收单交易建议使用账单信息中的商家订单号
	 */
	@ApiField("trade_biz_no")
	private String tradeBizNo;

	/**
	 * 交易（支付）单号： 支付机构的支付流水号，支付宝交易请使用账单详情中的订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 仅当 channel_type=ALIPAY 且为转账场景时必填； 非转账场景不填
	 */
	@ApiField("trade_product")
	private String tradeProduct;

	/**
	 * 单价，最大长度25位，单位元
	 */
	@ApiField("unit_price")
	private String unitPrice;

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getGasGunNo() {
		return this.gasGunNo;
	}
	public void setGasGunNo(String gasGunNo) {
		this.gasGunNo = gasGunNo;
	}

	public String getGasStationName() {
		return this.gasStationName;
	}
	public void setGasStationName(String gasStationName) {
		this.gasStationName = gasStationName;
	}

	public String getGasStationTaxNo() {
		return this.gasStationTaxNo;
	}
	public void setGasStationTaxNo(String gasStationTaxNo) {
		this.gasStationTaxNo = gasStationTaxNo;
	}

	public String getInvoiceTriggerType() {
		return this.invoiceTriggerType;
	}
	public void setInvoiceTriggerType(String invoiceTriggerType) {
		this.invoiceTriggerType = invoiceTriggerType;
	}

	public String getItemAmount() {
		return this.itemAmount;
	}
	public void setItemAmount(String itemAmount) {
		this.itemAmount = itemAmount;
	}

	public String getItemNum() {
		return this.itemNum;
	}
	public void setItemNum(String itemNum) {
		this.itemNum = itemNum;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public Long getRelatedItemSerialNo() {
		return this.relatedItemSerialNo;
	}
	public void setRelatedItemSerialNo(Long relatedItemSerialNo) {
		this.relatedItemSerialNo = relatedItemSerialNo;
	}

	public Long getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(Long serialNo) {
		this.serialNo = serialNo;
	}

	public String getTradeBizNo() {
		return this.tradeBizNo;
	}
	public void setTradeBizNo(String tradeBizNo) {
		this.tradeBizNo = tradeBizNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeProduct() {
		return this.tradeProduct;
	}
	public void setTradeProduct(String tradeProduct) {
		this.tradeProduct = tradeProduct;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
