package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卖家提前收款
 *
 * @author auto create
 * @since 1.0, 2017-08-15 19:31:17
 */
public class MybankCreditSupplychainPaymentAdvanceReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 8321235391233585553L;

	/**
	 * 综合管理协议号
	 */
	@ApiField("admin_ar_no")
	private String adminArNo;

	/**
	 * 收款金额，单位元，精确到分
	 */
	@ApiField("apply_amt")
	private String applyAmt;

	/**
	 * 支用申请日期
	 */
	@ApiField("apply_date")
	private Date applyDate;

	/**
	 * 买家ip_id
	 */
	@ApiField("buyer_ip_id")
	private String buyerIpId;

	/**
	 * 买家ip_role_id
	 */
	@ApiField("buyer_ip_role_id")
	private String buyerIpRoleId;

	/**
	 * 买家会员站点，ALIPAY：支付宝站点，MYBANK：银行会员，B2B_CN：B2B中文站，B2B_EN：B2B国际站，TAOBAO：淘宝
	 */
	@ApiField("buyer_site")
	private String buyerSite;

	/**
	 * 买家站点会员ID
	 */
	@ApiField("buyer_site_user_id")
	private String buyerSiteUserId;

	/**
	 * 授信编号,允许为空,外部账款
	 */
	@ApiField("credit_no")
	private String creditNo;

	/**
	 * 客群标签
	 */
	@ApiField("cust_group")
	private String custGroup;

	/**
	 * 客户机构
	 */
	@ApiField("cust_org")
	private String custOrg;

	/**
	 * 支用到期日期
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 费用金额，单位元，精确到分
	 */
	@ApiField("fee_amt")
	private String feeAmt;

	/**
	 * 保理服务年费率
	 */
	@ApiField("fee_year_rate")
	private Long feeYearRate;

	/**
	 * 账号所属渠道，ASSIGNED_ACCOUNT：定向指定账户，MYBANK_ACCOUNT：网商银行二类户，TMALL_BIND_ALIPAY：天猫小号绑定支付宝，DEFAULT_ALIPAY：默认支付宝，MYBANK_BIND_CARD：网商银行绑定快捷卡，FINANCING_PLATFORM_CARD：融资平台绑定快捷卡，ALIPAY_BIND_CARD：支付宝绑定快捷卡
	 */
	@ApiField("grant_channel")
	private String grantChannel;

	/**
	 * 经营行业编码
	 */
	@ApiField("industry_code")
	private String industryCode;

	/**
	 * 融资政策编码
	 */
	@ApiField("loan_policy_code")
	private String loanPolicyCode;

	/**
	 * 贷款方案签名，用于校验查询到的贷款方案的和签约时的一直
	 */
	@ApiField("loan_scheme_sign")
	private Long loanSchemeSign;

	/**
	 * 贷款期限
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 贷款期限单位，Y－年，M－月，D－日
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 机构框架合约版本时间戳 :yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("org_frame_ar_gmt_vrsn")
	private String orgFrameArGmtVrsn;

	/**
	 * 机构框架合约号
	 */
	@ApiField("org_frame_ar_no")
	private String orgFrameArNo;

	/**
	 * 1688订单编号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 还款方式，EQUAL_LOAN_PAYMENT：等额本息，EQUAL_PRIN_PAYMENT：等额本金，PAY_INT_ON_SHCED_PAY_PRIN_AT_DUE_DAY：按期付息到期还本，MIX_PAYMENT：组合还款，DUE_PRIN_PLUS_INT：一次性到期，还本付息，AVG_CAP_PLUS_INT_BY_TERM：固定利息等额分期
	 */
	@ApiField("repay_mode")
	private String repayMode;

	/**
	 * 幂等编号，用于幂等控制，格式 instIpRoleId_yyyymmddhhmmss_8位uniqId
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 销售渠道code
	 */
	@ApiField("sale_channel_code")
	private String saleChannelCode;

	/**
	 * 销售产品编码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * 销售产品版本
	 */
	@ApiField("sale_pd_version")
	private String salePdVersion;

	/**
	 * 卖家ip_id
	 */
	@ApiField("seller_ip_id")
	private String sellerIpId;

	/**
	 * 卖家ip_role_id
	 */
	@ApiField("seller_ip_role_id")
	private String sellerIpRoleId;

	/**
	 * 卖家会员站点，ALIPAY：支付宝站点，MYBANK：银行会员，B2B_CN：B2B中文站，B2B_EN：B2B国际站，TAOBAO：淘宝
	 */
	@ApiField("seller_site")
	private String sellerSite;

	/**
	 * 卖家会员站点userid
	 */
	@ApiField("seller_site_user_id")
	private String sellerSiteUserId;

	public String getAdminArNo() {
		return this.adminArNo;
	}
	public void setAdminArNo(String adminArNo) {
		this.adminArNo = adminArNo;
	}

	public String getApplyAmt() {
		return this.applyAmt;
	}
	public void setApplyAmt(String applyAmt) {
		this.applyAmt = applyAmt;
	}

	public Date getApplyDate() {
		return this.applyDate;
	}
	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public String getBuyerIpId() {
		return this.buyerIpId;
	}
	public void setBuyerIpId(String buyerIpId) {
		this.buyerIpId = buyerIpId;
	}

	public String getBuyerIpRoleId() {
		return this.buyerIpRoleId;
	}
	public void setBuyerIpRoleId(String buyerIpRoleId) {
		this.buyerIpRoleId = buyerIpRoleId;
	}

	public String getBuyerSite() {
		return this.buyerSite;
	}
	public void setBuyerSite(String buyerSite) {
		this.buyerSite = buyerSite;
	}

	public String getBuyerSiteUserId() {
		return this.buyerSiteUserId;
	}
	public void setBuyerSiteUserId(String buyerSiteUserId) {
		this.buyerSiteUserId = buyerSiteUserId;
	}

	public String getCreditNo() {
		return this.creditNo;
	}
	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}

	public String getCustGroup() {
		return this.custGroup;
	}
	public void setCustGroup(String custGroup) {
		this.custGroup = custGroup;
	}

	public String getCustOrg() {
		return this.custOrg;
	}
	public void setCustOrg(String custOrg) {
		this.custOrg = custOrg;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getFeeAmt() {
		return this.feeAmt;
	}
	public void setFeeAmt(String feeAmt) {
		this.feeAmt = feeAmt;
	}

	public Long getFeeYearRate() {
		return this.feeYearRate;
	}
	public void setFeeYearRate(Long feeYearRate) {
		this.feeYearRate = feeYearRate;
	}

	public String getGrantChannel() {
		return this.grantChannel;
	}
	public void setGrantChannel(String grantChannel) {
		this.grantChannel = grantChannel;
	}

	public String getIndustryCode() {
		return this.industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

	public String getLoanPolicyCode() {
		return this.loanPolicyCode;
	}
	public void setLoanPolicyCode(String loanPolicyCode) {
		this.loanPolicyCode = loanPolicyCode;
	}

	public Long getLoanSchemeSign() {
		return this.loanSchemeSign;
	}
	public void setLoanSchemeSign(Long loanSchemeSign) {
		this.loanSchemeSign = loanSchemeSign;
	}

	public Long getLoanTerm() {
		return this.loanTerm;
	}
	public void setLoanTerm(Long loanTerm) {
		this.loanTerm = loanTerm;
	}

	public String getLoanTermUnit() {
		return this.loanTermUnit;
	}
	public void setLoanTermUnit(String loanTermUnit) {
		this.loanTermUnit = loanTermUnit;
	}

	public String getOrgFrameArGmtVrsn() {
		return this.orgFrameArGmtVrsn;
	}
	public void setOrgFrameArGmtVrsn(String orgFrameArGmtVrsn) {
		this.orgFrameArGmtVrsn = orgFrameArGmtVrsn;
	}

	public String getOrgFrameArNo() {
		return this.orgFrameArNo;
	}
	public void setOrgFrameArNo(String orgFrameArNo) {
		this.orgFrameArNo = orgFrameArNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getRepayMode() {
		return this.repayMode;
	}
	public void setRepayMode(String repayMode) {
		this.repayMode = repayMode;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSaleChannelCode() {
		return this.saleChannelCode;
	}
	public void setSaleChannelCode(String saleChannelCode) {
		this.saleChannelCode = saleChannelCode;
	}

	public String getSalePdCode() {
		return this.salePdCode;
	}
	public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}

	public String getSalePdVersion() {
		return this.salePdVersion;
	}
	public void setSalePdVersion(String salePdVersion) {
		this.salePdVersion = salePdVersion;
	}

	public String getSellerIpId() {
		return this.sellerIpId;
	}
	public void setSellerIpId(String sellerIpId) {
		this.sellerIpId = sellerIpId;
	}

	public String getSellerIpRoleId() {
		return this.sellerIpRoleId;
	}
	public void setSellerIpRoleId(String sellerIpRoleId) {
		this.sellerIpRoleId = sellerIpRoleId;
	}

	public String getSellerSite() {
		return this.sellerSite;
	}
	public void setSellerSite(String sellerSite) {
		this.sellerSite = sellerSite;
	}

	public String getSellerSiteUserId() {
		return this.sellerSiteUserId;
	}
	public void setSellerSiteUserId(String sellerSiteUserId) {
		this.sellerSiteUserId = sellerSiteUserId;
	}

}
