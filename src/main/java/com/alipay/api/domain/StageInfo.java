package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联赛阶段
 *
 * @author auto create
 * @since 1.0, 2021-11-04 16:30:42
 */
public class StageInfo extends AlipayObject {

	private static final long serialVersionUID = 3356197143997921923L;

	/**
	 * 分组
1: A
2: B
以此类推
	 */
	@ApiField("group")
	private Long group;

	/**
	 * 阶段名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 轮次
	 */
	@ApiField("round")
	private Long round;

	/**
	 * 阶段类型
1: 积分赛
2: 淘汰赛
	 */
	@ApiField("type")
	private Long type;

	public Long getGroup() {
		return this.group;
	}
	public void setGroup(Long group) {
		this.group = group;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getRound() {
		return this.round;
	}
	public void setRound(Long round) {
		this.round = round;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
