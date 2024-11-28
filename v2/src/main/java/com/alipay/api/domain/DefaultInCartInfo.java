package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开台菜默认规则类型
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:15:28
 */
public class DefaultInCartInfo extends AlipayObject {

	private static final long serialVersionUID = 3356769328362298434L;

	/**
	 * 如果不设置就餐人数，该字段必填，代表开台菜的默认必点数量。
	 */
	@ApiField("default_num")
	private Long defaultNum;

	/**
	 * true/false。表示该条开台菜必点数量是否关联就餐人数。
	 */
	@ApiField("link_guest")
	private Boolean linkGuest;

	/**
	 * 如果关联就餐人数，该项必填，代表每个人开台菜的必点数量。
	 */
	@ApiField("per_num")
	private Long perNum;

	public Long getDefaultNum() {
		return this.defaultNum;
	}
	public void setDefaultNum(Long defaultNum) {
		this.defaultNum = defaultNum;
	}

	public Boolean getLinkGuest() {
		return this.linkGuest;
	}
	public void setLinkGuest(Boolean linkGuest) {
		this.linkGuest = linkGuest;
	}

	public Long getPerNum() {
		return this.perNum;
	}
	public void setPerNum(Long perNum) {
		this.perNum = perNum;
	}

}
