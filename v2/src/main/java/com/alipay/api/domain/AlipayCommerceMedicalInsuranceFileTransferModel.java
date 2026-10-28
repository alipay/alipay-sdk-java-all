package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 文件传输(风石→商保码base64上传)
 *
 * @author auto create
 * @since 1.0, 2026-10-21 20:02:55
 */
public class AlipayCommerceMedicalInsuranceFileTransferModel extends AlipayObject {

	private static final long serialVersionUID = 6167229283873319289L;

	/**
	 * 业务单号(理赔单号/预授权单号)
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 事件类型(PA_REQUEST/CLAIM_SUBMIT/PA_FOLLOW_UP/CLAIM_FOLLOW_UP)
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 保司类型
	 */
	@ApiField("company_type")
	private String companyType;

	/**
	 * null
	 */
	@ApiListField("file_items")
	@ApiField("hk_file_item")
	private List<HkFileItem> fileItems;

	/**
	 * 是否还有后续文件批次
	 */
	@ApiField("has_more_files")
	private Boolean hasMoreFiles;

	/**
	 * HK场景
	 */
	@ApiField("hk_scene")
	private String hkScene;

	/**
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商保码关联的coverageKey
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 唯一标识本次请求
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 交易来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * TPA编号
	 */
	@ApiField("tpa_id")
	private String tpaId;

	/**
	 * user_id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCompanyType() {
		return this.companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public List<HkFileItem> getFileItems() {
		return this.fileItems;
	}
	public void setFileItems(List<HkFileItem> fileItems) {
		this.fileItems = fileItems;
	}

	public Boolean getHasMoreFiles() {
		return this.hasMoreFiles;
	}
	public void setHasMoreFiles(Boolean hasMoreFiles) {
		this.hasMoreFiles = hasMoreFiles;
	}

	public String getHkScene() {
		return this.hkScene;
	}
	public void setHkScene(String hkScene) {
		this.hkScene = hkScene;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTpaId() {
		return this.tpaId;
	}
	public void setTpaId(String tpaId) {
		this.tpaId = tpaId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
