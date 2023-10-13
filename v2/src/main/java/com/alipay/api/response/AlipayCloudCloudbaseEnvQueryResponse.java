package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Env;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 22:46:41
 */
public class AlipayCloudCloudbaseEnvQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6119395871155985724L;

	/** 
	 * 环境信息列表
	 */
	@ApiListField("envs")
	@ApiField("env")
	private List<Env> envs;

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

	public void setEnvs(List<Env> envs) {
		this.envs = envs;
	}
	public List<Env> getEnvs( ) {
		return this.envs;
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
