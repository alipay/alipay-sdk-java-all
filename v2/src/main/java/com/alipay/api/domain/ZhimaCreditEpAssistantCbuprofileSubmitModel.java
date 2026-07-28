package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企信助手用户画像提交
 *
 * @author auto create
 * @since 1.0, 2026-07-27 10:17:52
 */
public class ZhimaCreditEpAssistantCbuprofileSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 6321468228792538839L;

	/**
	 * 渠道商侧用户唯一ID，1688商户使用aliId
	 */
	@ApiField("ali_id")
	private String aliId;

	/**
	 * 用户在渠道侧选择的企业类型
	 */
	@ApiField("company_type")
	private String companyType;

	/**
	 * null
	 */
	@ApiListField("cooperation_model")
	@ApiField("string")
	private List<String> cooperationModel;

	/**
	 * 主营一级类目名称
	 */
	@ApiField("main_cate_1_name")
	private String mainCate1Name;

	/**
	 * 主营二级类目名称
	 */
	@ApiField("main_cate_2_name")
	private String mainCate2Name;

	/**
	 * null
	 */
	@ApiListField("sale_channels")
	@ApiField("string")
	private List<String> saleChannels;

	/**
	 * null
	 */
	@ApiListField("target_customer_type")
	@ApiField("string")
	private List<String> targetCustomerType;

	public String getAliId() {
		return this.aliId;
	}
	public void setAliId(String aliId) {
		this.aliId = aliId;
	}

	public String getCompanyType() {
		return this.companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public List<String> getCooperationModel() {
		return this.cooperationModel;
	}
	public void setCooperationModel(List<String> cooperationModel) {
		this.cooperationModel = cooperationModel;
	}

	public String getMainCate1Name() {
		return this.mainCate1Name;
	}
	public void setMainCate1Name(String mainCate1Name) {
		this.mainCate1Name = mainCate1Name;
	}

	public String getMainCate2Name() {
		return this.mainCate2Name;
	}
	public void setMainCate2Name(String mainCate2Name) {
		this.mainCate2Name = mainCate2Name;
	}

	public List<String> getSaleChannels() {
		return this.saleChannels;
	}
	public void setSaleChannels(List<String> saleChannels) {
		this.saleChannels = saleChannels;
	}

	public List<String> getTargetCustomerType() {
		return this.targetCustomerType;
	}
	public void setTargetCustomerType(List<String> targetCustomerType) {
		this.targetCustomerType = targetCustomerType;
	}

}
