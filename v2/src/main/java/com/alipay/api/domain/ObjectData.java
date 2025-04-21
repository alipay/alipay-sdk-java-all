package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能拓客系统查询返回客户数据
 *
 * @author auto create
 * @since 1.0, 2025-01-08 15:01:51
 */
public class ObjectData extends AlipayObject {

	private static final long serialVersionUID = 4569972784447446783L;

	/**
	 * 智能拓客系统查询返回的数据ID
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 返回的字段名与字段值信息
	 */
	@ApiField("fields")
	private String fields;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getFields() {
		return this.fields;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

}
