package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 激活设备号
 *
 * @author auto create
 * @since 1.0, 2023-11-09 20:44:15
 */
public class AlipayOpenMiniAmpeDeviceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4784829465988688262L;

	/**
	 * 用于标识厂商单个设备产品下唯一的一个设备，推荐使用厂商自己定义的序列号。
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备产品的productId，由系统生成
	 */
	@ApiField("product_id")
	private String productId;

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

}
