package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-24 14:17:50
 */
public class OfflineLaborRecomInsuranceProduct extends AlipayObject {

	private static final long serialVersionUID = 7394999648188129141L;

	/**
	 * 保司ID
	 */
	@ApiField("insurance_id")
	private String insuranceId;

	/**
	 * 保司名称
	 */
	@ApiField("insurance_name")
	private String insuranceName;

	/**
	 * 方案名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * "1D"表示1天，xxD表示多少天
	 */
	@ApiField("period")
	private String period;

	/**
	 * 保费，单位：分
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 产品名称，如"众安员工意外险"
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 产品编号，后续可用于查询保单列表
	 */
	@ApiField("prod_no")
	private String prodNo;

	/**
	 * 产品版本
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 产品方案ID
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	/**
	 * 推荐产品编号，后续用于投保
	 */
	@ApiField("recom_flow_no")
	private String recomFlowNo;

	/**
	 * null
	 */
	@ApiListField("resource_list")
	@ApiField("offline_labor_recom_insurance_resource")
	private List<OfflineLaborRecomInsuranceResource> resourceList;

	/**
	 * 销售方案编号
	 */
	@ApiField("sale_plan_no")
	private String salePlanNo;

	/**
	 * 保额，单位：分
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
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

	public List<OfflineLaborRecomInsuranceResource> getResourceList() {
		return this.resourceList;
	}
	public void setResourceList(List<OfflineLaborRecomInsuranceResource> resourceList) {
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
