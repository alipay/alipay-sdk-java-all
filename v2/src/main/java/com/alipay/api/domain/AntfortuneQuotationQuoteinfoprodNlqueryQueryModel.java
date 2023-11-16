package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁财富大模型服务
 *
 * @author auto create
 * @since 1.0, 2023-08-23 18:52:50
 */
public class AntfortuneQuotationQuoteinfoprodNlqueryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8226853561231933942L;

	/**
	 * 应用标识，需要与接口人确定后赋予
	 */
	@ApiField("app_token")
	private String appToken;

	/**
	 * file path
	 */
	@ApiField("file_path")
	private String filePath;

	/**
	 * 具体的请求参数值，目前是日期
	 */
	@ApiField("param")
	private String param;

	/**
	 * 大语言模型请求的文本内容，不固定
	 */
	@ApiField("query")
	private String query;

	/**
	 * 任务类型
	 */
	@ApiField("task_type")
	private String taskType;

	public String getAppToken() {
		return this.appToken;
	}
	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}

	public String getFilePath() {
		return this.filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getParam() {
		return this.param;
	}
	public void setParam(String param) {
		this.param = param;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

}
