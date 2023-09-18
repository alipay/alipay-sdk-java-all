package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FundAccountBookInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.accountbook.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:01:42
 */
public class AlipayCommerceCommonAccountbookQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8357462446611473611L;

	/** 
	 * 账本id
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/** 
	 * 账本信息
	 */
	@ApiListField("account_book_info")
	@ApiField("fund_account_book_info_d_t_o")
	private List<FundAccountBookInfoDTO> accountBookInfo;

	/** 
	 * 账户可用余额，单位元
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 外卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/** 
	 * 分页页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总数据数量
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}
	public String getAccountBookId( ) {
		return this.accountBookId;
	}

	public void setAccountBookInfo(List<FundAccountBookInfoDTO> accountBookInfo) {
		this.accountBookInfo = accountBookInfo;
	}
	public List<FundAccountBookInfoDTO> getAccountBookInfo( ) {
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

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
