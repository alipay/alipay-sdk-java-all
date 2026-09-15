package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-27 15:57:49
 */
public class Record extends AlipayObject {

	private static final long serialVersionUID = 7747524511323938873L;

	/**
	 * 阿福用户openid
	 */
	@ApiField("aq_open_id")
	private String aqOpenId;

	/**
	 * 数据唯一标识（即保存时写入的 dataId，非数据库主键）
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 关键字段，数据来源机构码，映射 health_archive_org_config 表的 org_code 字段（详见 关键字段说明）。撤销保存时与 userId、dataId、dataType 组合定位需删除的记录，值需与保存时写入的 data_source 一致（如 XXJ）
	 */
	@ApiField("data_source")
	private String dataSource;

	/**
	 * 路由字段，报告类型标识，决定查询和删除哪张表。可选值参见 dataType 路由说明
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAqOpenId() {
		return this.aqOpenId;
	}
	public void setAqOpenId(String aqOpenId) {
		this.aqOpenId = aqOpenId;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDataSource() {
		return this.dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
