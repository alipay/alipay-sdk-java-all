package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁会员权益配置查询接口
 *
 * @author auto create
 * @since 1.0, 2016-08-12 10:49:51
 */
public class AlipayUserBenefitAuthbaseBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6242929632542811194L;

	/**
	 * JSON数组的格式表示当前商户需要查询的权益配置的ID列表
	 */
	@ApiListField("benefit_ids")
	@ApiField("string")
	private List<String> benefitIds;

	public List<String> getBenefitIds() {
		return this.benefitIds;
	}
	public void setBenefitIds(List<String> benefitIds) {
		this.benefitIds = benefitIds;
	}

}
