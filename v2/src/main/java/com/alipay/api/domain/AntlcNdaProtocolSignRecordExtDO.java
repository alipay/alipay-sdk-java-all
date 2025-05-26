package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * NDA协议签约记录
 *
 * @author auto create
 * @since 1.0, 2023-02-28 15:41:47
 */
public class AntlcNdaProtocolSignRecordExtDO extends AlipayObject {

	private static final long serialVersionUID = 7341239729597954666L;

	/**
	 * 上链存证实例ID
	 */
	@ApiField("antlc_certificate_key")
	private String antlcCertificateKey;

	/**
	 * 是否可催签，true：是；false：否
	 */
	@ApiField("expedite_status")
	private Boolean expediteStatus;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 主键
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 协议实例id
	 */
	@ApiField("instl_id")
	private Long instlId;

	/**
	 * 最后一次催签时间
	 */
	@ApiField("last_expedite_time")
	private Date lastExpediteTime;

	/**
	 * 签约模式，FACE：人脸识别；PASS：直接通过；SIGN：手绘签名
	 */
	@ApiField("sign_mode")
	private String signMode;

	/**
	 * 签约状态:SIGNED：已签约；SENT：未签约；FAILED：初始化失败；INIT：初始化中;SIGNING:签约中
	 */
	@ApiField("sign_status")
	private String signStatus;

	/**
	 * 签约时间
	 */
	@ApiField("sign_time")
	private Date signTime;

	/**
	 * 签约人2088账号
	 */
	@ApiField("signator_2088")
	private String signator2088;

	/**
	 * 协议签约人公司钉钉id
	 */
	@ApiField("signator_corp_id")
	private String signatorCorpId;

	/**
	 * 协议签约员工工号
	 */
	@ApiField("signator_staff_id")
	private String signatorStaffId;

	/**
	 * 协议签约员工名称
	 */
	@ApiField("signator_staff_name")
	private String signatorStaffName;

	/**
	 * 协议签约人员unionId
	 */
	@ApiField("signator_staff_union_id")
	private String signatorStaffUnionId;

	/**
	 * 协议存放地址
	 */
	@ApiField("signed_file_addr")
	private String signedFileAddr;

	/**
	 * 本次上链区块交易哈希
	 */
	@ApiField("tx_hash_code")
	private String txHashCode;

	public String getAntlcCertificateKey() {
		return this.antlcCertificateKey;
	}
	public void setAntlcCertificateKey(String antlcCertificateKey) {
		this.antlcCertificateKey = antlcCertificateKey;
	}

	public Boolean getExpediteStatus() {
		return this.expediteStatus;
	}
	public void setExpediteStatus(Boolean expediteStatus) {
		this.expediteStatus = expediteStatus;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getInstlId() {
		return this.instlId;
	}
	public void setInstlId(Long instlId) {
		this.instlId = instlId;
	}

	public Date getLastExpediteTime() {
		return this.lastExpediteTime;
	}
	public void setLastExpediteTime(Date lastExpediteTime) {
		this.lastExpediteTime = lastExpediteTime;
	}

	public String getSignMode() {
		return this.signMode;
	}
	public void setSignMode(String signMode) {
		this.signMode = signMode;
	}

	public String getSignStatus() {
		return this.signStatus;
	}
	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}

	public Date getSignTime() {
		return this.signTime;
	}
	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public String getSignator2088() {
		return this.signator2088;
	}
	public void setSignator2088(String signator2088) {
		this.signator2088 = signator2088;
	}

	public String getSignatorCorpId() {
		return this.signatorCorpId;
	}
	public void setSignatorCorpId(String signatorCorpId) {
		this.signatorCorpId = signatorCorpId;
	}

	public String getSignatorStaffId() {
		return this.signatorStaffId;
	}
	public void setSignatorStaffId(String signatorStaffId) {
		this.signatorStaffId = signatorStaffId;
	}

	public String getSignatorStaffName() {
		return this.signatorStaffName;
	}
	public void setSignatorStaffName(String signatorStaffName) {
		this.signatorStaffName = signatorStaffName;
	}

	public String getSignatorStaffUnionId() {
		return this.signatorStaffUnionId;
	}
	public void setSignatorStaffUnionId(String signatorStaffUnionId) {
		this.signatorStaffUnionId = signatorStaffUnionId;
	}

	public String getSignedFileAddr() {
		return this.signedFileAddr;
	}
	public void setSignedFileAddr(String signedFileAddr) {
		this.signedFileAddr = signedFileAddr;
	}

	public String getTxHashCode() {
		return this.txHashCode;
	}
	public void setTxHashCode(String txHashCode) {
		this.txHashCode = txHashCode;
	}

}
