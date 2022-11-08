package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EtcMediaContent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.resouce.get response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-17 18:31:37
 */
public class AlipayCommerceTransportEtcResouceGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5685387321251937717L;

	/** 
	 * SUCCESS：成功；{FAIL}:{失败原因}
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 其他业务异常信息描述
	 */
	@ApiField("biz_msg")
	private String bizMsg;

	/** 
	 * 申请单资料列表
	 */
	@ApiListField("content_list")
	@ApiField("etc_media_content")
	private List<EtcMediaContent> contentList;

	/** 
	 * 支付宝侧订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setBizMsg(String bizMsg) {
		this.bizMsg = bizMsg;
	}
	public String getBizMsg( ) {
		return this.bizMsg;
	}

	public void setContentList(List<EtcMediaContent> contentList) {
		this.contentList = contentList;
	}
	public List<EtcMediaContent> getContentList( ) {
		return this.contentList;
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

}
