package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WalletOperationDetails;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.fund.wallet.operation.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-15 18:02:05
 */
public class AlipayCloudFundWalletOperationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3892176131812936229L;

	/** 
	 * 当前页，单位是'页'。
	 */
	@ApiField("current_page")
	private String currentPage;

	/** 
	 * 总条数，单位是'条数'。
	 */
	@ApiField("total_items")
	private String totalItems;

	/** 
	 * 总页，单位是'页'。
	 */
	@ApiField("total_pages")
	private String totalPages;

	/** 
	 * 钱包操作明细
	 */
	@ApiListField("wallet_operations")
	@ApiField("wallet_operation_details")
	private List<WalletOperationDetails> walletOperations;

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

	public void setWalletOperations(List<WalletOperationDetails> walletOperations) {
		this.walletOperations = walletOperations;
	}
	public List<WalletOperationDetails> getWalletOperations( ) {
		return this.walletOperations;
	}

}
