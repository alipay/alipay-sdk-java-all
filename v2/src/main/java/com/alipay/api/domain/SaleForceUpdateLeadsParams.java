package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 提供给saleforce更新商机接口的入参
 *
 * @author auto create
 * @since 1.0, 2026-04-14 14:25:42
 */
public class SaleForceUpdateLeadsParams extends AlipayObject {

	private static final long serialVersionUID = 3631448736642287147L;

	/**
	 * 实际主导方
	 */
	@ApiField("actual_lead_party")
	private String actualLeadParty;

	/**
	 * 阿里云结算模式枚举值
	 */
	@ApiField("alicloud_settlement_mode")
	private String alicloudSettlementMode;

	/**
	 * 商机BD工号
	 */
	@ApiField("bd_work_no")
	private String bdWorkNo;

	/**
	 * 云平台区域 (公共云)
	 */
	@ApiField("cloud_platform_region")
	private String cloudPlatformRegion;

	/**
	 * crm客户编码
	 */
	@ApiField("crm_customer_id")
	private String crmCustomerId;

	/**
	 * crm客户行业
	 */
	@ApiField("crm_customer_industry")
	private String crmCustomerIndustry;

	/**
	 * crm客户名称
	 */
	@ApiField("crm_customer_name")
	private String crmCustomerName;

	/**
	 * 客户ID
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 平台类型（公共云）
	 */
	@ApiField("deploy_platform")
	private String deployPlatform;

	/**
	 * 部署方式
	 */
	@ApiField("deploy_type")
	private String deployType;

	/**
	 * 预计签约日期
	 */
	@ApiField("expect_sign_date")
	private Date expectSignDate;

	/**
	 * 最终客户签约对方主体ID
	 */
	@ApiField("final_customer_sign_other_party_subject_id")
	private String finalCustomerSignOtherPartySubjectId;

	/**
	 * 最终客户签约对方主体名称
	 */
	@ApiField("final_customer_sign_other_party_subject_name")
	private String finalCustomerSignOtherPartySubjectName;

	/**
	 * 最终客户签约主体ID
	 */
	@ApiField("final_customer_sign_subject_id")
	private String finalCustomerSignSubjectId;

	/**
	 * 最终客户签约主体名称
	 */
	@ApiField("final_customer_sign_subject_name")
	private String finalCustomerSignSubjectName;

	/**
	 * 总代合作类型枚举值
	 */
	@ApiField("general_agent_cooperation_type")
	private String generalAgentCooperationType;

	/**
	 * id，商机ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商机编码
	 */
	@ApiField("leads_code")
	private String leadsCode;

	/**
	 * 部署资源云底座，多个用逗号隔开
	 */
	@ApiField("leads_deploy_resource_pedestals")
	private String leadsDeployResourcePedestals;

	/**
	 * 商机收费模式
	 */
	@ApiField("leads_fee_model")
	private String leadsFeeModel;

	/**
	 * 诺曼底商机
	 */
	@ApiField("leads_normandy")
	private String leadsNormandy;

	/**
	 * 其他云底座文本值
	 */
	@ApiField("leads_other_cloud_pedestal")
	private String leadsOtherCloudPedestal;

	/**
	 * 其他伙伴，保存ID，多个逗号隔开
	 */
	@ApiField("leads_other_partners")
	private String leadsOtherPartners;

	/**
	 * 其他伙伴名字
	 */
	@ApiField("leads_other_partners_name")
	private String leadsOtherPartnersName;

	/**
	 * 商机产品类别
	 */
	@ApiField("leads_product_type")
	private String leadsProductType;

	/**
	 * 商机售卖渠道
	 */
	@ApiField("leads_sale_channel")
	private String leadsSaleChannel;

	/**
	 * 商机售卖地域
	 */
	@ApiField("leads_sale_territory")
	private String leadsSaleTerritory;

	/**
	 * 商机来源伙伴pid
	 */
	@ApiField("leads_source_partner_id")
	private String leadsSourcePartnerId;

	/**
	 * 操作人的工号
	 */
	@ApiField("modifier")
	private String modifier;

	/**
	 * OB签约对方主体ID
	 */
	@ApiField("ob_sign_other_party_subject_id")
	private String obSignOtherPartySubjectId;

