package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 关键词信息
 *
 * @author auto create
 * @since 1.0, 2023-01-05 21:18:19
 */
public class SearchBoxKeywordInfo extends AlipayObject {

	private static final long serialVersionUID = 2576356164855354311L;

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
	 * 关键词
	 */
	@ApiListField("keywords")
	@ApiField("string")
	private List<String> keywords;

	/**
	 * 模块配置ID
	 */
	@ApiField("module_id")
	private String moduleId;

	/**
	 * ONLINE--上架
REJECT--驳回
OFFLINE-已下架
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

	public String getModuleId() {
		return this.moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
