package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建RCV对象模型
 *
 * @author auto create
 * @since 1.0, 2023-08-18 11:13:06
 */
public class RcvCreateDto extends AlipayObject {

	private static final long serialVersionUID = 4327583311429672139L;

	/**
	 * 审批流需要去重的人员
	 */
	@ApiField("duplicate_approver")
	private RcvApproverDto duplicateApprover;

	/**
	 * 验收所需材料
	 */
	@ApiListField("files")
	@ApiField("file_d_t_o")
	private List<FileDTO> files;

	/**
	 * 来源系统
	 */
	@ApiField("interface_source_code")
	private String interfaceSourceCode;

	/**
	 * 订单编号
	 */
	@ApiField("po_number")
	private String poNumber;

	/**
	 * 接收说明
	 */
	@ApiField("rcv_description")
	private String rcvDescription;

	/**
	 * 接单收号
	 */
	@ApiField("rcv_number")
	private String rcvNumber;

	/**
	 * 接收单行信息
	 */
	@ApiListField("rcv_shipment_lines")
	@ApiField("rcv_line_dto")
	private List<RcvLineDto> rcvShipmentLines;

	/**
	 * 来源系统单据号
	 */
	@ApiListField("source_bill_nos")
	@ApiField("string")
	private List<String> sourceBillNos;

	/**
	 * 来源单据
	 */
	@ApiListField("source_bills")
	@ApiField("link_d_t_o")
	private List<LinkDTO> sourceBills;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 唯一校验ID
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public RcvApproverDto getDuplicateApprover() {
		return this.duplicateApprover;
	}
	public void setDuplicateApprover(RcvApproverDto duplicateApprover) {
		this.duplicateApprover = duplicateApprover;
	}

	public List<FileDTO> getFiles() {
		return this.files;
	}
	public void setFiles(List<FileDTO> files) {
		this.files = files;
	}

	public String getInterfaceSourceCode() {
		return this.interfaceSourceCode;
	}
	public void setInterfaceSourceCode(String interfaceSourceCode) {
		this.interfaceSourceCode = interfaceSourceCode;
	}

	public String getPoNumber() {
		return this.poNumber;
	}
	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public String getRcvDescription() {
		return this.rcvDescription;
	}
	public void setRcvDescription(String rcvDescription) {
		this.rcvDescription = rcvDescription;
	}

	public String getRcvNumber() {
		return this.rcvNumber;
	}
	public void setRcvNumber(String rcvNumber) {
		this.rcvNumber = rcvNumber;
	}

	public List<RcvLineDto> getRcvShipmentLines() {
		return this.rcvShipmentLines;
	}
	public void setRcvShipmentLines(List<RcvLineDto> rcvShipmentLines) {
		this.rcvShipmentLines = rcvShipmentLines;
	}

	public List<String> getSourceBillNos() {
		return this.sourceBillNos;
	}
	public void setSourceBillNos(List<String> sourceBillNos) {
		this.sourceBillNos = sourceBillNos;
	}

	public List<LinkDTO> getSourceBills() {
		return this.sourceBills;
	}
	public void setSourceBills(List<LinkDTO> sourceBills) {
		this.sourceBills = sourceBills;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

}
