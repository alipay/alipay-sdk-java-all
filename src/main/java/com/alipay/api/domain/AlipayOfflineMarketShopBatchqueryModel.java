package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 系统商通过该接口可以查询所有门店的外部门店编号（系统商的门店编号）
 *
 * @author auto create
 * @since 1.0, 2017-07-19 16:55:51
 */
public class AlipayOfflineMarketShopBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6647731542754836863L;

	/**
	 * 页码，第一页传入"1"，默认500个结果为一页。此参数必须是大于0的正整数，为0时将查询报错。
	 */
	@ApiField("page_no")
	private String pageNo;

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

}
