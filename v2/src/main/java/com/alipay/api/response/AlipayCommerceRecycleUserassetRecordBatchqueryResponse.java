package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecycleUserAssetRecordDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.userasset.record.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-22 16:27:35
 */
public class AlipayCommerceRecycleUserassetRecordBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3721123437265389768L;

	/** 
	 * 页数
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 流水总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 资产余额，单位：分
	 */
	@ApiField("user_asset_amount")
	private Long userAssetAmount;

	/** 
	 * 资产流水集合
	 */
	@ApiListField("user_asset_record_list")
	@ApiField("recycle_user_asset_record_d_t_o")
	private List<RecycleUserAssetRecordDTO> userAssetRecordList;

	/** 
	 * 用户可提现金额，单位：分
	 */
	@ApiField("user_withdraw_amount")
	private Long userWithdrawAmount;

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

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setUserAssetAmount(Long userAssetAmount) {
		this.userAssetAmount = userAssetAmount;
	}
	public Long getUserAssetAmount( ) {
		return this.userAssetAmount;
	}

	public void setUserAssetRecordList(List<RecycleUserAssetRecordDTO> userAssetRecordList) {
		this.userAssetRecordList = userAssetRecordList;
	}
	public List<RecycleUserAssetRecordDTO> getUserAssetRecordList( ) {
		return this.userAssetRecordList;
	}

	public void setUserWithdrawAmount(Long userWithdrawAmount) {
		this.userWithdrawAmount = userWithdrawAmount;
	}
	public Long getUserWithdrawAmount( ) {
		return this.userWithdrawAmount;
	}

}
