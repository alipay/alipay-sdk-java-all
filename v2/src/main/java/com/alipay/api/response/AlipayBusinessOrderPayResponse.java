package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PaytoolResultDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.order.pay response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 20:45:20
 */
public class AlipayBusinessOrderPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 8712285765288577951L;

	/** 
	 * 商户外部订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/** 
	 * 支付宝订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 订单状态
订单待支付:WAIT_PAY（订单成功创建后）,订单完成：ORDER_SUCCESS（订单支付完成后）,订单关闭：ORDER_CLOSED（订单超时后、商户主动撤销后、退款完成后）
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 本次支付工具结果列表。注：该接口场景下payer_info无ext_profile_list信息
	 */
	@ApiListField("paytool_list")
	@ApiField("paytool_result_detail")
	private List<PaytoolResultDetail> paytoolList;

	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}
	public String getMerchantOrderNo( ) {
		return this.merchantOrderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setPaytoolList(List<PaytoolResultDetail> paytoolList) {
		this.paytoolList = paytoolList;
	}
	public List<PaytoolResultDetail> getPaytoolList( ) {
		return this.paytoolList;
	}

}
