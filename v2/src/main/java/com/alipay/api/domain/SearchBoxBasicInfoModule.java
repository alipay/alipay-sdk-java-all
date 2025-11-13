package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索直达基础信息模块
 *
 * @author auto create
 * @since 1.0, 2025-02-11 14:58:00
 */
public class SearchBoxBasicInfoModule extends AlipayObject {

	private static final long serialVersionUID = 1888126811512596412L;

	/**
	 * 申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 介绍，已生效的数据
	 */
	@ApiField("box_desc")
	private String boxDesc;

	/**
	 * 审核失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 介绍，最近一次审核内容
	 */
	@ApiField("latest_audit_box_desc")
	private String latestAuditBoxDesc;

	/**
	 * 模块配置ID
	 */
	@ApiField("module_id")
	private String moduleId;

	/**
	 * 搜索直达模块类型
	 */
	@ApiField("module_type")
	private String moduleType;

	/**
	 * 状态，INITIAL-初始/AUDIT-审核中/CANCEL-已取消/ONLINE-已上架/REJECT-驳回/OFFLINE-已下架/EXPIRE-已失效
	 */
	@ApiField("status")
	private String status;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getBoxDesc() {
		return this.boxDesc;
	}
	public void setBoxDesc(String boxDesc) {
		this.boxDesc = boxDesc;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getLatestAuditBoxDesc() {
		return this.latestAuditBoxDesc;
	}
	public void setLatestAuditBoxDesc(String latestAuditBoxDesc) {
		this.latestAuditBoxDesc = latestAuditBoxDesc;
	}

	public String getModuleId() {
		return this.moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleType() {
		return this.moduleType;
	}
	public void setModuleType(String moduleType) {
		this.moduleType = moduleType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
