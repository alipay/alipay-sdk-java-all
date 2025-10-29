package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BenefitAccountFsFundInfoDTO;
import com.alipay.api.domain.FsFundRelationGroupDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.benefitaccount.account.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-29 11:17:38
 */
public class AlipayMarketingBenefitaccountAccountModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8167457558741868528L;

	/** 
	 * 权益账户账号
	 */
	@ApiField("benefit_account_no")
	private String benefitAccountNo;

	/** 
	 * 权益账户出资方信息
	 */
	@ApiListField("fund_infos")
	@ApiField("benefit_account_fs_fund_info_d_t_o")
	private List<BenefitAccountFsFundInfoDTO> fundInfos;

	/** 
	 * 出资关系组
	 */
	@ApiField("fund_relation_groups")
	private FsFundRelationGroupDTO fundRelationGroups;

	public void setBenefitAccountNo(String benefitAccountNo) {
		this.benefitAccountNo = benefitAccountNo;
	}
	public String getBenefitAccountNo( ) {
		return this.benefitAccountNo;
	}

	public void setFundInfos(List<BenefitAccountFsFundInfoDTO> fundInfos) {
		this.fundInfos = fundInfos;
	}
	public List<BenefitAccountFsFundInfoDTO> getFundInfos( ) {
		return this.fundInfos;
	}

	public void setFundRelationGroups(FsFundRelationGroupDTO fundRelationGroups) {
		this.fundRelationGroups = fundRelationGroups;
	}
	public FsFundRelationGroupDTO getFundRelationGroups( ) {
		return this.fundRelationGroups;
	}

}
