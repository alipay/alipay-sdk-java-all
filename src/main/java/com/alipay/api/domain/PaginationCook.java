package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 菜谱分页类型
 *
 * @author auto create
 * @since 1.0, 2020-06-15 11:50:32
 */
public class PaginationCook extends AlipayObject {

	private static final long serialVersionUID = 5221253249154976461L;

	/**
	 * 出参列表
	 */
	@ApiListField("list")
	@ApiField("kbdish_cook_info")
	private List<KbdishCookInfo> list;

	/**
	 * 表示当前页数
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 表示每页条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 总条数
	 */
	@ApiField("total_count")
	private String totalCount;

	/**
	 * 总页数
	 */
	@ApiField("total_page")
	private String totalPage;

	public List<KbdishCookInfo> getList() {
		return this.list;
	}
	public void setList(List<KbdishCookInfo> list) {
		this.list = list;
	}

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getTotalPage() {
		return this.totalPage;
	}
	public void setTotalPage(String totalPage) {
		this.totalPage = totalPage;
	}

}
