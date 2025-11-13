package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 协议文件
 *
 * @author auto create
 * @since 1.0, 2025-09-18 15:56:03
 */
public class AgreementFile extends AlipayObject {

	private static final long serialVersionUID = 7444545932667144866L;

	/**
	 * 星河协议编号（唯一）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 合同编号（该合同编号为协议生成方生成）
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 协议PDF文件Id
需要通过alipay.open.file.upload，支付宝文件上传接口上传文件，获取对应的file_id（注意，入参内的biz_code传xhcarfinance_instinfo_upload）
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 协议状态
	 */
	@ApiField("sign_status")
	private String signStatus;

	/**
	 * 签署时间
	 */
	@ApiField("sign_time")
	private Date signTime;

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

	public String getSignStatus() {
		return this.signStatus;
	}
	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}

	public Date getSignTime() {
		return this.signTime;
	}
	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
