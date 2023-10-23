package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 参赛者信息同步
 *
 * @author auto create
 * @since 1.0, 2023-09-24 17:55:15
 */
public class AlipayCommerceSportsCompetitionCompetitorSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6493186655621666831L;

	/**
	 * 中文名称
	 */
	@ApiField("cn_name")
	private String cnName;

	/**
	 * 参赛者code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 赛事编号
	 */
	@ApiField("competition_code")
	private String competitionCode;

	/**
	 * 版本
	 */
	@ApiField("data_version")
	private Long dataVersion;

	/**
	 * 英文名称
	 */
	@ApiField("en_name")
	private String enName;

	/**
	 * 图片链接
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public String getCnName() {
		return this.cnName;
	}
	public void setCnName(String cnName) {
		this.cnName = cnName;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getCompetitionCode() {
		return this.competitionCode;
	}
	public void setCompetitionCode(String competitionCode) {
		this.competitionCode = competitionCode;
	}

	public Long getDataVersion() {
		return this.dataVersion;
	}
	public void setDataVersion(Long dataVersion) {
		this.dataVersion = dataVersion;
	}

	public String getEnName() {
		return this.enName;
	}
	public void setEnName(String enName) {
		this.enName = enName;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
