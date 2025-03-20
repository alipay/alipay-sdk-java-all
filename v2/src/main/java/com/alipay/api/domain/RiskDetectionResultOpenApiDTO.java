package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 风险检测结果DTO
 *
 * @author auto create
 * @since 1.0, 2024-12-05 15:37:21
 */
public class RiskDetectionResultOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 5529759661572856627L;

	/**
	 * 同入参的业务单据号
	 */
	@ApiField("document_no")
	private String documentNo;

	/**
	 * 业务单据类型
	 */
	@ApiField("document_type")
	private String documentType;

	/**
	 * 当返回为true时，即认为结算风险咨询的结果为需要阻断当前业务流程；为false时，无需阻断
	 */
	@ApiField("need_break")
	private Boolean needBreak;

	/**
	 * 风险点级别的风险检测结果列表
	 */
	@ApiListField("risk_detection_result_on_risk_point_open_api_dtos")
	@ApiField("risk_detection_result_on_risk_point_open_api_d_t_o")
	private List<RiskDetectionResultOnRiskPointOpenApiDTO> riskDetectionResultOnRiskPointOpenApiDtos;

	/**
	 * 风险等级
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 二级业务环节
	 */
	@ApiField("second_level_business_link")
	private String secondLevelBusinessLink;

	public String getDocumentNo() {
		return this.documentNo;
	}
	public void setDocumentNo(String documentNo) {
		this.documentNo = documentNo;
	}

	public String getDocumentType() {
		return this.documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public Boolean getNeedBreak() {
		return this.needBreak;
	}
	public void setNeedBreak(Boolean needBreak) {
		this.needBreak = needBreak;
	}

	public List<RiskDetectionResultOnRiskPointOpenApiDTO> getRiskDetectionResultOnRiskPointOpenApiDtos() {
		return this.riskDetectionResultOnRiskPointOpenApiDtos;
	}
	public void setRiskDetectionResultOnRiskPointOpenApiDtos(List<RiskDetectionResultOnRiskPointOpenApiDTO> riskDetectionResultOnRiskPointOpenApiDtos) {
		this.riskDetectionResultOnRiskPointOpenApiDtos = riskDetectionResultOnRiskPointOpenApiDtos;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getSecondLevelBusinessLink() {
		return this.secondLevelBusinessLink;
	}
	public void setSecondLevelBusinessLink(String secondLevelBusinessLink) {
		this.secondLevelBusinessLink = secondLevelBusinessLink;
	}

}
