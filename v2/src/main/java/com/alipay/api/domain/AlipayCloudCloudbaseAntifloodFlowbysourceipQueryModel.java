package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询流量统计信息
 *
 * @author auto create
 * @since 1.0, 2023-09-14 17:41:13
 */
public class AlipayCloudCloudbaseAntifloodFlowbysourceipQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2198618554746735558L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 结束时间
	 */
	@ApiField("end")
	private String end;

	/**
	 * 开始时间
	 */
	@ApiField("start")
	private String start;

	/**
	 * 查询TOPN
	 */
	@ApiField("topn")
	private Long topn;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public String getEnd() {
		return this.end;
	}
	public void setEnd(String end) {
		this.end = end;
	}

	public String getStart() {
		return this.start;
	}
	public void setStart(String start) {
		this.start = start;
	}

	public Long getTopn() {
		return this.topn;
	}
	public void setTopn(Long topn) {
		this.topn = topn;
	}

}
