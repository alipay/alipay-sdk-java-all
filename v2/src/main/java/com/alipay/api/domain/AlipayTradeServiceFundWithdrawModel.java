package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金提现
 *
 * @author auto create
 * @since 1.0, 2021-07-13 21:51:40
 */
public class AlipayTradeServiceFundWithdrawModel extends AlipayObject {

	private static final long serialVersionUID = 5193664725867918181L;

	/**
	 * 用户支付宝UID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 提现金额,单位:元，精确到小数点后两位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 服务对应的业务场景,由支付宝分配. 枚举值列表: LARGE_INFINITE_V2:无限付2.0; YUEBAO_TRANSFER:余额宝大额申购; AD_CHARGE:灯火平台广告费充值; PERSONAL_ACCOUNT_RECHARGE:灯火平台广告费充值; ETC_B2B:区块链ETC_B2B
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 商户端的唯一订单号，对于同一笔提现请求，商户需保证该订单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 子业务场景，由支付宝分配.枚举值列表: 1.ACS模式: 2.FUND_ACCOUNT:场景余额 3.SHBANK:上海银行
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 待提现的银行卡账户名称
	 */
	@ApiField("withdraw_account_name")
	private String withdrawAccountName;

	/**
	 * 待提现的银行卡账号
	 */
	@ApiField("withdraw_account_no")
	private String withdrawAccountNo;

	/**
	 * 待提现的银行联行号
	 */
	@ApiField("withdraw_bank_branch_code")
	private String withdrawBankBranchCode;

	/**
	 * 提现的银行机构id
	 */
	@ApiField("withdraw_bank_inst_id")
	private String withdrawBankInstId;

	/**
	 * 待提现的银行卡类型
DC:借记卡
CC:贷记卡
	 */
	@ApiField("withdraw_card_type")
	private String withdrawCardType;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getWithdrawAccountName() {
		return this.withdrawAccountName;
	}
	public void setWithdrawAccountName(String withdrawAccountName) {
		this.withdrawAccountName = withdrawAccountName;
	}

	public String getWithdrawAccountNo() {
		return this.withdrawAccountNo;
	}
	public void setWithdrawAccountNo(String withdrawAccountNo) {
		this.withdrawAccountNo = withdrawAccountNo;
	}

	public String getWithdrawBankBranchCode() {
		return this.withdrawBankBranchCode;
	}
	public void setWithdrawBankBranchCode(String withdrawBankBranchCode) {
		this.withdrawBankBranchCode = withdrawBankBranchCode;
	}

	public String getWithdrawBankInstId() {
		return this.withdrawBankInstId;
	}
	public void setWithdrawBankInstId(String withdrawBankInstId) {
		this.withdrawBankInstId = withdrawBankInstId;
	}

	public String getWithdrawCardType() {
		return this.withdrawCardType;
	}
	public void setWithdrawCardType(String withdrawCardType) {
		this.withdrawCardType = withdrawCardType;
	}

}
