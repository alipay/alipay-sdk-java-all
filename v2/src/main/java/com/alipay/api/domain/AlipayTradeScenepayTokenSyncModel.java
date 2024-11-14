package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景支付凭证同步
 *
 * @author auto create
 * @since 1.0, 2024-04-01 21:16:25
 */
public class AlipayTradeScenepayTokenSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7283441519975739374L;

	/**
	 * 签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 场景支付凭证
	 */
	@ApiField("scene_pay_token")
	private ScenePayToken scenePayToken;

	/**
	 * 子场景码
	 */
	@ApiField("sub_biz_scene")
	private String subBizScene;

	/**
	 * 一码付凭证同步扩展信息
	 */
	@ApiField("union_code_extend_params")
	private UnionCodeExtendParam unionCodeExtendParams;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
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

	public ScenePayToken getScenePayToken() {
		return this.scenePayToken;
	}
	public void setScenePayToken(ScenePayToken scenePayToken) {
		this.scenePayToken = scenePayToken;
	}

	public String getSubBizScene() {
		return this.subBizScene;
	}
	public void setSubBizScene(String subBizScene) {
		this.subBizScene = subBizScene;
	}

	public UnionCodeExtendParam getUnionCodeExtendParams() {
		return this.unionCodeExtendParams;
	}
	public void setUnionCodeExtendParams(UnionCodeExtendParam unionCodeExtendParams) {
		this.unionCodeExtendParams = unionCodeExtendParams;
	}

}
