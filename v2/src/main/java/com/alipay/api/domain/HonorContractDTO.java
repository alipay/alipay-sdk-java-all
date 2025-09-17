package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同DTO
 *
 * @author auto create
 * @since 1.0, 2025-09-01 16:52:39
 */
public class HonorContractDTO extends AlipayObject {

	private static final long serialVersionUID = 5556947324573728716L;

	/**
	 * 合同文本
	 */
	@ApiField("contract_content")
	private String contractContent;

	/**
	 * 合同id
	 */
	@ApiField("contract_id")
	private String contractId;

	/**
	 * 合同名称
	 */
	@ApiField("contract_name")
	private String contractName;

	/**
	 * 是否默认勾选，1：勾选；0：不勾选
	 */
	@ApiField("default_checked")
	private Long defaultChecked;

	/**
	 * 是否强制阅读，0：默认不强制；1：强制用户阅读
	 */
	@ApiField("force_read")
	private Long forceRead;

	/**
	 * 是否需要上滑阅读全部，0：不需要；1：需要上滑阅读全部
	 */
	@ApiField("read_all")
	private Long readAll;

	/**
	 * 强读时长（秒）
	 */
	@ApiField("read_time")
	private Long readTime;

	/**
	 * 类型, 1-URL, 2-html, 3-pdf
	 */
	@ApiField("text_type")
	private Long textType;

	public String getContractContent() {
		return this.contractContent;
	}
	public void setContractContent(String contractContent) {
		this.contractContent = contractContent;
	}

	public String getContractId() {
		return this.contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getContractName() {
		return this.contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public Long getDefaultChecked() {
		return this.defaultChecked;
	}
	public void setDefaultChecked(Long defaultChecked) {
		this.defaultChecked = defaultChecked;
	}

	public Long getForceRead() {
		return this.forceRead;
	}
	public void setForceRead(Long forceRead) {
		this.forceRead = forceRead;
	}

	public Long getReadAll() {
		return this.readAll;
	}
	public void setReadAll(Long readAll) {
		this.readAll = readAll;
	}

	public Long getReadTime() {
		return this.readTime;
	}
	public void setReadTime(Long readTime) {
		this.readTime = readTime;
	}

	public Long getTextType() {
		return this.textType;
	}
	public void setTextType(Long textType) {
		this.textType = textType;
	}

}
