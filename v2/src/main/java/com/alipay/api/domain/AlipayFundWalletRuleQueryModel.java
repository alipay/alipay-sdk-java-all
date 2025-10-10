package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景钱包规则查询
 *
 * @author auto create
 * @since 1.0, 2025-07-04 11:57:42
 */
public class AlipayFundWalletRuleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1386427697265367214L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 使用实体条件
	 */
	@ApiField("entity_condition")
	private String entityCondition;

	/**
	 * 当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页展示数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 钱包模版ID
	 */
	@ApiField("wallet_template_id")
	private String walletTemplateId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getEntityCondition() {
		return this.entityCondition;
	}
	public void setEntityCondition(String entityCondition) {
		this.entityCondition = entityCondition;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getWalletTemplateId() {
		return this.walletTemplateId;
	}
	public void setWalletTemplateId(String walletTemplateId) {
		this.walletTemplateId = walletTemplateId;
	}

}
