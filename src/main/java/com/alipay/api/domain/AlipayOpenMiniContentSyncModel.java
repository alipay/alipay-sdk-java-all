package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序内容接入
 *
 * @author auto create
 * @since 1.0, 2020-04-25 00:18:02
 */
public class AlipayOpenMiniContentSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5728171698733793318L;

	/**
	 * 具体的内容数据，采用json格式，不同类型不同操作数据不同。可参考具体内容接入文档中的详细说明。
	 */
	@ApiField("content_data")
	private String contentData;

	/**
	 * 内容类型，例如门店、商品等
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 扩展信息，json格式。可参考具体内容接入文档中的详细说明。
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 内容类型下的具体操作，比如门店类型下，小程序批量绑定门店。可参考具体内容接入文档中的详细说明。
	 */
	@ApiField("operation")
	private String operation;

	public String getContentData() {
		return this.contentData;
	}
	public void setContentData(String contentData) {
		this.contentData = contentData;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getOperation() {
		return this.operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

}
