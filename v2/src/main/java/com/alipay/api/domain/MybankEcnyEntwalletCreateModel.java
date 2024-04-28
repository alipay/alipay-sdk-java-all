package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 数字人民币对公钱包开立
 *
 * @author auto create
 * @since 1.0, 2021-12-16 15:27:32
 */
public class MybankEcnyEntwalletCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3211264985647128188L;

	/**
	 * 实控人信息
	 */
	@ApiField("act_ctl_info")
	private UserBaseInfo actCtlInfo;

	/**
	 * 经办人/单位用户信息(经办人手机号和邮箱必填，便于接收开户意核实和开户结果的通知)
	 */
	@ApiField("applicant_info")
	private UserBaseInfo applicantInfo;

	/**
	 * 受益人经常居住地或者工作单位地址
	 */
	@ApiField("beneficiary_address")
	private EcnyAddressInfo beneficiaryAddress;

	/**
	 * 受益人信息
(名称，证件类型，证件号码，证件有效期截止日期必填)
	 */
	@ApiField("beneficiary_info")
	private UserBaseInfo beneficiaryInfo;

	/**
	 * 单位联系人用户信息
	 */
	@ApiField("contact_info")
	private UserBaseInfo contactInfo;

	/**
	 * 单位经营地信息
	 */
	@ApiField("ent_biz_addr")
	private EcnyAddressInfo entBizAddr;

	/**
	 * 经营范围
	 */
	@ApiField("ent_biz_scope")
	private String entBizScope;

	/**
	 * 单位证件有效期截止日期
	 */
	@ApiField("ent_cert_date_invalid")
	private String entCertDateInvalid;

	/**
	 * 单位证件有效期起始日期
	 */
	@ApiField("ent_cert_date_valid")
	private String entCertDateValid;

	/**
	 * 单位证件影印件，值为文件上传接口返回的文件ID
	 */
	@ApiField("ent_cert_file")
	private String entCertFile;

	/**
	 * 单位证件号
	 */
	@ApiField("ent_cert_no")
	private String entCertNo;

	/**
	 * 单位证件类型：
IT11	营业执照
IT12	组织机构代码
IT13	税务登记证
IT14	统一社会信用代码证
IT15	事业单位法人证书
IT16	社会团体法人登记证书
IT17	民办非企业单位登记证书
IT99	其他
	 */
	@ApiField("ent_cert_type")
	private String entCertType;

	/**
	 * 行业分类，参见https://gw.alipayobjects.com/os/bmw-prod/b28421ce-0ddf-422f-9e9c-c2c3c7f30c73.xlsx
	 */
	@ApiField("ent_mcc")
	private String entMcc;

	/**
	 * 单位名称
	 */
	@ApiField("ent_name")
	private String entName;

	/**
	 * 注册资本
	 */
	@ApiField("ent_reg_cap")
	private String entRegCap;

	/**
	 * 单位税务登记证编号
	 */
	@ApiField("ent_tax_id")
	private String entTaxId;

	/**
	 * 单位类型：
01	企业法人
02	非企业法人
03	机关
04	实施预算管理的事业单位
05	非预算管理的事业单位
06	军队，武警团级（含）及以上单位以及分散执勤的支（分）队
07	社会团体
08	民办非企业组织
09	外地常设机构
10	外国驻华机构
11	个人工商户
12	居民委员会、村民委员会、社区委员会
13	独立核算的附属机构
14	其他机构
	 */
	@ApiField("ent_type")
	private String entType;

	/**
	 * 单位类型描述：
01	企业法人
02	非企业法人
03	机关
04	实施预算管理的事业单位
05	非预算管理的事业单位
06	军队，武警团级（含）及以上单位以及分散执勤的支（分）队
07	社会团体
08	民办非企业组织
09	外地常设机构
10	外国驻华机构
11	个人工商户
12	居民委员会、村民委员会、社区委员会
13	独立核算的附属机构
14	其他机构
	 */
	@ApiField("ent_type_desc")
	private String entTypeDesc;

	/**
	 * 法定代表人/单位负责人用户信息
(姓名，证件类型，证件号码，证件影印件，证件有效期截止日期必填)
	 */
	@ApiField("legal_rep_info")
	private UserBaseInfo legalRepInfo;

	/**
	 * 其他证件影印件
	 */
	@ApiListField("other_cert_files")
	@ApiField("string")
	private List<String> otherCertFiles;

	/**
	 * 其他证件类型，固定：IT99-其他
	 */
	@ApiField("other_cert_type")
	private String otherCertType;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 1. IT_BANK:企业网银 — 通过2.5层机构的企业网银客户端发起的开户申请 
