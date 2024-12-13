package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业财受理查询请求体
 *
 * @author auto create
 * @since 1.0, 2020-08-27 20:00:15
 */
public class GFAOpenAPIQueryRequest extends AlipayObject {

	private static final long serialVersionUID = 5719224299771948293L;

	/**
	 * 业财受理单id
	 */
	@ApiField("acceptance_id")
	private String acceptanceId;

	/**
	 * 两码-业务事件码
	 */
	@ApiField("biz_ev_code")
	private String bizEvCode;

	/**
	 * 业务流水号
	 */
	@ApiField("out_business_no")
	private String outBusinessNo;

	/**
	 * 业务唯一标识
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 业务流水子单号
	 */
	@ApiField("sub_out_business_no")
	private String subOutBusinessNo;

	/**
	 * 是否用 biz_ev_code 字段筛选
	 */
	@ApiField("use_biz_ev_code")
	private Boolean useBizEvCode;

	/**
	 * 是否使用 sub_out_business_no 字段做筛选
	 */
	@ApiField("use_sub_out_business_no")
	private Boolean useSubOutBusinessNo;

	public String getAcceptanceId() {
		return this.acceptanceId;
	}
	public void setAcceptanceId(String acceptanceId) {
		this.acceptanceId = acceptanceId;
	}

	public String getBizEvCode() {
		return this.bizEvCode;
	}
	public void setBizEvCode(String bizEvCode) {
		this.bizEvCode = bizEvCode;
	}

	public String getOutBusinessNo() {
		return this.outBusinessNo;
	}
	public void setOutBusinessNo(String outBusinessNo) {
		this.outBusinessNo = outBusinessNo;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getSubOutBusinessNo() {
		return this.subOutBusinessNo;
	}
	public void setSubOutBusinessNo(String subOutBusinessNo) {
		this.subOutBusinessNo = subOutBusinessNo;
	}

	public Boolean getUseBizEvCode() {
		return this.useBizEvCode;
	}
	public void setUseBizEvCode(Boolean useBizEvCode) {
		this.useBizEvCode = useBizEvCode;
	}

	public Boolean getUseSubOutBusinessNo() {
		return this.useSubOutBusinessNo;
	}
	public void setUseSubOutBusinessNo(Boolean useSubOutBusinessNo) {
		this.useSubOutBusinessNo = useSubOutBusinessNo;
	}

}
