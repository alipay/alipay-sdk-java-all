package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ImageVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.image.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-24 13:34:55
 */
public class AlipayMarketingImageListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3585798995295458742L;

	/** 
	 * 图片列表。
	 */
	@ApiListField("data")
	@ApiField("image_v_o")
	private List<ImageVO> data;

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
	 * 总数量，单位为图片个数。
	 */
	@ApiField("total")
	private Long total;

	/** 
	 * 总页数，单位为页。
	 */
	@ApiField("total_page")
	private Long totalPage;

	public void setData(List<ImageVO> data) {
		this.data = data;
	}
	public List<ImageVO> getData( ) {
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
