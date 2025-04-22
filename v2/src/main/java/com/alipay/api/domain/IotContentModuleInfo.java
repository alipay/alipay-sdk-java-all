package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 展位内容
 *
 * @author auto create
 * @since 1.0, 2021-02-08 13:35:19
 */
public class IotContentModuleInfo extends AlipayObject {

	private static final long serialVersionUID = 5373574669565182566L;

	/**
	 * 对展位内容加签，用于校验内容合法性
	 */
	@ApiField("content_sign")
	private String contentSign;

	/**
	 * 展位详情加密后返回数据
	 */
	@ApiField("data")
	private String data;

	/**
	 * 权益标识
	 */
	@ApiField("id")
	private String id;

	/**
	 * 展位类型，如BusinessOperation，CdpOperation
	 */
	@ApiField("type")
	private String type;

	/**
	 * H5页面链接地址
	 */
	@ApiField("url")
	private String url;

	public String getContentSign() {
		return this.contentSign;
	}
	public void setContentSign(String contentSign) {
		this.contentSign = contentSign;
	}

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