	/**
	 * OB签约对方主体名称
	 */
	@ApiField("ob_sign_other_party_subject_name")
	private String obSignOtherPartySubjectName;

	/**
	 * null
	 */
	@ApiListField("other_partner_pid_list")
	@ApiField("string")
	private List<String> otherPartnerPidList;

	/**
	 * 对方签约主体
	 */
	@ApiField("other_party_sign_subject")
	private String otherPartySignSubject;

	/**
	 * 对方签约主体id
	 */
	@ApiField("other_party_sign_subject_id")
	private String otherPartySignSubjectId;

	/**
	 * 我方签约主体
	 */
	@ApiField("our_sign_subject")
	private String ourSignSubject;

	/**
	 * 合作伙伴pid(阿里云伙伴签约路径下需要填写）
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 合作伙伴名称(阿里云伙伴签约路径下需要填写）
	 */
	@ApiField("partner_name")
	private String partnerName;

	/**
	 * 产品家族
	 */
	@ApiField("product_family")
	private String productFamily;

	/**
	 * 商机项目名称
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 公有云：触达中/交流中/测试中/商务中/公有云-使用中/Upsell/下线
专有云：潜在商机/确认商机/方案沟通/商务谈判?中标/签约中	已签约/专有云-使用中/项目关闭
	 */
	@ApiField("project_phase")
	private String projectPhase;

	/**
	 * null
	 */
	@ApiListField("record_list")
	@ApiField("fxiaoke_create_or_update_leads_predict_record_item_request")
	private List<FxiaokeCreateOrUpdateLeadsPredictRecordItemRequest> recordList;

	/**
	 * 关联的框架项目商机id（如果是订单项目，需要关联一个框架项目
	 */
	@ApiField("related_leads_id")
	private String relatedLeadsId;

	/**
	 * 资源底座（公共云）
	 */
	@ApiField("resource_foundation")
	private String resourceFoundation;

	/**
	 * salesforce商机阶段
	 */
	@ApiField("salesforce_phase")
	private String salesforcePhase;

	/**
	 * 签约路径
	 */
	@ApiField("sign_path")
	private String signPath;

	/**
	 * 签约概率
	 */
	@ApiField("sign_probability")
	private String signProbability;

	/**
	 * 财年签约预测评估
	 */
	@ApiField("sign_probability_year")
	private String signProbabilityYear;

	/**
	 * OB签约对方主体所在地域
	 */
	@ApiField("site")
	private String site;

	/**
	 * 软件订阅时长乘以十，主要为了解决0.5年的问题
下游预测订单消费了商机本体的订阅时长，暂时重构工作量大，消费场景下，需要自行 / 10
	 */
	@ApiField("software_subscription_years_expand_ten")
	private String softwareSubscriptionYearsExpandTen;

	/**
	 * 来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 商机类型，{独立项目0，框架项目1，订单项目2，交付资源池商机3}
	 */
	@ApiField("type")
	private String type;

	public String getActualLeadParty() {
		return this.actualLeadParty;
	}
	public void setActualLeadParty(String actualLeadParty) {
		this.actualLeadParty = actualLeadParty;
	}

	public String getAlicloudSettlementMode() {
		return this.alicloudSettlementMode;
	}
	public void setAlicloudSettlementMode(String alicloudSettlementMode) {
		this.alicloudSettlementMode = alicloudSettlementMode;
	}

	public String getBdWorkNo() {
		return this.bdWorkNo;
	}
	public void setBdWorkNo(String bdWorkNo) {
		this.bdWorkNo = bdWorkNo;
	}

	public String getCloudPlatformRegion() {
		return this.cloudPlatformRegion;
	}
	public void setCloudPlatformRegion(String cloudPlatformRegion) {
		this.cloudPlatformRegion = cloudPlatformRegion;
	}

	public String getCrmCustomerId() {
		return this.crmCustomerId;
	}
	public void setCrmCustomerId(String crmCustomerId) {
		this.crmCustomerId = crmCustomerId;
	}

	public String getCrmCustomerIndustry() {
		return this.crmCustomerIndustry;
	}
	public void setCrmCustomerIndustry(String crmCustomerIndustry) {
		this.crmCustomerIndustry = crmCustomerIndustry;
	}

