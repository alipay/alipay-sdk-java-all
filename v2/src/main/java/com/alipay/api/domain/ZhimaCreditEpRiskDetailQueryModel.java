package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业风险明细查询
 *
 * @author auto create
 * @since 1.0, 2024-04-12 14:56:29
 */
public class ZhimaCreditEpRiskDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3227969149241754942L;

	/**
	 * 企业注册号或统一社会信用代码
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业全称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 页码从1开始
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 风险场景策略id(zhima.credit.ep.risk.info.identify接口返回结果中的strategy_id字段)
	 */
	@ApiField("risk_strategy_id")
	private String riskStrategyId;

	/**
	 * 业务场景码(请联系业务获取)
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRiskStrategyId() {
		return this.riskStrategyId;
	}
	public void setRiskStrategyId(String riskStrategyId) {
		this.riskStrategyId = riskStrategyId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
