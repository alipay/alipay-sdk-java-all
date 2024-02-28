package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁企业信用一分钟知企业
 *
 * @author auto create
 * @since 1.0, 2021-10-13 11:17:39
 */
public class CompanyOverviewInfo extends AlipayObject {

	private static final long serialVersionUID = 2389823125769398665L;

	/**
	 * 资产
	 */
	@ApiListField("assets")
	@ApiField("company_overview_line_info")
	private List<CompanyOverviewLineInfo> assets;

	/**
	 * 背景
	 */
	@ApiListField("background")
	@ApiField("company_overview_line_info")
	private List<CompanyOverviewLineInfo> background;

	/**
	 * 评价
	 */
	@ApiListField("evaluate")
	@ApiField("company_overview_line_info")
	private List<CompanyOverviewLineInfo> evaluate;

	/**
	 * 融资
	 */
	@ApiListField("financing")
	@ApiField("company_overview_line_info")
	private List<CompanyOverviewLineInfo> financing;

	/**
	 * 经营
	 */
	@ApiListField("management")
	@ApiField("company_overview_line_info")
	private List<CompanyOverviewLineInfo> management;

	/**
	 * 风险
	 */
	@ApiListField("risk")
	@ApiField("company_overview_line_info")
	private List<CompanyOverviewLineInfo> risk;

	public List<CompanyOverviewLineInfo> getAssets() {
		return this.assets;
	}
	public void setAssets(List<CompanyOverviewLineInfo> assets) {
		this.assets = assets;
	}

	public List<CompanyOverviewLineInfo> getBackground() {
		return this.background;
	}
	public void setBackground(List<CompanyOverviewLineInfo> background) {
		this.background = background;
	}

	public List<CompanyOverviewLineInfo> getEvaluate() {
		return this.evaluate;
	}
	public void setEvaluate(List<CompanyOverviewLineInfo> evaluate) {
		this.evaluate = evaluate;
	}

	public List<CompanyOverviewLineInfo> getFinancing() {
		return this.financing;
	}
	public void setFinancing(List<CompanyOverviewLineInfo> financing) {
		this.financing = financing;
	}

	public List<CompanyOverviewLineInfo> getManagement() {
		return this.management;
	}
	public void setManagement(List<CompanyOverviewLineInfo> management) {
		this.management = management;
	}

	public List<CompanyOverviewLineInfo> getRisk() {
		return this.risk;
	}
	public void setRisk(List<CompanyOverviewLineInfo> risk) {
		this.risk = risk;
	}

}
