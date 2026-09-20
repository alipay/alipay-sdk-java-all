package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务商代商户MCP信息修改
 *
 * @author auto create
 * @since 1.0, 2026-09-16 15:06:24
 */
public class AlipayOpenSpMcpInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6332469467645995282L;

	/**
	 * MCP能力编码code
	 */
	@ApiField("ability_code")
	private String abilityCode;

	/**
	 * 秘钥或令牌的值
	 */
	@ApiField("api_key")
	private String apiKey;

	/**
	 * 传输加密关联的加密应用。由调用方（服务商）入参指定其名下应用；推荐使用三方应用
	 */
	@ApiField("encrypt_app_id")
	private String encryptAppId;

	/**
	 * null
	 */
	@ApiListField("header_list")
	@ApiField("header_param")
	private List<HeaderParam> headerList;

	/**
	 * MCP中文名
	 */
	@ApiField("mcp_chinese_name")
	private String mcpChineseName;

	/**
	 * MCP描述
	 */
	@ApiField("mcp_desc")
	private String mcpDesc;

	/**
	 * 是 支持 PNG、JPG、SVG 格式，大小 ≤ 1MB，建议 1:1，至少 128×128。使用 alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("mcp_icon_pic")
	private String mcpIconPic;

	/**
	 * MCP服务URL
	 */
	@ApiField("mcp_server_url")
	private String mcpServerUrl;

	/**
	 * 秘钥或令牌对应的参数名称
	 */
	@ApiField("parameter_name")
	private String parameterName;

	/**
	 * 请求超时时间(ms)
	 */
	@ApiField("request_timeout")
	private String requestTimeout;

	/**
	 * 响应超时时间(ms)
	 */
	@ApiField("response_timeout")
	private String responseTimeout;

	/**
	 * null
	 */
	@ApiListField("support_account_type")
	@ApiField("string")
	private List<String> supportAccountType;

	/**
	 * 支持的传输协议
	 */
	@ApiField("support_protocols")
	private String supportProtocols;

	public String getAbilityCode() {
		return this.abilityCode;
	}
	public void setAbilityCode(String abilityCode) {
		this.abilityCode = abilityCode;
	}

	public String getApiKey() {
		return this.apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getEncryptAppId() {
		return this.encryptAppId;
	}
	public void setEncryptAppId(String encryptAppId) {
		this.encryptAppId = encryptAppId;
	}

	public List<HeaderParam> getHeaderList() {
		return this.headerList;
	}
	public void setHeaderList(List<HeaderParam> headerList) {
		this.headerList = headerList;
	}

	public String getMcpChineseName() {
		return this.mcpChineseName;
	}
	public void setMcpChineseName(String mcpChineseName) {
		this.mcpChineseName = mcpChineseName;
	}

	public String getMcpDesc() {
		return this.mcpDesc;
	}
	public void setMcpDesc(String mcpDesc) {
		this.mcpDesc = mcpDesc;
	}

	public String getMcpIconPic() {
		return this.mcpIconPic;
	}
	public void setMcpIconPic(String mcpIconPic) {
		this.mcpIconPic = mcpIconPic;
	}

	public String getMcpServerUrl() {
		return this.mcpServerUrl;
	}
	public void setMcpServerUrl(String mcpServerUrl) {
		this.mcpServerUrl = mcpServerUrl;
	}

	public String getParameterName() {
		return this.parameterName;
	}
	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public String getRequestTimeout() {
		return this.requestTimeout;
	}
	public void setRequestTimeout(String requestTimeout) {
		this.requestTimeout = requestTimeout;
	}

	public String getResponseTimeout() {
		return this.responseTimeout;
	}
	public void setResponseTimeout(String responseTimeout) {
		this.responseTimeout = responseTimeout;
	}

	public List<String> getSupportAccountType() {
		return this.supportAccountType;
	}
	public void setSupportAccountType(List<String> supportAccountType) {
		this.supportAccountType = supportAccountType;
	}

	public String getSupportProtocols() {
		return this.supportProtocols;
	}
	public void setSupportProtocols(String supportProtocols) {
		this.supportProtocols = supportProtocols;
	}

}
