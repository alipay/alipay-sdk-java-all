package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cstraining.userdatapage.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-29 19:57:40
 */
public class AlipayIserviceCstrainingUserdatapageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6837255177558144187L;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 每页数据的条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * null
	 */
	@ApiListField("result_list")
	@ApiField("string")
	private List<String> resultList;

	/** 
	 * 数据总条数
	 */
	@ApiField("total_size")
	private String totalSize;

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
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
