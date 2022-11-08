package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.bail.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-20 13:50:38
 */
public class AlipayFundBailOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1631258249953879288L;

	/** 
	 * 保证金预授权号
	 */
	@ApiField("auth_no")
	private String authNo;

	/** 
	 * 当result_code为FAIL时，对应的错误码
	 */
	@ApiField("biz_error")
	private String bizError;

	/** 
	 * 资金托管模式，网商模式下返回ANTBANK，余额模式下不返回该字段
	 */
	@ApiField("fund_entrust_type")
	private String fundEntrustType;

	/** 
	 * 保证金主单创建时间，格式YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 保证金主单最后修改时间，格式YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/** 
	 * 保证金主单状态，INIT：初始态，AUTHORIZED：已预授权态。
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 订单标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/** 
	 * 保证金主单的外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 保证金产品码，固定BAIL_AUTH
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 保证金剩余可用余额
	 */
	@ApiField("rest_amount")
	private String restAmount;

	/** 
	 * 返回结果码。SUCCESS：查询成功。FAIL：查询失败。
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 请求失败时，返回的错误描述
	 */
	@ApiField("result_message")
	private String resultMessage;

	/** 
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}
	public String getAuthNo( ) {
		return this.authNo;
	}

	public void setBizError(String bizError) {
		this.bizError = bizError;
	}
	public String getBizError( ) {
		return this.bizError;
	}

	public void setFundEntrustType(String fundEntrustType) {
		this.fundEntrustType = fundEntrustType;
	}
	public String getFundEntrustType( ) {
		return this.fundEntrustType;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getGmtModified( ) {
		return this.gmtModified;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}
	public String getOrderTitle( ) {
		return this.orderTitle;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setRestAmount(String restAmount) {
		this.restAmount = restAmount;
	}
	public String getRestAmount( ) {
		return this.restAmount;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultMessage( ) {
		return this.resultMessage;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public String getSceneCode( ) {
		return this.sceneCode;
	}

}
