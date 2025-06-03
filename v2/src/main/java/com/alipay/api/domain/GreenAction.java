package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 绿色行为描述模型
 *
 * @author auto create
 * @since 1.0, 2025-05-23 17:16:09
 */
public class GreenAction extends AlipayObject {

	private static final long serialVersionUID = 4552862762391633223L;

	/**
	 * 不同的绿色行为的业务值描述，比如用户回收1000g废纸，即传入1000，具体生成能量信息由森林侧计算生成
	 */
	@ApiField("biz_value")
	private Long bizValue;

	/**
	 * 由绿色开放平台为每一种绿色行为定义的能量场景二级类目编码
	 */
	@ApiField("second_scene")
	private String secondScene;

	public Long getBizValue() {
		return this.bizValue;
	}
	public void setBizValue(Long bizValue) {
		this.bizValue = bizValue;
	}

	public String getSecondScene() {
		return this.secondScene;
	}
	public void setSecondScene(String secondScene) {
		this.secondScene = secondScene;
	}

}
