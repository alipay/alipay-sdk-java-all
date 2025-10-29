package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核算受理模型
 *
 * @author auto create
 * @since 1.0, 2022-06-09 21:12:27
 */
public class GFAOpenAPIAccountingAcceptance extends AlipayObject {

	private static final long serialVersionUID = 4539879946695913728L;

	/**
	 * 金额Map
	 */
	@ApiField("amount_map")
	private String amountMap;

	/**
	 * 业务单据号组合字段，用于业财一体化的追溯，如存款场景下需要银行流水号用于对账、报账场景下需要报账单号用于追溯报账相关业务信息，一个业务事件可能关联多业务单据信息（如应收核销应付，关联应收单与应付单），采用组合字段，包括单据类型及其主键ID
	 */
	@ApiField("biz_bill_nos_map")
	private String bizBillNosMap;

	/**
	 * 业务要素
	 */
	@ApiField("biz_elements")
	private String bizElements;

	/**
	 * 业务事件码（8位数字）
	 */
	@ApiField("biz_ev_code")
	private String bizEvCode;

	/**
	 * 业务产品码
	 */
	@ApiField("biz_pd_code")
	private String bizPdCode;

	/**
	 * 端事件码（8位数字）
	 */
	@ApiField("cnl_ev_code")
	private String cnlEvCode;

	/**
	 * 端产品码
	 */
	@ApiField("cnl_pd_code")
	private String cnlPdCode;

	/**
	 * 业务发生时间
	 */
	@ApiField("gmt_service")
	private Date gmtService;

	/**
	 * 高精度金额
	 */
	@ApiField("high_amount_map")
	private String highAmountMap;

	/**
	 * 机构id
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 记账备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 业务流水号（受理幂等字段之一）
	 */
	@ApiField("out_business_no")
	private String outBusinessNo;

	/**
	 * 扩展属性
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * 业务唯一标识（受理幂等字段之一）
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 业务流水子单号（受理幂等字段之一）
	 */
	@ApiField("sub_out_business_no")
	private String subOutBusinessNo;

	/**
	 * 来源系统
	 */
	@ApiField("system_origin")
	private String systemOrigin;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getAmountMap() {
		return this.amountMap;
	}
	public void setAmountMap(String amountMap) {
		this.amountMap = amountMap;
	}

	public String getBizBillNosMap() {
		return this.bizBillNosMap;
	}
	public void setBizBillNosMap(String bizBillNosMap) {
		this.bizBillNosMap = bizBillNosMap;
	}

	public String getBizElements() {
		return this.bizElements;
	}
	public void setBizElements(String bizElements) {
		this.bizElements = bizElements;
	}

	public String getBizEvCode() {
		return this.bizEvCode;
	}
	public void setBizEvCode(String bizEvCode) {
		this.bizEvCode = bizEvCode;
	}

	public String getBizPdCode() {
		return this.bizPdCode;
	}
	public void setBizPdCode(String bizPdCode) {
		this.bizPdCode = bizPdCode;
	}

	public String getCnlEvCode() {
		return this.cnlEvCode;
	}
	public void setCnlEvCode(String cnlEvCode) {
		this.cnlEvCode = cnlEvCode;
	}

	public String getCnlPdCode() {
		return this.cnlPdCode;
	}
	public void setCnlPdCode(String cnlPdCode) {
		this.cnlPdCode = cnlPdCode;
	}

	public Date getGmtService() {
		return this.gmtService;
	}
	public void setGmtService(Date gmtService) {
		this.gmtService = gmtService;
	}

	public String getHighAmountMap() {
		return this.highAmountMap;
	}
	public void setHighAmountMap(String highAmountMap) {
		this.highAmountMap = highAmountMap;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutBusinessNo() {
		return this.outBusinessNo;
	}
	public void setOutBusinessNo(String outBusinessNo) {
		this.outBusinessNo = outBusinessNo;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
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

	public String getSystemOrigin() {
		return this.systemOrigin;
	}
	public void setSystemOrigin(String systemOrigin) {
		this.systemOrigin = systemOrigin;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
