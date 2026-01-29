package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT设备安全芯片applet初始化
 *
 * @author auto create
 * @since 1.0, 2018-03-29 10:01:39
 */
public class AlipaySecurityProdSeAppletQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7566123968714319924L;

	/**
	 * 操作类型，唯一，传递tsm的具体操作，厂测程序提供
	 */
	@ApiField("opt_type")
	private Long optType;

	/**
	 * 基本参数，json数组传递，调用tsm时提供对应的参数，厂测程序提供
	 */
	@ApiField("param")
	private String param;

	/**
	 * 商户和支付宝交互时，用于代表支付宝分配给商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * se编号，唯一，用于tsm校验，厂测程序传入
	 */
	@ApiField("se_id")
	private String seId;

	/**
	 * se版本号，唯一，用于获取applet包对应版本的地址，厂测程序调用时传入
	 */
	@ApiField("se_version")
	private String seVersion;

	/**
	 * 子操作类型，用于调用tsm，厂测程序提供
	 */
	@ApiField("sub_opt_type")
	private Long subOptType;

	public Long getOptType() {
		return this.optType;
	}
	public void setOptType(Long optType) {
		this.optType = optType;
	}

	public String getParam() {
		return this.param;
	}
	public void setParam(String param) {
		this.param = param;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getSeId() {
		return this.seId;
	}
	public void setSeId(String seId) {
		this.seId = seId;
	}

	public String getSeVersion() {
		return this.seVersion;
	}
	public void setSeVersion(String seVersion) {
		this.seVersion = seVersion;
	}

	public Long getSubOptType() {
		return this.subOptType;
	}
	public void setSubOptType(Long subOptType) {
		this.subOptType = subOptType;
	}

}
