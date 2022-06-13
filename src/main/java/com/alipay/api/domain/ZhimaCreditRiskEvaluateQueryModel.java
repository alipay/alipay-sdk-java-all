package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险评估服务
 *
 * @author auto create
 * @since 1.0, 2018-02-08 17:38:36
 */
public class ZhimaCreditRiskEvaluateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8282168494732885711L;

	/**
	 * 扩展字段，用来标识用户的其他描述信息，是一个JSON串
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 产品码[直接传示例值]
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 场景码，用来标识一套特定的风控策略
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 商户请求的唯一标志，长度64位以内字符串，仅限字母数字下划线组合。该标识作为业务调用的唯一标识，商户要保证其业务唯一性，使用相同transaction_id的查询，芝麻在一段时间内（一般为1天）返回首次查询结果，超过有效期的查询即为无效并返回异常，有效期内的重复查询不重新计费
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
