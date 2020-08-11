package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户批量入驻申请接口
 *
 * @author auto create
 * @since 1.0, 2020-07-01 15:28:02
 */
public class AlipayEbppInvoiceMerchantlistEnterApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2425448886555989611L;

	/**
	 * 商户品牌信息
	 */
	@ApiField("merchant_base")
	private MerchantBaseEnterOpenModel merchantBase;

	/**
	 * 商户门店入驻产品公共信息
	 */
	@ApiField("sub_merchant_common_info")
	private SubMerchantCommonEnterOpenModel subMerchantCommonInfo;

	/**
	 * 商户门店列表信息，最多传入30个门店信息
	 */
	@ApiListField("sub_merchant_list")
	@ApiField("sub_merchant_enter_open_model")
	private List<SubMerchantEnterOpenModel> subMerchantList;

	public MerchantBaseEnterOpenModel getMerchantBase() {
		return this.merchantBase;
	}
	public void setMerchantBase(MerchantBaseEnterOpenModel merchantBase) {
		this.merchantBase = merchantBase;
	}

	public SubMerchantCommonEnterOpenModel getSubMerchantCommonInfo() {
		return this.subMerchantCommonInfo;
	}
	public void setSubMerchantCommonInfo(SubMerchantCommonEnterOpenModel subMerchantCommonInfo) {
		this.subMerchantCommonInfo = subMerchantCommonInfo;
	}

	public List<SubMerchantEnterOpenModel> getSubMerchantList() {
		return this.subMerchantList;
	}
	public void setSubMerchantList(List<SubMerchantEnterOpenModel> subMerchantList) {
		this.subMerchantList = subMerchantList;
	}

}
