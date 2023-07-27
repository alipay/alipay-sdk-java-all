package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Contract;
import com.alipay.api.domain.LoanScheme;
import com.alipay.api.domain.MyBkAccountVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.loanscheme.full.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-23 20:11:40
 */
public class MybankCreditLoantradeLoanschemeFullQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6757235874874361521L;

	/** 
	 * 贷款支用时涉及的合约列表
	 */
	@ApiListField("contract_list")
	@ApiField("contract")
	private List<Contract> contractList;

	/** 
	 * 对于返回的贷款方案、合约列表、收款信息等数字签名，防篡改，并确保用户看到的和系统后端处理的保持一致
	 */
	@ApiField("data_sign")
	private String dataSign;

	/** 
	 * 贷款方案，包含可贷额度、利率、期限、还款方式等贷款要素，在客户签署贷款协议时，展示这些信息给客户
	 */
	@ApiField("loan_scheme")
	private LoanScheme loanScheme;

	/** 
	 * 还款账户
	 */
	@ApiField("repay_account")
	private MyBkAccountVO repayAccount;

	/** 
	 * 收款账号信息
	 */
	@ApiField("trans_in_account")
	private MyBkAccountVO transInAccount;

	public void setContractList(List<Contract> contractList) {
		this.contractList = contractList;
	}
	public List<Contract> getContractList( ) {
		return this.contractList;
	}

	public void setDataSign(String dataSign) {
		this.dataSign = dataSign;
	}
	public String getDataSign( ) {
		return this.dataSign;
	}

	public void setLoanScheme(LoanScheme loanScheme) {
		this.loanScheme = loanScheme;
	}
	public LoanScheme getLoanScheme( ) {
		return this.loanScheme;
	}

	public void setRepayAccount(MyBkAccountVO repayAccount) {
		this.repayAccount = repayAccount;
	}
	public MyBkAccountVO getRepayAccount( ) {
		return this.repayAccount;
	}

	public void setTransInAccount(MyBkAccountVO transInAccount) {
		this.transInAccount = transInAccount;
	}
	public MyBkAccountVO getTransInAccount( ) {
		return this.transInAccount;
	}

}
