package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可信价值中心用户合约申请
 *
 * @author auto create
 * @since 1.0, 2024-10-23 17:07:27
 */
public class AnttechBlockchainFinanceTvpAccountApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7541671827341971167L;

	/**
	 * 子户开立申请主体
	 */
	@ApiField("apply_entity")
	private TrustEntityInfo applyEntity;

	/**
	 * 可信价值中心产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 外部请求号，商户唯一
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 子户开立场景方。
可信账单产品，传入服务企业信息。
	 */
	@ApiField("scene_entity")
	private TrustEntityInfo sceneEntity;

	public TrustEntityInfo getApplyEntity() {
		return this.applyEntity;
	}
	public void setApplyEntity(TrustEntityInfo applyEntity) {
		this.applyEntity = applyEntity;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public TrustEntityInfo getSceneEntity() {
		return this.sceneEntity;
	}
	public void setSceneEntity(TrustEntityInfo sceneEntity) {
		this.sceneEntity = sceneEntity;
	}

}
