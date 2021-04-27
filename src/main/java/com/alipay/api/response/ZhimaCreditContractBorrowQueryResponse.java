package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.contract.borrow.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-19 16:06:45
 */
public class ZhimaCreditContractBorrowQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6287338774548643811L;

	/** 
	 * 借还合约状态，INITED:初始化但未签约,SIGNED:已签约
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 借的物品列表，包括每个物品的唯一id，物品类型，物品名称。目前type仅支持book：图书
	 */
	@ApiField("subjects_borrowed")
	private String subjectsBorrowed;

	/** 
	 * 归还的物品列表，包括每本书的唯一id，物品类型，物品名称
	 */
	@ApiField("subjects_returned")
	private String subjectsReturned;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSubjectsBorrowed(String subjectsBorrowed) {
		this.subjectsBorrowed = subjectsBorrowed;
	}
	public String getSubjectsBorrowed( ) {
		return this.subjectsBorrowed;
	}

	public void setSubjectsReturned(String subjectsReturned) {
		this.subjectsReturned = subjectsReturned;
	}
	public String getSubjectsReturned( ) {
		return this.subjectsReturned;
	}

}
