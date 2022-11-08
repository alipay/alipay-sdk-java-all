package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.face.check.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-23 11:37:02
 */
public class DatadigitalFincloudGeneralsaasFaceCheckQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7222953695279481939L;

	/** 
	 * 如果设置了need_alive_photo的值不为N，则该字段返回人脸照片的base64编码字符串。
	 */
	@ApiField("alive_photo")
	private String alivePhoto;

	/** 
	 * 已废弃
	 */
	@ApiField("attack_flag")
	private String attackFlag;

	/** 
	 * PROCESSING：初始化；SUCCESS：检测成功；FAIL：检测失败
	 */
	@ApiField("certify_state")
	private String certifyState;

	/** 
	 * double值，人脸图片质量分
	 */
	@ApiField("quality")
	private String quality;

	/** 
	 * 已废弃
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
