package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询模型列表接口
 *
 * @author auto create
 * @since 1.0, 2017-04-27 14:36:19
 */
public class AlipayMarketingDataModelBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4243759529396361191L;

	/**
	 * 当前页面。输入参数值为模型页数，一页最多30条；用于查询模型清单
	 */
	@ApiField("page")
	private String page;

	/**
	 * 每页最大条数。输入参数值为模型页面展现条数，最多展现30条；用于查询模型清单条数
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
