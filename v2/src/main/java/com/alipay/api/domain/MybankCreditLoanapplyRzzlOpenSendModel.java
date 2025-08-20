package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商银行-融资租赁API通用处理器
 *
 * @author auto create
 * @since 1.0, 2025-08-08 10:07:52
 */
public class MybankCreditLoanapplyRzzlOpenSendModel extends AlipayObject {

	private static final long serialVersionUID = 2618722966895748311L;

	/**
	 * 业务类型,APPROVE_RESULT_NOTICE,资方发起审核结果请求,SDK枚举获取
业务类型,INVESTOR_INFO_SUPPLY_NOTICE,资方发起信息补传请求,SDK枚举获取
业务类型,INVESTOR_APPLY_LOAN_NOTICE,资方发起放款请求,SDK枚举获取
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 业务字段
	 */
	@ApiField("data_object")
	private String dataObject;

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getDataObject() {
		return this.dataObject;
	}
	public void setDataObject(String dataObject) {
		this.dataObject = dataObject;
	}

}
