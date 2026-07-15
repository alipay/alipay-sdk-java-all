package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccountBalanceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.ecny.welfarewallet.balance.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-16 17:32:56
 */
public class MybankEcnyWelfarewalletBalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3469464118235852371L;

	/** 
	 * 福利子钱包资产余额列表
	 */
	@ApiListField("account_balance_info_list")
	@ApiField("account_balance_info")
	private List<AccountBalanceInfo> accountBalanceInfoList;

	/** 
	 * 子钱包余额，单位CNY
	 */
	@ApiField("wallet_balance")
	private String walletBalance;

	/** 
	 * 福利子钱包编号
	 */
	@ApiField("wallet_id")
	private String walletId;

	/** 
	 * 钱包状态- NORMAL：正常
- FREEZE：冻结
- LOSS：挂失
- DEEP_FREEZE：深度冻结（注销前特定状态）
	 */
	@ApiField("wallet_status")
	private String walletStatus;

	public void setAccountBalanceInfoList(List<AccountBalanceInfo> accountBalanceInfoList) {
		this.accountBalanceInfoList = accountBalanceInfoList;
	}
	public List<AccountBalanceInfo> getAccountBalanceInfoList( ) {
		return this.accountBalanceInfoList;
	}

	public void setWalletBalance(String walletBalance) {
		this.walletBalance = walletBalance;
	}
	public String getWalletBalance( ) {
		return this.walletBalance;
	}

	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}
	public String getWalletId( ) {
		return this.walletId;
	}

	public void setWalletStatus(String walletStatus) {
		this.walletStatus = walletStatus;
	}
	public String getWalletStatus( ) {
		return this.walletStatus;
	}

}
