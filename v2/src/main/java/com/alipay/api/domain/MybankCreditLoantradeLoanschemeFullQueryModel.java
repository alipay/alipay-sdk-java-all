package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询客户完整贷款方案
 *
 * @author auto create
 * @since 1.0, 2023-03-23 16:40:37
 */
public class MybankCreditLoantradeLoanschemeFullQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4643466626335559978L;

	/**
	 * 支付宝会员id，支付宝内部用于标识会员的唯一ID，以2088开头，不是支付宝登录账号
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * OpenId是某个用户在某个应用下的唯一用户标识， 对于同一个用户，不同应用拿到的OpenId是不同的，而且对于同一个应用，不同用户的OpenId是唯一的
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支用金额，默认单位是人民币，精确到小数点两位，单位元
	 */
	@ApiField("apply_amt")
	private String applyAmt;

	/**
	 * 申请支用日期(精度为天)，格式：YYYY-MM-DD，如：2017-01-01
	 */
	@ApiField("apply_date")
	private Date applyDate;

	/**
	 * 固化授信模式下的授信编号，由网商银行内部的系统生成，示例值：20161227BC2343C0000000001。若为预授信，则此值为空。
	 */
	@ApiField("credit_no")
	private String creditNo;

	/**
	 * 客群，信贷申请领域用来标识客户种类，由网商银行内部系统生成。
	 */
	@ApiField("cust_group")
	private String custGroup;

	/**
	 * 银行参与者id，是在网商银行创建会员后生成的id，网商银行会员的唯一标识
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 银行参与者角色id，是在网商银行创建会员后生成的角色id，网商银行会员角色的唯一标识
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 网商银行在对客户授信时，使用的政策产品唯一标识码，由网商银行内部生成，长度8位，字母和数字组成，示例值：BC32001C
	 */
	@ApiField("loan_policy_code")
	private String loanPolicyCode;

	/**
	 * 贷款期限，数值，在客户签署贷款合约时，会展示此值
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 贷款期限单位，枚举值：Y、M、D，分别表示年月日，在客户签署贷款合约时，会展示此值
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 放款用的营销工具ID列表，例如打折卡ID列表
	 */
	@ApiListField("promo_tools")
	@ApiField("string")
	private List<String> promoTools;

	/**
	 * 还款方式，枚举值：1（等额本息）、2（等额本金）、3（按期付息到期还本）、4（组合还款）、6（一次性到期还本付息）、7（固定利息等额分期），客户签署贷款合约时会展示此值
	 */
	@ApiField("repay_mode")
	private String repayMode;

	/**
	 * 销售产品码，一个信贷产品对外销售时的唯一标识，由网商银行内部分配，长度20位的一串数字，示例值：01021000100000000169
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * 收款账号信息，注意：子参数不能全为空
	 */
	@ApiField("trans_in_account")
	private MyBkAccountVO transInAccount;

	public String getAlipayId() {
		return this.alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
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

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getLoanPolicyCode() {
		return this.loanPolicyCode;
	}
	public void setLoanPolicyCode(String loanPolicyCode) {
		this.loanPolicyCode = loanPolicyCode;
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

	public List<String> getPromoTools() {
		return this.promoTools;
	}
	public void setPromoTools(List<String> promoTools) {
		this.promoTools = promoTools;
	}

	public String getRepayMode() {
		return this.repayMode;
	}
	public void setRepayMode(String repayMode) {
		this.repayMode = repayMode;
	}

	public String getSalePdCode() {
		return this.salePdCode;
	}
	public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}

	public MyBkAccountVO getTransInAccount() {
		return this.transInAccount;
	}
	public void setTransInAccount(MyBkAccountVO transInAccount) {
		this.transInAccount = transInAccount;
	}

}
