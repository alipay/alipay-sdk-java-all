package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 漏洞详情
 *
 * @author auto create
 * @since 1.0, 2018-11-25 14:36:58
 */
public class VulInfo extends AlipayObject {

	private static final long serialVersionUID = 1261178743735348596L;

	/**
	 * 漏洞附件下载链接
	 */
	@ApiField("attachment")
	private String attachment;

	/**
	 * 漏洞所属业务
	 */
	@ApiField("business")
	private String business;

	/**
	 * 漏洞安全币奖励
	 */
	@ApiField("coin")
	private Long coin;

	/**
	 * 漏洞所属公司
	 */
	@ApiField("company")
	private Long company;

	/**
	 * 确认漏洞等级
	 */
	@ApiField("confirm_level")
	private Long confirmLevel;

	/**
	 * 漏洞确认时间
	 */
	@ApiField("confirm_time")
	private String confirmTime;

	/**
	 * 漏洞详情
	 */
	@ApiField("detail")
	private String detail;

	/**
	 * 漏洞修复时间
	 */
	@ApiField("fix_time")
	private String fixTime;

	/**
	 * 用户上报等级
	 */
	@ApiField("level")
	private Long level;

	/**
	 * 白帽子提交漏洞时填写的手机号
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * 漏洞名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 白帽子昵称
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 漏洞被驳回原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/**
	 * 漏洞评分奖励
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 漏洞状态
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 漏洞提交时间
	 */
	@ApiField("submit_time")
	private String submitTime;

	/**
	 * 一级类型ID
	 */
	@ApiField("type_sub_first_id")
	private Long typeSubFirstId;

	/**
	 * 一级漏洞类型名称
	 */
	@ApiField("type_sub_first_name")
	private String typeSubFirstName;

	/**
	 * 二级类型ID
	 */
	@ApiField("type_sub_second_id")
	private Long typeSubSecondId;

	/**
	 * 二级漏洞类型名称
	 */
	@ApiField("type_sub_second_name")
	private String typeSubSecondName;

	/**
	 * 漏洞 URL
	 */
	@ApiField("url")
	private String url;

	/**
	 * 漏洞id
	 */
	@ApiField("vul_id")
	private Long vulId;

	public String getAttachment() {
		return this.attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getBusiness() {
		return this.business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}

	public Long getCoin() {
		return this.coin;
	}
	public void setCoin(Long coin) {
		this.coin = coin;
	}

	public Long getCompany() {
		return this.company;
	}
	public void setCompany(Long company) {
		this.company = company;
	}

	public Long getConfirmLevel() {
		return this.confirmLevel;
	}
	public void setConfirmLevel(Long confirmLevel) {
		this.confirmLevel = confirmLevel;
	}

	public String getConfirmTime() {
		return this.confirmTime;
	}
	public void setConfirmTime(String confirmTime) {
		this.confirmTime = confirmTime;
	}

	public String getDetail() {
		return this.detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getFixTime() {
		return this.fixTime;
	}
	public void setFixTime(String fixTime) {
		this.fixTime = fixTime;
	}

	public Long getLevel() {
		return this.level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getSubmitTime() {
		return this.submitTime;
	}
	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}

	public Long getTypeSubFirstId() {
		return this.typeSubFirstId;
	}
	public void setTypeSubFirstId(Long typeSubFirstId) {
		this.typeSubFirstId = typeSubFirstId;
	}

	public String getTypeSubFirstName() {
		return this.typeSubFirstName;
	}
	public void setTypeSubFirstName(String typeSubFirstName) {
		this.typeSubFirstName = typeSubFirstName;
	}

	public Long getTypeSubSecondId() {
		return this.typeSubSecondId;
	}
	public void setTypeSubSecondId(Long typeSubSecondId) {
		this.typeSubSecondId = typeSubSecondId;
	}

	public String getTypeSubSecondName() {
		return this.typeSubSecondName;
	}
	public void setTypeSubSecondName(String typeSubSecondName) {
		this.typeSubSecondName = typeSubSecondName;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public Long getVulId() {
		return this.vulId;
	}
	public void setVulId(Long vulId) {
		this.vulId = vulId;
	}

}
