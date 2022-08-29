package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.esg.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-23 14:31:44
 */
public class ZhimaCreditEpEsgInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4153289681947563714L;

	/** 
	 * 近12个月内企业是否强制清算或破产
	 */
	@ApiField("bankrupt_liquid_12_m_flag")
	private Boolean bankruptLiquid12MFlag;

	/** 
	 * 近12个月内企业是否存在排污许可证管理失信行为
	 */
	@ApiField("emi_licen_ban_num_12_m_flag")
	private Boolean emiLicenBanNum12MFlag;

	/** 
	 * 近12个月内企业高管变动记录数
	 */
	@ApiField("ep_adm_team_adj_num_12_m")
	private Long epAdmTeamAdjNum12M;

	/** 
	 * 近12个月内企业重大税收违法记录数
	 */
	@ApiField("ep_big_tax_illegal_num_12_m")
	private Long epBigTaxIllegalNum12M;

	/** 
	 * 近12个月内企业债券兑付违约记录数
	 */
	@ApiField("ep_bond_defaults_num_12_m")
	private Long epBondDefaultsNum12M;

	/** 
	 * 近12个月内企业新增商标记录数
	 */
	@ApiField("ep_brand_add_num_12_m")
	private Long epBrandAddNum12M;

	/** 
	 * 近12个月内企业经营异常记录数
	 */
	@ApiField("ep_busi_abnor_num_12_m")
	private String epBusiAbnorNum12M;

	/** 
	 * 近12个月内企业经营异常最严重类型
	 */
	@ApiField("ep_busi_abnor_top_type_12_m")
	private String epBusiAbnorTopType12M;

	/** 
	 * 近12个月内企业经营范围变更记录数
	 */
	@ApiField("ep_busi_scope_adj_num_12_m")
	private Long epBusiScopeAdjNum12M;

	/** 
	 * 企业社会统一信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/** 
	 * 各类资质证照
	 */
	@ApiListField("ep_cetificate_list")
	@ApiField("string")
	private List<String> epCetificateList;

	/** 
	 * 近12个月内企业新增著作权记录数
	 */
	@ApiField("ep_copyright_add_num_12_m")
	private Long epCopyrightAddNum12M;

	/** 
	 * 近12个月内发生刑事案件被诉次数
	 */
	@ApiField("ep_criminal_case_num_12_m")
	private Long epCriminalCaseNum12M;

	/** 
	 * 近12个月内企业债券评级下调记录数
	 */
	@ApiField("ep_down_rating_bond_num_12_m")
	private Long epDownRatingBondNum12M;

	/** 
	 * 近12个月内企业发行人主体评级下调记录数
	 */
	@ApiField("ep_down_rating_issuer_num_12_m")
	private Long epDownRatingIssuerNum12M;

	/** 
	 * 近12个月内企业环境信用评价等级，例如："green","blue","yellow","red"
	 */
	@ApiField("ep_env_evaluate_12_m")
	private String epEnvEvaluate12M;

	/** 
	 * 近12个月内企业环境信用评价变动情况，字典值："1","2","3","-1","-2","-3"
	 */
	@ApiField("ep_env_evaluate_adj_12_m")
	private String epEnvEvaluateAdj12M;

	/** 
	 * 近12个月内企业发生环保案件被诉次数
	 */
	@ApiField("ep_env_legal_case_num_12_m")
	private Long epEnvLegalCaseNum12M;

	/** 
	 * 近12个月内企业环境行政处罚罚款总额，单位为元
	 */
	@ApiField("ep_env_penalty_amt_12_m")
	private String epEnvPenaltyAmt12M;

	/** 
	 * 近12个月内企业环境行政处罚次数
	 */
	@ApiField("ep_env_penalty_num_12_m")
	private Long epEnvPenaltyNum12M;

	/** 
	 * 近12个月内企业环境行政处罚最严重类型
	 */
	@ApiField("ep_env_penalty_top_type_12_m")
	private String epEnvPenaltyTopType12M;

	/** 
	 * 近12个月内企业消防行政处罚金额
	 */
	@ApiField("ep_fire_penalty_amt_12_m")
	private String epFirePenaltyAmt12M;

	/** 
	 * 近12个月内企业消防行政处罚次数
	 */
	@ApiField("ep_fire_penalty_num_12_m")
	private Long epFirePenaltyNum12M;

	/** 
	 * 近12个月内企业消防处罚最严重类型
	 */
	@ApiField("ep_fire_penalty_top_type_12_m")
	private String epFirePenaltyTopType12M;

	/** 
	 * 近12个月内企业被执行记录数
	 */
	@ApiField("ep_force_excute_num_12_m")
	private Long epForceExcuteNum12M;

	/** 
	 * 企业注册成立年数
	 */
	@ApiField("ep_founding_years")
	private Long epFoundingYears;

	/** 
	 * 企业分组
	 */
	@ApiField("ep_group")
	private String epGroup;

	/** 
	 * 近12个月内企业股东股权冻结/强制转让总额(万元/万股)
	 */
	@ApiField("ep_holder_eqty_frez_amt_12_m")
	private String epHolderEqtyFrezAmt12M;

	/** 
	 * 近12个月内企业股东股权冻结/强制转让记录数
	 */
	@ApiField("ep_holder_eqty_frez_num_12_m")
	private Long epHolderEqtyFrezNum12M;

	/** 
	 * 近12个月内企业股东出质股权总数额(万元/万股)
	 */
	@ApiField("ep_holder_eqty_pledge_amt_12_m")
	private String epHolderEqtyPledgeAmt12M;

	/** 
	 * 近12个月内企业股东出质股权记录数
	 */
	@ApiField("ep_holder_eqty_pledge_num_12_m")
	private Long epHolderEqtyPledgeNum12M;

	/** 
	 * 近12个月内企业发生劳动争议、人事争议被诉次数
	 */
	@ApiField("ep_hr_legal_case_num_12_m")
	private Long epHrLegalCaseNum12M;

	/** 
	 * 近12个月内企业人社局行政处罚金额，单位为元
	 */
	@ApiField("ep_hr_penalty_amt_12_m")
	private String epHrPenaltyAmt12M;

	/** 
	 * 近12个月内企业人社局行政处罚次数
	 */
	@ApiField("ep_hr_penalty_num_12_m")
	private Long epHrPenaltyNum12M;

	/** 
	 * 近12个月内企业人社局处罚最严重类型
	 */
	@ApiField("ep_hr_penalty_top_type_12_m")
	private String epHrPenaltyTopType12M;

	/** 
	 * 近12个月内企业新增icp记录数
	 */
	@ApiField("ep_icp_add_num_12_m")
	private Long epIcpAddNum12M;

	/** 
	 * 近12个月内企业投资人股权变更记录数
	 */
	@ApiField("ep_investor_eqty_adj_num_12_m")
	private Long epInvestorEqtyAdjNum12M;

	/** 
	 * 近12个月内企业发生知识产权纠纷被诉次数
	 */
	@ApiField("ep_ip_legal_case_num_12_m")
	private Long epIpLegalCaseNum12M;

	/** 
	 * 近12个月内企业法定代表人变更记录数
	 */
	@ApiField("ep_legal_person_adj_num_12_m")
	private Long epLegalPersonAdjNum12M;

	/** 
	 * 近12个月内企业失信被执行记录数
	 */
	@ApiField("ep_lost_credit_excute_num_12_m")
	private Long epLostCreditExcuteNum12M;

	/** 
	 * 近12个月内企业发生失信历史记录数
	 */
	@ApiField("ep_lost_credit_hist_num_12_m")
	private Long epLostCreditHistNum12M;

	/** 
	 * 企业全称
	 */
	@ApiField("ep_name")
	private String epName;

	/** 
	 * 近12个月内企业发生其他案由争议被诉次数
	 */
	@ApiField("ep_other_legal_case_num_12_m")
	private String epOtherLegalCaseNum12M;

	/** 
	 * 近12个月内企业其他行政处罚罚款总额
	 */
	@ApiField("ep_other_penalty_amt_12_m")
	private String epOtherPenaltyAmt12M;

	/** 
	 * 近12个月内企业其他行政处罚次数
	 */
	@ApiField("ep_other_penalty_num_12_m")
	private Long epOtherPenaltyNum12M;

	/** 
	 * 近12个月内企业其他行政处罚最严重类型
	 */
	@ApiField("ep_other_penalty_top_type_12_m")
	private String epOtherPenaltyTopType12M;

	/** 
	 * 近12个月内企业新增专利记录数
	 */
	@ApiField("ep_patent_add_num_12_m")
	private Long epPatentAddNum12M;

	/** 
	 * 近12个月内企业产品质量行政处罚金额
	 */
	@ApiField("ep_qlty_penalty_amt_12_m")
	private String epQltyPenaltyAmt12M;

	/** 
	 * 近12个月内企业产品质量行政处罚次数
	 */
	@ApiField("ep_qlty_penalty_num_12_m")
	private Long epQltyPenaltyNum12M;

	/** 
	 * 近12个月内企业产品质量处罚最严重类型
	 */
	@ApiField("ep_qlty_penalty_top_type_12_m")
	private String epQltyPenaltyTopType12M;

	/** 
	 * 近12个月内企业安监行政处罚罚款总额，单位元
	 */
	@ApiField("ep_secu_penalty_amt_12_m")
	private String epSecuPenaltyAmt12M;

	/** 
	 * 近12个月内企业安监行政处罚次数
	 */
	@ApiField("ep_secu_penalty_num_12_m")
	private Long epSecuPenaltyNum12M;

	/** 
	 * 近12个月内企业安监行政处罚最严重类型
	 */
	@ApiField("ep_secu_penalty_top_type_12_m")
	private String epSecuPenaltyTopType12M;

	/** 
	 * 近12个月内企业是否被列入严重违法失信企业名单
	 */
	@ApiField("ep_serious_illegal_list_flag")
	private Boolean epSeriousIllegalListFlag;

	/** 
	 * 近12个月内企业员工人数变动率
	 */
	@ApiField("ep_staff_num_adj_rate_12_m")
	private String epStaffNumAdjRate12M;

	/** 
	 * 企业状态
	 */
	@ApiField("ep_status")
	private String epStatus;

	/** 
	 * 近12个月内企业被列为税务非正常户记录数
	 */
	@ApiField("ep_tax_abnor_acct_num_12_m")
	private Long epTaxAbnorAcctNum12M;

	/** 
	 * 最新一期企业纳税信用等级变动情况，字典值："a_nota","nota_a","unchg"
	 */
	@ApiField("ep_tax_credit_adj_dic_latest")
	private String epTaxCreditAdjDicLatest;

	/** 
	 * 近12个月内企业税务行政处罚罚款总额，单位元
	 */
	@ApiField("ep_tax_penalty_amt_12_m")
	private String epTaxPenaltyAmt12M;

	/** 
	 * 近12个月内企业税务行政处罚次数
	 */
	@ApiField("ep_tax_penalty_num_12_m")
	private Long epTaxPenaltyNum12M;

	/** 
	 * 近12个月内企业税务行政处罚最严重类型
	 */
	@ApiField("ep_tax_penalty_top_type_12_m")
	private String epTaxPenaltyTopType12M;

	/** 
	 * 评价时间
	 */
	@ApiField("evaluate_time")
	private Date evaluateTime;

	/** 
	 * 近12个月内企业是否存在成员被限制高消费
	 */
	@ApiField("excu_limi_high_consum_12_m_flag")
	private Boolean excuLimiHighConsum12MFlag;

	/** 
	 * 企业是否曾经发行绿债
	 */
	@ApiField("issue_green_bond_flag")
	private Boolean issueGreenBondFlag;

	/** 
	 * 上一年度企业是否超标排放废气
	 */
	@ApiField("over_std_gas_emi_last_year_flag")
	private Boolean overStdGasEmiLastYearFlag;

	/** 
	 * 上一年度企业是否超标排放废水
	 */
	@ApiField("over_std_water_emi_last_year_flag")
	private Boolean overStdWaterEmiLastYearFlag;

	/** 
	 * 上一年度企业是否超量排放废气
	 */
	@ApiField("over_vol_gas_emi_last_year_flag")
	private Boolean overVolGasEmiLastYearFlag;

	/** 
	 * 上一年度企业是否超量排放废水
	 */
	@ApiField("over_vol_water_emi_last_year_flag")
	private Boolean overVolWaterEmiLastYearFlag;

	/** 
	 * 近12个月内企业是否发生欠税
	 */
	@ApiField("owing_tax_12_m_flag")
	private Boolean owingTax12MFlag;

	/** 
	 * 近12个月内企业是否被下达排污限期整改
	 */
	@ApiField("req_emi_adj_12_m_flag")
	private Boolean reqEmiAdj12MFlag;

	/** 
	 * 近12个月内企业是否发生税务催缴
	 */
	@ApiField("tax_as_pay_12_m_flag")
	private Boolean taxAsPay12MFlag;

	/** 
	 * 最新一期企业纳税信用等级是否为A
	 */
	@ApiField("tax_credit_a_level_latest_flag")
	private Boolean taxCreditALevelLatestFlag;

	public void setBankruptLiquid12MFlag(Boolean bankruptLiquid12MFlag) {
		this.bankruptLiquid12MFlag = bankruptLiquid12MFlag;
	}
	public Boolean getBankruptLiquid12MFlag( ) {
		return this.bankruptLiquid12MFlag;
	}

	public void setEmiLicenBanNum12MFlag(Boolean emiLicenBanNum12MFlag) {
		this.emiLicenBanNum12MFlag = emiLicenBanNum12MFlag;
	}
	public Boolean getEmiLicenBanNum12MFlag( ) {
		return this.emiLicenBanNum12MFlag;
	}

	public void setEpAdmTeamAdjNum12M(Long epAdmTeamAdjNum12M) {
		this.epAdmTeamAdjNum12M = epAdmTeamAdjNum12M;
	}
	public Long getEpAdmTeamAdjNum12M( ) {
		return this.epAdmTeamAdjNum12M;
	}

	public void setEpBigTaxIllegalNum12M(Long epBigTaxIllegalNum12M) {
		this.epBigTaxIllegalNum12M = epBigTaxIllegalNum12M;
	}
	public Long getEpBigTaxIllegalNum12M( ) {
		return this.epBigTaxIllegalNum12M;
	}

	public void setEpBondDefaultsNum12M(Long epBondDefaultsNum12M) {
		this.epBondDefaultsNum12M = epBondDefaultsNum12M;
	}
	public Long getEpBondDefaultsNum12M( ) {
		return this.epBondDefaultsNum12M;
	}

	public void setEpBrandAddNum12M(Long epBrandAddNum12M) {
		this.epBrandAddNum12M = epBrandAddNum12M;
	}
	public Long getEpBrandAddNum12M( ) {
		return this.epBrandAddNum12M;
	}

	public void setEpBusiAbnorNum12M(String epBusiAbnorNum12M) {
		this.epBusiAbnorNum12M = epBusiAbnorNum12M;
	}
	public String getEpBusiAbnorNum12M( ) {
		return this.epBusiAbnorNum12M;
	}

	public void setEpBusiAbnorTopType12M(String epBusiAbnorTopType12M) {
		this.epBusiAbnorTopType12M = epBusiAbnorTopType12M;
	}
	public String getEpBusiAbnorTopType12M( ) {
		return this.epBusiAbnorTopType12M;
	}

	public void setEpBusiScopeAdjNum12M(Long epBusiScopeAdjNum12M) {
		this.epBusiScopeAdjNum12M = epBusiScopeAdjNum12M;
	}
	public Long getEpBusiScopeAdjNum12M( ) {
		return this.epBusiScopeAdjNum12M;
	}

	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}
	public String getEpCertNo( ) {
		return this.epCertNo;
	}

	public void setEpCetificateList(List<String> epCetificateList) {
		this.epCetificateList = epCetificateList;
	}
	public List<String> getEpCetificateList( ) {
		return this.epCetificateList;
	}

	public void setEpCopyrightAddNum12M(Long epCopyrightAddNum12M) {
		this.epCopyrightAddNum12M = epCopyrightAddNum12M;
	}
	public Long getEpCopyrightAddNum12M( ) {
		return this.epCopyrightAddNum12M;
	}

	public void setEpCriminalCaseNum12M(Long epCriminalCaseNum12M) {
		this.epCriminalCaseNum12M = epCriminalCaseNum12M;
	}
	public Long getEpCriminalCaseNum12M( ) {
		return this.epCriminalCaseNum12M;
	}

	public void setEpDownRatingBondNum12M(Long epDownRatingBondNum12M) {
		this.epDownRatingBondNum12M = epDownRatingBondNum12M;
	}
	public Long getEpDownRatingBondNum12M( ) {
		return this.epDownRatingBondNum12M;
	}

	public void setEpDownRatingIssuerNum12M(Long epDownRatingIssuerNum12M) {
		this.epDownRatingIssuerNum12M = epDownRatingIssuerNum12M;
	}
	public Long getEpDownRatingIssuerNum12M( ) {
		return this.epDownRatingIssuerNum12M;
	}

	public void setEpEnvEvaluate12M(String epEnvEvaluate12M) {
		this.epEnvEvaluate12M = epEnvEvaluate12M;
	}
	public String getEpEnvEvaluate12M( ) {
		return this.epEnvEvaluate12M;
	}

	public void setEpEnvEvaluateAdj12M(String epEnvEvaluateAdj12M) {
		this.epEnvEvaluateAdj12M = epEnvEvaluateAdj12M;
	}
	public String getEpEnvEvaluateAdj12M( ) {
		return this.epEnvEvaluateAdj12M;
	}

	public void setEpEnvLegalCaseNum12M(Long epEnvLegalCaseNum12M) {
		this.epEnvLegalCaseNum12M = epEnvLegalCaseNum12M;
	}
	public Long getEpEnvLegalCaseNum12M( ) {
		return this.epEnvLegalCaseNum12M;
	}

	public void setEpEnvPenaltyAmt12M(String epEnvPenaltyAmt12M) {
		this.epEnvPenaltyAmt12M = epEnvPenaltyAmt12M;
	}
	public String getEpEnvPenaltyAmt12M( ) {
		return this.epEnvPenaltyAmt12M;
	}

	public void setEpEnvPenaltyNum12M(Long epEnvPenaltyNum12M) {
		this.epEnvPenaltyNum12M = epEnvPenaltyNum12M;
	}
	public Long getEpEnvPenaltyNum12M( ) {
		return this.epEnvPenaltyNum12M;
	}

	public void setEpEnvPenaltyTopType12M(String epEnvPenaltyTopType12M) {
		this.epEnvPenaltyTopType12M = epEnvPenaltyTopType12M;
	}
	public String getEpEnvPenaltyTopType12M( ) {
		return this.epEnvPenaltyTopType12M;
	}

	public void setEpFirePenaltyAmt12M(String epFirePenaltyAmt12M) {
		this.epFirePenaltyAmt12M = epFirePenaltyAmt12M;
	}
	public String getEpFirePenaltyAmt12M( ) {
		return this.epFirePenaltyAmt12M;
	}

	public void setEpFirePenaltyNum12M(Long epFirePenaltyNum12M) {
		this.epFirePenaltyNum12M = epFirePenaltyNum12M;
	}
	public Long getEpFirePenaltyNum12M( ) {
		return this.epFirePenaltyNum12M;
	}

	public void setEpFirePenaltyTopType12M(String epFirePenaltyTopType12M) {
		this.epFirePenaltyTopType12M = epFirePenaltyTopType12M;
	}
	public String getEpFirePenaltyTopType12M( ) {
		return this.epFirePenaltyTopType12M;
	}

	public void setEpForceExcuteNum12M(Long epForceExcuteNum12M) {
		this.epForceExcuteNum12M = epForceExcuteNum12M;
	}
	public Long getEpForceExcuteNum12M( ) {
		return this.epForceExcuteNum12M;
	}

	public void setEpFoundingYears(Long epFoundingYears) {
		this.epFoundingYears = epFoundingYears;
	}
	public Long getEpFoundingYears( ) {
		return this.epFoundingYears;
	}

	public void setEpGroup(String epGroup) {
		this.epGroup = epGroup;
	}
	public String getEpGroup( ) {
		return this.epGroup;
	}

	public void setEpHolderEqtyFrezAmt12M(String epHolderEqtyFrezAmt12M) {
		this.epHolderEqtyFrezAmt12M = epHolderEqtyFrezAmt12M;
	}
	public String getEpHolderEqtyFrezAmt12M( ) {
		return this.epHolderEqtyFrezAmt12M;
	}

	public void setEpHolderEqtyFrezNum12M(Long epHolderEqtyFrezNum12M) {
		this.epHolderEqtyFrezNum12M = epHolderEqtyFrezNum12M;
	}
	public Long getEpHolderEqtyFrezNum12M( ) {
		return this.epHolderEqtyFrezNum12M;
	}

	public void setEpHolderEqtyPledgeAmt12M(String epHolderEqtyPledgeAmt12M) {
		this.epHolderEqtyPledgeAmt12M = epHolderEqtyPledgeAmt12M;
	}
	public String getEpHolderEqtyPledgeAmt12M( ) {
		return this.epHolderEqtyPledgeAmt12M;
	}

	public void setEpHolderEqtyPledgeNum12M(Long epHolderEqtyPledgeNum12M) {
		this.epHolderEqtyPledgeNum12M = epHolderEqtyPledgeNum12M;
	}
	public Long getEpHolderEqtyPledgeNum12M( ) {
		return this.epHolderEqtyPledgeNum12M;
	}

	public void setEpHrLegalCaseNum12M(Long epHrLegalCaseNum12M) {
		this.epHrLegalCaseNum12M = epHrLegalCaseNum12M;
	}
	public Long getEpHrLegalCaseNum12M( ) {
		return this.epHrLegalCaseNum12M;
	}

	public void setEpHrPenaltyAmt12M(String epHrPenaltyAmt12M) {
		this.epHrPenaltyAmt12M = epHrPenaltyAmt12M;
	}
	public String getEpHrPenaltyAmt12M( ) {
		return this.epHrPenaltyAmt12M;
	}

	public void setEpHrPenaltyNum12M(Long epHrPenaltyNum12M) {
		this.epHrPenaltyNum12M = epHrPenaltyNum12M;
	}
	public Long getEpHrPenaltyNum12M( ) {
		return this.epHrPenaltyNum12M;
	}

	public void setEpHrPenaltyTopType12M(String epHrPenaltyTopType12M) {
		this.epHrPenaltyTopType12M = epHrPenaltyTopType12M;
	}
	public String getEpHrPenaltyTopType12M( ) {
		return this.epHrPenaltyTopType12M;
	}

	public void setEpIcpAddNum12M(Long epIcpAddNum12M) {
		this.epIcpAddNum12M = epIcpAddNum12M;
	}
	public Long getEpIcpAddNum12M( ) {
		return this.epIcpAddNum12M;
	}

	public void setEpInvestorEqtyAdjNum12M(Long epInvestorEqtyAdjNum12M) {
		this.epInvestorEqtyAdjNum12M = epInvestorEqtyAdjNum12M;
	}
	public Long getEpInvestorEqtyAdjNum12M( ) {
		return this.epInvestorEqtyAdjNum12M;
	}

	public void setEpIpLegalCaseNum12M(Long epIpLegalCaseNum12M) {
		this.epIpLegalCaseNum12M = epIpLegalCaseNum12M;
	}
	public Long getEpIpLegalCaseNum12M( ) {
		return this.epIpLegalCaseNum12M;
	}

	public void setEpLegalPersonAdjNum12M(Long epLegalPersonAdjNum12M) {
		this.epLegalPersonAdjNum12M = epLegalPersonAdjNum12M;
	}
	public Long getEpLegalPersonAdjNum12M( ) {
		return this.epLegalPersonAdjNum12M;
	}

	public void setEpLostCreditExcuteNum12M(Long epLostCreditExcuteNum12M) {
		this.epLostCreditExcuteNum12M = epLostCreditExcuteNum12M;
	}
	public Long getEpLostCreditExcuteNum12M( ) {
		return this.epLostCreditExcuteNum12M;
	}

	public void setEpLostCreditHistNum12M(Long epLostCreditHistNum12M) {
		this.epLostCreditHistNum12M = epLostCreditHistNum12M;
	}
	public Long getEpLostCreditHistNum12M( ) {
		return this.epLostCreditHistNum12M;
	}

	public void setEpName(String epName) {
		this.epName = epName;
	}
	public String getEpName( ) {
		return this.epName;
	}

	public void setEpOtherLegalCaseNum12M(String epOtherLegalCaseNum12M) {
		this.epOtherLegalCaseNum12M = epOtherLegalCaseNum12M;
	}
	public String getEpOtherLegalCaseNum12M( ) {
		return this.epOtherLegalCaseNum12M;
	}

	public void setEpOtherPenaltyAmt12M(String epOtherPenaltyAmt12M) {
		this.epOtherPenaltyAmt12M = epOtherPenaltyAmt12M;
	}
	public String getEpOtherPenaltyAmt12M( ) {
		return this.epOtherPenaltyAmt12M;
	}

	public void setEpOtherPenaltyNum12M(Long epOtherPenaltyNum12M) {
		this.epOtherPenaltyNum12M = epOtherPenaltyNum12M;
	}
	public Long getEpOtherPenaltyNum12M( ) {
		return this.epOtherPenaltyNum12M;
	}

	public void setEpOtherPenaltyTopType12M(String epOtherPenaltyTopType12M) {
		this.epOtherPenaltyTopType12M = epOtherPenaltyTopType12M;
	}
	public String getEpOtherPenaltyTopType12M( ) {
		return this.epOtherPenaltyTopType12M;
	}

	public void setEpPatentAddNum12M(Long epPatentAddNum12M) {
		this.epPatentAddNum12M = epPatentAddNum12M;
	}
	public Long getEpPatentAddNum12M( ) {
		return this.epPatentAddNum12M;
	}

	public void setEpQltyPenaltyAmt12M(String epQltyPenaltyAmt12M) {
		this.epQltyPenaltyAmt12M = epQltyPenaltyAmt12M;
	}
	public String getEpQltyPenaltyAmt12M( ) {
		return this.epQltyPenaltyAmt12M;
	}

	public void setEpQltyPenaltyNum12M(Long epQltyPenaltyNum12M) {
		this.epQltyPenaltyNum12M = epQltyPenaltyNum12M;
	}
	public Long getEpQltyPenaltyNum12M( ) {
		return this.epQltyPenaltyNum12M;
	}

	public void setEpQltyPenaltyTopType12M(String epQltyPenaltyTopType12M) {
		this.epQltyPenaltyTopType12M = epQltyPenaltyTopType12M;
	}
	public String getEpQltyPenaltyTopType12M( ) {
		return this.epQltyPenaltyTopType12M;
	}

	public void setEpSecuPenaltyAmt12M(String epSecuPenaltyAmt12M) {
		this.epSecuPenaltyAmt12M = epSecuPenaltyAmt12M;
	}
	public String getEpSecuPenaltyAmt12M( ) {
		return this.epSecuPenaltyAmt12M;
	}

	public void setEpSecuPenaltyNum12M(Long epSecuPenaltyNum12M) {
		this.epSecuPenaltyNum12M = epSecuPenaltyNum12M;
	}
	public Long getEpSecuPenaltyNum12M( ) {
		return this.epSecuPenaltyNum12M;
	}

	public void setEpSecuPenaltyTopType12M(String epSecuPenaltyTopType12M) {
		this.epSecuPenaltyTopType12M = epSecuPenaltyTopType12M;
	}
	public String getEpSecuPenaltyTopType12M( ) {
		return this.epSecuPenaltyTopType12M;
	}

	public void setEpSeriousIllegalListFlag(Boolean epSeriousIllegalListFlag) {
		this.epSeriousIllegalListFlag = epSeriousIllegalListFlag;
	}
	public Boolean getEpSeriousIllegalListFlag( ) {
		return this.epSeriousIllegalListFlag;
	}

	public void setEpStaffNumAdjRate12M(String epStaffNumAdjRate12M) {
		this.epStaffNumAdjRate12M = epStaffNumAdjRate12M;
	}
	public String getEpStaffNumAdjRate12M( ) {
		return this.epStaffNumAdjRate12M;
	}

	public void setEpStatus(String epStatus) {
		this.epStatus = epStatus;
	}
	public String getEpStatus( ) {
		return this.epStatus;
	}

	public void setEpTaxAbnorAcctNum12M(Long epTaxAbnorAcctNum12M) {
		this.epTaxAbnorAcctNum12M = epTaxAbnorAcctNum12M;
	}
	public Long getEpTaxAbnorAcctNum12M( ) {
		return this.epTaxAbnorAcctNum12M;
	}

	public void setEpTaxCreditAdjDicLatest(String epTaxCreditAdjDicLatest) {
		this.epTaxCreditAdjDicLatest = epTaxCreditAdjDicLatest;
	}
	public String getEpTaxCreditAdjDicLatest( ) {
		return this.epTaxCreditAdjDicLatest;
	}

	public void setEpTaxPenaltyAmt12M(String epTaxPenaltyAmt12M) {
		this.epTaxPenaltyAmt12M = epTaxPenaltyAmt12M;
	}
	public String getEpTaxPenaltyAmt12M( ) {
		return this.epTaxPenaltyAmt12M;
	}

	public void setEpTaxPenaltyNum12M(Long epTaxPenaltyNum12M) {
		this.epTaxPenaltyNum12M = epTaxPenaltyNum12M;
	}
	public Long getEpTaxPenaltyNum12M( ) {
		return this.epTaxPenaltyNum12M;
	}

	public void setEpTaxPenaltyTopType12M(String epTaxPenaltyTopType12M) {
		this.epTaxPenaltyTopType12M = epTaxPenaltyTopType12M;
	}
	public String getEpTaxPenaltyTopType12M( ) {
		return this.epTaxPenaltyTopType12M;
	}

	public void setEvaluateTime(Date evaluateTime) {
		this.evaluateTime = evaluateTime;
	}
	public Date getEvaluateTime( ) {
		return this.evaluateTime;
	}

	public void setExcuLimiHighConsum12MFlag(Boolean excuLimiHighConsum12MFlag) {
		this.excuLimiHighConsum12MFlag = excuLimiHighConsum12MFlag;
	}
	public Boolean getExcuLimiHighConsum12MFlag( ) {
		return this.excuLimiHighConsum12MFlag;
	}

	public void setIssueGreenBondFlag(Boolean issueGreenBondFlag) {
		this.issueGreenBondFlag = issueGreenBondFlag;
	}
	public Boolean getIssueGreenBondFlag( ) {
		return this.issueGreenBondFlag;
	}

	public void setOverStdGasEmiLastYearFlag(Boolean overStdGasEmiLastYearFlag) {
		this.overStdGasEmiLastYearFlag = overStdGasEmiLastYearFlag;
	}
	public Boolean getOverStdGasEmiLastYearFlag( ) {
		return this.overStdGasEmiLastYearFlag;
	}

	public void setOverStdWaterEmiLastYearFlag(Boolean overStdWaterEmiLastYearFlag) {
		this.overStdWaterEmiLastYearFlag = overStdWaterEmiLastYearFlag;
	}
	public Boolean getOverStdWaterEmiLastYearFlag( ) {
		return this.overStdWaterEmiLastYearFlag;
	}

	public void setOverVolGasEmiLastYearFlag(Boolean overVolGasEmiLastYearFlag) {
		this.overVolGasEmiLastYearFlag = overVolGasEmiLastYearFlag;
	}
	public Boolean getOverVolGasEmiLastYearFlag( ) {
		return this.overVolGasEmiLastYearFlag;
	}

	public void setOverVolWaterEmiLastYearFlag(Boolean overVolWaterEmiLastYearFlag) {
		this.overVolWaterEmiLastYearFlag = overVolWaterEmiLastYearFlag;
	}
	public Boolean getOverVolWaterEmiLastYearFlag( ) {
		return this.overVolWaterEmiLastYearFlag;
	}

	public void setOwingTax12MFlag(Boolean owingTax12MFlag) {
		this.owingTax12MFlag = owingTax12MFlag;
	}
	public Boolean getOwingTax12MFlag( ) {
		return this.owingTax12MFlag;
	}

	public void setReqEmiAdj12MFlag(Boolean reqEmiAdj12MFlag) {
		this.reqEmiAdj12MFlag = reqEmiAdj12MFlag;
	}
	public Boolean getReqEmiAdj12MFlag( ) {
		return this.reqEmiAdj12MFlag;
	}

	public void setTaxAsPay12MFlag(Boolean taxAsPay12MFlag) {
		this.taxAsPay12MFlag = taxAsPay12MFlag;
	}
	public Boolean getTaxAsPay12MFlag( ) {
		return this.taxAsPay12MFlag;
	}

	public void setTaxCreditALevelLatestFlag(Boolean taxCreditALevelLatestFlag) {
		this.taxCreditALevelLatestFlag = taxCreditALevelLatestFlag;
	}
	public Boolean getTaxCreditALevelLatestFlag( ) {
		return this.taxCreditALevelLatestFlag;
	}

}
