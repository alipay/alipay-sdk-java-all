package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.commodity.order.buy response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringCommodityOrderBuyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7174898395923873842L;

	/** 
	 * 扩展字段，供以后拓展使用
	 */
	@ApiListField("ext_info")
	@ApiField("string")
	private List<String> extInfo;

	/** 
	 * order_result为success时返回；order_result为fail的时候不返回
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * success表示订购成功；fail表示订购失败
	 */
	@ApiField("order_result")
	private String orderResult;

	/** 
	 * 描述订购结果信息
	 */
	@ApiField("order_result_msg")
	private String orderResultMsg;

	public void setExtInfo(List<String> extInfo) {
		this.extInfo = extInfo;
	}
	public List<String> getExtInfo( ) {
		return this.extInfo;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderResult(String orderResult) {
		this.orderResult = orderResult;
	}
	public String getOrderResult( ) {
		return this.orderResult;
	}

	public void setOrderResultMsg(String orderResultMsg) {
		this.orderResultMsg = orderResultMsg;
	}
	public String getOrderResultMsg( ) {
		return this.orderResultMsg;
	}

}
