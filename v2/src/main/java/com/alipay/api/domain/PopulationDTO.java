package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商圈分析人口标签
 *
 * @author auto create
 * @since 1.0, 2024-03-06 20:22:13
 */
public class PopulationDTO extends AlipayObject {

	private static final long serialVersionUID = 3728431498541218932L;

	/**
	 * 用户消费能力信息
	 */
	@ApiListField("consume_level")
	@ApiField("user_consume_level_tag_d_t_o")
	private List<UserConsumeLevelTagDTO> consumeLevel;

	/**
	 * 用户职业信息
	 */
	@ApiListField("occupation")
	@ApiField("user_occupation_tag_d_t_o")
	private List<UserOccupationTagDTO> occupation;

	/**
	 * 用户年龄信息
	 */
	@ApiListField("user_age")
	@ApiField("user_age_tag_d_t_o")
	private List<UserAgeTagDTO> userAge;

	/**
	 * 用户性别信息
	 */
	@ApiListField("user_gender")
	@ApiField("user_gender_tag_d_t_o")
	private List<UserGenderTagDTO> userGender;

	public List<UserConsumeLevelTagDTO> getConsumeLevel() {
		return this.consumeLevel;
	}
	public void setConsumeLevel(List<UserConsumeLevelTagDTO> consumeLevel) {
		this.consumeLevel = consumeLevel;
	}

	public List<UserOccupationTagDTO> getOccupation() {
		return this.occupation;
	}
	public void setOccupation(List<UserOccupationTagDTO> occupation) {
		this.occupation = occupation;
	}

	public List<UserAgeTagDTO> getUserAge() {
		return this.userAge;
	}
	public void setUserAge(List<UserAgeTagDTO> userAge) {
		this.userAge = userAge;
	}

	public List<UserGenderTagDTO> getUserGender() {
		return this.userGender;
	}
	public void setUserGender(List<UserGenderTagDTO> userGender) {
		this.userGender = userGender;
	}

}
