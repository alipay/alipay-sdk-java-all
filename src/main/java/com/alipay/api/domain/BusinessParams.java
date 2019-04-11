package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务信息参数
 *
 * @author auto create
 * @since 1.0, 2019-04-02 16:24:40
 */
public class BusinessParams extends AlipayObject {

	private static final long serialVersionUID = 4185369978874982298L;

	/**
	 * 校园卡编号
	 */
	@ApiField("campus_card")
	private String campusCard;

	public String getCampusCard() {
		return this.campusCard;
	}
	public void setCampusCard(String campusCard) {
		this.campusCard = campusCard;
	}

}
