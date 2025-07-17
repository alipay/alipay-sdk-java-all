package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询运单行程
 *
 * @author auto create
 * @since 1.0, 2025-07-04 21:27:00
 */
public class AlipayCommerceTransportEtcCertifiedtripQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6471373371528598155L;

	/**
	 * 支付宝认证协议号
	 */
	@ApiField("auth_agreement_no")
	private String authAgreementNo;

	/**
	 * 运单结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 运单号
	 */
	@ApiField("out_waybill_no")
	private String outWaybillNo;

	/**
	 * 不传入时默认至多返回最新10条数据
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数据条数，默认10条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * true:接受行程推送，默认true
false：不接受行程推送，查询行程
	 */
	@ApiField("push_trip")
	private Boolean pushTrip;

	/**
	 * 运单开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getAuthAgreementNo() {
		return this.authAgreementNo;
	}
	public void setAuthAgreementNo(String authAgreementNo) {
		this.authAgreementNo = authAgreementNo;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getOutWaybillNo() {
		return this.outWaybillNo;
	}
	public void setOutWaybillNo(String outWaybillNo) {
		this.outWaybillNo = outWaybillNo;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Boolean getPushTrip() {
		return this.pushTrip;
	}
	public void setPushTrip(Boolean pushTrip) {
		this.pushTrip = pushTrip;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
