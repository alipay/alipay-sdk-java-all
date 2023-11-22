package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PassInstanceDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.pass.instance.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:52:45
 */
public class AlipayMarketingPassInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4253528435669197719L;

	/** 
	 * 卡券实例列表
	 */
	@ApiListField("instance_list")
	@ApiField("pass_instance_detail")
	private List<PassInstanceDetail> instanceList;

	/** 
	 * 当前查询的页码，页码从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 当前查询的每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 卡券实例总数
	 */
	@ApiField("total")
	private Long total;

	/** 
	 * 按page_size分页的总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	public void setInstanceList(List<PassInstanceDetail> instanceList) {
		this.instanceList = instanceList;
	}
	public List<PassInstanceDetail> getInstanceList( ) {
		return this.instanceList;
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

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

}
