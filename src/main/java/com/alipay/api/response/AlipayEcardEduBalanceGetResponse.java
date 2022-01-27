package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EduOneCardBalanceQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecard.edu.balance.get response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:20
 */
public class AlipayEcardEduBalanceGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5494522726337318665L;

	/** 
	 * 校园一卡通余额查询结果对象
	 */
	@ApiListField("balance")
	@ApiField("edu_one_card_balance_query_result")
	private List<EduOneCardBalanceQueryResult> balance;

	public void setBalance(List<EduOneCardBalanceQueryResult> balance) {
		this.balance = balance;
	}
	public List<EduOneCardBalanceQueryResult> getBalance( ) {
		return this.balance;
	}

}
