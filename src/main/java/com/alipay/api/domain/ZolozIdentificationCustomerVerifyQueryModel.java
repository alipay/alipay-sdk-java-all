package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 佐罗认证查询
 *
 * @author auto create
 * @since 1.0, 2018-02-05 14:06:03
 */
public class ZolozIdentificationCustomerVerifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4568288468467342919L;

	/**
	 * 佐罗认证场景码，与认证初始化接口传入的bizCode保持一致
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 商户请求的唯一标识，与认证初始化接口传入的bizNo保持一致
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 预留扩展业务参数
	 */
	@ApiField("extern_param")
	private String externParam;

	/**
	 * 刷脸认证的唯一标识，与认证初始化接口获取的zimId保持一致
	 */
	@ApiField("zim_id")
	private String zimId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getExternParam() {
		return this.externParam;
	}
	public void setExternParam(String externParam) {
		this.externParam = externParam;
	}

	public String getZimId() {
		return this.zimId;
	}
	public void setZimId(String zimId) {
		this.zimId = zimId;
	}

}
