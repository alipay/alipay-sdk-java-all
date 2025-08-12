package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 消费贷还款借据信息
 *
 * @author auto create
 * @since 1.0, 2024-08-06 11:22:35
 */
public class ConsumerLoanLoanInfo extends AlipayObject {

	private static final long serialVersionUID = 4717635921987469277L;

	/**
	 * 剩余待还本金，单位为分，1000代表10.00元
	 */
	@ApiField("last_principal_amount")
	private Long lastPrincipalAmount;

	/**
	 * 剩余待还本金，单位为分，1000代表10.00元
	 */
	@ApiField("last_total_principal_amount")
	private Long lastTotalPrincipalAmount;

	/**
	 * 借据信息列表
	 */
	@ApiListField("loan_info")
	@ApiField("consumer_loan_loan_info_item")
	private List<ConsumerLoanLoanInfoItem> loanInfo;

	/**
	 * 总贷款笔数，单位：笔
	 */
	@ApiField("total_loan_count")
	private Long totalLoanCount;

	public Long getLastPrincipalAmount() {
		return this.lastPrincipalAmount;
	}
	public void setLastPrincipalAmount(Long lastPrincipalAmount) {
		this.lastPrincipalAmount = lastPrincipalAmount;
	}

	public Long getLastTotalPrincipalAmount() {
		return this.lastTotalPrincipalAmount;
	}
	public void setLastTotalPrincipalAmount(Long lastTotalPrincipalAmount) {
		this.lastTotalPrincipalAmount = lastTotalPrincipalAmount;
	}

	public List<ConsumerLoanLoanInfoItem> getLoanInfo() {
		return this.loanInfo;
	}
	public void setLoanInfo(List<ConsumerLoanLoanInfoItem> loanInfo) {
		this.loanInfo = loanInfo;
	}

	public Long getTotalLoanCount() {
		return this.totalLoanCount;
	}
	public void setTotalLoanCount(Long totalLoanCount) {
		this.totalLoanCount = totalLoanCount;
	}

}
