package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公安老赖详细失信信息对象
 *
 * @author auto create
 * @since 1.0, 2014-10-28 23:27:54
 */
public class DishonestyDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 2797354923149678598L;

	/**
	 * 被执行人行为具体情况
	 */
	@ApiField("behavior")
	private String behavior;

	/**
	 * 案号
	 */
	@ApiField("case_code")
	private String caseCode;

	/**
	 * 执行法院
	 */
	@ApiField("enforce_court")
	private String enforceCourt;

	/**
	 * 身份证号
	 */
	@ApiField("id_number")
	private String idNumber;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 被执行人履行情况
	 */
	@ApiField("performance")
	private String performance;

	/**
	 * 发布日期
	 */
	@ApiField("publish_date")
	private String publishDate;

	/**
	 * 所在区域
	 */
	@ApiField("region")
	private String region;

	public String getBehavior() {
		return this.behavior;
	}
	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}

	public String getCaseCode() {
		return this.caseCode;
	}
	public void setCaseCode(String caseCode) {
		this.caseCode = caseCode;
	}

	public String getEnforceCourt() {
		return this.enforceCourt;
	}
	public void setEnforceCourt(String enforceCourt) {
		this.enforceCourt = enforceCourt;
	}

	public String getIdNumber() {
		return this.idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
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

	public String getPublishDate() {
		return this.publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

}
