package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.faceanonymous.certify response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-15 10:22:45
 */
public class ZolozAuthenticationCustomerFaceanonymousCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8896393136559378746L;

	/** 
	 * true攻击，false不是攻击
	 */
	@ApiField("attack")
	private Boolean attack;

	/** 
	 * 人脸相似度误识率阈值，小数形式代表的概率值，例如万分之一
	 */
	@ApiField("far_threshold")
	private String farThreshold;

	/** 
	 * 0-100的Float类型的分数值，活体图综合质量分
	 */
	@ApiField("joint_quality")
	private String jointQuality;

	/** 
	 * 0-100的int类型分数值，非本人人脸相似度阈值(精度损失仅整数)，小于等于阈值为不是同一个人，大于阈值并且小于等于sameFaceThreshold为不确定
	 */
	@ApiField("not_same_face_threshold")
	private String notSameFaceThreshold;

	/** 
	 * true比对通过，false比对不通过
	 */
	@ApiField("passed")
	private Boolean passed;

	/** 
	 * 0-100的int类型的分数值，人脸相似度阈值(精度损失仅整数)，大于阈值为Y，即同一个人，小于等于阈值并且大于notSameFaceThreshold为不确定
	 */
	@ApiField("same_face_threshold")
	private String sameFaceThreshold;

	/** 
	 * 0-100的Double类型，可留底质量分阈值
	 */
	@ApiField("server_min_quality")
	private String serverMinQuality;

	/** 
	 * 0-100的Double类型的分数值，比对的相似度得分
	 */
	@ApiField("similarity")
	private String similarity;

	public void setAttack(Boolean attack) {
		this.attack = attack;
	}
	public Boolean getAttack( ) {
		return this.attack;
	}

	public void setFarThreshold(String farThreshold) {
		this.farThreshold = farThreshold;
	}
	public String getFarThreshold( ) {
		return this.farThreshold;
	}

	public void setJointQuality(String jointQuality) {
		this.jointQuality = jointQuality;
	}
	public String getJointQuality( ) {
		return this.jointQuality;
	}

	public void setNotSameFaceThreshold(String notSameFaceThreshold) {
		this.notSameFaceThreshold = notSameFaceThreshold;
	}
	public String getNotSameFaceThreshold( ) {
		return this.notSameFaceThreshold;
	}

	public void setPassed(Boolean passed) {
		this.passed = passed;
	}
	public Boolean getPassed( ) {
		return this.passed;
	}

	public void setSameFaceThreshold(String sameFaceThreshold) {
		this.sameFaceThreshold = sameFaceThreshold;
	}
	public String getSameFaceThreshold( ) {
		return this.sameFaceThreshold;
	}

	public void setServerMinQuality(String serverMinQuality) {
		this.serverMinQuality = serverMinQuality;
	}
	public String getServerMinQuality( ) {
		return this.serverMinQuality;
	}

	public void setSimilarity(String similarity) {
		this.similarity = similarity;
	}
	public String getSimilarity( ) {
		return this.similarity;
	}

}
