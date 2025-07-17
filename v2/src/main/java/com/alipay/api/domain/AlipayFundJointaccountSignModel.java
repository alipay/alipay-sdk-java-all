package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业跳端签约
 *
 * @author auto create
 * @since 1.0, 2025-06-13 18:23:25
 */
public class AlipayFundJointaccountSignModel extends AlipayObject {

	private static final long serialVersionUID = 4167924888779475328L;

	/**
	 * 账本名称，传空采用默认规则命名，使用公司名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 账户初始额度
未设置额度的账本无法进行支付
	 */
	@ApiListField("account_quota")
	@ApiField("joint_account_quota_d_t_o")
	private List<JointAccountQuotaDTO> accountQuota;

	/**
	 * 授权商户列表
	 */
	@ApiListField("authorized_detail_list")
	@ApiField("authorize_detail_d_t_o")
	private List<AuthorizeDetailDTO> authorizedDetailList;

	/**
	 * 交易授权信息
指定收单商户
	 */
	@ApiField("authorized_rule")
	private AuthorizedRuleDTO authorizedRule;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 业务渠道</br>
补充说明：</br>
需要商户侧必传，支付宝侧不做强校验
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 资金转入计划详情</br>
补充说明：</br>
开户+手动转入场景，必传
	 */
	@ApiField("deposit")
	private DepositForm deposit;

	/**
	 * 资金计划详情</br>
补充说明：</br>开户+自动攒场景，必传
	 */
	@ApiField("fund_plan")
	private FundPlanForm fundPlan;

	/**
	 * 开户账号：<br>
-当identity_type是ALIPAY_USER_ID时填支付宝会员ID（2088开头）<br>
-当identity_type是ALIPAY_LOGON_ID 时填支付宝登录号<br>
-当identity_type是OUT_USER_ID时填外部平台的用户uid
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 账号类型，目前支持如下类型： <br>
-ALIPAY_USER_ID 支付宝的会员ID<br>
-ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式<br>
-OUT_USER_ID：外部用户uid，如钉钉侧的钉钉会员uid
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 开户时被邀请者列表
	 */
	@ApiListField("invitee_list")
	@ApiField("invite_member_form")
	private List<InviteMemberForm> inviteeList;

	/**
	 * 开户用户名称，identity_type为ALIPAY_LOGON_ID时必填
	 */
	@ApiField("name")
	private String name;

	/**
	 * 开户邀请倒计时（单位：秒），超时后撤销系统自动撤销开户操作。<br>
补充说明：<br>
-商户传递时，最长不可超过999999秒（约11天）<br>
-商户不传该字段时，支付宝默认开户72小时后发起撤销操作
	 */
	@ApiField("open_timeout")
	private String openTimeout;

	/**
	 * 商户侧单号（幂等字段）<br>
-补充说明：幂等逻辑（商户appid+out_biz_no），商户集成时需注意，如换号重复发起，则认为是一笔新的请求
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部实体ID，一般表述为外部操作人操作某个外部实体。比如企业码2284号
	 */
	@ApiField("out_entity_id")
	private String outEntityId;

	/**
	 * ISV平台定义的共同账户开户来源
	 */
	@ApiField("out_source")
	private String outSource;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public List<JointAccountQuotaDTO> getAccountQuota() {
		return this.accountQuota;
	}
	public void setAccountQuota(List<JointAccountQuotaDTO> accountQuota) {
		this.accountQuota = accountQuota;
	}

	public List<AuthorizeDetailDTO> getAuthorizedDetailList() {
		return this.authorizedDetailList;
	}
	public void setAuthorizedDetailList(List<AuthorizeDetailDTO> authorizedDetailList) {
		this.authorizedDetailList = authorizedDetailList;
	}

	public AuthorizedRuleDTO getAuthorizedRule() {
		return this.authorizedRule;
	}
	public void setAuthorizedRule(AuthorizedRuleDTO authorizedRule) {
		this.authorizedRule = authorizedRule;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public DepositForm getDeposit() {
		return this.deposit;
	}
	public void setDeposit(DepositForm deposit) {
		this.deposit = deposit;
	}

	public FundPlanForm getFundPlan() {
		return this.fundPlan;
	}
	public void setFundPlan(FundPlanForm fundPlan) {
		this.fundPlan = fundPlan;
	}

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public List<InviteMemberForm> getInviteeList() {
		return this.inviteeList;
	}
	public void setInviteeList(List<InviteMemberForm> inviteeList) {
		this.inviteeList = inviteeList;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpenTimeout() {
		return this.openTimeout;
	}
	public void setOpenTimeout(String openTimeout) {
		this.openTimeout = openTimeout;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutEntityId() {
		return this.outEntityId;
	}
	public void setOutEntityId(String outEntityId) {
		this.outEntityId = outEntityId;
	}

	public String getOutSource() {
		return this.outSource;
	}
	public void setOutSource(String outSource) {
		this.outSource = outSource;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
