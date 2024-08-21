package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子分类信息
 *
 * @author auto create
 * @since 1.0, 2023-10-20 17:58:51
 */
public class CheckSubLabel extends AlipayObject {

	private static final long serialVersionUID = 7527159831886461773L;

	/**
	 * 置信度分数：0-100之间取值，100为置信度最高，0为置信度最低
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 二级子分类，详细编码请与蚂蚁内容安全客户经理沟通获取
	 */
	@ApiField("sub_label")
	private String subLabel;

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
