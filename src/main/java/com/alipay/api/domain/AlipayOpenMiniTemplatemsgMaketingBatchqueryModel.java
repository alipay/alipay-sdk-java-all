package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序模板消息营销投放详情分页批量查询
 *
 * @author auto create
 * @since 1.0, 2022-09-26 14:53:09
 */
public class AlipayOpenMiniTemplatemsgMaketingBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6243847485348976869L;

	/**
	 * 分页查询页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页展示条数，最大支持50个
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
