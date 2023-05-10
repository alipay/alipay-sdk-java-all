package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.face.verification.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 08:53:00
 */
public class DatadigitalFincloudGeneralsaasFaceVerificationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3486143937476987975L;

	/** 
	 * base64过后的图片图片
	 */
	@ApiField("alive_photo")
	private String alivePhoto;

	/** 
	 * 本次认证是否存在安全风险，true：检测到安全风险；false：未检测到安全风险。
	 */
	@ApiField("attack_flag")
	private String attackFlag;

	/** 
	 * 人脸检测单据状态。PROCESSING：初始化；SUCCESS：检测成功；FAIL：检测失败
	 */
	@ApiField("certify_state")
	private String certifyState;

	/** 
	 * double值，人脸图片质量分
	 */
	@ApiField("quality")
	private String quality;

	/** 
	 * double值，活体检测结果分数
	 */
	@ApiField("score")
	private String score;

	public void setAlivePhoto(String alivePhoto) {
		this.alivePhoto = alivePhoto;
	}
	public String getAlivePhoto( ) {
		return this.alivePhoto;
	}

	public void setAttackFlag(String attackFlag) {
		this.attackFlag = attackFlag;
	}
	public String getAttackFlag( ) {
		return this.attackFlag;
	}

	public void setCertifyState(String certifyState) {
		this.certifyState = certifyState;
	}
	public String getCertifyState( ) {
		return this.certifyState;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getQuality( ) {
		return this.quality;
	}

	public void setScore(String score) {
		this.score = score;
	}
	public String getScore( ) {
		return this.score;
	}

}
