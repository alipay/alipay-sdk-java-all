package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险产品
 *
 * @author auto create
 * @since 1.0, 2019-12-09 15:22:25
 */
public class InsProduct extends AlipayObject {

	private static final long serialVersionUID = 8697643856138437783L;

	/**
	 * 险种列表
	 */
	@ApiField("coverages")
	private InsProdCoverage coverages;

	/**
	 * 起保时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("effect_date")
	private String effectDate;

	/**
	 * 结束时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("invalid_date")
	private String invalidDate;

	/**
	 * 是否标准产品
	 */
	@ApiField("is_sp")
	private Boolean isSp;

	/**
	 * 责任信息
	 */
	@ApiListField("liabilities")
	@ApiField("ins_liability")
	private List<InsLiability> liabilities;

	/**
	 * 保险机构;当产品为标准产品时该值为空
	 */
	@ApiField("merchant")
	private InsMerchant merchant;

	/**
	 * 产品编码;由蚂蚁保险平台分配,商户通过该产品编码投保特定的保险产品
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 产品描述
	 */
	@ApiField("prod_desc")
	private String prodDesc;

	/**
	 * 产品名称
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 标准产品码
	 */
	@ApiField("prod_no")
	private String prodNo;

	/**
	 * 产品版本号
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * 实付保费[优惠后的金额]
	 */
	@ApiField("real_premium")
	private String realPremium;

	/**
	 * 优惠保费
	 */
	@ApiField("reduce_premium")
	private String reducePremium;

	/**
	 * 资源项
	 */
	@ApiListField("resources")
	@ApiField("ins_prod_resource")
	private List<InsProdResource> resources;

	/**
	 * 产品销量，配置了销量统计的产品才会有销量信息
	 */
	@ApiField("sales")
	private Long sales;

	/**
	 * 产品简称
	 */
	@ApiField("short_name")
	private String shortName;

	/**
	 * 标准产品编码;标准产品是不同保险公司同一类型产品的一种抽象
	 */
	@ApiField("sp_code")
	private String spCode;

	/**
	 * 标记列表
	 */
	@ApiListField("tags")
	@ApiField("ins_prod_tag")
	private List<InsProdTag> tags;

	/**
	 * 总保费
	 */
	@ApiField("total_premium")
	private String totalPremium;

	public InsProdCoverage getCoverages() {
		return this.coverages;
	}
	public void setCoverages(InsProdCoverage coverages) {
		this.coverages = coverages;
	}

	public String getEffectDate() {
		return this.effectDate;
	}
	public void setEffectDate(String effectDate) {
		this.effectDate = effectDate;
	}

	public String getInvalidDate() {
		return this.invalidDate;
	}
	public void setInvalidDate(String invalidDate) {
		this.invalidDate = invalidDate;
	}

	public Boolean getIsSp() {
		return this.isSp;
	}
	public void setIsSp(Boolean isSp) {
		this.isSp = isSp;
	}

	public List<InsLiability> getLiabilities() {
		return this.liabilities;
	}
	public void setLiabilities(List<InsLiability> liabilities) {
		this.liabilities = liabilities;
	}

	public InsMerchant getMerchant() {
		return this.merchant;
	}
	public void setMerchant(InsMerchant merchant) {
		this.merchant = merchant;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdDesc() {
		return this.prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
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

	public String getRealPremium() {
		return this.realPremium;
	}
	public void setRealPremium(String realPremium) {
		this.realPremium = realPremium;
	}

	public String getReducePremium() {
		return this.reducePremium;
	}
	public void setReducePremium(String reducePremium) {
		this.reducePremium = reducePremium;
	}

	public List<InsProdResource> getResources() {
		return this.resources;
	}
	public void setResources(List<InsProdResource> resources) {
		this.resources = resources;
	}

	public Long getSales() {
		return this.sales;
	}
	public void setSales(Long sales) {
		this.sales = sales;
	}

	public String getShortName() {
		return this.shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getSpCode() {
		return this.spCode;
	}
	public void setSpCode(String spCode) {
		this.spCode = spCode;
	}

	public List<InsProdTag> getTags() {
		return this.tags;
	}
	public void setTags(List<InsProdTag> tags) {
		this.tags = tags;
	}

	public String getTotalPremium() {
		return this.totalPremium;
	}
	public void setTotalPremium(String totalPremium) {
		this.totalPremium = totalPremium;
	}

}
