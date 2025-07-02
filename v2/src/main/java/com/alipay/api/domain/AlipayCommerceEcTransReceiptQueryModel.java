package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转账业务回单查询
 *
 * @author auto create
 * @since 1.0, 2024-04-26 09:55:27
 */
public class AlipayCommerceEcTransReceiptQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5581159233142341383L;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 文件申请号
	 */
	@ApiField("file_id")
	private String fileId;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

}
