package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可信站点信息
 *
 * @author auto create
 * @since 1.0, 2024-07-19 15:27:47
 */
public class TrustStationInfo extends AlipayObject {

	private static final long serialVersionUID = 2377135839465744637L;

	/**
	 * 站点所在场所属性
	 */
	@ApiField("construction")
	private String construction;

	/**
	 * 最大需量，单位kw
	 */
	@ApiField("demand_load_max")
	private String demandLoadMax;

	/**
	 * 用电户号
	 */
	@ApiField("electric_account")
	private String electricAccount;

	/**
	 * 站点最大削峰能力（负荷）,单位kw
	 */
	@ApiField("peak_shaving_load_max")
	private String peakShavingLoadMax;

	/**
	 * 服务电话
	 */
	@ApiField("service_tel")
	private String serviceTel;

	/**
	 * 站点负载上限，单位kw
	 */
	@ApiField("transformer_load_max")
	private String transformerLoadMax;

	/**
	 * 站点变压器负载下限，单位kw
	 */
	@ApiField("transformer_load_min")
	private String transformerLoadMin;

	/**
	 * 最大填谷负载（能力），单位kw
	 */
	@ApiField("valley_filling_load_max")
	private String valleyFillingLoadMax;

	/**
	 * 电压等级
	 */
	@ApiField("voltage_level")
	private String voltageLevel;

	public String getConstruction() {
		return this.construction;
	}
	public void setConstruction(String construction) {
		this.construction = construction;
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

	public String getPeakShavingLoadMax() {
		return this.peakShavingLoadMax;
	}
	public void setPeakShavingLoadMax(String peakShavingLoadMax) {
		this.peakShavingLoadMax = peakShavingLoadMax;
	}

	public String getServiceTel() {
		return this.serviceTel;
	}
	public void setServiceTel(String serviceTel) {
		this.serviceTel = serviceTel;
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

	public String getVoltageLevel() {
		return this.voltageLevel;
	}
	public void setVoltageLevel(String voltageLevel) {
		this.voltageLevel = voltageLevel;
	}

}
