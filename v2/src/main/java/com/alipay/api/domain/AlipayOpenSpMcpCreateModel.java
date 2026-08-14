package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务商代商户创建MCP
 *
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:53
 */
public class AlipayOpenSpMcpCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5337979752295273789L;

	/**
	 * 商户支付宝账号
	 */
	@ApiField("account")
	private String account;

	/**
	 * 秘钥或令牌的值
	 */
	@ApiField("api_key")
	private String apiKey;

	/**
	 * 营业执照号
	 */
	@ApiField("business_license_code")
	private String businessLicenseCode;

	/**
	 * 营业执照名称
	 */
	@ApiField("business_license_name")
	private String businessLicenseName;

	/**
	 * null
	 */
	@ApiListField("header_list")
	@ApiField("header_param")
	private List<HeaderParam> headerList;

	/**
	 * 商家法人名称
	 */
	@ApiField("legal_person_name")
	private String legalPersonName;

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
	 * MCP英文名
	 */
	@ApiField("mcp_english_name")
	private String mcpEnglishName;

	/**
	 * 是	支持 PNG、JPG、SVG 格式，大小 ≤ 1MB，建议 1:1，至少 128×128。使用 alipay.open.file.upload接口上传图片获取的file_id。
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
	private Long requestTimeout;

	/**
	 * 响应超时时间(ms)
	 */
	@ApiField("response_timeout")
	private Long responseTimeout;

	/**
	 * null
	 */
	@ApiListField("support_merchant_type_list")
	@ApiField("string")
	private List<String> supportMerchantTypeList;

	/**
	 * 支持的传输协议
	 */
	@ApiField("support_protocols")
	private String supportProtocols;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getApiKey() {
		return this.apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getBusinessLicenseCode() {
		return this.businessLicenseCode;
	}
	public void setBusinessLicenseCode(String businessLicenseCode) {
		this.businessLicenseCode = businessLicenseCode;
	}

	public String getBusinessLicenseName() {
		return this.businessLicenseName;
	}
	public void setBusinessLicenseName(String businessLicenseName) {
		this.businessLicenseName = businessLicenseName;
	}

	public List<HeaderParam> getHeaderList() {
		return this.headerList;
	}
	public void setHeaderList(List<HeaderParam> headerList) {
		this.headerList = headerList;
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
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

	public String getMcpEnglishName() {
		return this.mcpEnglishName;
	}
	public void setMcpEnglishName(String mcpEnglishName) {
		this.mcpEnglishName = mcpEnglishName;
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

	public Long getRequestTimeout() {
		return this.requestTimeout;
	}
	public void setRequestTimeout(Long requestTimeout) {
		this.requestTimeout = requestTimeout;
	}

	public Long getResponseTimeout() {
		return this.responseTimeout;
	}
	public void setResponseTimeout(Long responseTimeout) {
		this.responseTimeout = responseTimeout;
	}

	public List<String> getSupportMerchantTypeList() {
		return this.supportMerchantTypeList;
	}
	public void setSupportMerchantTypeList(List<String> supportMerchantTypeList) {
		this.supportMerchantTypeList = supportMerchantTypeList;
	}

	public String getSupportProtocols() {
		return this.supportProtocols;
	}
	public void setSupportProtocols(String supportProtocols) {
		this.supportProtocols = supportProtocols;
	}

}
