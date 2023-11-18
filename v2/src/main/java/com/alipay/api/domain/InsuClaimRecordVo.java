package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 理赔进度Vo
 *
 * @author auto create
 * @since 1.0, 2023-05-18 13:16:19
 */
public class InsuClaimRecordVo extends AlipayObject {

	private static final long serialVersionUID = 2578561935834134737L;

	/**
	 * accident_date+不唯一+供应商同步理赔报案进度+枚举值(无)+用户申请理赔时赋值+特殊说明(无)
	 */
	@ApiField("accident_date")
	private String accidentDate;

	/**
	 * accident_reason+不唯一+供应商同步理赔报案进度+枚举值(无)+供应商同步时赋值+特殊说明(无)
	 */
	@ApiField("accident_reason")
	private String accidentReason;

	/**
	 * claim_no+不唯一+供应商同步理赔报案进度+枚举值(无)+用户申请理赔时赋值+特殊说明(无)
	 */
	@ApiField("claim_no")
	private String claimNo;

	/**
	 * close_date+不唯一+供应商同步理赔报案进度+枚举值(无)+供应商同步时赋值+特殊说明(无)
	 */
	@ApiField("close_date")
	private String closeDate;

	/**
	 * err_code+不唯一+供应商同步理赔报案进度+枚举值(无)+供应商同步时赋值+特殊说明(无)
	 */
	@ApiField("err_code")
	private String errCode;

	/**
	 * err_msg+不唯一+供应商同步理赔报案进度+枚举值(无)+供应商同步时赋值+特殊说明(无)
	 */
	@ApiField("err_msg")
	private String errMsg;

	/**
	 * fallback_date+不唯一+供应商同步理赔报案进度+枚举值(无)+供应商同步时赋值+特殊说明(无)
	 */
	@ApiField("fallback_date")
	private String fallbackDate;

	/**
	 * fallback_reason+不唯一+供应商同步理赔报案进度+枚举值(无)+供应商同步时赋值+特殊说明(无)
	 */
	@ApiField("fallback_reason")
	private String fallbackReason;

	/**
	 * insurant_birthday+不唯一+供应商同步理赔报案进度+枚举值(无)+员工申请理赔+特殊说明(如有)
	 */
	@ApiField("insurant_birthday")
	private String insurantBirthday;

	/**
	 * insurant_id_code+唯一+供应商同步理赔报案进度+枚举值(无)+员工提交理赔数据时赋值+特殊说明(无)
	 */
	@ApiField("insurant_id_code")
	private String insurantIdCode;

	/**
	 * insurant_id_type+不唯一+供应商同步理赔报案进度+枚举值(如有)+员工申请理赔时赋值+特殊说明(如有)
	 */
	@ApiField("insurant_id_type")
	private String insurantIdType;

	/**
	 * insurant_name+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工理赔申请时赋值+特殊说明(无)
	 */
	@ApiField("insurant_name")
	private String insurantName;

	/**
	 * insurant_sex+不唯一+供应商同步理赔报案进度+枚举值(有)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("insurant_sex")
	private String insurantSex;

	/**
	 * insurant_type+不唯一+供应商同步理赔报案进度+枚举值(有)+员工理赔申请时需要选择与主被保人之间的关系+特殊说明(无)
	 */
	@ApiField("insurant_type")
	private String insurantType;

	/**
	 * insure_name+不唯一+供应商同步理赔报案进度+枚举值(无)+供应商同步时赋值+特殊说明(无)
	 */
	@ApiField("insure_name")
	private String insureName;

	/**
	 * is_submit+不唯一+供应商同步理赔报案进度+枚举值([{"value": "0","name": "未提交申请"},{"value": "1","name": "已经提交申请"},{"value": "2","name": "供应商已收到数据"}])+员工申请理赔+特殊说明(无)
	 */
	@ApiField("is_submit")
	private Long isSubmit;

	/**
	 * notice_download_url+不唯一+供应商同步理赔报案进度+枚举值(无)+供应商同步时赋值+特殊说明(无)
	 */
	@ApiField("notice_download_url")
	private String noticeDownloadUrl;

	/**
	 * paid_amount+不唯一+供应商同步理赔报案进度+枚举值(无)+供应商同步时赋值+特殊说明(无)
	 */
	@ApiField("paid_amount")
	private String paidAmount;

	/**
	 * refuse_mark+不唯一+供应商同步理赔报案进度+枚举值(无)+供应商同步时赋值+特殊说明(无)
	 */
	@ApiField("refuse_mark")
	private String refuseMark;

	/**
	 * refuse_reason+不唯一+供应商同步理赔报案进度+枚举值(无)+供应商同步时赋值+特殊说明(无)
	 */
	@ApiField("refuse_reason")
	private String refuseReason;

	/**
	 * register_date+不唯一+供应商同步理赔报案进度+枚举值(无)+用户申请理赔时赋值+特殊说明(无)
	 */
	@ApiField("register_date")
	private String registerDate;

	/**
	 * relate_birth_date+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("relate_birth_date")
	private String relateBirthDate;

	/**
	 * relate_insurant_id_code+不唯一+供应商同步理赔报案进度+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("relate_insurant_id_code")
	private String relateInsurantIdCode;

	/**
	 * relate_insurant_id_type+不唯一+供应商同步理赔报案进度+枚举值(有)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("relate_insurant_id_type")
	private String relateInsurantIdType;

	/**
	 * relate_insurant_name+不唯一+供应商同步理赔报案进度+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("relate_insurant_name")
	private String relateInsurantName;

	/**
	 * relate_sex+不唯一+供应商同步理赔报案进度+枚举值(有)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("relate_sex")
	private String relateSex;

	/**
	 * report_biz_no+唯一+供应商同步理赔报案进度+枚举值(无)+新增理赔时，根据规则生成渠道报案号+特殊说明(无)
	 */
	@ApiField("report_biz_no")
	private String reportBizNo;

