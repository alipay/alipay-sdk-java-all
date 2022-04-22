package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康险赠险用户总保额查询结果
 *
 * @author auto create
 * @since 1.0, 2019-04-23 11:37:54
 */
public class InsHealthGiftBatchMySumInsuredResult extends AlipayObject {

	private static final long serialVersionUID = 4776143899789233473L;

	/**
	 * 业务类型。免费医疗金 HEALTH_BEAN_SIMPLE_UPGRADE、守护金 HEALTH_GUARDIAN_GOLD、多收多宝新门诊 HEALTH_DSDB_NEW_OUTPATIENT
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 总保额
	 */
	@ApiField("sum_insured")
	private String sumInsured;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(String sumInsured) {
		this.sumInsured = sumInsured;
	}

}
