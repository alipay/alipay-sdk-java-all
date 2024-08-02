package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询子账本电子回单状态(incubating)
 *
 * @author auto create
 * @since 1.0, 2023-02-21 14:55:15
 */
public class AlipayDataBillAccountbookereceiptQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2897253921825854958L;

	/**
	 * 协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 根据申请id查询状态
	 */
	@ApiField("file_id")
	private String fileId;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

}
