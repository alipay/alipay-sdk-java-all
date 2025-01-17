package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 理赔案件附件材料
 *
 * @author auto create
 * @since 1.0, 2020-05-06 10:41:28
 */
public class InsClaimAttachment extends AlipayObject {

	private static final long serialVersionUID = 8714375347734892272L;

	/**
	 * 材料描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 文件名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 附件对应的路径
	 */
	@ApiField("path")
	private String path;

	/**
	 * 审核理由
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 材料审核状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 附件类型
	 */
	@ApiField("type")
	private String type;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
