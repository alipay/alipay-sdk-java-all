package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 天气数据同步接口
 *
 * @author auto create
 * @since 1.0, 2017-07-19 16:54:47
 */
public class AlipayInsDataWeatherSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2288844767713496988L;

	/**
	 * 天气信息描述信息
	 */
	@ApiField("content")
	private String content;

	/**
	 * 外部业务幂等字段
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
