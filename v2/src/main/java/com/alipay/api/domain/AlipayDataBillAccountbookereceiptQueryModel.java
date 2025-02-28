package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询子账本电子回单状态(incubating)
 *
 * @author auto create
 * @since 1.0, 2024-11-15 16:01:19
 */
public class AlipayDataBillAccountbookereceiptQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8882979846153213185L;

	/**
	 * 协议号，根据不同业务协议类型，传入对应类型的协议号，用于isv授权检查并获取商户信息。如果业务类型未指定，则使用默认类型对应的协议号。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 根据不同业务协议类型，传入不同参数。传入协议产品码（personal_product_code，通过协议查询接口、协议签约通知响应参数获取），不填的话默认按照示例值传入
	 */
	@ApiField("agreement_type")
	private String agreementType;

	/**
	 * 根据申请id查询状态。申请接口可以参考alipay.data.bill.ereceiptagent.apply
	 */
	@ApiField("file_id")
	private String fileId;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAgreementType() {
		return this.agreementType;
	}
	public void setAgreementType(String agreementType) {
		this.agreementType = agreementType;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

}
