package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 阿里集团专用产品开通申请
 *
 * @author auto create
 * @since 1.0, 2023-10-13 17:15:18
 */
public class AlipayOpenAligroupProductopenApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5518689181453941869L;

	/**
	 * 申请资质信息
	 */
	@ApiField("business_properties")
	private ApplyBusinessPropertyDTO businessProperties;

	/**
	 * 来源渠道标识
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 业务透传给CTU的属性，接入CTU事件时需要用到，以kv格式透传
	 */
	@ApiField("ctu_event_property")
	private String ctuEventProperty;

	/**
	 * 订单明细行
	 */
	@ApiListField("order_lines")
	@ApiField("apply_order_line_d_t_o")
	private List<ApplyOrderLineDTO> orderLines;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户PID
	 */
	@ApiField("partner_id")
	private String partnerId;

	public ApplyBusinessPropertyDTO getBusinessProperties() {
		return this.businessProperties;
	}
	public void setBusinessProperties(ApplyBusinessPropertyDTO businessProperties) {
		this.businessProperties = businessProperties;
	}

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getCtuEventProperty() {
		return this.ctuEventProperty;
	}
	public void setCtuEventProperty(String ctuEventProperty) {
		this.ctuEventProperty = ctuEventProperty;
	}

	public List<ApplyOrderLineDTO> getOrderLines() {
		return this.orderLines;
	}
	public void setOrderLines(List<ApplyOrderLineDTO> orderLines) {
		this.orderLines = orderLines;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
