package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁财务智付核心批量根据业务单据号和关联单据号查询开票账单信息
 *
 * @author auto create
 * @since 1.0, 2023-09-11 18:02:10
 */
public class AlipayBossFncGfsmartpayInvoicebillserviceBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7794956299288268285L;

	/**
	 * 业务身份
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 业务单据号列表
	 */
	@ApiListField("biz_document_nos")
	@ApiField("string")
	private List<String> bizDocumentNos;

	/**
	 * 关联单据号列表
	 */
	@ApiListField("related_document_nos")
	@ApiField("string")
	private List<String> relatedDocumentNos;

	/**
	 * 影子标记
	 */
	@ApiField("test_mode")
	private Boolean testMode;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public List<String> getBizDocumentNos() {
		return this.bizDocumentNos;
	}
	public void setBizDocumentNos(List<String> bizDocumentNos) {
		this.bizDocumentNos = bizDocumentNos;
	}

	public List<String> getRelatedDocumentNos() {
		return this.relatedDocumentNos;
	}
	public void setRelatedDocumentNos(List<String> relatedDocumentNos) {
		this.relatedDocumentNos = relatedDocumentNos;
	}

	public Boolean getTestMode() {
		return this.testMode;
	}
	public void setTestMode(Boolean testMode) {
		this.testMode = testMode;
	}

}
