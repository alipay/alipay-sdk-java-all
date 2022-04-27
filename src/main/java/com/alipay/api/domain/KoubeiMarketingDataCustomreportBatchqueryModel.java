package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义数据报表列表分页查询接口
 *
 * @author auto create
 * @since 1.0, 2020-08-31 10:33:50
 */
public class KoubeiMarketingDataCustomreportBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6266429137347875456L;

	/**
	 * 当前页号，默认为1
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 每页条目数，默认为20,最大为30
	 */
	@ApiField("page_size")
	private String pageSize;

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

}
