package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公益林用户个人浇水信息
 *
 * @author auto create
 * @since 1.0, 2024-05-22 15:27:14
 */
public class WelfareForestPersonWaterDTO extends AlipayObject {

	private static final long serialVersionUID = 3549168438671257817L;

	/**
	 * 用户浇水次数，Long类型
	 */
	@ApiField("user_water_count")
	private Long userWaterCount;

	/**
	 * 用户参与的排名，Long类型。如果公益林没有配置排名功能，固定返回为0，直接忽略该字段。
	 */
	@ApiField("user_water_placing")
	private Long userWaterPlacing;

	/**
	 * 用户浇水能量值，long类型
	 */
	@ApiField("user_water_sum")
	private Long userWaterSum;

	public Long getUserWaterCount() {
		return this.userWaterCount;
	}
	public void setUserWaterCount(Long userWaterCount) {
		this.userWaterCount = userWaterCount;
	}

	public Long getUserWaterPlacing() {
		return this.userWaterPlacing;
	}
	public void setUserWaterPlacing(Long userWaterPlacing) {
		this.userWaterPlacing = userWaterPlacing;
	}

	public Long getUserWaterSum() {
		return this.userWaterSum;
	}
	public void setUserWaterSum(Long userWaterSum) {
		this.userWaterSum = userWaterSum;
	}

}
