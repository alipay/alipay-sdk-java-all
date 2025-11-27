package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iotnsp货柜通道接口
 *
 * @author auto create
 * @since 1.0, 2025-04-02 15:37:38
 */
public class AlipayCommerceCityfacilitatorIotnsphgHgnfcGetModel extends AlipayObject {

	private static final long serialVersionUID = 5895227873641638379L;

	/**
	 * 业务内容
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 设备biztid
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 额外信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 推送产品名称
	 */
	@ApiField("push_product_name")
	private String pushProductName;

	/**
	 * 唯一标识
	 */
	@ApiField("req_id")
	private String reqId;

	/**
	 * 业务标识处理id
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 设备sn
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 上位机biztid
	 */
	@ApiField("upper_biz_tid")
	private String upperBizTid;

	/**
	 * 上位机sn
	 */
	@ApiField("upper_sn")
	private String upperSn;

	public String getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getPushProductName() {
		return this.pushProductName;
	}
	public void setPushProductName(String pushProductName) {
		this.pushProductName = pushProductName;
	}

	public String getReqId() {
		return this.reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getUpperBizTid() {
		return this.upperBizTid;
	}
	public void setUpperBizTid(String upperBizTid) {
		this.upperBizTid = upperBizTid;
	}

	public String getUpperSn() {
		return this.upperSn;
	}
	public void setUpperSn(String upperSn) {
		this.upperSn = upperSn;
	}

}
