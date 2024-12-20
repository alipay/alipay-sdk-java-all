package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 顶部运营位批量查询
 *
 * @author auto create
 * @since 1.0, 2024-12-11 10:47:19
 */
public class AlipayMerchantGroupActivityBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5761727855728573984L;

	/**
	 * 商家群活动类型列表，目前支持custom (自定义活动)、coupon(优惠群活动)
	 */
	@ApiListField("biz_type_list")
	@ApiField("string")
	private List<String> bizTypeList;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页查询条数，最大50条
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 商家群活动内容状态
	 */
	@ApiField("status")
	private String status;

	public List<String> getBizTypeList() {
		return this.bizTypeList;
	}
	public void setBizTypeList(List<String> bizTypeList) {
		this.bizTypeList = bizTypeList;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
