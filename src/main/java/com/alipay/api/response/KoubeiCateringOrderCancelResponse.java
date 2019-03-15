package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RefundDescriptionDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-25 10:50:01
 */
public class KoubeiCateringOrderCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 7499969682668658483L;

	/** 
	 * 扩展信息，json对象格式，key和value都为字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 口碑端订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 退款明细列表
	 */
	@ApiField("refund_description_list")
	private RefundDescriptionDTO refundDescriptionList;

	/** 
	 * 是否需要重试，true-需要，false-不需要
	 */
	@ApiField("retry")
	private Boolean retry;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setRefundDescriptionList(RefundDescriptionDTO refundDescriptionList) {
		this.refundDescriptionList = refundDescriptionList;
	}
	public RefundDescriptionDTO getRefundDescriptionList( ) {
		return this.refundDescriptionList;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

}
