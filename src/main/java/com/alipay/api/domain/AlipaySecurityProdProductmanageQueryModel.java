package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户产品管理状态查询
 *
 * @author auto create
 * @since 1.0, 2019-06-28 10:52:41
 */
public class AlipaySecurityProdProductmanageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6496541959148947191L;

	/**
	 * 用户ID（支付宝租户访问，等同于userId）
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * APP名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 设备标识
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 产品码
	 */
	@ApiListField("product_code")
	@ApiField("string")
	private List<String> productCode;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 租户ID，金融云租户：FINCLOUD
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public List<String> getProductCode() {
		return this.productCode;
	}
	public void setProductCode(List<String> productCode) {
		this.productCode = productCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
