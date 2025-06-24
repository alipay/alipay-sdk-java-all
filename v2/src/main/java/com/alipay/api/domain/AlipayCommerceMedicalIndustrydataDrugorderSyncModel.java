package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 药品订单回流接口
 *
 * @author auto create
 * @since 1.0, 2025-01-06 16:03:53
 */
public class AlipayCommerceMedicalIndustrydataDrugorderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2325328949132678554L;

	/**
	 * 增值服务信息
	 */
	@ApiListField("add_services")
	@ApiField("add_services_info")
	private List<AddServicesInfo> addServices;

	/**
	 * 支付宝用户openId
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝问诊单id
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * 支付宝处方订单id
	 */
	@ApiField("alipay_prescription_id")
	private String alipayPrescriptionId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 订单备注
	 */
	@ApiField("comments")
	private String comments;

	/**
	 * 药品列表
	 */
	@ApiListField("drug_list")
	@ApiField("platform_drug_info")
	private List<PlatformDrugInfo> drugList;

	/**
	 * 订单创建时间
	 */
	@ApiField("drug_order_create_time")
	private Date drugOrderCreateTime;

	/**
	 * 订单支付时间
	 */
	@ApiField("drug_order_pay_time")
	private Date drugOrderPayTime;

	/**
	 * 应付订单金额
	 */
	@ApiField("drug_order_price")
	private String drugOrderPrice;

	/**
	 * 实付订单金额
	 */
	@ApiField("drug_order_price_real")
	private String drugOrderPriceReal;

	/**
	 * 订单来源 
线上订单 ONLINE/线下订单 OFFLINE
	 */
	@ApiField("drug_order_source")
	private String drugOrderSource;

	/**
	 * 药品订单状态：待发货状态时同步药品订单信息
	 */
	@ApiField("drug_order_status")
	private String drugOrderStatus;

	/**
	 * 外部平台用户id
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 外部药品订单id
	 */
	@ApiField("out_drug_order_id")
	private String outDrugOrderId;

	/**
	 * 外部药品单跳转链接
	 */
	@ApiField("out_drug_order_url")
	private String outDrugOrderUrl;

	/**
	 * 外部问诊单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 外部处方订单id
	 */
	@ApiField("out_prescription_id")
	private String outPrescriptionId;

	/**
	 * 药店id
	 */
	@ApiField("pharmacy_id")
	private String pharmacyId;

	/**
	 * 药店名称
	 */
	@ApiField("pharmacy_name")
	private String pharmacyName;

	/**
	 * 外部平台编号
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 收货人地址
	 */
	@ApiField("receiver_address")
	private String receiverAddress;

	/**
	 * 收货人姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收货人手机号
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	public List<AddServicesInfo> getAddServices() {
		return this.addServices;
	}
	public void setAddServices(List<AddServicesInfo> addServices) {
		this.addServices = addServices;
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}

	public String getAlipayPrescriptionId() {
		return this.alipayPrescriptionId;
	}
	public void setAlipayPrescriptionId(String alipayPrescriptionId) {
		this.alipayPrescriptionId = alipayPrescriptionId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getComments() {
		return this.comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

	public List<PlatformDrugInfo> getDrugList() {
		return this.drugList;
	}
	public void setDrugList(List<PlatformDrugInfo> drugList) {
		this.drugList = drugList;
	}

	public Date getDrugOrderCreateTime() {
		return this.drugOrderCreateTime;
	}
	public void setDrugOrderCreateTime(Date drugOrderCreateTime) {
		this.drugOrderCreateTime = drugOrderCreateTime;
	}

	public Date getDrugOrderPayTime() {
		return this.drugOrderPayTime;
	}
	public void setDrugOrderPayTime(Date drugOrderPayTime) {
		this.drugOrderPayTime = drugOrderPayTime;
	}

	public String getDrugOrderPrice() {
		return this.drugOrderPrice;
	}
	public void setDrugOrderPrice(String drugOrderPrice) {
		this.drugOrderPrice = drugOrderPrice;
	}

	public String getDrugOrderPriceReal() {
		return this.drugOrderPriceReal;
	}
	public void setDrugOrderPriceReal(String drugOrderPriceReal) {
		this.drugOrderPriceReal = drugOrderPriceReal;
	}

	public String getDrugOrderSource() {
		return this.drugOrderSource;
	}
	public void setDrugOrderSource(String drugOrderSource) {
		this.drugOrderSource = drugOrderSource;
	}

	public String getDrugOrderStatus() {
		return this.drugOrderStatus;
	}
	public void setDrugOrderStatus(String drugOrderStatus) {
		this.drugOrderStatus = drugOrderStatus;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getOutDrugOrderId() {
		return this.outDrugOrderId;
	}
	public void setOutDrugOrderId(String outDrugOrderId) {
		this.outDrugOrderId = outDrugOrderId;
	}

	public String getOutDrugOrderUrl() {
		return this.outDrugOrderUrl;
	}
	public void setOutDrugOrderUrl(String outDrugOrderUrl) {
		this.outDrugOrderUrl = outDrugOrderUrl;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getOutPrescriptionId() {
		return this.outPrescriptionId;
	}
	public void setOutPrescriptionId(String outPrescriptionId) {
		this.outPrescriptionId = outPrescriptionId;
	}

	public String getPharmacyId() {
		return this.pharmacyId;
	}
	public void setPharmacyId(String pharmacyId) {
		this.pharmacyId = pharmacyId;
	}

	public String getPharmacyName() {
		return this.pharmacyName;
	}
	public void setPharmacyName(String pharmacyName) {
		this.pharmacyName = pharmacyName;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

}
