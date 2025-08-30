package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 搜索直达关键词模块
 *
 * @author auto create
 * @since 1.0, 2025-02-11 14:58:13
 */
public class SearchBoxKeyWordModule extends AlipayObject {

	private static final long serialVersionUID = 5553376549228736959L;

	/**
	 * 申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

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
	 * 自定义触发词(生效中)
	 */
	@ApiListField("keywords")
	@ApiField("string")
	private List<String> keywords;

	/**
	 * 自定义触发词(最近一次审核内容)
	 */
	@ApiListField("latest_audit_keywords")
	@ApiField("string")
	private List<String> latestAuditKeywords;

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

	public List<String> getKeywords() {
		return this.keywords;
	}
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	public List<String> getLatestAuditKeywords() {
		return this.latestAuditKeywords;
	}
	public void setLatestAuditKeywords(List<String> latestAuditKeywords) {
		this.latestAuditKeywords = latestAuditKeywords;
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
