package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景支付业务单查询
 *
 * @author auto create
 * @since 1.0, 2025-04-07 16:57:41
 */
public class AlipayFundScenepayOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2882769783664226863L;

	/**
	 * 业务单号由场景支付业务单创建接口获得
biz_no和out_biz_no两者选其一，且out_biz_no优先
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 指定值，由支付宝侧业务提供
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 签约方账号。 当签约方类型是ALIPAY_USER_ID时，本参数为用户的支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字； 当签约方类型是ALIPAY_LOGON_ID时，本参数为用户的支付宝登录号； 当签约方类型是ALIPAY_OPEN_ID时，本参数为用户的openId。
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 签约方类型 ALIPAY_USER_ID：表示是支付宝账号对应的支付宝唯一用户号；ALIPAY_LOGON_ID：表示是支付宝登录号；ALIPAY_OPEN_ID：表示是支付宝OPENID
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 当identity_type=ALIPAY_LOGON_ID时，填写此字段
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部业务号
该参数需搭配identity、identityType一起使用
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

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

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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

	public String getSubBizScene() {
		return this.subBizScene;
	}
	public void setSubBizScene(String subBizScene) {
		this.subBizScene = subBizScene;
	}

}
