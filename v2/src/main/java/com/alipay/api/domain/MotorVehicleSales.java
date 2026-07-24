package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机动车销售统一发票明细
 *
 * @author auto create
 * @since 1.0, 2026-03-26 10:27:44
 */
public class MotorVehicleSales extends AlipayObject {

	private static final long serialVersionUID = 5743368468573921746L;

	/**
	 * 金额，单位：元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 购方名称
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/**
	 * 购方组织机构代码
	 */
	@ApiField("buyer_org_code")
	private String buyerOrgCode;

	/**
	 * 购方纳税人识别号；税号/身份证号
	 */
	@ApiField("buyer_tax_no")
	private String buyerTaxNo;

	/**
	 * 合格证号
	 */
	@ApiField("certificate_no")
	private String certificateNo;

	/**
	 * 发动机号码
	 */
	@ApiField("engine_no")
	private String engineNo;

	/**
	 * 厂牌型号
	 */
	@ApiField("factory_model")
	private String factoryModel;

	/**
	 * 进口证明书号
	 */
	@ApiField("import_proof_no")
	private String importProofNo;

	/**
	 * 商检单号
	 */
	@ApiField("inspection_no")
	private String inspectionNo;

	/**
	 * 机器编号
	 */
	@ApiField("machine_no")
	private String machineNo;

	/**
	 * 产地
	 */
	@ApiField("origin_place")
	private String originPlace;

	/**
	 * 限乘人数
	 */
	@ApiField("passenger_capacity")
	private String passengerCapacity;

	/**
	 * 完税凭证号码
	 */
	@ApiField("payment_voucher_no")
	private String paymentVoucherNo;

	/**
	 * 销方账户
	 */
	@ApiField("seller_account")
	private String sellerAccount;

	/**
	 * 销方地址
	 */
	@ApiField("seller_address")
	private String sellerAddress;

	/**
	 * 销方开户银行
	 */
	@ApiField("seller_bank")
	private String sellerBank;

	/**
	 * 销货单位名称
	 */
	@ApiField("seller_name")
	private String sellerName;

	/**
	 * 销货单位纳税人识别号
	 */
	@ApiField("seller_tax_no")
	private String sellerTaxNo;

	/**
	 * 销货单位电话
	 */
	@ApiField("seller_tel")
	private String sellerTel;

	/**
	 * 税额，单位：元
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/**
	 * 主管税务机关
	 */
	@ApiField("tax_authority")
	private String taxAuthority;

	/**
	 * 主管税务机关代码
	 */
	@ApiField("tax_authority_code")
	private String taxAuthorityCode;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 吨位
	 */
	@ApiField("tonnage")
	private String tonnage;

	/**
	 * 价税合计，单位：元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 车辆识别代号
	 */
	@ApiField("vehicle_identification_no")
	private String vehicleIdentificationNo;

	/**
	 * 车辆类型
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

	/**
	 * 查验时间
	 */
	@ApiField("verify_time")
	private String verifyTime;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBuyerName() {
		return this.buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerOrgCode() {
		return this.buyerOrgCode;
	}
	public void setBuyerOrgCode(String buyerOrgCode) {
		this.buyerOrgCode = buyerOrgCode;
	}

	public String getBuyerTaxNo() {
		return this.buyerTaxNo;
	}
	public void setBuyerTaxNo(String buyerTaxNo) {
		this.buyerTaxNo = buyerTaxNo;
	}

	public String getCertificateNo() {
		return this.certificateNo;
	}
	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}

	public String getEngineNo() {
		return this.engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getFactoryModel() {
		return this.factoryModel;
	}
	public void setFactoryModel(String factoryModel) {
		this.factoryModel = factoryModel;
	}

	public String getImportProofNo() {
		return this.importProofNo;
	}
	public void setImportProofNo(String importProofNo) {
		this.importProofNo = importProofNo;
	}

	public String getInspectionNo() {
		return this.inspectionNo;
	}
	public void setInspectionNo(String inspectionNo) {
		this.inspectionNo = inspectionNo;
	}

	public String getMachineNo() {
		return this.machineNo;
	}
	public void setMachineNo(String machineNo) {
		this.machineNo = machineNo;
	}

	public String getOriginPlace() {
		return this.originPlace;
	}
	public void setOriginPlace(String originPlace) {
		this.originPlace = originPlace;
	}

	public String getPassengerCapacity() {
		return this.passengerCapacity;
	}
	public void setPassengerCapacity(String passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	public String getPaymentVoucherNo() {
		return this.paymentVoucherNo;
	}
	public void setPaymentVoucherNo(String paymentVoucherNo) {
		this.paymentVoucherNo = paymentVoucherNo;
	}

	public String getSellerAccount() {
		return this.sellerAccount;
	}
	public void setSellerAccount(String sellerAccount) {
		this.sellerAccount = sellerAccount;
	}

	public String getSellerAddress() {
		return this.sellerAddress;
	}
	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}

	public String getSellerBank() {
		return this.sellerBank;
	}
	public void setSellerBank(String sellerBank) {
		this.sellerBank = sellerBank;
	}

	public String getSellerName() {
		return this.sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerTaxNo() {
		return this.sellerTaxNo;
	}
	public void setSellerTaxNo(String sellerTaxNo) {
		this.sellerTaxNo = sellerTaxNo;
	}

	public String getSellerTel() {
		return this.sellerTel;
	}
	public void setSellerTel(String sellerTel) {
		this.sellerTel = sellerTel;
	}

	public String getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTaxAuthority() {
		return this.taxAuthority;
	}
	public void setTaxAuthority(String taxAuthority) {
		this.taxAuthority = taxAuthority;
	}

	public String getTaxAuthorityCode() {
		return this.taxAuthorityCode;
	}
	public void setTaxAuthorityCode(String taxAuthorityCode) {
		this.taxAuthorityCode = taxAuthorityCode;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getTonnage() {
		return this.tonnage;
	}
	public void setTonnage(String tonnage) {
		this.tonnage = tonnage;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getVehicleIdentificationNo() {
		return this.vehicleIdentificationNo;
	}
	public void setVehicleIdentificationNo(String vehicleIdentificationNo) {
		this.vehicleIdentificationNo = vehicleIdentificationNo;
	}

	public String getVehicleType() {
		return this.vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVerifyTime() {
		return this.verifyTime;
	}
	public void setVerifyTime(String verifyTime) {
		this.verifyTime = verifyTime;
	}

}
