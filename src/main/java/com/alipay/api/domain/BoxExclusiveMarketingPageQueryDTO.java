package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动详情信息
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:01:54
 */
public class BoxExclusiveMarketingPageQueryDTO extends AlipayObject {

	private static final long serialVersionUID = 4182911129732894556L;

	/**
	 * box活动详情
	 */
	@ApiListField("page_data")
	@ApiField("search_box_exclusive_marketing_info_request")
	private List<SearchBoxExclusiveMarketingInfoRequest> pageData;

	/**
	 * 当前页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页记录数
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 总记录数
	 */
	@ApiField("total_number")
	private String totalNumber;

	public List<SearchBoxExclusiveMarketingInfoRequest> getPageData() {
		return this.pageData;
	}
	public void setPageData(List<SearchBoxExclusiveMarketingInfoRequest> pageData) {
		this.pageData = pageData;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotalNumber() {
		return this.totalNumber;
	}
	public void setTotalNumber(String totalNumber) {
		this.totalNumber = totalNumber;
	}

}
