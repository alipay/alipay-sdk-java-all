package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 附加参数，通常用于特殊场景下指定一些必要参数供模型判断，例如指定经纬度，并询问智能体此位置的天气。
 *
 * @author auto create
 * @since 1.0, 2025-09-25 17:37:41
 */
public class ChatExtraParams extends AlipayObject {

	private static final long serialVersionUID = 1332237637938765561L;

	/**
	 * 用于描述客户端信息，业务自定义信息。对应“支小宝投放”生码的“业务自定义信息”
	 */
	@ApiField("agent_ext_info")
	private String agentExtInfo;

	/**
	 * 用于描述用户信息，证件号。
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 用于描述用户信息，证件类型。
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 用于描述客户端信息，请求入口。对应“支小宝投放”生码的"场景ID或agentID_渠道类型"。
	 */
	@ApiField("entrance")
	private String entrance;

	/**
	 * 用于描述客户端信息，请求来源。
	 */
	@ApiField("from_source")
	private String fromSource;

	/**
	 * 用于描述空间信息，经纬度的纬度。
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 用于描述空间信息，经纬度的经度。
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 用于描述用户信息，手机号。
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 应用关联的插件调用环境，为空默认调用生产环境
	 */
	@ApiField("plugin_env")
	private String pluginEnv;

	public String getAgentExtInfo() {
		return this.agentExtInfo;
	}
	public void setAgentExtInfo(String agentExtInfo) {
		this.agentExtInfo = agentExtInfo;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getEntrance() {
		return this.entrance;
	}
	public void setEntrance(String entrance) {
		this.entrance = entrance;
	}

	public String getFromSource() {
		return this.fromSource;
	}
	public void setFromSource(String fromSource) {
		this.fromSource = fromSource;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPluginEnv() {
		return this.pluginEnv;
	}
	public void setPluginEnv(String pluginEnv) {
		this.pluginEnv = pluginEnv;
	}

}
