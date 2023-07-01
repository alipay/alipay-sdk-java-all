package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ComplaintTradeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.complaint.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-06 19:26:56
 */
public class AlipaySecurityRiskComplaintInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6489331746789823274L;

	/** 
	 * 投诉单涉及交易总金额（单位：人民币元）
	 */
	@ApiField("complain_amount")
	private String complainAmount;

	/** 
	 * 用户投诉内容
	 */
	@ApiField("complain_content")
	private String complainContent;

	/** 
	 * 投诉单涉及的交易信息
	 */
	@ApiListField("complaint_trade_info_list")
	@ApiField("complaint_trade_info")
	private List<ComplaintTradeInfo> complaintTradeInfoList;

	/** 
	 * 联系方式
	 */
	@ApiField("contact")
	private String contact;

	/** 
	 * 投诉时间
	 */
	@ApiField("gmt_complain")
	private Date gmtComplain;

	/** 
	 * 过期时间
	 */
	@ApiField("gmt_overdue")
	private Date gmtOverdue;

	/** 
	 * 处理时间
	 */
	@ApiField("gmt_process")
	private Date gmtProcess;

	/** 
	 * 推送时间
	 */
	@ApiField("gmt_risk_finish_time")
	private Date gmtRiskFinishTime;

	/** 
	 * 投诉主表的主键id，查询详情时使用本id进行查询
	 */
	@ApiField("id")
	private Long id;

	/** 
	 * 投诉单中被投诉方的名称
	 */
	@ApiField("opposite_name")
	private String oppositeName;

	/** 
	 * 被投诉人pid
	 */
	@ApiField("opposite_pid")
	private String oppositePid;

	/** 
	 * 商家处理投诉结果码
	 */
	@ApiField("process_code")
	private String processCode;

	/** 
	 * 商家处理备注图片url列表
	 */
	@ApiListField("process_img_url_list")
	@ApiField("string")
	private List<String> processImgUrlList;

	/** 
	 * 商家处理结果码对应描述，与结果码一一对应
	 */
	@ApiField("process_message")
	private String processMessage;

	/** 
	 * 商家处理备注
	 */
	@ApiField("process_remark")
	private String processRemark;

	/** 
	 * 投诉状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 投诉单状态枚举值描述，与投诉单状态码一一对应
	 */
	@ApiField("status_description")
	private String statusDescription;

	/** 
	 * 投诉单号id
	 */
	@ApiField("task_id")
	private String taskId;

	/** 
	 * 投诉交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setComplainAmount(String complainAmount) {
		this.complainAmount = complainAmount;
	}
	public String getComplainAmount( ) {
		return this.complainAmount;
	}

	public void setComplainContent(String complainContent) {
		this.complainContent = complainContent;
	}
	public String getComplainContent( ) {
		return this.complainContent;
	}

	public void setComplaintTradeInfoList(List<ComplaintTradeInfo> complaintTradeInfoList) {
		this.complaintTradeInfoList = complaintTradeInfoList;
	}
	public List<ComplaintTradeInfo> getComplaintTradeInfoList( ) {
		return this.complaintTradeInfoList;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getContact( ) {
		return this.contact;
	}

	public void setGmtComplain(Date gmtComplain) {
		this.gmtComplain = gmtComplain;
	}
	public Date getGmtComplain( ) {
		return this.gmtComplain;
	}

	public void setGmtOverdue(Date gmtOverdue) {
		this.gmtOverdue = gmtOverdue;
	}
	public Date getGmtOverdue( ) {
		return this.gmtOverdue;
	}

	public void setGmtProcess(Date gmtProcess) {
		this.gmtProcess = gmtProcess;
	}
	public Date getGmtProcess( ) {
		return this.gmtProcess;
	}

	public void setGmtRiskFinishTime(Date gmtRiskFinishTime) {
		this.gmtRiskFinishTime = gmtRiskFinishTime;
	}
	public Date getGmtRiskFinishTime( ) {
		return this.gmtRiskFinishTime;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

	public void setOppositeName(String oppositeName) {
		this.oppositeName = oppositeName;
	}
	public String getOppositeName( ) {
		return this.oppositeName;
	}

	public void setOppositePid(String oppositePid) {
		this.oppositePid = oppositePid;
	}
	public String getOppositePid( ) {
		return this.oppositePid;
	}

	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}
	public String getProcessCode( ) {
		return this.processCode;
	}

	public void setProcessImgUrlList(List<String> processImgUrlList) {
		this.processImgUrlList = processImgUrlList;
	}
	public List<String> getProcessImgUrlList( ) {
		return this.processImgUrlList;
	}

	public void setProcessMessage(String processMessage) {
		this.processMessage = processMessage;
	}
	public String getProcessMessage( ) {
		return this.processMessage;
	}

	public void setProcessRemark(String processRemark) {
		this.processRemark = processRemark;
	}
	public String getProcessRemark( ) {
		return this.processRemark;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	public String getStatusDescription( ) {
		return this.statusDescription;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
