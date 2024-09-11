package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WalletOperation;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.operation.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-31 10:21:27
 */
public class AlipayFundWalletOperationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2692315842944446851L;

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
	 * ["walletOperation":"11"]
	 */
	@ApiListField("wallet_operations")
	@ApiField("wallet_operation")
	private List<WalletOperation> walletOperations;

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

	public void setWalletOperations(List<WalletOperation> walletOperations) {
		this.walletOperations = walletOperations;
	}
	public List<WalletOperation> getWalletOperations( ) {
		return this.walletOperations;
	}

}
