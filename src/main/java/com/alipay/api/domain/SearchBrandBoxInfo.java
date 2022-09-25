package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 品牌box详情
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:01:29
 */
public class SearchBrandBoxInfo extends AlipayObject {

	private static final long serialVersionUID = 4132682591354565153L;

	/**
	 * box基础信息
	 */
	@ApiField("base_info")
	private BoxExclusiveBase baseInfo;

	/**
	 * box状态
	 */
	@ApiField("box_status")
	private String boxStatus;

	/**
	 * box类型
	 */
	@ApiField("box_type")
	private String boxType;

	/**
	 * 品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 提报来源
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * box服务工单信息
	 */
	@ApiField("functions_order_info")
	private BoxOrderStatusInfo functionsOrderInfo;

	/**
	 * 品牌触发词信息
	 */
	@ApiField("keywords")
	private BoxExclusiveKeyword keywords;

	/**
	 * 操作人id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人类型
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 官方账号
	 */
	@ApiListField("related_accounts")
	@ApiField("box_exclusive_service")
	private List<BoxExclusiveService> relatedAccounts;

	/**
	 * 功能服务
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

	public String getBoxStatus() {
		return this.boxStatus;
	}
	public void setBoxStatus(String boxStatus) {
		this.boxStatus = boxStatus;
	}

	public String getBoxType() {
		return this.boxType;
	}
	public void setBoxType(String boxType) {
		this.boxType = boxType;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public BoxOrderStatusInfo getFunctionsOrderInfo() {
		return this.functionsOrderInfo;
	}
	public void setFunctionsOrderInfo(BoxOrderStatusInfo functionsOrderInfo) {
		this.functionsOrderInfo = functionsOrderInfo;
	}

	public BoxExclusiveKeyword getKeywords() {
		return this.keywords;
	}
	public void setKeywords(BoxExclusiveKeyword keywords) {
		this.keywords = keywords;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
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
