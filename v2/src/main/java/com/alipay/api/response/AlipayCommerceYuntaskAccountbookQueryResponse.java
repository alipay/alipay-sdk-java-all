package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FundAccountBookInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.accountbook.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:51:49
 */
public class AlipayCommerceYuntaskAccountbookQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6416758873821433725L;

	/** 
	 * 记账本id
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/** 
	 * 账本信息
	 */
	@ApiListField("account_book_info")
	@ApiField("fund_account_book_info")
	private List<FundAccountBookInfo> accountBookInfo;

	/** 
	 * 可用余额
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 记账本的外卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/** 
	 * 页码
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 页面大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}
	public String getAccountBookId( ) {
		return this.accountBookId;
	}

	public void setAccountBookInfo(List<FundAccountBookInfo> accountBookInfo) {
		this.accountBookInfo = accountBookInfo;
	}
	public List<FundAccountBookInfo> getAccountBookInfo( ) {
		return this.accountBookInfo;
	}

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getAvailableAmount( ) {
		return this.availableAmount;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardNo( ) {
		return this.cardNo;
	}

	public void setPage(Long page) {
		this.page = page;
	}
	public Long getPage( ) {
		return this.page;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
