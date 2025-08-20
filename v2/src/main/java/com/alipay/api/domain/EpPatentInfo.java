package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业专利明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 11:27:45
 */
public class EpPatentInfo extends AlipayObject {

	private static final long serialVersionUID = 2849879554264621339L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 代理人
	 */
	@ApiField("agent_person")
	private String agentPerson;

	/**
	 * 申请日
	 */
	@ApiField("application_day")
	private String applicationDay;

	/**
	 * 申请号
	 */
	@ApiField("application_number")
	private String applicationNumber;

	/**
	 * 发明（设计）名称
	 */
	@ApiField("fmsjmc")
	private String fmsjmc;

	/**
	 * 国际分类
	 */
	@ApiField("international_classification")
	private String internationalClassification;

	/**
	 * 发明人
	 */
	@ApiField("inventor")
	private String inventor;

	/**
	 * 解密公告日
	 */
	@ApiField("jmggr")
	private String jmggr;

	/**
	 * Locarno分类
	 */
	@ApiField("locarnofl")
	private String locarnofl;

	/**
	 * 公告日
	 */
	@ApiField("notice_date")
	private String noticeDate;

	/**
	 * 专利类型
	 */
	@ApiField("patent_type")
	private String patentType;

	/**
	 * PCT国际申请公布号
	 */
	@ApiField("pctgbsj")
	private String pctgbsj;

	/**
	 * PCT进入国家阶段日
	 */
	@ApiField("pctjrgjjdr")
	private String pctjrgjjdr;

	/**
	 * PCT国际申请号
	 */
	@ApiField("pctsqsj")
	private String pctsqsj;

	/**
	 * 申请人
	 */
	@ApiField("proposer")
	private String proposer;

	/**
	 * 申请公布日
	 */
	@ApiField("published_application_day")
	private String publishedApplicationDay;

	/**
	 * 申请公布号
	 */
	@ApiField("published_application_number")
	private String publishedApplicationNumber;

	/**
	 * 审定公告日
	 */
	@ApiField("sdggr")
	private String sdggr;

	/**
	 * 授权公告号
	 */
	@ApiField("sqggh")
	private String sqggh;

	/**
	 * 授权公告日
	 */
	@ApiField("sqggr")
	private String sqggr;

	/**
	 * 摘要
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 优先权
	 */
	@ApiField("yxq")
	private String yxq;

	/**
	 * 专利代理机构
	 */
	@ApiField("zldljg")
	private String zldljg;

	/**
	 * 专利权人
	 */
	@ApiField("zlqr")
	private String zlqr;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAgentPerson() {
		return this.agentPerson;
	}
	public void setAgentPerson(String agentPerson) {
		this.agentPerson = agentPerson;
	}

	public String getApplicationDay() {
		return this.applicationDay;
	}
	public void setApplicationDay(String applicationDay) {
		this.applicationDay = applicationDay;
	}

	public String getApplicationNumber() {
		return this.applicationNumber;
	}
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public String getFmsjmc() {
		return this.fmsjmc;
	}
	public void setFmsjmc(String fmsjmc) {
		this.fmsjmc = fmsjmc;
	}

	public String getInternationalClassification() {
		return this.internationalClassification;
	}
	public void setInternationalClassification(String internationalClassification) {
		this.internationalClassification = internationalClassification;
	}

	public String getInventor() {
		return this.inventor;
	}
	public void setInventor(String inventor) {
		this.inventor = inventor;
	}

	public String getJmggr() {
		return this.jmggr;
	}
	public void setJmggr(String jmggr) {
		this.jmggr = jmggr;
	}

	public String getLocarnofl() {
		return this.locarnofl;
	}
	public void setLocarnofl(String locarnofl) {
		this.locarnofl = locarnofl;
	}

	public String getNoticeDate() {
		return this.noticeDate;
	}
	public void setNoticeDate(String noticeDate) {
		this.noticeDate = noticeDate;
	}

	public String getPatentType() {
		return this.patentType;
	}
	public void setPatentType(String patentType) {
		this.patentType = patentType;
	}

	public String getPctgbsj() {
		return this.pctgbsj;
	}
	public void setPctgbsj(String pctgbsj) {
		this.pctgbsj = pctgbsj;
	}

	public String getPctjrgjjdr() {
		return this.pctjrgjjdr;
	}
	public void setPctjrgjjdr(String pctjrgjjdr) {
		this.pctjrgjjdr = pctjrgjjdr;
	}

	public String getPctsqsj() {
		return this.pctsqsj;
	}
	public void setPctsqsj(String pctsqsj) {
		this.pctsqsj = pctsqsj;
	}

	public String getProposer() {
		return this.proposer;
	}
	public void setProposer(String proposer) {
		this.proposer = proposer;
	}

	public String getPublishedApplicationDay() {
		return this.publishedApplicationDay;
	}
	public void setPublishedApplicationDay(String publishedApplicationDay) {
		this.publishedApplicationDay = publishedApplicationDay;
	}

	public String getPublishedApplicationNumber() {
		return this.publishedApplicationNumber;
	}
	public void setPublishedApplicationNumber(String publishedApplicationNumber) {
		this.publishedApplicationNumber = publishedApplicationNumber;
	}

	public String getSdggr() {
		return this.sdggr;
	}
	public void setSdggr(String sdggr) {
		this.sdggr = sdggr;
	}

	public String getSqggh() {
		return this.sqggh;
	}
	public void setSqggh(String sqggh) {
		this.sqggh = sqggh;
	}

	public String getSqggr() {
		return this.sqggr;
	}
	public void setSqggr(String sqggr) {
		this.sqggr = sqggr;
	}

	public String getSummary() {
		return this.summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getYxq() {
		return this.yxq;
	}
	public void setYxq(String yxq) {
		this.yxq = yxq;
	}

	public String getZldljg() {
		return this.zldljg;
	}
	public void setZldljg(String zldljg) {
		this.zldljg = zldljg;
	}

	public String getZlqr() {
		return this.zlqr;
	}
	public void setZlqr(String zlqr) {
		this.zlqr = zlqr;
	}

}
