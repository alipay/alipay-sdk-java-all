package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.flow.mode.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:19
 */
public class AlipayEbppFlowModeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7855939964396849682L;

	/** 
	 * 抽奖活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 扩展字段
	 */
	@ApiField("ext_msg")
	private String extMsg;

	/** 
	 * 业务方上送手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 流量产品编码
	 */
	@ApiField("product_id")
	private String productId;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setExtMsg(String extMsg) {
		this.extMsg = extMsg;
	}
	public String getExtMsg( ) {
		return this.extMsg;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductId( ) {
		return this.productId;
	}

}
