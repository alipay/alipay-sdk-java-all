package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserDetailInfo;
import com.alipay.api.domain.PaytoolResultDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-17 17:38:59
 */
public class AlipayBusinessOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7399311894118425745L;

	/** 
	 * 买家用户详细信息。该返回中ext_profile_list为空。注：创建订单时的买家，请与付款方区分。
	 */
	@ApiField("buyer_info")
	private UserDetailInfo buyerInfo;

	/** 
	 * 商户外部订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/** 
	 * 订单总金额，单位为元，精确到小数点后两位
	 */
	@ApiField("order_amount")
	private String orderAmount;

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

	public void setBuyerInfo(UserDetailInfo buyerInfo) {
		this.buyerInfo = buyerInfo;
	}
	public UserDetailInfo getBuyerInfo( ) {
		return this.buyerInfo;
	}

	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}
	public String getMerchantOrderNo( ) {
		return this.merchantOrderNo;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrderAmount( ) {
		return this.orderAmount;
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
