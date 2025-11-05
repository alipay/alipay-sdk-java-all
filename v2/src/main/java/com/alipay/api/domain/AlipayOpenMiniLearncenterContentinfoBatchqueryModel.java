package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学习中心内容信息批量查询
 *
 * @author auto create
 * @since 1.0, 2024-12-06 13:46:20
 */
public class AlipayOpenMiniLearncenterContentinfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5128125656589858851L;

	/**
	 * 内容分类，最大长度32个字符。不传入默认查询学习课堂内容。
默认值：course。
	 */
	@ApiField("category")
	private String category;

	/**
	 * 分页查询页码，不传默认查询第一页数据。
默认值：1
	 */
	@ApiField("page_num")
	private Long pageNum;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

}
