package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.isv.fastregister.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 01:11:37
 */
public class AlipayOpenMiniIsvFastregisterQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6561763689575611684L;

	/** 
	 * 小程序应用名
	 */
	@ApiField("app_name")
	private String appName;

	/** 
	 * appid
	 */
	@ApiField("isv_app_id")
	private String isvAppId;

	/** 
	 * 小程序appid
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/** 
	 * 代创建试用小程序单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 商户传入的外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 试用小程序状态，PRECREATE 待授权确认 PROCESS 已授权使用中 SUCCESS 已转正 FAILED 已失败
	 */
	@ApiField("status")
	private String status;

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName( ) {
		return this.appName;
	}

	public void setIsvAppId(String isvAppId) {
		this.isvAppId = isvAppId;
	}
	public String getIsvAppId( ) {
		return this.isvAppId;
	}

	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}
	public String getMiniAppId( ) {
		return this.miniAppId;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
