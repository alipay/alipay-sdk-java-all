package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 采购方激活、用户绑定
 *
 * @author auto create
 * @since 1.0, 2022-10-14 14:51:07
 */
public class AlipayFundWalletCardCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4863165936361932497L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 卡激活凭证
	 */
	@ApiField("card_asset_info")
	private CardAssetInfo cardAssetInfo;

	/**
	 * 商品方案id
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 参与者账号
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 参与者账号类型
	 */
	@ApiField("principal_type")
	private String principalType;

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

	public CardAssetInfo getCardAssetInfo() {
		return this.cardAssetInfo;
	}
	public void setCardAssetInfo(CardAssetInfo cardAssetInfo) {
		this.cardAssetInfo = cardAssetInfo;
	}

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getPrincipalType() {
		return this.principalType;
	}
	public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
