package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 续保订单信息
 *
 * @author auto create
 * @since 1.0, 2026-04-23 20:19:43
 */
public class CarInsuranceRenewalOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 6861274396253288261L;

	/**
	 * 地级市的城市码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 商业险金额（单位：元，精确到分）
	 */
	@ApiField("commercial_insurance_amount")
	private String commercialInsuranceAmount;

	/**
	 * 交强险金额（单位：元，精确到分）
	 */
	@ApiField("compulsory_insurance_amount")
	private String compulsoryInsuranceAmount;

	/**
	 * 车辆能源类型，新能源包含纯电、插电混合、增程
	 */
	@ApiField("energy_type")
	private String energyType;

	/**
	 * 发动机号
	 */
	@ApiField("engine_no")
	private String engineNo;

	/**
	 * 保司名称
	 */
	@ApiField("insurance_company_name")
	private String insuranceCompanyName;

	/**
	 * 订单金额（单位：元，精确到分）
应为交强险金额+商业险金额
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 保险单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 推广门店ID
	 */
	@ApiField("promotion_store_id")
	private String promotionStoreId;

	/**
	 * 推广门店名称
	 */
	@ApiField("promotion_store_name")
	private String promotionStoreName;

	/**
	 * 车辆注册日期（YYYY-MM-DD格式）
	 */
	@ApiField("register_date")
	private String registerDate;

	/**
	 * 统一社会信用代码（Unified Social Credit Code）
	 */
	@ApiField("uscc")
	private String uscc;

	/**
	 * 车辆使用性质
	 */
	@ApiField("use_type")
	private String useType;

	/**
	 * 车型名称
	 */
	@ApiField("veh_model_name")
	private String vehModelName;

	/**
	 * 车主身份证号
	 */
	@ApiField("veh_owner_id_card_no")
	private String vehOwnerIdCardNo;

	/**
	 * 车主姓名
	 */
	@ApiField("veh_owner_name")
	private String vehOwnerName;

	/**
	 * 车主手机号
	 */
	@ApiField("veh_owner_phone")
	private String vehOwnerPhone;

	/**
	 * 车牌号
	 */
	@ApiField("vi_number")
	private String viNumber;

	/**
	 * 车架号（VIN码）
	 */
	@ApiField("vin")
	private String vin;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCommercialInsuranceAmount() {
		return this.commercialInsuranceAmount;
	}
	public void setCommercialInsuranceAmount(String commercialInsuranceAmount) {
		this.commercialInsuranceAmount = commercialInsuranceAmount;
	}

	public String getCompulsoryInsuranceAmount() {
		return this.compulsoryInsuranceAmount;
	}
	public void setCompulsoryInsuranceAmount(String compulsoryInsuranceAmount) {
		this.compulsoryInsuranceAmount = compulsoryInsuranceAmount;
	}

	public String getEnergyType() {
		return this.energyType;
	}
	public void setEnergyType(String energyType) {
		this.energyType = energyType;
	}

	public String getEngineNo() {
		return this.engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getInsuranceCompanyName() {
		return this.insuranceCompanyName;
	}
	public void setInsuranceCompanyName(String insuranceCompanyName) {
		this.insuranceCompanyName = insuranceCompanyName;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getPromotionStoreId() {
		return this.promotionStoreId;
	}
	public void setPromotionStoreId(String promotionStoreId) {
		this.promotionStoreId = promotionStoreId;
	}

	public String getPromotionStoreName() {
		return this.promotionStoreName;
	}
	public void setPromotionStoreName(String promotionStoreName) {
		this.promotionStoreName = promotionStoreName;
	}

	public String getRegisterDate() {
		return this.registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

	public String getUseType() {
		return this.useType;
	}
	public void setUseType(String useType) {
		this.useType = useType;
	}

	public String getVehModelName() {
		return this.vehModelName;
	}
	public void setVehModelName(String vehModelName) {
		this.vehModelName = vehModelName;
	}

	public String getVehOwnerIdCardNo() {
		return this.vehOwnerIdCardNo;
	}
	public void setVehOwnerIdCardNo(String vehOwnerIdCardNo) {
		this.vehOwnerIdCardNo = vehOwnerIdCardNo;
	}

	public String getVehOwnerName() {
		return this.vehOwnerName;
	}
	public void setVehOwnerName(String vehOwnerName) {
		this.vehOwnerName = vehOwnerName;
	}

	public String getVehOwnerPhone() {
		return this.vehOwnerPhone;
	}
	public void setVehOwnerPhone(String vehOwnerPhone) {
		this.vehOwnerPhone = vehOwnerPhone;
	}

	public String getViNumber() {
		return this.viNumber;
	}
	public void setViNumber(String viNumber) {
		this.viNumber = viNumber;
	}

	public String getVin() {
		return this.vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}

}
