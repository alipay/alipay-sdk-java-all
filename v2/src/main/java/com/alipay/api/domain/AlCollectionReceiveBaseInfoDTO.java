package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 工单信息
 *
 * @author auto create
 * @since 1.0, 2023-03-21 20:43:56
 */
public class AlCollectionReceiveBaseInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3223598379557791949L;

	/**
	 * 法催需求标题
	 */
	@ApiField("collection_title")
	private String collectionTitle;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 法催录入时的工单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 系统来源
	 */
	@ApiField("source_sys")
	private String sourceSys;

	/**
	 * 函件模板ID(上游系统首次发函模板)
	 */
	@ApiField("template_id")
	private String templateId;

	public String getCollectionTitle() {
		return this.collectionTitle;
	}
	public void setCollectionTitle(String collectionTitle) {
		this.collectionTitle = collectionTitle;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getSourceSys() {
		return this.sourceSys;
	}
	public void setSourceSys(String sourceSys) {
		this.sourceSys = sourceSys;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
