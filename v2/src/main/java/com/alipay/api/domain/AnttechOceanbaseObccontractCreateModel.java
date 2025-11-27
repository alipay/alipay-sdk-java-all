package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多云合同创建
 *
 * @author auto create
 * @since 1.0, 2025-08-28 17:00:13
 */
public class AnttechOceanbaseObccontractCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6392735879179877689L;

	/**
	 * 合同编码
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 初始化
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 文件id
	 */
	@ApiField("file_id")
	private Long fileId;

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public Long getFileId() {
		return this.fileId;
	}
	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}

}
