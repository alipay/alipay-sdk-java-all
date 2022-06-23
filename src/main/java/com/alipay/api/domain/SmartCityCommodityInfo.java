package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新型智慧城市服务扩展信息
 *
 * @author auto create
 * @since 1.0, 2018-04-09 18:17:19
 */
public class SmartCityCommodityInfo extends AlipayObject {

	private static final long serialVersionUID = 6847781316883955313L;

	/**
	 * 服务归属
	 */
	@ApiField("affiliation")
	private String affiliation;

	/**
	 * 授权文件
	 */
	@ApiField("auth_file")
	private String authFile;

	/**
	 * 测试验收说明
	 */
	@ApiField("test_detail")
	private String testDetail;

	/**
	 * 测试报表
	 */
	@ApiField("test_report")
	private String testReport;

	/**
	 * 用户指南
	 */
	@ApiField("user_guide")
	private String userGuide;

	public String getAffiliation() {
		return this.affiliation;
	}
	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public String getAuthFile() {
		return this.authFile;
	}
	public void setAuthFile(String authFile) {
		this.authFile = authFile;
	}

	public String getTestDetail() {
		return this.testDetail;
	}
	public void setTestDetail(String testDetail) {
		this.testDetail = testDetail;
	}

	public String getTestReport() {
		return this.testReport;
	}
	public void setTestReport(String testReport) {
		this.testReport = testReport;
	}

	public String getUserGuide() {
		return this.userGuide;
	}
	public void setUserGuide(String userGuide) {
		this.userGuide = userGuide;
	}

}