	/**
	 * report_date+不唯一+供应商同步理赔报案进度+枚举值(无)+用户申请理赔时赋值+特殊说明(无)
	 */
	@ApiField("report_date")
	private String reportDate;

	/**
	 * report_no+唯一+供应商同步理赔报案进度+枚举值(无)+供应商同步给商保系统+特殊说明(无)
	 */
	@ApiField("report_no")
	private String reportNo;

	/**
	 * source+不唯一+供应商同步理赔报案进度+枚举值(无)+生成理赔单时，默认赋值+特殊说明(默认值为alishangbao)
	 */
	@ApiField("source")
	private String source;

	/**
	 * status+不唯一+供应商同步理赔报案进度+枚举值(有)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("status")
	private String status;

	/**
	 * supplier_id+不唯一+供应商同步理赔报案进度+枚举值(无)+用户申请理赔时赋值+特殊说明(无)
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * method+不唯一+供应商同步理赔报案进度+枚举值(无)+供应商根据同步类型赋值+特殊说明(无)
	 */
	@ApiField("sync_method")
	private String syncMethod;

	public String getAccidentDate() {
		return this.accidentDate;
	}
	public void setAccidentDate(String accidentDate) {
		this.accidentDate = accidentDate;
	}

	public String getAccidentReason() {
		return this.accidentReason;
	}
	public void setAccidentReason(String accidentReason) {
		this.accidentReason = accidentReason;
	}

	public String getClaimNo() {
		return this.claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getCloseDate() {
		return this.closeDate;
	}
	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}

	public String getErrCode() {
		return this.errCode;
	}
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return this.errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getFallbackDate() {
		return this.fallbackDate;
	}
	public void setFallbackDate(String fallbackDate) {
		this.fallbackDate = fallbackDate;
	}

	public String getFallbackReason() {
		return this.fallbackReason;
	}
	public void setFallbackReason(String fallbackReason) {
		this.fallbackReason = fallbackReason;
	}

	public String getInsurantBirthday() {
		return this.insurantBirthday;
	}
	public void setInsurantBirthday(String insurantBirthday) {
		this.insurantBirthday = insurantBirthday;
	}

	public String getInsurantIdCode() {
		return this.insurantIdCode;
	}
	public void setInsurantIdCode(String insurantIdCode) {
		this.insurantIdCode = insurantIdCode;
	}

	public String getInsurantIdType() {
		return this.insurantIdType;
	}
	public void setInsurantIdType(String insurantIdType) {
		this.insurantIdType = insurantIdType;
	}

	public String getInsurantName() {
		return this.insurantName;
	}
	public void setInsurantName(String insurantName) {
		this.insurantName = insurantName;
	}

	public String getInsurantSex() {
		return this.insurantSex;
	}
	public void setInsurantSex(String insurantSex) {
		this.insurantSex = insurantSex;
	}

	public String getInsurantType() {
		return this.insurantType;
	}
	public void setInsurantType(String insurantType) {
		this.insurantType = insurantType;
	}

	public String getInsureName() {
		return this.insureName;
	}
	public void setInsureName(String insureName) {
		this.insureName = insureName;
	}

	public Long getIsSubmit() {
		return this.isSubmit;
	}
	public void setIsSubmit(Long isSubmit) {
		this.isSubmit = isSubmit;
	}

	public String getNoticeDownloadUrl() {
		return this.noticeDownloadUrl;
	}
	public void setNoticeDownloadUrl(String noticeDownloadUrl) {
		this.noticeDownloadUrl = noticeDownloadUrl;
	}

	public String getPaidAmount() {
		return this.paidAmount;
	}
	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}

	public String getRefuseMark() {
		return this.refuseMark;
	}
	public void setRefuseMark(String refuseMark) {
		this.refuseMark = refuseMark;
	}

	public String getRefuseReason() {
		return this.refuseReason;
	}
	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	public String getRegisterDate() {
		return this.registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getRelateBirthDate() {
		return this.relateBirthDate;
	}
	public void setRelateBirthDate(String relateBirthDate) {
		this.relateBirthDate = relateBirthDate;
	}

	public String getRelateInsurantIdCode() {
		return this.relateInsurantIdCode;
	}
	public void setRelateInsurantIdCode(String relateInsurantIdCode) {
		this.relateInsurantIdCode = relateInsurantIdCode;
	}

	public String getRelateInsurantIdType() {
		return this.relateInsurantIdType;
	}
	public void setRelateInsurantIdType(String relateInsurantIdType) {
		this.relateInsurantIdType = relateInsurantIdType;
	}

	public String getRelateInsurantName() {
		return this.relateInsurantName;
	}
	public void setRelateInsurantName(String relateInsurantName) {
		this.relateInsurantName = relateInsurantName;
	}

	public String getRelateSex() {
		return this.relateSex;
	}
	public void setRelateSex(String relateSex) {
		this.relateSex = relateSex;
	}

	public String getReportBizNo() {
		return this.reportBizNo;
	}
	public void setReportBizNo(String reportBizNo) {
		this.reportBizNo = reportBizNo;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getReportNo() {
		return this.reportNo;
	}
	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSyncMethod() {
		return this.syncMethod;
	}
	public void setSyncMethod(String syncMethod) {
		this.syncMethod = syncMethod;
	}

}
