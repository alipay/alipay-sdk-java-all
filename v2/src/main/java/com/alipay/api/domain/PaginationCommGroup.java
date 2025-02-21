package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 客制化组分页模型
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:13:50
 */
public class PaginationCommGroup extends AlipayObject {

	private static final long serialVersionUID = 3576968732477646662L;

	/**
	 * 出参列表
	 */
	@ApiListField("list")
	@ApiField("kbdish_comm_group_info")
	private List<KbdishCommGroupInfo> list;

	/**
	 * 页码，表示当前页数
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 每页条数
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

	public List<KbdishCommGroupInfo> getList() {
		return this.list;
	}
	public void setList(List<KbdishCommGroupInfo> list) {
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