	public String getCrmCustomerName() {
		return this.crmCustomerName;
	}
	public void setCrmCustomerName(String crmCustomerName) {
		this.crmCustomerName = crmCustomerName;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getDeployPlatform() {
		return this.deployPlatform;
	}
	public void setDeployPlatform(String deployPlatform) {
		this.deployPlatform = deployPlatform;
	}

	public String getDeployType() {
		return this.deployType;
	}
	public void setDeployType(String deployType) {
		this.deployType = deployType;
	}

	public Date getExpectSignDate() {
		return this.expectSignDate;
	}
	public void setExpectSignDate(Date expectSignDate) {
		this.expectSignDate = expectSignDate;
	}

	public String getFinalCustomerSignOtherPartySubjectId() {
		return this.finalCustomerSignOtherPartySubjectId;
	}
	public void setFinalCustomerSignOtherPartySubjectId(String finalCustomerSignOtherPartySubjectId) {
		this.finalCustomerSignOtherPartySubjectId = finalCustomerSignOtherPartySubjectId;
	}

	public String getFinalCustomerSignOtherPartySubjectName() {
		return this.finalCustomerSignOtherPartySubjectName;
	}
	public void setFinalCustomerSignOtherPartySubjectName(String finalCustomerSignOtherPartySubjectName) {
		this.finalCustomerSignOtherPartySubjectName = finalCustomerSignOtherPartySubjectName;
	}

	public String getFinalCustomerSignSubjectId() {
		return this.finalCustomerSignSubjectId;
	}
	public void setFinalCustomerSignSubjectId(String finalCustomerSignSubjectId) {
		this.finalCustomerSignSubjectId = finalCustomerSignSubjectId;
	}

	public String getFinalCustomerSignSubjectName() {
		return this.finalCustomerSignSubjectName;
	}
	public void setFinalCustomerSignSubjectName(String finalCustomerSignSubjectName) {
		this.finalCustomerSignSubjectName = finalCustomerSignSubjectName;
	}

	public String getGeneralAgentCooperationType() {
		return this.generalAgentCooperationType;
	}
	public void setGeneralAgentCooperationType(String generalAgentCooperationType) {
		this.generalAgentCooperationType = generalAgentCooperationType;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getLeadsCode() {
		return this.leadsCode;
	}
	public void setLeadsCode(String leadsCode) {
		this.leadsCode = leadsCode;
	}

	public String getLeadsDeployResourcePedestals() {
		return this.leadsDeployResourcePedestals;
	}
	public void setLeadsDeployResourcePedestals(String leadsDeployResourcePedestals) {
		this.leadsDeployResourcePedestals = leadsDeployResourcePedestals;
	}

	public String getLeadsFeeModel() {
		return this.leadsFeeModel;
	}
	public void setLeadsFeeModel(String leadsFeeModel) {
		this.leadsFeeModel = leadsFeeModel;
	}

	public String getLeadsNormandy() {
		return this.leadsNormandy;
	}
	public void setLeadsNormandy(String leadsNormandy) {
		this.leadsNormandy = leadsNormandy;
	}

	public String getLeadsOtherCloudPedestal() {
		return this.leadsOtherCloudPedestal;
	}
	public void setLeadsOtherCloudPedestal(String leadsOtherCloudPedestal) {
		this.leadsOtherCloudPedestal = leadsOtherCloudPedestal;
	}

	public String getLeadsOtherPartners() {
		return this.leadsOtherPartners;
	}
	public void setLeadsOtherPartners(String leadsOtherPartners) {
		this.leadsOtherPartners = leadsOtherPartners;
	}

	public String getLeadsOtherPartnersName() {
		return this.leadsOtherPartnersName;
	}
	public void setLeadsOtherPartnersName(String leadsOtherPartnersName) {
		this.leadsOtherPartnersName = leadsOtherPartnersName;
	}

	public String getLeadsProductType() {
		return this.leadsProductType;
	}
	public void setLeadsProductType(String leadsProductType) {
		this.leadsProductType = leadsProductType;
	}

	public String getLeadsSaleChannel() {
		return this.leadsSaleChannel;
	}
	public void setLeadsSaleChannel(String leadsSaleChannel) {
		this.leadsSaleChannel = leadsSaleChannel;
	}

	public String getLeadsSaleTerritory() {
		return this.leadsSaleTerritory;
	}
	public void setLeadsSaleTerritory(String leadsSaleTerritory) {
		this.leadsSaleTerritory = leadsSaleTerritory;
	}

	public String getLeadsSourcePartnerId() {
		return this.leadsSourcePartnerId;
	}
	public void setLeadsSourcePartnerId(String leadsSourcePartnerId) {
		this.leadsSourcePartnerId = leadsSourcePartnerId;
	}

	public String getModifier() {
		return this.modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getObSignOtherPartySubjectId() {
		return this.obSignOtherPartySubjectId;
	}
	public void setObSignOtherPartySubjectId(String obSignOtherPartySubjectId) {
		this.obSignOtherPartySubjectId = obSignOtherPartySubjectId;
	}

	public String getObSignOtherPartySubjectName() {
		return this.obSignOtherPartySubjectName;
	}
	public void setObSignOtherPartySubjectName(String obSignOtherPartySubjectName) {
		this.obSignOtherPartySubjectName = obSignOtherPartySubjectName;
	}

	public List<String> getOtherPartnerPidList() {
		return this.otherPartnerPidList;
	}
	public void setOtherPartnerPidList(List<String> otherPartnerPidList) {
		this.otherPartnerPidList = otherPartnerPidList;
	}

	public String getOtherPartySignSubject() {
		return this.otherPartySignSubject;
	}
	public void setOtherPartySignSubject(String otherPartySignSubject) {
		this.otherPartySignSubject = otherPartySignSubject;
	}

	public String getOtherPartySignSubjectId() {
		return this.otherPartySignSubjectId;
	}
	public void setOtherPartySignSubjectId(String otherPartySignSubjectId) {
		this.otherPartySignSubjectId = otherPartySignSubjectId;
	}

	public String getOurSignSubject() {
		return this.ourSignSubject;
	}
	public void setOurSignSubject(String ourSignSubject) {
		this.ourSignSubject = ourSignSubject;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPartnerName() {
		return this.partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public String getProductFamily() {
		return this.productFamily;
	}
	public void setProductFamily(String productFamily) {
		this.productFamily = productFamily;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectPhase() {
		return this.projectPhase;
	}
	public void setProjectPhase(String projectPhase) {
		this.projectPhase = projectPhase;
	}

	public List<FxiaokeCreateOrUpdateLeadsPredictRecordItemRequest> getRecordList() {
		return this.recordList;
	}
	public void setRecordList(List<FxiaokeCreateOrUpdateLeadsPredictRecordItemRequest> recordList) {
		this.recordList = recordList;
	}

	public String getRelatedLeadsId() {
		return this.relatedLeadsId;
	}
	public void setRelatedLeadsId(String relatedLeadsId) {
		this.relatedLeadsId = relatedLeadsId;
	}

	public String getResourceFoundation() {
		return this.resourceFoundation;
	}
	public void setResourceFoundation(String resourceFoundation) {
		this.resourceFoundation = resourceFoundation;
	}

	public String getSalesforcePhase() {
		return this.salesforcePhase;
	}
	public void setSalesforcePhase(String salesforcePhase) {
		this.salesforcePhase = salesforcePhase;
	}

	public String getSignPath() {
		return this.signPath;
	}
	public void setSignPath(String signPath) {
		this.signPath = signPath;
	}

	public String getSignProbability() {
		return this.signProbability;
	}
	public void setSignProbability(String signProbability) {
		this.signProbability = signProbability;
	}

	public String getSignProbabilityYear() {
		return this.signProbabilityYear;
	}
	public void setSignProbabilityYear(String signProbabilityYear) {
		this.signProbabilityYear = signProbabilityYear;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getSoftwareSubscriptionYearsExpandTen() {
		return this.softwareSubscriptionYearsExpandTen;
	}
	public void setSoftwareSubscriptionYearsExpandTen(String softwareSubscriptionYearsExpandTen) {
		this.softwareSubscriptionYearsExpandTen = softwareSubscriptionYearsExpandTen;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
