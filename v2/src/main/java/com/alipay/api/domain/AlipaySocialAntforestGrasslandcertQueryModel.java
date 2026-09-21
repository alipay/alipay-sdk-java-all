package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 神奇草原证书详情列表查询
 *
 * @author auto create
 * @since 1.0, 2026-09-21 15:22:27
 */
public class AlipaySocialAntforestGrasslandcertQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7637166596917298171L;

	/**
	 * 分页游标，从0开始，时间戳
	 */
	@ApiField("cursor")
	private String cursor;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 每页条数, 默认10条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 访问来源，业务自己定
	 */
	@ApiField("source")
	private String source;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getCursor() {
		return this.cursor;
	}
	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
