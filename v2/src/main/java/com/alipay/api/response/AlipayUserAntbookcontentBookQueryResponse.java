package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BookInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antbookcontent.book.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-28 13:36:07
 */
public class AlipayUserAntbookcontentBookQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4631541655395282956L;

	/** 
	 * 书籍信息列表
	 */
	@ApiListField("book_info_list")
	@ApiField("book_info")
	private List<BookInfo> bookInfoList;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 书籍总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setBookInfoList(List<BookInfo> bookInfoList) {
		this.bookInfoList = bookInfoList;
	}
	public List<BookInfo> getBookInfoList( ) {
		return this.bookInfoList;
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
