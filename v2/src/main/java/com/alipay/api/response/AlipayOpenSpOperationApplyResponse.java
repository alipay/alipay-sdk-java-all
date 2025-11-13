package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecommendAccountDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.operation.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-17 15:55:01
 */
public class AlipayOpenSpOperationApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1432796384714486548L;

	/** 
	 * 支付宝操作批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 商家已经绑定的支付宝账号信息
	 */
	@ApiField("bind_account")
	private RecommendAccountDTO bindAccount;

	/** 
	 * 只针对服务商代间连商家发起代运营绑定、授权时，如果传递的alipay_account不符合绑定或授权要求，这个字段会返回推荐的商家支付宝账号列表，包括：支付宝账号和名称，为保护商家信息，账号和名称都按照规范脱敏。
	 */
	@ApiListField("recommend_accounts")
	@ApiField("recommend_account_d_t_o")
	private List<RecommendAccountDTO> recommendAccounts;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

	public void setBindAccount(RecommendAccountDTO bindAccount) {
		this.bindAccount = bindAccount;
	}
	public RecommendAccountDTO getBindAccount( ) {
		return this.bindAccount;
	}

	public void setRecommendAccounts(List<RecommendAccountDTO> recommendAccounts) {
		this.recommendAccounts = recommendAccounts;
	}
	public List<RecommendAccountDTO> getRecommendAccounts( ) {
		return this.recommendAccounts;
	}

}
