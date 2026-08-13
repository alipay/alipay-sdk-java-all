package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户操作入库需要同步的内容信息
 *
 * @author auto create
 * @since 1.0, 2026-05-27 10:40:50
 */
public class InboundContent extends AlipayObject {

	private static final long serialVersionUID = 1239571965522112417L;

	/**
	 * 企业证件号，非企业信息入库时为空
	 */
	@ApiField("company_cert_no")
	private String companyCertNo;

	/**
	 * 企业的名称，非企业入库时为空
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 公开的联系方式，但是不一定是电话号码，可能是邮箱或者一段描述
	 */
	@ApiListField("contact_info")
	@ApiField("string")
	private List<String> contactInfo;

	/**
	 * 企业公司工商注册的法人信息
	 */
	@ApiField("legal_person_name")
	private String legalPersonName;

	/**
	 * 入库项的详情查看链接
入库项为标讯时，为标讯详情的链接
入库项为企业时，暂时会为空
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 推荐企业的主营
	 */
	@ApiListField("main_business")
	@ApiField("string")
	private List<String> mainBusiness;

	/**
	 * 推荐的企业的匹配度分数，0-100的整数
	 */
	@ApiField("match_score")
	private Long matchScore;

	/**
	 * 入库标讯项时，表示标讯的公告名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 机会分析
	 */
	@ApiField("opportunity_analysis")
	private String opportunityAnalysis;

	/**
	 * 购买力得分原因
	 */
	@ApiField("purchasing_power_rationale")
	private String purchasingPowerRationale;

	/**
	 * 购买力分数，0-100的整数类型，无单位
	 */
	@ApiField("purchasing_power_score")
	private Long purchasingPowerScore;

	/**
	 * 推荐当前企业的理由
	 */
	@ApiField("recommendation_rationale")
	private String recommendationRationale;

	/**
	 * 与推荐的企业相似的企业
	 */
	@ApiListField("similar_companies")
	@ApiField("string")
	private List<String> similarCompanies;

	/**
	 * 推荐企业与相似企业的相似原因
	 */
	@ApiField("similarity_rationale")
	private String similarityRationale;

	/**
	 * 标讯的预算金额，默认指人民币，4万则表示4万元人民币
	 */
	@ApiField("tender_budget")
	private String tenderBudget;

	/**
	 * 标讯的联系人名称列表
	 */
	@ApiListField("tender_contact_name")
	@ApiField("string")
	private List<String> tenderContactName;

	/**
	 * 标讯的招标截止时间
	 */
	@ApiField("tender_deadline")
	private String tenderDeadline;

	/**
	 * 标讯的发布时间，可能为空
	 */
	@ApiField("tender_publish_time")
	private String tenderPublishTime;

	/**
	 * 标讯的中标金额，默认指人民币，可能为空，一段描述文字
	 */
	@ApiField("tender_winning_amount")
	private String tenderWinningAmount;

	/**
	 * 中标的企业名称列表
	 */
	@ApiListField("tender_winning_company")
	@ApiField("string")
	private List<String> tenderWinningCompany;

	/**
	 * 招标企业名称列表
	 */
	@ApiListField("tenderee_list")
	@ApiField("string")
	private List<String> tendereeList;

	public String getCompanyCertNo() {
		return this.companyCertNo;
	}
	public void setCompanyCertNo(String companyCertNo) {
		this.companyCertNo = companyCertNo;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<String> getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(List<String> contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public List<String> getMainBusiness() {
		return this.mainBusiness;
	}
	public void setMainBusiness(List<String> mainBusiness) {
		this.mainBusiness = mainBusiness;
	}

	public Long getMatchScore() {
		return this.matchScore;
	}
	public void setMatchScore(Long matchScore) {
		this.matchScore = matchScore;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpportunityAnalysis() {
		return this.opportunityAnalysis;
	}
	public void setOpportunityAnalysis(String opportunityAnalysis) {
		this.opportunityAnalysis = opportunityAnalysis;
	}

	public String getPurchasingPowerRationale() {
		return this.purchasingPowerRationale;
	}
	public void setPurchasingPowerRationale(String purchasingPowerRationale) {
		this.purchasingPowerRationale = purchasingPowerRationale;
	}

	public Long getPurchasingPowerScore() {
		return this.purchasingPowerScore;
	}
	public void setPurchasingPowerScore(Long purchasingPowerScore) {
		this.purchasingPowerScore = purchasingPowerScore;
	}

	public String getRecommendationRationale() {
		return this.recommendationRationale;
	}
	public void setRecommendationRationale(String recommendationRationale) {
		this.recommendationRationale = recommendationRationale;
	}

	public List<String> getSimilarCompanies() {
		return this.similarCompanies;
	}
	public void setSimilarCompanies(List<String> similarCompanies) {
		this.similarCompanies = similarCompanies;
	}

	public String getSimilarityRationale() {
		return this.similarityRationale;
	}
	public void setSimilarityRationale(String similarityRationale) {
		this.similarityRationale = similarityRationale;
	}

	public String getTenderBudget() {
		return this.tenderBudget;
	}
	public void setTenderBudget(String tenderBudget) {
		this.tenderBudget = tenderBudget;
	}

	public List<String> getTenderContactName() {
		return this.tenderContactName;
	}
	public void setTenderContactName(List<String> tenderContactName) {
		this.tenderContactName = tenderContactName;
	}

	public String getTenderDeadline() {
		return this.tenderDeadline;
	}
	public void setTenderDeadline(String tenderDeadline) {
		this.tenderDeadline = tenderDeadline;
	}

	public String getTenderPublishTime() {
		return this.tenderPublishTime;
	}
	public void setTenderPublishTime(String tenderPublishTime) {
		this.tenderPublishTime = tenderPublishTime;
	}

	public String getTenderWinningAmount() {
		return this.tenderWinningAmount;
	}
	public void setTenderWinningAmount(String tenderWinningAmount) {
		this.tenderWinningAmount = tenderWinningAmount;
	}

	public List<String> getTenderWinningCompany() {
		return this.tenderWinningCompany;
	}
	public void setTenderWinningCompany(List<String> tenderWinningCompany) {
		this.tenderWinningCompany = tenderWinningCompany;
	}

	public List<String> getTendereeList() {
		return this.tendereeList;
	}
	public void setTendereeList(List<String> tendereeList) {
		this.tendereeList = tendereeList;
	}

}
