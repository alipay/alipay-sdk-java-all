package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 法链系统 发起签约请求
 *
 * @author auto create
 * @since 1.0, 2022-05-19 14:43:28
 */
public class AlipayBossProdAntlegalchainOrderApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6415123749287385353L;

	/**
	 * 关联业务数据编号
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 关联业务名称
	 */
	@ApiField("biz_name")
	private String bizName;

	/**
	 * 业务数据请求唯一标识,唯一
	 */
	@ApiField("biz_unique_id")
	private String bizUniqueId;

	/**
	 * 我方经办人工号(内部buc工号)
	 */
	@ApiField("main_agent_buc_user_no")
	private String mainAgentBucUserNo;

	/**
	 * 我方经办人真实姓名
	 */
	@ApiField("main_agent_person_cert_name")
	private String mainAgentPersonCertName;

	/**
	 * 我方经办人证件上的身份证号
	 */
	@ApiField("main_agent_person_cert_no")
	private String mainAgentPersonCertNo;

	/**
	 * 我方签约公司信息：公司名称(必传)   公司支付宝账号(可传)   公司统一社会信用编码(可传)
	 */
	@ApiField("main_corp_entity")
	private CorpEntity mainCorpEntity;

	/**
	 * 我方通知人邮箱地址
	 */
	@ApiField("main_corp_notify_email")
	private String mainCorpNotifyEmail;

	/**
	 * 我方通知人姓名
	 */
	@ApiField("main_corp_notify_name")
	private String mainCorpNotifyName;

	/**
	 * 我方通知人手机号
	 */
	@ApiField("main_corp_notify_phone")
	private String mainCorpNotifyPhone;

	/**
	 * 签约文件对象信息列表
	 */
	@ApiListField("notary_file_list")
	@ApiField("notary_file_v_o")
	private List<NotaryFileVO> notaryFileList;

	/**
	 * 签约相对方企业信息:
对方公司支付宝账号（必传）
公司名称（必传）
统一社会信用编码（必传）
	 */
	@ApiField("rela_corp_entity")
	private CorpEntity relaCorpEntity;

	/**
	 * 对方通知人邮箱地址
	 */
	@ApiField("rela_corp_notify_email")
	private String relaCorpNotifyEmail;

	/**
	 * 对方通知人手机号
	 */
	@ApiField("rela_corp_notify_phone")
	private String relaCorpNotifyPhone;

	/**
	 * 请求来源系统英文名称
	 */
	@ApiField("request_app_name")
	private String requestAppName;

	/**
	 * 请求时间戳（请求时间的毫秒值）
	 */
	@ApiField("request_time_stamp")
	private String requestTimeStamp;

	/**
	 * 请求token
	 */
	@ApiField("request_token")
	private String requestToken;

	/**
	 * 签约顺序, 1表示我方先签约; 2表示对方先签约. （可传，若不传，默认值为1，即“我方先签约”）
	 */
	@ApiField("sign_order")
	private Long signOrder;

	/**
	 * 发起签约时间/我方签约时间
	 */
	@ApiField("submit_time")
	private Date submitTime;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizName() {
		return this.bizName;
	}
	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	public String getBizUniqueId() {
		return this.bizUniqueId;
	}
	public void setBizUniqueId(String bizUniqueId) {
		this.bizUniqueId = bizUniqueId;
	}

	public String getMainAgentBucUserNo() {
		return this.mainAgentBucUserNo;
	}
	public void setMainAgentBucUserNo(String mainAgentBucUserNo) {
		this.mainAgentBucUserNo = mainAgentBucUserNo;
	}

	public String getMainAgentPersonCertName() {
		return this.mainAgentPersonCertName;
	}
	public void setMainAgentPersonCertName(String mainAgentPersonCertName) {
		this.mainAgentPersonCertName = mainAgentPersonCertName;
	}

	public String getMainAgentPersonCertNo() {
		return this.mainAgentPersonCertNo;
	}
	public void setMainAgentPersonCertNo(String mainAgentPersonCertNo) {
		this.mainAgentPersonCertNo = mainAgentPersonCertNo;
	}

	public CorpEntity getMainCorpEntity() {
		return this.mainCorpEntity;
	}
	public void setMainCorpEntity(CorpEntity mainCorpEntity) {
		this.mainCorpEntity = mainCorpEntity;
	}

	public String getMainCorpNotifyEmail() {
		return this.mainCorpNotifyEmail;
	}
	public void setMainCorpNotifyEmail(String mainCorpNotifyEmail) {
		this.mainCorpNotifyEmail = mainCorpNotifyEmail;
	}

	public String getMainCorpNotifyName() {
		return this.mainCorpNotifyName;
	}
	public void setMainCorpNotifyName(String mainCorpNotifyName) {
		this.mainCorpNotifyName = mainCorpNotifyName;
	}

	public String getMainCorpNotifyPhone() {
		return this.mainCorpNotifyPhone;
	}
	public void setMainCorpNotifyPhone(String mainCorpNotifyPhone) {
		this.mainCorpNotifyPhone = mainCorpNotifyPhone;
	}

	public List<NotaryFileVO> getNotaryFileList() {
		return this.notaryFileList;
	}
	public void setNotaryFileList(List<NotaryFileVO> notaryFileList) {
		this.notaryFileList = notaryFileList;
	}

	public CorpEntity getRelaCorpEntity() {
		return this.relaCorpEntity;
	}
	public void setRelaCorpEntity(CorpEntity relaCorpEntity) {
		this.relaCorpEntity = relaCorpEntity;
	}

	public String getRelaCorpNotifyEmail() {
		return this.relaCorpNotifyEmail;
	}
	public void setRelaCorpNotifyEmail(String relaCorpNotifyEmail) {
		this.relaCorpNotifyEmail = relaCorpNotifyEmail;
	}

	public String getRelaCorpNotifyPhone() {
		return this.relaCorpNotifyPhone;
	}
	public void setRelaCorpNotifyPhone(String relaCorpNotifyPhone) {
		this.relaCorpNotifyPhone = relaCorpNotifyPhone;
	}

	public String getRequestAppName() {
		return this.requestAppName;
	}
	public void setRequestAppName(String requestAppName) {
		this.requestAppName = requestAppName;
	}

	public String getRequestTimeStamp() {
		return this.requestTimeStamp;
	}
	public void setRequestTimeStamp(String requestTimeStamp) {
		this.requestTimeStamp = requestTimeStamp;
	}

	public String getRequestToken() {
		return this.requestToken;
	}
	public void setRequestToken(String requestToken) {
		this.requestToken = requestToken;
	}

	public Long getSignOrder() {
		return this.signOrder;
	}
	public void setSignOrder(Long signOrder) {
		this.signOrder = signOrder;
	}

	public Date getSubmitTime() {
		return this.submitTime;
	}
	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

}
