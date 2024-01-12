package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询条件过滤
 *
 * @author auto create
 * @since 1.0, 2023-10-10 19:35:11
 */
public class MonitorFilter extends AlipayObject {

	private static final long serialVersionUID = 6465151818942854379L;

	/**
	 * 按照函数名称过滤
	 */
	@ApiField("function_name")
	private String functionName;

	/**
	 * 数据库操作类型
 - Read
 - Write
	 */
	@ApiField("mongodb_operation")
	private String mongodbOperation;

	/**
	 * OSS操作类型
 - Upload
 - Download
 - Delete
	 */
	@ApiField("oss_operation")
	private String ossOperation;

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getMongodbOperation() {
		return this.mongodbOperation;
	}
	public void setMongodbOperation(String mongodbOperation) {
		this.mongodbOperation = mongodbOperation;
	}

	public String getOssOperation() {
		return this.ossOperation;
	}
	public void setOssOperation(String ossOperation) {
		this.ossOperation = ossOperation;
	}

}
