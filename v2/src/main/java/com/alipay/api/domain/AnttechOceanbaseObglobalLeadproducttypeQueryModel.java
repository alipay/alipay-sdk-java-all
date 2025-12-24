package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 官网查询维保时间
 *
 * @author auto create
 * @since 1.0, 2025-10-28 15:32:35
 */
public class AnttechOceanbaseObglobalLeadproducttypeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7176682616492896535L;

	/**
	 * 合作实体bid
	 */
	@ApiField("bid")
	private String bid;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 公司名称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 用于告知请求来源
	 */
	@ApiField("request_source")
	private String requestSource;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getBid() {
		return this.bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getRequestSource() {
		return this.requestSource;
	}
	public void setRequestSource(String requestSource) {
		this.requestSource = requestSource;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
