package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MemberCardUserTransactionDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.membercard.transaction.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 17:06:44
 */
public class AntMerchantExpandMembercardTransactionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4596898459636488958L;

	/** 
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 商家会员交易明细列表
	 */
	@ApiListField("transaction_detail_list")
	@ApiField("member_card_user_transaction_detail")
	private List<MemberCardUserTransactionDetail> transactionDetailList;

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setTransactionDetailList(List<MemberCardUserTransactionDetail> transactionDetailList) {
		this.transactionDetailList = transactionDetailList;
	}
	public List<MemberCardUserTransactionDetail> getTransactionDetailList( ) {
		return this.transactionDetailList;
	}

}
