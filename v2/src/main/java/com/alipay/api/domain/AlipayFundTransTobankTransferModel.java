package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单笔转账到银行账户接口
 *
 * @author auto create
 * @since 1.0, 2022-01-17 17:59:46
 */
public class AlipayFundTransTobankTransferModel extends AlipayObject {

	private static final long serialVersionUID = 2434812397962615945L;

	/**
	 * 转账金额，单位：元。
只支持2位小数，小数点前最大支持13位，金额必须大于0。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 用途信息。
当转账金额大于5万且银行卡账户类型为对私时，必须传递本参数。
当付款方为企业账户，且转账金额达到（大于等于）50000元，memo和remark不能同时为空。
	1：代发工资协议和收款人清单
	2：奖励
	3：新闻版、演出等相关劳动合同
	4：证券、期货、信托等退款
	5：债权或产权转让协议
	6：借款合同
	7：保险合同
	8：税收征管部门的
	9：农、副、矿产品购销合同
	10：其他合法款项的
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户转账唯一订单号：发起转账来源方定义的转账单据ID，用于将转账回执通知给来源方。
不同来源方给出的ID可以重复，同一个来源方必须保证其ID的唯一性。
只支持半角英文、数字，及“-”、“_”。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 收款方银行账户名，必须与收款方银行卡号所属账户信息一致。
	 */
	@ApiField("payee_account_name")
	private String payeeAccountName;

	/**
	 * 收款账户类型。
	1：对公（在金融机构开设的公司账户）
	2：对私（在金融机构开设的个人账户）
	 */
	@ApiField("payee_account_type")
	private String payeeAccountType;

	/**
	 * 收款支行联行号：收款银行支行联行号（支持32个英文/16个汉字）。
	 */
	@ApiField("payee_bank_code")
	private String payeeBankCode;

	/**
	 * 收款方银行卡号信息，只支持半角英文、数字及“-”。
目前只支持借记卡卡号。
	 */
	@ApiField("payee_card_no")
	private String payeeCardNo;

	/**
	 * 收款银行所属支行（支持100个英文/50个汉字）。
	 */
	@ApiField("payee_inst_branch_name")
	private String payeeInstBranchName;

	/**
	 * 收款银行所在市（支持40个英文/20个汉字）。
	 */
	@ApiField("payee_inst_city")
	private String payeeInstCity;

	/**
	 * 收款卡开户银行（支持30个英文/15个汉字）。
	 */
	@ApiField("payee_inst_name")
	private String payeeInstName;

	/**
	 * 收款银行所在省份（支持20个英文/10个汉字）。
	 */
	@ApiField("payee_inst_province")
	private String payeeInstProvince;

	/**
	 * 付款方真实姓名（支持100个英文/50个汉字）。
如果不为空，则会校验该账户在支付宝登入的实名是否与付款方真实姓名一致。
	 */
	@ApiField("payer_real_name")
	private String payerRealName;

	/**
	 * 银行备注（支持100个英文/50个汉字），该信息将通过银行渠道发送给收款方。
当付款方为企业账户，且转账金额达到（大于等于）50000元，memo和remark不能同时为空。
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 申请到账时效。
	T0：当日到账
	T1：次日到账
	 */
	@ApiField("time_liness")
	private String timeLiness;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayeeAccountName() {
		return this.payeeAccountName;
	}
	public void setPayeeAccountName(String payeeAccountName) {
		this.payeeAccountName = payeeAccountName;
	}

	public String getPayeeAccountType() {
		return this.payeeAccountType;
	}
	public void setPayeeAccountType(String payeeAccountType) {
		this.payeeAccountType = payeeAccountType;
	}

	public String getPayeeBankCode() {
		return this.payeeBankCode;
	}
	public void setPayeeBankCode(String payeeBankCode) {
		this.payeeBankCode = payeeBankCode;
	}

	public String getPayeeCardNo() {
		return this.payeeCardNo;
	}
	public void setPayeeCardNo(String payeeCardNo) {
		this.payeeCardNo = payeeCardNo;
	}

	public String getPayeeInstBranchName() {
		return this.payeeInstBranchName;
	}
	public void setPayeeInstBranchName(String payeeInstBranchName) {
		this.payeeInstBranchName = payeeInstBranchName;
	}

	public String getPayeeInstCity() {
		return this.payeeInstCity;
	}
	public void setPayeeInstCity(String payeeInstCity) {
		this.payeeInstCity = payeeInstCity;
	}

	public String getPayeeInstName() {
		return this.payeeInstName;
	}
	public void setPayeeInstName(String payeeInstName) {
		this.payeeInstName = payeeInstName;
	}

	public String getPayeeInstProvince() {
		return this.payeeInstProvince;
	}
	public void setPayeeInstProvince(String payeeInstProvince) {
		this.payeeInstProvince = payeeInstProvince;
	}

	public String getPayerRealName() {
		return this.payerRealName;
	}
	public void setPayerRealName(String payerRealName) {
		this.payerRealName = payerRealName;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTimeLiness() {
		return this.timeLiness;
	}
	public void setTimeLiness(String timeLiness) {
		this.timeLiness = timeLiness;
	}

}
