package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.fund.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-07 10:07:43
 */
public class AlipayFundJointaccountFundOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3138884382554995954L;

	/** 
	 * 操作金额（单位为元，必须大于0且最多小数点后两位）
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 资金操作时间（yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("biz_date")
	private String bizDate;

	/** 
	 * 支付宝侧转账订单号
	 */
	@ApiField("biz_trans_id")
	private String bizTransId;

	/** 
	 * 资金操作的错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误描述
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 订单标题 <br/>
补充说明： <br/>
- 该字段与各类资金操作接口的请求参数中传入值保持一致
	 */
	@ApiField("order_title")
	private String orderTitle;

	/** 
	 * 资金单据的状态： <br/>
- INIT 初始化 <br/>
- SUCESS 成功 <br/>
- FAIL 失败 <br/>
	 */
	@ApiField("status")
	private String status;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}
	public String getBizDate( ) {
		return this.bizDate;
	}

	public void setBizTransId(String bizTransId) {
		this.bizTransId = bizTransId;
	}
	public String getBizTransId( ) {
		return this.bizTransId;
	}

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

	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}
	public String getOrderTitle( ) {
		return this.orderTitle;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
