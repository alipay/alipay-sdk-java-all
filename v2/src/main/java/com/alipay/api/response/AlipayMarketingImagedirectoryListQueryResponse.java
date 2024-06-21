package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ImageDirectoryVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.imagedirectory.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-13 10:56:59
 */
public class AlipayMarketingImagedirectoryListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1491263798869367738L;

	/** 
	 * 分页查询结果列表。
	 */
	@ApiListField("data")
	@ApiField("image_directory_v_o")
	private List<ImageDirectoryVO> data;

	/** 
	 * 当前页码。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 单页条数。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数量。
	 */
	@ApiField("total")
	private Long total;

	/** 
	 * 总页数。
	 */
	@ApiField("total_page")
	private Long totalPage;

	public void setData(List<ImageDirectoryVO> data) {
		this.data = data;
	}
	public List<ImageDirectoryVO> getData( ) {
		return this.data;
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
