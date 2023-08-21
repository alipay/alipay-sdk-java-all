package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FaasCors;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.cors.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-17 21:06:18
 */
public class AlipayCloudCloudbaseHttpaccessCorsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3224531489697678833L;

	/** 
	 * 跨域安全域名列表
	 */
	@ApiListField("cors")
	@ApiField("faas_cors")
	private List<FaasCors> cors;

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

	public void setCors(List<FaasCors> cors) {
		this.cors = cors;
	}
	public List<FaasCors> getCors( ) {
		return this.cors;
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
