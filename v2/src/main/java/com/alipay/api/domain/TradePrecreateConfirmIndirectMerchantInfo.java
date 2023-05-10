package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间联商户信息
格式为json
 *
 * @author auto create
 * @since 1.0, 2019-07-23 11:48:15
 */
public class TradePrecreateConfirmIndirectMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 5638711793931479975L;

	/**
	 * 收单机构ID
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 代理收单机构MCC
	 */
	@ApiField("agent_mcc")
	private String agentMcc;

	/**
	 * 代理收单机构名称
	 */
	@ApiField("agent_name")
	private String agentName;

	/**
	 * 商户所在的城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 商户所在城市简体中文名
	 */
	@ApiField("city_name_sc")
	private String cityNameSc;

	/**
	 * 间连商户ID（外标）
	 */
	@ApiField("id")
	private String id;

	/**
	 * 间连商户MCC
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 商户类型

企业取值：ENTERPRISE

个人取值：

PERSONAL

个体工商户取值：

PERSONAL_BUSINESS
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 间连商户名称
	 */
	@ApiField("name")
	private String name;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentMcc() {
		return this.agentMcc;
	}
	public void setAgentMcc(String agentMcc) {
		this.agentMcc = agentMcc;
	}

	public String getAgentName() {
		return this.agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityNameSc() {
		return this.cityNameSc;
	}
	public void setCityNameSc(String cityNameSc) {
		this.cityNameSc = cityNameSc;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMcc() {
		return this.mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
