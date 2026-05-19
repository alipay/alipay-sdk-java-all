package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二手车销售统一发票专用明细
 *
 * @author auto create
 * @since 1.0, 2026-03-26 10:27:44
 */
public class SecondVehicleSales extends AlipayObject {

	private static final long serialVersionUID = 7122187223999599496L;

	/**
	 * 经营、拍卖单位地址
	 */
	@ApiField("auction_address")
	private String auctionAddress;

	/**
	 * 经营、拍卖单位开户银行、账号
	 */
	@ApiField("auction_bank_account")
	private String auctionBankAccount;

	/**
	 * 经营、拍卖单位
	 */
	@ApiField("auction_company")
	private String auctionCompany;

	/**
	 * 经营、拍卖单位电话
	 */
	@ApiField("auction_phone")
	private String auctionPhone;

	/**
	 * 经营、拍卖单位纳税人识别号
	 */
	@ApiField("auction_tax_no")
	private String auctionTaxNo;

	/**
	 * 买方单位地址
	 */
	@ApiField("buyer_address")
	private String buyerAddress;

	/**
	 * 买方电话
	 */
	@ApiField("buyer_phone")
	private String buyerPhone;

	/**
	 * 买方单位/个人
	 */
	@ApiField("buyer_unit")
	private String buyerUnit;

	/**
	 * 买方单位代码；税号/身份证号
	 */
	@ApiField("buyer_unit_code")
	private String buyerUnitCode;

	/**
	 * 车架号
	 */
	@ApiField("chassis_no")
	private String chassisNo;

	/**
	 * 厂牌型号
	 */
	@ApiField("factory_model")
	private String factoryModel;

	/**
	 * 车牌照号
	 */
	@ApiField("license_plate_no")
	private String licensePlateNo;

	/**
	 * 机器编号
	 */
	@ApiField("machine_no")
	private String machineNo;

	/**
	 * 二手车市场地址
	 */
	@ApiField("market_address")
	private String marketAddress;

	/**
	 * 二手车市场银行账号
	 */
	@ApiField("market_bank_account")
	private String marketBankAccount;

	/**
	 * 二手车市场电话
	 */
	@ApiField("market_phone")
	private String marketPhone;

	/**
	 * 二手车市场税号
	 */
	@ApiField("market_tax_no")
	private String marketTaxNo;

	/**
	 * 成品油标志
	 */
	@ApiField("oil_flag")
	private String oilFlag;

	/**
	 * 登记证号
	 */
	@ApiField("registration_cert_no")
	private String registrationCertNo;

	/**
	 * 二手车市场名称
	 */
	@ApiField("second_hand_market")
	private String secondHandMarket;

	/**
	 * 卖方单位地址
	 */
	@ApiField("seller_address")
	private String sellerAddress;

	/**
	 * 卖方电话
	 */
	@ApiField("seller_phone")
	private String sellerPhone;

	/**
	 * 卖方单位/个人
	 */
	@ApiField("seller_unit")
	private String sellerUnit;

	/**
	 * 卖方单位代码；税号/身份证
	 */
	@ApiField("seller_unit_code")
	private String sellerUnitCode;

	/**
	 * 通行费标志
	 */
	@ApiField("toll_flag")
	private String tollFlag;

	/**
	 * 转入地车辆管理所名称
	 */
	@ApiField("transfer_location")
	private String transferLocation;

	/**
	 * 车价合计，单位元
	 */
	@ApiField("vehicle_total_price")
	private String vehicleTotalPrice;

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

	/**
	 * 零税率标志
	 */
	@ApiField("zero_rate_flag")
	private String zeroRateFlag;

	public String getAuctionAddress() {
		return this.auctionAddress;
	}
	public void setAuctionAddress(String auctionAddress) {
		this.auctionAddress = auctionAddress;
	}

	public String getAuctionBankAccount() {
		return this.auctionBankAccount;
	}
	public void setAuctionBankAccount(String auctionBankAccount) {
		this.auctionBankAccount = auctionBankAccount;
	}

	public String getAuctionCompany() {
		return this.auctionCompany;
	}
	public void setAuctionCompany(String auctionCompany) {
		this.auctionCompany = auctionCompany;
	}

