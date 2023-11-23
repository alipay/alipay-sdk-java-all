package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上架下架商品/产品/品类消息
 *
 * @author auto create
 * @since 1.0, 2023-07-10 19:24:03
 */
public class AlipayDigitalmgmtPunchoutProductstatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3126645227833645137L;

	/**
	 * 消息描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 通知的标识
	 */
	@ApiField("message_id")
	private String messageId;

	/**
	 * 来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 来源ID
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 来源类型
	 */
	@ApiField("source_type")
	private String sourceType;

	/**
	 * 状态 enabled,disabled
	 */
	@ApiField("status")
	private String status;

	/**
	 * 供应商名称
	 */
	@ApiField("supplier_name")
	private String supplierName;

	/**
	 * 租户
	 */
	@ApiField("tenant_id")
	private Long tenantId;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getMessageId() {
		return this.messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSupplierName() {
		return this.supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public Long getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

}
