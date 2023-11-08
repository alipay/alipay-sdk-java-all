package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 认证核验网络对外透出接口
 *
 * @author auto create
 * @since 1.0, 2022-03-29 20:31:01
 */
public class AlipayUserCertifyVerificationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8728272275517269498L;

	/**
	 * 算法识别出来的年龄，double类型
	 */
	@ApiField("age")
	private String age;

	/**
	 * 姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 误识率
	 */
	@ApiField("far")
	private String far;

	/**
	 * 算法预测的年龄；[0,0.5) 女性，(0.5,正无穷)男性
	 */
	@ApiField("gender_score")
	private String genderScore;

	/**
	 * 人脸图像，jpg格式，BASE64转换后字符串，大小限制为30K以内
	 */
	@ApiField("portrait")
	private String portrait;

	/**
	 * 人脸区域坐标，格式为：left,top,right,bottom
	 */
	@ApiField("portrait_auth_rect")
	private String portraitAuthRect;

	/**
	 * 核验网络场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
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

	public String getFar() {
		return this.far;
	}
	public void setFar(String far) {
		this.far = far;
	}

	public String getGenderScore() {
		return this.genderScore;
	}
	public void setGenderScore(String genderScore) {
		this.genderScore = genderScore;
	}

	public String getPortrait() {
		return this.portrait;
	}
	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}

	public String getPortraitAuthRect() {
		return this.portraitAuthRect;
	}
	public void setPortraitAuthRect(String portraitAuthRect) {
		this.portraitAuthRect = portraitAuthRect;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
