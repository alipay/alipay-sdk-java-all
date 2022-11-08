package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 现金钱包开户
 *
 * @author auto create
 * @since 1.0, 2022-02-21 15:47:37
 */
public class AlipayFundWalletSignModel extends AlipayObject {

	private static final long serialVersionUID = 6817345523482593251L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 姓名
	 */
	@ApiField("identity_name")
	private String identityName;

	/**
	 * 身份证号
	 */
	@ApiField("identity_no")
	private String identityNo;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getIdentityName() {
		return this.identityName;
	}
	public void setIdentityName(String identityName) {
		this.identityName = identityName;
	}

	public String getIdentityNo() {
		return this.identityNo;
	}
	public void setIdentityNo(String identityNo) {
		this.identityNo = identityNo;
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
