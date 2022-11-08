package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 品牌box提报入参
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:01:46
 */
public class ApplyBoxExclusiveRequest extends AlipayObject {

	private static final long serialVersionUID = 1579583278139845831L;

	/**
	 * 品牌box基础模型
	 */
	@ApiField("base_info")
	private BoxExclusiveBase baseInfo;

	/**
	 * 品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 默认品牌触发词
	 */
	@ApiListField("default_keywords")
	@ApiField("string")
	private List<String> defaultKeywords;

	/**
	 * 工单id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 自定义品牌触发词
	 */
	@ApiListField("keywords")
	@ApiField("string")
	private List<String> keywords;

	/**
	 * 操作人id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * box官方账号
	 */
	@ApiListField("related_accounts")
	@ApiField("box_exclusive_service")
	private List<BoxExclusiveService> relatedAccounts;

	/**
	 * box服务模型
	 */
	@ApiListField("related_functions")
	@ApiField("box_exclusive_service")
	private List<BoxExclusiveService> relatedFunctions;

	public BoxExclusiveBase getBaseInfo() {
		return this.baseInfo;
	}
	public void setBaseInfo(BoxExclusiveBase baseInfo) {
		this.baseInfo = baseInfo;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public List<String> getDefaultKeywords() {
		return this.defaultKeywords;
	}
	public void setDefaultKeywords(List<String> defaultKeywords) {
		this.defaultKeywords = defaultKeywords;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public List<String> getKeywords() {
		return this.keywords;
	}
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public List<BoxExclusiveService> getRelatedAccounts() {
		return this.relatedAccounts;
	}
	public void setRelatedAccounts(List<BoxExclusiveService> relatedAccounts) {
		this.relatedAccounts = relatedAccounts;
	}

	public List<BoxExclusiveService> getRelatedFunctions() {
		return this.relatedFunctions;
	}
	public void setRelatedFunctions(List<BoxExclusiveService> relatedFunctions) {
		this.relatedFunctions = relatedFunctions;
	}

}
