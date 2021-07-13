package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 审核单分页查询数据
 *
 * @author auto create
 * @since 1.0, 2020-12-15 19:22:36
 */
public class OrderPageQueryDTO extends AlipayObject {

	private static final long serialVersionUID = 6481175469237891773L;

	/**
	 * 审核单数据信息
	 */
	@ApiListField("page_data")
	@ApiField("apply_order_data")
	private List<ApplyOrderData> pageData;

	/**
	 * 当前页码，默认第一页
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页记录数，默认10
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 记录总数
	 */
	@ApiField("total_number")
	private Long totalNumber;

	public List<ApplyOrderData> getPageData() {
		return this.pageData;
	}
	public void setPageData(List<ApplyOrderData> pageData) {
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

	public Long getTotalNumber() {
		return this.totalNumber;
	}
	public void setTotalNumber(Long totalNumber) {
		this.totalNumber = totalNumber;
	}

}
