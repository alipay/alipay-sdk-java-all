package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 更新报案申请信息接口
 *
 * @author auto create
 * @since 1.0, 2024-07-05 18:02:50
 */
public class AlipayInsSceneClaimApplyModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3855426965346643557L;

	/**
	 * 事故发生地址
	 */
	@ApiField("accident_address")
	private String accidentAddress;

	/**
	 * 事故描述
	 */
	@ApiField("accident_desc")
	private String accidentDesc;

	/**
	 * 事故时间
	 */
	@ApiField("accident_time")
	private Date accidentTime;

	/**
	 * 事故类型
	 */
	@ApiField("accident_type")
	private String accidentType;

	/**
	 * 事故详情
	 */
	@ApiField("accident_type_detail")
	private String accidentTypeDetail;

	/**
	 * 申请报案金额（单位：分）
	 */
	@ApiField("apply_amout")
	private Long applyAmout;

	/**
	 * 报案更新类型
	 */
	@ApiField("attachment_submit_type")
	private String attachmentSubmitType;

	/**
	 * 报案材料
	 */
	@ApiListField("attachments")
	@ApiField("ins_open_attachment_d_t_o")
	private List<InsOpenAttachmentDTO> attachments;

	/**
	 * 报案业务信息
	 */
	@ApiField("claim_report_biz_info")
	private String claimReportBizInfo;

	/**
	 * 报案号，取值来源于前置流程的接口返回
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	/**
	 * 外部业务单号，传业务的订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 合作商标识，取值由蚂蚁侧提供
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	public String getAccidentAddress() {
		return this.accidentAddress;
	}
	public void setAccidentAddress(String accidentAddress) {
		this.accidentAddress = accidentAddress;
	}

	public String getAccidentDesc() {
		return this.accidentDesc;
	}
	public void setAccidentDesc(String accidentDesc) {
		this.accidentDesc = accidentDesc;
	}

	public Date getAccidentTime() {
		return this.accidentTime;
	}
	public void setAccidentTime(Date accidentTime) {
		this.accidentTime = accidentTime;
	}

	public String getAccidentType() {
		return this.accidentType;
	}
	public void setAccidentType(String accidentType) {
		this.accidentType = accidentType;
	}

	public String getAccidentTypeDetail() {
		return this.accidentTypeDetail;
	}
	public void setAccidentTypeDetail(String accidentTypeDetail) {
		this.accidentTypeDetail = accidentTypeDetail;
	}

	public Long getApplyAmout() {
		return this.applyAmout;
	}
	public void setApplyAmout(Long applyAmout) {
		this.applyAmout = applyAmout;
	}

	public String getAttachmentSubmitType() {
		return this.attachmentSubmitType;
	}
	public void setAttachmentSubmitType(String attachmentSubmitType) {
		this.attachmentSubmitType = attachmentSubmitType;
	}

	public List<InsOpenAttachmentDTO> getAttachments() {
		return this.attachments;
	}
	public void setAttachments(List<InsOpenAttachmentDTO> attachments) {
		this.attachments = attachments;
	}

	public String getClaimReportBizInfo() {
		return this.claimReportBizInfo;
	}
	public void setClaimReportBizInfo(String claimReportBizInfo) {
		this.claimReportBizInfo = claimReportBizInfo;
	}

	public String getClaimReportNo() {
		return this.claimReportNo;
	}
	public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

}
