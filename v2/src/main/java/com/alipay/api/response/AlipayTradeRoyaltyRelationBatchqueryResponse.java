package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RoyaltyEntity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.royalty.relation.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-25 10:22:25
 */
public class AlipayTradeRoyaltyRelationBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6193399347557456376L;

	/** 
	 * 当前页数
	 */
	@ApiField("current_page_num")
	private Long currentPageNum;

	/** 
	 * 当前页面大小
	 */
	@ApiField("current_page_size")
	private Long currentPageSize;

	/** 
	 * 分账收款方列表
	 */
	@ApiListField("receiver_list")
	@ApiField("royalty_entity")
	private List<RoyaltyEntity> receiverList;

	/** 
	 * 业务结果码。SUCCESS：分账关系查询成功；FAIL：分账关系查询失败。
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 总页数
	 */
	@ApiField("total_page_num")
	private Long totalPageNum;

	/** 
	 * 分账关系记录总数
	 */
	@ApiField("total_record_num")
	private Long totalRecordNum;

	public void setCurrentPageNum(Long currentPageNum) {
		this.currentPageNum = currentPageNum;
	}
	public Long getCurrentPageNum( ) {
		return this.currentPageNum;
	}

	public void setCurrentPageSize(Long currentPageSize) {
		this.currentPageSize = currentPageSize;
	}
	public Long getCurrentPageSize( ) {
		return this.currentPageSize;
	}

	public void setReceiverList(List<RoyaltyEntity> receiverList) {
		this.receiverList = receiverList;
	}
	public List<RoyaltyEntity> getReceiverList( ) {
		return this.receiverList;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setTotalPageNum(Long totalPageNum) {
		this.totalPageNum = totalPageNum;
	}
	public Long getTotalPageNum( ) {
		return this.totalPageNum;
	}

	public void setTotalRecordNum(Long totalRecordNum) {
		this.totalRecordNum = totalRecordNum;
	}
	public Long getTotalRecordNum( ) {
		return this.totalRecordNum;
	}

}
