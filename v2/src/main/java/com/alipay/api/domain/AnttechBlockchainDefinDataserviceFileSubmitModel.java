package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取文件上传地址
 *
 * @author auto create
 * @since 1.0, 2022-03-03 19:58:03
 */
public class AnttechBlockchainDefinDataserviceFileSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 8666884456816514615L;

	/**
	 * base64编码的业务参数
	 */
	@ApiField("encoded_biz_param")
	private String encodedBizParam;

	/**
	 * 系统参数
	 */
	@ApiField("sys_param")
	private SystemParam sysParam;

	public String getEncodedBizParam() {
		return this.encodedBizParam;
	}
	public void setEncodedBizParam(String encodedBizParam) {
		this.encodedBizParam = encodedBizParam;
	}

	public SystemParam getSysParam() {
		return this.sysParam;
	}
	public void setSysParam(SystemParam sysParam) {
		this.sysParam = sysParam;
	}

}
