package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序-搜索运营-关键词信息
 *
 * @author auto create
 * @since 1.0, 2022-12-02 16:34:56
 */
public class KeyWordInfo extends AlipayObject {

	private static final long serialVersionUID = 5559921597317922965L;

	/**
	 * 审核单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 审核中的关键词
	 */
	@ApiField("audit_key_word")
	private String auditKeyWord;

	/**
	 * 审核人的备注信息
	 */
	@ApiField("audit_reason")
	private String auditReason;

	/**
	 * 审核时间
	 */
	@ApiField("audit_time")
	private String auditTime;

	/**
	 * 关键词配置ID
	 */
	@ApiField("config_id")
	private String configId;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 审核完成的关键词
	 */
	@ApiField("key_word")
	private String keyWord;

	/**
	 * 关键词当前状态
	 */
	@ApiField("status")
	private String status;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getAuditKeyWord() {
		return this.auditKeyWord;
	}
	public void setAuditKeyWord(String auditKeyWord) {
		this.auditKeyWord = auditKeyWord;
	}

	public String getAuditReason() {
		return this.auditReason;
	}
	public void setAuditReason(String auditReason) {
		this.auditReason = auditReason;
	}

	public String getAuditTime() {
		return this.auditTime;
	}
	public void setAuditTime(String auditTime) {
		this.auditTime = auditTime;
	}

	public String getConfigId() {
		return this.configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getKeyWord() {
		return this.keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
