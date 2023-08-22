package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融代收付交易方信息
 *
 * @author auto create
 * @since 1.0, 2023-01-06 11:03:59
 */
public class SceneProdPaymentAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 5151899812748388784L;

	/**
	 * 账号外标，如支付宝登录号,网商银行卡卡号
	 */
	@ApiField("account_ext_no")
	private String accountExtNo;

	/**
	 * 金融机构码
	 */
	@ApiField("account_fip_code")
	private String accountFipCode;

	/**
	 * 金融机构名称
	 */
	@ApiField("account_fip_name")
	private String accountFipName;

	/**
	 * 资金账号,支付宝2088开头或银行卡号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 账号分类, ALIPAY:支付宝 , CURRENT: 网商银行
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 资金操作金额，单位分
	 */
	@ApiField("amt")
	private String amt;

	/**
	 * 账户对公对私类型,P-对私，B-对公
	 */
	@ApiField("bank_card_category")
	private String bankCardCategory;

	/**
	 * 持卡人姓名
	 */
	@ApiField("card_holder_name")
	private String cardHolderName;

	/**
	 * 资产工具为外部银行卡时可填，且为外部贷记卡模式下必须填写为CC，其余无需填写。
	 */
	@ApiField("ext_card_type")
	private String extCardType;

	/**
	 * 扩展信息，map格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 开户行联行号，机构可以通过联行号查询网商查询获取。
	 */
	@ApiField("inst_out_code")
	private String instOutCode;

	/**
	 * 网商参与者id
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 网商银行角色id
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 该笔账号涉及业务的贷款类型
	 */
	@ApiField("loan_type")
	private String loanType;

	/**
	 * 账单备注
	 */
	@ApiField("payment_mark")
	private String paymentMark;

	/**
	 * 涉及该账号的账号序号
	 */
	@ApiField("seq_no")
	private String seqNo;

	public String getAccountExtNo() {
		return this.accountExtNo;
	}
	public void setAccountExtNo(String accountExtNo) {
		this.accountExtNo = accountExtNo;
	}

	public String getAccountFipCode() {
		return this.accountFipCode;
	}
	public void setAccountFipCode(String accountFipCode) {
		this.accountFipCode = accountFipCode;
	}

	public String getAccountFipName() {
		return this.accountFipName;
	}
	public void setAccountFipName(String accountFipName) {
		this.accountFipName = accountFipName;
	}

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAmt() {
		return this.amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getBankCardCategory() {
		return this.bankCardCategory;
	}
	public void setBankCardCategory(String bankCardCategory) {
		this.bankCardCategory = bankCardCategory;
	}

	public String getCardHolderName() {
		return this.cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getExtCardType() {
		return this.extCardType;
	}
	public void setExtCardType(String extCardType) {
		this.extCardType = extCardType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getInstOutCode() {
		return this.instOutCode;
	}
	public void setInstOutCode(String instOutCode) {
		this.instOutCode = instOutCode;
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

	public String getLoanType() {
		return this.loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getPaymentMark() {
		return this.paymentMark;
	}
	public void setPaymentMark(String paymentMark) {
		this.paymentMark = paymentMark;
	}

	public String getSeqNo() {
		return this.seqNo;
	}
	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}

}
