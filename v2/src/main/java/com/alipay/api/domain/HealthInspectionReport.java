package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-15 13:37:41
 */
public class HealthInspectionReport extends AlipayObject {

	private static final long serialVersionUID = 7772731783963895948L;

	/**
	 * 年龄
	 */
	@ApiField("age")
	private String age;

	/**
	 * 临床诊断。前端取这个，影像所见
	 */
	@ApiField("dino")
	private String dino;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 检查项目
	 */
	@ApiField("inspect_project")
	private String inspectProject;

	/**
	 * 影像地址
	 */
	@ApiField("inspect_url")
	private String inspectUrl;

	/**
	 * 项目名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 报告三级类别
	 */
	@ApiField("report_sub_sub_type")
	private String reportSubSubType;

	/**
	 * 报告子类别
	 */
	@ApiField("report_sub_type")
	private String reportSubType;

	/**
	 * 检查结论。前端取这个，诊断意见
	 */
	@ApiField("result")
	private String result;

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public String getDino() {
		return this.dino;
	}
	public void setDino(String dino) {
		this.dino = dino;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInspectProject() {
		return this.inspectProject;
	}
	public void setInspectProject(String inspectProject) {
		this.inspectProject = inspectProject;
	}

	public String getInspectUrl() {
		return this.inspectUrl;
	}
	public void setInspectUrl(String inspectUrl) {
		this.inspectUrl = inspectUrl;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getReportSubSubType() {
		return this.reportSubSubType;
	}
	public void setReportSubSubType(String reportSubSubType) {
		this.reportSubSubType = reportSubSubType;
	}

	public String getReportSubType() {
		return this.reportSubType;
	}
	public void setReportSubType(String reportSubType) {
		this.reportSubType = reportSubType;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
