package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户维度券信息模型
 *
 * @author auto create
 * @since 1.0, 2017-08-24 21:58:29
 */
public class InstanceInfo extends AlipayObject {

	private static final long serialVersionUID = 8558911331724994218L;

	/**
	 * 内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 券失效时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 券开始生效时间
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/**
	 * 券id
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 券名称
	 */
	@ApiField("instance_name")
	private String instanceName;

	/**
	 * 类型
	 */
	@ApiField("type")
	private String type;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Date getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getInstanceName() {
		return this.instanceName;
	}
	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
