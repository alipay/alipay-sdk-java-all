package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 采购接收单Dto模型
 *
 * @author auto create
 * @since 1.0, 2023-09-15 09:58:53
 */
public class RcvDto extends AlipayObject {

	private static final long serialVersionUID = 5361366677674421835L;

	/**
	 * 公司
	 */
	@ApiField("company")
	private OuDTO company;

	/**
	 * 附件号
	 */
	@ApiField("credit_note")
	private String creditNote;

	/**
	 * 可执行金额/元
	 */
	@ApiField("execute_amount")
	private String executeAmount;

	/**
	 * 验收所需材料(文件服务器对应ID)
	 */
	@ApiListField("files")
	@ApiField("file_d_t_o")
	private List<FileDTO> files;

	/**
	 * 审批完成时间
	 */
	@ApiField("finish_date")
	private Date finishDate;

	/**
	 * 流程实例ID
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 是否允许修改
	 */
	@ApiField("is_allow_modify")
	private Boolean isAllowModify;

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
	 * 接收单详情页面
	 */
	@ApiField("rcv_detail_url")
	private String rcvDetailUrl;

	/**
	 * 接收单头id
	 */
	@ApiField("rcv_head_id")
	private String rcvHeadId;

	/**
	 * 接收单行信息
	 */
	@ApiListField("rcv_shipment_lines")
	@ApiField("rcv_line_result_out_d_t_o")
	private List<RcvLineResultOutDTO> rcvShipmentLines;

	/**
	 * 接收状态
	 */
	@ApiField("rcv_status")
	private String rcvStatus;

	/**
	 * 接收状态编码
	 */
	@ApiField("rcv_status_code")
	private String rcvStatusCode;

	/**
	 * rcv类型
	 */
	@ApiField("rcv_type")
	private String rcvType;

	/**
	 * 接收单号
	 */
	@ApiField("rcv_umber")
	private String rcvUmber;

	/**
	 * 已接收金额/元
	 */
	@ApiField("received_amount")
	private String receivedAmount;

	/**
	 * 接收人
	 */
	@ApiField("receiver")
	private PersonDTO receiver;

	/**
	 * 供应商
	 */
	@ApiField("supplier_dto")
	private SupplierDTO supplierDto;

	/**
	 * 审批记录
	 */
	@ApiField("workflow_logs")
	private WorkflowLogDTO workflowLogs;

	public OuDTO getCompany() {
		return this.company;
	}
	public void setCompany(OuDTO company) {
		this.company = company;
	}

	public String getCreditNote() {
		return this.creditNote;
	}
	public void setCreditNote(String creditNote) {
		this.creditNote = creditNote;
	}

	public String getExecuteAmount() {
		return this.executeAmount;
	}
	public void setExecuteAmount(String executeAmount) {
		this.executeAmount = executeAmount;
	}

	public List<FileDTO> getFiles() {
		return this.files;
	}
	public void setFiles(List<FileDTO> files) {
		this.files = files;
	}

	public Date getFinishDate() {
		return this.finishDate;
	}
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public Boolean getIsAllowModify() {
		return this.isAllowModify;
	}
	public void setIsAllowModify(Boolean isAllowModify) {
		this.isAllowModify = isAllowModify;
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

	public String getRcvDetailUrl() {
		return this.rcvDetailUrl;
	}
	public void setRcvDetailUrl(String rcvDetailUrl) {
		this.rcvDetailUrl = rcvDetailUrl;
	}

	public String getRcvHeadId() {
		return this.rcvHeadId;
	}
	public void setRcvHeadId(String rcvHeadId) {
		this.rcvHeadId = rcvHeadId;
	}

	public List<RcvLineResultOutDTO> getRcvShipmentLines() {
		return this.rcvShipmentLines;
	}
	public void setRcvShipmentLines(List<RcvLineResultOutDTO> rcvShipmentLines) {
		this.rcvShipmentLines = rcvShipmentLines;
	}

	public String getRcvStatus() {
		return this.rcvStatus;
	}
	public void setRcvStatus(String rcvStatus) {
		this.rcvStatus = rcvStatus;
	}

	public String getRcvStatusCode() {
		return this.rcvStatusCode;
	}
	public void setRcvStatusCode(String rcvStatusCode) {
		this.rcvStatusCode = rcvStatusCode;
	}

	public String getRcvType() {
		return this.rcvType;
	}
	public void setRcvType(String rcvType) {
		this.rcvType = rcvType;
	}

	public String getRcvUmber() {
		return this.rcvUmber;
	}
	public void setRcvUmber(String rcvUmber) {
		this.rcvUmber = rcvUmber;
	}

	public String getReceivedAmount() {
		return this.receivedAmount;
	}
	public void setReceivedAmount(String receivedAmount) {
		this.receivedAmount = receivedAmount;
	}

	public PersonDTO getReceiver() {
		return this.receiver;
	}
	public void setReceiver(PersonDTO receiver) {
		this.receiver = receiver;
	}

	public SupplierDTO getSupplierDto() {
		return this.supplierDto;
	}
	public void setSupplierDto(SupplierDTO supplierDto) {
		this.supplierDto = supplierDto;
	}

	public WorkflowLogDTO getWorkflowLogs() {
		return this.workflowLogs;
	}
	public void setWorkflowLogs(WorkflowLogDTO workflowLogs) {
		this.workflowLogs = workflowLogs;
	}

}
