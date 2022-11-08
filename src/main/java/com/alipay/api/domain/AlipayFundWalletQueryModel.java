package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户查询用户钱包信息
 *
 * @author auto create
 * @since 1.0, 2022-03-01 10:46:46
 */
public class AlipayFundWalletQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3558697347252745221L;

	/**
	 * 现金钱包场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 查询用户开户产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
