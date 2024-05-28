package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CallDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.anthotlinemng.calldetail.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-11 16:11:55
 */
public class AlipayIserviceAnthotlinemngCalldetailBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3578889562418746352L;

	/** 
	 * 当前分页页码
	 */
	@ApiField("current")
	private Long current;

	/** 
	 * 通话详情列表数据
	 */
	@ApiListField("list")
	@ApiField("call_detail")
	private List<CallDetail> list;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数，只有PageNum为1才会返回真实数值，其他都是0。
	 */
	@ApiField("total")
	private Long total;

	/** 
	 * 总页数，只有PageNum为1才会返回真实数值，其他都是0。
	 */
	@ApiField("total_page")
	private Long totalPage;

	public void setCurrent(Long current) {
		this.current = current;
	}
	public Long getCurrent( ) {
		return this.current;
	}

	public void setList(List<CallDetail> list) {
		this.list = list;
	}
	public List<CallDetail> getList( ) {
		return this.list;
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
