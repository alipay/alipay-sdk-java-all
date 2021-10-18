package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报表列表查询接口
 *
 * @author auto create
 * @since 1.0, 2018-05-03 09:40:58
 */
public class KoubeiMarketingDataAlisisReportBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5231532947675922169L;

	/**
	 * 当前页码
	 */
	@ApiField("page")
	private String page;

	/**
	 * 每页最大条数，最大为30
	 */
	@ApiField("size")
	private String size;

	public String getPage() {
		return this.page;
	}
	public void setPage(String page) {
		this.page = page;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

}
