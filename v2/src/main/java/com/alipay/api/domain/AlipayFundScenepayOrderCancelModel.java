package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景支付业务单据撤销
 *
 * @author auto create
 * @since 1.0, 2025-04-07 17:12:44
 */
public class AlipayFundScenepayOrderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3378295584273974261L;

	/**
	 * 业务单号由场景支付业务单创建接口获得
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 指定值，由支付宝侧业务提供
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 固定值
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 指定值，由支付宝侧业务提供
	 */
	@ApiField("sub_biz_scene")
	private String subBizScene;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSubBizScene() {
		return this.subBizScene;
	}
	public void setSubBizScene(String subBizScene) {
		this.subBizScene = subBizScene;
	}

}
