package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 漏洞信息列表
 *
 * @author auto create
 * @since 1.0, 2018-11-25 14:36:44
 */
public class VulList extends AlipayObject {

	private static final long serialVersionUID = 5697498771643239568L;

	/**
	 * 漏洞奖励
	 */
	@ApiField("coin")
	private Long coin;

	/**
	 * 漏洞等级
	 */
	@ApiField("level")
	private Long level;

	/**
	 * 漏洞信息标题
	 */
	@ApiField("name")
	private String name;

	/**
	 * 漏洞提交修复状态
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 漏洞提交时间
	 */
	@ApiField("submit_time")
	private String submitTime;

	/**
	 * 漏洞id
	 */
	@ApiField("vul_id")
	private Long vulId;

	public Long getCoin() {
		return this.coin;
	}
	public void setCoin(Long coin) {
		this.coin = coin;
	}

	public Long getLevel() {
		return this.level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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

	public Long getVulId() {
		return this.vulId;
	}
	public void setVulId(Long vulId) {
		this.vulId = vulId;
	}

}
