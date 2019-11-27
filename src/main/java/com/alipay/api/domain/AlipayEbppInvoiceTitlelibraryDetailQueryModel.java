package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 抬头库详情查询
 *
 * @author auto create
 * @since 1.0, 2019-11-13 21:08:40
 */
public class AlipayEbppInvoiceTitlelibraryDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4389985348137749253L;

	/**
	 * 企业名称
	 */
	@ApiField("title_name")
	private String titleName;

	public String getTitleName() {
		return this.titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

}
