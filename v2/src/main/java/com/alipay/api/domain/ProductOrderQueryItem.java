package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单条合约订购查询条件
 *
 * @author auto create
 * @since 1.0, 2021-01-19 17:00:24
 */
public class ProductOrderQueryItem extends AlipayObject {

	private static final long serialVersionUID = 1571322889225758115L;

	/**
	 * 是否需要查活动信息
	 */
	@ApiField("need_activity")
	private Boolean needActivity;

	/**
	 * 订购渠道
	 */
	@ApiField("ordered_channel")
	private String orderedChannel;

	/**
	 * 产品码
	 */
	@ApiField("ps_code")
	private String psCode;

	public Boolean getNeedActivity() {
		return this.needActivity;
	}
	public void setNeedActivity(Boolean needActivity) {
		this.needActivity = needActivity;
	}

	public String getOrderedChannel() {
		return this.orderedChannel;
	}
	public void setOrderedChannel(String orderedChannel) {
		this.orderedChannel = orderedChannel;
	}

	public String getPsCode() {
		return this.psCode;
	}
	public void setPsCode(String psCode) {
		this.psCode = psCode;
	}

}
