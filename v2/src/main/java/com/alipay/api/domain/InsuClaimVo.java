package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 理赔报案Vo
 *
 * @author auto create
 * @since 1.0, 2023-07-27 10:21:00
 */
public class InsuClaimVo extends AlipayObject {

	private static final long serialVersionUID = 7629482729163981953L;

	/**
	 * accident_date+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("accident_date")
	private String accidentDate;

	/**
	 * accident_reason+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("accident_reason")
	private String accidentReason;

	/**
	 * attachment_url+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiListField("attachment_url")
	@ApiField("string")
	private List<String> attachmentUrl;

	/**
	 * claim_attachment_vo+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("claim_attachment_vo")
	private InsuClaimAttachmentVo claimAttachmentVo;

	/**
	 * claim_flag+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("claim_flag")
	private String claimFlag;

	/**
	 * contact_email+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * employee_id+唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔时赋值+特殊说明(无)
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * insurant_birthday+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(如有)
	 */
	@ApiField("insurant_birthday")
	private String insurantBirthday;

	/**
	 * insurant_id_code+唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工提交理赔数据时赋值+特殊说明(无)
	 */
	@ApiField("insurant_id_code")
	private String insurantIdCode;

	/**
	 * insurant_id_type+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(如有)+员工申请理赔时赋值+特殊说明(如有)
	 */
	@ApiField("insurant_id_type")
	private String insurantIdType;

	/**
	 * insurant_name+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工理赔申请时赋值+特殊说明(无)
	 */
	@ApiField("insurant_name")
	private String insurantName;

	/**
	 * insurant_sex+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(有)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("insurant_sex")
	private String insurantSex;

	/**
	 * insurant_type+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(有)+员工理赔申请时需要选择与主被保人之间的关系+特殊说明(无)
	 */
	@ApiField("insurant_type")
	private String insurantType;

	/**
	 * is_submit+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值([{"value": "0","name": "未提交申请"},{"value": "1","name": "已经提交申请"},{"value": "2","name": "供应商已收到数据"}])+员工申请理赔+特殊说明(无)
	 */
	@ApiField("is_submit")
	private Long isSubmit;

	/**
	 * pay_account_bank+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("pay_account_bank")
	private String payAccountBank;

	/**
	 * pay_account_no+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("pay_account_no")
	private String payAccountNo;

	/**
	 * pay_name+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("pay_name")
	private String payName;

	/**
	 * pay_type+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * pay_type_code+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("pay_type_code")
	private String payTypeCode;

	/**
	 * relate_birth_date+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("relate_birth_date")
	private String relateBirthDate;

	/**
	 * relate_insurant_id_code+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("relate_insurant_id_code")
	private String relateInsurantIdCode;

	/**
	 * relate_insurant_id_type+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(有)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("relate_insurant_id_type")
	private String relateInsurantIdType;

	/**
	 * relate_insurant_name+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("relate_insurant_name")
	private String relateInsurantName;

	/**
	 * relate_sex+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(有)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("relate_sex")
	private String relateSex;

	/**
	 * insurant_birthday+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("report_amount")
	private String reportAmount;

	/**
	 * report_biz_no+唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+新增理赔时，根据规则生成渠道报案号+特殊说明(无)
	 */
	@ApiField("report_biz_no")
	private String reportBizNo;

	/**
	 * report_no+唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+供应商同步给商保系统+特殊说明(无)
	 */
	@ApiField("report_no")
	private String reportNo;

	/**
	 * source+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+生成理赔单时，默认赋值+特殊说明(默认值为alishangbao)
	 */
	@ApiField("source")
	private String source;

	/**
	 * status+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(有)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("status")
	private String status;

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

	public List<String> getAttachmentUrl() {
		return this.attachmentUrl;
	}
	public void setAttachmentUrl(List<String> attachmentUrl) {
		this.attachmentUrl = attachmentUrl;
	}

	public InsuClaimAttachmentVo getClaimAttachmentVo() {
		return this.claimAttachmentVo;
	}
	public void setClaimAttachmentVo(InsuClaimAttachmentVo claimAttachmentVo) {
		this.claimAttachmentVo = claimAttachmentVo;
	}

	public String getClaimFlag() {
		return this.claimFlag;
	}
	public void setClaimFlag(String claimFlag) {
		this.claimFlag = claimFlag;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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

	public Long getIsSubmit() {
		return this.isSubmit;
	}
	public void setIsSubmit(Long isSubmit) {
		this.isSubmit = isSubmit;
	}

	public String getPayAccountBank() {
		return this.payAccountBank;
	}
	public void setPayAccountBank(String payAccountBank) {
		this.payAccountBank = payAccountBank;
	}

	public String getPayAccountNo() {
		return this.payAccountNo;
	}
	public void setPayAccountNo(String payAccountNo) {
		this.payAccountNo = payAccountNo;
	}

	public String getPayName() {
		return this.payName;
	}
	public void setPayName(String payName) {
		this.payName = payName;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPayTypeCode() {
		return this.payTypeCode;
	}
	public void setPayTypeCode(String payTypeCode) {
		this.payTypeCode = payTypeCode;
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

	public String getReportAmount() {
		return this.reportAmount;
	}
	public void setReportAmount(String reportAmount) {
		this.reportAmount = reportAmount;
	}

	public String getReportBizNo() {
		return this.reportBizNo;
	}
	public void setReportBizNo(String reportBizNo) {
		this.reportBizNo = reportBizNo;
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

}
