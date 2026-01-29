package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.WalletExternalAccount;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.externalaccount.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-22 15:10:43
 */
public class AlipayFundWalletExternalaccountConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7611517299159912481L;

	/** 
	 * 当前页
	 */
	@ApiField("current_page")
	private String currentPage;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总条数
	 */
	@ApiField("total_items")
	private String totalItems;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private String totalPages;

	/** 
	 * 外部账户
	 */
	@ApiField("wallet_external_accounts")
	private WalletExternalAccount walletExternalAccounts;

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}
	public String getCurrentPage( ) {
		return this.currentPage;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
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

	public void setWalletExternalAccounts(WalletExternalAccount walletExternalAccounts) {
		this.walletExternalAccounts = walletExternalAccounts;
	}
	public WalletExternalAccount getWalletExternalAccounts( ) {
		return this.walletExternalAccounts;
	}

}
