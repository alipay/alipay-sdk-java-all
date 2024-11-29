package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Argument;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.argument.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:29
 */
public class AlipayCloudCloudbaseFunctionArgumentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7736641591721854784L;

	/** 
	 * 参数配置列表
	 */
	@ApiListField("arguments")
	@ApiField("argument")
	private List<Argument> arguments;

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
	private String total;

	public void setArguments(List<Argument> arguments) {
		this.arguments = arguments;
	}
	public List<Argument> getArguments( ) {
		return this.arguments;
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

	public void setTotal(String total) {
		this.total = total;
	}
	public String getTotal( ) {
		return this.total;
	}

}
