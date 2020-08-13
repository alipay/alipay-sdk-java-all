package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 抬头库详情查询
 *
 * @author auto create
 * @since 1.0, 2020-05-20 15:47:12
 */
public class AlipayEbppInvoiceTitlelibraryDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4867558861757136381L;

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
