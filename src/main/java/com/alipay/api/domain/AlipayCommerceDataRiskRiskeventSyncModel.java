package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 风险平台风险采集接口
 *
 * @author auto create
 * @since 1.0, 2019-11-19 14:45:18
 */
public class AlipayCommerceDataRiskRiskeventSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5719885973277671221L;

	/**
	 * api版本,目前固定1.0
	 */
	@ApiField("api_version")
	private String apiVersion;

	/**
	 * 扩展信息
	 */
	@ApiField("context")
	private String context;

	/**
	 * 风险描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 第一业务域
	 */
	@ApiField("first_level_biz_type_code")
	private String firstLevelBizTypeCode;

	/**
	 * 第一风险域
	 */
	@ApiField("first_level_risk_type_code")
	private String firstLevelRiskTypeCode;

	/**
	 * 影响范围
	 */
	@ApiListField("influence_list")
	@ApiField("string")
	private List<String> influenceList;

	/**
	 * 外部唯一标识
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 外部系统
	 */
	@ApiField("outer_system")
	private String outerSystem;

	/**
	 * 风险负责人
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 风险等级
	 */
	@ApiField("risk_event_level_code")
	private String riskEventLevelCode;

	/**
	 * 风险事件名称
	 */
	@ApiField("risk_event_name")
	private String riskEventName;

	/**
	 * 第二业务域
	 */
	@ApiField("second_level_biz_type_code")
	private String secondLevelBizTypeCode;

	/**
	 * 第二风险域
	 */
	@ApiField("second_level_risk_type_code")
	private String secondLevelRiskTypeCode;

	/**
	 * 主体id
	 */
	@ApiField("subject_id")
	private String subjectId;

	/**
	 * 主体名称
	 */
	@ApiField("subject_name")
	private String subjectName;

	/**
	 * 主体类型
	 */
	@ApiField("subject_type_code")
	private String subjectTypeCode;

	/**
	 * 第三业务域
	 */
	@ApiField("third_level_biz_type_code")
	private String thirdLevelBizTypeCode;

	/**
	 * 第三风险域
	 */
	@ApiField("third_level_risk_type_code")
	private String thirdLevelRiskTypeCode;

	/**
	 * 是: true 否: false
	 */
	@ApiField("valid_risk")
	private Boolean validRisk;

	public String getApiVersion() {
		return this.apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public String getContext() {
		return this.context;
	}
	public void setContext(String context) {
		this.context = context;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getFirstLevelBizTypeCode() {
		return this.firstLevelBizTypeCode;
	}
	public void setFirstLevelBizTypeCode(String firstLevelBizTypeCode) {
		this.firstLevelBizTypeCode = firstLevelBizTypeCode;
	}

	public String getFirstLevelRiskTypeCode() {
		return this.firstLevelRiskTypeCode;
	}
	public void setFirstLevelRiskTypeCode(String firstLevelRiskTypeCode) {
		this.firstLevelRiskTypeCode = firstLevelRiskTypeCode;
	}

	public List<String> getInfluenceList() {
		return this.influenceList;
	}
	public void setInfluenceList(List<String> influenceList) {
		this.influenceList = influenceList;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getOuterSystem() {
		return this.outerSystem;
	}
	public void setOuterSystem(String outerSystem) {
		this.outerSystem = outerSystem;
	}

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getRiskEventLevelCode() {
		return this.riskEventLevelCode;
	}
	public void setRiskEventLevelCode(String riskEventLevelCode) {
		this.riskEventLevelCode = riskEventLevelCode;
	}

	public String getRiskEventName() {
		return this.riskEventName;
	}
	public void setRiskEventName(String riskEventName) {
		this.riskEventName = riskEventName;
	}

	public String getSecondLevelBizTypeCode() {
		return this.secondLevelBizTypeCode;
	}
	public void setSecondLevelBizTypeCode(String secondLevelBizTypeCode) {
		this.secondLevelBizTypeCode = secondLevelBizTypeCode;
	}

	public String getSecondLevelRiskTypeCode() {
		return this.secondLevelRiskTypeCode;
	}
	public void setSecondLevelRiskTypeCode(String secondLevelRiskTypeCode) {
		this.secondLevelRiskTypeCode = secondLevelRiskTypeCode;
	}

	public String getSubjectId() {
		return this.subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return this.subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectTypeCode() {
		return this.subjectTypeCode;
	}
	public void setSubjectTypeCode(String subjectTypeCode) {
		this.subjectTypeCode = subjectTypeCode;
	}

	public String getThirdLevelBizTypeCode() {
		return this.thirdLevelBizTypeCode;
	}
	public void setThirdLevelBizTypeCode(String thirdLevelBizTypeCode) {
		this.thirdLevelBizTypeCode = thirdLevelBizTypeCode;
	}

	public String getThirdLevelRiskTypeCode() {
		return this.thirdLevelRiskTypeCode;
	}
	public void setThirdLevelRiskTypeCode(String thirdLevelRiskTypeCode) {
		this.thirdLevelRiskTypeCode = thirdLevelRiskTypeCode;
	}

	public Boolean getValidRisk() {
		return this.validRisk;
	}
	public void setValidRisk(Boolean validRisk) {
		this.validRisk = validRisk;
	}

}
