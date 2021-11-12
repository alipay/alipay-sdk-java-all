package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单扩展字段
 *
 * @author auto create
 * @since 1.0, 2021-09-02 17:28:20
 */
public class OrderExtendParams extends AlipayObject {

	private static final long serialVersionUID = 1621463931736161142L;

	/**
	 * 外部场景端业务订单
	 */
	@ApiField("out_scene_biz_no")
	private String outSceneBizNo;

	public String getOutSceneBizNo() {
		return this.outSceneBizNo;
	}
	public void setOutSceneBizNo(String outSceneBizNo) {
		this.outSceneBizNo = outSceneBizNo;
	}

}
