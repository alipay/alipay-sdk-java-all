package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物业公司信息
 *
 * @author auto create
 * @since 1.0, 2024-07-30 15:02:11
 */
public class CommunityPropertyCompany extends AlipayObject {

	private static final long serialVersionUID = 4336514495525453694L;

	/**
	 * 企业描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 物业公司商标地址
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 物业公司备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 物业公司名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 物业公司Pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 物业小区规模。单位: 个。用于后续消息广播场景根据物业负责小区规模进行分发调度。
	 */
	@ApiField("scale")
	private String scale;

	/**
	 * 首次调用不传，插入新物业公司信息，并且接口返回该字段。后续更新对应物业公司时传入该字段，更新对应记录信息
	 */
	@ApiField("short_name")
	private String shortName;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getScale() {
		return this.scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getShortName() {
		return this.shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

}
