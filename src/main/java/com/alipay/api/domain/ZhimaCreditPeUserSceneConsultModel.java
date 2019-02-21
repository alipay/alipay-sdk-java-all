package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用受理评估接口（场景维度准入&盖帽额度咨询）
 *
 * @author auto create
 * @since 1.0, 2018-12-21 09:45:54
 */
public class ZhimaCreditPeUserSceneConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4596323744245459443L;

	/**
	 * 买家的蚂蚁统一会员ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 芝麻信用类目码，由芝麻信用侧分配
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 芝麻信用场景，由芝麻信用侧分配，如：天猫信用购，淘宝租赁等
	 */
	@ApiField("credit_scene")
	private String creditScene;

	/**
	 * 业务扩展参数，json格式字符串，如果有需要，请提前联系开发人员沟通确定参数
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 风险环境参数信息，json格式字符串，目前已知key如下：umid，设备指纹；imei，设备号；lbs，经纬度；ip，设备网络IP地址；wireless_mac，设备无线wifi mac；mac，设备网卡地址
	 */
	@ApiField("risk_info")
	private String riskInfo;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCreditScene() {
		return this.creditScene;
	}
	public void setCreditScene(String creditScene) {
		this.creditScene = creditScene;
	}

	public String getExtParams() {
		return this.extParams;
	}
	public void setExtParams(String extParams) {
		this.extParams = extParams;
	}

	public String getRiskInfo() {
		return this.riskInfo;
	}
	public void setRiskInfo(String riskInfo) {
		this.riskInfo = riskInfo;
	}

}
