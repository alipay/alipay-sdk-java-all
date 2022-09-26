package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 涉诉风险评估预下单
 *
 * @author auto create
 * @since 1.0, 2021-12-21 20:29:10
 */
public class ZhimaCreditEpDossierCourtassessPrecreateModel extends AlipayObject {

	private static final long serialVersionUID = 4727633428279717814L;

	/**
	 * 入口来源
	 */
	@ApiField("derived_from")
	private String derivedFrom;

	/**
	 * 业务场景，COURT_ASSESS表示涉诉风险评估
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getDerivedFrom() {
		return this.derivedFrom;
	}
	public void setDerivedFrom(String derivedFrom) {
		this.derivedFrom = derivedFrom;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
