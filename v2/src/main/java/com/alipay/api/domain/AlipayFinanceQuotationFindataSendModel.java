package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金融数据接入
 *
 * @author auto create
 * @since 1.0, 2021-11-02 12:25:19
 */
public class AlipayFinanceQuotationFindataSendModel extends AlipayObject {

	private static final long serialVersionUID = 4342587516365573772L;

	/**
	 * 业务类型。strategy_pool策略池,strategy_pool_detail策略池明细
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 机构发送给蚂蚁的业务数据。仅支持JSON
	 */
	@ApiField("content")
	private String content;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
