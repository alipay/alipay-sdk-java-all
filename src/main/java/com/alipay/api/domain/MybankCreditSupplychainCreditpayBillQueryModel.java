package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链-1688和赊呗融合-账单查询接口
 *
 * @author auto create
 * @since 1.0, 2020-03-04 11:20:21
 */
public class MybankCreditSupplychainCreditpayBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4645498995383144241L;

	/**
	 * 网商账单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * ISV买家信息
	 */
	@ApiField("buyer")
	private Member buyer;

	/**
	 * 平台类型
	 */
	@ApiField("channel_tag")
	private String channelTag;

	/**
	 * Trace信息
	 */
	@ApiField("trace_id")
	private String traceId;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public Member getBuyer() {
		return this.buyer;
	}
	public void setBuyer(Member buyer) {
		this.buyer = buyer;
	}

	public String getChannelTag() {
		return this.channelTag;
	}
	public void setChannelTag(String channelTag) {
		this.channelTag = channelTag;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
