package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 农作物汇总信息查询
 *
 * @author auto create
 * @since 1.0, 2022-12-22 14:40:16
 */
public class AnttechBlockchainDefinDataserviceCropstatisQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8653641743367848432L;

	/**
	 * 作物编码条件汇总
	 */
	@ApiField("crop_code")
	private String cropCode;

	/**
	 * 作物长势等级条件汇总
	 */
	@ApiField("growth_strength")
	private Long growthStrength;

	/**
	 * 是否有墒情/长势/气候等风险
	 */
	@ApiField("is_certain_risk")
	private Boolean isCertainRisk;

	/**
	 * 长势是否预警条件汇总
	 */
	@ApiField("is_growth_warn")
	private Boolean isGrowthWarn;

	/**
	 * 是否收割完成条件汇总
	 */
	@ApiField("is_harvested")
	private Boolean isHarvested;

	/**
	 * 是否高温风险
	 */
	@ApiField("is_high_temperature_risk")
	private Boolean isHighTemperatureRisk;

	/**
	 * 是否低温风险
	 */
	@ApiField("is_low_temperature_risk")
	private Boolean isLowTemperatureRisk;

	/**
	 * 是否暴雨风险
	 */
	@ApiField("is_rainstorm_risk")
	private Boolean isRainstormRisk;

	/**
	 * 是否墒情风险
	 */
	@ApiField("is_soil_moisture_risk")
	private Boolean isSoilMoistureRisk;

	/**
	 * 当为true时，返回每个作物类型对应的地块编码列表。考虑到性能，不必要时建议设置为false。
	 */
	@ApiField("need_region_codes")
	private Boolean needRegionCodes;

	/**
	 * 区块编码列表
	 */
	@ApiListField("region_codes")
	@ApiField("string")
	private List<String> regionCodes;

	/**
	 * 区块分组编码
	 */
	@ApiField("region_group_code")
	private String regionGroupCode;

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

	public Boolean getNeedRegionCodes() {
		return this.needRegionCodes;
	}
	public void setNeedRegionCodes(Boolean needRegionCodes) {
		this.needRegionCodes = needRegionCodes;
	}

	public List<String> getRegionCodes() {
		return this.regionCodes;
	}
	public void setRegionCodes(List<String> regionCodes) {
		this.regionCodes = regionCodes;
	}

	public String getRegionGroupCode() {
		return this.regionGroupCode;
	}
	public void setRegionGroupCode(String regionGroupCode) {
		this.regionGroupCode = regionGroupCode;
	}

}
