package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 零工之家服务申请签约
 *
 * @author auto create
 * @since 1.0, 2024-11-15 10:22:18
 */
public class AlipayFundFlexiblestaffingContractApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1383891139336967749L;

	/**
	 * 签约跳转类型，有限枚举，
SHORT_URL：短链接
	 */
	@ApiField("apply_link_type")
	private String applyLinkType;

	/**
	 * 业务场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 签约跳转渠道，有限枚举，tinyapp：小程序
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 合同模版的填充参数，是实际合同模板设置提供的
	 */
	@ApiField("contract_template_fields")
	private String contractTemplateFields;

	/**
	 * 超时时间，建议在距离接口请求时间2小时到3天之间。
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 商户端唯一订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 业务产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 申请签约的主体
	 */
	@ApiField("sign_principal")
	private SignPrincipalDTO signPrincipal;

	/**
	 * 签约方案ID
	 */
	@ApiField("solution_code")
	private String solutionCode;

	public String getApplyLinkType() {
		return this.applyLinkType;
	}
	public void setApplyLinkType(String applyLinkType) {
		this.applyLinkType = applyLinkType;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getContractTemplateFields() {
		return this.contractTemplateFields;
	}
	public void setContractTemplateFields(String contractTemplateFields) {
		this.contractTemplateFields = contractTemplateFields;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
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

	public SignPrincipalDTO getSignPrincipal() {
		return this.signPrincipal;
	}
	public void setSignPrincipal(SignPrincipalDTO signPrincipal) {
		this.signPrincipal = signPrincipal;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

}
