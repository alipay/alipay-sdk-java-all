package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 功能服务
 *
 * @author auto create
 * @since 1.0, 2024-06-14 16:37:35
 */
public class FunctionalService extends AlipayObject {

	private static final long serialVersionUID = 2211679879787645795L;

	/**
	 * 功能内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("order_ext_info")
	private List<OrderExtInfo> extInfo;

	/**
	 * 功能码
支持的功能码请与产品或对应技术确认
	 */
	@ApiField("function_code")
	private String functionCode;

	/**
	 * 功能名称
	 */
	@ApiField("function_name")
	private String functionName;

	/**
	 * 功能类型
	 */
	@ApiField("function_type")
	private String functionType;

	/**
	 * 功能入口
	 */
	@ApiField("function_url")
	private String functionUrl;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public List<OrderExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<OrderExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getFunctionCode() {
		return this.functionCode;
	}
	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getFunctionType() {
		return this.functionType;
	}
	public void setFunctionType(String functionType) {
		this.functionType = functionType;
	}

	public String getFunctionUrl() {
		return this.functionUrl;
	}
	public void setFunctionUrl(String functionUrl) {
		this.functionUrl = functionUrl;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

}
