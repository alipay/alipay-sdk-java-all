package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贷后订单信息保存
 *
 * @author auto create
 * @since 1.0, 2021-08-09 17:37:14
 */
public class MybankCreditSupplychainFactoringAfterloaninfoSaveModel extends AlipayObject {

	private static final long serialVersionUID = 7481648267834251228L;

	/**
	 * 是否激活: 
激活 ACTIVATED,
未激活 NOT_ACTIVATE,
其他 OTHER,
	 */
	@ApiField("activate_state")
	private String activateState;

	/**
	 * 激活日期 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("activate_time")
	private String activateTime;

	/**
	 * U享订单号
	 */
	@ApiField("biz_order_no")
	private String bizOrderNo;

	/**
	 * isv支付宝id
	 */
	@ApiField("buyer_alipay_id")
	private String buyerAlipayId;

	/**
	 * 手机型号、设备名称
	 */
	@ApiField("equipment_name")
	private String equipmentName;

	/**
	 * 设备唯一识别码、手机imei
	 */
	@ApiField("equipment_no")
	private String equipmentNo;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 发票编号
	 */
	@ApiField("invoice_number")
	private String invoiceNumber;

	/**
	 * 物流单号
	 */
	@ApiField("logistics_order_no")
	private String logisticsOrderNo;

	/**
	 * 订单状态 :
交易成功 TRADE_SUCCESS,
退款成功 REFUND_SUCCESS,
其它 OTHER,
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 交易订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 预授权冻结时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("preauth_freeze_time")
	private String preauthFreezeTime;

	/**
	 * 门店支付宝登录号
	 */
	@ApiField("seller_login_id")
	private String sellerLoginId;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 门店编号
	 */
	@ApiField("store_no")
	private String storeNo;

	/**
	 * 分期数，6/12/24
	 */
	@ApiField("term")
	private String term;

	/**
	 * 订单金额 (单位元，保留2位小数)
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getActivateState() {
		return this.activateState;
	}
	public void setActivateState(String activateState) {
		this.activateState = activateState;
	}

	public String getActivateTime() {
		return this.activateTime;
	}
	public void setActivateTime(String activateTime) {
		this.activateTime = activateTime;
	}

	public String getBizOrderNo() {
		return this.bizOrderNo;
	}
	public void setBizOrderNo(String bizOrderNo) {
		this.bizOrderNo = bizOrderNo;
	}

	public String getBuyerAlipayId() {
		return this.buyerAlipayId;
	}
	public void setBuyerAlipayId(String buyerAlipayId) {
		this.buyerAlipayId = buyerAlipayId;
	}

	public String getEquipmentName() {
		return this.equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getEquipmentNo() {
		return this.equipmentNo;
	}
	public void setEquipmentNo(String equipmentNo) {
		this.equipmentNo = equipmentNo;
	}

	public String getExtData() {
		return this.extData;
	}
	public void setExtData(String extData) {
		this.extData = extData;
	}

	public String getInvoiceNumber() {
		return this.invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getLogisticsOrderNo() {
		return this.logisticsOrderNo;
	}
	public void setLogisticsOrderNo(String logisticsOrderNo) {
		this.logisticsOrderNo = logisticsOrderNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPreauthFreezeTime() {
		return this.preauthFreezeTime;
	}
	public void setPreauthFreezeTime(String preauthFreezeTime) {
		this.preauthFreezeTime = preauthFreezeTime;
	}

	public String getSellerLoginId() {
		return this.sellerLoginId;
	}
	public void setSellerLoginId(String sellerLoginId) {
		this.sellerLoginId = sellerLoginId;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreNo() {
		return this.storeNo;
	}
	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}

	public String getTerm() {
		return this.term;
	}
	public void setTerm(String term) {
		this.term = term;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
