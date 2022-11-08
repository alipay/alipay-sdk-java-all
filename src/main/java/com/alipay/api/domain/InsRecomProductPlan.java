package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 推荐的保险产品方案
 *
 * @author auto create
 * @since 1.0, 2022-05-01 09:38:35
 */
public class InsRecomProductPlan extends AlipayObject {

	private static final long serialVersionUID = 4236597558359194197L;

	/**
	 * 续期缴费频率。 01 一次性缴费, 02 按月缴费, 03 按年缴费, 04 不定期缴费 05 按日趸交（费用：保费*天数）
	 */
	@ApiField("continuous_frequency")
	private String continuousFrequency;

	/**
	 * 保司机构ID
	 */
	@ApiField("insurance_id")
	private String insuranceId;

	/**
	 * 保司机构名称
	 */
	@ApiField("insurance_name")
	private String insuranceName;

	/**
	 * 产品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 支持的保障期限列表(以逗号分隔)
	 */
	@ApiField("period")
	private String period;

	/**
	 * 参考保费。单位：分
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 机构产品名称
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 机构产品码
	 */
	@ApiField("prod_no")
	private String prodNo;

	/**
	 * 机构产品版本
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * 产品标识符
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 产品方案ID
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	/**
	 * 推荐流水号
	 */
	@ApiField("recom_flow_no")
	private String recomFlowNo;

	/**
	 * 产品资源项列表
	 */
	@ApiListField("resource_list")
	@ApiField("ins_prod_resource")
	private List<InsProdResource> resourceList;

	/**
	 * 销售计划编号
	 */
	@ApiField("sale_plan_no")
	private String salePlanNo;

	/**
	 * 保额,单位：分
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	public String getContinuousFrequency() {
		return this.continuousFrequency;
	}
	public void setContinuousFrequency(String continuousFrequency) {
		this.continuousFrequency = continuousFrequency;
	}

	public String getInsuranceId() {
		return this.insuranceId;
	}
	public void setInsuranceId(String insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getInsuranceName() {
		return this.insuranceName;
	}
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public Long getPremium() {
		return this.premium;
	}
	public void setPremium(Long premium) {
		this.premium = premium;
	}

	public String getProdName() {
		return this.prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdNo() {
		return this.prodNo;
	}
	public void setProdNo(String prodNo) {
		this.prodNo = prodNo;
	}

	public String getProdVersion() {
		return this.prodVersion;
	}
	public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductPlanId() {
		return this.productPlanId;
	}
	public void setProductPlanId(String productPlanId) {
		this.productPlanId = productPlanId;
	}

	public String getRecomFlowNo() {
		return this.recomFlowNo;
	}
	public void setRecomFlowNo(String recomFlowNo) {
		this.recomFlowNo = recomFlowNo;
	}

	public List<InsProdResource> getResourceList() {
		return this.resourceList;
	}
	public void setResourceList(List<InsProdResource> resourceList) {
		this.resourceList = resourceList;
	}

	public String getSalePlanNo() {
		return this.salePlanNo;
	}
	public void setSalePlanNo(String salePlanNo) {
		this.salePlanNo = salePlanNo;
	}

	public Long getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

}
