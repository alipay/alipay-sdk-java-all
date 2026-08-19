package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 补充凭证
 *
 * @author auto create
 * @since 1.0, 2026-07-31 14:36:05
 */
public class FulfillmentAdditionalMediaInfo extends AlipayObject {

	private static final long serialVersionUID = 4813721913428346233L;

	/**
	 * 需整改的原始租赁租赁合同文件ID, 仅当type为RENT_CONTRACT_TEMPLATE时需要传入
	 */
	@ApiField("origin_contract_file_id")
	private String originContractFileId;

	/**
	 * 用于辅助标明当前合同的类型，目前支持以下类型，不再该范围内的不传即可：
1. RENT_SERVICE 租赁服务协议
2. PERSONAL_INFO_AUTH 个人信息授权书
3. PRIVACY_POLICY 隐私权政策
4. FINANCE_GUARANTEE 融资担保服务申请书
5. PERSONAL_CREDIT_AUTH 个人征信授权书
6. USER_SERVICE 用户服务协议
	 */
	@ApiField("rent_contract_type")
	private String rentContractType;

	/**
	 * 补充凭证类型。FACE_SIGN_PDF 面签、FACE_ACTIVE_JPG_LIST 激活、ELECTRONIC_SIGNATURE 签收底单、FACE_DOCUMENT 面单、ROUTE_TRACKING 路由轨迹、ELECTRONIC_STUB 电子存根、RENT_CONTRACT 租赁合同、RENT_CONTRACT_TEMPLATE 租赁合同模板
	 */
	@ApiField("type")
	private String type;

	/**
	 * 补充凭证数据
	 */
	@ApiField("value")
	private String value;

	public String getOriginContractFileId() {
		return this.originContractFileId;
	}
	public void setOriginContractFileId(String originContractFileId) {
		this.originContractFileId = originContractFileId;
	}

	public String getRentContractType() {
		return this.rentContractType;
	}
	public void setRentContractType(String rentContractType) {
		this.rentContractType = rentContractType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
