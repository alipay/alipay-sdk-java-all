package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁财务智付核心查询付款进度
 *
 * @author auto create
 * @since 1.0, 2023-09-11 18:02:01
 */
public class AlipayBossFncGfsmartpayPaymentinstructionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7892585616468428847L;

	/**
	 * 业务身份
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 业务单据号列
	 */
	@ApiField("biz_document_nos")
	private String bizDocumentNos;

	/**
	 * 关联单据号列
	 */
	@ApiField("related_document_nos")
	private String relatedDocumentNos;

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

	public String getBizDocumentNos() {
		return this.bizDocumentNos;
	}
	public void setBizDocumentNos(String bizDocumentNos) {
		this.bizDocumentNos = bizDocumentNos;
	}

	public String getRelatedDocumentNos() {
		return this.relatedDocumentNos;
	}
	public void setRelatedDocumentNos(String relatedDocumentNos) {
		this.relatedDocumentNos = relatedDocumentNos;
	}

	public Boolean getTestMode() {
		return this.testMode;
	}
	public void setTestMode(Boolean testMode) {
		this.testMode = testMode;
	}

}
