package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 渠道开票场景相关信息
 *
 * @author auto create
 * @since 1.0, 2026-08-03 14:07:19
 */
public class IndustryInvoiceChannelInfo extends AlipayObject {

	private static final long serialVersionUID = 6611866598978258385L;

	/**
	 * 渠道编码
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 渠道订单信息列表
	 */
	@ApiListField("channel_order_info_list")
	@ApiField("industry_invoice_channel_order_info")
	private List<IndustryInvoiceChannelOrderInfo> channelOrderInfoList;

	/**
	 * 外部渠道商户ID
	 */
	@ApiField("out_channel_merchant_id")
	private String outChannelMerchantId;

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public List<IndustryInvoiceChannelOrderInfo> getChannelOrderInfoList() {
		return this.channelOrderInfoList;
	}
	public void setChannelOrderInfoList(List<IndustryInvoiceChannelOrderInfo> channelOrderInfoList) {
		this.channelOrderInfoList = channelOrderInfoList;
	}

	public String getOutChannelMerchantId() {
		return this.outChannelMerchantId;
	}
	public void setOutChannelMerchantId(String outChannelMerchantId) {
		this.outChannelMerchantId = outChannelMerchantId;
	}

}
