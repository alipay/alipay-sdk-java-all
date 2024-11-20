package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户权限校验
 *
 * @author auto create
 * @since 1.0, 2023-07-10 10:04:54
 */
public class AlipayIserviceIsportalPermissioncheckQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1614896626241833619L;

	/**
	 * 星云对应的buservice的ID
	 */
	@ApiField("busvc_cloud_id")
	private String busvcCloudId;

	/**
	 * 蚂蚁权限id
	 */
	@ApiField("busvc_id")
	private String busvcId;

	/**
	 * 权限码
	 */
	@ApiListField("codes")
	@ApiField("string")
	private List<String> codes;

	/**
	 * 鉴权uri
	 */
	@ApiField("uri")
	private String uri;

	public String getBusvcCloudId() {
		return this.busvcCloudId;
	}
	public void setBusvcCloudId(String busvcCloudId) {
		this.busvcCloudId = busvcCloudId;
	}

	public String getBusvcId() {
		return this.busvcId;
	}
	public void setBusvcId(String busvcId) {
		this.busvcId = busvcId;
	}

	public List<String> getCodes() {
		return this.codes;
	}
	public void setCodes(List<String> codes) {
		this.codes = codes;
	}

	public String getUri() {
		return this.uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}

}
