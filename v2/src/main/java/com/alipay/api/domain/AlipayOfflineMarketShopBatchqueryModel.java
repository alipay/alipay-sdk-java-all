package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 系统商通过该接口可以查询所有门店的外部门店编号（系统商的门店编号）
 *
 * @author auto create
 * @since 1.0, 2022-01-07 11:43:10
 */
public class AlipayOfflineMarketShopBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7534598832155115845L;

	/**
	 * 表示接口查询门店的业务渠道限制：ALL、 POS、不传。不传代表只查询普通门店，传入POS代表只查询简易门店，传入ALL代表查询普通门店和简易门店。
	 */
	@ApiField("biz_channel")
	private String bizChannel;

	/**
	 * 页码，第一页传入"1"，默认500个结果为一页。此参数必须是大于0的正整数，为0时将查询报错。
	 */
	@ApiField("page_no")
	private String pageNo;

	public String getBizChannel() {
		return this.bizChannel;
	}
	public void setBizChannel(String bizChannel) {
		this.bizChannel = bizChannel;
	}

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

}
