package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AliyunBSN;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.bsn.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-16 20:21:57
 */
public class AlipayCloudCloudbaseBsnQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3687864455435644527L;

	/** 
	 * 已申请备案服务码列表
	 */
	@ApiListField("bsns")
	@ApiField("aliyun_b_s_n")
	private List<AliyunBSN> bsns;

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

	public void setBsns(List<AliyunBSN> bsns) {
		this.bsns = bsns;
	}
	public List<AliyunBSN> getBsns( ) {
		return this.bsns;
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
