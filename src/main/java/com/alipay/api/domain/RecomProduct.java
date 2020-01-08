package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 推荐产品对象
 *
 * @author auto create
 * @since 1.0, 2019-09-09 14:00:18
 */
public class RecomProduct extends AlipayObject {

	private static final long serialVersionUID = 1147388281425448795L;

	/**
	 * 裸价
	 */
	@ApiField("base_premium")
	private Long basePremium;

	/**
	 * 业务扩展信息
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 机构ID
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 保险公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 保险公司淘宝卖家ID
	 */
	@ApiField("company_seller_id")
	private String companySellerId;

	/**
	 * 保险公司淘宝店铺名称
	 */
	@ApiField("company_seller_nick")
	private String companySellerNick;

	/**
	 * 保险公司服务电话
	 */
	@ApiField("company_service_phone")
	private String companyServicePhone;

	/**
	 * 产品销售单元
	 */
	@ApiField("csu_no")
	private String csuNo;

	/**
	 * 最大允许购买份数
	 */
	@ApiField("max_quan")
	private Long maxQuan;

	/**
	 * 推荐产品展示名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 推荐方案列表
	 */
	@ApiField("plans")
	private RecomPlan plans;

	/**
	 * 推荐返回保费，单位分
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 推荐产品ID
	 */
	@ApiField("prod_no")
	private String prodNo;

	/**
	 * 产品资源项列表，可以平行扩展多个资源项
	 */
	@ApiListField("resource_list")
	@ApiField("prod_resource")
	private List<ProdResource> resourceList;

	/**
	 * 产品资源项列表
	 */
	@ApiField("resources")
	private ProdResource resources;

	/**
	 * 按订单维度限购
	 */
	@ApiField("restriction_type")
	private String restrictionType;

	/**
	 * 保额(单位:分)
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	/**
	 * 推荐返回结果对象：1：保险产品，2：保险权益
	 */
	@ApiField("type")
	private String type;

	public Long getBasePremium() {
		return this.basePremium;
	}
	public void setBasePremium(Long basePremium) {
		this.basePremium = basePremium;
	}

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanySellerId() {
		return this.companySellerId;
	}
	public void setCompanySellerId(String companySellerId) {
		this.companySellerId = companySellerId;
	}

	public String getCompanySellerNick() {
		return this.companySellerNick;
	}
	public void setCompanySellerNick(String companySellerNick) {
		this.companySellerNick = companySellerNick;
	}

	public String getCompanyServicePhone() {
		return this.companyServicePhone;
	}
	public void setCompanyServicePhone(String companyServicePhone) {
		this.companyServicePhone = companyServicePhone;
	}

	public String getCsuNo() {
		return this.csuNo;
	}
	public void setCsuNo(String csuNo) {
		this.csuNo = csuNo;
	}

	public Long getMaxQuan() {
		return this.maxQuan;
	}
	public void setMaxQuan(Long maxQuan) {
		this.maxQuan = maxQuan;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public RecomPlan getPlans() {
		return this.plans;
	}
	public void setPlans(RecomPlan plans) {
		this.plans = plans;
	}

	public Long getPremium() {
		return this.premium;
	}
	public void setPremium(Long premium) {
		this.premium = premium;
	}

	public String getProdNo() {
		return this.prodNo;
	}
	public void setProdNo(String prodNo) {
		this.prodNo = prodNo;
	}

	public List<ProdResource> getResourceList() {
		return this.resourceList;
	}
	public void setResourceList(List<ProdResource> resourceList) {
		this.resourceList = resourceList;
	}

	public ProdResource getResources() {
		return this.resources;
	}
	public void setResources(ProdResource resources) {
		this.resources = resources;
	}

	public String getRestrictionType() {
		return this.restrictionType;
	}
	public void setRestrictionType(String restrictionType) {
		this.restrictionType = restrictionType;
	}

	public Long getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
