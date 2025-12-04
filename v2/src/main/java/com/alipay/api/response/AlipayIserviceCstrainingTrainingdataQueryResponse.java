package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cstraining.trainingdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-19 21:37:35
 */
public class AlipayIserviceCstrainingTrainingdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5562184141892449513L;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页的数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 数据结果
	 */
	@ApiListField("result_list")
	@ApiField("string")
	private List<String> resultList;

	/** 
	 * 总共数量
	 */
	@ApiField("total_size")
	private String totalSize;

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

	public void setResultList(List<String> resultList) {
		this.resultList = resultList;
	}
	public List<String> getResultList( ) {
		return this.resultList;
	}

	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}
	public String getTotalSize( ) {
		return this.totalSize;
	}

}