	public String getAuctionPhone() {
		return this.auctionPhone;
	}
	public void setAuctionPhone(String auctionPhone) {
		this.auctionPhone = auctionPhone;
	}

	public String getAuctionTaxNo() {
		return this.auctionTaxNo;
	}
	public void setAuctionTaxNo(String auctionTaxNo) {
		this.auctionTaxNo = auctionTaxNo;
	}

	public String getBuyerAddress() {
		return this.buyerAddress;
	}
	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}

	public String getBuyerPhone() {
		return this.buyerPhone;
	}
	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}

	public String getBuyerUnit() {
		return this.buyerUnit;
	}
	public void setBuyerUnit(String buyerUnit) {
		this.buyerUnit = buyerUnit;
	}

	public String getBuyerUnitCode() {
		return this.buyerUnitCode;
	}
	public void setBuyerUnitCode(String buyerUnitCode) {
		this.buyerUnitCode = buyerUnitCode;
	}

	public String getChassisNo() {
		return this.chassisNo;
	}
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String getFactoryModel() {
		return this.factoryModel;
	}
	public void setFactoryModel(String factoryModel) {
		this.factoryModel = factoryModel;
	}

	public String getLicensePlateNo() {
		return this.licensePlateNo;
	}
	public void setLicensePlateNo(String licensePlateNo) {
		this.licensePlateNo = licensePlateNo;
	}

	public String getMachineNo() {
		return this.machineNo;
	}
	public void setMachineNo(String machineNo) {
		this.machineNo = machineNo;
	}

	public String getMarketAddress() {
		return this.marketAddress;
	}
	public void setMarketAddress(String marketAddress) {
		this.marketAddress = marketAddress;
	}

	public String getMarketBankAccount() {
		return this.marketBankAccount;
	}
	public void setMarketBankAccount(String marketBankAccount) {
		this.marketBankAccount = marketBankAccount;
	}

	public String getMarketPhone() {
		return this.marketPhone;
	}
	public void setMarketPhone(String marketPhone) {
		this.marketPhone = marketPhone;
	}

	public String getMarketTaxNo() {
		return this.marketTaxNo;
	}
	public void setMarketTaxNo(String marketTaxNo) {
		this.marketTaxNo = marketTaxNo;
	}

	public String getOilFlag() {
		return this.oilFlag;
	}
	public void setOilFlag(String oilFlag) {
		this.oilFlag = oilFlag;
	}

	public String getRegistrationCertNo() {
		return this.registrationCertNo;
	}
	public void setRegistrationCertNo(String registrationCertNo) {
		this.registrationCertNo = registrationCertNo;
	}

	public String getSecondHandMarket() {
		return this.secondHandMarket;
	}
	public void setSecondHandMarket(String secondHandMarket) {
		this.secondHandMarket = secondHandMarket;
	}

	public String getSellerAddress() {
		return this.sellerAddress;
	}
	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}

	public String getSellerPhone() {
		return this.sellerPhone;
	}
	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}

	public String getSellerUnit() {
		return this.sellerUnit;
	}
	public void setSellerUnit(String sellerUnit) {
		this.sellerUnit = sellerUnit;
	}

	public String getSellerUnitCode() {
		return this.sellerUnitCode;
	}
	public void setSellerUnitCode(String sellerUnitCode) {
		this.sellerUnitCode = sellerUnitCode;
	}

	public String getTollFlag() {
		return this.tollFlag;
	}
	public void setTollFlag(String tollFlag) {
		this.tollFlag = tollFlag;
	}

	public String getTransferLocation() {
		return this.transferLocation;
	}
	public void setTransferLocation(String transferLocation) {
		this.transferLocation = transferLocation;
	}

	public String getVehicleTotalPrice() {
		return this.vehicleTotalPrice;
	}
	public void setVehicleTotalPrice(String vehicleTotalPrice) {
		this.vehicleTotalPrice = vehicleTotalPrice;
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

	public String getZeroRateFlag() {
		return this.zeroRateFlag;
	}
	public void setZeroRateFlag(String zeroRateFlag) {
		this.zeroRateFlag = zeroRateFlag;
	}

}
