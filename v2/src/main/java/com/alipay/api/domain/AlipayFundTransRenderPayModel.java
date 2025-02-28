package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金转账渲染支付接口
 *
 * @author auto create
 * @since 1.0, 2024-10-30 10:35:56
 */
public class AlipayFundTransRenderPayModel extends AlipayObject {

	private static final long serialVersionUID = 5355647222959911868L;

	/**
	 * 跟资金订单ID关联的业务场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 链接过期时间,格式为 yyyy-MM-dd HH:mm
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 跳转的编码类型
	 */
	@ApiField("initialize_code_type")
	private String initializeCodeType;

	/**
	 * 指定的资金订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 跟资金订单ID关联的业务产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 目标端类型
	 */
	@ApiField("target_terminal_type")
	private String targetTerminalType;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getInitializeCodeType() {
		return this.initializeCodeType;
	}
	public void setInitializeCodeType(String initializeCodeType) {
		this.initializeCodeType = initializeCodeType;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTargetTerminalType() {
		return this.targetTerminalType;
	}
	public void setTargetTerminalType(String targetTerminalType) {
		this.targetTerminalType = targetTerminalType;
	}

}
