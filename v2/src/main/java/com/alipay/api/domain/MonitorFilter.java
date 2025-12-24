package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询条件过滤
 *
 * @author auto create
 * @since 1.0, 2024-04-26 11:32:26
 */
public class MonitorFilter extends AlipayObject {

	private static final long serialVersionUID = 6411683269472173473L;

	/**
	 * cdn加速域名列表
	 */
	@ApiListField("cdn_domain_names")
	@ApiField("string")
	private List<String> cdnDomainNames;

	/**
	 * 数据库集合列表
	 */
	@ApiListField("collections")
	@ApiField("string")
	private List<String> collections;

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

	public List<String> getCdnDomainNames() {
		return this.cdnDomainNames;
	}
	public void setCdnDomainNames(List<String> cdnDomainNames) {
		this.cdnDomainNames = cdnDomainNames;
	}

	public List<String> getCollections() {
		return this.collections;
	}
	public void setCollections(List<String> collections) {
		this.collections = collections;
	}

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
