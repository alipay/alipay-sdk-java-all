package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建出资方式
 *
 * @author auto create
 * @since 1.0, 2025-11-28 10:24:41
 */
public class AlipayCommerceEcFundStrategyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6455134364213351829L;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 出资账户唯一编号
	 */
	@ApiField("fund_account_id")
	private String fundAccountId;

	/**
	 * 出资方式名称，不填写时，系统自动生成
	 */
	@ApiField("name")
	private String name;

	/**
	 * 账户使用条件
	 */
	@ApiListField("restrictions")
	@ApiField("ec_pay_restriction")
	private List<EcPayRestriction> restrictions;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getFundAccountId() {
		return this.fundAccountId;
	}
	public void setFundAccountId(String fundAccountId) {
		this.fundAccountId = fundAccountId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<EcPayRestriction> getRestrictions() {
		return this.restrictions;
	}
	public void setRestrictions(List<EcPayRestriction> restrictions) {
		this.restrictions = restrictions;
	}

}
