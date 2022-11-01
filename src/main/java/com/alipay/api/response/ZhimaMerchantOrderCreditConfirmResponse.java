package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.order.credit.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-26 13:57:03
 */
public class ZhimaMerchantOrderCreditConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 2268984638818953473L;

	/** 
	 * 错误码，业务处理完毕之后返回的错误码，成功码：SUCCESS
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误信息，错误码的解释说明，例如：成功
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 订单创建成功时间，格式：YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("order_create_time")
	private String orderCreateTime;

	/** 
	 * 下单状态，下单成功状态为SUCCESS，失败:FAIL
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 商户端订单号，回传商户
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 跳转至商户页面类型，目前共2种：order_result和order_detail，下单完成后为order_result，业务中间跳转类型为order_detail
	 */
	@ApiField("page_type")
	private String pageType;

	/** 
	 * 业务处理是否成功，true：成功，false：失败
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 芝麻订单号，下单成功后回传给商户
	 */
	@ApiField("zm_order_no")
	private String zmOrderNo;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setOrderCreateTime(String orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}
	public String getOrderCreateTime( ) {
		return this.orderCreateTime;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setPageType(String pageType) {
		this.pageType = pageType;
	}
	public String getPageType( ) {
		return this.pageType;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setZmOrderNo(String zmOrderNo) {
		this.zmOrderNo = zmOrderNo;
	}
	public String getZmOrderNo( ) {
		return this.zmOrderNo;
	}

}
