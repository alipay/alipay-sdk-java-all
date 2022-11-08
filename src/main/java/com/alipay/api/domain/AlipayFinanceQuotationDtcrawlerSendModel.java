package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基金爬虫数据推送接口
 *
 * @author auto create
 * @since 1.0, 2021-07-21 11:51:39
 */
public class AlipayFinanceQuotationDtcrawlerSendModel extends AlipayObject {

	private static final long serialVersionUID = 8421454234242345595L;

	/**
	 * 爬虫平台推送数据，为json字符串，bizNo 为推送流水号，taskName为任务名，业务数据包含在bizData中
	 */
	@ApiField("content")
	private String content;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
