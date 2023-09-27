package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容风险子标签明细
 *
 * @author auto create
 * @since 1.0, 2022-11-22 14:50:48
 */
public class SubCheckLabel extends AlipayObject {

	private static final long serialVersionUID = 7163637626723666752L;

	/**
	 * 机器审核内容的类型：0:图片内容,1:图片上的文字
	 */
	@ApiField("hit_strategy")
	private Long hitStrategy;

	/**
	 * 置信度分数：0-1之间取值，1为置信度最高，0为置信度最低
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 二级子分类，详细编码请参考文档对应细分类编码：
TODO
	 */
	@ApiField("sub_label")
	private String subLabel;

	public Long getHitStrategy() {
		return this.hitStrategy;
	}
	public void setHitStrategy(Long hitStrategy) {
		this.hitStrategy = hitStrategy;
	}

	public String getRate() {
		return this.rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getSubLabel() {
		return this.subLabel;
	}
	public void setSubLabel(String subLabel) {
		this.subLabel = subLabel;
	}

}
