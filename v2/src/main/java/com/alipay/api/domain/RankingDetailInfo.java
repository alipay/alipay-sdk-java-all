package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排名详情
 *
 * @author auto create
 * @since 1.0, 2021-12-29 14:34:53
 */
public class RankingDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 7589613172418269119L;

	/**
	 * 积分值
	 */
	@ApiField("point")
	private Long point;

	public Long getPoint() {
		return this.point;
	}
	public void setPoint(Long point) {
		this.point = point;
	}

}
