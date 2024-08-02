package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 景区ID内外域映射配置
 *
 * @author auto create
 * @since 1.0, 2023-04-17 11:55:39
 */
public class AlipayCommerceDataScenicSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1139253764374927738L;

	/**
	 * 码值信息
	 */
	@ApiListField("code_value")
	@ApiField("string")
	private List<String> codeValue;

	/**
	 * 服务商名称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 服务商维护的景区地址
	 */
	@ApiField("isv_scenic_address")
	private String isvScenicAddress;

	/**
	 * 服务商维护的景区名称
	 */
	@ApiField("isv_scenic_name")
	private String isvScenicName;

	/**
	 * 服务商内部每个景区的唯一ID
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 服务商负责的景区小程序APPID
	 */
	@ApiField("scenic_app_id")
	private String scenicAppId;

	/**
	 * 支付宝景区ID
	 */
	@ApiField("scenic_id")
	private String scenicId;

	public List<String> getCodeValue() {
		return this.codeValue;
	}
	public void setCodeValue(List<String> codeValue) {
		this.codeValue = codeValue;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getIsvScenicAddress() {
		return this.isvScenicAddress;
	}
	public void setIsvScenicAddress(String isvScenicAddress) {
		this.isvScenicAddress = isvScenicAddress;
	}

	public String getIsvScenicName() {
		return this.isvScenicName;
	}
	public void setIsvScenicName(String isvScenicName) {
		this.isvScenicName = isvScenicName;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getScenicAppId() {
		return this.scenicAppId;
	}
	public void setScenicAppId(String scenicAppId) {
		this.scenicAppId = scenicAppId;
	}

	public String getScenicId() {
		return this.scenicId;
	}
	public void setScenicId(String scenicId) {
		this.scenicId = scenicId;
	}

}