2. EXTERNAL_ONLINE:外部线上平台 — 2.5层机构向其用户提供的开户申请平台/网站，包括：公众号、商户后台、H5页面、2.5层平台APP内等渠道 
3. OFFLINE:线下收集 — 机构人员线下收集用户开户材料并发起的开户申请 
4. OTHER:其他 — 其他
	 */
	@ApiField("source_channel")
	private String sourceChannel;

	/**
	 * 上级法人单位信息
	 */
	@ApiField("super_legal_rep_info")
	private UserBaseInfo superLegalRepInfo;

	public UserBaseInfo getActCtlInfo() {
		return this.actCtlInfo;
	}
	public void setActCtlInfo(UserBaseInfo actCtlInfo) {
		this.actCtlInfo = actCtlInfo;
	}

	public UserBaseInfo getApplicantInfo() {
		return this.applicantInfo;
	}
	public void setApplicantInfo(UserBaseInfo applicantInfo) {
		this.applicantInfo = applicantInfo;
	}

	public EcnyAddressInfo getBeneficiaryAddress() {
		return this.beneficiaryAddress;
	}
	public void setBeneficiaryAddress(EcnyAddressInfo beneficiaryAddress) {
		this.beneficiaryAddress = beneficiaryAddress;
	}

	public UserBaseInfo getBeneficiaryInfo() {
		return this.beneficiaryInfo;
	}
	public void setBeneficiaryInfo(UserBaseInfo beneficiaryInfo) {
		this.beneficiaryInfo = beneficiaryInfo;
	}

	public UserBaseInfo getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(UserBaseInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public EcnyAddressInfo getEntBizAddr() {
		return this.entBizAddr;
	}
	public void setEntBizAddr(EcnyAddressInfo entBizAddr) {
		this.entBizAddr = entBizAddr;
	}

	public String getEntBizScope() {
		return this.entBizScope;
	}
	public void setEntBizScope(String entBizScope) {
		this.entBizScope = entBizScope;
	}

	public String getEntCertDateInvalid() {
		return this.entCertDateInvalid;
	}
	public void setEntCertDateInvalid(String entCertDateInvalid) {
		this.entCertDateInvalid = entCertDateInvalid;
	}

	public String getEntCertDateValid() {
		return this.entCertDateValid;
	}
	public void setEntCertDateValid(String entCertDateValid) {
		this.entCertDateValid = entCertDateValid;
	}

	public String getEntCertFile() {
		return this.entCertFile;
	}
	public void setEntCertFile(String entCertFile) {
		this.entCertFile = entCertFile;
	}

	public String getEntCertNo() {
		return this.entCertNo;
	}
	public void setEntCertNo(String entCertNo) {
		this.entCertNo = entCertNo;
	}

	public String getEntCertType() {
		return this.entCertType;
	}
	public void setEntCertType(String entCertType) {
		this.entCertType = entCertType;
	}

	public String getEntMcc() {
		return this.entMcc;
	}
	public void setEntMcc(String entMcc) {
		this.entMcc = entMcc;
	}

	public String getEntName() {
		return this.entName;
	}
	public void setEntName(String entName) {
		this.entName = entName;
	}

	public String getEntRegCap() {
		return this.entRegCap;
	}
	public void setEntRegCap(String entRegCap) {
		this.entRegCap = entRegCap;
	}

	public String getEntTaxId() {
		return this.entTaxId;
	}
	public void setEntTaxId(String entTaxId) {
		this.entTaxId = entTaxId;
	}

	public String getEntType() {
		return this.entType;
	}
	public void setEntType(String entType) {
		this.entType = entType;
	}

	public String getEntTypeDesc() {
		return this.entTypeDesc;
	}
	public void setEntTypeDesc(String entTypeDesc) {
		this.entTypeDesc = entTypeDesc;
	}

	public UserBaseInfo getLegalRepInfo() {
		return this.legalRepInfo;
	}
	public void setLegalRepInfo(UserBaseInfo legalRepInfo) {
		this.legalRepInfo = legalRepInfo;
	}

	public List<String> getOtherCertFiles() {
		return this.otherCertFiles;
	}
	public void setOtherCertFiles(List<String> otherCertFiles) {
		this.otherCertFiles = otherCertFiles;
	}

	public String getOtherCertType() {
		return this.otherCertType;
	}
	public void setOtherCertType(String otherCertType) {
		this.otherCertType = otherCertType;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getSourceChannel() {
		return this.sourceChannel;
	}
	public void setSourceChannel(String sourceChannel) {
		this.sourceChannel = sourceChannel;
	}

	public UserBaseInfo getSuperLegalRepInfo() {
		return this.superLegalRepInfo;
	}
	public void setSuperLegalRepInfo(UserBaseInfo superLegalRepInfo) {
		this.superLegalRepInfo = superLegalRepInfo;
	}

}
