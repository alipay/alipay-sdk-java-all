package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约任务
 *
 * @author auto create
 * @since 1.0, 2017-10-18 18:01:47
 */
public class InitSignTaskResult extends AlipayObject {

	private static final long serialVersionUID = 1669817131316844727L;

	/**
	 * 电子签约业务信息
	 */
	@ApiField("taks_list")
	private SiginTaskResult taksList;

	public SiginTaskResult getTaksList() {
		return this.taksList;
	}
	public void setTaksList(SiginTaskResult taksList) {
		this.taksList = taksList;
	}

}
