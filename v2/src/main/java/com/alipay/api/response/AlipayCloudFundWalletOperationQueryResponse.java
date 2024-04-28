package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.WalletOperationDetails;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.fund.wallet.operation.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-15 11:37:00
 */
public class AlipayCloudFundWalletOperationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4342891138124948477L;

	/** 
	 * 当前页
	 */
	@ApiField("current_page")
	private String currentPage;

	/** 
	 * 总条数
	 */
	@ApiField("total_items")
	private String totalItems;

	/** 
	 * 总页
	 */
	@ApiField("total_pages")
	private String totalPages;

	/** 
	 * 钱包操作明细
	 */
	@ApiField("wallet_operations")
	private WalletOperationDetails walletOperations;

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}
	public String getCurrentPage( ) {
		return this.currentPage;
	}

	public void setTotalItems(String totalItems) {
		this.totalItems = totalItems;
	}
	public String getTotalItems( ) {
		return this.totalItems;
	}

	public void setTotalPages(String totalPages) {
		this.totalPages = totalPages;
	}
	public String getTotalPages( ) {
		return this.totalPages;
	}

	public void setWalletOperations(WalletOperationDetails walletOperations) {
		this.walletOperations = walletOperations;
	}
	public WalletOperationDetails getWalletOperations( ) {
		return this.walletOperations;
	}

}
