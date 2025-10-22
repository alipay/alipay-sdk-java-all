package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 景区分页信息
 *
 * @author auto create
 * @since 1.0, 2021-06-10 15:24:41
 */
public class PaginationScenicInfo extends AlipayObject {

	private static final long serialVersionUID = 5631413351241765588L;

	/**
	 * 页码，表示当前页数
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 景区信息
	 */
	@ApiListField("scenic_info")
	@ApiField("scenic_info")
	private List<ScenicInfo> scenicInfo;

	/**
	 * 总数量
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<ScenicInfo> getScenicInfo() {
		return this.scenicInfo;
	}
	public void setScenicInfo(List<ScenicInfo> scenicInfo) {
		this.scenicInfo = scenicInfo;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getTotalPage() {
		return this.totalPage;
	}
	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}

}
