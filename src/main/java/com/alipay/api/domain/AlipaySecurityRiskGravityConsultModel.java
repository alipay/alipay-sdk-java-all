package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多方安全风控风险咨询服务
 *
 * @author auto create
 * @since 1.0, 2022-08-05 15:15:13
 */
public class AlipaySecurityRiskGravityConsultModel extends AlipayObject {

	private static final long serialVersionUID = 3879792322176622764L;

	/**
	 * 参数名：client_id+是否唯一：无需唯一+应用场景：已鉴权的调用方id，多方安全风控用该ID对调用方可调用的数据产品鉴权+枚举：无枚举+如何获取：多方安全风控与调用方协商+特殊说明：无
	 */
	@ApiField("authorized_client_id")
	private String authorizedClientId;

	/**
	 * 参数名：extension+是否唯一：无需唯一+应用场景：多方安全风控标准接口普通扩展参数，用于处理可能存在的小部分标准之外定制化需求+枚举：无枚举+如何获取：多方安全风控与调用方协商+特殊说明：无
	 */
	@ApiListField("extension")
	@ApiField("gravity_param")
	private List<GravityParam> extension;

	/**
	 * 参数名：header+是否唯一：无需唯一+应用场景：多方安全风控服务标准头信息，譬如系统间调用的traceId+枚举：无枚举+如何获取：调用方系统随机生成，保证全局唯一+特殊说明：无
	 */
	@ApiField("header")
	private SecGravityServiceHeader header;

	/**
	 * 参数名：params+是否唯一：无需唯一+应用场景：多方安全风控服务数据产品所需参数+枚举：无枚举+如何获取：多方安全风控通过对应数据产品介绍文档获取+特殊说明：无
	 */
	@ApiListField("params")
	@ApiField("gravity_param")
	private List<GravityParam> params;

	/**
	 * 参数名：product_id+是否唯一：无需唯一+应用场景：用于指定调用多方安全风控某个风控产品+枚举：无枚举+如何获取：多方安全风控平台分发+特殊说明：无
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 参数名：session_token+是否唯一：无需唯一+应用场景：多方安全风控会话秘钥密文+枚举：无枚举+如何获取：多方安全风控分发公钥后通过公钥加密会话秘钥+特殊说明：无
	 */
	@ApiField("session_token")
	private String sessionToken;

	public String getAuthorizedClientId() {
		return this.authorizedClientId;
	}
	public void setAuthorizedClientId(String authorizedClientId) {
		this.authorizedClientId = authorizedClientId;
	}

	public List<GravityParam> getExtension() {
		return this.extension;
	}
	public void setExtension(List<GravityParam> extension) {
		this.extension = extension;
	}

	public SecGravityServiceHeader getHeader() {
		return this.header;
	}
	public void setHeader(SecGravityServiceHeader header) {
		this.header = header;
	}

	public List<GravityParam> getParams() {
		return this.params;
	}
	public void setParams(List<GravityParam> params) {
		this.params = params;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSessionToken() {
		return this.sessionToken;
	}
	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

}
