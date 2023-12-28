package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品场景问题描述
 *
 * @author auto create
 * @since 1.0, 2023-12-10 00:28:16
 */
public class ItemSceneRiskInfo extends AlipayObject {

	private static final long serialVersionUID = 3716229349863333228L;

	/**
	 * 具体问题描述
	 */
	@ApiListField("risk_infos")
	@ApiField("reasons")
	private List<Reasons> riskInfos;

	/**
	 * 场景名称
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 场景编码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public List<Reasons> getRiskInfos() {
		return this.riskInfos;
	}
	public void setRiskInfos(List<Reasons> riskInfos) {
		this.riskInfos = riskInfos;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
