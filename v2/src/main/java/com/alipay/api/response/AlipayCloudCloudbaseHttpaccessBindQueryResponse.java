package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FaasDomainBinds;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.bind.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-17 21:05:01
 */
public class AlipayCloudCloudbaseHttpaccessBindQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5431975943853487865L;

	/** 
	 * 路由绑定列表
	 */
	@ApiListField("domain_binds")
	@ApiField("faas_domain_binds")
	private List<FaasDomainBinds> domainBinds;

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

	public void setDomainBinds(List<FaasDomainBinds> domainBinds) {
		this.domainBinds = domainBinds;
	}
	public List<FaasDomainBinds> getDomainBinds( ) {
		return this.domainBinds;
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
