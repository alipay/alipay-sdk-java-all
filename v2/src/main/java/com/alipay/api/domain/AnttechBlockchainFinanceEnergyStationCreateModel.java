package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 能源站点创建
 *
 * @author auto create
 * @since 1.0, 2024-09-06 17:16:00
 */
public class AnttechBlockchainFinanceEnergyStationCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3578451844652451521L;

	/**
	 * 站点地址
	 */
	@ApiField("address")
	private EntityAddress address;

	/**
	 * 最大调节持续时间，单位 min
	 */
	@ApiField("adjustable_duration_max")
	private Long adjustableDurationMax;

	/**
	 * 最大可调节的负荷，单位KW
	 */
	@ApiField("adjustable_load_max")
	private String adjustableLoadMax;

	/**
	 * 建设场所
	 */
	@ApiField("construction")
	private String construction;

	/**
	 * 联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系电话
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/**
	 * 最大需量	，单位 KW
	 */
	@ApiField("demand_load_max")
	private String demandLoadMax;

	/**
	 * 用的户号
	 */
	@ApiField("electric_account")
	private String electricAccount;

	/**
	 * 站点投产日期等
	 */
	@ApiField("operate_date")
	private Date operateDate;

	/**
	 * 归属主体
	 */
	@ApiField("owner_entity")
	private TrustEntityInfo ownerEntity;

	/**
	 * 最大削峰负荷，单位 KW
	 */
	@ApiField("peak_shaving_load_max")
	private String peakShavingLoadMax;

	/**
	 * 可信价值服务中心产品的合约码，由蚂蚁业务同学完成签约后给到商户
	 */
	@ApiField("product_agreement_code")
	private String productAgreementCode;

	/**
	 * 总额定功率，单位kw
	 */
	@ApiField("rated_power")
	private String ratedPower;

	/**
	 * 服务电话
	 */
	@ApiField("service_tel")
	private String serviceTel;

	/**
	 * 商户系统中，对应的站点ID等
	 */
	@ApiField("station_id")
	private String stationId;

	/**
	 * 站点名称
	 */
	@ApiField("station_name")
	private String stationName;

	/**
	 * 站点类型
	 */
	@ApiField("station_type")
	private String stationType;

	/**
	 * 变压器负荷上限，单位KW
	 */
	@ApiField("transformer_load_max")
	private String transformerLoadMax;

	/**
	 * 变压器负荷下限，单位 KW
	 */
	@ApiField("transformer_load_min")
	private String transformerLoadMin;

	/**
	 * 最大填谷负荷，单位 KW
	 */
	@ApiField("valley_filling_load_max")
	private String valleyFillingLoadMax;

	/**
	 * 填写的用电户号是否为虚拟户号
	 */
	@ApiField("virtual_account")
	private Boolean virtualAccount;

	/**
	 * 电压等级	，单位 KV
	 */
	@ApiField("voltage_level")
	private String voltageLevel;

	public EntityAddress getAddress() {
		return this.address;
	}
	public void setAddress(EntityAddress address) {
		this.address = address;
	}

	public Long getAdjustableDurationMax() {
		return this.adjustableDurationMax;
	}
	public void setAdjustableDurationMax(Long adjustableDurationMax) {
		this.adjustableDurationMax = adjustableDurationMax;
	}

	public String getAdjustableLoadMax() {
		return this.adjustableLoadMax;
	}
	public void setAdjustableLoadMax(String adjustableLoadMax) {
		this.adjustableLoadMax = adjustableLoadMax;
	}

	public String getConstruction() {
		return this.construction;
	}
	public void setConstruction(String construction) {
		this.construction = construction;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getDemandLoadMax() {
		return this.demandLoadMax;
	}
	public void setDemandLoadMax(String demandLoadMax) {
		this.demandLoadMax = demandLoadMax;
	}

	public String getElectricAccount() {
		return this.electricAccount;
	}
	public void setElectricAccount(String electricAccount) {
		this.electricAccount = electricAccount;
	}

	public Date getOperateDate() {
		return this.operateDate;
	}
	public void setOperateDate(Date operateDate) {
		this.operateDate = operateDate;
	}

	public TrustEntityInfo getOwnerEntity() {
		return this.ownerEntity;
	}
	public void setOwnerEntity(TrustEntityInfo ownerEntity) {
		this.ownerEntity = ownerEntity;
	}

	public String getPeakShavingLoadMax() {
		return this.peakShavingLoadMax;
	}
	public void setPeakShavingLoadMax(String peakShavingLoadMax) {
		this.peakShavingLoadMax = peakShavingLoadMax;
	}

	public String getProductAgreementCode() {
		return this.productAgreementCode;
	}
	public void setProductAgreementCode(String productAgreementCode) {
		this.productAgreementCode = productAgreementCode;
	}

	public String getRatedPower() {
		return this.ratedPower;
	}
	public void setRatedPower(String ratedPower) {
		this.ratedPower = ratedPower;
	}

	public String getServiceTel() {
		return this.serviceTel;
	}
	public void setServiceTel(String serviceTel) {
		this.serviceTel = serviceTel;
	}

	public String getStationId() {
		return this.stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getStationName() {
		return this.stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getStationType() {
		return this.stationType;
	}
	public void setStationType(String stationType) {
		this.stationType = stationType;
	}

	public String getTransformerLoadMax() {
		return this.transformerLoadMax;
	}
	public void setTransformerLoadMax(String transformerLoadMax) {
		this.transformerLoadMax = transformerLoadMax;
	}

	public String getTransformerLoadMin() {
		return this.transformerLoadMin;
	}
	public void setTransformerLoadMin(String transformerLoadMin) {
		this.transformerLoadMin = transformerLoadMin;
	}

	public String getValleyFillingLoadMax() {
		return this.valleyFillingLoadMax;
	}
	public void setValleyFillingLoadMax(String valleyFillingLoadMax) {
		this.valleyFillingLoadMax = valleyFillingLoadMax;
	}

	public Boolean getVirtualAccount() {
		return this.virtualAccount;
	}
	public void setVirtualAccount(Boolean virtualAccount) {
		this.virtualAccount = virtualAccount;
	}

	public String getVoltageLevel() {
		return this.voltageLevel;
	}
	public void setVoltageLevel(String voltageLevel) {
		this.voltageLevel = voltageLevel;
	}

}
