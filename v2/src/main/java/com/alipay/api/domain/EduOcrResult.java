package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学历认证结果
 *
 * @author auto create
 * @since 1.0, 2026-05-18 10:47:49
 */
public class EduOcrResult extends AlipayObject {

	private static final long serialVersionUID = 4273719893547998682L;

	/**
	 * 教育层次
	 */
	@ApiField("edu_level")
	private String eduLevel;

	/**
	 * 毕（结）业状态
	 */
	@ApiField("graduate_conclusion")
	private String graduateConclusion;

	/**
	 * 专业
	 */
	@ApiField("major")
	private String major;

	public String getEduLevel() {
		return this.eduLevel;
	}
	public void setEduLevel(String eduLevel) {
		this.eduLevel = eduLevel;
	}

	public String getGraduateConclusion() {
		return this.graduateConclusion;
	}
	public void setGraduateConclusion(String graduateConclusion) {
		this.graduateConclusion = graduateConclusion;
	}

	public String getMajor() {
		return this.major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

}
