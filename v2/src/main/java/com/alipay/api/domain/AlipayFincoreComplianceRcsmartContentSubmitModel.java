package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 解语花统一的内容审核接口
 *
 * @author auto create
 * @since 1.0, 2024-10-18 17:45:22
 */
public class AlipayFincoreComplianceRcsmartContentSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 5732659177181257324L;

	/**
	 * app_name为调用方系统名称(英文名称),与分配的app_token一起做调用系统合法性校验。
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * app_token为系统分配的密钥，与app_name一起做调用系统合法性校验
	 */
	@ApiField("app_token")
	private String appToken;

	/**
	 * 业务编码，一个业务biz_code代表当前业务，可以包含多个scene_code，与scene_code之间为一对多的关系。
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 文件信息列表,其中业务素材类型默认不传,特殊场景需约定传参。
	 */
	@ApiListField("file_info_list")
	@ApiField("file_info")
	private List<FileInfo> fileInfoList;

	/**
	 * 请求Id，与app_name组成唯一健，保证业务请求幂等性，同时在请求完毕后，获取业务风险详情信息结果使用
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 场景编码。内容审核业务对应的场景代码。
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppToken() {
		return this.appToken;
	}
	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public List<FileInfo> getFileInfoList() {
		return this.fileInfoList;
	}
	public void setFileInfoList(List<FileInfo> fileInfoList) {
		this.fileInfoList = fileInfoList;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
