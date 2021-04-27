package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基金爬虫数据推送接口
 *
 * @author auto create
 * @since 1.0, 2020-07-31 15:09:23
 */
public class AlipayFinanceQuotationDtcrawlerSendModel extends AlipayObject {

	private static final long serialVersionUID = 6728564642124515558L;

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
