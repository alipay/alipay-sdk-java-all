package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceConsultQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.serviceconsult.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:31
 */
public class AlipayMerchantServiceconsultBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3761657851835866992L;

	/** 
	 * 服务咨询工单列表信息
	 */
	@ApiListField("consult_infos")
	@ApiField("service_consult_query_response")
	private List<ServiceConsultQueryResponse> consultInfos;

	/** 
	 * 当前页码数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总条数
	 */
	@ApiField("total_num")
	private Long totalNum;

	/** 
	 * 总页码数
	 */
	@ApiField("total_page_num")
	private Long totalPageNum;

	public void setConsultInfos(List<ServiceConsultQueryResponse> consultInfos) {
		this.consultInfos = consultInfos;
	}
	public List<ServiceConsultQueryResponse> getConsultInfos( ) {
		return this.consultInfos;
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

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

	public void setTotalPageNum(Long totalPageNum) {
		this.totalPageNum = totalPageNum;
	}
	public Long getTotalPageNum( ) {
		return this.totalPageNum;
	}

}
