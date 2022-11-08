package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询用户权益列表
 *
 * @author auto create
 * @since 1.0, 2021-12-22 19:57:05
 */
public class AlipayCommerceOperationUserBenefitBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8852534321971538945L;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 分页范围
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 产品类型
	 */
	@ApiListField("product_type_list")
	@ApiField("string")
	private List<String> productTypeList;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getProductTypeList() {
		return this.productTypeList;
	}
	public void setProductTypeList(List<String> productTypeList) {
		this.productTypeList = productTypeList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
