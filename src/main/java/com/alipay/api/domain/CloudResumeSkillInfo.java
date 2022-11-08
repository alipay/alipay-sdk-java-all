package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 技能描述
 *
 * @author auto create
 * @since 1.0, 2022-05-07 09:57:14
 */
public class CloudResumeSkillInfo extends AlipayObject {

	private static final long serialVersionUID = 2589443463595442389L;

	/**
	 * 技能标签名字
	 */
	@ApiField("skill_name")
	private String skillName;

	public String getSkillName() {
		return this.skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

}
