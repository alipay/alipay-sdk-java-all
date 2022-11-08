package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能设备信息同步
 *
 * @author auto create
 * @since 1.0, 2022-01-04 14:21:51
 */
public class AlipayOpenMiniAmpeTracerSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3548634993988294345L;

	/**
	 * 智能设备在AMPE平台注册的设备ID
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 智能设备在AMPE平台注册的产品ID
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 支付宝业务A点位
	 */
	@ApiField("spm_a")
	private String spmA;

	/**
	 * 支付宝业务B点位
	 */
	@ApiField("spm_b")
	private String spmB;

	/**
	 * 支付宝业务C点位
	 */
	@ApiField("spm_c")
	private String spmC;

	/**
	 * 支付宝业务d点位
	 */
	@ApiField("spm_d")
	private String spmD;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSpmA() {
		return this.spmA;
	}
	public void setSpmA(String spmA) {
		this.spmA = spmA;
	}

	public String getSpmB() {
		return this.spmB;
	}
	public void setSpmB(String spmB) {
		this.spmB = spmB;
	}

	public String getSpmC() {
		return this.spmC;
	}
	public void setSpmC(String spmC) {
		this.spmC = spmC;
	}

	public String getSpmD() {
		return this.spmD;
	}
	public void setSpmD(String spmD) {
		this.spmD = spmD;
	}

}
