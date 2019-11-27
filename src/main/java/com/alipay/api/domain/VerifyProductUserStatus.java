package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户产品管理状态
 *
 * @author auto create
 * @since 1.0, 2017-09-28 14:33:21
 */
public class VerifyProductUserStatus extends AlipayObject {

	private static final long serialVersionUID = 2699268675961519345L;

	/**
	 * 用户编号
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * APP名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 设备ID
	 */
	@ApiField("deivice_id")
	private String deiviceId;

	/**
	 * 失效时间
	 */
	@ApiField("gmt_expired")
	private Date gmtExpired;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品状态
	 */
	@ApiField("product_state")
	private String productState;

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

	public String getDeiviceId() {
		return this.deiviceId;
	}
	public void setDeiviceId(String deiviceId) {
		this.deiviceId = deiviceId;
	}

	public Date getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(Date gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductState() {
		return this.productState;
	}
	public void setProductState(String productState) {
		this.productState = productState;
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
