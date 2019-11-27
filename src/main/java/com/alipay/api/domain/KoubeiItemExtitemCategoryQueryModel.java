package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品类查询接口
 *
 * @author auto create
 * @since 1.0, 2017-08-30 10:54:39
 */
public class KoubeiItemExtitemCategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8791445723729859138L;

	/**
	 * 当前页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 分页大小。最大50条，超过限制默认50
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 父品类编码. (查询顶级类目时值传0)
	 */
	@ApiField("parent_id")
	private String parentId;

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

	public String getParentId() {
		return this.parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

}
