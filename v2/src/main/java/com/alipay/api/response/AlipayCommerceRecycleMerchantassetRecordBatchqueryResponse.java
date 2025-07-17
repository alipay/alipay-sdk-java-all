package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecycleMerchantAssetRecordDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.merchantasset.record.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-03 16:22:33
 */
public class AlipayCommerceRecycleMerchantassetRecordBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1379118772327582341L;

	/** 
	 * 资金账号
	 */
	@ApiField("fund_account")
	private String fundAccount;

	/** 
	 * 资产余额，单位：分
	 */
	@ApiField("merchant_asset_amount")
	private Long merchantAssetAmount;

	/** 
	 * 商户资产流水集合
	 */
	@ApiListField("merchant_asset_record_list")
	@ApiField("recycle_merchant_asset_record_d_t_o")
	private List<RecycleMerchantAssetRecordDTO> merchantAssetRecordList;

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
	 * sellerid集合
	 */
	@ApiListField("seller_id_list")
	@ApiField("string")
	private List<String> sellerIdList;

	/** 
	 * 商户补贴比例
	 */
	@ApiField("subsidy_ratio")
	private String subsidyRatio;

	/** 
	 * 流水总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setFundAccount(String fundAccount) {
		this.fundAccount = fundAccount;
	}
	public String getFundAccount( ) {
		return this.fundAccount;
	}

	public void setMerchantAssetAmount(Long merchantAssetAmount) {
		this.merchantAssetAmount = merchantAssetAmount;
	}
	public Long getMerchantAssetAmount( ) {
		return this.merchantAssetAmount;
	}

	public void setMerchantAssetRecordList(List<RecycleMerchantAssetRecordDTO> merchantAssetRecordList) {
		this.merchantAssetRecordList = merchantAssetRecordList;
	}
	public List<RecycleMerchantAssetRecordDTO> getMerchantAssetRecordList( ) {
		return this.merchantAssetRecordList;
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

	public void setSellerIdList(List<String> sellerIdList) {
		this.sellerIdList = sellerIdList;
	}
	public List<String> getSellerIdList( ) {
		return this.sellerIdList;
	}

	public void setSubsidyRatio(String subsidyRatio) {
		this.subsidyRatio = subsidyRatio;
	}
	public String getSubsidyRatio( ) {
		return this.subsidyRatio;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
