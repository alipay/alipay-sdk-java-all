package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业入驻
 *
 * @author auto create
 * @since 1.0, 2022-11-06 11:15:46
 */
public class AlipayCommerceEcEnterpriseCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6447685593529232858L;

	/**
	 * 场景码，联系支付宝分配
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 企业简称
	 */
	@ApiField("enterprise_alias")
	private String enterpriseAlias;

	/**
	 * 企业名称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 身份，对应身份类型进行传参，例如：
企业支付宝登录账号(支持手机号或者邮箱)或企业支付宝会员id(对应2088开头的支付宝会员id)
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 身份类型,目前支持传参如下：
ALIPAY_LOGON_ID(企业支付宝登录账号)
ALIPAY_USER_ID(企业支付宝会员id)
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 外部业务号
1.作为创建该企业的唯一幂等标识，不传默认使用identity幂等
2.传入out_biz_no创建返回结果成功后，如需再新建其他企业，则out_biz_no传不同的参数，否则会被幂等
3.如果调用失败或者超时，可以使用相同的outBizNo进行重试处理
4.并发使用相同outBizNo调用，会返回企业创建中，不要重复操作的错误信息
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getEnterpriseAlias() {
		return this.enterpriseAlias;
	}
	public void setEnterpriseAlias(String enterpriseAlias) {
		this.enterpriseAlias = enterpriseAlias;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
