package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-06-16 16:37:28
 */
public class TourOrderSyncDetail extends AlipayObject {

	private static final long serialVersionUID = 1667955744162886881L;

	/**
	 * 票张数
	 */
	@ApiField("biz_source_num")
	private String bizSourceNum;

	/**
	 * 用户身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 用户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 订单信息
	 */
	@ApiField("order_info")
	private String orderInfo;

	/**
	 * 订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 项目id/景区id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 用户手机号
	 */
	@ApiField("tele_no")
	private String teleNo;

	public String getBizSourceNum() {
		return this.bizSourceNum;
	}
	public void setBizSourceNum(String bizSourceNum) {
		this.bizSourceNum = bizSourceNum;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOrderInfo() {
		return this.orderInfo;
	}
	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getTeleNo() {
		return this.teleNo;
	}
	public void setTeleNo(String teleNo) {
		this.teleNo = teleNo;
	}

}
