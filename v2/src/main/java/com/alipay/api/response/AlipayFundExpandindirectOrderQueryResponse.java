package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.expandindirect.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-06 15:22:39
 */
public class AlipayFundExpandindirectOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5299734948473198926L;

	/** 
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 进件单创建时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 进件单id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 进件单审核不通过原因
	 */
	@ApiField("risk_review_remark")
	private String riskReviewRemark;

	/** 
	 * 二级商户名称
	 */
	@ApiField("secondary_partner_name")
	private String secondaryPartnerName;

	/** 
	 * 进件单状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 进件单任务完结时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("task_finish_time")
	private String taskFinishTime;

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
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

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setRiskReviewRemark(String riskReviewRemark) {
		this.riskReviewRemark = riskReviewRemark;
	}
	public String getRiskReviewRemark( ) {
		return this.riskReviewRemark;
	}

	public void setSecondaryPartnerName(String secondaryPartnerName) {
		this.secondaryPartnerName = secondaryPartnerName;
	}
	public String getSecondaryPartnerName( ) {
		return this.secondaryPartnerName;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTaskFinishTime(String taskFinishTime) {
		this.taskFinishTime = taskFinishTime;
	}
	public String getTaskFinishTime( ) {
		return this.taskFinishTime;
	}

}
