package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序-搜索运营-服务关键词批量查询列表
 *
 * @author auto create
 * @since 1.0, 2022-11-25 12:43:13
 */
public class SubServiceKeyWordInfo extends AlipayObject {

	private static final long serialVersionUID = 5552666573237839787L;

	/**
	 * 小程序名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 此服务下的关键词
	 */
	@ApiListField("keyword_info")
	@ApiField("key_word_info")
	private List<KeyWordInfo> keywordInfo;

	/**
	 * 小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 子服务code
	 */
	@ApiField("sub_service_code")
	private String subServiceCode;

	/**
	 * 子服务简单描述
	 */
	@ApiField("sub_service_desc")
	private String subServiceDesc;

	/**
	 * 子服务名
	 */
	@ApiField("sub_service_name")
	private String subServiceName;

	/**
	 * 子服务状态，
INITIAL：初始化：VALID:已生效；INVALID：已失效
	 */
	@ApiField("sub_service_status")
	private String subServiceStatus;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public List<KeyWordInfo> getKeywordInfo() {
		return this.keywordInfo;
	}
	public void setKeywordInfo(List<KeyWordInfo> keywordInfo) {
		this.keywordInfo = keywordInfo;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getSubServiceCode() {
		return this.subServiceCode;
	}
	public void setSubServiceCode(String subServiceCode) {
		this.subServiceCode = subServiceCode;
	}

	public String getSubServiceDesc() {
		return this.subServiceDesc;
	}
	public void setSubServiceDesc(String subServiceDesc) {
		this.subServiceDesc = subServiceDesc;
	}

	public String getSubServiceName() {
		return this.subServiceName;
	}
	public void setSubServiceName(String subServiceName) {
		this.subServiceName = subServiceName;
	}

	public String getSubServiceStatus() {
		return this.subServiceStatus;
	}
	public void setSubServiceStatus(String subServiceStatus) {
		this.subServiceStatus = subServiceStatus;
	}

}
