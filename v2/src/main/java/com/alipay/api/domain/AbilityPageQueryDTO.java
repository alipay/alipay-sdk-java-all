package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 搜索运营服务的列表信息，包括 基础信息、品牌直达、服务直达
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:03:19
 */
public class AbilityPageQueryDTO extends AlipayObject {

	private static final long serialVersionUID = 4216635845548764689L;

	/**
	 * 搜索运营列表的分页数据
	 */
	@ApiListField("page_data")
	@ApiField("search_ability_order_data")
	private List<SearchAbilityOrderData> pageData;

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

	public List<SearchAbilityOrderData> getPageData() {
		return this.pageData;
	}
	public void setPageData(List<SearchAbilityOrderData> pageData) {
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
