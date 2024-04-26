package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 接收法催数据推送结构化入参——合同信息
 *
 * @author auto create
 * @since 1.0, 2023-03-21 20:43:56
 */
public class ContractInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1382181441554757354L;

	/**
	 * 合约ID
	 */
	@ApiField("ar_id")
	private String arId;

	/**
	 * 合同号
	 */
	@ApiListField("contract_info_no")
	@ApiField("string")
	private List<String> contractInfoNo;

	/**
	 * 合同附件信息
	 */
	@ApiListField("files")
	@ApiField("collection_file_d_t_o")
	private List<CollectionFileDTO> files;

	/**
	 * 发票和开票日期
	 */
	@ApiListField("invoicing_no_and_date")
	@ApiField("invoicing_no_and_date")
	private List<InvoicingNoAndDate> invoicingNoAndDate;

	/**
	 * ["sda.docx"]
	 */
	@ApiListField("other_files")
	@ApiField("collection_file_d_t_o")
	private List<CollectionFileDTO> otherFiles;

	public String getArId() {
		return this.arId;
	}
	public void setArId(String arId) {
		this.arId = arId;
	}

	public List<String> getContractInfoNo() {
		return this.contractInfoNo;
	}
	public void setContractInfoNo(List<String> contractInfoNo) {
		this.contractInfoNo = contractInfoNo;
	}

	public List<CollectionFileDTO> getFiles() {
		return this.files;
	}
	public void setFiles(List<CollectionFileDTO> files) {
		this.files = files;
	}

	public List<InvoicingNoAndDate> getInvoicingNoAndDate() {
		return this.invoicingNoAndDate;
	}
	public void setInvoicingNoAndDate(List<InvoicingNoAndDate> invoicingNoAndDate) {
		this.invoicingNoAndDate = invoicingNoAndDate;
	}

	public List<CollectionFileDTO> getOtherFiles() {
		return this.otherFiles;
	}
	public void setOtherFiles(List<CollectionFileDTO> otherFiles) {
		this.otherFiles = otherFiles;
	}

}
