package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MemberWalletBalanceDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.memberwallet.balancedetails.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-20 15:21:42
 */
public class AntMerchantMemberwalletBalancedetailsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1573511742638926929L;

	/** 
	 * 余额变更明细
	 */
	@ApiListField("balance_detail_list")
	@ApiField("member_wallet_balance_detail_v_o")
	private List<MemberWalletBalanceDetailVO> balanceDetailList;

	/** 
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 页长
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("row_count")
	private Long rowCount;

	public void setBalanceDetailList(List<MemberWalletBalanceDetailVO> balanceDetailList) {
		this.balanceDetailList = balanceDetailList;
	}
	public List<MemberWalletBalanceDetailVO> getBalanceDetailList( ) {
		return this.balanceDetailList;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setRowCount(Long rowCount) {
		this.rowCount = rowCount;
	}
	public Long getRowCount( ) {
		return this.rowCount;
	}

}
