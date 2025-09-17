package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.JointAccountQuotaRespDTO;
import com.alipay.api.domain.AuthorizedRuleDTO;
import com.alipay.api.domain.InviteResultDTO;
import com.alipay.api.domain.JointAccountMemberInfoRespDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 11:47:37
 */
public class AlipayFundJointaccountDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5674513751247621249L;

	/** 
	 * 合花群ID（支付宝侧生成）
	 */
	@ApiField("account_id")
	private String accountId;

	/** 
	 * 账户名称（支付宝侧生成）
	 */
	@ApiField("account_name")
	private String accountName;

	/** 
	 * 额度模型
	 */
	@ApiListField("account_quota")
	@ApiField("joint_account_quota_resp_d_t_o")
	private List<JointAccountQuotaRespDTO> accountQuota;

	/** 
	 * 账户状态<br>
-NORMAL：正常<br>
-RELEASING：注销中<br>
-RELEASED：已注销<br>
- FREEZE：冻结
	 */
	@ApiField("account_status")
	private String accountStatus;

	/** 
	 * 授权协议号（支付宝侧生成）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 交易授权信息
指定收单商户
	 */
	@ApiField("authorized_rule")
	private AuthorizedRuleDTO authorizedRule;

	/** 
	 * 当前可用金额（单位为元，必须大于0且最多小数点后两位）
	 */
	@ApiField("available_balance")
	private String availableBalance;

	/** 
	 * 业务场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * （创建人）支付宝侧用户唯一标识
	 */
	@ApiField("creator_id")
	private String creatorId;

	/** 
	 * （创建人）支付宝侧用户唯一标识
	 */
	@ApiField("creator_open_id")
	private String creatorOpenId;

	/** 
	 * （创建人）商户侧用户唯一标识<br>
补充说明：<br>
-如果签约时，发起人标识传递的是商户侧用户唯一标识，则该字段会返回<br>
-如果签约时，发起人标识传递的是支付宝侧用户唯一标识，则该字段为空
	 */
	@ApiField("creator_out_id")
	private String creatorOutId;

	/** 
	 * 当前冻结金额（单位为元，必须大于0且最多小数点后两位）
	 */
	@ApiField("freeze_balance")
	private String freezeBalance;

	/** 
	 * 签约时邀请的成员列表（快照）
	 */
	@ApiListField("invite_result_list")
	@ApiField("invite_result_d_t_o")
	private List<InviteResultDTO> inviteResultList;

	/** 
	 * 已加入合花群的成员列表
	 */
	@ApiListField("member_list")
	@ApiField("joint_account_member_info_resp_d_t_o")
	private List<JointAccountMemberInfoRespDTO> memberList;

	/** 
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 生息状态：</br>
- MAKING    ：开启中</br>
- MADE.       ：已开启</br>
- CLEARING：关闭中</br>
- NONE.       ：未生息
	 */
	@ApiField("profit_status")
	private String profitStatus;

	/** 
	 * 昨日收益
	 */
	@ApiField("yesterday_profit")
	private String yesterdayProfit;

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountId( ) {
		return this.accountId;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountName( ) {
		return this.accountName;
	}

	public void setAccountQuota(List<JointAccountQuotaRespDTO> accountQuota) {
		this.accountQuota = accountQuota;
	}
	public List<JointAccountQuotaRespDTO> getAccountQuota( ) {
		return this.accountQuota;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getAccountStatus( ) {
		return this.accountStatus;
	}

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setAuthorizedRule(AuthorizedRuleDTO authorizedRule) {
		this.authorizedRule = authorizedRule;
	}
	public AuthorizedRuleDTO getAuthorizedRule( ) {
		return this.authorizedRule;
	}

	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}
	public String getAvailableBalance( ) {
		return this.availableBalance;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}
	public String getCreatorId( ) {
		return this.creatorId;
	}

	public void setCreatorOpenId(String creatorOpenId) {
		this.creatorOpenId = creatorOpenId;
	}
	public String getCreatorOpenId( ) {
		return this.creatorOpenId;
	}

	public void setCreatorOutId(String creatorOutId) {
		this.creatorOutId = creatorOutId;
	}
	public String getCreatorOutId( ) {
		return this.creatorOutId;
	}

	public void setFreezeBalance(String freezeBalance) {
		this.freezeBalance = freezeBalance;
	}
	public String getFreezeBalance( ) {
		return this.freezeBalance;
	}

	public void setInviteResultList(List<InviteResultDTO> inviteResultList) {
		this.inviteResultList = inviteResultList;
	}
	public List<InviteResultDTO> getInviteResultList( ) {
		return this.inviteResultList;
	}

	public void setMemberList(List<JointAccountMemberInfoRespDTO> memberList) {
		this.memberList = memberList;
	}
	public List<JointAccountMemberInfoRespDTO> getMemberList( ) {
		return this.memberList;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setProfitStatus(String profitStatus) {
		this.profitStatus = profitStatus;
	}
	public String getProfitStatus( ) {
		return this.profitStatus;
	}

	public void setYesterdayProfit(String yesterdayProfit) {
		this.yesterdayProfit = yesterdayProfit;
	}
	public String getYesterdayProfit( ) {
		return this.yesterdayProfit;
	}

}
