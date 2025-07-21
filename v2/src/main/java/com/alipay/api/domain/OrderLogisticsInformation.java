package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流信息需要新增
 *
 * @author auto create
 * @since 1.0, 2022-12-29 14:05:39
 */
public class OrderLogisticsInformation extends AlipayObject {

	private static final long serialVersionUID = 1353839994459875581L;

	/**
	 * 物流信息
	 */
	@ApiField("detail")
	private String detail;

	/**
	 * 物流公司名称
	 */
	@ApiField("express_company")
	private String expressCompany;

	/**
	 * 是否匹配到物流单号
	 */
	@ApiField("has_matched")
	private Boolean hasMatched;

	/**
	 * 物流状态
RECEIVE_SUCCESS-揽件成功
DELIVER_SUCCESS-快件发出
TRANSIT-中转
DELIVERY_REMIND-派件提醒
TO_PICK_UP-待提货
RECEIVE_SIGN-已签收
SIGN_FAILED-签收失败
	 */
	@ApiField("status")
	private String status;

	/**
	 * 状态描述
	 */
	@ApiField("status_desc")
	private String statusDesc;

	/**
	 * 物流单号
	 */
	@ApiField("tracking_no")
	private String trackingNo;

	public String getDetail() {
		return this.detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getExpressCompany() {
		return this.expressCompany;
	}
	public void setExpressCompany(String expressCompany) {
		this.expressCompany = expressCompany;
	}

	public Boolean getHasMatched() {
		return this.hasMatched;
	}
	public void setHasMatched(Boolean hasMatched) {
		this.hasMatched = hasMatched;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public String getTrackingNo() {
		return this.trackingNo;
	}
	public void setTrackingNo(String trackingNo) {
		this.trackingNo = trackingNo;
	}

}
