package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业著作权明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:18:49
 */
public class EpCopyrightInfo extends AlipayObject {

	private static final long serialVersionUID = 4367881635742454851L;

	/**
	 * 著作权人
	 */
	@ApiField("copyright_holder")
	private String copyrightHolder;

	/**
	 * 创作完成日期
	 */
	@ApiField("czwcrq")
	private String czwcrq;

	/**
	 * 分类号
	 */
	@ApiField("flh")
	private String flh;

	/**
	 * 国籍
	 */
	@ApiField("nationality")
	private String nationality;

	/**
	 * 公告日期
	 */
	@ApiField("proclamation_date")
	private String proclamationDate;

	/**
	 * 公告类型
	 */
	@ApiField("proclamation_type")
	private String proclamationType;

	/**
	 * 登记日期
	 */
	@ApiField("register_date")
	private String registerDate;

	/**
	 * 登记号
	 */
	@ApiField("register_number")
	private String registerNumber;

	/**
	 * 软件著作权登记号
	 */
	@ApiField("rjzzqdjh")
	private String rjzzqdjh;

	/**
	 * 首次发表日期
	 */
	@ApiField("scfbrq")
	private String scfbrq;

	/**
	 * 编号
	 */
	@ApiField("serial_number")
	private String serialNumber;

	/**
	 * 软件简称
	 */
	@ApiField("software_abbreviation_name")
	private String softwareAbbreviationName;

	/**
	 * 软件全称
	 */
	@ApiField("software_full_name")
	private String softwareFullName;

	/**
	 * 软件名称
	 */
	@ApiField("software_name")
	private String softwareName;

	/**
	 * 版本号
	 */
	@ApiField("version_number")
	private String versionNumber;

	/**
	 * 作品名称
	 */
	@ApiField("work_name")
	private String workName;

	/**
	 * 作品类别
	 */
	@ApiField("zplb")
	private String zplb;

	public String getCopyrightHolder() {
		return this.copyrightHolder;
	}
	public void setCopyrightHolder(String copyrightHolder) {
		this.copyrightHolder = copyrightHolder;
	}

	public String getCzwcrq() {
		return this.czwcrq;
	}
	public void setCzwcrq(String czwcrq) {
		this.czwcrq = czwcrq;
	}

	public String getFlh() {
		return this.flh;
	}
	public void setFlh(String flh) {
		this.flh = flh;
	}

	public String getNationality() {
		return this.nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getProclamationDate() {
		return this.proclamationDate;
	}
	public void setProclamationDate(String proclamationDate) {
		this.proclamationDate = proclamationDate;
	}

	public String getProclamationType() {
		return this.proclamationType;
	}
	public void setProclamationType(String proclamationType) {
		this.proclamationType = proclamationType;
	}

	public String getRegisterDate() {
		return this.registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getRegisterNumber() {
		return this.registerNumber;
	}
	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}

	public String getRjzzqdjh() {
		return this.rjzzqdjh;
	}
	public void setRjzzqdjh(String rjzzqdjh) {
		this.rjzzqdjh = rjzzqdjh;
	}

	public String getScfbrq() {
		return this.scfbrq;
	}
	public void setScfbrq(String scfbrq) {
		this.scfbrq = scfbrq;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSoftwareAbbreviationName() {
		return this.softwareAbbreviationName;
	}
	public void setSoftwareAbbreviationName(String softwareAbbreviationName) {
		this.softwareAbbreviationName = softwareAbbreviationName;
	}

	public String getSoftwareFullName() {
		return this.softwareFullName;
	}
	public void setSoftwareFullName(String softwareFullName) {
		this.softwareFullName = softwareFullName;
	}

	public String getSoftwareName() {
		return this.softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	public String getVersionNumber() {
		return this.versionNumber;
	}
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public String getWorkName() {
		return this.workName;
	}
	public void setWorkName(String workName) {
		this.workName = workName;
	}

	public String getZplb() {
		return this.zplb;
	}
	public void setZplb(String zplb) {
		this.zplb = zplb;
	}

}
