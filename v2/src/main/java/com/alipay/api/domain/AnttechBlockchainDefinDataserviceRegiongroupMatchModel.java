package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 农业地块编组条件匹配
 *
 * @author auto create
 * @since 1.0, 2023-02-02 13:52:14
 */
public class AnttechBlockchainDefinDataserviceRegiongroupMatchModel extends AlipayObject {

	private static final long serialVersionUID = 3298719531664815734L;

	/**
	 * 作物编码条件匹配
	 */
	@ApiField("crop_code")
	private String cropCode;

	/**
	 * 作物长势等级条件匹配
	 */
	@ApiField("growth_strength")
	private Long growthStrength;

	/**
	 * 是否有上述风险之一
	 */
	@ApiField("is_certain_risk")
	private Boolean isCertainRisk;

	/**
	 * 长势是否预警条件筛选
	 */
	@ApiField("is_growth_warn")
	private Boolean isGrowthWarn;

	/**
	 * 是否收割完成条件匹配
	 */
	@ApiField("is_harvested")
	private Boolean isHarvested;

	/**
	 * 是否高温风险条件匹配
	 */
	@ApiField("is_high_temperature_risk")
	private Boolean isHighTemperatureRisk;

	/**
	 * 是否低温风险条件匹配
	 */
	@ApiField("is_low_temperature_risk")
	private Boolean isLowTemperatureRisk;

	/**
	 * 是否暴雨风险条件匹配
	 */
	@ApiField("is_rainstorm_risk")
	private Boolean isRainstormRisk;

	/**
	 * 是否墒情风险条件匹配
	 */
	@ApiField("is_soil_moisture_risk")
	private Boolean isSoilMoistureRisk;

	/**
	 * 仅需要各作物匹配数，此时返回玉米/大豆/水稻的各自匹配编组数
	 */
	@ApiField("need_crops_count_only")
	private Boolean needCropsCountOnly;

	/**
	 * 待匹配的区块分组编码列表
	 */
	@ApiListField("region_group_codes")
	@ApiField("string")
	private List<String> regionGroupCodes;

	public String getCropCode() {
		return this.cropCode;
	}
	public void setCropCode(String cropCode) {
		this.cropCode = cropCode;
	}

	public Long getGrowthStrength() {
		return this.growthStrength;
	}
	public void setGrowthStrength(Long growthStrength) {
		this.growthStrength = growthStrength;
	}

	public Boolean getIsCertainRisk() {
		return this.isCertainRisk;
	}
	public void setIsCertainRisk(Boolean isCertainRisk) {
		this.isCertainRisk = isCertainRisk;
	}

	public Boolean getIsGrowthWarn() {
		return this.isGrowthWarn;
	}
	public void setIsGrowthWarn(Boolean isGrowthWarn) {
		this.isGrowthWarn = isGrowthWarn;
	}

	public Boolean getIsHarvested() {
		return this.isHarvested;
	}
	public void setIsHarvested(Boolean isHarvested) {
		this.isHarvested = isHarvested;
	}

	public Boolean getIsHighTemperatureRisk() {
		return this.isHighTemperatureRisk;
	}
	public void setIsHighTemperatureRisk(Boolean isHighTemperatureRisk) {
		this.isHighTemperatureRisk = isHighTemperatureRisk;
	}

	public Boolean getIsLowTemperatureRisk() {
		return this.isLowTemperatureRisk;
	}
	public void setIsLowTemperatureRisk(Boolean isLowTemperatureRisk) {
		this.isLowTemperatureRisk = isLowTemperatureRisk;
	}

	public Boolean getIsRainstormRisk() {
		return this.isRainstormRisk;
	}
	public void setIsRainstormRisk(Boolean isRainstormRisk) {
		this.isRainstormRisk = isRainstormRisk;
	}

	public Boolean getIsSoilMoistureRisk() {
		return this.isSoilMoistureRisk;
	}
	public void setIsSoilMoistureRisk(Boolean isSoilMoistureRisk) {
		this.isSoilMoistureRisk = isSoilMoistureRisk;
	}

	public Boolean getNeedCropsCountOnly() {
		return this.needCropsCountOnly;
	}
	public void setNeedCropsCountOnly(Boolean needCropsCountOnly) {
		this.needCropsCountOnly = needCropsCountOnly;
	}

	public List<String> getRegionGroupCodes() {
		return this.regionGroupCodes;
	}
	public void setRegionGroupCodes(List<String> regionGroupCodes) {
		this.regionGroupCodes = regionGroupCodes;
	}

}
