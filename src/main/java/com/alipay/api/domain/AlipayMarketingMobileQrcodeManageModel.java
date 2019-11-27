package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝二维码管理接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:17
 */
public class AlipayMarketingMobileQrcodeManageModel extends AlipayObject {

	private static final long serialVersionUID = 3717694985195323978L;

	/**
	 * 业务数据,详情见接入文档的biz_data项
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 商品码
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 添加二维码／修改二维码／停用二维码／重启启用二维码,根据场景选择其中一种
	 */
	@ApiField("method")
	private String method;

	/**
	 * 码值
	 */
	@ApiField("qrcode")
	private String qrcode;

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

	public String getMethod() {
		return this.method;
	}
	public void setMethod(String method) {
		this.method = method;
	}

	public String getQrcode() {
		return this.qrcode;
	}
	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

}
