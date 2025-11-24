package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BenefitAccountFsFundInfoDTO;
import com.alipay.api.domain.BenefitAccountFundPreAuthInfoDTO;
import com.alipay.api.domain.FsFundRelationGroupDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.benefitaccount.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-19 21:05:02
 */
public class AlipayMarketingBenefitaccountAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1332352659783134528L;

	/** 
	 * 权益账户号
	 */
	@ApiField("benefit_account_no")
	private String benefitAccountNo;

	/** 
	 * 业务身份，支付宝分配
	 */
	@ApiField("biz_identity")
	private String bizIdentity;

	/** 
	 * 权益账户当前剩余可核销金额，单位：元
	 */
	@ApiField("current_amount")
	private String currentAmount;

	/** 
	 * 权益账户生效时间
	 */
	@ApiField("effective_time")
	private Date effectiveTime;

	/** 
	 * 权益账户失效时间
	 */
	@ApiField("expired_time")
	private Date expiredTime;

	/** 
	 * 权益账户出资明细
	 */
	@ApiListField("fund_infos")
	@ApiField("benefit_account_fs_fund_info_d_t_o")
	private List<BenefitAccountFsFundInfoDTO> fundInfos;

	/** 
	 * 预授权资金信息
	 */
	@ApiField("fund_pre_auth_info")
	private BenefitAccountFundPreAuthInfoDTO fundPreAuthInfo;

	/** 
	 * 出资关系组
	 */
	@ApiListField("fund_relation_groups")
	@ApiField("fs_fund_relation_group_d_t_o")
	private List<FsFundRelationGroupDTO> fundRelationGroups;

	/** 
	 * 权益账户的账户名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 外标卡号
	 */
	@ApiField("out_card_no")
	private String outCardNo;

	/** 
	 * 有效
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 权益账户总金额，随着退款缩减而变化，单位：元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setBenefitAccountNo(String benefitAccountNo) {
		this.benefitAccountNo = benefitAccountNo;
	}
	public String getBenefitAccountNo( ) {
		return this.benefitAccountNo;
	}

	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}
	public String getBizIdentity( ) {
		return this.bizIdentity;
	}

	public void setCurrentAmount(String currentAmount) {
		this.currentAmount = currentAmount;
	}
	public String getCurrentAmount( ) {
		return this.currentAmount;
	}

	public void setEffectiveTime(Date effectiveTime) {
		this.effectiveTime = effectiveTime;
	}
	public Date getEffectiveTime( ) {
		return this.effectiveTime;
	}

	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}
	public Date getExpiredTime( ) {
		return this.expiredTime;
	}

	public void setFundInfos(List<BenefitAccountFsFundInfoDTO> fundInfos) {
		this.fundInfos = fundInfos;
	}
	public List<BenefitAccountFsFundInfoDTO> getFundInfos( ) {
		return this.fundInfos;
	}

	public void setFundPreAuthInfo(BenefitAccountFundPreAuthInfoDTO fundPreAuthInfo) {
		this.fundPreAuthInfo = fundPreAuthInfo;
	}
	public BenefitAccountFundPreAuthInfoDTO getFundPreAuthInfo( ) {
		return this.fundPreAuthInfo;
	}

	public void setFundRelationGroups(List<FsFundRelationGroupDTO> fundRelationGroups) {
		this.fundRelationGroups = fundRelationGroups;
	}
	public List<FsFundRelationGroupDTO> getFundRelationGroups( ) {
		return this.fundRelationGroups;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setOutCardNo(String outCardNo) {
		this.outCardNo = outCardNo;
	}
	public String getOutCardNo( ) {
		return this.outCardNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
