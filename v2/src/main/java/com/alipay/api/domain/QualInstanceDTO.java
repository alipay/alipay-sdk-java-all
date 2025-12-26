package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资格实例
 *
 * @author auto create
 * @since 1.0, 2025-12-15 21:29:21
 */
public class QualInstanceDTO extends AlipayObject {

	private static final long serialVersionUID = 7626613515319694154L;

	/**
	 * 资格实例生效时间
	 */
	@ApiField("gmt_active")
	private Date gmtActive;

	/**
	 * 资格实例申领时间
	 */
	@ApiField("gmt_apply")
	private Date gmtApply;

	/**
	 * 资格实例失效时间
	 */
	@ApiField("gmt_expired")
	private Date gmtExpired;

	/**
	 * 资格实例核销时间
	 */
	@ApiField("gmt_use")
	private Date gmtUse;

	/**
	 * 资格编号ID
	 */
	@ApiField("qual_id")
	private String qualId;

	/**
	 * 资格实例ID
	 */
	@ApiField("qual_instance_id")
	private String qualInstanceId;

	/**
	 * 资格实例状态
	 */
	@ApiField("status")
	private String status;

	public Date getGmtActive() {
		return this.gmtActive;
	}
	public void setGmtActive(Date gmtActive) {
		this.gmtActive = gmtActive;
	}

	public Date getGmtApply() {
		return this.gmtApply;
	}
	public void setGmtApply(Date gmtApply) {
		this.gmtApply = gmtApply;
	}

	public Date getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(Date gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public Date getGmtUse() {
		return this.gmtUse;
	}
	public void setGmtUse(Date gmtUse) {
		this.gmtUse = gmtUse;
	}

	public String getQualId() {
		return this.qualId;
	}
	public void setQualId(String qualId) {
		this.qualId = qualId;
	}

	public String getQualInstanceId() {
		return this.qualInstanceId;
	}
	public void setQualInstanceId(String qualInstanceId) {
		this.qualInstanceId = qualInstanceId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
