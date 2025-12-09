package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 完整协议信息
 *
 * @author auto create
 * @since 1.0, 2025-09-18 15:56:04
 */
public class AgreementFullInfo extends AlipayObject {

	private static final long serialVersionUID = 8456126942635395981L;

	/**
	 * 星河侧唯一协议编号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 版本，默认1.0
	 */
	@ApiField("agreement_version")
	private String agreementVersion;

	/**
	 * 协议富文本
	 */
	@ApiField("content")
	private String content;

	/**
	 * 合同编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 支付宝开放平台的文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 签署信息
	 */
	@ApiListField("sign_info_list")
	@ApiField("carfin_sign_info")
	private List<CarfinSignInfo> signInfoList;

	/**
	 * 代表协议签署的状态
	 */
	@ApiField("sign_status")
	private String signStatus;

	/**
	 * 签署时间
	 */
	@ApiField("sign_time")
	private String signTime;

	/**
	 * 协议标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 协议类型
	 */
	@ApiField("type")
	private String type;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAgreementVersion() {
		return this.agreementVersion;
	}
	public void setAgreementVersion(String agreementVersion) {
		this.agreementVersion = agreementVersion;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public List<CarfinSignInfo> getSignInfoList() {
		return this.signInfoList;
	}
	public void setSignInfoList(List<CarfinSignInfo> signInfoList) {
		this.signInfoList = signInfoList;
	}

	public String getSignStatus() {
		return this.signStatus;
	}
	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}

	public String getSignTime() {
		return this.signTime;
	}
	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
