package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CardAmountDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.account.fundcomposition.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-23 20:16:40
 */
public class AlipayTradeAccountFundcompositionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6848827782738875635L;

	/** 
	 * 专户账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/** 
	 * 银行专户的转入资金明细
	 */
	@ApiListField("card_amount_detail_list")
	@ApiField("card_amount_detail_v_o")
	private List<CardAmountDetailVO> cardAmountDetailList;

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

	public void setCardAmountDetailList(List<CardAmountDetailVO> cardAmountDetailList) {
		this.cardAmountDetailList = cardAmountDetailList;
	}
	public List<CardAmountDetailVO> getCardAmountDetailList( ) {
		return this.cardAmountDetailList;
	}

}
