package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 使用人脸能力所需要等拓展参数信息
 *
 * @author auto create
 * @since 1.0, 2022-03-30 10:26:24
 */
public class FaceAbilityExtInfo extends AlipayObject {

	private static final long serialVersionUID = 7571469227677671687L;

	/**
	 * 年龄
	 */
	@ApiField("age")
	private String age;

	/**
	 * 算法的辅助因子如blur、pitch、yaw、roll值
	 */
	@ApiField("algfactors")
	private String algfactors;

	/**
	 * 模糊程度质量分
	 */
	@ApiField("blur")
	private String blur;

	/**
	 * 姓名信息
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号信息
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类别
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 比对源渠道信息
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * maxRule:选择最大脸规则；
centerRule：选择中心脸规则；
默认空字符串表示不进行选脸
	 */
	@ApiField("choose_face_rule")
	private String chooseFaceRule;

	/**
	 * 2D或者3D，默认2D
	 */
	@ApiField("face_data_type")
	private String faceDataType;

	/**
	 * 人脸加密后的特征
	 */
	@ApiField("feature")
	private String feature;

	/**
	 * 是否存在攻击
	 */
	@ApiField("hasrisk")
	private String hasrisk;

	/**
	 * 综合质量分（不区分具体哪方面质量差）
	 */
	@ApiField("joint_quality")
	private Long jointQuality;

	/**
	 * 光线质量分
	 */
	@ApiField("light")
	private String light;

	/**
	 * 遮挡质量分
	 */
	@ApiField("occlusion")
	private String occlusion;

	/**
	 * 姿态质量分
	 */
	@ApiField("pose")
	private String pose;

	/**
	 * 质量分
	 */
	@ApiField("quality")
	private String quality;

	/**
	 * 质量不合格时的质量返回码
	 */
	@ApiField("quality_code")
	private String qualityCode;

	/**
	 * 质量是否合格
	 */
	@ApiField("qualityok")
	private Boolean qualityok;

	/**
	 * 特征矩形区域"442,231,412,262"
	 */
	@ApiField("rect")
	private String rect;

	/**
	 * 男女
	 */
	@ApiField("sex")
	private String sex;

	/**
	 * 活体源，customer：业务方自定义采集；alisp:支付宝小程序
	 */
	@ApiField("source")
	private String source;

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public String getAlgfactors() {
		return this.algfactors;
	}
	public void setAlgfactors(String algfactors) {
		this.algfactors = algfactors;
	}

	public String getBlur() {
		return this.blur;
	}
	public void setBlur(String blur) {
		this.blur = blur;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getChooseFaceRule() {
		return this.chooseFaceRule;
	}
	public void setChooseFaceRule(String chooseFaceRule) {
		this.chooseFaceRule = chooseFaceRule;
	}

	public String getFaceDataType() {
		return this.faceDataType;
	}
	public void setFaceDataType(String faceDataType) {
		this.faceDataType = faceDataType;
	}

	public String getFeature() {
		return this.feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getHasrisk() {
		return this.hasrisk;
	}
	public void setHasrisk(String hasrisk) {
		this.hasrisk = hasrisk;
	}

	public Long getJointQuality() {
		return this.jointQuality;
	}
	public void setJointQuality(Long jointQuality) {
		this.jointQuality = jointQuality;
	}

	public String getLight() {
		return this.light;
	}
	public void setLight(String light) {
		this.light = light;
	}

	public String getOcclusion() {
		return this.occlusion;
	}
	public void setOcclusion(String occlusion) {
		this.occlusion = occlusion;
	}

	public String getPose() {
		return this.pose;
	}
	public void setPose(String pose) {
		this.pose = pose;
	}

	public String getQuality() {
		return this.quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getQualityCode() {
		return this.qualityCode;
	}
	public void setQualityCode(String qualityCode) {
		this.qualityCode = qualityCode;
	}

	public Boolean getQualityok() {
		return this.qualityok;
	}
	public void setQualityok(Boolean qualityok) {
		this.qualityok = qualityok;
	}

	public String getRect() {
		return this.rect;
	}
	public void setRect(String rect) {
		this.rect = rect;
	}

	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
