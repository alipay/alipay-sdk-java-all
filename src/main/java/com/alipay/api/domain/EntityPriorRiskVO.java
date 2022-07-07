package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险信息明细
 *
 * @author auto create
 * @since 1.0, 2018-09-28 13:52:45
 */
public class EntityPriorRiskVO extends AlipayObject {

	private static final long serialVersionUID = 5783561322738936332L;

	/**
	 * 风险处置源
	 */
	@ApiField("dispose_department")
	private String disposeDepartment;

	/**
	 * 风险详情
	 */
	@ApiField("risk_detail")
	private String riskDetail;

	/**
	 * 风险级别
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 风险场景
	 */
	@ApiField("risk_scene")
	private String riskScene;

	/**
	 * 风险类型
	 */
	@ApiField("risk_type")
	private String riskType;

	public String getDisposeDepartment() {
		return this.disposeDepartment;
	}
	public void setDisposeDepartment(String disposeDepartment) {
		this.disposeDepartment = disposeDepartment;
	}

	public String getRiskDetail() {
		return this.riskDetail;
	}
	public void setRiskDetail(String riskDetail) {
		this.riskDetail = riskDetail;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getRiskScene() {
		return this.riskScene;
	}
	public void setRiskScene(String riskScene) {
		this.riskScene = riskScene;
	}

	public String getRiskType() {
		return this.riskType;
	}
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

}
