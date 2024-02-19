package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ChargeRelationInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.zft.chargerelation.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-28 15:01:57
 */
public class AntMerchantExpandZftChargerelationBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4791138887198869589L;

	/** 
	 * 记账关系信息数据
	 */
	@ApiListField("charge_relation_infos")
	@ApiField("charge_relation_info")
	private List<ChargeRelationInfo> chargeRelationInfos;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页记录数，默认page_size=10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 总记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setChargeRelationInfos(List<ChargeRelationInfo> chargeRelationInfos) {
		this.chargeRelationInfos = chargeRelationInfos;
	}
	public List<ChargeRelationInfo> getChargeRelationInfos( ) {
		return this.chargeRelationInfos;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
