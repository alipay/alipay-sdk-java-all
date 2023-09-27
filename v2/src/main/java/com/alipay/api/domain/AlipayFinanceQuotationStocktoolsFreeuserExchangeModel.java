package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 股票工具免费试用兑换
 *
 * @author auto create
 * @since 1.0, 2022-12-21 20:56:51
 */
public class AlipayFinanceQuotationStocktoolsFreeuserExchangeModel extends AlipayObject {

	private static final long serialVersionUID = 1388764848976971153L;

	/**
	 * 股票工具供应商机构的配置ID，通常是XXZQ（XX证券），具体值待定。用途：1.确定购买的产品的供应商（用户购买的工具一定是属于某一家供应商的）。2.来源有效性校验。对应的PID与inst_org_id要能一一对应。
	 */
	@ApiField("inst_org_id")
	private String instOrgId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 股票工具的类型。每个机构提供的工具会有特定的类型名称。查询时也需要提供类型才可定位到用户是否已经订阅。
	 */
	@ApiField("tool_type")
	private String toolType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getInstOrgId() {
		return this.instOrgId;
	}
	public void setInstOrgId(String instOrgId) {
		this.instOrgId = instOrgId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getToolType() {
		return this.toolType;
	}
	public void setToolType(String toolType) {
		this.toolType = toolType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
