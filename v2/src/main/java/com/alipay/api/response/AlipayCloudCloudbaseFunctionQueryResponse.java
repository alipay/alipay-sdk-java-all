package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FunctionMO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 22:46:42
 */
public class AlipayCloudCloudbaseFunctionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1839949436461414377L;

	/** 
	 * 云函数信息列表
	 */
	@ApiListField("functions")
	@ApiField("function_m_o")
	private List<FunctionMO> functions;

	/** 
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setFunctions(List<FunctionMO> functions) {
		this.functions = functions;
	}
	public List<FunctionMO> getFunctions( ) {
		return this.functions;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
