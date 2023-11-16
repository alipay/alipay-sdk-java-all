package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CumulateDataDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.zmgo.cumulate.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-03 16:59:24
 */
public class ZhimaMerchantZmgoCumulateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2393711481997739326L;

	/** 
	 * 总共累计金额
	 */
	@ApiField("aggr_amount")
	private String aggrAmount;

	/** 
	 * 总共累计优惠金额
	 */
	@ApiField("aggr_discount_amount")
	private String aggrDiscountAmount;

	/** 
	 * 总共累计次数
	 */
	@ApiField("aggr_times")
	private Long aggrTimes;

	/** 
	 * 芝麻go协议号，唯一标识一个芝麻go协议。
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 详情数据列表
	 */
	@ApiListField("detail_list")
	@ApiField("cumulate_data_detail")
	private List<CumulateDataDetail> detailList;

	/** 
	 * 查询失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 分页参数，返回传入的值。
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 分页参数，返回传入的值。
	 */
	@ApiField("page_size")
	private Long pageSize;

	public void setAggrAmount(String aggrAmount) {
		this.aggrAmount = aggrAmount;
	}
	public String getAggrAmount( ) {
		return this.aggrAmount;
	}

	public void setAggrDiscountAmount(String aggrDiscountAmount) {
		this.aggrDiscountAmount = aggrDiscountAmount;
	}
	public String getAggrDiscountAmount( ) {
		return this.aggrDiscountAmount;
	}

	public void setAggrTimes(Long aggrTimes) {
		this.aggrTimes = aggrTimes;
	}
	public Long getAggrTimes( ) {
		return this.aggrTimes;
	}

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setDetailList(List<CumulateDataDetail> detailList) {
		this.detailList = detailList;
	}
	public List<CumulateDataDetail> getDetailList( ) {
		return this.detailList;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
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

}
