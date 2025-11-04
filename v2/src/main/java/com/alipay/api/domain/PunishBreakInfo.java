package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 失信被执行人信息
 *
 * @author auto create
 * @since 1.0, 2024-12-13 10:54:41
 */
public class PunishBreakInfo extends AlipayObject {

	private static final long serialVersionUID = 2448248996436748428L;

	/**
	 * 法定代表人或负责人姓名
	 */
	@ApiField("business_entity")
	private String businessEntity;

	/**
	 * 身份证号码或工商注册号
	 */
	@ApiField("card_num")
	private String cardNum;

	/**
	 * 案号
	 */
	@ApiField("case_code")
	private String caseCode;

	/**
	 * 执行法院
	 */
	@ApiField("court_name")
	private String courtName;

	/**
	 * 失信被执行人行为具体情形
	 */
	@ApiField("disrupt_type_name")
	private String disruptTypeName;

	/**
	 * 生效法律文书确定的义务
	 */
	@ApiField("duty")
	private String duty;

	/**
	 * 执行依据文号
	 */
	@ApiField("gist_id")
	private String gistId;

	/**
	 * 做出执行依据单位
	 */
	@ApiField("gist_unit")
	private String gistUnit;

	/**
	 * 被执行人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 被执行人履行情况
	 */
	@ApiField("performance")
	private String performance;

	/**
	 * 已履行金额（元）
	 */
	@ApiField("performed_part")
	private String performedPart;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 发布时间。格式yyyy-MM-dd
	 */
	@ApiField("publish_date")
	private String publishDate;

	/**
	 * 立案时间. 格式yyyy-MM-dd
	 */
	@ApiField("reg_case_date")
	private String regCaseDate;

	/**
	 * 失信人类型
	 */
	@ApiField("trpe")
	private String trpe;

	/**
	 * 失信人类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 未履行金额（元）
	 */
	@ApiField("un_perform_part")
	private String unPerformPart;

	public String getBusinessEntity() {
		return this.businessEntity;
	}
	public void setBusinessEntity(String businessEntity) {
		this.businessEntity = businessEntity;
	}

	public String getCardNum() {
		return this.cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getCaseCode() {
		return this.caseCode;
	}
	public void setCaseCode(String caseCode) {
		this.caseCode = caseCode;
	}

	public String getCourtName() {
		return this.courtName;
	}
	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}

	public String getDisruptTypeName() {
		return this.disruptTypeName;
	}
	public void setDisruptTypeName(String disruptTypeName) {
		this.disruptTypeName = disruptTypeName;
	}

	public String getDuty() {
		return this.duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getGistId() {
		return this.gistId;
	}
	public void setGistId(String gistId) {
		this.gistId = gistId;
	}

	public String getGistUnit() {
		return this.gistUnit;
	}
	public void setGistUnit(String gistUnit) {
		this.gistUnit = gistUnit;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPerformance() {
		return this.performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}

	public String getPerformedPart() {
		return this.performedPart;
	}
	public void setPerformedPart(String performedPart) {
		this.performedPart = performedPart;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getPublishDate() {
		return this.publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getRegCaseDate() {
		return this.regCaseDate;
	}
	public void setRegCaseDate(String regCaseDate) {
		this.regCaseDate = regCaseDate;
	}

	public String getTrpe() {
		return this.trpe;
	}
	public void setTrpe(String trpe) {
		this.trpe = trpe;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUnPerformPart() {
		return this.unPerformPart;
	}
	public void setUnPerformPart(String unPerformPart) {
		this.unPerformPart = unPerformPart;
	}

}
