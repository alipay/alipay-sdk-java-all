package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报道就医tab角标状态通知接口
 *
 * @author auto create
 * @since 1.0, 2026-09-17 10:37:54
 */
public class AlipayCommerceMedicalReportBroadcastNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8562675526431497293L;

	/**
	 * 2088用户
	 */
	@ApiField("alipay_user")
	private String alipayUser;

	/**
	 * AQ用户
	 */
	@ApiField("aq_user")
	private String aqUser;

	/**
	 * 报道信息
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 外部业务 id
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 外部业务类型
	 */
	@ApiField("status")
	private String status;

	public String getAlipayUser() {
		return this.alipayUser;
	}
	public void setAlipayUser(String alipayUser) {
		this.alipayUser = alipayUser;
	}

	public String getAqUser() {
		return this.aqUser;
	}
	public void setAqUser(String aqUser) {
		this.aqUser = aqUser;
	}

	public String getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
