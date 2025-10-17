package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户权限校验
 *
 * @author auto create
 * @since 1.0, 2025-05-13 20:24:19
 */
public class AlipayIserviceIsportalPermissioncheckQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4634294444376796618L;

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
	 * 工作台用户id
	 */
	@ApiField("clv_user_id")
	private String clvUserId;

	/**
	 * 权限码
	 */
	@ApiListField("codes")
	@ApiField("string")
	private List<String> codes;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 人力资源id
	 */
	@ApiField("ur_id")
	private String urId;

	/**
	 * 鉴权uri
	 */
	@ApiField("uri")
	private String uri;

	/**
	 * 星云用户id
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getClvUserId() {
		return this.clvUserId;
	}
	public void setClvUserId(String clvUserId) {
		this.clvUserId = clvUserId;
	}

	public List<String> getCodes() {
		return this.codes;
	}
	public void setCodes(List<String> codes) {
		this.codes = codes;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getUrId() {
		return this.urId;
	}
	public void setUrId(String urId) {
		this.urId = urId;
	}

	public String getUri() {
		return this.uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
