package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号摘要信息
 *
 * @author auto create
 * @since 1.0, 2019-12-23 11:10:56
 */
public class SummaryInfo extends AlipayObject {

	private static final long serialVersionUID = 3462313623943428749L;

	/**
	 * 创建渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 生活号id
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 生活号名称
	 */
	@ApiField("public_name")
	private String publicName;

	/**
	 * 上架：ON_LINE,下架：OFF_LINE
	 */
	@ApiField("status")
	private String status;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getPublicName() {
		return this.publicName;
	}
	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
