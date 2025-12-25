package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Instance;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.instance.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 16:46:26
 */
public class AlipayIserviceCcmInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5781167389423168673L;

	/** 
	 * 租户实例列表
	 */
	@ApiListField("instances")
	@ApiField("instance")
	private List<Instance> instances;

	/** 
	 * 查询结果的页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页查询时设置的每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总条目数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}
	public List<Instance> getInstances( ) {
		return this.instances;
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

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
