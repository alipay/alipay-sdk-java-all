package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.McaStoreLoanableDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.wf.billproductableamt.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:07
 */
public class MybankCreditSupplychainWfBillproductableamtQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6661429533759712539L;

	/** 
	 * 可贷额度列表
	 */
	@ApiListField("storeloanablelist")
	@ApiField("mca_store_loanable_detail")
	private List<McaStoreLoanableDetail> storeloanablelist;

	public void setStoreloanablelist(List<McaStoreLoanableDetail> storeloanablelist) {
		this.storeloanablelist = storeloanablelist;
	}
	public List<McaStoreLoanableDetail> getStoreloanablelist( ) {
		return this.storeloanablelist;
	}

}
