package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权资产修改接口
 *
 * @author auto create
 * @since 1.0, 2025-09-08 11:44:19
 */
public class AlipayFundAuthorizeUniModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2315133595742393685L;

	/**
	 * 授权协议号，可从查询接口获取，与out_biz_no二选一传入即可
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 授权跳转类型，有限枚举：SHORT_URL
	 */
	@ApiField("authorize_link_type")
	private String authorizeLinkType;

	/**
	 * 业务场景码，固定值
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 跳转渠道，优先枚举值: pc, h5, tinyapp
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 业务产品码，固定值
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 业务子场景码
	 */
	@ApiField("sub_biz_scene")
	private String subBizScene;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAuthorizeLinkType() {
		return this.authorizeLinkType;
	}
	public void setAuthorizeLinkType(String authorizeLinkType) {
		this.authorizeLinkType = authorizeLinkType;
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
