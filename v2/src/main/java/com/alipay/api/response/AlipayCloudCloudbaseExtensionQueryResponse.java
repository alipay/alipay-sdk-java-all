package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Extension;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.extension.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-17 19:21:46
 */
public class AlipayCloudCloudbaseExtensionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4593117398324829111L;

	/** 
	 * 扩展列表信息
	 */
	@ApiListField("extensions")
	@ApiField("extension")
	private List<Extension> extensions;

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

	public void setExtensions(List<Extension> extensions) {
		this.extensions = extensions;
	}
	public List<Extension> getExtensions( ) {
		return this.extensions;
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
