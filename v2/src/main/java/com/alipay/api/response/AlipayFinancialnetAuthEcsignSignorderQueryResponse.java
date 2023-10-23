package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.ecsign.signorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 02:36:47
 */
public class AlipayFinancialnetAuthEcsignSignorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8753348349686445974L;

	/** 
	 * 附加信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 签约单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 签约标的唯一号
	 */
	@ApiField("sign_order_no")
	private String signOrderNo;

	/** 
	 * 签约产品码
	 */
	@ApiField("sign_product_id")
	private String signProductId;

	/** 
	 * 签约方案码
	 */
	@ApiField("solution_code")
	private String solutionCode;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 核身VID，核身结果
	 */
	@ApiField("verify_result")
	private String verifyResult;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
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

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setSignOrderNo(String signOrderNo) {
		this.signOrderNo = signOrderNo;
	}
	public String getSignOrderNo( ) {
		return this.signOrderNo;
	}

	public void setSignProductId(String signProductId) {
		this.signProductId = signProductId;
	}
	public String getSignProductId( ) {
		return this.signProductId;
	}

	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}
	public String getSolutionCode( ) {
		return this.solutionCode;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setVerifyResult(String verifyResult) {
		this.verifyResult = verifyResult;
	}
	public String getVerifyResult( ) {
		return this.verifyResult;
	}

}
