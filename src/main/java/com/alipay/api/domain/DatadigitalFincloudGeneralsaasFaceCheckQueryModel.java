package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸检测结果数据查询
 *
 * @author auto create
 * @since 1.0, 2022-07-22 17:47:53
 */
public class DatadigitalFincloudGeneralsaasFaceCheckQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2816265888996783242L;

	/**
	 * 传入初始化接口datadigital.fincloud.generalsaas.face.check.initialize 得到的certify_id
	 */
	@ApiField("certify_id")
	private String certifyId;

	/**
	 * 是否需要返回活体结果图片，needAlivePhoto：Y_O （原始图片）、Y_M（虚化，背景马赛克）、N（不返图）。非必填，默认为N
	 */
	@ApiField("need_alive_photo")
	private String needAlivePhoto;

	/**
	 * 该参数已废弃
	 */
	@ApiField("need_attack_result")
	private String needAttackResult;

	/**
	 * 是否需要返回图片质量分，非必填，默认值为N。 N表示不需要，Y表示需要
	 */
	@ApiField("need_quality_score")
	private String needQualityScore;

	/**
	 * 该入参已经废弃。
	 */
	@ApiField("need_score")
	private String needScore;

	public String getCertifyId() {
		return this.certifyId;
	}
	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}

	public String getNeedAlivePhoto() {
		return this.needAlivePhoto;
	}
	public void setNeedAlivePhoto(String needAlivePhoto) {
		this.needAlivePhoto = needAlivePhoto;
	}

	public String getNeedAttackResult() {
		return this.needAttackResult;
	}
	public void setNeedAttackResult(String needAttackResult) {
		this.needAttackResult = needAttackResult;
	}

	public String getNeedQualityScore() {
		return this.needQualityScore;
	}
	public void setNeedQualityScore(String needQualityScore) {
		this.needQualityScore = needQualityScore;
	}

	public String getNeedScore() {
		return this.needScore;
	}
	public void setNeedScore(String needScore) {
		this.needScore = needScore;
	}

}
