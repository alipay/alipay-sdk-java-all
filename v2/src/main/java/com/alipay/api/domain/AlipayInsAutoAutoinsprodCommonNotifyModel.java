package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通用B端通知接口
 *
 * @author auto create
 * @since 1.0, 2022-12-16 15:35:52
 */
public class AlipayInsAutoAutoinsprodCommonNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 6866376934382279547L;

	/**
	 * 业务内容 具体内容按照业务类型对应的key值传输
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * AUTO_LEADS_STATUS_SYNC：新电焊名单状态同步服务
	 */
	@ApiField("biz_type")
	private String bizType;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

}
