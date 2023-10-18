package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.digitaltorchoffline.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 21:46:55
 */
public class AlipayDataMdaDigitaltorchofflineQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6376115617285868854L;

	/** 
	 * 数字火炬手年龄分布
	 */
	@ApiField("age_distribution")
	private String ageDistribution;

	/** 
	 * 数字火炬手热门服装总数
	 */
	@ApiField("cloth_digital_human_cnt")
	private Long clothDigitalHumanCnt;

	/** 
	 * 数字火炬手国家分布
	 */
	@ApiField("country_distribution")
	private String countryDistribution;

	/** 
	 * 亚运数字人形象
	 */
	@ApiField("digital_images")
	private String digitalImages;

	/** 
	 * 争当数字火炬手月活人数
	 */
	@ApiField("monthly_activity")
	private Long monthlyActivity;

	/** 
	 * 数字火炬手总数
	 */
	@ApiField("total_digital_torch_bearer")
	private Long totalDigitalTorchBearer;

	/** 
	 * 争当数字火炬手总人数
	 */
	@ApiField("total_participants")
	private Long totalParticipants;

	public void setAgeDistribution(String ageDistribution) {
		this.ageDistribution = ageDistribution;
	}
	public String getAgeDistribution( ) {
		return this.ageDistribution;
	}

	public void setClothDigitalHumanCnt(Long clothDigitalHumanCnt) {
		this.clothDigitalHumanCnt = clothDigitalHumanCnt;
	}
	public Long getClothDigitalHumanCnt( ) {
		return this.clothDigitalHumanCnt;
	}

	public void setCountryDistribution(String countryDistribution) {
		this.countryDistribution = countryDistribution;
	}
	public String getCountryDistribution( ) {
		return this.countryDistribution;
	}

	public void setDigitalImages(String digitalImages) {
		this.digitalImages = digitalImages;
	}
	public String getDigitalImages( ) {
		return this.digitalImages;
	}

	public void setMonthlyActivity(Long monthlyActivity) {
		this.monthlyActivity = monthlyActivity;
	}
	public Long getMonthlyActivity( ) {
		return this.monthlyActivity;
	}

	public void setTotalDigitalTorchBearer(Long totalDigitalTorchBearer) {
		this.totalDigitalTorchBearer = totalDigitalTorchBearer;
	}
	public Long getTotalDigitalTorchBearer( ) {
		return this.totalDigitalTorchBearer;
	}

	public void setTotalParticipants(Long totalParticipants) {
		this.totalParticipants = totalParticipants;
	}
	public Long getTotalParticipants( ) {
		return this.totalParticipants;
	}

}
